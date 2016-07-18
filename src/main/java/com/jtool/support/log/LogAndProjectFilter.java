package com.jtool.support.log;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class LogAndProjectFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
        String projectName = config.getInitParameter("projectName");
        if(projectName != null) {
            ServletContext servletContext = config.getServletContext();
            servletContext.setAttribute("projectName", projectName);
        }
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String logId = req.getHeader(LogHelper.JTOOL_LOG_ID);
        if(logId == null) {
            logId = UUID.randomUUID().toString();
        }
        LogHelper.setLogId(logId);
        String projectName = req.getServletContext().getAttribute("projectName").toString();
        LogHelper.setProjectName(projectName);
        chain.doFilter(request,response);
    }

    public void destroy() {
    }
}
package com.jtool.support.log;

import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class LogFilter implements Filter {

    public static final String JTOOL_LOG_ID = "_logId";
    public static final String JTOOL_LOG_USER_ID = "_logUserId";

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        String logId = ((HttpServletRequest)request).getHeader(JTOOL_LOG_ID);
        if(logId == null) {
            logId = UUID.randomUUID().toString();
        }
        MDC.put(JTOOL_LOG_ID, logId);
        chain.doFilter(request,response);
    }

    public void destroy() {
    }
}
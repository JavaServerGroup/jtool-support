package com.jtool.support.log;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

public class LogFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {
        String logId = ((HttpServletRequest)request).getHeader(LogHelper.JTOOL_LOG_ID);
        if(logId == null) {
            logId = UUID.randomUUID().toString();
        }
        LogHelper.setLogId(logId);
        try{
            chain.doFilter(request,response);
        } finally {
            LogHelper.removeLogId();
            //MDC removeKey前会判断该key是否存在
            LogHelper.removeLogUserId();
        }
    }

    public void destroy() {
    }
}
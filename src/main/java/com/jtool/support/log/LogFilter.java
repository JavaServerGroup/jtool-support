package com.jtool.support.log;

import javax.servlet.*;
import java.util.UUID;

public class LogFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, ServletException {

        String comJtoolLogUuid = request.getParameter("_comJtoolLogUuid");

        if(comJtoolLogUuid == null) {
            comJtoolLogUuid = UUID.randomUUID().toString();
        }

        LogThreadLocal.set(new LogPojo(comJtoolLogUuid));

        chain.doFilter(request,response);
    }

    public void destroy() {
    }
}
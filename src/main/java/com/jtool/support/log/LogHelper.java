package com.jtool.support.log;

import org.slf4j.MDC;

import javax.servlet.http.HttpServletResponse;

public class LogHelper {
    public static void addLogIdToHeader(HttpServletResponse httpServletResponse) {
        String logId = MDC.get(LogFilter.JTOOL_LOG_ID);
        if(logId != null) {
            httpServletResponse.setHeader(LogFilter.JTOOL_LOG_ID, MDC.get(LogFilter.JTOOL_LOG_ID));
        }
    }
}

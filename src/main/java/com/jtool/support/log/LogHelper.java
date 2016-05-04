package com.jtool.support.log;

import org.slf4j.MDC;

import javax.servlet.http.HttpServletResponse;

public class LogHelper {

    public static final String JTOOL_LOG_ID = "_logId";
    public static final String JTOOL_LOG_USER_ID = "_logUserId";

    public static void addLogIdToHeader(HttpServletResponse httpServletResponse) {
        String logId = MDC.get(JTOOL_LOG_ID);
        if (logId != null) {
            httpServletResponse.setHeader(JTOOL_LOG_ID, MDC.get(JTOOL_LOG_ID));
        }
    }

    public static void setLogId(String logId) {
        MDC.put(JTOOL_LOG_ID, logId);
    }

    public static void setLogUserId(String userId) {
        MDC.put(JTOOL_LOG_USER_ID, userId);
    }

    public static void removeLogId(String logId) {
        MDC.remove(JTOOL_LOG_ID);
    }

    public static void removeLogUserId(String userId) {
        MDC.remove(JTOOL_LOG_USER_ID);
    }

    public static String getLogId() {
        return MDC.get(JTOOL_LOG_ID);
    }

    public static String getLogUserId() {
        return MDC.get(JTOOL_LOG_USER_ID);
    }
}

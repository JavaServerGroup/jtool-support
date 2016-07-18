package com.jtool.support.log;

import org.slf4j.MDC;

import javax.servlet.http.HttpServletResponse;

public class LogHelper {

    public static final String JTOOL_LOG_ID = "_logId";
    public static final String JTOOL_LOG_USER_ID = "_logUserId";
    public static final String JTOOL_LOG_PROJECT_NAME = "_projectName";

    public static void addLogIdToHeader(HttpServletResponse httpServletResponse) {
        String logId = MDC.get(JTOOL_LOG_ID);
        if (logId != null) {
            httpServletResponse.setHeader(JTOOL_LOG_ID, MDC.get(JTOOL_LOG_ID));
        }
    }

    public static void setLogId(String logId) {
        MDC.put(JTOOL_LOG_ID, logId);
    }

    public static void setProjectName(String projectName) {
        MDC.put(JTOOL_LOG_PROJECT_NAME, projectName);
    }

    public static void setLogUserId(String userId) {
        MDC.put(JTOOL_LOG_USER_ID, userId);
    }

    public static void removeLogId() {
        MDC.remove(JTOOL_LOG_ID);
    }

    public static void removeLogUserId() {
        MDC.remove(JTOOL_LOG_USER_ID);
    }

    public static void removeProjectName() {
        MDC.remove(JTOOL_LOG_PROJECT_NAME);
    }

    public static String getLogId() {
        return MDC.get(JTOOL_LOG_ID);
    }

    public static String getLogUserId() {
        return MDC.get(JTOOL_LOG_USER_ID);
    }

    public static String getLogProjectName() {
        return MDC.get(JTOOL_LOG_PROJECT_NAME);
    }
}

package com.jtool.support.log;

public class LogThreadLocal {
    public static final ThreadLocal<LogPojo> logThreadLocal = new ThreadLocal<>();

    public static void set(LogPojo logPojo) {
        logThreadLocal.set(logPojo);
    }

    public static void unset() {
        logThreadLocal.remove();
    }

    public static LogPojo get() {
        return logThreadLocal.get();
    }
}

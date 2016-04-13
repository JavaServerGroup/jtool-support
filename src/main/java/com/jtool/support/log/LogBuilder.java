package com.jtool.support.log;

public class LogBuilder {
    public static String buildLog(String log) {
        LogPojo logPojo = LogThreadLocal.get();
        if(logPojo == null) {
            return new StringBuilder().append("logUuid:").append("  ")
                    .append("logUserId:").append("  ")
                    .append(log).toString();
        } else {
            StringBuilder sb = new StringBuilder().append("logUuid:").append(logPojo.getComJtoolLogUUID()).append("  ");
            if(logPojo.getComJtoolLogUserId() != null) {
                sb.append("logUserId:").append(logPojo.getComJtoolLogUserId()).append("  ");
            }
            return sb.append(log).toString();
        }

    }
}

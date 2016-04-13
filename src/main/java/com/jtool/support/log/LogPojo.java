package com.jtool.support.log;

public class LogPojo {
    private String comJtoolLogUUID;
    private String comJtoolLogUserId;

    public LogPojo(String comJtoolLogUUID) {
        this.comJtoolLogUUID = comJtoolLogUUID;
    }

    public String getComJtoolLogUUID() {
        return comJtoolLogUUID;
    }

    public void setComJtoolLogUUID(String comJtoolLogUUID) {
        this.comJtoolLogUUID = comJtoolLogUUID;
    }

    public String getComJtoolLogUserId() {
        return comJtoolLogUserId;
    }

    public void setComJtoolLogUserId(String comJtoolLogUserId) {
        this.comJtoolLogUserId = comJtoolLogUserId;
    }

    @Override
    public String toString() {
        return "LogPojo{" +
                "comJtoolLogUUID='" + comJtoolLogUUID + '\'' +
                ", comJtoolLogUserId='" + comJtoolLogUserId + '\'' +
                '}';
    }
}

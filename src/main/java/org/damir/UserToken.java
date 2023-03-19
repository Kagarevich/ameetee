package org.damir;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserToken {
    @JsonProperty("access")
    private String access;
    @JsonProperty("refresh")
    private String refresh;
    public String getAccess() {
        return access;
    }
    public String getRefresh() {
        return refresh;
    }
    public void setAccess(String access) {
        this.access = access;
    }
    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }
}

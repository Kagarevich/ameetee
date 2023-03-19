package org.damir;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class AmeeteeAuthUser {
    @JsonProperty("email")
    private String email;
    @JsonProperty("password")
    private String password;
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setEmail(String id) {
        this.email = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
package org.damir;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPatch {
    @JsonProperty("user_type")
    private String userType;
    @JsonProperty("token")
    private String token;
    @JsonProperty("password")
    private String password;
    @JsonProperty("phone_number")
    private String phoneNumber;
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}

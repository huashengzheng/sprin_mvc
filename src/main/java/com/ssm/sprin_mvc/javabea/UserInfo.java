package com.ssm.sprin_mvc.javabea;

public class UserInfo {
    private  Integer userid;
    private  String username;
    private  String userpass;
    private  String userphone;

    public UserInfo() {

    }

    public UserInfo(Integer userid, String username, String userpass, String userphone) {
        this.userid = userid;
        this.username = username;
        this.userpass = userpass;
        this.userphone = userphone;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                ", userphone='" + userphone + '\'' +
                '}';
    }
}

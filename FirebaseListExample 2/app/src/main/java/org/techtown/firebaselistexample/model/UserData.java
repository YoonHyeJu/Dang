package org.techtown.firebaselistexample.model;

public class UserData {
    public String userName;
    public String profile;

    public UserData(String userName, String profile) {
        this.userName = userName;
        this.profile = profile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}

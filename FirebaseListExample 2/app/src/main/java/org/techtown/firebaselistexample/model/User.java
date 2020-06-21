package org.techtown.firebaselistexample.model;
//listview 는 adapter로 해야함
public class User {
    public String profile; //url 주소로 가져와야 하기 때문에
    public String id;
    public String pw;
    public String userName;
    public String mainId;
    public String uid;
    public String profileImageUrl;

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {}

}

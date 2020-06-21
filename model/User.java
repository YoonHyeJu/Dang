package org.mobileProgramming.maintermproject.model;
//listview 는 adapter로 해야함 사용자 정보 입력
public class User {
    public String clientType;
    public String type;
    public String address; // 주소
    public String userName;
    public String age;
    public String job;
    public String uid;
    public String permit;
//---------------------------consumer

    public String petName;
    public String petAge;
    public String petType;
    public String petAllgery;
//-----------------------------------
//---------------------------Sales
    public String Salestitle;
    public String hashtag1;
    public String hashtag2;
    public String hashtag3;
    public String memo;

    public boolean sizeMemo(String memo) {
        this.memo = memo;
        if(this.memo.length() < 15) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean hashtagNum (String hashtag1, String hashtag2, String hashtag3) {
        this.hashtag1 = hashtag1;
        this.hashtag2 = hashtag2;
        this.hashtag3 = hashtag3;

        if(this.hashtag1.equals("") || this.hashtag2.equals("") || this.hashtag3.equals("")){
            return false;
        }
        else {
            return true;
        }
    }
//-----------------------------------
}

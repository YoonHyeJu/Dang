package org.mobileProgramming.maintermproject.model;

import java.util.HashMap;
import java.util.Map;

public class ChatModel {
 public String petName;
    public String petAge;
    public String petType;
    public String petAllgery;
    public Map<String, Boolean> users = new HashMap<>(); // 채팅방 유저들
    public Map<String, Comment> comments = new HashMap<>(); //채팅방의 내용
    public static class Comment {
        public String uid;
        public String message;

    }



    public boolean messageOkay(Map<String, Comment> comments) {
        if(comments != null) {
            return true;
        }
        else {
            return false;
        }
    }
}

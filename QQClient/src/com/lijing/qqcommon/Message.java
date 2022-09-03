package com.lijing.qqcommon;

import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID=1L;
    private String sender;
    private String getter;//消息的各种特性
    private String content;
    private String sendtime;
    private String mesType;
    public Message(String sender, String getter, String content, String sendtime) {
        this.sender = sender;
        this.getter = getter;
        this.content = content;
        this.sendtime = sendtime;
    }

    public String getMesType() {
        return mesType;
    }

    public void setMesType(String mesType) {
        this.mesType = mesType;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getGetter() {
        return getter;
    }

    public void setGetter(String getter) {
        this.getter = getter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendtime() {
        return sendtime;
    }

    public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
    }
}

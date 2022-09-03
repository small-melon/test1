package com.lijing.qqcommon;

import java.io.Serializable;

/*表示把用户信息包装成一个对象*/
public class User implements Serializable {//序列化对象
    private String useId;//用户名
    private String passwd;//用户密码
    private static final long serialVersionUID=1L;
    public User(String useId, String passwd) {
        this.useId = useId;
        this.passwd = passwd;
    }

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }}
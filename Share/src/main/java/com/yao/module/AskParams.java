package com.yao.module;

import java.io.Serializable;

/**
 * Created by yaozb on 15-4-11.
 */
public class AskParams implements Serializable {
    private static final long serialVersionUID = 1L;
    private String auth;

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}

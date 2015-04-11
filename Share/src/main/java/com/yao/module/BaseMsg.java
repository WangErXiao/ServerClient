package com.yao.module;

import java.io.Serializable;

/**
 * Created by yaozb on 15-4-11.
 * 必须实现序列,serialVersionUID 一定要有
 */

public abstract class BaseMsg  implements Serializable {
    private static final long serialVersionUID = 1L;
    private MsgType type;
    //必须唯一，否者会出现channel调用混乱
    private String clientId;

    //初始化客户端id
    public BaseMsg() {
        this.clientId = Constants.getClientId();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public MsgType getType() {
        return type;
    }

    public void setType(MsgType type) {
        this.type = type;
    }
}

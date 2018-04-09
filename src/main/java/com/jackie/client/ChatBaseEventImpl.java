package com.jackie.client;

import net.openmob.mobileimsdk.java.event.ChatBaseEvent;

/**
 * Created by luhaiming on 2018/4/9 0009.
 */
public class ChatBaseEventImpl implements ChatBaseEvent {
    public void onLoginMessage(int i) {
        if (i == 0)
            System.out.println("登录成功，");
        else
            System.out.println("登录失败，错误代码：" + i);
    }

    public void onLinkCloseMessage(int i) {
        System.out.println("网络连接出错关闭了，error：" + i);
    }
}

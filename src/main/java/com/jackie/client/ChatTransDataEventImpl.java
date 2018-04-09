package com.jackie.client;

import net.openmob.mobileimsdk.java.event.ChatTransDataEvent;

/**
 * Created by luhaiming on 2018/4/9 0009.
 */
public class ChatTransDataEventImpl implements ChatTransDataEvent {
    public void onTransBuffer(String s, String s1, String s2, int i) {
        System.out.println("收到来自用户"+s+"的消息:"+s1 +"   "+s2);
    }

    public void onErrorResponse(int i, String s) {
        System.out.println("收到服务端错误消息，errorCode="+i+", errorMsg="+s);
    }
}

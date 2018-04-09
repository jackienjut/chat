package com.jackie.chat;

import io.netty.channel.Channel;
import net.openmob.mobileimsdk.server.event.ServerEventListener;

/**
 * Created by luhaiming on 2018/4/9 0009.
 */
public class ServerEventListenerImpl implements ServerEventListener {

    // 用户身份验证回调方法定义
    //
    public int onVerifyUserCallBack(String s, String s1, String s2, Channel channel) {
        System.out.println("is not calling this method : onVerifyUserCallBack ...");
        return 0;
    }

    // user login success call back method
    public void onUserLoginAction_CallBack(String s, String s1, Channel channel) {
        System.out.println("is now call this method : onUserLoginAction...");
    }

    // user login out
    public void onUserLogoutAction_CallBack(String s, Object o, Channel channel) {
        System.out.println("is now call this method : onUserLogoutAction...");
    }

    // common data call back method (the client send to the server , the user_id=0)
    // the up method can used to add friends ;
    public boolean onTransBuffer_CallBack(String s, String s1, String s2, String s3, int i, Channel channel) {
     //   System.out.println("收到了客户端"+s1+"发给服务端的消息：str="+s3);
        return true;
    }

    public void onTransBuffer_C2C_CallBack(String s, String s1, String s2, String s3, int i) {

    }

    public boolean onTransBuffer_C2C_RealTimeSendFaild_CallBack(String s, String s1, String s2, String s3, int i) {
        return false;
    }
}

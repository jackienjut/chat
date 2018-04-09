package com.jackie.chat;

import net.openmob.mobileimsdk.server.event.MessageQoSEventListenerS2C;
import net.openmob.mobileimsdk.server.protocal.Protocal;

import java.util.ArrayList;

/**
 * Created by luhaiming on 2018/4/9 0009.
 */
public class MessageQoSEventS2CListnerImpl implements MessageQoSEventListenerS2C {


    public void messagesLost(ArrayList<Protocal> arrayList) {
        System.out.println("【QoS_S2C事件】收到系统的未实时送达事件通知，当前共有"
                +arrayList.size()+"个包QoS保证机制结束，判定为【无法实时送达】！");
    }

    public void messagesBeReceived(String s) {
        if(s != null)
        {
            System.out.println("【QoS_S2C事件】收到对方已收到消息事件的通知，fp="+s);
        }
    }
}

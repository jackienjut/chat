package com.jackie.client;

import net.openmob.mobileimsdk.java.core.LocalUDPDataSender;

/**
 * Created by luhaiming on 2018/4/9 0009.
 */
public class ClientMain {
    static String userID = "11";

    public static void main(String[] args) {
        new LocalUDPDataSender.SendCommonDataAsync("这是一条测试信息...", userID, 0) {
            @Override
            protected void onPostExecute(Integer code) {
                if (code == 0)
                    System.out.println("数据已成功发出！");
                else
                    System.out.println("数据发送失败。错误码是：" + code + "！");
            }
        }.execute();
    }
}

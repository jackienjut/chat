package com.jackie.chat;

import net.openmob.mobileimsdk.server.ServerLauncher;
import net.openmob.mobileimsdk.server.qos.QoS4SendDaemonS2C;

import java.io.IOException;

/**
 * Created by luhaiming on 2018/4/9 0009.
 */
public class ServerLauncherImpl extends ServerLauncher {

    private static ServerLauncherImpl instance = null;

    public static ServerLauncherImpl getInstance() throws IOException
    {
        if(instance == null)
        {
            // 设置AppKey
            ServerLauncher.appKey = "5418023dfd98c579b6001741";
            QoS4SendDaemonS2C.getInstance().setDebugable(true)  ;
            ServerLauncherImpl.PORT = 7981;
//          ServerLauncherImpl.setSenseMode(SenseMode.MODE_10S);
            instance = new ServerLauncherImpl();
        }
        return instance;
    }


    public ServerLauncherImpl() throws IOException {
        super();
    }

    protected void initListeners() {
// ** 设置回调
        this.setServerEventListener(new ServerEventListenerImpl());
        this.setServerMessageQoSEventListener(new MessageQoSEventS2CListnerImpl());
    }

    public static void main(String[] args) throws Exception
    {
        ServerLauncherImpl.getInstance().startup();
    }
}

package com.lagou;

import com.lagou.router.ReadyRestartInstances;

public class ServerRestartMain {
    public static void main(String[] args) throws  Exception {
        //把节点加入到重启列表中，加入重启列表，消费者就无法调用重启列表中的服务
        //ReadyRestartInstances.create().addRestartingInstance("service-provider","192.168.16.47");
        //从重启列表中删除
        ReadyRestartInstances.create().removeRestartingInstance("service-provider","192.168.16.47");
    }
}

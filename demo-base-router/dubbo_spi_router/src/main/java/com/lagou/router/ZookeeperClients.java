package com.lagou.router;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class ZookeeperClients {
    private final CuratorFramework client;
    private static ZookeeperClients INSTANCE;

    static {
        //设定重试策略，三次，每次间隔1s
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        //创建CuratorFramework客户端
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", retryPolicy);
        //ZookeeperClients创建单例
        INSTANCE = new ZookeeperClients(client);
        //客户端必须启动否则很多方法不生效（看源码）
        client.start();
    }

    private ZookeeperClients(CuratorFramework client) {
        this.client = client;
    }

    public static CuratorFramework client() {
        return INSTANCE.client;
    }
}

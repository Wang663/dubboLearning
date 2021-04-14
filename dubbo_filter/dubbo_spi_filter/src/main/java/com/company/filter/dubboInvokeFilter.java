package com.company.filter;

import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

//配置过滤功能，消费者端或者是服务提供端
@Activate(group = {CommonConstants.CONSUMER,CommonConstants.PROVIDER})
public class dubboInvokeFilter implements Filter {

    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        long startTime = System.currentTimeMillis();
        try {
            //执行方法
            return invoker.invoke(invocation);
        }finally {
            System.out.println(System.currentTimeMillis()-startTime);
        }
    }
}

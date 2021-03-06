package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.ksust.qq.http_api_sdk.HTTPSDK;

/**
 * Demo：推送
 * Created by yugao on 2018/10/7.
 */
public class HTTPSDKPushDemo {
    public static void main(String[] args) {
        //首先擦创建对象，支持加密。详情请查看文档
        HTTPSDK httpsdkPush = HTTPSDK.httpPush("http://127.0.0.1:8080", null, null);
        //引号中为测试QQ号
        String qq = "1402549575";
        //发送消息
        httpsdkPush.sendPrivateMsg(qq, "Hello World[ksust,at_all:qq=all][ksust,music:name=明天]");
        httpsdkPush.sendGroupMsg("244510218", "hello[ksust,at_all:qq=all][ksust,music:name=明天]");
        //点赞
        httpsdkPush.sendLike(qq, 1);
        //查看点赞数量
        System.out.println(httpsdkPush.getLikeCount(qq));
        //查看机器人当前状态
        System.out.println(JSON.toJSONString(httpsdkPush.getQQRobotInfo()));
    }
}

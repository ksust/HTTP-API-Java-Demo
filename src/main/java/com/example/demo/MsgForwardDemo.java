package com.example.demo;

import com.ksust.qq.http_api_sdk.HTTPSDK;
import com.ksust.qq.http_api_sdk.entity.vo.GroupMember;

import java.io.IOException;
import java.util.List;

/**
 * 消息转发Demo
 * Created by yugao on 2019/2/23.
 */
public class MsgForwardDemo {
    public static void main(String[] args) throws IOException {
        HTTPSDK forwardPush = HTTPSDK.msgForwardPush("QQ", "code");
        System.out.println(forwardPush.getLoginQQ());
        System.out.println(forwardPush.sendPrivateMsg("QQ", "hello"));
        List<GroupMember> groupMemberList = forwardPush.getGroupMemberList("群号");
        for (GroupMember groupMember : groupMemberList) {
            System.out.println(groupMember.getName() + "," + groupMember.getQq());
        }
    }
}

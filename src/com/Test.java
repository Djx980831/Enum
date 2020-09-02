package com;

public class Test {

    public static void main(String[] args) {
        String sign = "Tencent";
        ChannelRuleEnum channelRule = ChannelRuleEnum.match(sign);
        System.out.println(ChannelRuleEnum.getLength());
        GeneralChannelRule rule = channelRule.channel;
        rule.process();
    }
}

package com;

public class TencentChannelRule extends GeneralChannelRule{
    @Override
    public void process() {
        System.out.println("这是来自腾讯的数据");
    }
}

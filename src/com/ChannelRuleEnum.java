package com;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public enum ChannelRuleEnum {

    TOUTIAO("TouTiao", new TouTiaoChannelRule()),

    TENCENT("Tencent", new TencentChannelRule()),
    ;

    public String name;

    public GeneralChannelRule channel;

    ChannelRuleEnum(String name, GeneralChannelRule channel) {
        this.name = name;
        this.channel = channel;
    }

    public String getName() {
        return name;
    }

    public GeneralChannelRule getChannel() {
        return channel;
    }

    public static ChannelRuleEnum match(String name){
        ChannelRuleEnum[] values = ChannelRuleEnum.values();
        for (ChannelRuleEnum value : values) {
            if(value.name.equals(name)){
                return value;
            }
        }
        return null;
    }

    public static int getLength() {
        return ChannelRuleEnum.values().length;
    }

    @Override
    public String toString() {
        return "ChannelRuleEnum{" +
                "name='" + name + '\'' +
                ", channel=" + channel +
                '}';
    }
}

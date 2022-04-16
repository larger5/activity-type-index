package com.example.activitytype.constants;

/**
 * 活动类型枚举
 *
 * @author hongcunlin
 */
public enum ActivityType {
    /**
     * 京东
     */
    JD(1, "京东"),

    /**
     * 京东极速版
     */
    JDJSB(2, "京东极速版本"),

    /**
     * 京东极速版
     */
    JD_JDJSB(3, "京东、京东极速版本");

    /**
     * 标识
     */
    public Integer code;

    /**
     * 场景
     */
    public String desc;

    /**
     * 枚举
     *
     * @param code 标识
     * @param desc 场景
     */
    ActivityType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}

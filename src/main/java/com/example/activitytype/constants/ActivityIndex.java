package com.example.activitytype.constants;

/**
 * 活动类型枚举
 *
 * @author hongcunlin
 */
public enum ActivityIndex {
    /**
     * 京东
     */
    JD(1, "京东"),

    /**
     * 京东极速版
     */
    JDJSB(2, "京东极速版本"),

    /**
     * 京东七鲜
     */
    JD7F(3, "7Fresh");

    /**
     * 位置
     */
    public Integer index;

    /**
     * 场景
     */
    public String desc;

    /**
     * 枚举
     *
     * @param index 位置
     * @param desc  场景
     */
    ActivityIndex(Integer index, String desc) {
        this.index = index;
        this.desc = desc;
    }
}

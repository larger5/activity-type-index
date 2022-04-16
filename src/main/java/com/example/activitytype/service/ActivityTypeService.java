package com.example.activitytype.service;

/**
 * 活动服务
 *
 * @author hongcunlin
 */
public interface ActivityTypeService {
    /**
     * 能否在京东极速版使用
     *
     * @param code 标识
     * @return true能/false不能
     */
    boolean isCanUseInJdjsb(Integer code);
}

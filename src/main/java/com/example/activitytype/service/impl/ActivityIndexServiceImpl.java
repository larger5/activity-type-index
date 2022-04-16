package com.example.activitytype.service.impl;

import com.example.activitytype.constants.ActivityIndex;
import com.example.activitytype.service.ActivityIndexService;
import org.springframework.stereotype.Service;

/**
 * 活动服务
 *
 * @author hongcunlin
 */
@Service
public class ActivityIndexServiceImpl implements ActivityIndexService {
    /**
     * 能否在京东极速版使用
     *
     * @param code 标识
     * @return true能/false不能
     */
    @Override
    public boolean isCanUseInJdjsb(Integer code) {
        // 使用 位运算 判断 值的二进制 指定位是否为1
        return (code & ActivityIndex.JDJSB.index) != 0;
    }
}

package com.example.activitytype.service.impl;

import com.example.activitytype.constants.ActivityType;
import com.example.activitytype.service.ActivityTypeService;
import org.springframework.stereotype.Service;

/**
 * 活动服务
 *
 * @author hongcunlin
 */
@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {
    /**
     * 能否在京东极速版使用
     *
     * @param code 标识
     * @return true能/false不能
     */
    @Override
    public boolean isCanUseInJdjsb(Integer code) {
        return ActivityType.JDJSB.code.equals(code) ||
                ActivityType.JD_JDJSB.code.equals(code);
        // TODO 后续这里需要不断维护
    }
}

package com.example.activitytype;

import com.example.activitytype.service.ActivityTypeService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ActivityTypeTest {
    /**
     * 活动服务
     */
    @Resource
    private ActivityTypeService activityTypeService;

    /**
     * 能否在京东极速版使用测试
     */
    @Test
    void isCanUseInJdjsbTest() {
        // 1，京东，false
        System.out.println(activityTypeService.isCanUseInJdjsb(1));
        // 2，京东极速版本，true
        System.out.println(activityTypeService.isCanUseInJdjsb(2));
        // 3，京东、京东极速版本，true
        System.out.println(activityTypeService.isCanUseInJdjsb(3));
    }
}

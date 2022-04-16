package com.example.activitytype;

import com.example.activitytype.service.ActivityIndexService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ActivityIndexTest {
    /**
     * 活动服务
     */
    @Resource
    private ActivityIndexService activityIndexService;

    /**
     * 能否在京东极速版使用测试
     */
    @Test
    void isCanUseInJdjsbTest() {
        // 010，true
        System.out.println(activityIndexService.isCanUseInJdjsb(2));
        // 111，true
        System.out.println(activityIndexService.isCanUseInJdjsb(7));
        // 100，false
        System.out.println(activityIndexService.isCanUseInJdjsb(4));
        // 001，false
        System.out.println(activityIndexService.isCanUseInJdjsb(1));
    }
}

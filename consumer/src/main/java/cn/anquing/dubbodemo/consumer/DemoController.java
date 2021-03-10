package cn.anquing.dubbodemo.consumer;

import cn.anquing.dubbodemo.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangquanqing
 * @since 2021/3/10 17:00
 */
@RestController
public class DemoController {

    @Reference
    private DemoService demoService;

    @GetMapping("hello")
    public String sayHello() {
        return demoService.sayHello("world");
    }
}

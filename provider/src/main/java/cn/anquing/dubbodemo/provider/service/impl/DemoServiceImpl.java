package cn.anquing.dubbodemo.provider.service.impl;

import cn.anquing.dubbodemo.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author wangquanqing
 * @since 2021/3/10 15:37
 */
@Service
@Component
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String world) {
        return "hello " + world;
    }

}

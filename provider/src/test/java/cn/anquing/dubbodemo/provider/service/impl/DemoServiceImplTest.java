package cn.anquing.dubbodemo.provider.service.impl;

import cn.anquing.dubbodemo.DemoService;
import cn.anquing.dubbodemo.ProviderApplicationTest;
import org.junit.Test;
import javax.annotation.Resource;


/**
 * @author wangquanqing
 * @since 2021/3/10 15:51
 */
public class DemoServiceImplTest extends ProviderApplicationTest {

    @Resource
    private DemoService demoService;

    @Test
    public void sayHello() {
        final String hello = demoService.sayHello("anquing");
        System.out.println(hello);
    }
}
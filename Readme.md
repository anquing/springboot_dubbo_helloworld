#### 简介
这是一个整合SpringBoot + Dubbo + Zookeeper框架搭建的微服务demo工程，采用maven多模块方式，共有三个子模块：interface（暴露接口）、provider(提供者)、consumer(消费者)。

#### 使用
首先启动provider
再启动consumer
最后在浏览器访问：http://127.0.0.1:10001/hello
若返回"hello world",说明工程是可以正常运行

#### 注意事项
-  需要将provider、consumer中的注册中心地址改成自己address: ip:port
- 为了保证依赖都能正常引用，将provider、consumer的启动类放在工程的最外层

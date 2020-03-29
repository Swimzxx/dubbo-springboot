### dubbo整合springboot

环境准备：

```
1，jdk1.8
2，zookeeper3.4.12
3，maven
4，dubbo2.x
5，dubbo-admin（服务管控台）
```

新建一个maven，删除src目录，然后新建三个moudle，分别是dubbo-api,dubbo-consumer,dubbo-provider

dubbo-api,一般存储实体类和接口服务

dubbo-provider，服务提供者，一般存储接口具体实现

dubbo-consumer，服务消费者，消费服务，分发请求

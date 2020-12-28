## spring-cloud-demo

	EurekaDemo	   注册中心服务
	ZullDemo			路由网关服务
	UserServer		  用户服务
	OrderServer		订单服务
	
- #### Eureka 服务启动后，其他服务启动后则会注册到 Eureka 服务中
- #### Zull 服务启动后，可以由同一个url不同的前缀访问不同的业务服务
- #### UserServer 和 OrderServer 服务间使用 Feign 调用，加入 Hystrix 熔断机制
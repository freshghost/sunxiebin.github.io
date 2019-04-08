# 服务发现（service_discovery）
## 原因
   当服务A，依赖服务B时候。A需要知道B的地址，然后去找B要求服务。这是单点的情况，比较简单。但是如果B有很多个，简称为{b1,b2,b3,b4..........}。这时候A必须知道b所有的地址。这是一个复杂的过程，需要单独的空间存储b的地址。还要知道b的地址是否可达。如果不可达，是否需要删除，然后添加一个可达的地址。这还是一个服务的依赖，那么m个服务，那么地址的数量就达到2m次方，而且大量冗余。故而服务发现的服务就应运而生。
## 流程
------
```sequence {theme="hand"}

server_B->server_discovery: register
server_A->server_discovery: get location of server b
server_B->server_A: get server A

````

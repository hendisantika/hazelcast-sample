# hazelcast-sample

Run this project by this command :

`mvn clean spring-boot:run -Dserver.port=8080`

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2018-10-01 04:02:48.739  INFO 83594 --- [           main] c.h.h.HazelcastSampleApplication         : Starting HazelcastSampleApplication on Hendis-MacBook-Pro.local with PID 83594 (/Users/hendisantika/Documents/IdeaProjects/hazelcast-sample/target/classes started by hendisantika in /Users/hendisantika/Documents/IdeaProjects/hazelcast-sample)
2018-10-01 04:02:48.743  INFO 83594 --- [           main] c.h.h.HazelcastSampleApplication         : No active profile set, falling back to default profiles: default
2018-10-01 04:02:48.813  INFO 83594 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@ad35e6c: startup date [Mon Oct 01 04:02:48 WIB 2018]; root of context hierarchy
2018-10-01 04:02:50.033  INFO 83594 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2018-10-01 04:02:50.062  INFO 83594 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-10-01 04:02:50.062  INFO 83594 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.34
2018-10-01 04:02:50.075  INFO 83594 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/Users/hendisantika/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
2018-10-01 04:02:50.162  INFO 83594 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-10-01 04:02:50.163  INFO 83594 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1354 ms
2018-10-01 04:02:50.223  INFO 83594 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-10-01 04:02:50.227  INFO 83594 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-10-01 04:02:50.227  INFO 83594 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-10-01 04:02:50.227  INFO 83594 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-10-01 04:02:50.227  INFO 83594 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-10-01 04:02:50.365  INFO 83594 --- [           main] com.hazelcast.instance.AddressPicker     : [LOCAL] [dev] [3.9.4] Prefer IPv4 stack is true.
2018-10-01 04:02:50.386  INFO 83594 --- [           main] com.hazelcast.instance.AddressPicker     : [LOCAL] [dev] [3.9.4] Picked [192.168.1.8]:5701, using socket ServerSocket[addr=/0:0:0:0:0:0:0:0,localport=5701], bind any local is true
2018-10-01 04:02:50.396  INFO 83594 --- [           main] com.hazelcast.system                     : [192.168.1.8]:5701 [dev] [3.9.4] Hazelcast 3.9.4 (20180420 - b8001d5) starting at [192.168.1.8]:5701
2018-10-01 04:02:50.397  INFO 83594 --- [           main] com.hazelcast.system                     : [192.168.1.8]:5701 [dev] [3.9.4] Copyright (c) 2008-2018, Hazelcast, Inc. All Rights Reserved.
2018-10-01 04:02:50.397  INFO 83594 --- [           main] com.hazelcast.system                     : [192.168.1.8]:5701 [dev] [3.9.4] Configured Hazelcast Serialization version: 1
2018-10-01 04:02:50.567  INFO 83594 --- [           main] c.h.s.i.o.impl.BackpressureRegulator     : [192.168.1.8]:5701 [dev] [3.9.4] Backpressure is disabled
2018-10-01 04:02:50.946  INFO 83594 --- [           main] com.hazelcast.instance.Node              : [192.168.1.8]:5701 [dev] [3.9.4] Creating MulticastJoiner
2018-10-01 04:02:51.291  INFO 83594 --- [           main] c.h.s.i.o.impl.OperationExecutorImpl     : [192.168.1.8]:5701 [dev] [3.9.4] Starting 8 partition threads and 5 generic threads (1 dedicated for priority tasks)
2018-10-01 04:02:51.293  INFO 83594 --- [           main] c.h.internal.diagnostics.Diagnostics     : [192.168.1.8]:5701 [dev] [3.9.4] Diagnostics disabled. To enable add -Dhazelcast.diagnostics.enabled=true to the JVM arguments.
2018-10-01 04:02:51.297  INFO 83594 --- [           main] com.hazelcast.core.LifecycleService      : [192.168.1.8]:5701 [dev] [3.9.4] [192.168.1.8]:5701 is STARTING
2018-10-01 04:02:54.823  INFO 83594 --- [           main] com.hazelcast.system                     : [192.168.1.8]:5701 [dev] [3.9.4] Cluster version set to 3.9
2018-10-01 04:02:54.824  INFO 83594 --- [           main] c.h.internal.cluster.ClusterService      : [192.168.1.8]:5701 [dev] [3.9.4]

Members {size:1, ver:1} [
	Member [192.168.1.8]:5701 - ad55fb38-9dd0-47a5-ab5b-504916c9e85f this
]

2018-10-01 04:02:54.849  INFO 83594 --- [           main] com.hazelcast.core.LifecycleService      : [192.168.1.8]:5701 [dev] [3.9.4] [192.168.1.8]:5701 is STARTED
2018-10-01 04:02:54.932  INFO 83594 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-01 04:02:55.059  INFO 83594 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@ad35e6c: startup date [Mon Oct 01 04:02:48 WIB 2018]; root of context hierarchy
2018-10-01 04:02:55.130  INFO 83594 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/write]}" onto public java.lang.String com.hendisantika.hazelcastsample.controller.HazelcastController.write(java.lang.String)
2018-10-01 04:02:55.131  INFO 83594 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/read]}" onto public java.lang.String com.hendisantika.hazelcastsample.controller.HazelcastController.read()
2018-10-01 04:02:55.133  INFO 83594 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-10-01 04:02:55.134  INFO 83594 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-10-01 04:02:55.153  INFO 83594 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-01 04:02:55.153  INFO 83594 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-01 04:02:55.268  INFO 83594 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-10-01 04:02:55.292  INFO 83594 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2018-10-01 04:02:55.296  INFO 83594 --- [           main] c.h.h.HazelcastSampleApplication         : Started HazelcastSampleApplication in 6.847 seconds (JVM running for 10.624)
2018-10-01 04:03:02.560  INFO 83594 --- [thread-Acceptor] com.hazelcast.nio.tcp.TcpIpAcceptor      : [192.168.1.8]:5701 [dev] [3.9.4] Accepting socket connection from /192.168.1.8:60047
2018-10-01 04:03:02.563  INFO 83594 --- [cached.thread-2] c.h.nio.tcp.TcpIpConnectionManager       : [192.168.1.8]:5701 [dev] [3.9.4] Established socket connection between /192.168.1.8:5701 and /192.168.1.8:60047
```

`mvn clean spring-boot:run -Dserver.port=8181`

```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.5.RELEASE)

2018-10-01 04:04:52.527  INFO 83741 --- [           main] c.h.h.HazelcastSampleApplication         : Starting HazelcastSampleApplication on Hendis-MacBook-Pro.local with PID 83741 (/Users/hendisantika/Documents/IdeaProjects/hazelcast-sample/target/classes started by hendisantika in /Users/hendisantika/Documents/IdeaProjects/hazelcast-sample)
2018-10-01 04:04:52.530  INFO 83741 --- [           main] c.h.h.HazelcastSampleApplication         : No active profile set, falling back to default profiles: default
2018-10-01 04:04:52.576  INFO 83741 --- [           main] ConfigServletWebServerApplicationContext : Refreshing org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2bba4126: startup date [Mon Oct 01 04:04:52 WIB 2018]; root of context hierarchy
2018-10-01 04:04:53.653  INFO 83741 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8181 (http)
2018-10-01 04:04:53.675  INFO 83741 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2018-10-01 04:04:53.676  INFO 83741 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.34
2018-10-01 04:04:53.686  INFO 83741 --- [ost-startStop-1] o.a.catalina.core.AprLifecycleListener   : The APR based Apache Tomcat Native library which allows optimal performance in production environments was not found on the java.library.path: [/Users/hendisantika/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.]
2018-10-01 04:04:53.764  INFO 83741 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2018-10-01 04:04:53.765  INFO 83741 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1193 ms
2018-10-01 04:04:53.829  INFO 83741 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Servlet dispatcherServlet mapped to [/]
2018-10-01 04:04:53.833  INFO 83741 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
2018-10-01 04:04:53.834  INFO 83741 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
2018-10-01 04:04:53.834  INFO 83741 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
2018-10-01 04:04:53.834  INFO 83741 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
2018-10-01 04:04:53.978  INFO 83741 --- [           main] com.hazelcast.instance.AddressPicker     : [LOCAL] [dev] [3.9.4] Prefer IPv4 stack is true.
2018-10-01 04:04:54.000  INFO 83741 --- [           main] com.hazelcast.instance.AddressPicker     : [LOCAL] [dev] [3.9.4] Picked [192.168.1.8]:5702, using socket ServerSocket[addr=/0:0:0:0:0:0:0:0,localport=5702], bind any local is true
2018-10-01 04:04:54.011  INFO 83741 --- [           main] com.hazelcast.system                     : [192.168.1.8]:5702 [dev] [3.9.4] Hazelcast 3.9.4 (20180420 - b8001d5) starting at [192.168.1.8]:5702
2018-10-01 04:04:54.012  INFO 83741 --- [           main] com.hazelcast.system                     : [192.168.1.8]:5702 [dev] [3.9.4] Copyright (c) 2008-2018, Hazelcast, Inc. All Rights Reserved.
2018-10-01 04:04:54.012  INFO 83741 --- [           main] com.hazelcast.system                     : [192.168.1.8]:5702 [dev] [3.9.4] Configured Hazelcast Serialization version: 1
2018-10-01 04:04:54.180  INFO 83741 --- [           main] c.h.s.i.o.impl.BackpressureRegulator     : [192.168.1.8]:5702 [dev] [3.9.4] Backpressure is disabled
2018-10-01 04:04:54.550  INFO 83741 --- [           main] com.hazelcast.instance.Node              : [192.168.1.8]:5702 [dev] [3.9.4] Creating MulticastJoiner
2018-10-01 04:04:54.912  INFO 83741 --- [           main] c.h.s.i.o.impl.OperationExecutorImpl     : [192.168.1.8]:5702 [dev] [3.9.4] Starting 8 partition threads and 5 generic threads (1 dedicated for priority tasks)
2018-10-01 04:04:54.914  INFO 83741 --- [           main] c.h.internal.diagnostics.Diagnostics     : [192.168.1.8]:5702 [dev] [3.9.4] Diagnostics disabled. To enable add -Dhazelcast.diagnostics.enabled=true to the JVM arguments.
2018-10-01 04:04:54.918  INFO 83741 --- [           main] com.hazelcast.core.LifecycleService      : [192.168.1.8]:5702 [dev] [3.9.4] [192.168.1.8]:5702 is STARTING
2018-10-01 04:04:55.136  INFO 83741 --- [           main] c.h.i.cluster.impl.MulticastJoiner       : [192.168.1.8]:5702 [dev] [3.9.4] Trying to join to discovered node: [192.168.1.8]:5701
2018-10-01 04:04:55.146  INFO 83741 --- [cached.thread-3] com.hazelcast.nio.tcp.TcpIpConnector     : [192.168.1.8]:5702 [dev] [3.9.4] Connecting to /192.168.1.8:5701, timeout: 0, bind-any: true
2018-10-01 04:04:55.149  INFO 83741 --- [cached.thread-3] c.h.nio.tcp.TcpIpConnectionManager       : [192.168.1.8]:5702 [dev] [3.9.4] Established socket connection between /192.168.1.8:60338 and /192.168.1.8:5701
2018-10-01 04:05:01.168  INFO 83741 --- [ration.thread-0] com.hazelcast.system                     : [192.168.1.8]:5702 [dev] [3.9.4] Cluster version set to 3.9
2018-10-01 04:05:01.170  INFO 83741 --- [ration.thread-0] c.h.internal.cluster.ClusterService      : [192.168.1.8]:5702 [dev] [3.9.4]

Members {size:2, ver:4} [
	Member [192.168.1.8]:5701 - ad55fb38-9dd0-47a5-ab5b-504916c9e85f
	Member [192.168.1.8]:5702 - 3f234cd8-050d-4ed2-9615-51b3c2593f26 this
]

2018-10-01 04:05:03.192  INFO 83741 --- [           main] com.hazelcast.core.LifecycleService      : [192.168.1.8]:5702 [dev] [3.9.4] [192.168.1.8]:5702 is STARTED
2018-10-01 04:05:03.267  INFO 83741 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-01 04:05:03.388  INFO 83741 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext@2bba4126: startup date [Mon Oct 01 04:04:52 WIB 2018]; root of context hierarchy
2018-10-01 04:05:03.451  INFO 83741 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/write]}" onto public java.lang.String com.hendisantika.hazelcastsample.controller.HazelcastController.write(java.lang.String)
2018-10-01 04:05:03.452  INFO 83741 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/read]}" onto public java.lang.String com.hendisantika.hazelcastsample.controller.HazelcastController.read()
2018-10-01 04:05:03.455  INFO 83741 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
2018-10-01 04:05:03.456  INFO 83741 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
2018-10-01 04:05:03.476  INFO 83741 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-01 04:05:03.476  INFO 83741 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
2018-10-01 04:05:03.588  INFO 83741 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-10-01 04:05:03.613  INFO 83741 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8181 (http) with context path ''
2018-10-01 04:05:03.617  INFO 83741 --- [           main] c.h.h.HazelcastSampleApplication         : Started HazelcastSampleApplication in 11.336 seconds (JVM running for 14.71)


```

Test Write Values :

`http://localhost:8080/write?values=Hendi%20Santika`

Test Read Values :

`http://localhost:8080/read`




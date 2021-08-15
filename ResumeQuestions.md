### Tomcat
Apache Tomcat, often referred to as Tomcat Server, is an open-source Java Servlet Container developed by the Apache Software Foundation (ASF). Tomcat implements several Java EE specifications including Java Servlet, JavaServer Pages (JSP), Java EL, and WebSocket, and provides a "pure Java" HTTP web server environment in which Java code can run.
•	RPC(Remote Procedure Call): a function call to a remote server. 
•	Java Servlet: Java class to handle RPC on server side.
•	Tomcat is an environment to run your web service, it provides low level support such as making TCP connection, receiving request from client, finding the correct service to handle that request, and sending response back.
•	If you want to create a web service based on Tomcat Server, all you need to do is implement the logic to handle certain HTTP request.

### MongoDB vs MySQL
Consistency vs availability:
So, here comes the first main difference between traditional SQL and NoSQL: do you want to maintain consistency between all nodes, or you want to make respond quickly to your client, or you want to achieve both. For traditional SQL(MySQL), it chooses consistency over availability. For NoSQL(MongoDB), it chooses availability over consistency.

Why can use achieve both at the same time?   
CAP theorem:（只能三选二。单机版做到极致可以满足consistency和avalibility）    
•	Consistency: Every read receives the most recent write or an error(一致性，给node1发送request，相对应的备份的node2会update)    
•	Availability: Every request receives a (non-error) response – without guarantee that it contains the most recent write（流畅性，发送朋友圈后多久收到）    
  o	Error ratio  
  o Latency    
•	Partition tolerance: The system continues to operate despite an arbitrary number of messages being dropped (or delayed) by the network between nodes   
Second difference:   

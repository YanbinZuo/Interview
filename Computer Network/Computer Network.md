### 1. propogation delay(传播时延)  
  *definition:* Once a bit is pushed into the link, it needs to propagate to router B. The time required to propagate from  
  the beginning of the link to router B is the propagation delay.  
  The propogation delay is *D/V*
  
### 2. transmission delay(发送时延)     
  *definition:* This is the amount of time required to push(transmit) all of the packet's bits into the link.    
  Denote the length of the packet by *L* bits, and denote the transmission rate of the link from router A to router B by *R* bit/sec  
  The transmission delay is *L/R*.    
  也就是从数据块的第一个比特开始发送算起，到最后一个比特发送完毕所需的时间。(发送)   

  Example: Consider	two	hosts, A and B, connected	by a single link of rate R bps. Suppose	that the two hosts are separated by  	    
  m meters, and suppose	the	propagation	speed	along	the link is s meters/sec. Host A is	to send a packet of size L bits	to Host B     
  a.Suppose Host A begins	to transmit	the	packet at time t=0. At time t=d(trans),	where	is the last	bit	of the packet?   
  Answer: The	bit	is just leaving Host A  
  b. Suppose d(prop) is	greater	than d(trans). At time t=d(trans), where is the	first	bit	of the packet?  
  Answer：The first bit is in the link and has not	reached	Host B.   
  c. Suppose dprop is	less than d(trans). At time t=dtrans, where	is the first bit of the packet?  
  Answer: The	first	bit	has	reached	Host B  
    
### 3. bandwidth delay product  
  bandwidth delay product = R × d(prop)
  bandwidth delay product of  a link is the maximum number of bits that can be in the link.

### 4. queuing delay    
  At the queue, the packet experiences a queuing delay as it waits to be transmitted onto the link. The length of the queuing delay of      
  a specific packet will depend on the number of earlier-arriving packets that are queued and waiting for transmission onto the link.     
  If the queue is empty and no other packet is currently being transmitted, then our packet’s queuing delay will be zero. On the other hand,  
  if the traffic is heavy and many other packets are also waiting to be transmitted, the queuing delay will be long.   
 
### 5. processing delay  
  The time required to examine the packet’s header and determine where to direct the packet is part of the processing delay. The processing   
  delay can also include other factors, such as the time needed to check for bit-level errors in the packet that occurred in transmitting    
  the packet’s bits from the upstream node to router A. Processing delays in high-speed routers are typically on the order of microseconds or   
  less. After this nodal processing, the router directs the packet to the queue that precedes the link to router B.   
  

### store and forward
  router needs to receive the packet completely before it can forward to the next hop.
  

### Internet protocol stack(协议栈)  Lecture4     
  协议栈是指网络中各层协议的总和，其形象的反映了一个网络中数据传输的过程：由上层协议到底层协议，再由底层协议到上层协议。  
  * application: supporting network applications  
    IMAP, SMTP, HTTP   
  * transport: process-process data transfer  
    TCP, UDP   
  * network: routing of datagrams from source to destination   
    IP, routing protocols   
  * link: data transfer between neighboring network elements  
    Ethernet, wifi, PPP   
  * physical: bits "on the wire"   
  
  如一个HTTP请求，HTTP->TCP->IP，先转化成TCP数据包，再转化成IP数据包，再通过网卡传输出去；接收方通过网卡接收到IP数据包，  
  去掉IP数据头，检测到是一个TCP数据包,就把TCP数据包传到TCP协议处理层，去掉TCP数据头，检测到是一个HTTP数据包，就把HTTP数据包传到HTTP协议处理层。    
  所有的网络数据都是通过这样一层层的堆叠起来的协议来传送的，像栈一样，所以叫协议栈     
  
  协议、源IP、源端口、目的IP、目的端口确定一个TCP连接     
  1. 顺序号：TCP段所发送的数据部分第一个字节的序号  
  2. 确认号：期望收到对方下次发送的数据的第一个字节的序号  
  3. 头部长度：单位为4字节，因此TCP首部的最大长度为60字节   
  4. 窗口大小：窗口通告值，发送方根据接收方的窗口告值调整窗口大小    
  5. 紧急指针：指示紧急数据在报文段中的结束位置此时URG置位  
  6. URG：表示紧急指针字段有效  
  7. ACK：表示确认号字段有效   
  8. PSH：表示当前报文需要推操作   
  9. RST：置位表示复位TCP连接  
  10. SYN：用于建立TCP连接时同步序列号  
  11. FIN：用于释放TCP连接时标识发送方比特流结束   
   

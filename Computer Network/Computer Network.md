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

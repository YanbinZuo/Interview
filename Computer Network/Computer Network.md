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
    
### 3. bandwidth delay  

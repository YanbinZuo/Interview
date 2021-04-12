think about fork:
After a fork call you get two copies of the same process:
* Any computation moving formward only impacts that particular copy -- they are independent of each other
* Each process will have its own pid and they will have different parents
* There are a few exceptions, like open files
* Cloning humans analogy...



fork是linux的系统调用，用来创建子进程(child process)。子进程是父进程(parent process)的一个副本，从父进程那里  
获得一定的资源分配以及继承父进程的环境。子进程与父进程唯一不同的地方在于pid(process id)。  
环境变量(传给子进程的变量，遗传性是本地变量和环境变量的根本区别)只能单向从父进程传给子进程。不管子进程的环境   
变量如何变化，都不会影响父进程的环境变量。   
一般的script文件(.sh)即是这种用法。这种方法先启用新的sub-shell(新的子进程),然后在其下执行命令。  
另外一种方法就是上面说过的source命令，不再产生新的shell，而在当前shell下执行一切命令。  
* source:  
source命令即点(.)命令。   
在bash下输入man source，找到source命令解释处，可以看到解释”Read and execute commands from filename in the  
current shell environment and …”。从中可以知道，source命令是在当前进程中执行参数文件中的各个命令，而不是另起子   
进程(或sub-shell)。 
* exec:  
在bash下输入man exec，找到exec命令解释处，可以看到有”No new process is created.”这样的解释，这就是说exec命  
令不产生新的子进程。那么exec与source的区别是什么呢?  
exec命令在执行时会把当前的shell process关闭，然后换到后面的命令继续执行。 

1. 系统调用exec是以新的进程去代替原来的进程，但进程的PID保持不变。因此，可以这样认为，exec系统调用并没有创建新的

进程，只是替换了原来进程上下文的内容。原进程的代码段，数据段，堆栈段被新的进程所代替。

　　一个进程主要包括以下几个方面的内容:

　　(1)一个可以执行的程序

　　(2) 与进程相关联的全部数据(包括变量，内存，缓冲区)

　　(3)程序上下文(程序计数器PC,保存程序执行的位置)

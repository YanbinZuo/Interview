###  *` 1.The difference between HashMap and HashSet: 1. 实现的接口不同，hashmap实现的是map接口，hashset实现的是set接口。`
                                              2. 存储的数据不同，hashmap存储键值对，hashset存储对象。
                                              3. 添加元素的方法不同，hashmap使用put()方法，hashset使用add()方法。
                                              4. Hashcode计算方式不同，Hashmap使用key计算hashcode，hashset使用对象计算hashcode。
HashSet 底层就是基于 HashMap 实现的。（HashSet 的源码⾮常⾮常少，因为除了 clone() 、 writeObject() 、 readObject() 是 HashSet ⾃⼰不得不实现之外，其他⽅法都是直接调⽤ HashMap 中的⽅法。
https://www.yuque.com/gaohanghang/sgrbwh/kyb5zl

2. The difference between Bubble Sort, Selection Sort, and Insertion Sort:
a. Bubble Sort     //(从小到大)两个两个进行比较往右移，第一回合把最大的移到最右面，以此类推
对于一个数比较与之相邻的数字，例如要把一个数列按从小到大的顺序排列，就拿左边第一个数，和第二的比，若小于第二个数两个交换，否则不换，再比较第二个和第三个，按照同样的规则，继续第三第四…直到最后。
这样就算一次冒泡，每次冒泡都会有一个数被放到了最终的位置。
b. Selection Sort  //(从小到大)把数组分为已排序区和未排序区，它每次找到未排序区的最小值，与未排序区的首个元素交换，这样就变成了已排序区的末尾元素了。
c. Insertion Sort  //(从小到大)插入排序把数组分为已排序区和未排序区。取未排序区的元素，在已排序区上找到一个正确的位置插上去。还是希望对一个数据进行从小到大的排序。
d. Heap Sort
e. Quick Sort      // divide and conquer
f. Quick Select    //和quick sort很像 都需要partition step。 不同的是recursion部分
a,b,c 对比 https://blog.csdn.net/weixin_39679367/article/details/83188391

3. OS:
  程序：硬盘上的一个 .exe文件。每当点击一个程序时，os会启动一个相对应的进程，再次双击会出现又一个进程。一个程序会有好多个进程，进程是一个程序跑起来了，放到内存里开始执行了，CPU开始执行它的指令了。
  在一个进程里有好多的工作是并行进行的比如刷新页面，接收网络的传输，存盘。这些东西是并行进行通过线程的。在一个新成立可以做并行任务，一个线程里不同的执行路径叫做纤程（协程，JAVA： fiber）。
  进程：分配资源的单位。启动一个进程的时候，会分配内存空间，这是虚拟内存，但最后也会映射到物理内存上

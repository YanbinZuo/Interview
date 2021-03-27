Topic: This file contains some relative interview questions and ideas

1.The difference between HashMap and HashSet: 1. 实现的接口不同，hashmap实现的是map接口，hashset实现的是set接口。
                                              2. 存储的数据不同，hashmap存储键值对，hashset存储对象。
                                              3. 添加元素的方法不同，hashmap使用put()方法，hashset使用add()方法。
                                              4. Hashcode计算方式不同，Hashmap使用key计算hashcode，hashset使用对象计算hashcode。
HashSet 底层就是基于 HashMap 实现的。（HashSet 的源码⾮常⾮常少，因为除了 clone() 、 writeObject() 、 readObject() 是 HashSet ⾃⼰不得不实现之外，其他⽅法都是直接调⽤ HashMap 中的⽅法。
https://www.yuque.com/gaohanghang/sgrbwh/kyb5zl

2. 

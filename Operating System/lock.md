## Synchronized and Lock:
* Lock是显示锁（手动开启和关闭锁） synchronized 是隐式锁，出了作用域自动释放
* Lock只有代码锁，synchronized有代码锁和方法锁
* 使用lock锁，JVM将花费较少时间来调整线程，性能更好，并且具有更好的扩展性
* 优先使用顺序：
    * lock > 同步代码块(已经进入了方法体，分配了相应资源) > 同步方法(在方法体之外)

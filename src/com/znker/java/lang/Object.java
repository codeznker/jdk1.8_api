package com.znker.java.lang;

/**
 * Object类是由java定义的特殊类，它是java中其它所有类的超类，其它类都直接或者间接继承自该类
 * Object类型的引用变量可以引用任意类型的对象
 *
 * */
public class Object {

    // 应该是和调用本地方法有关，不懂，但是后面的方法虽然没有方法体，但是也不报错
    private static native void registerNatives();

    static {
        registerNatives();
    }

    /**
     * 这个方法在 java.lang.Object 中是被final修饰的，所以无法重写
     * getClass() 用于在运行时动态获取对象的实际类型
     *
     * */
    // public final native Class<?> getClass();

    /**
     * native 关键字修饰
     * 返回与调用对象相关联的散列值 hashcode
     * 这个方法对于 java.util.HashMap 非常有用，用于判断两个key值是否相等
     *
     * */
    public native int hashCode();

    /**
     * 判断一个对象是否和另一个对象相等
     *
     *
     * */
    public boolean equals(java.lang.Object obj) {
        return (this == obj);
    }

    /**
     * 返回一个简洁的字符串用于描述该对象信息，建议所有的子类都重写该方法，便于debug
     *
     * */
    public String toString(){
        // 将hashcode转为十六进制的字符串
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    /**
     * ==========以下的方法都和多线程相关===========
     *
     * */

    /**
     * 唤醒一个等待该对象锁的线程，具体是哪个线程由jvm决定
     *
     * */
    // public final native void notify();

    // public final native void notifyAll();

    /**
     * 线程进入WAITTING状态
     *
     * */
    // public final native void wait(long timeout) throws InterruptedException;


    /**
     * 在jvm回收不再使用的对象之前调用，可以用于释放对象绑定的其它资源
     *
     * */
    protected void finalize() throws Throwable{}

}

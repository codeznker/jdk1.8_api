package com.znker.java.util;

/**
 *  Queue扩展了Collection，并且声明了队列的行为，队列通常是先进先出的列表
 *  队列的特性是只能操作队列头部和队列尾部元素，不像List可以从中间插入元素
 *
 * */
public interface Queue<E> extends Collection<E> {

    /**
     * 试图将元素e添加到队列中，如果成功添加了就返回true，否则返回false
     *
     * */
    boolean offer(E e);

    /**
     * 返回队列头部的元素，不移除该元素
     * @throws java.util.NoSuchElementException 队列为空
     *
     * */
    E element();

    /**
     * 返回队列头部元素，不移除该元素，如果队列为空则返回null
     *
     * */
    E peek();

    /**
     * 返回队列头部元素，在操作过程中移除该元素，如果队列为空返回null
     *
     * */
    E poll();

    /**
     * 返回队列头部元素，在操作过程中移除该元素
     * @throws java.util.NoSuchElementException 队列为空
     *
     * */
    E remove();

}

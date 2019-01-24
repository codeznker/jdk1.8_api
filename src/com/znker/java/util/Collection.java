package com.znker.java.util;

import java.util.Iterator;

/**
 * Collection接口位于集合层次的顶部，它定义操作一组对象的最核心、最通用的方法，
 * 集合中定义的所有的类都必须实现该接口
 *
 * 后面其它的集合类还是要实现java.util.Collection<E>接口，否则foreach迭代方法无法使用
 */
public interface Collection<E> extends Iterator<E> {

    /**
     * 返回调用集合中元素的数量，最大值是 Integer.MAX_VALUE
     */
    int size();

    /**
     * 判断调用集合对象是否为空，如果为空就返回true
     */
    boolean isEmpty();

    /**
     * 判断集合中是否存在指定的元素，如果存在就返回true
     */
    boolean contains(Object obj);

    /**
     * 返回调用集合的一个迭代器对象
     */
    Iterator<E> iterator();

    /**
     * 返回包含调用集合中所有元素的数组，数组中的元素是集合中元素的副本
     */
    Object[] toArray();

    <T> T[] toArray(T[] a);

    /**
     * 将obj添加到调用集合中，如果添加成功就返回true
     * 如果obj已经是集合中的元素且该集合不允许存储相同的元素则返回false
     */
    boolean add(E e);

    boolean addAll(Collection<? extends E> c);

    /**
     * 从调用集合中移除指定的元素，如果移除了就返回true，否则返回false
     */
    boolean remove(Object o);

    boolean removeAll(Collection<?> c);

    /**
     * 移除集合中的所有元素
     */
    void clear();

    /**
     * 返回调用集合的hashcode
     */
    int hashCode();

    /**
     * 判断调用集合是否与指定的集合相等
     */
    boolean equals(Object o);

}

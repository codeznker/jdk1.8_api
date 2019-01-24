package com.znker.java.util;

/**
 * List扩展了Collection接口，声明了用来存储一连串元素的集合
 * List作为列表最大的特点是有序性，在List中可以使用从0开始的索引index，通过元素的位置插入或访问元素
 * List中可以存储相同的元素
 */
public interface List<E> extends Collection<E> {

    //=========== List中的特有的方法 =============

    /**
     * 将元素element插入到调用列表中由index指定的位置
     * 插入点及之后存储的元素将被后移，因此没有元素会被覆盖
     */
    void add(int index, E element);

    boolean addAll(int index, Collection<? extends E> c);

    /**
     * 返回调用列表指定位置处存储的元素
     */
    E get(int index);

    /**
     * 返回调用列表中第一个obj实例的索引，如果List不存在obj，则返回-1
     */
    int indexOf(Object obj);

    int lastIndexOf(Object obj);

    /**
     * 从调用列表中移除指定索引index处的元素，并返回被移除的元素，
     * 后面的所有元素的索引都-1，列表被压缩
     */
    E remove(int index);

    /**
     * 将调用列表中由index索引指定位置处的元素设置为obj，并返回原来的元素
     */
    E set(int index, E obj);

    /**
     * 截取子列表，返回的子列表包含调用列表中索引位置在start到end-1之间的元素
     */
    List<E> subList(int start, int end);

}

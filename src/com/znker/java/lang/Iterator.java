package com.znker.java.lang;

/**
 * 迭代器接口，实现了这个接口的类必须实现一个迭代器方法，该方法允许使用for-each的方式迭代集合对象
 * @param <E> 定义迭代器方法返回的元素的类型
 *
 * */
public interface Iterator<E> {

    boolean hasNext();

    E next();

}

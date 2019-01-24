package com.znker.java.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 实现了Collection集合中的部分方法
 */
public abstract class AbstractCollection<E> implements Collection<E> {

    protected AbstractCollection() {

    }

    // Query Operations

    public abstract Iterator<E> iterator();

    public abstract int size();

    /**
     * 判断集合是否为空
     */
    @Override
    public boolean isEmpty() {

        return size() == 0;
    }

    /**
     * 判断集合中是否存在指定的对象
     */
    @Override
    public boolean contains(Object o) {
        Iterator<E> it = iterator();
        if (o == null) {
            while (it.hasNext())
                if (it.next() == null)
                    return true;
        } else {
            while (it.hasNext())
                // 当前迭代对象如果和o相等表示集合中包含指定元素，退出循环返回true
                if (o.equals(it.next()))
                    return true;
        }

        return false;
    }

    /**
     *  集合转数组的方法
     *
     * */
    @Override
    public Object[] toArray() {
        // 获取集合中元素的数量，用于创建数组
        Object[] r = new Object[size()];
        Iterator<E> it = iterator();
        for (int i = 0; i < r.length; i++) {
            if (!it.hasNext())
                return Arrays.copyOf(r, i);
        }

        return new Object[0];
    }

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
}

package com.jellybeanframework.core.utils;

import java.util.Collection;

/**
 * 集合工具类
 * @author zhangteng
 * @date 2019年12月21日 17:49:01
 */
public abstract class CollectionUtil {

    /**
     * 判断是不是空的集合
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection collection) {
        return (collection == null || collection.isEmpty());
    }
}

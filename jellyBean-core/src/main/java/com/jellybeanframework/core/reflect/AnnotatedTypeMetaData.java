package com.jellybeanframework.core.reflect;

/**
 * @author zhangteng
 * @date 2019年12月22日 16:18:56
 */
public interface AnnotatedTypeMetaData {

    /**
     * 获取方法名
     *
     * @return
     */
    String getMethodName();

    String getDeclaringClassName();
}

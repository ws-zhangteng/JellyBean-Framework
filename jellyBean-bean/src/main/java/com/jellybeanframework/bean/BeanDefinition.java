package com.jellybeanframework.bean;

/**
 * @author zhangteng
 * @date 2019年10月26日 21:07:08
 */
public class BeanDefinition<T> {
    /**
     *
     */
    Class<T> beanClass;

    /**
     * 名称
     */
    String name;

    /**
     * 接口类型
     */
    String interfaceClass;

    /**
     * 是否是抽象类
     */
    String isAbstract;
}

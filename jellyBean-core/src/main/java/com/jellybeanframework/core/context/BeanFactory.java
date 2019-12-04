package com.jellybeanframework.core.context;

import java.util.List;

/**
 * 定义bean工厂
 * @author zhangteng
 * @date 2019年12月4日 20:40:14
 */
public interface BeanFactory {

    /**
     * 根据类型和名称单个bean
     * @param name
     * @param classInfo
     * @param <T>
     * @return
     */
    <T> T getBean(String name, Class<T> classInfo);

    /**
     * 根据名称获取单个bean
     * @param beanName
     * @return
     */
    Object getBean(String beanName);



}

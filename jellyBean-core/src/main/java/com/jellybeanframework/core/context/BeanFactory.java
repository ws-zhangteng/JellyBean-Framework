package com.jellybeanframework.core.context;

/**
 * 定义bean工厂
 * @author zhangteng
 * @date 2019年12月4日 20:40:14
 */
public interface BeanFactory {

    /**
     * 根据类型单个bean
     * @param classInfo
     * @param <T>
     * @return
     */
    <T> T getBean(Class<T> classInfo);

    /**
     * 根据名称获取单个bean
     * @param beanName
     * @return
     */
    Object getBean(String beanName);

}

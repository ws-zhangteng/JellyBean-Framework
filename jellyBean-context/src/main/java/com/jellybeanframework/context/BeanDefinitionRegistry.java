package com.jellybeanframework.context;

import com.jellybeanframework.bean.BeanDefinition;

/**
 * Bean注册接口相关
 * @author zhangteng
 * @date 2019年12月4日 21:05:49
 */
public interface BeanDefinitionRegistry {

    /**
     * 注册beandefinition
     * @param name
     * @param beanDefinition
     */
    void registerBeanDefiniton(String name, BeanDefinition beanDefinition);

    /**
     * 判断是否存在该定义，通过名称判断
     * @param beanName
     * @return 判断结果
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 根据类型判断是否存在对应BEAN
     * @param requiredType
     * @return
     */
    boolean containsBeanDefinition(Class requiredType);

}

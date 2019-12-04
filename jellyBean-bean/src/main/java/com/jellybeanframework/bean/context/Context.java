package com.jellybeanframework.bean.context;

import com.jellybeanframework.bean.BeanDefinition;
import com.jellybeanframework.bean.annotation.Bean;

import java.util.Map;

/**
 * @author zhangteng
 * @date 2019年10月26日 21:05:21
 */
public abstract class Context {

    /**
     * 按照名称缓存Bean定义
     */
    Map<String, BeanDefinition> beanDefinitionCache;

    Map<Class, BeanDefinition> classCache;
    
}

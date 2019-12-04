package com.jellybeanframework.context;

import com.jellybeanframework.bean.BeanDefinition;
import com.jellybeanframework.core.context.BeanFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Administrator
 * @date 2019年12月4日 20:46:41
 */
public abstract class AbstractApplicationContext implements BeanFactory, BeanDefinitionRegistry {

    /**
     * 这个是按照名称/beandefinition组成的映射缓存
     */
    private static Map<String, BeanDefinition> definitionMap = new ConcurrentHashMap<>();

    /**
     * 这个是用class和beandefinition之间获取的对应关系
     */
    private static Map<Class, BeanDefinition> classBeanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 根据名称获取对应的beanDefinition
     * @param name
     * @return
     */
    public BeanDefinition getBeanDefinitionByName(String name) {
        return definitionMap.get(name);
    }

    @Override
    public <T> T getBean(String name, Class<T> classInfo) {
        return null;
    }

    @Override
    public Object getBean(String beanName) {
        return null;
    }

    @Override
    public void registerBeanDefiniton(String name, BeanDefinition beanDefinition) {
        definitionMap.put(name, beanDefinition);
        classBeanDefinitionMap.put(beanDefinition.getClass(), beanDefinition);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return definitionMap.get(beanName) == null;
    }

    @Override
    public boolean containsBeanDefinition(Class requiredType) {
        return classBeanDefinitionMap.get(requiredType) == null;
    }
}

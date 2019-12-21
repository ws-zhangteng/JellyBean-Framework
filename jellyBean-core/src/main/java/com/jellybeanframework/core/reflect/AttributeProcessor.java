package com.jellybeanframework.core.reflect;

/**
 * 属性处理器，用以从对象中获取属性并处理属性
 * @author zhangteng
 * @date 2019年12月21日 16:46:21
 */
public interface AttributeProcessor {

    /**
     * 获得属性
     * @param name
     * @return
     */
    Object getAttribute(String name);

    /**
     * 移除属性
     * @param attributeName
     */
    void removeAttribute(String attributeName);

    /**
     * 添加属性
     * @param attributeName
     * @param attributeValue
     */
    void addAttribute(String attributeName, Object attributeValue);

}

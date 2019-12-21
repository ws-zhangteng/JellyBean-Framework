package com.jellybeanframework.core.reflect;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

/**
 * 注解原始数据
 * @author creatation
 * @date 2019年12月8日 21:21:56
 */
public interface AnnotationMetaData {

    /**
     * 获取全部属性
     * @param annotation
     * @return
     */
    Map<String, Object> getAnnotationMetaDatas(Annotation annotation);

    /**
     * 根据属性获取注解值
     * @param annotation
     * @param key
     * @return
     */
    Object getAnnotationMetaData(Annotation annotation, String key);
}

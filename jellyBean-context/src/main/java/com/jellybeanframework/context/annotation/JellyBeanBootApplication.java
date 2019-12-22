package com.jellybeanframework.context.annotation;

import java.lang.annotation.*;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JellyBeanBootApplication {
    /**
     * 默认包扫描路径
     * @return
     */
    String[] basePackages();
}

package com.jellybeanframework.context.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 包扫描注解
 * @author zhangteng
 * @date 2019年12月4日 20:37:00
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ComponentScan {

    String basePackages();
}

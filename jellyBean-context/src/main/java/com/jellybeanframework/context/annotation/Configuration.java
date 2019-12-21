package com.jellybeanframework.context.annotation;

import com.jellybeanframework.bean.annotation.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 配置类注解
 * @author zhangteng
 * @date 2019年12月4日 21:16:01
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface Configuration {
}

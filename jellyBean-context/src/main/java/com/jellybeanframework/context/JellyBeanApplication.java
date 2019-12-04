package com.jellybeanframework.context;

import com.jellybeanframework.core.annotation.ComponentScan;

import java.lang.annotation.Annotation;

/**
 * JellyBean项目启动类
 * @author zhangteng
 * @date 2019年12月4日 21:01:13
 */

public class JellyBeanApplication {

    /**
     * 当前程序主入口
     * @param entranceClass
     * @param args
     */
    public void run(Class entranceClass, String... args) {
        Annotation annotation = entranceClass.getAnnotation(ComponentScan.class);
    }

    public void doScan(String basePackages) {}
}

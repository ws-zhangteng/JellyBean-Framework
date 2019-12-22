package com.jellybeanframework.core.reflect;

/**
 * 类基础属性
 * @author zhangteng
 * @date 2019年12月22日 15:43:13
 */
public interface ClassMetaData {

    /**
     * 返回对应的类名称
     * @return
     */
    String getClassName();

    /**
     * 判断是不是接口
     * @return
     */
    boolean isInferface();

    /**
     * 判断是不是Final类
     * @return
     */
    boolean isFinal();

    /**
     * 判断是不是抽象类
     * @return
     */
    boolean isAbstract();

    /**
     * 获取class的实现接口
     * @return
     */
    String[] getInterfaces();

    /**
     * 判断是否含有父类
     * @return
     */
    boolean hasSuperClass();

    /**
     * 获取
     * @return
     */
    String getSuperClassName();
}

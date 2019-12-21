package com.jellybeanframework.core;

import com.jellybeanframework.core.utils.AssertUtil;
import com.sun.istack.internal.NotNull;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 这里是仿照spring的装饰类
 * @author zhangteng
 * @date 2019年12月21日 17:27:51
 */
public abstract class DecoratingClassLoader extends ClassLoader {

    static {
        ClassLoader.registerAsParallelCapable();
    }

    /**
     * 排除目录
     */
    private final Set<String> excludePackages = Collections.newSetFromMap(new ConcurrentHashMap<>(8));

    /**
     * 包括目录
     */
    private final Set<String> excludedClasses = Collections.newSetFromMap(new ConcurrentHashMap<>(8));


    public DecoratingClassLoader() {

    }

    public DecoratingClassLoader(@NotNull ClassLoader classLoader) {
        super(classLoader);
    }

    /**
     * 添加新的排除目录
     * @param packageName
     */
    public void addExcludePackage(String packageName) {
        AssertUtil.notNull(packageName, "%s cannot be empty when add a new exclude path!");
        excludePackages.add(packageName);
    }

    /**
     * 添加新的排除加载类
     * @param packageName
     */
    public void addExcludeClasses(String packageName) {
        AssertUtil.notNull(packageName, "%s cannot be empty when add a new include path");
        excludedClasses.add(packageName);
    }

    protected boolean isExcluded(String className) {
        if (this.excludedClasses.contains(className)) {
            return true;
        }
        for (String packageName : this.excludePackages) {
            if (className.startsWith(packageName)) {
                return true;
            }
        }
        return false;
    }
}

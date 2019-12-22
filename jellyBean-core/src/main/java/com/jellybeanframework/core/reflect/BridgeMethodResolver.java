package com.jellybeanframework.core.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 桥接方法判断器
 * @author zhangteng
 * @date 2019年12月22日 18:54:44
 */
public class BridgeMethodResolver {

    private static Map<Method, Method> cache = new ConcurrentHashMap<>();

    /**
     *
     * @param method
     * @return
     */
    public static Method findBridgeMethod(Method method) {
        if (!method.isBridge()) {
            return method;
        }

        Method bridgeMethod = cache.get(method);
        if (bridgeMethod == null) {
            List<Method> candidateMethod = new ArrayList<>();

        }
        return null;
    }

}

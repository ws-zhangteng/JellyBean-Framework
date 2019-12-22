package com.jellybeanframework.core.utils;

import com.jellybeanframework.core.lang.Nullable;

import java.util.function.Supplier;

/**
 * 断言工具类
 * @author zhangteng
 * @date 2019年12月21日 17:33:00
 */
public abstract class AssertUtil {

    /**
     * 根据String类型的参数名称和描述组装异常
     * @param paramName
     * @param describe
     */
    public static void notNull(String paramName, String describe) {
        if (StringUtil.isEmpty(paramName)) {
            throw new IllegalArgumentException(String.format(describe, paramName));
        }
    }

    /**
     * 根据Object类型的参数名称和
     * @param object
     * @param describe
     */
    public static void notNull(Object object, String describe) {
        if (object == null) {
            throw new IllegalArgumentException(String.format(describe, object.toString()));
        }
    }

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isTrue(boolean expression, Supplier<String> messageSupplier) {
        if (!expression) {
            throw new IllegalArgumentException(nullSafeGet(messageSupplier));
        }
    }

    @Nullable
    private static String nullSafeGet(@Nullable Supplier<String> messageSupplier) {
        return (messageSupplier != null ? messageSupplier.get() : null);
    }


}

package com.jellybeanframework.core.lang;

import javax.annotation.meta.TypeQualifierNickname;
import java.lang.annotation.*;

/**
 * @author zhangteng
 * @date 2019年12月21日 18:16:13
 */
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@javax.annotation.Nonnull
@TypeQualifierNickname
public @interface NonNull {
}

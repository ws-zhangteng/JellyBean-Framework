package com.jellybeanframework.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

/**
 * 组合注解
 * @author zhangteng
 * @date 2019年12月22日 21:58:22
 */
public interface MergedAnnotations extends Iterable<MergedAnnotation<Annotation>> {

    enum SearchStrategy {

        /**
         * Find only directly declared annotations, without considering
         * {@link Inherited @Inherited} annotations and without searching
         * superclasses or implemented interfaces.
         */
        DIRECT,

        /**
         * Find all directly declared annotations as well as any
         * {@link Inherited @Inherited} superclass annotations. This strategy
         * is only really useful when used with {@link Class} types since the
         * {@link Inherited @Inherited} annotation is ignored for all other
         * {@linkplain AnnotatedElement annotated elements}. This strategy does
         * not search implemented interfaces.
         */
        INHERITED_ANNOTATIONS,

        /**
         * Find all directly declared and superclass annotations. This strategy
         * is similar to {@link #INHERITED_ANNOTATIONS} except the annotations
         * do not need to be meta-annotated with {@link Inherited @Inherited}.
         * This strategy does not search implemented interfaces.
         */
        SUPERCLASS,

        /**
         * Perform a full search of the entire type hierarchy, including
         * superclasses and implemented interfaces. Superclass annotations do
         * not need to be meta-annotated with {@link Inherited @Inherited}.
         */
        TYPE_HIERARCHY,

        /**
         * Perform a full search of the entire type hierarchy on the source
         * <em>and</em> any enclosing classes. This strategy is similar to
         * {@link #TYPE_HIERARCHY} except that {@linkplain Class#getEnclosingClass()
         * enclosing classes} are also searched. Superclass annotations do not
         * need to be meta-annotated with {@link Inherited @Inherited}. When
         * searching a {@link Method} source, this strategy is identical to
         * {@link #TYPE_HIERARCHY}.
         */
        TYPE_HIERARCHY_AND_ENCLOSING_CLASSES
    }

}

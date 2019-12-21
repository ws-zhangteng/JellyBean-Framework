package com.jellybeanframework.core.reflect;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

import java.io.IOException;

/**
 * 类信息读取
 * @author creatation
 * @date 2019年12月8日 20:42:43
 */
public class ClassInfoReader {

    /**
     * 获取注解原始数据
     * @param className
     * @return
     */
    public static AnnotationMetaData getClassAnnotation(String className) {
        try {
            ClassReader classReader = new ClassReader(className);
            AnnotationVisitor annotationVisitor
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

package com.jellybeanframework.core;

import com.jellybeanframework.core.lang.Nullable;
import com.jellybeanframework.core.utils.FileCopyUtil;

import java.io.IOException;
import java.io.InputStream;

/**
 * 本项目的核心类加载器
 * 整个项目都在抄spring,哈哈哈哈
 * @author zhangteng
 * @date 2019年12月21日 18:26:38
 */
public class OverridingClassLoader extends DecoratingClassLoader {

    private static final String[] DEFAULT_EXCLUDE_PACKAGES = new String[]
            {"java.", "javax.", "sun.", "oracle.", "javassist.", "org.aspectj.", "net.sf.cglib."};

    private static final String CLASS_FILE_SUFFIX = ".class";

    @Nullable
    private final ClassLoader overrideDelegate;

    /**
     * Create a new OverridingClassLoader for the given ClassLoader.
     * @param parent the ClassLoader to build an overriding ClassLoader for
     */
    public OverridingClassLoader(@Nullable ClassLoader parent) {
        this(parent, null);
    }

    /**
     * Create a new OverridingClassLoader for the given ClassLoader.
     * @param parent the ClassLoader to build an overriding ClassLoader for
     * @param overrideDelegate the ClassLoader to delegate to for overriding
     * @since 4.3
     */
    public OverridingClassLoader(@Nullable ClassLoader parent, @Nullable ClassLoader overrideDelegate) {
        super(parent);
        this.overrideDelegate = overrideDelegate;
        for (String packageName : DEFAULT_EXCLUDE_PACKAGES) {
            addExcludePackage(packageName);
        }
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        return super.loadClass(name);
    }

    @Override
    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        return super.loadClass(name, resolve);
    }

    @Nullable
    protected byte[] loadBytesForClass(String name) throws ClassNotFoundException {
        InputStream is = openStreamForClass(name);
        if (is == null) {
            return null;
        }
        try {
            // Load the raw bytes.
            byte[] bytes = FileCopyUtil.copyToByteArray(is);
            // Transform if necessary and use the potentially transformed bytes.
            return transformIfNecessary(name, bytes);
        }
        catch (IOException ex) {
            throw new ClassNotFoundException("Cannot load resource for class [" + name + "]", ex);
        }
    }

    @Nullable
    protected InputStream openStreamForClass(String name) {
        String internalName = name.replace('.', '/') + CLASS_FILE_SUFFIX;
        return getParent().getResourceAsStream(internalName);
    }

    protected byte[] transformIfNecessary(String name, byte[] bytes) {
        return bytes;
    }

}

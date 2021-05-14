package com.jellybeanframework.core.utils;

import com.jellybeanframework.core.lang.Nullable;

import java.io.*;
import java.nio.file.Files;

/**
 * 文件复制工具类
 * @author zhangteng
 * @date 2019年12月22日 00:48:35
 */
public abstract class FileCopyUtil {

    private static int BUFFER_SIZE = 4096;

    public static byte[] copyToByteArray(@Nullable InputStream in) throws IOException {
        if (in == null) {
            return new byte[0];
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream(BUFFER_SIZE);
        copy(in, out);
        return out.toByteArray();
    }

    public static int copy(File in, File out) throws IOException {
        AssertUtil.notNull(in, "No input File specified");
        AssertUtil.notNull(out, "No output File specified");
        return copy(Files.newInputStream(in.toPath()), Files.newOutputStream(out.toPath()));
    }

    public static int copy(Reader in, Writer out) throws IOException {
        AssertUtil.notNull(in, "No Reader specified");
        AssertUtil.notNull(out, "No Writer specified");

        try {
            int byteCount = 0;
            char[] buffer = new char[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                byteCount += bytesRead;
            }
            out.flush();
            return byteCount;
        }
        finally {
            try {
                in.close();
            }
            catch (IOException ex) {
            }
            try {
                out.close();
            }
            catch (IOException ex) {
            }
        }
    }

    public static int copy(InputStream in, OutputStream out) throws IOException {
        AssertUtil.notNull(in, "No InputStream specified");
        AssertUtil.notNull(out, "No OutputStream specified");

        try {
            return StreamUtil.copy(in, out);
        }
        finally {
            try {
                in.close();
            }
            catch (IOException ex) {
            }
            try {
                out.close();
            }
            catch (IOException ignored) {
            }
        }
    }

    /**
     * Copy the contents of the given String to the given output Writer.
     * Closes the writer when done.
     * @param in the String to copy from
     * @param out the Writer to copy to
     * @throws IOException in case of I/O errors
     */
    public static void copy(String in, Writer out) throws IOException {
        AssertUtil.notNull(in, "No input String specified");
        AssertUtil.notNull(out, "No Writer specified");

        try {
            out.write(in);
        }
        finally {
            try {
                out.close();
            }
            catch (IOException ex) {
            }
        }
    }

}

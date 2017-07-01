package com.example.sanqian.android_memcpy_test;

/**
 * Created by sanqian on 01/07/2017.
 */
public class ByteUtil {
    static {
        System.loadLibrary("android_memcpy_test");
    }

    public static native String getMsgFromJni();

    public static native byte[] copyByteArray(long handle, int length);

    public static native long saveByteArray(byte[] data, int length);

    public static native String getByteArrayAsString(long handle, int length);
}

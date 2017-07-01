package com.example.sanqian.android_memcpy_test;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.SmallTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ByteUtilTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.sanqian.android_memcpy_test", appContext.getPackageName());
    }

    @Test
    public void saveByteArray() {
        int length = 8;
        byte[] data = new byte[length];
        for (int i = 0; i < length; i++) {
            data[i] = (byte) i;
        }
        long handle = ByteUtil.saveByteArray(data, length);
        System.out.println("handle: " + handle);

        byte[] bytes = ByteUtil.copyByteArray(handle, length);
        for(int i=0; i<length; i++) {
            System.out.println(data[i] + "-" + bytes[i]);
        }

    }
}

#include <jni.h>
#include <dirent.h>
#include <stdlib.h>
#include <android/log.h>

//#define TAG    "ByteUtil" // 这个是自定义的LOG的标识
//#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG,TAG ,__VA_ARGS__) // 定义LOGD类型

JNIEXPORT jstring JNICALL
Java_com_example_sanqian_android_1memcpy_1test_ByteUtil_getMsgFromJni(JNIEnv *env, jclass type) {

    // TODO


    return (*env)->NewStringUTF(env, "Hello from JNI");
}

JNIEXPORT jbyteArray JNICALL
Java_com_example_sanqian_android_1memcpy_1test_ByteUtil_copyByteArray(JNIEnv *env, jclass type,
                                                                      jint srcHandle, jint length) {

    jbyteArray dstData = (*env)->NewByteArray(env, length);
    (*env)->SetByteArrayRegion(env, dstData, 0, length, (void *)srcHandle);
    return dstData;

}

JNIEXPORT jint JNICALL
Java_com_example_sanqian_android_1memcpy_1test_ByteUtil_saveByteArray(JNIEnv *env, jclass type,
                                                                      jbyteArray data_, jint length) {
    int size = length * sizeof(jbyte);
    void *handle = malloc(size);
    if (handle != NULL) {
        (*env)->GetByteArrayRegion(env, data_, 0, length, handle);
    }
    return (jint) handle;
}

JNIEXPORT jstring JNICALL
Java_com_example_sanqian_android_1memcpy_1test_ByteUtil_getByteArrayAsString(JNIEnv *env,
                                                                             jclass type,
                                                                             jint handle,
                                                                             jint length) {

    // TODO


    return (*env)->NewStringUTF(env, "hello");
}
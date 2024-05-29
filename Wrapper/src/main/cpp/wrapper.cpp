#include <jni.h>

extern "C"
JNIEXPORT jint JNICALL
Java_com_test_nativelib_JNIWrapper_stringFromJNI(JNIEnv *env, jobject thiz, jint value) {
    int result = value * 2;
    return result;
}
#include <cstring>
#include <jni.h>
#include <cinttypes>
#include <number-utils.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_warrocker_ndksample_MainActivity_numberFromLibrary(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF(std::to_string(GetNumber()).c_str());
}

#include <string.h>
#include <jni.h>
#include <malloc.h>

char *strrev(char *str);

//This method just reverse a string but you can do what do you want
jstring
Java_com_warrocker_ndksample_MainActivity_encodeString(JNIEnv *env, jobject thiz, jstring input) {

    const char *c_str;
    c_str = (*env)->GetStringUTFChars(env, input, NULL);
    if (c_str == NULL) {
        return NULL;
    }
    char *s = strrev(strdup(c_str));
    (*env)->ReleaseStringUTFChars(env, input, c_str);
    jstring output = (*env)->NewStringUTF(env, s);
    free(s);
    return output;
}

char *strrev(char *str) {
    char *p1, *p2;

    if (!str || !*str)
        return str;
    for (p1 = str, p2 = str + strlen(str) - 1; p2 > p1; ++p1, --p2) {
        *p1 ^= *p2;
        *p2 ^= *p1;
        *p1 ^= *p2;
    }
    return str;
}

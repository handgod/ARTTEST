/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class com_example_testar_MainActivity */

#ifndef _Included_com_example_testar_MainActivity
#define _Included_com_example_testar_MainActivity
#ifdef __cplusplus
extern "C" {
#endif

  /*
 * Class:     com_example_testar_InjectClassloader
 * Method:    hookMethodNative
 * Signature: (Ljava/lang/reflect/Method;Ljava/lang/Class;I)V
 */
JNIEXPORT void JNICALL Java_com_example_testar_InjectClassloader_hookMethodNative
  (JNIEnv *, jobject, jobject, jclass, jint);
  
JNIEXPORT jstring JNICALL test(JNIEnv *env, jclass clazz) ;

#ifdef __cplusplus
}
#endif
#endif
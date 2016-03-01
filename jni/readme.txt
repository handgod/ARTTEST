环境搭建：
1)Eclipse for Java ,Version: Mars.2 Release (4.5.2)
2)ADT-23.0.6.zip
3)android-ndk-r10e + cygwin,并设置路径
4)SDK android api 19.
使用方法：
1)编译完后，Run as Application
2)双击jni/run.bat
思路分析：
1)运行一个com.example.testar进程作为目标。
2)通过运行inject ,将libso.so注入com.example.testar进程中，在libTest.so中修改注入的方法。

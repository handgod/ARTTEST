�������
1)Eclipse for Java ,Version: Mars.2 Release (4.5.2)
2)ADT-23.0.6.zip
3)android-ndk-r10e + cygwin,������·��
4)SDK android api 19.
ʹ�÷�����
1)�������Run as Application
2)˫��jni/run.bat
˼·������
1)����һ��com.example.testar������ΪĿ�ꡣ
2)ͨ������inject ,��libso.soע��com.example.testar�����У���libTest.so���޸�ע��ķ�����
����native method�Ĳο����£�
http://blog.csdn.net/yinyhy/article/details/9858413

NDK��������С�᣺
1)����Android Project.
2)��������Native ���������ֺͲ�������build apk,����class�ļ�����classĿ¼����srcĿ¼ͨ��javah����jniͷ�ļ���
3)����native support,����jni�ļ��У�����javah���ɵ�jniͷ�ļ�������jni�ļ��У�
4)����ͷ�ļ���Ӧ�ĺ���������дAndroid.mk��Application.mk�����ļ�ʵ�ֱ��롣
5)��Eclipse��Builder������ndk-build NDK_DEBUG=1,����AndroidManifest.xml�е�Debuggabe�޸�Ϊtrue;
6)��ʼ��̬����c/C++���롣
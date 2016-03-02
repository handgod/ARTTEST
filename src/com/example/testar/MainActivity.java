package com.example.testar;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import dalvik.system.DexClassLoader;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.text.GetChars;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import cn.trinea.android.common.util.*;
public class MainActivity extends Activity {
	private final Map<String, ClassLoader> mLoaders = new HashMap<String, ClassLoader>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn = (Button) findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {
				// TODO Auto-generated method stub
				WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
				WifiInfo info = wifi.getConnectionInfo();
				System.out.println("wqm Wifi real mac :" + info.getMacAddress());
				InjectApplication ia = (InjectApplication) getApplication();
				System.out.println(ia.test());
			}
		});
		
		Button btn2 = (Button) findViewById(R.id.button2);
		btn2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
			 System.out.println("wqm injecting.....");
			 ShellUtils.execCommand("su", false);
//			 System.out.println("wqm injecting:"+stringFromJNI());
			 stringFromJNI();
			}
		});
		
		Button btn3 = (Button) findViewById(R.id.button3);
		btn3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
				WifiInfo info = wifi.getConnectionInfo();
				System.out.println("wqm Wifi mac after inject:" + info.getMacAddress());
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private String test() {
		return "real";
	}
	
	public native String  stringFromJNI();
	
	static {
        System.loadLibrary("hello-jni");
    }
}

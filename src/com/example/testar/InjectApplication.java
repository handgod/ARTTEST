package com.example.testar;

import java.lang.reflect.Method;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

public class InjectApplication extends Application {
	static {
		System.loadLibrary("so");
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.d("wqm", test());
		super.onCreate();
	}

	public native String test();
}

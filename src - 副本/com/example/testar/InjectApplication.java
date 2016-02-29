package com.example.testar;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import android.app.Application;
import android.util.Log;

public class InjectApplication extends Application {
	static {

	}

	private void injectLoader() {
		try {
			System.out.println("Inject loader");
			ClassLoader ldr = this.getClassLoader();// findLoaderObject();
			Log.i("findLoaderObject", ldr.toString());
			Field[] fieldS = Class.forName("java.lang.ClassLoader").getDeclaredFields();
			for (Field field : fieldS) {
				Log.i("field of PathclassLoader", field.getName());
				if (field.getName().endsWith("parent")) {
					System.out.println("parent");
					field.set(ldr, new InjectClassloader());
				}
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static ClassLoader findLoaderObject() {
		try {
			Class cCl = Class.forName("java.lang.ClassLoader");
			Class[] cls = cCl.getDeclaredClasses();
			for (int i = 0; i < cls.length; i++) {
				if (cls[i].getName().endsWith("SystemClassLoader")) {
					System.out.println("SystemClassLoader");
					return (ClassLoader) cls[i].getDeclaredField("loader").get(null);
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		injectLoader();
		super.onCreate();
	}
}

package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f10627a;

    /* renamed from: com.apm.insight.h.a$a  reason: collision with other inner class name */
    public static class C0099a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends T> f10628a;

        /* renamed from: b  reason: collision with root package name */
        public final T f10629b;
    }

    static {
        HashMap hashMap = new HashMap();
        f10627a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f10627a.put(Byte.class, Byte.TYPE);
        f10627a.put(Character.class, Character.TYPE);
        f10627a.put(Short.class, Short.TYPE);
        f10627a.put(Integer.class, Integer.TYPE);
        f10627a.put(Float.class, Float.TYPE);
        f10627a.put(Long.class, Long.TYPE);
        f10627a.put(Double.class, Double.TYPE);
        f10627a.put(Boolean.TYPE, Boolean.TYPE);
        f10627a.put(Byte.TYPE, Byte.TYPE);
        f10627a.put(Character.TYPE, Character.TYPE);
        f10627a.put(Short.TYPE, Short.TYPE);
        f10627a.put(Integer.TYPE, Integer.TYPE);
        f10627a.put(Float.TYPE, Float.TYPE);
        f10627a.put(Long.TYPE, Long.TYPE);
        f10627a.put(Double.TYPE, Double.TYPE);
    }

    public static <T> T a(Class<?> cls, String str, Object... objArr) {
        return a(cls, str, (Class<?>[]) a(objArr)).invoke((Object) null, b(objArr));
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        try {
            return a(Class.forName(str), str2, objArr);
        } catch (Exception e2) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e2);
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a2 = a(cls.getDeclaredMethods(), str, clsArr);
        if (a2 != null) {
            a2.setAccessible(true);
            return a2;
        } else if (cls.getSuperclass() != null) {
            return a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f10627a.containsKey(clsArr[i]) || !f10627a.get(clsArr[i]).equals(f10627a.get(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C0099a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C0099a)) {
                clsArr[i] = aVar == null ? null : aVar.getClass();
            } else {
                clsArr[i] = aVar.f10628a;
            }
        }
        return clsArr;
    }

    private static Object[] b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C0099a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C0099a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f10629b;
            }
        }
        return objArr2;
    }
}

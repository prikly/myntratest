package com.criteo.publisher.n0;

import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: ReflectionUtil */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static final g f2902a = h.b(p.class);

    public static boolean b(Object obj, String str) {
        try {
            return Class.forName(str, false, p.class.getClassLoader()).isAssignableFrom(obj.getClass());
        } catch (ClassNotFoundException | LinkageError e2) {
            f2902a.a("Failed to load class by name to check if instanceof", e2);
            return false;
        }
    }

    public static Object a(Object obj, String str, Object... objArr) {
        try {
            int length = objArr.length;
            Class[] clsArr = new Class[length];
            for (int i = 0; i < length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
            return obj.getClass().getMethod(str, clsArr).invoke(obj, objArr);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            g gVar = f2902a;
            gVar.a("Failed to call " + str, e2);
            return null;
        }
    }

    public static Object a(Object obj, String str) {
        try {
            return obj.getClass().getField(str).get(obj);
        } catch (Exception e2) {
            g gVar = f2902a;
            gVar.a("Failed to get field " + str, (Throwable) e2);
            return null;
        }
    }

    public static void a(Object obj, String str, Object obj2) {
        Field field;
        g gVar;
        StringBuilder sb;
        Field field2 = null;
        try {
            Field field3 = obj.getClass().getField(str);
            try {
                field2 = field3.getClass().getDeclaredField("accessFlags");
                field2.setAccessible(true);
                field2.set(field3, Integer.valueOf(field3.getModifiers() & -17));
                field3.set(obj, obj2);
                if (field3 != null && field2 != null) {
                    try {
                        field2.set(field3, Integer.valueOf(field3.getModifiers() | 16));
                        field2.setAccessible(false);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        gVar = f2902a;
                        sb = new StringBuilder();
                    }
                } else {
                    return;
                }
            } catch (Exception e3) {
                e = e3;
                field = field2;
                field2 = field3;
                try {
                    f2902a.a("Failed to set field " + str, (Throwable) e);
                    if (field2 != null) {
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (!(field2 == null || field == null)) {
                        try {
                            field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
                            field.setAccessible(false);
                        } catch (Exception e4) {
                            f2902a.a("Failed to reset field to private final " + str, (Throwable) e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                field = field2;
                field2 = field3;
                field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
                field.setAccessible(false);
                throw th;
            }
            sb.append("Failed to reset field to private final ");
            sb.append(str);
            gVar.a(sb.toString(), (Throwable) e);
        } catch (Exception e5) {
            e = e5;
            field = null;
            f2902a.a("Failed to set field " + str, (Throwable) e);
            if (field2 != null && field != null) {
                try {
                    field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
                    field.setAccessible(false);
                } catch (Exception e6) {
                    e = e6;
                    gVar = f2902a;
                    sb = new StringBuilder();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            field = null;
            field.set(field2, Integer.valueOf(field2.getModifiers() | 16));
            field.setAccessible(false);
            throw th;
        }
    }
}

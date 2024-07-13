package com.bytedance.sdk.openadsdk.c;

import android.util.SparseArray;
import com.bytedance.sdk.component.utils.l;
import java.lang.reflect.Method;

/* compiled from: BaseHook */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<Method> f419a;

    /* renamed from: b  reason: collision with root package name */
    private Object f420b;

    public abstract String a();

    public <T> T a(int i, Object... objArr) {
        Object obj;
        Method method = this.f419a.get(i);
        if (method == null || (obj = this.f420b) == null) {
            String a2 = a();
            l.d(a2, "call method " + i + " failed for null ");
            return null;
        }
        try {
            if (obj instanceof Class) {
                return method.invoke((Object) null, objArr);
            }
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            String a3 = a();
            l.d(a3, "call method " + i + " failed: " + th.getMessage());
            return null;
        }
    }
}

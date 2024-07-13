package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.yk  reason: case insensitive filesystem */
abstract class C0852yk<T> {

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f7178a;

    /* renamed from: b  reason: collision with root package name */
    private final C0780vk f7179b;

    C0852yk(T t, C0780vk vkVar) {
        this.f7178a = c(t);
        this.f7179b = vkVar;
    }

    private List<Object> c(T t) {
        Pattern pattern;
        Pattern pattern2;
        ArrayList arrayList = new ArrayList();
        if (t == null) {
            return arrayList;
        }
        int b2 = b(t);
        List<C0877zl> a2 = a(t);
        arrayList.add(new Zk(b2));
        for (C0877zl next : a2) {
            int ordinal = next.f7237a.ordinal();
            Object obj = null;
            if (ordinal == 0) {
                obj = new C0732tk(next.f7238b);
            } else if (ordinal == 1) {
                obj = new C0487jk(next.f7238b);
            } else if (ordinal == 2) {
                try {
                    pattern = Pattern.compile(next.f7238b);
                } catch (Throwable unused) {
                    pattern = null;
                }
                if (pattern != null) {
                    obj = new Nk(pattern);
                }
            } else if (ordinal == 3) {
                try {
                    pattern2 = Pattern.compile(next.f7238b);
                } catch (Throwable unused2) {
                    pattern2 = null;
                }
                if (pattern2 != null) {
                    obj = new C0612ok(pattern2);
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return A2.c(arrayList);
    }

    /* access modifiers changed from: package-private */
    public C0780vk a() {
        return this.f7179b;
    }

    /* access modifiers changed from: package-private */
    public abstract List<C0877zl> a(T t);

    /* access modifiers changed from: package-private */
    public abstract int b(T t);

    /* access modifiers changed from: package-private */
    public List<Object> b() {
        return this.f7178a;
    }

    /* access modifiers changed from: package-private */
    public void d(T t) {
        this.f7179b.a();
        this.f7178a = c(t);
    }
}

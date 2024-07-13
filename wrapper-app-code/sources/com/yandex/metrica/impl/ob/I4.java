package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class I4 extends K4<X4> {

    /* renamed from: a  reason: collision with root package name */
    private final E5 f4127a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<C0244a1, C0813x5<X4>> f4128b = a();

    /* renamed from: c  reason: collision with root package name */
    private C0717t5<X4> f4129c;

    public I4(L3 l3) {
        E5 e5 = new E5(l3);
        this.f4127a = e5;
        this.f4129c = new C0717t5(e5);
    }

    private HashMap<C0244a1, C0813x5<X4>> a() {
        HashMap<C0244a1, C0813x5<X4>> hashMap = new HashMap<>();
        hashMap.put(C0244a1.EVENT_TYPE_ACTIVATION, new C0693s5(this.f4127a));
        hashMap.put(C0244a1.EVENT_TYPE_START, new H5(this.f4127a));
        hashMap.put(C0244a1.EVENT_TYPE_REGULAR, new B5(this.f4127a));
        C0861z5 z5Var = new C0861z5(this.f4127a);
        hashMap.put(C0244a1.EVENT_TYPE_EXCEPTION_USER, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_SEND_REFERRER, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_STATBOX, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_CUSTOM_EVENT, z5Var);
        C0244a1 a1Var = C0244a1.EVENT_TYPE_SET_SESSION_EXTRA;
        E5 e5 = this.f4127a;
        hashMap.put(a1Var, new G5(e5, e5.u()));
        hashMap.put(C0244a1.EVENT_TYPE_APP_OPEN, new D5(this.f4127a));
        hashMap.put(C0244a1.EVENT_TYPE_PURGE_BUFFER, new A5(this.f4127a));
        C0244a1 a1Var2 = C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        E5 e52 = this.f4127a;
        hashMap.put(a1Var2, new G5(e52, e52.l()));
        C0244a1 a1Var3 = C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        E5 e53 = this.f4127a;
        hashMap.put(a1Var3, new G5(e53, e53.l()));
        hashMap.put(C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, new C0789w5(this.f4127a));
        hashMap.put(C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C0789w5(this.f4127a));
        hashMap.put(C0244a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, new C0765v5(this.f4127a));
        C0244a1 a1Var4 = C0244a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        E5 e54 = this.f4127a;
        hashMap.put(a1Var4, new G5(e54, e54.l()));
        hashMap.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new J5(this.f4127a));
        I5 i5 = new I5(this.f4127a);
        hashMap.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED, i5);
        hashMap.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, i5);
        hashMap.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, i5);
        hashMap.put(C0244a1.EVENT_TYPE_ANR, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_IDENTITY, new C0837y5(this.f4127a));
        hashMap.put(C0244a1.EVENT_TYPE_SET_USER_INFO, new F5(this.f4127a));
        C0244a1 a1Var5 = C0244a1.EVENT_TYPE_REPORT_USER_INFO;
        E5 e55 = this.f4127a;
        hashMap.put(a1Var5, new G5(e55, e55.o()));
        C0244a1 a1Var6 = C0244a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        E5 e56 = this.f4127a;
        hashMap.put(a1Var6, new G5(e56, e56.d()));
        C0244a1 a1Var7 = C0244a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        E5 e57 = this.f4127a;
        hashMap.put(a1Var7, new G5(e57, e57.c()));
        hashMap.put(C0244a1.EVENT_TYPE_SEND_USER_PROFILE, z5Var);
        C0244a1 a1Var8 = C0244a1.EVENT_TYPE_SET_USER_PROFILE_ID;
        E5 e58 = this.f4127a;
        hashMap.put(a1Var8, new G5(e58, e58.x()));
        hashMap.put(C0244a1.EVENT_TYPE_SEND_REVENUE_EVENT, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_SEND_AD_REVENUE_EVENT, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_IDENTITY_LIGHT, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_CLEANUP, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_VIEW_TREE, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_RAW_VIEW_TREE, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_SEND_ECOMMERCE_EVENT, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_STATBOX_EXP, z5Var);
        hashMap.put(C0244a1.EVENT_TYPE_WEBVIEW_SYNC, z5Var);
        return hashMap;
    }

    public E5 b() {
        return this.f4127a;
    }

    public void a(C0244a1 a1Var, C0813x5<X4> x5Var) {
        this.f4128b.put(a1Var, x5Var);
    }

    public H4<X4> a(int i) {
        LinkedList linkedList = new LinkedList();
        C0244a1 a2 = C0244a1.a(i);
        C0717t5<X4> t5Var = this.f4129c;
        if (t5Var != null) {
            t5Var.a(a2, linkedList);
        }
        C0813x5 x5Var = this.f4128b.get(a2);
        if (x5Var != null) {
            x5Var.a(linkedList);
        }
        return new H4<>(linkedList);
    }
}

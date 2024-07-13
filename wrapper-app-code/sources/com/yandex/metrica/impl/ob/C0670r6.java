package com.yandex.metrica.impl.ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.r6  reason: case insensitive filesystem */
public class C0670r6 {

    /* renamed from: c  reason: collision with root package name */
    private static SparseArray<C0670r6> f6685c;

    /* renamed from: a  reason: collision with root package name */
    public final String f6686a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6687b;

    static {
        SparseArray<C0670r6> sparseArray = new SparseArray<>();
        f6685c = sparseArray;
        sparseArray.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED.b(), new C0670r6("jvm", "binder"));
        f6685c.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), new C0670r6("jvm", "binder"));
        f6685c.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b(), new C0670r6("jvm", "intent"));
        f6685c.put(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), new C0670r6("jvm", "file"));
        f6685c.put(C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH.b(), new C0670r6("jni_native", "file"));
        f6685c.put(C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF.b(), new C0670r6("jni_native", "file"));
        f6685c.put(C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH.b(), new C0670r6("jni_native", "file"));
        f6685c.put(C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF.b(), new C0670r6("jni_native", "file"));
        f6685c.put(C0244a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF.b(), new C0670r6("jni_native", "file"));
        f6685c.put(C0244a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF.b(), new C0670r6("jni_native", "binder"));
    }

    private C0670r6(String str, String str2) {
        this.f6686a = str;
        this.f6687b = str2;
    }

    public static C0670r6 a(int i) {
        return f6685c.get(i);
    }
}

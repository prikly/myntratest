package com.yandex.metrica.impl.ob;

import com.appodeal.ads.modules.common.internal.LogConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.z0  reason: case insensitive filesystem */
public final class C0856z0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<Integer> f7197a;

    /* renamed from: b  reason: collision with root package name */
    private static final EnumSet<C0244a1> f7198b;

    /* renamed from: c  reason: collision with root package name */
    private static final EnumSet<C0244a1> f7199c;

    /* renamed from: d  reason: collision with root package name */
    private static final EnumSet<C0244a1> f7200d;

    /* renamed from: e  reason: collision with root package name */
    private static final EnumSet<C0244a1> f7201e;

    /* renamed from: f  reason: collision with root package name */
    private static final EnumSet<C0244a1> f7202f = EnumSet.of(C0244a1.EVENT_TYPE_DIAGNOSTIC, C0244a1.EVENT_TYPE_DIAGNOSTIC_STATBOX, C0244a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING, C0244a1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS);

    /* renamed from: g  reason: collision with root package name */
    private static final EnumSet<C0244a1> f7203g;

    /* renamed from: h  reason: collision with root package name */
    private static final EnumSet<C0244a1> f7204h;
    public static final List<Integer> i;
    public static final List<Integer> j = Arrays.asList(new Integer[]{Integer.valueOf(C0244a1.EVENT_TYPE_CLEANUP.b())});

    static {
        Integer[] numArr = {Integer.valueOf(C0244a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF.b()), Integer.valueOf(C0244a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b()), Integer.valueOf(C0244a1.EVENT_TYPE_EXCEPTION_USER.b()), Integer.valueOf(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b()), Integer.valueOf(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b()), Integer.valueOf(C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT.b()), Integer.valueOf(C0244a1.EVENT_TYPE_ANR.b())};
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 7; i2++) {
            hashSet.add(numArr[i2]);
        }
        f7197a = Collections.unmodifiableSet(hashSet);
        C0244a1 a1Var = C0244a1.EVENT_TYPE_UNDEFINED;
        C0244a1 a1Var2 = C0244a1.EVENT_TYPE_SEND_REFERRER;
        C0244a1 a1Var3 = C0244a1.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C0244a1 a1Var4 = C0244a1.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C0244a1 a1Var5 = C0244a1.EVENT_TYPE_ACTIVATION;
        C0244a1 a1Var6 = C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH;
        C0244a1 a1Var7 = C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        C0244a1 a1Var8 = C0244a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF;
        f7198b = EnumSet.of(a1Var, new C0244a1[]{C0244a1.EVENT_TYPE_PURGE_BUFFER, a1Var2, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, a1Var8, C0244a1.EVENT_TYPE_SET_SESSION_EXTRA});
        C0244a1 a1Var9 = C0244a1.EVENT_TYPE_SET_USER_INFO;
        C0244a1 a1Var10 = C0244a1.EVENT_TYPE_REPORT_USER_INFO;
        C0244a1 a1Var11 = C0244a1.EVENT_TYPE_INIT;
        C0244a1 a1Var12 = C0244a1.EVENT_TYPE_APP_UPDATE;
        f7199c = EnumSet.of(a1Var9, new C0244a1[]{a1Var10, C0244a1.EVENT_TYPE_IDENTITY, a1Var, a1Var11, a1Var12, a1Var2, C0244a1.EVENT_TYPE_ALIVE, C0244a1.EVENT_TYPE_STARTUP, a1Var3, a1Var4, a1Var5, a1Var6, a1Var7, a1Var8, C0244a1.EVENT_TYPE_WEBVIEW_SYNC});
        C0244a1 a1Var13 = C0244a1.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        C0244a1 a1Var14 = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        f7200d = EnumSet.of(a1Var13, a1Var9, a1Var10, a1Var14);
        C0244a1 a1Var15 = C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED;
        C0244a1 a1Var16 = C0244a1.EVENT_TYPE_REGULAR;
        f7201e = EnumSet.of(a1Var15, new C0244a1[]{a1Var14, C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT, C0244a1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, C0244a1.EVENT_TYPE_EXCEPTION_USER, C0244a1.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, C0244a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, a1Var6, a1Var7, C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH, C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, C0244a1.EVENT_TYPE_CURRENT_SESSION_CRASHPAD_CRASH_PROTOBUF, a1Var8, a1Var16});
        f7203g = EnumSet.of(a1Var16);
        f7204h = EnumSet.of(a1Var6, a1Var7, a1Var8);
        i = Arrays.asList(new Integer[]{Integer.valueOf(a1Var11.b()), Integer.valueOf(C0244a1.EVENT_TYPE_FIRST_ACTIVATION.b()), Integer.valueOf(a1Var2.b()), Integer.valueOf(a1Var12.b())});
    }

    public static boolean a(C0244a1 a1Var) {
        return !f7198b.contains(a1Var);
    }

    public static boolean b(C0244a1 a1Var) {
        return !f7199c.contains(a1Var);
    }

    public static boolean c(int i2) {
        return f7201e.contains(C0244a1.a(i2));
    }

    public static boolean d(int i2) {
        return !f7204h.contains(C0244a1.a(i2));
    }

    public static boolean e(int i2) {
        return f7203g.contains(C0244a1.a(i2));
    }

    public static boolean f(int i2) {
        return f7197a.contains(Integer.valueOf(i2));
    }

    public static boolean a(int i2) {
        return f7202f.contains(C0244a1.a(i2));
    }

    public static boolean b(int i2) {
        return f7200d.contains(C0244a1.a(i2));
    }

    static C0293c0 c(String str, C0315cm cmVar) {
        return a(str, C0244a1.EVENT_TYPE_API_NATIVE_CRASH_PROTOBUF, cmVar);
    }

    public static C0293c0 a(String str, C0315cm cmVar) {
        return a(str, C0244a1.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, cmVar);
    }

    public static C0293c0 b(String str, C0315cm cmVar) {
        return a(str, C0244a1.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, cmVar);
    }

    private static C0293c0 a(String str, C0244a1 a1Var, C0315cm cmVar) {
        J j2 = new J("", "", a1Var.b(), 0, cmVar);
        if (str != null) {
            j2.i(str);
        }
        return j2;
    }

    public static C0293c0 a() {
        C0293c0 c0Var = new C0293c0();
        c0Var.f5578e = C0244a1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b();
        try {
            c0Var.f5575b = new JSONObject().put("stat_sending", new JSONObject().put(LogConstants.MSG_AD_TYPE_DISABLED, true)).toString();
        } catch (Throwable unused) {
        }
        return c0Var;
    }

    static C0293c0 a(String str, byte[] bArr, C0315cm cmVar) {
        return new J(bArr, str, C0244a1.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF.b(), cmVar);
    }

    static C0293c0 a(String str, String str2, boolean z, C0315cm cmVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("link", str2);
        hashMap.put("auto", Boolean.valueOf(z));
        return new J(Tl.g(hashMap), "", C0244a1.EVENT_TYPE_APP_OPEN.b(), 0, cmVar);
    }
}

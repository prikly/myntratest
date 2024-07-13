package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public abstract class Ul {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, C0315cm> f5192a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Sl> f5193b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f5194c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f5195d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f5196e = 0;

    public static Sl a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Sl.a();
        }
        Sl sl = f5193b.get(str);
        if (sl == null) {
            synchronized (f5195d) {
                sl = f5193b.get(str);
                if (sl == null) {
                    sl = new Sl(str);
                    f5193b.put(str, sl);
                }
            }
        }
        return sl;
    }

    public static C0315cm b(String str) {
        if (TextUtils.isEmpty(str)) {
            return C0315cm.a();
        }
        C0315cm cmVar = f5192a.get(str);
        if (cmVar == null) {
            synchronized (f5194c) {
                cmVar = f5192a.get(str);
                if (cmVar == null) {
                    cmVar = new C0315cm(str);
                    f5192a.put(str, cmVar);
                }
            }
        }
        return cmVar;
    }

    public static C0315cm a() {
        return C0315cm.a();
    }
}

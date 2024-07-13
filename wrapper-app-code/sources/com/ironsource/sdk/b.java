package com.ironsource.sdk;

import com.ironsource.sdk.j.a;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9009a;

    /* renamed from: b  reason: collision with root package name */
    public String f9010b;

    /* renamed from: c  reason: collision with root package name */
    public String f9011c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9012d;

    /* renamed from: e  reason: collision with root package name */
    public a f9013e;

    /* renamed from: f  reason: collision with root package name */
    public Map<String, String> f9014f;

    /* renamed from: g  reason: collision with root package name */
    public a f9015g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f9016h = false;

    b(String str, String str2, boolean z, boolean z2, Map<String, String> map, a aVar, a aVar2) {
        this.f9010b = str;
        this.f9011c = str2;
        this.f9009a = z;
        this.f9012d = z2;
        this.f9014f = map;
        this.f9015g = aVar;
        this.f9013e = aVar2;
    }

    public final boolean a() {
        a aVar = this.f9013e;
        if (aVar != null) {
            if (aVar.f8988b > 0 && aVar.f8987a > 0) {
                return true;
            }
        }
        return false;
    }
}

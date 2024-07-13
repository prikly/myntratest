package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ma  reason: case insensitive filesystem */
class C0552ma implements S7 {

    /* renamed from: a  reason: collision with root package name */
    private final S7 f6209a;

    public C0552ma(Context context, W7 w7, S7 s7) {
        this.f6209a = s7;
    }

    public int a(String str, int i) {
        return this.f6209a.a(str, i);
    }

    public void b() {
        this.f6209a.b();
    }

    public long a(String str, long j) {
        return this.f6209a.a(str, j);
    }

    public String b(String str, String str2) {
        return this.f6209a.b(str, str2);
    }

    public S7 a(String str, String str2) {
        this.f6209a.a(str, str2);
        return this;
    }

    public boolean b(String str, boolean z) {
        return this.f6209a.b(str, z);
    }

    public S7 a(String str, boolean z) {
        this.f6209a.a(str, z);
        return this;
    }

    public S7 b(String str) {
        this.f6209a.b(str);
        return this;
    }

    public boolean a(String str) {
        return this.f6209a.a(str);
    }

    public S7 b(String str, long j) {
        this.f6209a.b(str, j);
        return this;
    }

    public Set<String> a() {
        return this.f6209a.a();
    }

    public S7 b(String str, int i) {
        this.f6209a.b(str, i);
        return this;
    }
}

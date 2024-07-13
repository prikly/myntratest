package com.bytedance.sdk.component.e;

import java.io.File;
import java.util.Map;

/* compiled from: NetResponse */
public class b {

    /* renamed from: a  reason: collision with root package name */
    final int f19119a;

    /* renamed from: b  reason: collision with root package name */
    final String f19120b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, String> f19121c;

    /* renamed from: d  reason: collision with root package name */
    final String f19122d;

    /* renamed from: e  reason: collision with root package name */
    final long f19123e;

    /* renamed from: f  reason: collision with root package name */
    final long f19124f;

    /* renamed from: g  reason: collision with root package name */
    private File f19125g = null;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f19126h;
    private byte[] i = null;

    public b(boolean z, int i2, String str, Map<String, String> map, String str2, long j, long j2) {
        this.f19126h = z;
        this.f19119a = i2;
        this.f19120b = str;
        this.f19121c = map;
        this.f19122d = str2;
        this.f19123e = j;
        this.f19124f = j2;
    }

    public int a() {
        return this.f19119a;
    }

    public void a(File file) {
        this.f19125g = file;
    }

    public String b() {
        return this.f19120b;
    }

    public Map<String, String> c() {
        return this.f19121c;
    }

    public String d() {
        return this.f19122d;
    }

    public File e() {
        return this.f19125g;
    }

    public boolean f() {
        return this.f19126h;
    }

    public long g() {
        return this.f19123e - this.f19124f;
    }
}

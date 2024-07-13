package com.bykv.vk.openvk.component.video.api.c;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* compiled from: VideoUrlModel */
public class c implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public String f18171a;

    /* renamed from: b  reason: collision with root package name */
    public int f18172b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, Object> f18173c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private b f18174d;

    /* renamed from: e  reason: collision with root package name */
    private b f18175e;

    /* renamed from: f  reason: collision with root package name */
    private String f18176f;

    /* renamed from: g  reason: collision with root package name */
    private int f18177g = 204800;

    /* renamed from: h  reason: collision with root package name */
    private String f18178h;
    private int i;
    private int j;
    private List<String> k;
    private String l;
    private long m;
    private boolean n;
    private int o = 0;
    private int p = 0;
    private int q = 10000;
    private int r = 10000;
    private int s = 10000;
    private int t = 0;

    public c(String str, b bVar, b bVar2, int i2, int i3) {
        this.f18176f = str;
        this.f18174d = bVar;
        this.f18175e = bVar2;
        this.o = i2;
        this.p = i3;
    }

    public String a() {
        return this.f18176f;
    }

    public void a(String str) {
        this.f18176f = str;
    }

    public int b() {
        if (i()) {
            return this.f18175e.m();
        }
        b bVar = this.f18174d;
        if (bVar != null) {
            return bVar.m();
        }
        return 0;
    }

    public void b(String str) {
        this.f18178h = str;
    }

    public int c() {
        return this.i;
    }

    public void a(int i2) {
        this.i = i2;
    }

    public int d() {
        return this.j;
    }

    public void b(int i2) {
        this.j = i2;
    }

    public void a(List<String> list) {
        this.k = list;
    }

    public void c(String str) {
        this.l = str;
    }

    public long e() {
        return this.m;
    }

    public void a(long j2) {
        this.m = j2;
    }

    public boolean f() {
        return this.n;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public long g() {
        if (i()) {
            return this.f18175e.e();
        }
        b bVar = this.f18174d;
        if (bVar != null) {
            return bVar.e();
        }
        return 0;
    }

    public boolean h() {
        if (i()) {
            return this.f18175e.t();
        }
        b bVar = this.f18174d;
        if (bVar != null) {
            return bVar.t();
        }
        return true;
    }

    public void d(String str) {
        this.f18171a = str;
    }

    public void c(int i2) {
        this.f18172b = i2;
    }

    public boolean i() {
        return this.o == 1 && this.p == 1 && this.f18175e != null;
    }

    public String j() {
        if (i()) {
            return this.f18175e.i();
        }
        b bVar = this.f18174d;
        if (bVar != null) {
            return bVar.i();
        }
        return null;
    }

    public String k() {
        if (i()) {
            return this.f18175e.l();
        }
        b bVar = this.f18174d;
        if (bVar != null) {
            return bVar.l();
        }
        return null;
    }

    public int l() {
        return this.o;
    }

    public synchronized void a(String str, Object obj) {
        this.f18173c.put(str, obj);
    }

    public synchronized Object e(String str) {
        return this.f18173c.get(str);
    }

    public int m() {
        return this.q;
    }

    public void d(int i2) {
        this.q = i2;
    }

    public int n() {
        return this.r;
    }

    public void e(int i2) {
        this.r = i2;
    }

    public int o() {
        return this.s;
    }

    public void f(int i2) {
        this.s = i2;
    }

    public int p() {
        return this.t;
    }

    public void g(int i2) {
        this.t = i2;
    }

    public b q() {
        return this.f18174d;
    }

    public b r() {
        return this.f18175e;
    }
}

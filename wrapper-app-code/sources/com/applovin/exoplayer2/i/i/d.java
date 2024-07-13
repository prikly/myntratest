package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f13162a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f13163b = "";

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f13164c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private String f13165d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f13166e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f13167f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13168g = false;

    /* renamed from: h  reason: collision with root package name */
    private int f13169h;
    private boolean i = false;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private float o;
    private int p = -1;
    private boolean q = false;

    private static int a(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public int a() {
        if (this.l == -1 && this.m == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = this.l == 1 ? 1 : 0;
        if (this.m == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public int a(String str, String str2, Set<String> set, String str3) {
        if (this.f13162a.isEmpty() && this.f13163b.isEmpty() && this.f13164c.isEmpty() && this.f13165d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int a2 = a(a(a(0, this.f13162a, str, 1073741824), this.f13163b, str2, 2), this.f13165d, str3, 4);
        if (a2 == -1 || !set.containsAll(this.f13164c)) {
            return 0;
        }
        return a2 + (this.f13164c.size() * 4);
    }

    public d a(float f2) {
        this.o = f2;
        return this;
    }

    public d a(int i2) {
        this.f13167f = i2;
        this.f13168g = true;
        return this;
    }

    public d a(boolean z) {
        this.k = z ? 1 : 0;
        return this;
    }

    public void a(String str) {
        this.f13162a = str;
    }

    public void a(String[] strArr) {
        this.f13164c = new HashSet(Arrays.asList(strArr));
    }

    public d b(int i2) {
        this.f13169h = i2;
        this.i = true;
        return this;
    }

    public d b(boolean z) {
        this.l = z ? 1 : 0;
        return this;
    }

    public void b(String str) {
        this.f13163b = str;
    }

    public boolean b() {
        return this.j == 1;
    }

    public d c(int i2) {
        this.n = i2;
        return this;
    }

    public d c(boolean z) {
        this.m = z ? 1 : 0;
        return this;
    }

    public void c(String str) {
        this.f13165d = str;
    }

    public boolean c() {
        return this.k == 1;
    }

    public d d(int i2) {
        this.p = i2;
        return this;
    }

    public d d(String str) {
        this.f13166e = str == null ? null : Ascii.toLowerCase(str);
        return this;
    }

    public d d(boolean z) {
        this.q = z;
        return this;
    }

    public String d() {
        return this.f13166e;
    }

    public int e() {
        if (this.f13168g) {
            return this.f13167f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public boolean f() {
        return this.f13168g;
    }

    public int g() {
        if (this.i) {
            return this.f13169h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean h() {
        return this.i;
    }

    public int i() {
        return this.n;
    }

    public float j() {
        return this.o;
    }

    public int k() {
        return this.p;
    }

    public boolean l() {
        return this.q;
    }
}

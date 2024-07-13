package com.bytedance.sdk.openadsdk.core.e;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTImage;

/* compiled from: Image */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private String f1098a;

    /* renamed from: b  reason: collision with root package name */
    private int f1099b;

    /* renamed from: c  reason: collision with root package name */
    private int f1100c;

    /* renamed from: d  reason: collision with root package name */
    private double f1101d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1102e;

    /* renamed from: f  reason: collision with root package name */
    private String f1103f;

    public static TTImage a(k kVar) {
        if (kVar == null || !kVar.e()) {
            return null;
        }
        return new TTImage(kVar.c(), kVar.b(), kVar.a(), kVar.d());
    }

    public String a() {
        return this.f1098a;
    }

    public void a(int i) {
        this.f1099b = i;
    }

    public void a(String str) {
        this.f1098a = str;
    }

    public void a(boolean z) {
        this.f1102e = z;
    }

    public int b() {
        return this.f1099b;
    }

    public void b(int i) {
        this.f1100c = i;
    }

    public void b(String str) {
        this.f1103f = str;
    }

    public int c() {
        return this.f1100c;
    }

    public double d() {
        return this.f1101d;
    }

    public boolean e() {
        return !TextUtils.isEmpty(this.f1098a) && this.f1099b > 0 && this.f1100c > 0;
    }

    public boolean f() {
        return this.f1102e;
    }

    public String g() {
        return this.f1103f;
    }
}

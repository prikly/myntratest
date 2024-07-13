package com.applovin.impl.sdk.e;

import android.content.Context;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;

public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15417a;
    /* access modifiers changed from: protected */

    /* renamed from: b  reason: collision with root package name */
    public final n f15418b;
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public final String f15419c;
    /* access modifiers changed from: protected */

    /* renamed from: d  reason: collision with root package name */
    public final v f15420d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f15421e;

    public a(String str, n nVar) {
        this(str, nVar, false);
    }

    public a(String str, n nVar, boolean z) {
        this.f15419c = str;
        this.f15418b = nVar;
        this.f15420d = nVar.D();
        this.f15417a = nVar.P();
        this.f15421e = z;
    }

    /* access modifiers changed from: protected */
    public n d() {
        return this.f15418b;
    }

    public String e() {
        return this.f15419c;
    }

    /* access modifiers changed from: protected */
    public Context f() {
        return this.f15417a;
    }

    public boolean g() {
        return this.f15421e;
    }
}

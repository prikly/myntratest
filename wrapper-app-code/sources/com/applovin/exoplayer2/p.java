package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.h.o;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.c;
import java.io.IOException;

public final class p extends ak {

    /* renamed from: h  reason: collision with root package name */
    public static final g.a<p> f13775h = $$Lambda$p$hTa8Lwjj_vTaNwsWoxXnMYA4bk.INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public final int f13776a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13777b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13778c;

    /* renamed from: d  reason: collision with root package name */
    public final v f13779d;

    /* renamed from: e  reason: collision with root package name */
    public final int f13780e;

    /* renamed from: f  reason: collision with root package name */
    public final o f13781f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f13782g;

    private p(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (v) null, 4, false);
    }

    private p(int i, Throwable th, String str, int i2, String str2, int i3, v vVar, int i4, boolean z) {
        this(a(i, str, str2, i3, vVar, i4), th, i2, i, str2, i3, vVar, i4, (o) null, SystemClock.elapsedRealtime(), z);
    }

    private p(Bundle bundle) {
        super(bundle);
        this.f13776a = bundle.getInt(a(1001), 2);
        this.f13777b = bundle.getString(a(1002));
        this.f13778c = bundle.getInt(a(1003), -1);
        this.f13779d = (v) c.a(v.F, bundle.getBundle(a(1004)));
        this.f13780e = bundle.getInt(a(1005), 4);
        this.f13782g = bundle.getBoolean(a(1006), false);
        this.f13781f = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private p(String str, Throwable th, int i, int i2, String str2, int i3, v vVar, int i4, o oVar, long j, boolean z) {
        super(str, th, i, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        a.a(!z2 || i5 == 1);
        a.a((th != null || i5 == 3) ? true : z3);
        this.f13776a = i5;
        this.f13777b = str2;
        this.f13778c = i3;
        this.f13779d = vVar;
        this.f13780e = i4;
        this.f13781f = oVar;
        this.f13782g = z2;
    }

    public static p a(IOException iOException, int i) {
        return new p(0, iOException, i);
    }

    @Deprecated
    public static p a(RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    public static p a(RuntimeException runtimeException, int i) {
        return new p(2, runtimeException, i);
    }

    public static p a(Throwable th, String str, int i, v vVar, int i2, boolean z, int i3) {
        return new p(1, th, (String) null, i3, str, i, vVar, vVar == null ? 4 : i2, z);
    }

    private static String a(int i, String str, String str2, int i2, v vVar, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + vVar + ", format_supported=" + h.a(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* renamed from: lambda$hTa8Lwjj_vTaN-wsWoxXnMYA4bk  reason: not valid java name */
    public static /* synthetic */ p m129lambda$hTa8Lwjj_vTaNwsWoxXnMYA4bk(Bundle bundle) {
        return new p(bundle);
    }

    /* access modifiers changed from: package-private */
    public p a(o oVar) {
        return new p((String) ai.a(getMessage()), getCause(), this.i, this.f13776a, this.f13777b, this.f13778c, this.f13779d, this.f13780e, oVar, this.j, this.f13782g);
    }
}

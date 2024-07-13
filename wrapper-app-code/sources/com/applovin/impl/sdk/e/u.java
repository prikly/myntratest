package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

public abstract class u<T> extends a implements b.c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f15508a;

    /* renamed from: e  reason: collision with root package name */
    private final b.c<T> f15509e;

    /* renamed from: f  reason: collision with root package name */
    protected b.a f15510f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public o.a f15511g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public com.applovin.impl.sdk.c.b<String> f15512h;
    /* access modifiers changed from: private */
    public com.applovin.impl.sdk.c.b<String> i;

    public u(c<T> cVar, n nVar) {
        this(cVar, nVar, false);
    }

    public u(c<T> cVar, final n nVar, boolean z) {
        super("TaskRepeatRequest", nVar, z);
        this.f15511g = o.a.BACKGROUND;
        this.f15512h = null;
        this.i = null;
        if (cVar != null) {
            this.f15508a = cVar;
            this.f15510f = new b.a();
            this.f15509e = new b.c<T>() {
                public void a(int i, String str, T t) {
                    com.applovin.impl.sdk.c.b bVar;
                    u uVar;
                    boolean z = false;
                    boolean z2 = i < 200 || i >= 500;
                    boolean z3 = i == 429;
                    if ((i != -1009) && (z2 || z3 || u.this.f15508a.m())) {
                        String f2 = u.this.f15508a.f();
                        if (u.this.f15508a.h() > 0) {
                            v vVar = u.this.f15420d;
                            if (v.a()) {
                                v vVar2 = u.this.f15420d;
                                String str2 = u.this.f15419c;
                                vVar2.d(str2, "Unable to send request due to server failure (code " + i + "). " + u.this.f15508a.h() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds((long) u.this.f15508a.k()) + " seconds...");
                            }
                            int h2 = u.this.f15508a.h() - 1;
                            u.this.f15508a.a(h2);
                            if (h2 == 0) {
                                u uVar2 = u.this;
                                uVar2.c(uVar2.f15512h);
                                if (StringUtils.isValidString(f2) && f2.length() >= 4) {
                                    v vVar3 = u.this.f15420d;
                                    if (v.a()) {
                                        v vVar4 = u.this.f15420d;
                                        String str3 = u.this.f15419c;
                                        vVar4.c(str3, "Switching to backup endpoint " + f2);
                                    }
                                    u.this.f15508a.a(f2);
                                    z = true;
                                }
                            }
                            long millis = (!((Boolean) nVar.a(com.applovin.impl.sdk.c.b.dk)).booleanValue() || !z) ? u.this.f15508a.l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, (double) u.this.f15508a.i())) : (long) u.this.f15508a.k() : 0;
                            o V = nVar.V();
                            u uVar3 = u.this;
                            V.a((a) uVar3, uVar3.f15511g, millis);
                            return;
                        }
                        if (f2 == null || !f2.equals(u.this.f15508a.a())) {
                            uVar = u.this;
                            bVar = uVar.f15512h;
                        } else {
                            uVar = u.this;
                            bVar = uVar.i;
                        }
                        uVar.c(bVar);
                    }
                    u.this.a(i, str, t);
                }

                public void a(T t, int i) {
                    u.this.f15508a.a(0);
                    u.this.a(t, i);
                }
            };
            return;
        }
        throw new IllegalArgumentException("No request specified");
    }

    /* access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.c.b<ST> bVar) {
        if (bVar != null) {
            d().O().a((com.applovin.impl.sdk.c.b<?>) bVar, (Object) bVar.b());
        }
    }

    public abstract void a(int i2, String str, T t);

    public void a(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f15512h = bVar;
    }

    public void a(o.a aVar) {
        this.f15511g = aVar;
    }

    public abstract void a(T t, int i2);

    public void b(com.applovin.impl.sdk.c.b<String> bVar) {
        this.i = bVar;
    }

    public void run() {
        int i2;
        b U = d().U();
        if (!d().c() && !d().d()) {
            v.i("AppLovinSdk", "AppLovin SDK is disabled");
            i2 = -22;
        } else if (!StringUtils.isValidString(this.f15508a.a()) || this.f15508a.a().length() < 4) {
            v vVar = this.f15420d;
            if (v.a()) {
                this.f15420d.e(this.f15419c, "Task has an invalid or null request endpoint.");
            }
            i2 = AppLovinErrorCodes.INVALID_URL;
        } else {
            if (TextUtils.isEmpty(this.f15508a.b())) {
                this.f15508a.b(this.f15508a.e() != null ? "POST" : "GET");
            }
            U.a(this.f15508a, this.f15510f, this.f15509e);
            return;
        }
        a(i2, (String) null, (Object) null);
    }
}

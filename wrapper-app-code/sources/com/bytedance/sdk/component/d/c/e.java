package com.bytedance.sdk.component.d.c;

import android.content.Context;
import com.bytedance.sdk.component.d.b;
import com.bytedance.sdk.component.d.c;
import com.bytedance.sdk.component.d.d;
import com.bytedance.sdk.component.d.k;
import com.bytedance.sdk.component.d.l;
import com.bytedance.sdk.component.d.o;
import com.bytedance.sdk.component.d.p;
import com.bytedance.sdk.component.d.q;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadConfig */
public class e implements l {

    /* renamed from: a  reason: collision with root package name */
    private k f19064a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f19065b;

    /* renamed from: c  reason: collision with root package name */
    private d f19066c;

    /* renamed from: d  reason: collision with root package name */
    private p f19067d;

    /* renamed from: e  reason: collision with root package name */
    private q f19068e;

    /* renamed from: f  reason: collision with root package name */
    private c f19069f;

    /* renamed from: g  reason: collision with root package name */
    private o f19070g;

    /* renamed from: h  reason: collision with root package name */
    private b f19071h;

    private e(a aVar) {
        this.f19064a = aVar.f19072a;
        this.f19065b = aVar.f19073b;
        this.f19066c = aVar.f19074c;
        this.f19067d = aVar.f19075d;
        this.f19068e = aVar.f19076e;
        this.f19069f = aVar.f19077f;
        this.f19071h = aVar.f19079h;
        this.f19070g = aVar.f19078g;
    }

    public k a() {
        return this.f19064a;
    }

    public ExecutorService b() {
        return this.f19065b;
    }

    public d c() {
        return this.f19066c;
    }

    public p d() {
        return this.f19067d;
    }

    public q e() {
        return this.f19068e;
    }

    public c f() {
        return this.f19069f;
    }

    public o g() {
        return this.f19070g;
    }

    public b h() {
        return this.f19071h;
    }

    public static e a(Context context) {
        return new a().a();
    }

    /* compiled from: LoadConfig */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public k f19072a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public ExecutorService f19073b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public d f19074c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public p f19075d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public q f19076e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public c f19077f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public o f19078g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public b f19079h;

        public a a(b bVar) {
            this.f19079h = bVar;
            return this;
        }

        public a a(ExecutorService executorService) {
            this.f19073b = executorService;
            return this;
        }

        public a a(d dVar) {
            this.f19074c = dVar;
            return this;
        }

        public e a() {
            return new e(this);
        }
    }
}

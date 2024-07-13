package com.bytedance.sdk.component.a;

import android.text.TextUtils;

/* compiled from: Js2JavaCall */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f18245a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18246b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18247c;

    /* renamed from: d  reason: collision with root package name */
    public final String f18248d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18249e;

    /* renamed from: f  reason: collision with root package name */
    public final String f18250f;

    /* renamed from: g  reason: collision with root package name */
    public final String f18251g;

    /* renamed from: h  reason: collision with root package name */
    public final String f18252h;

    public static a a() {
        return new a();
    }

    public static q a(String str, int i) {
        return new q(str, i);
    }

    private q(String str, int i) {
        this.f18246b = null;
        this.f18247c = null;
        this.f18248d = null;
        this.f18249e = null;
        this.f18250f = str;
        this.f18251g = null;
        this.f18245a = i;
        this.f18252h = null;
    }

    private q(a aVar) {
        this.f18246b = aVar.f18253a;
        this.f18247c = aVar.f18254b;
        this.f18248d = aVar.f18255c;
        this.f18249e = aVar.f18256d;
        this.f18250f = aVar.f18257e;
        this.f18251g = aVar.f18258f;
        this.f18245a = 1;
        this.f18252h = aVar.f18259g;
    }

    public static boolean a(q qVar) {
        if (qVar == null || qVar.f18245a != 1 || TextUtils.isEmpty(qVar.f18248d) || TextUtils.isEmpty(qVar.f18249e)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "methodName: " + this.f18248d + ", params: " + this.f18249e + ", callbackId: " + this.f18250f + ", type: " + this.f18247c + ", version: " + this.f18246b + ", ";
    }

    /* compiled from: Js2JavaCall */
    public static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f18253a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f18254b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f18255c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f18256d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f18257e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f18258f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f18259g;

        private a() {
        }

        public a a(String str) {
            this.f18253a = str;
            return this;
        }

        public a b(String str) {
            this.f18254b = str;
            return this;
        }

        public a c(String str) {
            this.f18255c = str;
            return this;
        }

        public a d(String str) {
            this.f18256d = str;
            return this;
        }

        public a e(String str) {
            this.f18257e = str;
            return this;
        }

        public a f(String str) {
            this.f18258f = str;
            return this;
        }

        public a g(String str) {
            this.f18259g = str;
            return this;
        }

        public q a() {
            return new q(this);
        }
    }
}

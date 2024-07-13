package com.bytedance.sdk.openadsdk.core.e;

import android.util.SparseArray;
import com.bytedance.sdk.component.adexpress.b;
import com.bytedance.sdk.openadsdk.core.b.c;
import org.json.JSONObject;

/* compiled from: DynamicClickInfo */
public class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final float f1082a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1083b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1084c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1085d;

    /* renamed from: e  reason: collision with root package name */
    public final long f1086e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1087f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1088g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1089h;
    public final int i;
    public final int j;
    public final String k;
    public int l;
    public JSONObject m;
    public SparseArray<c.a> n;
    public final boolean o;
    public int p;

    private j(a aVar) {
        this.f1082a = aVar.f1096g;
        this.f1083b = aVar.f1095f;
        this.f1084c = aVar.f1094e;
        this.f1085d = aVar.f1093d;
        this.f1086e = aVar.f1092c;
        this.f1087f = aVar.f1091b;
        this.f1088g = aVar.f1097h;
        this.f1089h = aVar.i;
        this.i = aVar.j;
        this.j = aVar.k;
        this.k = aVar.l;
        this.n = aVar.f1090a;
        this.o = aVar.p;
        this.l = aVar.m;
        this.m = aVar.n;
        this.p = aVar.o;
    }

    /* compiled from: DynamicClickInfo */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected SparseArray<c.a> f1090a = new SparseArray<>();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f1091b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f1092c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public float f1093d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public float f1094e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public float f1095f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public float f1096g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public int f1097h;
        /* access modifiers changed from: private */
        public int i;
        /* access modifiers changed from: private */
        public int j;
        /* access modifiers changed from: private */
        public int k;
        /* access modifiers changed from: private */
        public String l;
        /* access modifiers changed from: private */
        public int m;
        /* access modifiers changed from: private */
        public JSONObject n;
        /* access modifiers changed from: private */
        public int o;
        /* access modifiers changed from: private */
        public boolean p;

        public a a(int i2) {
            this.o = i2;
            return this;
        }

        public a b(int i2) {
            this.m = i2;
            return this;
        }

        public a a(JSONObject jSONObject) {
            this.n = jSONObject;
            return this;
        }

        public a a(boolean z) {
            this.p = z;
            return this;
        }

        public a a(long j2) {
            this.f1091b = j2;
            return this;
        }

        public a b(long j2) {
            this.f1092c = j2;
            return this;
        }

        public a a(float f2) {
            this.f1093d = f2;
            return this;
        }

        public a b(float f2) {
            this.f1094e = f2;
            return this;
        }

        public a c(float f2) {
            this.f1095f = f2;
            return this;
        }

        public a d(float f2) {
            this.f1096g = f2;
            return this;
        }

        public a c(int i2) {
            this.f1097h = i2;
            return this;
        }

        public a d(int i2) {
            this.i = i2;
            return this;
        }

        public a e(int i2) {
            this.j = i2;
            return this;
        }

        public a f(int i2) {
            this.k = i2;
            return this;
        }

        public a a(String str) {
            this.l = str;
            return this;
        }

        public a a(SparseArray<c.a> sparseArray) {
            this.f1090a = sparseArray;
            return this;
        }

        public j a() {
            return new j(this);
        }
    }
}

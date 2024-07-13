package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f13370a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13371b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13372c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f13373d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f13374e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final long f13375f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13376g;

    /* renamed from: h  reason: collision with root package name */
    public final long f13377h;
    public final String i;
    public final int j;
    public final Object k;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Uri f13378a;

        /* renamed from: b  reason: collision with root package name */
        private long f13379b;

        /* renamed from: c  reason: collision with root package name */
        private int f13380c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f13381d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f13382e;

        /* renamed from: f  reason: collision with root package name */
        private long f13383f;

        /* renamed from: g  reason: collision with root package name */
        private long f13384g;

        /* renamed from: h  reason: collision with root package name */
        private String f13385h;
        private int i;
        private Object j;

        public a() {
            this.f13380c = 1;
            this.f13382e = Collections.emptyMap();
            this.f13384g = -1;
        }

        private a(l lVar) {
            this.f13378a = lVar.f13370a;
            this.f13379b = lVar.f13371b;
            this.f13380c = lVar.f13372c;
            this.f13381d = lVar.f13373d;
            this.f13382e = lVar.f13374e;
            this.f13383f = lVar.f13376g;
            this.f13384g = lVar.f13377h;
            this.f13385h = lVar.i;
            this.i = lVar.j;
            this.j = lVar.k;
        }

        public a a(int i2) {
            this.f13380c = i2;
            return this;
        }

        public a a(long j2) {
            this.f13383f = j2;
            return this;
        }

        public a a(Uri uri) {
            this.f13378a = uri;
            return this;
        }

        public a a(String str) {
            this.f13378a = Uri.parse(str);
            return this;
        }

        public a a(Map<String, String> map) {
            this.f13382e = map;
            return this;
        }

        public a a(byte[] bArr) {
            this.f13381d = bArr;
            return this;
        }

        public l a() {
            com.applovin.exoplayer2.l.a.a(this.f13378a, (Object) "The uri must be set.");
            return new l(this.f13378a, this.f13379b, this.f13380c, this.f13381d, this.f13382e, this.f13383f, this.f13384g, this.f13385h, this.i, this.j);
        }

        public a b(int i2) {
            this.i = i2;
            return this;
        }

        public a b(String str) {
            this.f13385h = str;
            return this;
        }
    }

    private l(Uri uri, long j2, int i2, byte[] bArr, Map<String, String> map, long j3, long j4, String str, int i3, Object obj) {
        long j5 = j2;
        byte[] bArr2 = bArr;
        long j6 = j3;
        long j7 = j4;
        long j8 = j5 + j6;
        boolean z = true;
        com.applovin.exoplayer2.l.a.a(j8 >= 0);
        com.applovin.exoplayer2.l.a.a(j6 >= 0);
        if (j7 <= 0 && j7 != -1) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.a(z);
        this.f13370a = uri;
        this.f13371b = j5;
        this.f13372c = i2;
        this.f13373d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f13374e = Collections.unmodifiableMap(new HashMap(map));
        this.f13376g = j6;
        this.f13375f = j8;
        this.f13377h = j7;
        this.i = str;
        this.j = i3;
        this.k = obj;
    }

    public static String a(int i2) {
        if (i2 == 1) {
            return "GET";
        }
        if (i2 == 2) {
            return "POST";
        }
        if (i2 == 3) {
            return VersionInfo.GIT_BRANCH;
        }
        throw new IllegalStateException();
    }

    public final String a() {
        return a(this.f13372c);
    }

    public a b() {
        return new a();
    }

    public boolean b(int i2) {
        return (this.j & i2) == i2;
    }

    public String toString() {
        return "DataSpec[" + a() + " " + this.f13370a + ", " + this.f13376g + ", " + this.f13377h + ", " + this.i + ", " + this.j + "]";
    }
}

package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.ai;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final d f11211a = new a().a();

    /* renamed from: f  reason: collision with root package name */
    public static final g.a<d> f11212f = $$Lambda$d$TEejaa8RuGAX8vn1CuR5m7FJjJg.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public final int f11213b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11214c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11215d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11216e;

    /* renamed from: g  reason: collision with root package name */
    private AudioAttributes f11217g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f11218a = 0;

        /* renamed from: b  reason: collision with root package name */
        private int f11219b = 0;

        /* renamed from: c  reason: collision with root package name */
        private int f11220c = 1;

        /* renamed from: d  reason: collision with root package name */
        private int f11221d = 1;

        public a a(int i) {
            this.f11218a = i;
            return this;
        }

        public d a() {
            return new d(this.f11218a, this.f11219b, this.f11220c, this.f11221d);
        }

        public a b(int i) {
            this.f11219b = i;
            return this;
        }

        public a c(int i) {
            this.f11220c = i;
            return this;
        }

        public a d(int i) {
            this.f11221d = i;
            return this;
        }
    }

    private d(int i, int i2, int i3, int i4) {
        this.f11213b = i;
        this.f11214c = i2;
        this.f11215d = i3;
        this.f11216e = i4;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ d a(Bundle bundle) {
        a aVar = new a();
        if (bundle.containsKey(a(0))) {
            aVar.a(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            aVar.b(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            aVar.c(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            aVar.d(bundle.getInt(a(3)));
        }
        return aVar.a();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public AudioAttributes a() {
        if (this.f11217g == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f11213b).setFlags(this.f11214c).setUsage(this.f11215d);
            if (ai.f13525a >= 29) {
                usage.setAllowedCapturePolicy(this.f11216e);
            }
            this.f11217g = usage.build();
        }
        return this.f11217g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f11213b == dVar.f11213b && this.f11214c == dVar.f11214c && this.f11215d == dVar.f11215d && this.f11216e == dVar.f11216e;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f11213b) * 31) + this.f11214c) * 31) + this.f11215d) * 31) + this.f11216e;
    }
}

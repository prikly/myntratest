package com.appodeal.ads.utils;

import android.os.SystemClock;
import com.appodeal.ads.storage.b;
import com.appodeal.ads.storage.o;
import java.util.UUID;
import org.json.JSONObject;

public final class w {
    public static final o l = o.f17407b;

    /* renamed from: a  reason: collision with root package name */
    public final String f17577a;

    /* renamed from: b  reason: collision with root package name */
    public final long f17578b;

    /* renamed from: c  reason: collision with root package name */
    public final long f17579c;

    /* renamed from: d  reason: collision with root package name */
    public final long f17580d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f17581e = 0;

    /* renamed from: f  reason: collision with root package name */
    public volatile long f17582f = 0;

    /* renamed from: g  reason: collision with root package name */
    public volatile long f17583g = 0;

    /* renamed from: h  reason: collision with root package name */
    public volatile long f17584h = 0;
    public volatile long i = 0;
    public volatile long j = 0;
    public long k = 0;

    public w(long j2) {
        this.f17578b = j2 + 1;
        this.f17577a = UUID.randomUUID().toString();
        long a2 = b0.a();
        this.f17579c = a2;
        this.f17583g = a2;
        long b2 = b0.b();
        this.f17580d = b2;
        this.f17584h = b2;
    }

    public w(String str, long j2, long j3, long j4, long j5, long j6) {
        this.f17577a = str;
        this.f17578b = j2;
        this.f17579c = j3;
        this.f17580d = j4;
        this.f17581e = j5;
        this.f17582f = j6;
    }

    public final synchronized String a() {
        return this.f17577a;
    }

    public final synchronized void b() {
        synchronized (this) {
            o oVar = l;
            long l2 = oVar.f17408a.l();
            long k2 = oVar.f17408a.k();
            b bVar = oVar.f17408a;
            b.a aVar = b.a.Default;
            long j2 = bVar.a(aVar).getLong("app_uptime", 0);
            long j3 = oVar.f17408a.a(aVar).getLong("app_uptime_m", 0);
            oVar.a(this.f17577a, this.f17578b, this.f17579c, this.f17580d, j2 + l2, j3 + k2);
        }
    }

    public final synchronized void c() {
        e();
        o oVar = l;
        oVar.f17408a.a(this.f17581e, this.f17582f);
    }

    public final synchronized JSONObject d() {
        return new JSONObject().put("session_uuid", this.f17577a).put("session_id", this.f17578b).put("session_uptime", this.f17581e / 1000).put("session_uptime_m", this.f17582f).put("session_start_ts", this.f17579c / 1000).put("session_start_ts_m", this.f17580d);
    }

    public final synchronized void e() {
        this.f17581e = (System.currentTimeMillis() - this.f17583g) + this.f17581e;
        this.f17582f = (SystemClock.elapsedRealtime() - this.f17584h) + this.f17582f;
        this.f17583g = System.currentTimeMillis();
        this.f17584h = SystemClock.elapsedRealtime();
    }
}

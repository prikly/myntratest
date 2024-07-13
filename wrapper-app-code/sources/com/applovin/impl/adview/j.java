package com.applovin.impl.adview;

import android.os.Handler;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v f14172a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f14173b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b> f14174c = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f14175d = new AtomicInteger();

    public interface a {
        void a();

        boolean b();
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f14179a;

        /* renamed from: b  reason: collision with root package name */
        private final a f14180b;

        /* renamed from: c  reason: collision with root package name */
        private final long f14181c;

        private b(String str, long j, a aVar) {
            this.f14179a = str;
            this.f14181c = j;
            this.f14180b = aVar;
        }

        /* access modifiers changed from: private */
        public String a() {
            return this.f14179a;
        }

        /* access modifiers changed from: private */
        public long b() {
            return this.f14181c;
        }

        /* access modifiers changed from: private */
        public a c() {
            return this.f14180b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            String str = this.f14179a;
            String str2 = ((b) obj).f14179a;
            return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
        }

        public int hashCode() {
            String str = this.f14179a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f14179a + '\'' + ", countdownStepMillis=" + this.f14181c + '}';
        }
    }

    public j(Handler handler, n nVar) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        } else if (nVar != null) {
            this.f14173b = handler;
            this.f14172a = nVar.D();
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    /* access modifiers changed from: private */
    public void a(final b bVar, final int i) {
        this.f14173b.postDelayed(new Runnable() {
            public void run() {
                a b2 = bVar.c();
                if (!b2.b()) {
                    v unused = j.this.f14172a;
                    if (v.a()) {
                        v b3 = j.this.f14172a;
                        b3.b("CountdownManager", "Ending countdown for " + bVar.a());
                    }
                } else if (j.this.f14175d.get() == i) {
                    try {
                        b2.a();
                        j.this.a(bVar, i);
                    } catch (Throwable th) {
                        v unused2 = j.this.f14172a;
                        if (v.a()) {
                            v b4 = j.this.f14172a;
                            b4.b("CountdownManager", "Encountered error on countdown step for: " + bVar.a(), th);
                        }
                        j.this.b();
                    }
                } else {
                    v unused3 = j.this.f14172a;
                    if (v.a()) {
                        v b5 = j.this.f14172a;
                        b5.d("CountdownManager", "Killing duplicate countdown from previous generation: " + bVar.a());
                    }
                }
            }
        }, bVar.b());
    }

    public void a() {
        HashSet<b> hashSet = new HashSet<>(this.f14174c);
        if (v.a()) {
            v vVar = this.f14172a;
            vVar.b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f14175d.incrementAndGet();
        for (b bVar : hashSet) {
            if (v.a()) {
                v vVar2 = this.f14172a;
                vVar2.b("CountdownManager", "Starting countdown: " + bVar.a() + " for generation " + incrementAndGet + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            a(bVar, incrementAndGet);
        }
    }

    public void a(String str, long j, a aVar) {
        if (j <= 0) {
            throw new IllegalArgumentException("Invalid step specified.");
        } else if (this.f14173b != null) {
            if (v.a()) {
                v vVar = this.f14172a;
                vVar.b("CountdownManager", "Adding countdown: " + str);
            }
            this.f14174c.add(new b(str, j, aVar));
        } else {
            throw new IllegalArgumentException("No handler specified.");
        }
    }

    public void b() {
        if (v.a()) {
            this.f14172a.b("CountdownManager", "Removing all countdowns...");
        }
        c();
        this.f14174c.clear();
    }

    public void c() {
        if (v.a()) {
            this.f14172a.b("CountdownManager", "Stopping countdowns...");
        }
        this.f14175d.incrementAndGet();
        this.f14173b.removeCallbacksAndMessages((Object) null);
    }
}

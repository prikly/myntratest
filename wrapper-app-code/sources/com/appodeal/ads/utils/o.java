package com.appodeal.ads.utils;

import android.os.Handler;
import android.os.Looper;
import com.appodeal.ads.l;
import java.util.Collection;
import java.util.HashMap;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f17549a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public static HashMap f17550b = new HashMap();

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final l f17551a;

        /* renamed from: b  reason: collision with root package name */
        public final b f17552b;

        /* renamed from: c  reason: collision with root package name */
        public final long f17553c;

        public a(l lVar, b bVar) {
            this.f17551a = lVar;
            this.f17552b = bVar;
            this.f17553c = (lVar.getExpTime() * 1000) + System.currentTimeMillis();
        }

        public final void run() {
            o.b(this.f17551a);
            b bVar = this.f17552b;
            if (bVar != null) {
                bVar.a(this.f17551a);
            }
        }
    }

    public interface b<AdObjectType extends l> {
        void a(AdObjectType adobjecttype);
    }

    public static void a(l lVar) {
        a aVar;
        if (lVar != null && lVar.f16570c.getExpTime() > 0 && (aVar = (a) f17550b.get(lVar)) != null) {
            long currentTimeMillis = aVar.f17553c - System.currentTimeMillis();
            if (currentTimeMillis > 0) {
                Runnable runnable = (Runnable) f17550b.get(lVar);
                if (runnable != null) {
                    f17549a.removeCallbacks(runnable);
                }
                f17549a.postDelayed(aVar, currentTimeMillis);
                return;
            }
            aVar.run();
        }
    }

    public static void a(Collection<? extends l> collection) {
        if (collection != null) {
            for (l b2 : collection) {
                b(b2);
            }
        }
    }

    public static void b(l lVar) {
        if (lVar != null) {
            Runnable runnable = (Runnable) f17550b.get(lVar);
            if (runnable != null) {
                f17549a.removeCallbacks(runnable);
            }
            f17550b.remove(lVar);
        }
    }
}

package com.appodeal.ads;

import com.appodeal.ads.utils.Log;
import com.explorestack.iab.vast.TrackingEvent;
import java.util.TimerTask;

public final class f2 extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g2 f16406a;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g2 g2Var = f2.this.f16406a;
            String str = g2.x;
            g2Var.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r0 = r2.f16408a.f16406a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r2 = this;
                com.appodeal.ads.f2 r0 = com.appodeal.ads.f2.this
                com.appodeal.ads.g2 r0 = r0.f16406a
                java.lang.String r1 = com.appodeal.ads.g2.x
                r0.d()
                boolean r0 = com.appodeal.ads.Native.f16129e
                if (r0 == 0) goto L_0x0015
                com.appodeal.ads.f2 r0 = com.appodeal.ads.f2.this
                com.appodeal.ads.g2 r0 = r0.f16406a
                boolean r0 = r0.s
                if (r0 == 0) goto L_0x0023
            L_0x0015:
                com.appodeal.ads.f2 r0 = com.appodeal.ads.f2.this
                com.appodeal.ads.g2 r0 = r0.f16406a
                java.util.Timer r1 = r0.i
                if (r1 == 0) goto L_0x0023
                r1.cancel()
                r1 = 0
                r0.i = r1
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.f2.b.run():void");
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public final void run() {
            g2 g2Var = f2.this.f16406a;
            String str = g2.x;
            g2Var.f();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            g2 g2Var = f2.this.f16406a;
            String str = g2.x;
            g2Var.a();
        }
    }

    public f2(g2 g2Var) {
        this.f16406a = g2Var;
    }

    public final void run() {
        Runnable cVar;
        int currentPosition;
        TrackingEvent trackingEvent;
        g2 g2Var;
        try {
            if (this.f16406a.r) {
                h5.a(new a());
                return;
            }
            if (!g2.b(this.f16406a)) {
                cVar = new b();
            } else {
                if (this.f16406a.c() && this.f16406a.f16427g.isPlaying()) {
                    if (this.f16406a.u == 0) {
                        g2 g2Var2 = this.f16406a;
                        g2Var2.u = g2Var2.f16427g.getDuration();
                    }
                    if (this.f16406a.u != 0 && (currentPosition = (this.f16406a.f16427g.getCurrentPosition() * 100) / this.f16406a.u) >= this.f16406a.v * 25) {
                        if (this.f16406a.v == 0) {
                            Log.log(g2.x, "Video", String.format("started: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                            g2Var = this.f16406a;
                            trackingEvent = TrackingEvent.start;
                        } else if (this.f16406a.v == 1) {
                            Log.log(g2.x, "Video", String.format("at first quartile: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                            g2Var = this.f16406a;
                            trackingEvent = TrackingEvent.firstQuartile;
                        } else if (this.f16406a.v == 2) {
                            Log.log(g2.x, "Video", String.format("at midpoint: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                            g2Var = this.f16406a;
                            trackingEvent = TrackingEvent.midpoint;
                        } else {
                            if (this.f16406a.v == 3) {
                                Log.log(g2.x, "Video", String.format("at third quartile: %s%%", new Object[]{Integer.valueOf(currentPosition)}));
                                g2Var = this.f16406a;
                                trackingEvent = TrackingEvent.thirdQuartile;
                            }
                            g2.e(this.f16406a);
                        }
                        g2.a(g2Var, trackingEvent);
                        g2.e(this.f16406a);
                    }
                }
                cVar = new c();
            }
            h5.a(cVar);
        } catch (Throwable th) {
            Log.log(th);
            h5.a(new d());
        }
    }
}

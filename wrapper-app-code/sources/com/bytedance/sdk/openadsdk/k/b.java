package com.bytedance.sdk.openadsdk.k;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.j;
import com.bytedance.sdk.openadsdk.core.i.e;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.l;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: TrackAdUrlImpl */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2081a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final g f2082b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f2083c = Executors.newSingleThreadExecutor();

    public b(Context context, g gVar) {
        this.f2081a = context;
        this.f2082b = gVar;
    }

    public Context c() {
        Context context = this.f2081a;
        return context == null ? m.a() : context;
    }

    public void a(final List<String> list) {
        if (e.a()) {
            com.bytedance.sdk.component.f.e.b(new g("trackUrls") {
                public void run() {
                    if (j.b(list)) {
                        for (String fVar : list) {
                            new a(new f(l.a() + "_" + System.currentTimeMillis(), fVar, 5)).executeOnExecutor(b.this.f2083c, new Void[0]);
                        }
                    }
                }
            }, 5);
        }
    }

    public void a() {
        com.bytedance.sdk.component.f.e.b((g) new g("trackFailedUrls") {
            public void run() {
                b.this.b(b.this.f2082b.a());
            }
        });
    }

    public void b() {
        try {
            this.f2083c.shutdownNow();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    public void b(List<f> list) {
        if (j.b(list)) {
            for (f aVar : list) {
                new a(aVar).executeOnExecutor(this.f2083c, new Void[0]);
            }
        }
    }

    /* compiled from: TrackAdUrlImpl */
    private class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b  reason: collision with root package name */
        private final f f2088b;

        private a(f fVar) {
            this.f2088b = fVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:21|22|23|24|25|26|29|(3:31|32|(3:49|34|(1:36)(0)))|37|(1:39)|40|(3:51|42|(1:44)(0))(3:45|54|48)) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
            r4 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0085 A[SYNTHETIC, Splitter:B:31:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[Catch:{ all -> 0x0125 }] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0118 A[Catch:{ all -> 0x0125 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r4) {
            /*
                r3 = this;
                boolean r4 = com.bytedance.sdk.openadsdk.core.i.e.a()
                r0 = 0
                if (r4 != 0) goto L_0x0008
                return r0
            L_0x0008:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f2088b
                java.lang.String r4 = r4.b()
                boolean r4 = r3.a((java.lang.String) r4)
                if (r4 != 0) goto L_0x0015
                return r0
            L_0x0015:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f2088b
                int r4 = r4.c()
                if (r4 != 0) goto L_0x0029
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.k.b.this
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f2082b
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f2088b
                r4.c(r1)
                return r0
            L_0x0029:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f2088b
                int r4 = r4.c()
                if (r4 <= 0) goto L_0x0128
                boolean r4 = r3.isCancelled()
                if (r4 != 0) goto L_0x0128
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f2088b     // Catch:{ all -> 0x0125 }
                int r4 = r4.c()     // Catch:{ all -> 0x0125 }
                r1 = 5
                if (r4 != r1) goto L_0x004b
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.k.b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f2082b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f2088b     // Catch:{ all -> 0x0125 }
                r4.a(r1)     // Catch:{ all -> 0x0125 }
            L_0x004b:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.k.b.this     // Catch:{ all -> 0x0125 }
                android.content.Context r4 = r4.c()     // Catch:{ all -> 0x0125 }
                boolean r4 = com.bytedance.sdk.component.utils.o.a((android.content.Context) r4)     // Catch:{ all -> 0x0125 }
                if (r4 != 0) goto L_0x0059
                goto L_0x0128
            L_0x0059:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f2088b     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.b()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.i.d r1 = com.bytedance.sdk.openadsdk.i.d.a()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.e.a r1 = r1.b()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.e.b.b r1 = r1.c()     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = com.bytedance.sdk.openadsdk.utils.s.b(r4)     // Catch:{ all -> 0x0125 }
                r1.a((java.lang.String) r4)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = "User-Agent"
                java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.u.b()     // Catch:{ Exception -> 0x007b }
                r1.b(r4, r2)     // Catch:{ Exception -> 0x007b }
            L_0x007b:
                com.bytedance.sdk.component.e.b r4 = r1.a()     // Catch:{ all -> 0x0080 }
                goto L_0x0081
            L_0x0080:
                r4 = r0
            L_0x0081:
                java.lang.String r1 = "trackurl"
                if (r4 == 0) goto L_0x00b7
                boolean r4 = r4.f()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x00b7
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.k.b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f2082b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f2088b     // Catch:{ all -> 0x0125 }
                r4.c(r2)     // Catch:{ all -> 0x0125 }
                boolean r4 = com.bytedance.sdk.component.utils.l.c()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x0128
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
                r4.<init>()     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = "track success : "
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f2088b     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = r2.b()     // Catch:{ all -> 0x0125 }
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.utils.l.c(r1, r4)     // Catch:{ all -> 0x0125 }
                goto L_0x0128
            L_0x00b7:
                boolean r4 = com.bytedance.sdk.component.utils.l.c()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x00d7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
                r4.<init>()     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = "track fail : "
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f2088b     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = r2.b()     // Catch:{ all -> 0x0125 }
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.utils.l.c(r1, r4)     // Catch:{ all -> 0x0125 }
            L_0x00d7:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f2088b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f2088b     // Catch:{ all -> 0x0125 }
                int r2 = r2.c()     // Catch:{ all -> 0x0125 }
                int r2 = r2 + -1
                r4.a(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f2088b     // Catch:{ all -> 0x0125 }
                int r4 = r4.c()     // Catch:{ all -> 0x0125 }
                if (r4 != 0) goto L_0x0118
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.k.b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f2082b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f2088b     // Catch:{ all -> 0x0125 }
                r4.c(r2)     // Catch:{ all -> 0x0125 }
                boolean r4 = com.bytedance.sdk.component.utils.l.c()     // Catch:{ all -> 0x0125 }
                if (r4 == 0) goto L_0x0128
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
                r4.<init>()     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = "track fail and delete : "
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f2088b     // Catch:{ all -> 0x0125 }
                java.lang.String r2 = r2.b()     // Catch:{ all -> 0x0125 }
                r4.append(r2)     // Catch:{ all -> 0x0125 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.component.utils.l.c(r1, r4)     // Catch:{ all -> 0x0125 }
                goto L_0x0128
            L_0x0118:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.k.b.this     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f2082b     // Catch:{ all -> 0x0125 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f2088b     // Catch:{ all -> 0x0125 }
                r4.b(r1)     // Catch:{ all -> 0x0125 }
                goto L_0x0029
            L_0x0125:
                goto L_0x0029
            L_0x0128:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.k.b.a.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }

    public static a d() {
        return d.c();
    }
}

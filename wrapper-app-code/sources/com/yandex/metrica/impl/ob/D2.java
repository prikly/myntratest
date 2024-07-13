package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

public class D2 {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0564mm<C0315cm>> f3844a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private C0315cm f3845b;

    class a implements C0564mm<C0315cm> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f3846a;

        a(D2 d2, String str) {
            this.f3846a = str;
        }

        public void b(Object obj) {
            C0315cm cmVar = (C0315cm) obj;
            if (cmVar.isEnabled()) {
                cmVar.w(this.f3846a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r0 = new com.yandex.metrica.impl.ob.E2(r2, r3, "WebView interface setup failed because of an exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3 = r2.f3845b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r3 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        r2.f3844a.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        r0.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.webkit.WebView r3, com.yandex.metrica.impl.ob.Uf r4) {
        /*
            r2 = this;
            r0 = 17
            boolean r0 = com.yandex.metrica.impl.ob.A2.a((int) r0)
            if (r0 == 0) goto L_0x0061
            android.webkit.WebSettings r0 = r3.getSettings()     // Catch:{ all -> 0x0046 }
            boolean r0 = r0.getJavaScriptEnabled()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0040
            com.yandex.metrica.AppMetricaJsInterface r0 = new com.yandex.metrica.AppMetricaJsInterface     // Catch:{ all -> 0x0046 }
            r0.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "AppMetrica"
            r3.addJavascriptInterface(r0, r1)     // Catch:{ all -> 0x0046 }
            com.yandex.metrica.AppMetricaInitializerJsInterface r0 = new com.yandex.metrica.AppMetricaInitializerJsInterface     // Catch:{ all -> 0x0046 }
            r0.<init>(r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r4 = "AppMetricaInitializer"
            r3.addJavascriptInterface(r0, r4)     // Catch:{ all -> 0x0046 }
            java.lang.String r3 = "WebView interface setup is successful."
            com.yandex.metrica.impl.ob.C2 r4 = new com.yandex.metrica.impl.ob.C2     // Catch:{ all -> 0x0046 }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x0046 }
            monitor-enter(r2)     // Catch:{ all -> 0x0046 }
            com.yandex.metrica.impl.ob.cm r3 = r2.f3845b     // Catch:{ all -> 0x003d }
            if (r3 != 0) goto L_0x0038
            java.util.List<com.yandex.metrica.impl.ob.mm<com.yandex.metrica.impl.ob.cm>> r3 = r2.f3844a     // Catch:{ all -> 0x003d }
            r3.add(r4)     // Catch:{ all -> 0x003d }
            goto L_0x003b
        L_0x0038:
            r4.b(r3)     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0040:
            java.lang.String r3 = "WebView interface setup failed because javascript is disabled for the WebView."
            r2.a((java.lang.String) r3)     // Catch:{ all -> 0x0046 }
            goto L_0x0066
        L_0x0046:
            r3 = move-exception
            java.lang.String r4 = "WebView interface setup failed because of an exception."
            com.yandex.metrica.impl.ob.E2 r0 = new com.yandex.metrica.impl.ob.E2
            r0.<init>(r2, r3, r4)
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.cm r3 = r2.f3845b     // Catch:{ all -> 0x005e }
            if (r3 != 0) goto L_0x0059
            java.util.List<com.yandex.metrica.impl.ob.mm<com.yandex.metrica.impl.ob.cm>> r3 = r2.f3844a     // Catch:{ all -> 0x005e }
            r3.add(r0)     // Catch:{ all -> 0x005e }
            goto L_0x005c
        L_0x0059:
            r0.b(r3)     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r2)
            goto L_0x0066
        L_0x005e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0061:
            java.lang.String r3 = "WebView interface is not available on Android < 17."
            r2.a((java.lang.String) r3)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.D2.a(android.webkit.WebView, com.yandex.metrica.impl.ob.Uf):void");
    }

    public void a(C0315cm cmVar) {
        synchronized (this) {
            this.f3845b = cmVar;
        }
        for (C0564mm<C0315cm> b2 : this.f3844a) {
            b2.b(cmVar);
        }
        this.f3844a.clear();
    }

    private void a(String str) {
        a aVar = new a(this, str);
        synchronized (this) {
            C0315cm cmVar = this.f3845b;
            if (cmVar == null) {
                this.f3844a.add(aVar);
            } else {
                aVar.b(cmVar);
            }
        }
    }
}

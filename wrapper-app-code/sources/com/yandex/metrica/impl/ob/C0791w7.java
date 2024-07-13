package com.yandex.metrica.impl.ob;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.w7  reason: case insensitive filesystem */
public class C0791w7 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7023a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public LocalServerSocket f7024b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f7025c;

    /* renamed from: d  reason: collision with root package name */
    private final B7 f7026d;

    /* renamed from: e  reason: collision with root package name */
    private final C0564mm<String> f7027e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7028f;

    /* renamed from: g  reason: collision with root package name */
    private List<C0564mm<String>> f7029g;

    /* renamed from: h  reason: collision with root package name */
    private final Thread f7030h;

    /* renamed from: com.yandex.metrica.impl.ob.w7$a */
    class a extends Thread {
        a() {
        }

        public void run() {
            while (C0791w7.this.f7025c) {
                try {
                    LocalSocket accept = C0791w7.this.f7024b.accept();
                    byte[] bArr = new byte[256];
                    int read = accept.getInputStream().read(bArr);
                    accept.close();
                    byte[] bArr2 = new byte[read];
                    System.arraycopy(bArr, 0, bArr2, 0, read);
                    C0791w7.a(C0791w7.this, new String(bArr2));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.w7$b */
    class b implements C0564mm<String> {
        b() {
        }

        public void b(Object obj) {
            CrashpadServiceHelper.setUpServiceHelper((String) obj);
        }
    }

    public C0791w7(String str, String str2) {
        this(str, str2, B7.a(), new b());
    }

    C0791w7(String str, String str2, B7 b7, C0564mm<String> mmVar) {
        this.f7025c = false;
        this.f7029g = new LinkedList();
        this.f7030h = new a();
        this.f7023a = str;
        this.f7028f = str2;
        this.f7026d = b7;
        this.f7027e = mmVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|(3:12|13|(1:15))|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.yandex.metrica.impl.ob.C0564mm<java.lang.String> r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.List<com.yandex.metrica.impl.ob.mm<java.lang.String>> r0 = r1.f7029g     // Catch:{ all -> 0x003a }
            r0.add(r2)     // Catch:{ all -> 0x003a }
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            boolean r2 = r1.f7025c
            if (r2 != 0) goto L_0x0039
            java.lang.String r2 = r1.f7028f
            if (r2 == 0) goto L_0x0039
            monitor-enter(r1)
            boolean r2 = r1.f7025c     // Catch:{ all -> 0x0036 }
            if (r2 != 0) goto L_0x0034
            com.yandex.metrica.impl.ob.B7 r2 = r1.f7026d     // Catch:{ all -> 0x0034 }
            boolean r2 = r2.b()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0034
            android.net.LocalServerSocket r2 = new android.net.LocalServerSocket     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r1.f7023a     // Catch:{ all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ all -> 0x0034 }
            r1.f7024b = r2     // Catch:{ all -> 0x0034 }
            r2 = 1
            r1.f7025c = r2     // Catch:{ all -> 0x0034 }
            com.yandex.metrica.impl.ob.mm<java.lang.String> r2 = r1.f7027e     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = r1.f7028f     // Catch:{ all -> 0x0034 }
            r2.b(r0)     // Catch:{ all -> 0x0034 }
            java.lang.Thread r2 = r1.f7030h     // Catch:{ all -> 0x0034 }
            r2.start()     // Catch:{ all -> 0x0034 }
        L_0x0034:
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0036 }
            throw r2
        L_0x0039:
            return
        L_0x003a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0791w7.a(com.yandex.metrica.impl.ob.mm):void");
    }

    public synchronized void b(C0564mm<String> mmVar) {
        this.f7029g.remove(mmVar);
    }

    static void a(C0791w7 w7Var, String str) {
        synchronized (w7Var) {
            for (C0564mm<String> b2 : w7Var.f7029g) {
                b2.b(str);
            }
        }
    }
}

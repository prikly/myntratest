package com.bytedance.sdk.openadsdk.core.g;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PermissionsResultAction */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1200a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f1201b = new HashSet(1);

    /* renamed from: c  reason: collision with root package name */
    private Looper f1202c = Looper.getMainLooper();

    public abstract void a();

    public abstract void a(String str);

    public synchronized boolean b(String str) {
        String str2 = f1200a;
        Log.d(str2, "Permission not found: " + str);
        return true;
    }

    /* access modifiers changed from: protected */
    public final synchronized boolean a(String str, int i) {
        if (i == 0) {
            return a(str, c.GRANTED);
        }
        return a(str, c.DENIED);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.g.e$5  reason: invalid class name */
    /* compiled from: PermissionsResultAction */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1209a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.g.c[] r0 = com.bytedance.sdk.openadsdk.core.g.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1209a = r0
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.g.c.GRANTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1209a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.g.c.DENIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1209a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.g.c r1 = com.bytedance.sdk.openadsdk.core.g.c.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.g.e.AnonymousClass5.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized boolean a(final String str, c cVar) {
        this.f1201b.remove(str);
        int i = AnonymousClass5.f1209a[cVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                new Handler(this.f1202c).post(new Runnable() {
                    public void run() {
                        e.this.a(str);
                    }
                });
                return true;
            } else if (i == 3) {
                if (!b(str)) {
                    new Handler(this.f1202c).post(new Runnable() {
                        public void run() {
                            e.this.a(str);
                        }
                    });
                    return true;
                } else if (this.f1201b.isEmpty()) {
                    new Handler(this.f1202c).post(new Runnable() {
                        public void run() {
                            e.this.a();
                        }
                    });
                    return true;
                }
            }
        } else if (this.f1201b.isEmpty()) {
            new Handler(this.f1202c).post(new Runnable() {
                public void run() {
                    e.this.a();
                }
            });
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(String[] strArr) {
        Collections.addAll(this.f1201b, strArr);
    }
}

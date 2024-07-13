package com.ironsource.sdk.controller;

import com.ironsource.sdk.a.d;
import com.ironsource.sdk.h.c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONObject;

final class f {

    /* renamed from: a  reason: collision with root package name */
    long f9112a;

    /* renamed from: b  reason: collision with root package name */
    int f9113b;

    /* renamed from: c  reason: collision with root package name */
    int f9114c;

    /* renamed from: d  reason: collision with root package name */
    b f9115d = b.NONE;

    /* renamed from: e  reason: collision with root package name */
    private String f9116e;

    /* renamed from: f  reason: collision with root package name */
    private String f9117f;

    /* renamed from: g  reason: collision with root package name */
    private com.ironsource.sdk.k.b f9118g;

    /* renamed from: com.ironsource.sdk.controller.f$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9120a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|(2:1|2)|3|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
        static {
            /*
                int[] r0 = com.ironsource.sdk.controller.f.a.a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9120a = r0
                r1 = 1
                int r2 = com.ironsource.sdk.controller.f.a.f9121a     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                r0 = 2
                int[] r2 = f9120a     // Catch:{ NoSuchFieldError -> 0x0016 }
                int r3 = com.ironsource.sdk.controller.f.a.f9122b     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                int[] r1 = f9120a     // Catch:{ NoSuchFieldError -> 0x001d }
                int r2 = com.ironsource.sdk.controller.f.a.f9123c     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 3
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.f.AnonymousClass2.<clinit>():void");
        }
    }

    public enum a {
        ;
        

        /* renamed from: a  reason: collision with root package name */
        public static final int f9121a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f9122b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f9123c = 3;

        static {
            f9124d = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[]) f9124d.clone();
        }
    }

    public enum b {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);
        

        /* renamed from: g  reason: collision with root package name */
        int f9132g;

        private b(int i) {
            this.f9132g = i;
        }
    }

    f(JSONObject jSONObject, String str, String str2, com.ironsource.sdk.k.b bVar) {
        int optInt = jSONObject.optInt("controllerSourceStrategy", -1);
        this.f9113b = optInt;
        this.f9114c = optInt != 1 ? optInt != 2 ? a.f9121a : a.f9123c : a.f9122b;
        this.f9116e = str;
        this.f9117f = str2;
        this.f9118g = bVar;
    }

    private void a(c cVar) {
        if (!this.f9118g.b()) {
            this.f9118g.a(cVar, this.f9117f);
        }
    }

    private c g() {
        return new c(this.f9116e, "next_mobileController.html");
    }

    private c h() {
        return new c(this.f9116e, "fallback_mobileController.html");
    }

    private void i() {
        try {
            c d2 = d();
            if (d2.exists()) {
                c h2 = h();
                if (h2.exists()) {
                    h2.delete();
                }
                IronSourceStorageUtils.renameFile(d2.getPath(), h2.getPath());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(this.f9113b)).a("controllersource", Integer.valueOf(bVar.f9132g));
        if (this.f9112a > 0) {
            a2.a("timingvalue", Long.valueOf(System.currentTimeMillis() - this.f9112a));
        }
        d.a(com.ironsource.sdk.a.f.s, (Map<String, Object>) a2.f8990a);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f9115d != b.NONE;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        c cVar;
        int i = AnonymousClass2.f9120a[this.f9114c - 1];
        if (i == 1) {
            IronSourceStorageUtils.deleteFile(d());
            cVar = new c(this.f9116e, SDKUtils.getFileName(this.f9117f));
        } else if (i != 2) {
            if (i == 3) {
                try {
                    c d2 = d();
                    c g2 = g();
                    if (!g2.exists() && !d2.exists()) {
                        a(new c(this.f9116e, SDKUtils.getFileName(this.f9117f)));
                        return false;
                    } else if (g2.exists() || !d2.exists()) {
                        i();
                        if (IronSourceStorageUtils.renameFile(g().getPath(), d().getPath())) {
                            b bVar = b.PREPARED_CONTROLLER_LOADED;
                            this.f9115d = bVar;
                            a(bVar);
                            c();
                            a(new c(this.f9116e, g2.getName()));
                            return true;
                        } else if (e()) {
                            b bVar2 = b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                            this.f9115d = bVar2;
                            a(bVar2);
                            a(new c(this.f9116e, g2.getName()));
                            return true;
                        } else {
                            a(new c(this.f9116e, SDKUtils.getFileName(this.f9117f)));
                        }
                    } else {
                        b bVar3 = b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                        this.f9115d = bVar3;
                        a(bVar3);
                        a(new c(this.f9116e, g2.getName()));
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } else {
            i();
            cVar = new c(this.f9116e, SDKUtils.getFileName(this.f9117f));
        }
        a(cVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        IronSourceStorageUtils.deleteFile(h());
    }

    /* access modifiers changed from: package-private */
    public final c d() {
        return new c(this.f9116e, "mobileController.html");
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        try {
            if (!h().exists()) {
                return false;
            }
            return IronSourceStorageUtils.renameFile(h().getPath(), d().getPath());
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final JSONObject f() {
        return new JSONObject() {
            {
                putOpt("controllerSourceStrategy", Integer.valueOf(f.this.f9113b));
                putOpt("controllerSourceCode", Integer.valueOf(f.this.f9115d.f9132g));
            }
        };
    }
}

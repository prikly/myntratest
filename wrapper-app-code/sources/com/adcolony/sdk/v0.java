package com.adcolony.sdk;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.adcolony.sdk.e0;
import java.io.File;

class v0 {

    /* renamed from: a  reason: collision with root package name */
    private String f10346a;

    /* renamed from: b  reason: collision with root package name */
    private String f10347b;

    /* renamed from: c  reason: collision with root package name */
    private String f10348c;

    /* renamed from: d  reason: collision with root package name */
    private String f10349d;

    /* renamed from: e  reason: collision with root package name */
    private File f10350e;

    /* renamed from: f  reason: collision with root package name */
    private File f10351f;

    /* renamed from: g  reason: collision with root package name */
    private File f10352g;

    v0() {
    }

    private long b(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    private long c(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? d(statFs) : (long) statFs.getBlockSize();
    }

    private long d(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    /* access modifiers changed from: package-private */
    public double a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return (double) (a(statFs) * c(statFs));
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        k b2 = a.b();
        this.f10346a = f() + "/adc3/";
        this.f10347b = this.f10346a + "media/";
        File file = new File(this.f10347b);
        this.f10350e = file;
        if (!file.isDirectory()) {
            this.f10350e.delete();
            this.f10350e.mkdirs();
        }
        if (!this.f10350e.isDirectory()) {
            b2.b(true);
            return false;
        } else if (a(this.f10347b) < 2.097152E7d) {
            new e0.a().a("Not enough memory available at media path, disabling AdColony.").a(e0.f10043f);
            b2.b(true);
            return false;
        } else {
            this.f10348c = f() + "/adc3/data/";
            File file2 = new File(this.f10348c);
            this.f10351f = file2;
            if (!file2.isDirectory()) {
                this.f10351f.delete();
            }
            this.f10351f.mkdirs();
            this.f10349d = this.f10346a + "tmp/";
            File file3 = new File(this.f10349d);
            this.f10352g = file3;
            if (!file3.isDirectory()) {
                this.f10352g.delete();
                this.f10352g.mkdirs();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public String f() {
        Context a2 = a.a();
        if (a2 == null) {
            return "";
        }
        return a2.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    public f1 g() {
        if (!new File(a() + "AppVersion").exists()) {
            return c0.b();
        }
        return c0.c(a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    public boolean h() {
        File file = this.f10350e;
        if (file == null || this.f10351f == null || this.f10352g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f10350e.delete();
        }
        if (!this.f10351f.isDirectory()) {
            this.f10351f.delete();
        }
        if (!this.f10352g.isDirectory()) {
            this.f10352g.delete();
        }
        this.f10350e.mkdirs();
        this.f10351f.mkdirs();
        this.f10352g.mkdirs();
        return true;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f10348c;
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f10347b;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f10349d;
    }

    private long a(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? b(statFs) : (long) statFs.getAvailableBlocks();
    }

    /* access modifiers changed from: package-private */
    public void a(f1 f1Var) {
        c0.j(f1Var, a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f10346a;
    }
}

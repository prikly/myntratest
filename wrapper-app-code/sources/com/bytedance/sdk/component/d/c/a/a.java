package com.bytedance.sdk.component.d.c.a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.sdk.component.d.b;
import java.io.File;

/* compiled from: CacheConfig */
public class a implements b, Cloneable {

    /* renamed from: f  reason: collision with root package name */
    private static volatile b f18958f;

    /* renamed from: a  reason: collision with root package name */
    private long f18959a;

    /* renamed from: b  reason: collision with root package name */
    private int f18960b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18961c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f18962d;

    /* renamed from: e  reason: collision with root package name */
    private File f18963e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public a(int i, long j, boolean z, boolean z2, File file) {
        this.f18959a = j;
        this.f18960b = i;
        this.f18961c = z;
        this.f18962d = z2;
        this.f18963e = file;
    }

    public long a() {
        return this.f18959a;
    }

    public int b() {
        return this.f18960b;
    }

    public boolean c() {
        return this.f18961c;
    }

    public boolean d() {
        return this.f18962d;
    }

    public File e() {
        return this.f18963e;
    }

    public static void a(Context context, b bVar) {
        if (bVar != null) {
            f18958f = bVar;
        } else {
            f18958f = a(new File(context.getCacheDir(), "image"));
        }
    }

    public static b a(File file) {
        long j;
        int i;
        file.mkdirs();
        if (f18958f == null) {
            i = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            j = Math.min(g() / 16, 41943040);
        } else {
            i = Math.min(f18958f.b() / 2, 31457280);
            j = Math.min(f18958f.a() / 2, 41943040);
        }
        return new a(Math.max(i, 26214400), Math.max(j, 20971520), file);
    }

    public static b f() {
        return f18958f;
    }

    private static long g() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}

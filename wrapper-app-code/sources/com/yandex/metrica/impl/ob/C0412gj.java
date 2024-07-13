package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.gj  reason: case insensitive filesystem */
public class C0412gj implements C0312cj {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5879a;

    /* renamed from: b  reason: collision with root package name */
    private final B0 f5880b;

    C0412gj(Context context, B0 b0) {
        this.f5879a = context;
        this.f5880b = b0;
    }

    private boolean b() {
        boolean z;
        File file;
        File c2 = this.f5880b.c(this.f5879a);
        if (c2 != null) {
            this.f5880b.getClass();
            z = new File(c2, "metrica_data.db").exists();
        } else {
            z = false;
        }
        if (!z && A2.a(21)) {
            B0 b0 = this.f5880b;
            Context context = this.f5879a;
            b0.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                file = null;
            } else {
                file = new File(noBackupFilesDir, "metrica_data.db");
            }
            z = file != null && file.exists();
        }
        if (z) {
            return z;
        }
        B0 b02 = this.f5880b;
        Context context2 = this.f5879a;
        b02.getClass();
        File databasePath = context2.getDatabasePath("metrica_data.db");
        if (databasePath == null || !databasePath.exists()) {
            return false;
        }
        return true;
    }

    public boolean a() {
        return !b();
    }
}

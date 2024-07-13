package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ka  reason: case insensitive filesystem */
class C0502ka {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6087a;

    /* renamed from: b  reason: collision with root package name */
    private final B0 f6088b;

    C0502ka(Context context, B0 b0) {
        this.f6087a = context;
        this.f6088b = b0;
    }

    private String b(String str, File file) {
        this.f6088b.getClass();
        File file2 = new File(file, str);
        if (!file2.exists() && a(this.f6087a.getDatabasePath(str), file, str)) {
            String str2 = str + "-journal";
            a(this.f6087a.getDatabasePath(str2), file, str2);
            String str3 = str + "-shm";
            a(this.f6087a.getDatabasePath(str3), file, str3);
            String str4 = str + "-wal";
            a(this.f6087a.getDatabasePath(str4), file, str4);
        }
        return file2.getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    public String a(String str, File file) {
        File noBackupFilesDir;
        try {
            this.f6088b.getClass();
            File file2 = new File(file, str);
            if (file2.exists()) {
                return file2.getAbsolutePath();
            }
            if (A2.a(21) && (noBackupFilesDir = this.f6087a.getNoBackupFilesDir()) != null) {
                this.f6088b.getClass();
                if (a(new File(noBackupFilesDir, str), file, str)) {
                    String str2 = str + "-journal";
                    this.f6088b.getClass();
                    a(new File(noBackupFilesDir, str2), file, str2);
                    String str3 = str + "-shm";
                    this.f6088b.getClass();
                    a(new File(noBackupFilesDir, str3), file, str3);
                    String str4 = str + "-wal";
                    this.f6088b.getClass();
                    a(new File(noBackupFilesDir, str4), file, str4);
                    return file2.getAbsolutePath();
                }
            }
            return b(str, file);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        try {
            File noBackupFilesDir = this.f6087a.getNoBackupFilesDir();
            if (noBackupFilesDir == null) {
                return str;
            }
            return b(str, noBackupFilesDir);
        } catch (Throwable unused) {
            return str;
        }
    }

    private boolean a(File file, File file2, String str) {
        if (file == null || !file.exists()) {
            return false;
        }
        this.f6088b.getClass();
        File file3 = new File(file2, str);
        boolean renameTo = file.renameTo(file3);
        return !renameTo ? C0267b.a(file, file3) : renameTo;
    }
}

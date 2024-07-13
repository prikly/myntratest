package com.yandex.metrica.impl.ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.util.UUID;

/* renamed from: com.yandex.metrica.impl.ob.q0  reason: case insensitive filesystem */
public class C0641q0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6503a;

    /* renamed from: b  reason: collision with root package name */
    private final b f6504b;

    /* renamed from: com.yandex.metrica.impl.ob.q0$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f6505a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6506b;

        public a(long j, long j2) {
            this.f6505a = j;
            this.f6506b = j2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.q0$b */
    static class b {
        b() {
        }
    }

    public C0641q0(Context context) {
        this(context, new b());
    }

    public a a() {
        long j;
        long j2 = 0;
        if (A2.a(26)) {
            StorageStatsManager storageStatsManager = (StorageStatsManager) this.f6503a.getSystemService("storagestats");
            StorageManager storageManager = (StorageManager) this.f6503a.getSystemService("storage");
            if (storageManager == null || storageStatsManager == null) {
                j = 0;
            } else {
                long j3 = 0;
                for (StorageVolume uuid : storageManager.getStorageVolumes()) {
                    try {
                        String uuid2 = uuid.getUuid();
                        UUID fromString = uuid2 == null ? StorageManager.UUID_DEFAULT : UUID.fromString(uuid2);
                        j2 += storageStatsManager.getTotalBytes(fromString);
                        j3 += storageStatsManager.getFreeBytes(fromString);
                    } catch (Throwable unused) {
                    }
                }
                long j4 = j2;
                j2 = j3;
                j = j4;
            }
            return new a(j / 1024, j2 / 1024);
        } else if (A2.a(18)) {
            try {
                this.f6504b.getClass();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                return new a((statFs.getBlockCountLong() * blockSizeLong) / 1024, (statFs.getAvailableBlocksLong() * blockSizeLong) / 1024);
            } catch (Throwable unused2) {
                return new a(0, 0);
            }
        } else {
            try {
                this.f6504b.getClass();
                StatFs statFs2 = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSize = (long) statFs2.getBlockSize();
                return new a((((long) statFs2.getBlockCount()) * blockSize) / 1024, (((long) statFs2.getAvailableBlocks()) * blockSize) / 1024);
            } catch (Throwable unused3) {
                return new a(0, 0);
            }
        }
    }

    C0641q0(Context context, b bVar) {
        this.f6503a = context;
        this.f6504b = bVar;
    }
}

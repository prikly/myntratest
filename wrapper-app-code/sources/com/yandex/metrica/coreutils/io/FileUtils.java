package com.yandex.metrica.coreutils.io;

import android.content.Context;
import android.os.Build;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/metrica/coreutils/io/FileUtils;", "", "()V", "getStorageDirectory", "Ljava/io/File;", "context", "Landroid/content/Context;", "needToUseNoBackup", "", "core-utils_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FileUtils.kt */
public final class FileUtils {
    public static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {
    }

    public static final File getStorageDirectory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (needToUseNoBackup()) {
            return context.getNoBackupFilesDir();
        }
        return context.getFilesDir();
    }

    public static final boolean needToUseNoBackup() {
        return Build.VERSION.SDK_INT >= 21;
    }
}

package com.google.android.play.core.install;

import android.content.Intent;
import com.google.android.play.core.appupdate.internal.zzm;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public abstract class InstallState {
    public static InstallState zzb(Intent intent, zzm zzm) {
        Intent intent2 = intent;
        zzm zzm2 = zzm;
        zzm2.zza("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        zzm2.zza("Key: %s; value: %s", "install.status", Integer.valueOf(intent2.getIntExtra("install.status", 0)));
        zzm2.zza("Key: %s; value: %s", "error.code", Integer.valueOf(intent2.getIntExtra("error.code", 0)));
        return new zza(intent2.getIntExtra("install.status", 0), intent2.getLongExtra("bytes.downloaded", 0), intent2.getLongExtra("total.bytes.to.download", 0), intent2.getIntExtra("error.code", 0), intent2.getStringExtra("package.name"));
    }

    public abstract long bytesDownloaded();

    public abstract int installErrorCode();

    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();
}

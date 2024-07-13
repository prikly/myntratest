package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhfe extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhfe(zzbkh zzbkh, byte[] bArr) {
        this.zza = new WeakReference(zzbkh);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbkh zzbkh = (zzbkh) this.zza.get();
        if (zzbkh != null) {
            zzbkh.zzc(customTabsClient);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbkh zzbkh = (zzbkh) this.zza.get();
        if (zzbkh != null) {
            zzbkh.zzd();
        }
    }
}

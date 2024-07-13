package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzevd implements zzezm {
    private final zzgfc zza;
    private final Context zzb;

    zzevd(zzgfc zzgfc, Context context) {
        this.zza = zzgfc;
        this.zzb = context;
    }

    public final int zza() {
        return 14;
    }

    public final zzgfb zzb() {
        return this.zza.zzb(new zzevc(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeve zzc() throws Exception {
        Intent intent;
        double d2;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzje)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            intent = this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter);
        } else {
            intent = this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
        }
        boolean z = false;
        if (intent != null) {
            int intExtra = intent.getIntExtra("status", -1);
            d2 = ((double) intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((double) intent.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d2 = -1.0d;
        }
        return new zzeve(d2, z);
    }
}

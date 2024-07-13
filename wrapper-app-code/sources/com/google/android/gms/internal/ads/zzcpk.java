package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcpk {
    /* access modifiers changed from: private */
    public zzchu zza;
    /* access modifiers changed from: private */
    public Context zzb;
    /* access modifiers changed from: private */
    public WeakReference zzc;

    public final zzcpk zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcpk zzd(zzchu zzchu) {
        this.zza = zzchu;
        return this;
    }
}

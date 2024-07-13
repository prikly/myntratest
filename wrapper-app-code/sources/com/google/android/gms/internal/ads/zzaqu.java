package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaqu extends zzarx {
    private final Activity zzi;
    private final View zzj;

    public zzaqu(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2, View view, Activity activity) {
        super(zzaqj, "rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", zzaml, i, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj != null) {
            boolean booleanValue = ((Boolean) zzba.zzc().zzb(zzbjj.zzci)).booleanValue();
            Object[] objArr = (Object[]) this.zzf.invoke((Object) null, new Object[]{this.zzj, this.zzi, Boolean.valueOf(booleanValue)});
            synchronized (this.zze) {
                this.zze.zzc(((Long) objArr[0]).longValue());
                this.zze.zze(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.zze.zzd((String) objArr[2]);
                }
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaqw extends zzarx {
    public zzaqw(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2) {
        super(zzaqj, "9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", zzaml, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(3);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
            zzaml zzaml = this.zze;
            if (true == booleanValue) {
                i = 2;
            }
            zzaml.zzaa(i);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzarn extends zzarx {
    private List zzi = null;
    private final Context zzj;

    public zzarn(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2, Context context) {
        super(zzaqj, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", zzaml, i, 31);
        this.zzj = context;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzW(-1);
        this.zze.zzS(-1);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke((Object) null, new Object[]{context});
        }
        List list = this.zzi;
        if (list != null && list.size() == 2) {
            synchronized (this.zze) {
                this.zze.zzW(((Long) this.zzi.get(0)).longValue());
                this.zze.zzS(((Long) this.zzi.get(1)).longValue());
            }
        }
    }
}

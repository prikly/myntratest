package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzayp implements zzayl {
    private final zzayl[] zza;
    private final ArrayList zzb;
    private final zzatn zzc = new zzatn();
    private zzayk zzd;
    private zzato zze;
    private int zzf = -1;
    private zzayo zzg;

    public zzayp(zzayl... zzaylArr) {
        this.zza = zzaylArr;
        this.zzb = new ArrayList(Arrays.asList(zzaylArr));
    }

    static /* bridge */ /* synthetic */ void zzf(zzayp zzayp, int i, zzato zzato, Object obj) {
        zzayo zzayo;
        if (zzayp.zzg == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                zzato.zzg(i2, zzayp.zzc, false);
            }
            int i3 = zzayp.zzf;
            if (i3 == -1) {
                zzayp.zzf = 1;
            } else if (i3 != 1) {
                zzayo = new zzayo(1);
                zzayp.zzg = zzayo;
            }
            zzayo = null;
            zzayp.zzg = zzayo;
        }
        if (zzayp.zzg == null) {
            zzayp.zzb.remove(zzayp.zza[i]);
            if (i == 0) {
                zzayp.zze = zzato;
            }
            if (zzayp.zzb.isEmpty()) {
                zzayp.zzd.zzg(zzayp.zze, (Object) null);
            }
        }
    }

    public final void zza() throws IOException {
        zzayo zzayo = this.zzg;
        if (zzayo == null) {
            for (zzayl zza2 : this.zza) {
                zza2.zza();
            }
            return;
        }
        throw zzayo;
    }

    public final void zzb(zzast zzast, boolean z, zzayk zzayk) {
        this.zzd = zzayk;
        int i = 0;
        while (true) {
            zzayl[] zzaylArr = this.zza;
            if (i < zzaylArr.length) {
                zzaylArr[i].zzb(zzast, false, new zzayn(this, i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzc(zzayj zzayj) {
        zzaym zzaym = (zzaym) zzayj;
        int i = 0;
        while (true) {
            zzayl[] zzaylArr = this.zza;
            if (i < zzaylArr.length) {
                zzaylArr[i].zzc(zzaym.zza[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzd() {
        for (zzayl zzd2 : this.zza) {
            zzd2.zzd();
        }
    }

    public final zzayj zze(int i, zzazw zzazw) {
        int length = this.zza.length;
        zzayj[] zzayjArr = new zzayj[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzayjArr[i2] = this.zza[i2].zze(i, zzazw);
        }
        return new zzaym(zzayjArr);
    }
}

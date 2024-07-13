package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzett implements zzezm {
    private final zzezm zza;
    private final zzfjg zzb;
    private final Context zzc;
    private final zzcgx zzd;

    public zzett(zzevk zzevk, zzfjg zzfjg, Context context, zzcgx zzcgx) {
        this.zza = zzevk;
        this.zzb = zzfjg;
        this.zzc = context;
        this.zzd = zzcgx;
    }

    public final int zza() {
        return 7;
    }

    public final zzgfb zzb() {
        return zzger.zzm(this.zza.zzb(), new zzets(this), zzcib.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetu zzc(zzezr zzezr) {
        boolean z;
        String str;
        int i;
        int i2;
        float f2;
        String str2;
        int i3;
        DisplayMetrics displayMetrics;
        zzq zzq = this.zzb.zze;
        zzq[] zzqArr = zzq.zzg;
        if (zzqArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzq zzq2 : zzqArr) {
                boolean z4 = zzq2.zzi;
                if (!z4 && !z2) {
                    str = zzq2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzq.zza;
            z = zzq.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f2 = 0.0f;
            i2 = 0;
            i = 0;
        } else {
            float f3 = displayMetrics.density;
            int i4 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            str2 = this.zzd.zzh().zzm();
            i2 = i4;
            f2 = f3;
        }
        StringBuilder sb = new StringBuilder();
        zzq[] zzqArr2 = zzq.zzg;
        if (zzqArr2 != null) {
            boolean z5 = false;
            for (zzq zzq3 : zzqArr2) {
                if (zzq3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i5 = zzq3.zze;
                    if (i5 == -1) {
                        i5 = f2 != 0.0f ? (int) (((float) zzq3.zzf) / f2) : -1;
                    }
                    sb.append(i5);
                    sb.append("x");
                    int i6 = zzq3.zzb;
                    if (i6 == -2) {
                        i6 = f2 != 0.0f ? (int) (((float) zzq3.zzc) / f2) : -2;
                    }
                    sb.append(i6);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzetu(zzq, str, z, sb.toString(), f2, i2, i, str2, this.zzb.zzp);
    }
}

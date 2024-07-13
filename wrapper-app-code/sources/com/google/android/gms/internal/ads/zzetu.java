package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import io.bidmachine.utils.IabUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzetu implements zzezl {
    public final zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzetu(zzq zzq, String str, boolean z, String str2, float f2, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzq, "the adSize must not be null");
        this.zza = zzq;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f2;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfjr.zzf(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfjr.zzf(bundle, "smart_h", "auto", this.zza.zzb == -2);
        zzfjr.zzg(bundle, "ene", true, this.zza.zzj);
        zzfjr.zzf(bundle, "rafmt", "102", this.zza.zzm);
        zzfjr.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfjr.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfjr.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfjr.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfjr.zzc(bundle, "format", this.zzb);
        zzfjr.zzf(bundle, "fluid", IabUtils.KEY_HEIGHT, this.zzc);
        String str = this.zzd;
        zzfjr.zzf(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzfjr.zzf(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzq[] zzqArr = this.zza.zzg;
        if (zzqArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(IabUtils.KEY_HEIGHT, this.zza.zzb);
            bundle2.putInt(IabUtils.KEY_WIDTH, this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzq : zzqArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzq.zzi);
                bundle3.putInt(IabUtils.KEY_HEIGHT, zzq.zzb);
                bundle3.putInt(IabUtils.KEY_WIDTH, zzq.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}

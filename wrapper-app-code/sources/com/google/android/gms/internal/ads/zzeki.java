package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeki implements DialogInterface.OnCancelListener {
    public final /* synthetic */ zzekc zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzdzh zzc;
    public final /* synthetic */ Activity zzd;
    public final /* synthetic */ zzfnt zze;
    public final /* synthetic */ zzl zzf;

    public /* synthetic */ zzeki(zzekc zzekc, String str, zzdzh zzdzh, Activity activity, zzfnt zzfnt, zzl zzl) {
        this.zza = zzekc;
        this.zzb = str;
        this.zzc = zzdzh;
        this.zzd = activity;
        this.zze = zzfnt;
        this.zzf = zzl;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        zzekc zzekc = this.zza;
        String str = this.zzb;
        zzdzh zzdzh = this.zzc;
        Activity activity = this.zzd;
        zzfnt zzfnt = this.zze;
        zzl zzl = this.zzf;
        zzekc.zzc(str);
        if (zzdzh != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", "dismiss");
            zzekk.zzd(activity, zzdzh, zzfnt, zzekc, str, "dialog_click", hashMap);
        }
        if (zzl != null) {
            zzl.zzb();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdrs {
    private final zzdwp zza;
    private final zzdve zzb;
    private final zzcxc zzc;
    private final zzdqo zzd;

    public zzdrs(zzdwp zzdwp, zzdve zzdve, zzcxc zzcxc, zzdqo zzdqo) {
        this.zza = zzdwp;
        this.zzb = zzdve;
        this.zzc = zzcxc;
        this.zzd = zzdqo;
    }

    public final View zza() throws zzcnz {
        zzcno zza2 = this.zza.zza(zzq.zzc(), (zzfil) null, (zzfio) null);
        View view = (View) zza2;
        view.setVisibility(8);
        zza2.zzaf("/sendMessageToSdk", new zzdrm(this));
        zza2.zzaf("/adMuted", new zzdrn(this));
        this.zzb.zzj(new WeakReference(zza2), "/loadHtml", new zzdro(this));
        this.zzb.zzj(new WeakReference(zza2), "/showOverlay", new zzdrp(this));
        this.zzb.zzj(new WeakReference(zza2), "/hideOverlay", new zzdrq(this));
        return view;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcno zzcno, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcno zzcno, Map map) {
        this.zzd.zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put(OSOutcomeConstants.OUTCOME_ID, (String) map.get(OSOutcomeConstants.OUTCOME_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcno zzcno, Map map) {
        zze.zzi("Showing native ads overlay.");
        zzcno.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcno zzcno, Map map) {
        zze.zzi("Hiding native ads overlay.");
        zzcno.zzH().setVisibility(8);
        this.zzc.zze(false);
    }
}

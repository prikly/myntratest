package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfje {
    /* access modifiers changed from: private */
    public zzl zza;
    /* access modifiers changed from: private */
    public zzq zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public zzfl zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public zzblz zzh;
    /* access modifiers changed from: private */
    public zzw zzi;
    /* access modifiers changed from: private */
    public AdManagerAdViewOptions zzj;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzk;
    /* access modifiers changed from: private */
    public zzcb zzl;
    /* access modifiers changed from: private */
    public int zzm = 1;
    /* access modifiers changed from: private */
    public zzbsl zzn;
    /* access modifiers changed from: private */
    public final zzfir zzo = new zzfir();
    /* access modifiers changed from: private */
    public boolean zzp = false;
    /* access modifiers changed from: private */
    public zzesb zzq;
    /* access modifiers changed from: private */
    public boolean zzr = false;
    /* access modifiers changed from: private */
    public zzcf zzs;

    public final zzfje zzA(zzblz zzblz) {
        this.zzh = zzblz;
        return this;
    }

    public final zzfje zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfje zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfje zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfje zzE(zzl zzl2) {
        this.zza = zzl2;
        return this;
    }

    public final zzfje zzF(zzfl zzfl) {
        this.zzd = zzfl;
        return this;
    }

    public final zzfjg zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfjg(this, (zzfjf) null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfje zzQ(zzcf zzcf) {
        this.zzs = zzcf;
        return this;
    }

    public final zzl zze() {
        return this.zza;
    }

    public final zzq zzg() {
        return this.zzb;
    }

    public final zzfir zzo() {
        return this.zzo;
    }

    public final zzfje zzp(zzfjg zzfjg) {
        this.zzo.zza(zzfjg.zzo.zza);
        this.zza = zzfjg.zzd;
        this.zzb = zzfjg.zze;
        this.zzs = zzfjg.zzr;
        this.zzc = zzfjg.zzf;
        this.zzd = zzfjg.zza;
        this.zzf = zzfjg.zzg;
        this.zzg = zzfjg.zzh;
        this.zzh = zzfjg.zzi;
        this.zzi = zzfjg.zzj;
        zzq(zzfjg.zzl);
        zzD(zzfjg.zzm);
        this.zzp = zzfjg.zzp;
        this.zzq = zzfjg.zzc;
        this.zzr = zzfjg.zzq;
        return this;
    }

    public final zzfje zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfje zzr(zzq zzq2) {
        this.zzb = zzq2;
        return this;
    }

    public final zzfje zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfje zzt(zzw zzw) {
        this.zzi = zzw;
        return this;
    }

    public final zzfje zzu(zzesb zzesb) {
        this.zzq = zzesb;
        return this;
    }

    public final zzfje zzv(zzbsl zzbsl) {
        this.zzn = zzbsl;
        this.zzd = new zzfl(false, true, false);
        return this;
    }

    public final zzfje zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfje zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfje zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfje zzz(int i) {
        this.zzm = i;
        return this;
    }
}

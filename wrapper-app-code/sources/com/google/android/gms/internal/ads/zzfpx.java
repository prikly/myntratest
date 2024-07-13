package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfpx extends zzfpt {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfpv zzb;
    private final zzfpu zzc;
    private final List zzd = new ArrayList();
    private zzfrr zze;
    private zzfqu zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi;

    zzfpx(zzfpu zzfpu, zzfpv zzfpv) {
        this.zzc = zzfpu;
        this.zzb = zzfpv;
        this.zzi = UUID.randomUUID().toString();
        zzk((View) null);
        if (zzfpv.zzd() == zzfpw.HTML || zzfpv.zzd() == zzfpw.JAVASCRIPT) {
            this.zzf = new zzfqv(zzfpv.zza());
        } else {
            this.zzf = new zzfqx(zzfpv.zzi(), (String) null);
        }
        this.zzf.zzj();
        zzfqi.zza().zzd(this);
        zzfqn.zza().zzd(this.zzf.zza(), zzfpu.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfrr(view);
    }

    public final void zzb(View view, zzfpz zzfpz, String str) {
        zzfqk zzfqk;
        if (this.zzh) {
            return;
        }
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfqk = null;
                    break;
                }
                zzfqk = (zzfqk) it.next();
                if (zzfqk.zzb().get() == view) {
                    break;
                }
            }
            if (zzfqk == null) {
                this.zzd.add(new zzfqk(view, zzfpz, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
    }

    public final void zzc() {
        if (!this.zzh) {
            this.zze.clear();
            if (!this.zzh) {
                this.zzd.clear();
            }
            this.zzh = true;
            zzfqn.zza().zzc(this.zzf.zza());
            zzfqi.zza().zze(this);
            this.zzf.zzc();
            this.zzf = null;
        }
    }

    public final void zzd(View view) {
        if (!this.zzh && zzf() != view) {
            zzk(view);
            this.zzf.zzb();
            Collection<zzfpx> zzc2 = zzfqi.zza().zzc();
            if (zzc2 != null && !zzc2.isEmpty()) {
                for (zzfpx zzfpx : zzc2) {
                    if (zzfpx != this && zzfpx.zzf() == view) {
                        zzfpx.zze.clear();
                    }
                }
            }
        }
    }

    public final void zze() {
        if (!this.zzg) {
            this.zzg = true;
            zzfqi.zza().zzf(this);
            this.zzf.zzh(zzfqo.zzb().zza());
            this.zzf.zzf(this, this.zzb);
        }
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfqu zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}

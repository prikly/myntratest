package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzpi {
    public final int zza;
    public final zzsh zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpi() {
        this(new CopyOnWriteArrayList(), 0, (zzsh) null);
    }

    private zzpi(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsh zzsh) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsh;
    }

    public final zzpi zza(int i, zzsh zzsh) {
        return new zzpi(this.zzc, i, zzsh);
    }

    public final void zzc(zzpj zzpj) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzph zzph = (zzph) it.next();
            if (zzph.zzb == zzpj) {
                this.zzc.remove(zzph);
            }
        }
    }

    public final void zzb(Handler handler, zzpj zzpj) {
        if (zzpj != null) {
            this.zzc.add(new zzph(handler, zzpj));
            return;
        }
        throw null;
    }
}

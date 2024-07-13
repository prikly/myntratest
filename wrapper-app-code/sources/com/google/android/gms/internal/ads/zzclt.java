package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzclt implements Iterable {
    private final List zza = new ArrayList();

    public final Iterator iterator() {
        return this.zza.iterator();
    }

    /* access modifiers changed from: package-private */
    public final zzcls zza(zzcjx zzcjx) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcls zzcls = (zzcls) it.next();
            if (zzcls.zza == zzcjx) {
                return zzcls;
            }
        }
        return null;
    }

    public final void zzb(zzcls zzcls) {
        this.zza.add(zzcls);
    }

    public final void zzc(zzcls zzcls) {
        this.zza.remove(zzcls);
    }

    public final boolean zzd(zzcjx zzcjx) {
        ArrayList<zzcls> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcls zzcls = (zzcls) it.next();
            if (zzcls.zza == zzcjx) {
                arrayList.add(zzcls);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (zzcls zzcls2 : arrayList) {
            zzcls2.zzb.zzb();
        }
        return true;
    }
}

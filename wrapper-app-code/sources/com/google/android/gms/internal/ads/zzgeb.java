package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzgeb extends zzgdq {
    private List zza;

    zzgeb(zzgap zzgap, boolean z) {
        super(zzgap, true, true);
        List list;
        if (zzgap.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzgbi.zza(zzgap.size());
        }
        for (int i = 0; i < zzgap.size(); i++) {
            list.add((Object) null);
        }
        this.zza = list;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzH(List list);

    /* access modifiers changed from: package-private */
    public final void zzg(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgea(obj));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        List list = this.zza;
        if (list != null) {
            zzd(zzH(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i) {
        super.zzz(i);
        this.zza = null;
    }
}

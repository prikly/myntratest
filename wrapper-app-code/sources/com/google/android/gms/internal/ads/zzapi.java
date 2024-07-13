package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzapi extends zzaph {
    protected zzapi(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static zzapi zzs(String str, Context context, boolean z) {
        zzq(context, false);
        return new zzapi(context, str, false);
    }

    @Deprecated
    public static zzapi zzt(String str, Context context, boolean z, int i) {
        zzq(context, z);
        return new zzapi(context, str, z);
    }

    /* access modifiers changed from: protected */
    public final List zzo(zzaqj zzaqj, Context context, zzaml zzaml, zzame zzame) {
        if (zzaqj.zzk() == null || !this.zzt) {
            return super.zzo(zzaqj, context, zzaml, (zzame) null);
        }
        int zza = zzaqj.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzo(zzaqj, context, zzaml, (zzame) null));
        arrayList.add(new zzarc(zzaqj, "dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", zzaml, zza, 24));
        return arrayList;
    }
}

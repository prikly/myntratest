package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeum implements zzezl {
    public final /* synthetic */ ArrayList zza;

    public /* synthetic */ zzeum(ArrayList arrayList) {
        this.zza = arrayList;
    }

    public final void zzf(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.zza);
    }
}

package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzfyr {
    /* access modifiers changed from: private */
    public final zzfxq zza;
    private final zzfyq zzb;

    private zzfyr(zzfyq zzfyq) {
        zzfxp zzfxp = zzfxp.zza;
        this.zzb = zzfyq;
        this.zza = zzfxp;
    }

    public static zzfyr zzb(int i) {
        return new zzfyr(new zzfyn(TTAdSdk.INIT_LOCAL_FAIL_CODE));
    }

    public static zzfyr zzc(zzfxq zzfxq) {
        return new zzfyr(new zzfyl(zzfxq));
    }

    /* access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        if (charSequence != null) {
            return new zzfyo(this, charSequence);
        }
        throw null;
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

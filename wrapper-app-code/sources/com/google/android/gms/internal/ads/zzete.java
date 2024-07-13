package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzete implements zzezm {
    private final zzgfc zza;
    private final zzgfc zzb;
    private final Context zzc;
    private final zzfjg zzd;
    private final View zze;

    public zzete(zzgfc zzgfc, zzgfc zzgfc2, Context context, zzfjg zzfjg, ViewGroup viewGroup) {
        this.zza = zzgfc;
        this.zzb = zzgfc2;
        this.zzc = context;
        this.zzd = zzfjg;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    public final int zza() {
        return 3;
    }

    public final zzgfb zzb() {
        zzbjj.zzc(this.zzc);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjg)).booleanValue()) {
            return this.zzb.zzb(new zzetc(this));
        }
        return this.zza.zzb(new zzetd(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetf zzc() throws Exception {
        return new zzetf(this.zzc, this.zzd.zze, zze());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetf zzd() throws Exception {
        return new zzetf(this.zzc, this.zzd.zze, zze());
    }
}

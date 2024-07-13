package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzcan {
    private final View zza;
    private final Map zzb;
    private final zzcgf zzc;

    public zzcan(zzcam zzcam) {
        this.zza = zzcam.zza;
        this.zzb = zzcam.zzb;
        zzcgf zza2 = zzcah.zza(zzcam.zza.getContext());
        this.zzc = zza2;
        if (zza2 != null && !this.zzb.isEmpty()) {
            try {
                this.zzc.zzf(new zzcao(ObjectWrapper.wrap(this.zza).asBinder(), ObjectWrapper.wrap(this.zzb).asBinder()));
            } catch (RemoteException unused) {
                zzcho.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzcho.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzcho.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, ObjectWrapper.wrap(this.zza), new zzcal(this, list));
        } catch (RemoteException e2) {
            zzcho.zzg("RemoteException recording click: ".concat(e2.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzcho.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzcgf zzcgf = this.zzc;
        if (zzcgf != null) {
            try {
                zzcgf.zzh(list, ObjectWrapper.wrap(this.zza), new zzcak(this, list));
            } catch (RemoteException e2) {
                zzcho.zzg("RemoteException recording impression urls: ".concat(e2.toString()));
            }
        } else {
            zzcho.zzj("Failed to get internal reporting info generator from recordImpression.");
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzcgf zzcgf = this.zzc;
        if (zzcgf != null) {
            try {
                zzcgf.zzj(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException unused) {
                zzcho.zzg("Failed to call remote method.");
            }
        } else {
            zzcho.zze("Failed to get internal reporting info generator.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzk(new ArrayList(Arrays.asList(new Uri[]{uri})), ObjectWrapper.wrap(this.zza), new zzcaj(this, updateClickUrlCallback));
        } catch (RemoteException e2) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(list, ObjectWrapper.wrap(this.zza), new zzcai(this, updateImpressionUrlsCallback));
        } catch (RemoteException e2) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e2.toString()));
        }
    }
}

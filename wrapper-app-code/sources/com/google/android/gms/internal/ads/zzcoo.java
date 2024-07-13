package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcoo {
    private final zzcop zza;
    private final zzcon zzb;

    public zzcoo(zzcop zzcop, zzcon zzcon, byte[] bArr) {
        this.zzb = zzcon;
        this.zza = zzcop;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcop, com.google.android.gms.internal.ads.zzcow] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ? r0 = this.zza;
        zzapj zzK = r0.zzK();
        if (zzK == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzapf zzc = zzK.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcop zzcop = this.zza;
            return zzc.zzf(context, str, (View) zzcop, zzcop.zzk());
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcop, com.google.android.gms.internal.ads.zzcow] */
    @JavascriptInterface
    public String getViewSignals() {
        ? r0 = this.zza;
        zzapj zzK = r0.zzK();
        if (zzK == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzapf zzc = zzK.zzc();
        if (zzc == null) {
            zze.zza("Signals object is empty, ignoring.");
            return "";
        } else if (r0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        } else {
            Context context = this.zza.getContext();
            zzcop zzcop = this.zza;
            return zzc.zzh(context, (View) zzcop, zzcop.zzk());
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zzj("URL is empty, ignoring message");
        } else {
            zzs.zza.post(new zzcom(this, str));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        zzcon zzcon = this.zzb;
        Uri parse = Uri.parse(str);
        zzcnv zzaL = ((zzcoh) zzcon.zza).zzaL();
        if (zzaL == null) {
            zze.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaL.zzi(parse);
        }
    }
}

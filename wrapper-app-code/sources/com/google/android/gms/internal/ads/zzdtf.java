package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdtf implements zzfxt {
    public final /* synthetic */ String zza;
    public final /* synthetic */ double zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdtf(String str, double d2, int i, int i2) {
        this.zza = str;
        this.zzb = d2;
        this.zzc = i;
        this.zzd = i2;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        return new zzblx(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzb, this.zzc, this.zzd);
    }
}

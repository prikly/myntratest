package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbmm extends NativeAd.Image {
    private final zzbml zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbmm(zzbml zzbml) {
        Drawable drawable;
        double d2;
        int i;
        this.zza = zzbml;
        Uri uri = null;
        try {
            IObjectWrapper zzf2 = zzbml.zzf();
            if (zzf2 != null) {
                drawable = (Drawable) ObjectWrapper.unwrap(zzf2);
                this.zzb = drawable;
                uri = this.zza.zze();
                this.zzc = uri;
                d2 = this.zza.zzb();
                this.zzd = d2;
                int i2 = -1;
                i = this.zza.zzd();
                this.zze = i;
                i2 = this.zza.zzc();
                this.zzf = i2;
            }
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
        drawable = null;
        this.zzb = drawable;
        try {
            uri = this.zza.zze();
        } catch (RemoteException e3) {
            zzcho.zzh("", e3);
        }
        this.zzc = uri;
        try {
            d2 = this.zza.zzb();
        } catch (RemoteException e4) {
            zzcho.zzh("", e4);
            d2 = 1.0d;
        }
        this.zzd = d2;
        int i22 = -1;
        try {
            i = this.zza.zzd();
        } catch (RemoteException e5) {
            zzcho.zzh("", e5);
            i = -1;
        }
        this.zze = i;
        try {
            i22 = this.zza.zzc();
        } catch (RemoteException e6) {
            zzcho.zzh("", e6);
        }
        this.zzf = i22;
    }

    public final Drawable getDrawable() {
        return this.zzb;
    }

    public final double getScale() {
        return this.zzd;
    }

    public final Uri getUri() {
        return this.zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zze;
    }
}

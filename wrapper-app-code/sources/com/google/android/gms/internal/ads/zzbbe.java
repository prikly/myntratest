package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbbe extends Surface {
    private static boolean zza;
    private static boolean zzb;
    private final zzbbc zzc;
    private boolean zzd;

    /* synthetic */ zzbbe(zzbbc zzbbc, SurfaceTexture surfaceTexture, boolean z, zzbbd zzbbd) {
        super(surfaceTexture);
        this.zzc = zzbbc;
    }

    public static zzbbe zza(Context context, boolean z) {
        if (zzbay.zza >= 17) {
            boolean z2 = true;
            if (z && !zzb(context)) {
                z2 = false;
            }
            zzbaj.zze(z2);
            return new zzbbc().zza(z);
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean zzb(Context context) {
        boolean z;
        synchronized (zzbbe.class) {
            if (!zzb) {
                if (zzbay.zza >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (zzbay.zza != 24 || ((!zzbay.zzd.startsWith("SM-G950") && !zzbay.zzd.startsWith("SM-G955")) || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    zza = z2;
                }
                zzb = true;
            }
            z = zza;
        }
        return z;
    }

    public final void release() {
        super.release();
        synchronized (this.zzc) {
            if (!this.zzd) {
                this.zzc.zzb();
                this.zzd = true;
            }
        }
    }
}

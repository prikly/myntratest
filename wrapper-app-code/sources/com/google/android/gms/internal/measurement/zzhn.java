package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzhn implements zzhk {
    private static zzhn zza;
    private final Context zzb;
    private final ContentObserver zzc;

    private zzhn() {
        this.zzb = null;
        this.zzc = null;
    }

    private zzhn(Context context) {
        this.zzb = context;
        this.zzc = new zzhm(this, (Handler) null);
        context.getContentResolver().registerContentObserver(zzha.zza, true, this.zzc);
    }

    static zzhn zza(Context context) {
        zzhn zzhn;
        synchronized (zzhn.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzhn(context) : new zzhn();
            }
            zzhn = zza;
        }
        return zzhn;
    }

    static synchronized void zze() {
        Context context;
        synchronized (zzhn.class) {
            zzhn zzhn = zza;
            if (!(zzhn == null || (context = zzhn.zzb) == null || zzhn.zzc == null)) {
                context.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* renamed from: zzc */
    public final String zzb(String str) {
        Context context = this.zzb;
        if (context != null && !zzhb.zza(context)) {
            try {
                return (String) zzhi.zza(new zzhl(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e2) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e2);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String zzd(String str) {
        return zzha.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}

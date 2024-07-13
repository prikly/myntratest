package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzapa implements zzftu {
    final /* synthetic */ zzfru zza;

    zzapa(zzapc zzapc, zzfru zzfru) {
        this.zza = zzfru;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}

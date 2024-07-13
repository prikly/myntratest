package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
class zzaey {
    public final int zzd;

    public zzaey(int i) {
        this.zzd = i;
    }

    public static int zze(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static String zzf(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
        return sb.toString();
    }

    public String toString() {
        return zzf(this.zzd);
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzfyk extends zzfyp {
    final /* synthetic */ zzfyl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyk(zzfyl zzfyl, zzfyr zzfyr, CharSequence charSequence) {
        super(zzfyr, charSequence);
        this.zza = zzfyl;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i) {
        zzfxq zzfxq = this.zza.zza;
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfye.zzb(i, length, "index");
        while (i < length) {
            if (zzfxq.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}

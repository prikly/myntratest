package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzf implements zzhah {
    private static final zzgzl zza = new zzgzd();
    private final zzgzl zzb;

    public zzgzf() {
        zzgzl zzgzl;
        zzgzl[] zzgzlArr = new zzgzl[2];
        zzgzlArr[0] = zzgxy.zza();
        try {
            zzgzl = (zzgzl) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzgzl = zza;
        }
        zzgzlArr[1] = zzgzl;
        zzgze zzgze = new zzgze(zzgzlArr);
        zzgyn.zzf(zzgze, "messageInfoFactory");
        this.zzb = zzgze;
    }

    private static boolean zzb(zzgzk zzgzk) {
        return zzgzk.zzc() == 1;
    }

    public final zzhag zza(Class cls) {
        zzhai.zzG(cls);
        zzgzk zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (zzgyd.class.isAssignableFrom(cls)) {
                return zzgzr.zzc(zzhai.zzB(), zzgxs.zzb(), zzb2.zza());
            }
            return zzgzr.zzc(zzhai.zzz(), zzgxs.zza(), zzb2.zza());
        } else if (zzgyd.class.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzgzq.zzl(cls, zzb2, zzgzt.zzb(), zzgzb.zze(), zzhai.zzB(), zzgxs.zzb(), zzgzj.zzb());
            }
            return zzgzq.zzl(cls, zzb2, zzgzt.zzb(), zzgzb.zze(), zzhai.zzB(), (zzgxq) null, zzgzj.zzb());
        } else if (zzb(zzb2)) {
            return zzgzq.zzl(cls, zzb2, zzgzt.zza(), zzgzb.zzd(), zzhai.zzz(), zzgxs.zza(), zzgzj.zza());
        } else {
            return zzgzq.zzl(cls, zzb2, zzgzt.zza(), zzgzb.zzd(), zzhai.zzA(), (zzgxq) null, zzgzj.zza());
        }
    }
}

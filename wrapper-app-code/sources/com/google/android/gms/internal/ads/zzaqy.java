package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaqy extends zzarx {
    private static final zzary zzi = new zzary();
    private final Context zzj;

    public zzaqy(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2, Context context, zzame zzame) {
        super(zzaqj, "JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", zzaml, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzanf zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzanv zzanv;
        int i;
        Boolean bool;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzanv zzanv2 = (zzanv) zza.get();
            if (zzanv2 == null || zzaqn.zzg(zzanv2.zza) || zzanv2.zza.equals("E") || zzanv2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzaqn.zzg((String) null)) {
                    i = 5;
                } else {
                    if (!zzaqn.zzg((String) null)) {
                        bool = false;
                    } else {
                        bool = false;
                    }
                    i = (!bool.booleanValue() || !this.zzb.zzp()) ? 3 : 4;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool2 = (Boolean) zzba.zzc().zzb(zzbjj.zzca);
                String zzb = ((Boolean) zzba.zzc().zzb(zzbjj.zzbZ)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzaqn.zzg(zzb)) {
                    zzb = zzc();
                }
                zzanv zzanv3 = new zzanv((String) this.zzf.invoke((Object) null, new Object[]{this.zzj, valueOf, zzb}));
                if (zzaqn.zzg(zzanv3.zza) || zzanv3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzaqn.zzg(zzc)) {
                            zzanv3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzanv3);
            }
            zzanv = (zzanv) zza.get();
        }
        synchronized (this.zze) {
            if (zzanv != null) {
                this.zze.zzx(zzanv.zza);
                this.zze.zzX(zzanv.zzb);
                this.zze.zzZ(zzanv.zzc);
                this.zze.zzi(zzanv.zzd);
                this.zze.zzw(zzanv.zze);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final String zzb() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzaqn.zzi((String) zzba.zzc().zzb(zzbjj.zzcb));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzaqn.zzi((String) zzba.zzc().zzb(zzbjj.zzcc)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            zzgfk zzf = zzgfk.zzf();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzarz(zzf));
            return (String) zzf.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

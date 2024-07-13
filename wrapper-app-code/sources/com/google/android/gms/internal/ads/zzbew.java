package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbew {
    private final zzbfc zza;
    private final zzbgl zzb;
    private final boolean zzc;

    private zzbew() {
        this.zzb = zzbgm.zzd();
        this.zzc = false;
        this.zza = new zzbfc();
    }

    public static zzbew zza() {
        return new zzbew();
    }

    private final synchronized String zzd(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.zzb.zzk(), Long.valueOf(zzt.zzB().elapsedRealtime()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbgm) this.zzb.zzak()).zzaw(), 3)});
    }

    private final synchronized void zze(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.zza("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    private final synchronized void zzf(int i) {
        zzbgl zzbgl = this.zzb;
        zzbgl.zzd();
        List<String> zzb2 = zzbjj.zzb();
        ArrayList arrayList = new ArrayList();
        for (String split : zzb2) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzbgl.zzc(arrayList);
        zzbfb zzbfb = new zzbfb(this.zza, ((zzbgm) this.zzb.zzak()).zzaw(), (zzbfa) null);
        int i2 = i - 1;
        zzbfb.zza(i2);
        zzbfb.zzc();
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    public final synchronized void zzb(zzbev zzbev) {
        if (this.zzc) {
            try {
                zzbev.zza(this.zzb);
            } catch (NullPointerException e2) {
                zzt.zzo().zzu(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzet)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbew(zzbfc zzbfc) {
        this.zzb = zzbgm.zzd();
        this.zza = zzbfc;
        this.zzc = ((Boolean) zzba.zzc().zzb(zzbjj.zzes)).booleanValue();
    }
}

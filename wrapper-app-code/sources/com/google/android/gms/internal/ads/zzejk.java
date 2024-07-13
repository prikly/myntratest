package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzejk extends zzejl {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzddt zzd;
    private final TelephonyManager zze;
    /* access modifiers changed from: private */
    public final zzejc zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbhj.CONNECTED);
        zzb.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbhj.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbhj.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbhj.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbhj.DISCONNECTING);
        zzb.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbhj.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbhj.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbhj.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbhj.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbhj.DISCONNECTED);
        zzb.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbhj.SUSPENDED);
        zzb.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbhj.CONNECTING);
        zzb.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbhj.CONNECTING);
    }

    zzejk(Context context, zzddt zzddt, zzejc zzejc, zzeiy zzeiy, zzg zzg2) {
        super(zzeiy, zzg2);
        this.zzc = context;
        this.zzd = zzddt;
        this.zzf = zzejc;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzbha zza(zzejk zzejk, Bundle bundle) {
        zzbgt zza = zzbha.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzejk.zzg = 2;
        } else {
            zzejk.zzg = 1;
            if (i == 0) {
                zza.zzb(2);
            } else if (i != 1) {
                zza.zzb(1);
            } else {
                zza.zzb(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zza.zza(i3);
        }
        return (zzbha) zza.zzak();
    }

    static /* bridge */ /* synthetic */ zzbhj zzb(zzejk zzejk, Bundle bundle) {
        return (zzbhj) zzb.get(zzfjr.zza(zzfjr.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbhj.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzejk zzejk, boolean z, ArrayList arrayList, zzbha zzbha, zzbhj zzbhj) {
        zzbhe zzg2 = zzbhf.zzg();
        zzg2.zza(arrayList);
        boolean z2 = false;
        zzg2.zzi(zzg(Settings.Global.getInt(zzejk.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzg2.zzj(zzt.zzq().zzi(zzejk.zzc, zzejk.zze));
        zzg2.zzf(zzejk.zzf.zze());
        zzg2.zze(zzejk.zzf.zzb());
        zzg2.zzb(zzejk.zzf.zza());
        zzg2.zzc(zzbhj);
        zzg2.zzd(zzbha);
        zzg2.zzk(zzejk.zzg);
        zzg2.zzl(zzg(z));
        zzg2.zzh(zzejk.zzf.zzd());
        zzg2.zzg(zzt.zzB().currentTimeMillis());
        if (Settings.Global.getInt(zzejk.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z2 = true;
        }
        zzg2.zzm(zzg(z2));
        return ((zzbhf) zzg2.zzak()).zzaw();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzd(boolean z) {
        zzger.zzr(this.zzd.zzb(), new zzejj(this, z), zzcib.zzf);
    }
}

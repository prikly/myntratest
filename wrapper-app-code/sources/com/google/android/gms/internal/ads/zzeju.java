package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeju {
    private final zzbew zza;
    private final Context zzb;
    private final zzeiy zzc;
    private final zzchu zzd;
    private final String zze;
    private final zzfnt zzf;
    private final zzg zzg = zzt.zzo().zzh();

    public zzeju(Context context, zzchu zzchu, zzbew zzbew, zzeiy zzeiy, String str, zzfnt zzfnt) {
        this.zzb = context;
        this.zzd = zzchu;
        this.zza = zzbew;
        this.zzc = zzeiy;
        this.zze = str;
        this.zzf = zzfnt;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzbhf zzbhf = (zzbhf) arrayList.get(i);
            if (zzbhf.zzw() == 2 && zzbhf.zze() > j) {
                j = zzbhf.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
        }
    }

    public final void zzb(boolean z) {
        try {
            this.zzc.zza(new zzejq(this, z));
        } catch (Exception e2) {
            zze.zzg("Error in offline signals database startup: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        String str;
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        int i = 2;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzhK)).booleanValue()) {
            zzfns zzb2 = zzfns.zzb("oa_upload");
            zzb2.zza("oa_failed_reqs", String.valueOf(zzejn.zza(sQLiteDatabase, 0)));
            zzb2.zza("oa_total_reqs", String.valueOf(zzejn.zza(sQLiteDatabase, 1)));
            zzb2.zza("oa_upload_time", String.valueOf(zzt.zzB().currentTimeMillis()));
            zzb2.zza("oa_last_successful_time", String.valueOf(zzejn.zzb(sQLiteDatabase, 2)));
            zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzb2);
            ArrayList zzc2 = zzejn.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc2);
            int size = zzc2.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzbhf zzbhf = (zzbhf) zzc2.get(i2);
                zzfns zzb3 = zzfns.zzb("oa_signals");
                if (this.zzg.zzP()) {
                    str = "";
                } else {
                    str = this.zze;
                }
                zzb3.zza("oa_session_id", str);
                zzbha zzf2 = zzbhf.zzf();
                String valueOf = zzf2.zzf() ? String.valueOf(zzf2.zzh() - 1) : "-1";
                String obj = zzgbi.zzb(zzbhf.zzk(), zzejt.zza).toString();
                zzb3.zza("oa_sig_ts", String.valueOf(zzbhf.zze()));
                zzb3.zza("oa_sig_status", String.valueOf(zzbhf.zzw() - 1));
                zzb3.zza("oa_sig_resp_lat", String.valueOf(zzbhf.zzd()));
                zzb3.zza("oa_sig_render_lat", String.valueOf(zzbhf.zzc()));
                zzb3.zza("oa_sig_formats", obj);
                zzb3.zza("oa_sig_nw_type", valueOf);
                zzb3.zza("oa_sig_wifi", String.valueOf(zzbhf.zzx() - 1));
                zzb3.zza("oa_sig_airplane", String.valueOf(zzbhf.zzt() - 1));
                zzb3.zza("oa_sig_data", String.valueOf(zzbhf.zzu() - 1));
                zzb3.zza("oa_sig_nw_resp", String.valueOf(zzbhf.zza()));
                zzb3.zza("oa_sig_offline", String.valueOf(zzbhf.zzv() - 1));
                zzb3.zza("oa_sig_nw_state", String.valueOf(zzbhf.zzj().zza()));
                if (zzf2.zze() && zzf2.zzf() && zzf2.zzh() == 2) {
                    zzb3.zza("oa_sig_cell_type", String.valueOf(zzf2.zzg() - 1));
                }
                this.zzf.zzb(zzb3);
            }
        } else {
            ArrayList zzc3 = zzejn.zzc(sQLiteDatabase);
            zzbhg zza2 = zzbhk.zza();
            zza2.zzb(this.zzb.getPackageName());
            zza2.zzd(Build.MODEL);
            zza2.zze(zzejn.zza(sQLiteDatabase, 0));
            zza2.zza(zzc3);
            zza2.zzg(zzejn.zza(sQLiteDatabase, 1));
            zza2.zzc(zzejn.zza(sQLiteDatabase, 3));
            zza2.zzh(zzt.zzB().currentTimeMillis());
            zza2.zzf(zzejn.zzb(sQLiteDatabase, 2));
            zzc(sQLiteDatabase, zzc3);
            this.zza.zzb(new zzejr((zzbhk) zza2.zzak()));
            zzbhv zza3 = zzbhw.zza();
            zza3.zza(this.zzd.zzb);
            zza3.zzc(this.zzd.zzc);
            if (true == this.zzd.zzd) {
                i = 0;
            }
            zza3.zzb(i);
            this.zza.zzb(new zzejs((zzbhw) zza3.zzak()));
            this.zza.zzc(10004);
        }
        zzejn.zzf(sQLiteDatabase);
        return null;
    }
}

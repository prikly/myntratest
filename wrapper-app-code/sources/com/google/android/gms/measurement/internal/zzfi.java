package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzgr;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzfi extends zzkh implements zzaf {
    final Map zza = new ArrayMap();
    final Map zzb = new ArrayMap();
    final Map zzc = new ArrayMap();
    final LruCache zzd = new zzff(this, 20);
    final zzr zze = new zzfg(this);
    /* access modifiers changed from: private */
    public final Map zzg = new ArrayMap();
    private final Map zzh = new ArrayMap();
    private final Map zzi = new ArrayMap();
    private final Map zzj = new ArrayMap();
    private final Map zzk = new ArrayMap();
    private final Map zzl = new ArrayMap();

    zzfi(zzkt zzkt) {
        super(zzkt);
    }

    private final zzff zzA(String str, byte[] bArr) {
        if (bArr == null) {
            return zzff.zzg();
        }
        try {
            zzff zzff = (zzff) ((zzfe) zzkv.zzl(zzff.zze(), bArr)).zzaC();
            zzef zzj2 = this.zzt.zzay().zzj();
            String str2 = null;
            Long valueOf = zzff.zzs() ? Long.valueOf(zzff.zzc()) : null;
            if (zzff.zzr()) {
                str2 = zzff.zzh();
            }
            zzj2.zzc("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzff;
        } catch (zzkp e2) {
            this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e2);
            return zzff.zzg();
        } catch (RuntimeException e3) {
            this.zzt.zzay().zzk().zzc("Unable to merge remote config. appId", zzeh.zzn(str), e3);
            return zzff.zzg();
        }
    }

    private final void zzB(String str, zzfe zzfe) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        for (zzfb zzb2 : zzfe.zzg()) {
            hashSet.add(zzb2.zzb());
        }
        for (int i = 0; i < zzfe.zza(); i++) {
            zzfc zzfc = (zzfc) zzfe.zzb(i).zzby();
            if (zzfc.zzc().isEmpty()) {
                this.zzt.zzay().zzk().zza("EventConfig contained null event name");
            } else {
                String zzc2 = zzfc.zzc();
                String zzb3 = zzgo.zzb(zzfc.zzc());
                if (!TextUtils.isEmpty(zzb3)) {
                    zzfc.zzb(zzb3);
                    zzfe.zzd(i, zzfc);
                }
                if (zzfc.zzf() && zzfc.zzd()) {
                    arrayMap.put(zzc2, true);
                }
                if (zzfc.zzg() && zzfc.zze()) {
                    arrayMap2.put(zzfc.zzc(), true);
                }
                if (zzfc.zzh()) {
                    if (zzfc.zza() < 2 || zzfc.zza() > 65535) {
                        this.zzt.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfc.zzc(), Integer.valueOf(zzfc.zza()));
                    } else {
                        arrayMap3.put(zzfc.zzc(), Integer.valueOf(zzfc.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, arrayMap);
        this.zzc.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (r2 != null) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzC(java.lang.String r13) {
        /*
            r12 = this;
            r12.zzW()
            r12.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            java.util.Map r0 = r12.zzh
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0132
            com.google.android.gms.measurement.internal.zzkt r0 = r12.zzf
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzi()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r0.zzg()
            r0.zzW()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.zzh()     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5}     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0094, all -> 0x0091 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x008f }
            if (r3 != 0) goto L_0x0049
            if (r2 == 0) goto L_0x00af
            goto L_0x00ac
        L_0x0049:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x008f }
            com.google.android.gms.measurement.internal.zzfr r5 = r0.zzt     // Catch:{ SQLiteException -> 0x008f }
            com.google.android.gms.measurement.internal.zzag r5 = r5.zzf()     // Catch:{ SQLiteException -> 0x008f }
            com.google.android.gms.measurement.internal.zzdt r6 = com.google.android.gms.measurement.internal.zzdu.zzao     // Catch:{ SQLiteException -> 0x008f }
            boolean r5 = r5.zzs(r1, r6)     // Catch:{ SQLiteException -> 0x008f }
            if (r5 == 0) goto L_0x0065
            r5 = 2
            java.lang.String r5 = r2.getString(r5)     // Catch:{ SQLiteException -> 0x008f }
            goto L_0x0066
        L_0x0065:
            r5 = r1
        L_0x0066:
            boolean r6 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x008f }
            if (r6 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.zzfr r6 = r0.zzt     // Catch:{ SQLiteException -> 0x008f }
            com.google.android.gms.measurement.internal.zzeh r6 = r6.zzay()     // Catch:{ SQLiteException -> 0x008f }
            com.google.android.gms.measurement.internal.zzef r6 = r6.zzd()     // Catch:{ SQLiteException -> 0x008f }
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzeh.zzn(r13)     // Catch:{ SQLiteException -> 0x008f }
            r6.zzb(r7, r8)     // Catch:{ SQLiteException -> 0x008f }
        L_0x007f:
            if (r3 != 0) goto L_0x0084
            if (r2 == 0) goto L_0x00af
            goto L_0x00ac
        L_0x0084:
            com.google.android.gms.measurement.internal.zzaj r6 = new com.google.android.gms.measurement.internal.zzaj     // Catch:{ SQLiteException -> 0x008f }
            r6.<init>(r3, r4, r5)     // Catch:{ SQLiteException -> 0x008f }
            if (r2 == 0) goto L_0x00b0
            r2.close()
            goto L_0x00b0
        L_0x008f:
            r3 = move-exception
            goto L_0x0097
        L_0x0091:
            r13 = move-exception
            goto L_0x012c
        L_0x0094:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0097:
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzt     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzeh r0 = r0.zzay()     // Catch:{ all -> 0x012a }
            com.google.android.gms.measurement.internal.zzef r0 = r0.zzd()     // Catch:{ all -> 0x012a }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzeh.zzn(r13)     // Catch:{ all -> 0x012a }
            r0.zzc(r4, r5, r3)     // Catch:{ all -> 0x012a }
            if (r2 == 0) goto L_0x00af
        L_0x00ac:
            r2.close()
        L_0x00af:
            r6 = r1
        L_0x00b0:
            if (r6 != 0) goto L_0x00e0
            java.util.Map r0 = r12.zzg
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzb
            r0.put(r13, r1)
            java.util.Map r0 = r12.zza
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzc
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzh
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzj
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzk
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzl
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzi
            r0.put(r13, r1)
            return
        L_0x00e0:
            byte[] r0 = r6.zza
            com.google.android.gms.internal.measurement.zzff r0 = r12.zzA(r13, r0)
            com.google.android.gms.internal.measurement.zzkb r0 = r0.zzby()
            com.google.android.gms.internal.measurement.zzfe r0 = (com.google.android.gms.internal.measurement.zzfe) r0
            r12.zzB(r13, r0)
            java.util.Map r1 = r12.zzg
            com.google.android.gms.internal.measurement.zzkf r2 = r0.zzaC()
            com.google.android.gms.internal.measurement.zzff r2 = (com.google.android.gms.internal.measurement.zzff) r2
            java.util.Map r2 = zzE(r2)
            r1.put(r13, r2)
            java.util.Map r1 = r12.zzh
            com.google.android.gms.internal.measurement.zzkf r2 = r0.zzaC()
            com.google.android.gms.internal.measurement.zzff r2 = (com.google.android.gms.internal.measurement.zzff) r2
            r1.put(r13, r2)
            com.google.android.gms.internal.measurement.zzkf r1 = r0.zzaC()
            com.google.android.gms.internal.measurement.zzff r1 = (com.google.android.gms.internal.measurement.zzff) r1
            r12.zzD(r13, r1)
            java.util.Map r1 = r12.zzj
            java.lang.String r0 = r0.zze()
            r1.put(r13, r0)
            java.util.Map r0 = r12.zzk
            java.lang.String r1 = r6.zzb
            r0.put(r13, r1)
            java.util.Map r0 = r12.zzl
            java.lang.String r1 = r6.zzc
            r0.put(r13, r1)
            return
        L_0x012a:
            r13 = move-exception
            r1 = r2
        L_0x012c:
            if (r1 == 0) goto L_0x0131
            r1.close()
        L_0x0131:
            throw r13
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfi.zzC(java.lang.String):void");
    }

    private final void zzD(String str, zzff zzff) {
        if (zzff.zza() != 0) {
            this.zzt.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzff.zza()));
            zzgt zzgt = (zzgt) zzff.zzm().get(0);
            try {
                zzc zzc2 = new zzc();
                zzc2.zzd("internal.remoteConfig", new zzfc(this, str));
                zzc2.zzd("internal.appMetadata", new zzfd(this, str));
                zzc2.zzd("internal.logger", new zzfe(this));
                zzc2.zzc(zzgt);
                this.zzd.put(str, zzc2);
                this.zzt.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgt.zza().zza()));
                for (zzgr zzb2 : zzgt.zza().zzd()) {
                    this.zzt.zzay().zzj().zzb("EES program activity", zzb2.zzb());
                }
            } catch (zzd unused) {
                this.zzt.zzay().zzd().zzb("Failed to load EES program. appId", str);
            }
        } else {
            this.zzd.remove(str);
        }
    }

    private static final Map zzE(zzff zzff) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzff != null) {
            for (zzfj zzfj : zzff.zzn()) {
                arrayMap.put(zzfj.zzb(), zzfj.zzc());
            }
        }
        return arrayMap;
    }

    static /* bridge */ /* synthetic */ zzc zzd(zzfi zzfi, String str) {
        zzfi.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfi.zzo(str)) {
            return null;
        }
        if (!zzfi.zzh.containsKey(str) || zzfi.zzh.get(str) == null) {
            zzfi.zzC(str);
        } else {
            zzfi.zzD(str, (zzff) zzfi.zzh.get(str));
        }
        return (zzc) zzfi.zzd.snapshot().get(str);
    }

    public final String zza(String str, String str2) {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    public final zzff zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (zzff) this.zzh.get(str);
    }

    /* access modifiers changed from: protected */
    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    /* access modifiers changed from: protected */
    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String zzi(String str) {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    /* access modifiers changed from: protected */
    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzn(String str) {
        zzg();
        zzff zze2 = zze(str);
        if (zze2 == null) {
            return false;
        }
        return zze2.zzq();
    }

    public final boolean zzo(String str) {
        zzff zzff;
        if (TextUtils.isEmpty(str) || (zzff = (zzff) this.zzh.get(str)) == null || zzff.zza() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzr(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlb.zzah(str2)) {
            return true;
        }
        if (zzs(str) && zzlb.zzai(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: protected */
    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzfe zzfe = (zzfe) zzA(str, bArr).zzby();
        zzB(str, zzfe);
        zzD(str, (zzff) zzfe.zzaC());
        this.zzh.put(str, (zzff) zzfe.zzaC());
        this.zzj.put(str, zzfe.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((zzff) zzfe.zzaC()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfe.zzf()));
        try {
            zzfe.zzc();
            bArr = ((zzff) zzfe.zzaC()).zzbu();
        } catch (RuntimeException e2) {
            this.zzt.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeh.zzn(str), e2);
        }
        zzam zzi2 = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi2.zzg();
        zzi2.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzi2.zzt.zzf().zzs((String) null, zzdu.zzao)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (((long) zzi2.zzh().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                zzi2.zzt.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeh.zzn(str));
            }
        } catch (SQLiteException e3) {
            zzi2.zzt.zzay().zzd().zzc("Error storing remote config. appId", zzeh.zzn(str), e3);
        }
        this.zzh.put(str, (zzff) zzfe.zzaC());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzu(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id");
    }

    /* access modifiers changed from: package-private */
    public final boolean zzv(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || (!((Set) this.zza.get(str)).contains("device_model") && !((Set) this.zza.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzw(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id");
    }

    /* access modifiers changed from: package-private */
    public final boolean zzx(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals");
    }

    /* access modifiers changed from: package-private */
    public final boolean zzy(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null || (!((Set) this.zza.get(str)).contains("os_version") && !((Set) this.zza.get(str)).contains("device_info"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzz(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id");
    }
}

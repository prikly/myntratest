package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcek implements zzcep {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhcc zzd;
    private final LinkedHashMap zze;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Context zzh;
    private final zzcem zzi;
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;
    private final zzcel zzn;

    public zzcek(Context context, zzchu zzchu, zzcem zzcem, String str, zzcel zzcel, byte[] bArr) {
        Preconditions.checkNotNull(zzcem, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzcel;
        this.zzi = zzcem;
        for (String lowerCase : zzcem.zze) {
            this.zzk.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhcc zza2 = zzhdl.zza();
        zza2.zzn(9);
        zza2.zzj(str);
        zza2.zzh(str);
        zzhcd zza3 = zzhce.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza3.zza(str2);
        }
        zza2.zzg((zzhce) zza3.zzak());
        zzhdg zza4 = zzhdh.zza();
        zza4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzchu.zza;
        if (str3 != null) {
            zza4.zza(str3);
        }
        long apkVersion = (long) GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza4.zzb(apkVersion);
        }
        zza2.zzf((zzhdh) zza4.zzak());
        this.zzd = zza2;
    }

    public final zzcem zza() {
        return this.zzi;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzb(Map map) throws Exception {
        zzgfb zzm2;
        zzhde zzhde;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhde = (zzhde) this.zze.get(str);
                            }
                            if (zzhde == null) {
                                zzceo.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    zzhde.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.zza;
                                if (length > 0) {
                                    z = true;
                                }
                                this.zza = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (((Boolean) zzblg.zzb.zze()).booleanValue()) {
                    zze.zzf("Failed to get SafeBrowsing metadata", e2);
                }
                return zzger.zzh(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z3 = this.zza;
        if ((!z3 || !this.zzi.zzg) && ((!this.zzm || !this.zzi.zzf) && (z3 || !this.zzi.zzd))) {
            return zzger.zzi((Object) null);
        }
        synchronized (this.zzj) {
            for (zzhde zzak : this.zze.values()) {
                this.zzd.zzc((zzhdf) zzak.zzak());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzceo.zzb()) {
                String zzl2 = this.zzd.zzl();
                String zzk2 = this.zzd.zzk();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzl2 + "\n  clickUrl: " + zzk2 + "\n  resources: \n");
                for (zzhdf zzhdf : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzhdf.zza());
                    sb.append("] ");
                    sb.append(zzhdf.zze());
                }
                zzceo.zza(sb.toString());
            }
            byte[] zzaw = ((zzhdl) this.zzd.zzak()).zzaw();
            zzgfb zzb2 = new zzbo(this.zzh).zzb(1, this.zzi.zzb, (Map) null, zzaw);
            if (zzceo.zzb()) {
                zzb2.zzc(zzcef.zza, zzcib.zza);
            }
            zzm2 = zzger.zzm(zzb2, zzceg.zza, zzcib.zzf);
        }
        return zzm2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(java.lang.String r7, java.util.Map r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzj
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.zzm = r2     // Catch:{ all -> 0x00b7 }
        L_0x0009:
            java.util.LinkedHashMap r2 = r6.zze     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap r8 = r6.zze     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzhde r7 = (com.google.android.gms.internal.ads.zzhde) r7     // Catch:{ all -> 0x00b7 }
            int r8 = com.google.android.gms.internal.ads.zzhdd.zza(r1)     // Catch:{ all -> 0x00b7 }
            r7.zze(r8)     // Catch:{ all -> 0x00b7 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.zzhde r1 = com.google.android.gms.internal.ads.zzhdf.zzc()     // Catch:{ all -> 0x00b7 }
            int r9 = com.google.android.gms.internal.ads.zzhdd.zza(r9)     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x0031
            r1.zze(r9)     // Catch:{ all -> 0x00b7 }
        L_0x0031:
            java.util.LinkedHashMap r9 = r6.zze     // Catch:{ all -> 0x00b7 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b7 }
            r1.zzb(r9)     // Catch:{ all -> 0x00b7 }
            r1.zzd(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzhcp r9 = com.google.android.gms.internal.ads.zzhcs.zza()     // Catch:{ all -> 0x00b7 }
            java.util.HashSet r2 = r6.zzk     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b7 }
            if (r2 != 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b7 }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b7 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b7 }
            java.util.HashSet r5 = r6.zzk     // Catch:{ all -> 0x00b7 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.zzhcn r4 = com.google.android.gms.internal.ads.zzhco.zza()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgwv r3 = com.google.android.gms.internal.ads.zzgwv.zzx(r3)     // Catch:{ all -> 0x00b7 }
            r4.zza(r3)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgwv r2 = com.google.android.gms.internal.ads.zzgwv.zzx(r2)     // Catch:{ all -> 0x00b7 }
            r4.zzb(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgyd r2 = r4.zzak()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzhco r2 = (com.google.android.gms.internal.ads.zzhco) r2     // Catch:{ all -> 0x00b7 }
            r9.zza(r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0053
        L_0x00a7:
            com.google.android.gms.internal.ads.zzgyd r8 = r9.zzak()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzhcs r8 = (com.google.android.gms.internal.ads.zzhcs) r8     // Catch:{ all -> 0x00b7 }
            r1.zzc(r8)     // Catch:{ all -> 0x00b7 }
            java.util.LinkedHashMap r8 = r6.zze     // Catch:{ all -> 0x00b7 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcek.zzd(java.lang.String, java.util.Map, int):void");
    }

    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            zzgfb zzn2 = zzger.zzn(zzger.zzi(Collections.emptyMap()), new zzceh(this), zzcib.zzf);
            zzgfb zzo = zzger.zzo(zzn2, 10, TimeUnit.SECONDS, zzcib.zzd);
            zzger.zzr(zzn2, new zzcej(this, zzo), zzcib.zzf);
            zzc.add(zzo);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgws zzt = zzgwv.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhcc zzhcc = this.zzd;
            zzhcx zza2 = zzhcz.zza();
            zza2.zza(zzt.zzb());
            zza2.zzb("image/png");
            zza2.zzc(2);
            zzhcc.zzi((zzhcz) zza2.zzak());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcem r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.zzl
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.ads.internal.zzt.zzp()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.ads.internal.util.zze.zzh(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.ads.internal.util.zze.zzj(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.ads.internal.util.zze.zzh(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzceo.zza(r8)
            return
        L_0x0075:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzcei r8 = new com.google.android.gms.internal.ads.zzcei
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzs.zzf(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcek.zzg(android.view.View):void");
    }

    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}

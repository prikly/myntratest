package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzecd;
import com.google.android.gms.internal.ads.zzece;
import com.google.android.gms.internal.ads.zzgfb;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaw {
    protected String zza = "";
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    private zzece zzg;

    protected static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", zzt.zzp().zzc(context, str2));
        zzgfb zzb2 = new zzbo(context).zzb(0, str, hashMap, (byte[]) null);
        try {
            return (String) zzb2.get((long) ((Integer) zzba.zzc().zzb(zzbjj.zzel)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e2) {
            zze.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            zzb2.cancel(true);
            return null;
        } catch (InterruptedException e3) {
            zze.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e3);
            zzb2.cancel(true);
            return null;
        } catch (Exception e4) {
            zze.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e4);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                zzt.zzp();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    zze.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    zzt.zzp();
                    this.zzc = UUID.randomUUID().toString();
                    zzt.zzp();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e2) {
                        zze.zzh("Error writing to file in internal storage.", e2);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final zzece zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzece zzece;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzim)).booleanValue() && (zzece = this.zzg) != null) {
            zzece.zzh(new zzat(this, context), zzecd.DEBUG_MENU);
        }
    }

    public final void zzd(Context context, String str, String str2) {
        zzt.zzp();
        zzs.zzR(context, zzp(context, (String) zzba.zzc().zzb(zzbjj.zzeh), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) zzba.zzc().zzb(zzbjj.zzek), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzt.zzp();
        zzs.zzH(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzim)).booleanValue()) {
                zzt.zzo().zzh().zzB(z);
                zzece zzece = this.zzg;
                if (zzece != null) {
                    zzece.zzj(z);
                }
            }
        }
    }

    public final void zzg(zzece zzece) {
        this.zzg = zzece;
    }

    public final void zzh(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzi(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            zze.zzi("Can not create dialog without Activity Context");
        } else {
            zzs.zza.post(new zzav(this, context, str, z, z2));
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) zzba.zzc().zzb(zzbjj.zzej), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            zze.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzim)).booleanValue()) {
                zzg zzh = zzt.zzo().zzh();
                if (true != equals) {
                    str = "";
                }
                zzh.zzA(str);
            }
            return equals;
        } catch (JSONException e2) {
            zze.zzk("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074 A[Catch:{ JSONException -> 0x0084 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075 A[Catch:{ JSONException -> 0x0084 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzk(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbjb r0 = com.google.android.gms.internal.ads.zzbjj.zzei
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.zzp(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = zzo(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0025
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.ads.internal.util.zze.zze(r4)
            return r0
        L_0x0025:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0084 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0084 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0084 }
            r3.zza = r6     // Catch:{ JSONException -> 0x0084 }
            com.google.android.gms.internal.ads.zzbjb r6 = com.google.android.gms.internal.ads.zzbjj.zzim     // Catch:{ JSONException -> 0x0084 }
            com.google.android.gms.internal.ads.zzbjh r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch:{ JSONException -> 0x0084 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ JSONException -> 0x0084 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0084 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0084 }
            r1 = 1
            if (r6 == 0) goto L_0x007a
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.zza     // Catch:{ JSONException -> 0x0084 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0084 }
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.zza     // Catch:{ JSONException -> 0x0084 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0084 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            r3.zzf(r6)     // Catch:{ JSONException -> 0x0084 }
            com.google.android.gms.internal.ads.zzcgx r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ JSONException -> 0x0084 }
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzh()     // Catch:{ JSONException -> 0x0084 }
            if (r6 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            java.lang.String r5 = ""
        L_0x0077:
            r2.zzA(r5)     // Catch:{ JSONException -> 0x0084 }
        L_0x007a:
            java.lang.Object r5 = r3.zzb
            monitor-enter(r5)
            r3.zzd = r4     // Catch:{ all -> 0x0081 }
            monitor-exit(r5)     // Catch:{ all -> 0x0081 }
            return r1
        L_0x0081:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0081 }
            throw r4
        L_0x0084:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.ads.internal.util.zze.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzaw.zzk(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        zze.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}

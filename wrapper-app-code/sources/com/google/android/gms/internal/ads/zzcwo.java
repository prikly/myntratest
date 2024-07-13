package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.core.device.MimeTypes;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcwo implements zzbum {
    private final Context zza;
    private final zzbbt zzb;
    private final PowerManager zzc;

    public zzcwo(Context context, zzbbt zzbbt) {
        this.zza = context;
        this.zzb = zzbbt;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: zza */
    public final JSONObject zzb(zzcwr zzcwr) throws JSONException {
        JSONObject jSONObject;
        boolean z;
        Integer num;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbbw zzbbw = zzcwr.zzf;
        if (zzbbw == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z2 = zzbbw.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcwr.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z3 = zzcwr.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcwr.zzb).put("isNative", this.zzb.zze());
            if (Build.VERSION.SDK_INT >= 20) {
                z = this.zzc.isInteractive();
            } else {
                z = this.zzc.isScreenOn();
            }
            put2.put("isScreenOn", z).put("appMuted", zzt.zzr().zze()).put("appVolume", (double) zzt.zzr().zza()).put("deviceVolume", (double) zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzff)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                if (audioManager == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(audioManager.getMode());
                }
                if (num != null) {
                    jSONObject3.put("audioMode", num);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzbbw.zzb).put("isAttachedToWindow", z2).put("viewBox", new JSONObject().put("top", zzbbw.zzc.top).put("bottom", zzbbw.zzc.bottom).put("left", zzbbw.zzc.left).put("right", zzbbw.zzc.right)).put("adBox", new JSONObject().put("top", zzbbw.zzd.top).put("bottom", zzbbw.zzd.bottom).put("left", zzbbw.zzd.left).put("right", zzbbw.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbbw.zze.top).put("bottom", zzbbw.zze.bottom).put("left", zzbbw.zze.left).put("right", zzbbw.zze.right)).put("globalVisibleBoxVisible", zzbbw.zzf).put("localVisibleBox", new JSONObject().put("top", zzbbw.zzg.top).put("bottom", zzbbw.zzg.bottom).put("left", zzbbw.zzg.left).put("right", zzbbw.zzg.right)).put("localVisibleBoxVisible", zzbbw.zzh).put("hitBox", new JSONObject().put("top", zzbbw.zzi.top).put("bottom", zzbbw.zzi.bottom).put("left", zzbbw.zzi.left).put("right", zzbbw.zzi.right)).put("screenDensity", (double) this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcwr.zza);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbi)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbbw.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcwr.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}

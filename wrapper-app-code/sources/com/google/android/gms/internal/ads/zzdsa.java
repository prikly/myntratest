package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzb;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdsa {
    private final zzdwp zza;
    private final zzdve zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdsa(zzdwp zzdwp, zzdve zzdve) {
        this.zza = zzdwp;
        this.zzb = zzdve;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzay.zzb();
        return zzchh.zzy(context, i);
    }

    public final View zza(View view, WindowManager windowManager) throws zzcnz {
        zzcno zza2 = this.zza.zza(zzq.zzc(), (zzfil) null, (zzfio) null);
        View view2 = (View) zza2;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza2.zzaf("/sendMessageToSdk", new zzdrw(this));
        zza2.zzaf("/hideValidatorOverlay", new zzdrx(this, windowManager, view));
        zza2.zzaf("/open", new zzbqn((zzb) null, (zzbyn) null, (zzekc) null, (zzdzh) null, (zzfnt) null));
        this.zzb.zzj(new WeakReference(zza2), "/loadNativeAdPolicyViolations", new zzdry(this, view, windowManager));
        this.zzb.zzj(new WeakReference(zza2), "/showValidatorOverlay", zzdrz.zza);
        return view2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcno zzcno, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcno zzcno, Map map) {
        zze.zze("Hide native ad policy validator overlay.");
        zzcno.zzH().setVisibility(8);
        if (zzcno.zzH().getWindowToken() != null) {
            windowManager.removeView(zzcno.zzH());
        }
        zzcno.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put(OSOutcomeConstants.OUTCOME_ID, (String) map.get(OSOutcomeConstants.OUTCOME_ID));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(View view, WindowManager windowManager, zzcno zzcno, Map map) {
        int i;
        zzcno.zzP().zzA(new zzdru(this, map));
        if (map != null) {
            Context context = view.getContext();
            int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) zzba.zzc().zzb(zzbjj.zzhm)).intValue());
            int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) zzba.zzc().zzb(zzbjj.zzhn)).intValue());
            int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcno.zzai(zzcpd.zzb(zzf, zzf2));
            try {
                zzcno.zzI().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().zzb(zzbjj.zzho)).booleanValue());
                zzcno.zzI().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().zzb(zzbjj.zzhp)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams zzb2 = zzbx.zzb();
            zzb2.x = zzf3;
            zzb2.y = zzf4;
            windowManager.updateViewLayout(zzcno.zzH(), zzb2);
            String str = (String) map.get(AdUnitActivity.EXTRA_ORIENTATION);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || "2".equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                this.zzc = new zzdrv(view, zzcno, str, zzb2, i - zzf4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcno.loadUrl(str2);
            }
        }
    }
}

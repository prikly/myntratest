package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzapj;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzm;
import com.google.android.gms.internal.ads.zzgfc;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class TaggingLibraryJsInterface {
    private final Context zza;
    /* access modifiers changed from: private */
    public final WebView zzb;
    private final zzapj zzc;
    private final int zzd;
    private final zzdzm zze;
    private final boolean zzf;
    private final zzgfc zzg = zzcib.zze;

    TaggingLibraryJsInterface(WebView webView, zzapj zzapj, zzdzm zzdzm) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzapj;
        this.zze = zzdzm;
        zzbjj.zzc(context);
        this.zzd = ((Integer) zzba.zzc().zzb(zzbjj.zziy)).intValue();
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbjj.zziz)).booleanValue();
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long currentTimeMillis = zzt.zzB().currentTimeMillis();
            String zze2 = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                long currentTimeMillis2 = zzt.zzB().currentTimeMillis() - currentTimeMillis;
                zzf.zzc(this.zze, (zzdzc) null, "csg", new Pair("clat", String.valueOf(currentTimeMillis2)));
            }
            return zze2;
        } catch (RuntimeException e2) {
            zze.zzh("Exception getting click signals. ", e2);
            zzt.zzo().zzu(e2, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            zze.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.zzd);
        try {
            return (String) zzcib.zza.zzb(new zzar(this, str)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            zze.zzh("Exception getting click signals with timeout. ", e2);
            zzt.zzo().zzu(e2, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e2 instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        zzas zzas = new zzas(this, uuid);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziB)).booleanValue()) {
            this.zzg.execute(new zzap(this, bundle, zzas));
        } else {
            Context context = this.zza;
            AdFormat adFormat = AdFormat.BANNER;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            QueryInfo.generate(context, adFormat, builder.build(), zzas);
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long currentTimeMillis = zzt.zzB().currentTimeMillis();
            String zzh = this.zzc.zzc().zzh(this.zza, this.zzb, (Activity) null);
            if (this.zzf) {
                long currentTimeMillis2 = zzt.zzB().currentTimeMillis() - currentTimeMillis;
                zzf.zzc(this.zze, (zzdzc) null, "vsg", new Pair("vlat", String.valueOf(currentTimeMillis2)));
            }
            return zzh;
        } catch (RuntimeException e2) {
            zze.zzh("Exception getting view signals. ", e2);
            zzt.zzo().zzu(e2, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            zze.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        int min = Math.min(i, this.zzd);
        try {
            return (String) zzcib.zza.zzb(new zzaq(this)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            zze.zzh("Exception getting view signals with timeout. ", e2);
            zzt.zzo().zzu(e2, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e2 instanceof TimeoutException) {
                return "17";
            }
            return "";
        }
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("x");
            int i2 = jSONObject.getInt("y");
            int i3 = jSONObject.getInt("duration_ms");
            float f2 = (float) jSONObject.getDouble("force");
            int i4 = jSONObject.getInt("type");
            try {
                this.zzc.zzd(MotionEvent.obtain(0, (long) i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i, (float) i2, f2, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e2) {
                e = e2;
                zze.zzh("Failed to parse the touch string. ", e);
                zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e3) {
            e = e3;
            zze.zzh("Failed to parse the touch string. ", e);
            zzt.zzo().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager zzb2 = zzt.zzq().zzb(this.zza);
        bundle.putBoolean("accept_3p_cookie", zzb2 != null ? zzb2.acceptThirdPartyCookies(this.zzb) : false);
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }
}

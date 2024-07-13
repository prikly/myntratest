package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfqx extends zzfqu {
    /* access modifiers changed from: private */
    public WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfqx(Map map, String str) {
        this.zzc = map;
    }

    public final void zzc() {
        long j;
        super.zzc();
        if (this.zzb == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfqw(this), Math.max(4000 - j, 2000));
        this.zza = null;
    }

    public final void zzf(zzfpx zzfpx, zzfpv zzfpv) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfpv.zzi();
        for (String str : zzi.keySet()) {
            zzfqy.zzh(jSONObject, str, (zzfqd) zzi.get(str));
        }
        zzg(zzfpx, zzfpv, jSONObject);
    }

    public final void zzj() {
        WebView webView = new WebView(zzfql.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfqd zzfqd = (zzfqd) this.zzc.get((String) it.next());
        throw null;
    }
}

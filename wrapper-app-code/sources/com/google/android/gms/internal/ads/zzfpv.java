package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfpv {
    private final zzfqc zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzfpw zzg;

    private zzfpv(zzfqc zzfqc, WebView webView, String str, List list, String str2, String str3, zzfpw zzfpw) {
        this.zza = zzfqc;
        this.zzb = webView;
        this.zzg = zzfpw;
        this.zzf = str2;
        this.zze = "";
    }

    public static zzfpv zzb(zzfqc zzfqc, WebView webView, String str, String str2) {
        return new zzfpv(zzfqc, webView, (String) null, (List) null, str, "", zzfpw.HTML);
    }

    public static zzfpv zzc(zzfqc zzfqc, WebView webView, String str, String str2) {
        return new zzfpv(zzfqc, webView, (String) null, (List) null, str, "", zzfpw.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfpw zzd() {
        return this.zzg;
    }

    public final zzfqc zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}

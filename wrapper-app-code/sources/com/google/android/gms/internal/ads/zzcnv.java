package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzcnv extends WebViewClient implements zzcpb {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private final HashSet zzB;
    private View.OnAttachStateChangeListener zzC;
    protected zzcep zza;
    private final zzcno zzc;
    private final zzbew zzd;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private zza zzg;
    private zzo zzh;
    private zzcoz zzi;
    private zzcpa zzj;
    private zzbow zzk;
    private zzboy zzl;
    private zzdmc zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private zzz zzs;
    private zzbys zzt;
    private zzb zzu;
    private zzbyn zzv;
    private zzfpo zzw;
    private boolean zzx;
    private boolean zzy;
    private int zzz;

    public zzcnv(zzcno zzcno, zzbew zzbew, boolean z) {
        zzbys zzbys = new zzbys(zzcno, zzcno.zzG(), new zzbit(zzcno.getContext()));
        this.zzd = zzbew;
        this.zzc = zzcno;
        this.zzp = z;
        this.zzt = zzbys;
        this.zzv = null;
        this.zzB = new HashSet(Arrays.asList(((String) zzba.zzc().zzb(zzbjj.zzfb)).split(",")));
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzaD)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzt.zzp().zze(this.zzc.getContext(), this.zzc.zzp().zza, false, httpURLConnection, false, 60000);
                        zzchn zzchn = new zzchn((String) null);
                        zzchn.zzc(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzchn.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            zzt.zzp();
                            WebResourceResponse zzM = zzs.zzM(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField(LogConstants.EVENT_LOCATION);
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    zze.zzj("Protocol is null");
                                    WebResourceResponse zzN = zzN();
                                    TrafficStats.clearThreadStatsTag();
                                    return zzN;
                                } else if (protocol.equals("http") || protocol.equals("https")) {
                                    zze.zze("Redirecting to " + headerField);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    zze.zzj("Unsupported scheme: " + protocol);
                                    return zzN();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzt.zzp();
            WebResourceResponse zzM2 = zzs.zzM(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return zzM2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (zze.zzc()) {
            zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbqd) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzC;
        if (onAttachStateChangeListener != null) {
            ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    public final void zzR(View view, zzcep zzcep, int i) {
        if (zzcep.zzi() && i > 0) {
            zzcep.zzg(view);
            if (zzcep.zzi()) {
                zzs.zza.postDelayed(new zzcnr(this, view, zzcep, i), 100);
            }
        }
    }

    private static final boolean zzS(boolean z, zzcno zzcno) {
        return z && !zzcno.zzQ().zzi() && !zzcno.zzU().equals("interstitial_mb");
    }

    public final void onAdClicked() {
        zza zza2 = this.zzg;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzi(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.zzj = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        zzg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.zzx = true;
        r1 = r0.zzj;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.zzf
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcno r2 = r0.zzc     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.zzaB()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.zza(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.zzcno r2 = r0.zzc     // Catch:{ all -> 0x0029 }
            r2.zzW()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.zzx = r1
            com.google.android.gms.internal.ads.zzcpa r1 = r0.zzj
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.zzj = r1
        L_0x0025:
            r0.zzg()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcnv.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.zzn && webView == this.zzc.zzI()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zza zza2 = this.zzg;
                    if (zza2 != null) {
                        zza2.onAdClicked();
                        zzcep zzcep = this.zza;
                        if (zzcep != null) {
                            zzcep.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdmc zzdmc = this.zzm;
                    if (zzdmc != null) {
                        zzdmc.zzq();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzI().willNotDraw()) {
                try {
                    zzapj zzK = this.zzc.zzK();
                    if (zzK != null && zzK.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcno zzcno = this.zzc;
                        parse = zzK.zza(parse, context, (View) zzcno, zzcno.zzk());
                    }
                } catch (zzapk unused) {
                    zze.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzb2 = this.zzu;
                if (zzb2 == null || zzb2.zzc()) {
                    zzs(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (zzx) null), true);
                } else {
                    this.zzu.zzb(str);
                }
            } else {
                zze.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        } else {
            zzi(parse);
        }
        return true;
    }

    public final void zzA(zzcoz zzcoz) {
        this.zzi = zzcoz;
    }

    public final void zzB(int i, int i2) {
        zzbyn zzbyn = this.zzv;
        if (zzbyn != null) {
            zzbyn.zzd(i, i2);
        }
    }

    public final void zzC(boolean z) {
        this.zzn = false;
    }

    public final void zzD(boolean z) {
        synchronized (this.zzf) {
            this.zzr = z;
        }
    }

    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzp = true;
            zzcib.zze.execute(new zzcnq(this));
        }
    }

    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzq = true;
        }
    }

    public final void zzG(zzcpa zzcpa) {
        this.zzj = zzcpa;
    }

    public final void zzH(String str, zzbqd zzbqd) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list != null) {
                list.remove(zzbqd);
            }
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbqd> list = (List) this.zze.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzbqd zzbqd : list) {
                    if (predicate.apply(zzbqd)) {
                        arrayList.add(zzbqd);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    public final boolean zzJ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzr;
        }
        return z;
    }

    public final boolean zzK() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzp;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzq;
        }
        return z;
    }

    public final void zzM(zza zza2, zzbow zzbow, zzo zzo2, zzboy zzboy, zzz zzz2, boolean z, zzbqf zzbqf, zzb zzb2, zzbyu zzbyu, zzcep zzcep, zzekc zzekc, zzfpo zzfpo, zzdzh zzdzh, zzfnt zzfnt, zzbqv zzbqv, zzdmc zzdmc, zzbqu zzbqu, zzbqo zzbqo) {
        zzbow zzbow2 = zzbow;
        zzboy zzboy2 = zzboy;
        zzbqf zzbqf2 = zzbqf;
        zzbyu zzbyu2 = zzbyu;
        zzcep zzcep2 = zzcep;
        zzekc zzekc2 = zzekc;
        zzfpo zzfpo2 = zzfpo;
        zzbqv zzbqv2 = zzbqv;
        zzdmc zzdmc2 = zzdmc;
        zzbqu zzbqu2 = zzbqu;
        zzbqo zzbqo2 = zzbqo;
        zzb zzb3 = zzb2 == null ? new zzb(this.zzc.getContext(), zzcep2, (zzcbh) null) : zzb2;
        this.zzv = new zzbyn(this.zzc, zzbyu2);
        this.zza = zzcep2;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzaL)).booleanValue()) {
            zzy("/adMetadata", new zzbov(zzbow2));
        }
        if (zzboy2 != null) {
            zzy("/appEvent", new zzbox(zzboy2));
        }
        zzy("/backButton", zzbqc.zzj);
        zzy("/refresh", zzbqc.zzk);
        zzy("/canOpenApp", zzbqc.zzb);
        zzy("/canOpenURLs", zzbqc.zza);
        zzy("/canOpenIntents", zzbqc.zzc);
        zzy("/close", zzbqc.zzd);
        zzy("/customClose", zzbqc.zze);
        zzy("/instrument", zzbqc.zzn);
        zzy("/delayPageLoaded", zzbqc.zzp);
        zzy("/delayPageClosed", zzbqc.zzq);
        zzy("/getLocationInfo", zzbqc.zzr);
        zzy("/log", zzbqc.zzg);
        zzy("/mraid", new zzbqj(zzb3, this.zzv, zzbyu2));
        zzbys zzbys = this.zzt;
        if (zzbys != null) {
            zzy("/mraidLoaded", zzbys);
        }
        zzbqn zzbqn = r4;
        zzb zzb4 = zzb3;
        zzbqn zzbqn2 = new zzbqn(zzb3, this.zzv, zzekc, zzdzh, zzfnt);
        zzy("/open", zzbqn);
        zzy("/precache", new zzcmb());
        zzy("/touch", zzbqc.zzi);
        zzy("/video", zzbqc.zzl);
        zzy("/videoMeta", zzbqc.zzm);
        if (zzekc2 == null || zzfpo2 == null) {
            zzy("/click", zzbqc.zza(zzdmc));
            zzy("/httpTrack", zzbqc.zzf);
        } else {
            zzy("/click", new zzfjn(zzdmc2, zzfpo2, zzekc2));
            zzy("/httpTrack", new zzfjm(zzfpo2, zzekc2));
        }
        if (zzt.zzn().zzu(this.zzc.getContext())) {
            zzy("/logScionEvent", new zzbqi(this.zzc.getContext()));
        }
        if (zzbqf2 != null) {
            zzy("/setInterstitialProperties", new zzbqe(zzbqf2, (byte[]) null));
        }
        if (zzbqv2 != null) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzhX)).booleanValue()) {
                zzy("/inspectorNetworkExtras", zzbqv2);
            }
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziq)).booleanValue() && zzbqu2 != null) {
            zzy("/shareSheet", zzbqu2);
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzit)).booleanValue() && zzbqo2 != null) {
            zzy("/inspectorOutOfContextTest", zzbqo2);
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjv)).booleanValue()) {
            zzy("/bindPlayStoreOverlay", zzbqc.zzu);
            zzy("/presentPlayStoreOverlay", zzbqc.zzv);
            zzy("/expandPlayStoreOverlay", zzbqc.zzw);
            zzy("/collapsePlayStoreOverlay", zzbqc.zzx);
            zzy("/closePlayStoreOverlay", zzbqc.zzy);
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzcK)).booleanValue()) {
                zzy("/setPAIDPersonalizationEnabled", zzbqc.zzA);
                zzy("/resetPAID", zzbqc.zzz);
            }
        }
        this.zzg = zza2;
        this.zzh = zzo2;
        this.zzk = zzbow;
        this.zzl = zzboy;
        this.zzs = zzz2;
        this.zzu = zzb4;
        this.zzm = zzdmc2;
        this.zzn = z;
        this.zzw = zzfpo2;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse zzc(String str, Map map) {
        zzbef zzb2;
        try {
            if (((Boolean) zzbla.zza.zze()).booleanValue()) {
                if (this.zzw != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.zzw.zzc(str, (zzfow) null);
                    return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
                }
            }
            String zzc2 = zzcfv.zzc(str, this.zzc.getContext(), this.zzA);
            if (!zzc2.equals(str)) {
                return zzO(zzc2, map);
            }
            zzbei zza2 = zzbei.zza(Uri.parse(str));
            if (zza2 != null && (zzb2 = zzt.zzc().zzb(zza2)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (!zzchn.zzl() || !((Boolean) zzbkv.zzb.zze()).booleanValue()) {
                return null;
            }
            return zzO(str, map);
        } catch (Exception | NoClassDefFoundError e2) {
            zzt.zzo().zzu(e2, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    public final zzb zzd() {
        return this.zzu;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzx && this.zzz <= 0) || this.zzy || this.zzo)) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzbF)).booleanValue() && this.zzc.zzo() != null) {
                zzbjq.zza(this.zzc.zzo().zza(), this.zzc.zzn(), "awfllc");
            }
            zzcoz zzcoz = this.zzi;
            boolean z = false;
            if (!this.zzy && !this.zzo) {
                z = true;
            }
            zzcoz.zza(z);
            this.zzi = null;
        }
        this.zzc.zzae();
    }

    public final void zzh(boolean z) {
        this.zzA = z;
    }

    public final void zzi(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path == null || list == null) {
            zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzgh)).booleanValue() && zzt.zzo().zzf() != null) {
                zzcib.zza.execute(new zzcnp((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfa)).booleanValue() && this.zzB.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzba.zzc().zzb(zzbjj.zzfc)).intValue()) {
                zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzger.zzr(zzt.zzp().zzb(uri), new zzcnt(this, list, path, uri), zzcib.zze);
                return;
            }
        }
        zzt.zzp();
        zzP(zzs.zzL(uri), list, path);
    }

    public final void zzj() {
        zzbew zzbew = this.zzd;
        if (zzbew != null) {
            zzbew.zzc(10005);
        }
        this.zzy = true;
        zzg();
        this.zzc.destroy();
    }

    public final void zzk() {
        synchronized (this.zzf) {
        }
        this.zzz++;
        zzg();
    }

    public final void zzl() {
        this.zzz--;
        zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm() {
        this.zzc.zzac();
        zzl zzN = this.zzc.zzN();
        if (zzN != null) {
            zzN.zzx();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(View view, zzcep zzcep, int i) {
        zzR(view, zzcep, i - 1);
    }

    public final void zzo(int i, int i2, boolean z) {
        zzbys zzbys = this.zzt;
        if (zzbys != null) {
            zzbys.zzb(i, i2);
        }
        zzbyn zzbyn = this.zzv;
        if (zzbyn != null) {
            zzbyn.zzc(i, i2, false);
        }
    }

    public final void zzp() {
        zzcep zzcep = this.zza;
        if (zzcep != null) {
            WebView zzI = this.zzc.zzI();
            if (ViewCompat.isAttachedToWindow(zzI)) {
                zzR(zzI, zzcep, 10);
                return;
            }
            zzQ();
            zzcns zzcns = new zzcns(this, zzcep);
            this.zzC = zzcns;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcns);
        }
    }

    public final void zzq() {
        zzdmc zzdmc = this.zzm;
        if (zzdmc != null) {
            zzdmc.zzq();
        }
    }

    public final void zzr() {
        zzdmc zzdmc = this.zzm;
        if (zzdmc != null) {
            zzdmc.zzr();
        }
    }

    public final void zzs(zzc zzc2, boolean z) {
        zzdmc zzdmc;
        boolean zzaC = this.zzc.zzaC();
        boolean zzS = zzS(zzaC, this.zzc);
        boolean z2 = true;
        if (!zzS && z) {
            z2 = false;
        }
        zza zza2 = zzS ? null : this.zzg;
        zzo zzo2 = zzaC ? null : this.zzh;
        zzz zzz2 = this.zzs;
        zzchu zzp2 = this.zzc.zzp();
        zzcno zzcno = this.zzc;
        if (z2) {
            zzdmc = null;
        } else {
            zzdmc = this.zzm;
        }
        zzv(new AdOverlayInfoParcel(zzc2, zza2, zzo2, zzz2, zzp2, zzcno, zzdmc));
    }

    public final void zzt(zzbr zzbr, zzekc zzekc, zzdzh zzdzh, zzfnt zzfnt, String str, String str2, int i) {
        zzcno zzcno = this.zzc;
        zzv(new AdOverlayInfoParcel(zzcno, zzcno.zzp(), zzbr, zzekc, zzdzh, zzfnt, str, str2, 14));
    }

    public final void zzu(boolean z, int i, boolean z2) {
        zzdmc zzdmc;
        boolean zzS = zzS(this.zzc.zzaC(), this.zzc);
        boolean z3 = true;
        if (!zzS && z2) {
            z3 = false;
        }
        zza zza2 = zzS ? null : this.zzg;
        zzo zzo2 = this.zzh;
        zzz zzz2 = this.zzs;
        zzcno zzcno = this.zzc;
        zzchu zzp2 = zzcno.zzp();
        if (z3) {
            zzdmc = null;
        } else {
            zzdmc = this.zzm;
        }
        zzv(new AdOverlayInfoParcel(zza2, zzo2, zzz2, zzcno, z, i, zzp2, zzdmc));
    }

    public final void zzv(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc2;
        zzbyn zzbyn = this.zzv;
        boolean zze2 = zzbyn != null ? zzbyn.zze() : false;
        zzt.zzi();
        zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !zze2);
        zzcep zzcep = this.zza;
        if (zzcep != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzc2 = adOverlayInfoParcel.zza) != null) {
                str = zzc2.zzb;
            }
            zzcep.zzh(str);
        }
    }

    public final void zzw(boolean z, int i, String str, boolean z2) {
        zza zza2;
        zzdmc zzdmc;
        boolean zzaC = this.zzc.zzaC();
        boolean zzS = zzS(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzS && z2) {
            z3 = false;
        }
        if (zzS) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzcnu zzcnu = zzaC ? null : new zzcnu(this.zzc, this.zzh);
        zzbow zzbow = this.zzk;
        zzboy zzboy = this.zzl;
        zzz zzz2 = this.zzs;
        zzcno zzcno = this.zzc;
        zzchu zzp2 = zzcno.zzp();
        if (z3) {
            zzdmc = null;
        } else {
            zzdmc = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, zzcnu, zzbow, zzboy, zzz2, zzcno, z, i, str, zzp2, zzdmc);
        zzv(adOverlayInfoParcel);
    }

    public final void zzx(boolean z, int i, String str, String str2, boolean z2) {
        zza zza2;
        zzdmc zzdmc;
        boolean zzaC = this.zzc.zzaC();
        boolean zzS = zzS(zzaC, this.zzc);
        boolean z3 = true;
        if (!zzS && z2) {
            z3 = false;
        }
        if (zzS) {
            zza2 = null;
        } else {
            zza2 = this.zzg;
        }
        zzcnu zzcnu = zzaC ? null : new zzcnu(this.zzc, this.zzh);
        zzbow zzbow = this.zzk;
        zzboy zzboy = this.zzl;
        zzz zzz2 = this.zzs;
        zzcno zzcno = this.zzc;
        zzchu zzp2 = zzcno.zzp();
        if (z3) {
            zzdmc = null;
        } else {
            zzdmc = this.zzm;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza2, (zzo) zzcnu, zzbow, zzboy, zzz2, zzcno, z, i, str, str2, zzp2, zzdmc);
        zzv(adOverlayInfoParcel);
    }

    public final void zzy(String str, zzbqd zzbqd) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbqd);
        }
    }

    public final void zzz() {
        zzcep zzcep = this.zza;
        if (zzcep != null) {
            zzcep.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzp = false;
            this.zzq = false;
            this.zzs = null;
            this.zzu = null;
            this.zzt = null;
            zzbyn zzbyn = this.zzv;
            if (zzbyn != null) {
                zzbyn.zza(true);
                this.zzv = null;
            }
            this.zzw = null;
        }
    }
}

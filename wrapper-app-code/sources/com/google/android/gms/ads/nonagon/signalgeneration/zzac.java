package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzapj;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbks;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzchu;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcpj;
import com.google.android.gms.internal.ads.zzdve;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzdzm;
import com.google.android.gms.internal.ads.zzfkc;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfow;
import com.google.android.gms.internal.ads.zzfoy;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfyt;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzgfb;
import com.google.android.gms.internal.ads.zzgfc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzac extends zzcge {
    protected static final List zza = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));
    protected static final List zzb = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));
    protected static final List zzc = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));
    protected static final List zzd = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));
    public static final /* synthetic */ int zze = 0;
    /* access modifiers changed from: private */
    public final zzchu zzA;
    /* access modifiers changed from: private */
    public String zzB;
    /* access modifiers changed from: private */
    public final String zzC;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzgfc zzH = zzcib.zze;
    private final zzcpj zzf;
    /* access modifiers changed from: private */
    public Context zzg;
    private final zzapj zzh;
    private final zzfkc zzi;
    /* access modifiers changed from: private */
    public zzdzc zzj = null;
    private final zzgfc zzk;
    private final ScheduledExecutorService zzl;
    private zzcao zzm;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final zzc zzq;
    /* access modifiers changed from: private */
    public final zzdzm zzr;
    /* access modifiers changed from: private */
    public final zzfpo zzs;
    /* access modifiers changed from: private */
    public final boolean zzt;
    /* access modifiers changed from: private */
    public final boolean zzu;
    /* access modifiers changed from: private */
    public final boolean zzv;
    /* access modifiers changed from: private */
    public final boolean zzw;
    /* access modifiers changed from: private */
    public final String zzx;
    /* access modifiers changed from: private */
    public final String zzy;
    /* access modifiers changed from: private */
    public final AtomicInteger zzz = new AtomicInteger(0);

    public zzac(zzcpj zzcpj, Context context, zzapj zzapj, zzfkc zzfkc, zzgfc zzgfc, ScheduledExecutorService scheduledExecutorService, zzdzm zzdzm, zzfpo zzfpo, zzchu zzchu) {
        List list;
        this.zzf = zzcpj;
        this.zzg = context;
        this.zzh = zzapj;
        this.zzi = zzfkc;
        this.zzk = zzgfc;
        this.zzl = scheduledExecutorService;
        this.zzq = zzcpj.zzn();
        this.zzr = zzdzm;
        this.zzs = zzfpo;
        this.zzA = zzchu;
        this.zzt = ((Boolean) zzba.zzc().zzb(zzbjj.zzgH)).booleanValue();
        this.zzu = ((Boolean) zzba.zzc().zzb(zzbjj.zzgG)).booleanValue();
        this.zzv = ((Boolean) zzba.zzc().zzb(zzbjj.zzgI)).booleanValue();
        this.zzw = ((Boolean) zzba.zzc().zzb(zzbjj.zzgK)).booleanValue();
        this.zzx = (String) zzba.zzc().zzb(zzbjj.zzgJ);
        this.zzy = (String) zzba.zzc().zzb(zzbjj.zzgL);
        this.zzC = (String) zzba.zzc().zzb(zzbjj.zzgM);
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgN)).booleanValue()) {
            this.zzD = zzY((String) zzba.zzc().zzb(zzbjj.zzgO));
            this.zzE = zzY((String) zzba.zzc().zzb(zzbjj.zzgP));
            this.zzF = zzY((String) zzba.zzc().zzb(zzbjj.zzgQ));
            list = zzY((String) zzba.zzc().zzb(zzbjj.zzgR));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    static /* bridge */ /* synthetic */ void zzF(zzac zzac, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzac.zzO((Uri) it.next())) {
                zzac.zzz.getAndIncrement();
                return;
            }
        }
    }

    static /* bridge */ /* synthetic */ void zzG(zzac zzac, String str, String str2, zzdzc zzdzc) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgs)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzgy)).booleanValue()) {
                zzcib.zza.execute(new zzi(zzac, str, str2, zzdzc));
            } else {
                zzac.zzq.zzd(str, str2, zzdzc);
            }
        }
    }

    static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzX(uri, "nas", str) : uri;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzh zzR(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.ads.internal.client.zzq r11, com.google.android.gms.ads.internal.client.zzl r12) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfje r0 = new com.google.android.gms.internal.ads.zzfje
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r10)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0019
            com.google.android.gms.internal.ads.zzfir r2 = r0.zzo()
            r2.zza(r5)
            goto L_0x0026
        L_0x0019:
            boolean r2 = r3.equals(r10)
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.zzfir r2 = r0.zzo()
            r2.zza(r4)
        L_0x0026:
            com.google.android.gms.internal.ads.zzcpj r2 = r7.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r2 = r2.zzo()
            com.google.android.gms.internal.ads.zzddx r6 = new com.google.android.gms.internal.ads.zzddx
            r6.<init>()
            r6.zzc(r8)
            if (r9 != 0) goto L_0x0038
            java.lang.String r9 = "adUnitId"
        L_0x0038:
            r0.zzs(r9)
            if (r12 != 0) goto L_0x0046
            com.google.android.gms.ads.internal.client.zzm r9 = new com.google.android.gms.ads.internal.client.zzm
            r9.<init>()
            com.google.android.gms.ads.internal.client.zzl r12 = r9.zza()
        L_0x0046:
            r0.zzE(r12)
            r9 = 1
            if (r11 != 0) goto L_0x00aa
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -1999289321: goto L_0x0079;
                case -428325382: goto L_0x006f;
                case 543046670: goto L_0x0067;
                case 1854800829: goto L_0x005f;
                case 1951953708: goto L_0x0055;
                default: goto L_0x0054;
            }
        L_0x0054:
            goto L_0x0083
        L_0x0055:
            java.lang.String r11 = "BANNER"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 0
            goto L_0x0084
        L_0x005f:
            boolean r11 = r10.equals(r3)
            if (r11 == 0) goto L_0x0083
            r11 = 2
            goto L_0x0084
        L_0x0067:
            boolean r11 = r10.equals(r1)
            if (r11 == 0) goto L_0x0083
            r11 = 1
            goto L_0x0084
        L_0x006f:
            java.lang.String r11 = "APP_OPEN_AD"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 4
            goto L_0x0084
        L_0x0079:
            java.lang.String r11 = "NATIVE"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0083
            r11 = 3
            goto L_0x0084
        L_0x0083:
            r11 = -1
        L_0x0084:
            if (r11 == 0) goto L_0x00a3
            if (r11 == r9) goto L_0x009e
            if (r11 == r5) goto L_0x009e
            if (r11 == r4) goto L_0x0099
            if (r11 == r12) goto L_0x0094
            com.google.android.gms.ads.internal.client.zzq r11 = new com.google.android.gms.ads.internal.client.zzq
            r11.<init>()
            goto L_0x00aa
        L_0x0094:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzb()
            goto L_0x00aa
        L_0x0099:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzc()
            goto L_0x00aa
        L_0x009e:
            com.google.android.gms.ads.internal.client.zzq r11 = com.google.android.gms.ads.internal.client.zzq.zzd()
            goto L_0x00aa
        L_0x00a3:
            com.google.android.gms.ads.internal.client.zzq r11 = new com.google.android.gms.ads.internal.client.zzq
            com.google.android.gms.ads.AdSize r12 = com.google.android.gms.ads.AdSize.BANNER
            r11.<init>((android.content.Context) r8, (com.google.android.gms.ads.AdSize) r12)
        L_0x00aa:
            r0.zzr(r11)
            r0.zzx(r9)
            com.google.android.gms.internal.ads.zzfjg r8 = r0.zzG()
            r6.zzf(r8)
            com.google.android.gms.internal.ads.zzddz r8 = r6.zzg()
            r2.zza(r8)
            com.google.android.gms.ads.nonagon.signalgeneration.zzae r8 = new com.google.android.gms.ads.nonagon.signalgeneration.zzae
            r8.<init>()
            r8.zza(r10)
            com.google.android.gms.ads.nonagon.signalgeneration.zzag r9 = new com.google.android.gms.ads.nonagon.signalgeneration.zzag
            r10 = 0
            r9.<init>(r8, r10)
            r2.zzb(r9)
            com.google.android.gms.internal.ads.zzdjy r8 = new com.google.android.gms.internal.ads.zzdjy
            r8.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzh r8 = r2.zzc()
            com.google.android.gms.internal.ads.zzdzc r9 = r8.zza()
            r7.zzj = r9
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzac.zzR(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.ads.internal.client.zzl):com.google.android.gms.ads.nonagon.signalgeneration.zzh");
    }

    private final zzgfb zzS(String str) {
        zzdve[] zzdveArr = new zzdve[1];
        zzgfb zzn2 = zzger.zzn(this.zzi.zza(), new zzl(this, zzdveArr, str), this.zzk);
        zzn2.zzc(new zzm(this, zzdveArr), this.zzk);
        return zzger.zzf(zzger.zzm((zzgei) zzger.zzo(zzgei.zzv(zzn2), (long) ((Integer) zzba.zzc().zzb(zzbjj.zzgW)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzj.zza, this.zzk), Exception.class, zzk.zza, this.zzk);
    }

    private final void zzT(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf, boolean z) {
        zzgfb zzgfb;
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgV)).booleanValue()) {
            zze.zzj("The updating URL feature is not enabled.");
            try {
                zzcaf.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e2) {
                zzcho.zzh("", e2);
            }
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (zzO((Uri) it.next())) {
                    i++;
                }
            }
            if (i > 1) {
                zze.zzj("Multiple google urls found: ".concat(String.valueOf(String.valueOf(list))));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!zzO(uri)) {
                    zze.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                    zzgfb = zzger.zzi(uri);
                } else {
                    zzgfb = this.zzk.zzb(new zzs(this, uri, iObjectWrapper));
                    if (zzW()) {
                        zzgfb = zzger.zzn(zzgfb, new zzt(this), this.zzk);
                    } else {
                        zze.zzi("Asset view map is empty.");
                    }
                }
                arrayList.add(zzgfb);
            }
            zzger.zzr(zzger.zze(arrayList), new zzz(this, zzcaf, z), this.zzf.zzB());
        }
    }

    private final void zzU(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf, boolean z) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzgV)).booleanValue()) {
            try {
                zzcaf.zze("The updating URL feature is not enabled.");
            } catch (RemoteException e2) {
                zzcho.zzh("", e2);
            }
        } else {
            zzgfb zzb2 = this.zzk.zzb(new zzu(this, list, iObjectWrapper));
            if (zzW()) {
                zzb2 = zzger.zzn(zzb2, new zzv(this), this.zzk);
            } else {
                zze.zzi("Asset view map is empty.");
            }
            zzger.zzr(zzb2, new zzy(this, zzcaf, z), this.zzf.zzB());
        }
    }

    private static boolean zzV(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.zzb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzW() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzcao r0 = r1.zzm
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.zzb
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzac.zzW():boolean");
    }

    /* access modifiers changed from: private */
    public static final Uri zzX(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    private static final List zzY(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfyt.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    static /* bridge */ /* synthetic */ zzfow zzr(zzgfb zzgfb, zzcgj zzcgj) {
        String str;
        if (!zzfoy.zza() || !((Boolean) zzbks.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfow zzb2 = ((zzh) zzger.zzp(zzgfb)).zzb();
            zzb2.zzd(new ArrayList(Collections.singletonList(zzcgj.zzb)));
            zzl zzl2 = zzcgj.zzd;
            if (zzl2 == null) {
                str = "";
            } else {
                str = zzl2.zzp;
            }
            zzb2.zzb(str);
            return zzb2;
        } catch (ExecutionException e2) {
            zzt.zzo().zzu(e2, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzX(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zzh2 = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(zzh2)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzP(uri)) {
                    zze.zzj("Not a Google URL: ".concat(String.valueOf(String.valueOf(uri))));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzX(uri, "ms", zzh2));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(WebView webView) {
        CookieManager zzb2 = zzt.zzq().zzb(this.zzg);
        boolean acceptThirdPartyCookies = zzb2 != null ? zzb2.acceptThirdPartyCookies(webView) : false;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziC)).booleanValue()) {
            zzdzm zzdzm = this.zzr;
            zzdzc zzdzc = this.zzj;
            Pair[] pairArr = new Pair[1];
            pairArr[0] = new Pair("tpc", true != acceptThirdPartyCookies ? BuildConfig.ADAPTER_VERSION : "1");
            zzf.zzc(zzdzm, zzdzc, "reg_wv", pairArr);
        }
        if (acceptThirdPartyCookies) {
            Context context = this.zzg;
            zzbjb zzbjb = zzbjj.zziE;
            AdRequest.Builder builder = new AdRequest.Builder();
            builder.setRequestAgent("paw");
            InterstitialAd.load(context, (String) zzba.zzc().zzb(zzbjb), builder.build(), new zzab(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(zzdve[] zzdveArr) {
        zzdve zzdve = zzdveArr[0];
        if (zzdve != null) {
            this.zzi.zzb(zzger.zzi(zzdve));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(String str, String str2, zzdzc zzdzc) {
        this.zzq.zzd(str, str2, zzdzc);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzO(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzP(Uri uri) {
        return zzV(uri, this.zzF, this.zzG);
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzcgj zzcgj, zzcgc zzcgc) {
        zzgfb zzgfb;
        zzgfb zzgfb2;
        zzcgj zzcgj2 = zzcgj;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfol zza2 = zzfok.zza(context, 22);
        zza2.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzji)).booleanValue()) {
            zzgfb zzb2 = zzcib.zza.zzb(new zzq(this, zzcgj));
            zzgfb2 = zzb2;
            zzgfb = zzger.zzn(zzb2, zzr.zza, zzcib.zza);
        } else {
            zzh zzR = zzR(this.zzg, zzcgj2.zza, zzcgj2.zzb, zzcgj2.zzc, zzcgj2.zzd);
            zzgfb zzi2 = zzger.zzi(zzR);
            zzgfb = zzR.zzc();
            zzgfb2 = zzi2;
        }
        zzger.zzr(zzgfb, new zzx(this, zzgfb2, zzcgj, zzcgc, zza2, zzt.zzB().currentTimeMillis()), this.zzf.zzB());
    }

    public final void zzf(zzcao zzcao) {
        this.zzm = zzcao;
        this.zzi.zzc(1);
    }

    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) {
        zzT(list, iObjectWrapper, zzcaf, true);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) {
        zzU(list, iObjectWrapper, zzcaf, true);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
        zzgfb zzgfb;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zziw)).booleanValue()) {
            if (Build.VERSION.SDK_INT < 21) {
                zze.zzj("Not registering the webview because the Android API level is lower than Lollopop which has security risks on webviews.");
                return;
            }
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzix)).booleanValue()) {
                if (!((Boolean) zzba.zzc().zzb(zzbjj.zziA)).booleanValue()) {
                    if (((Boolean) zzba.zzc().zzb(zzbjj.zzji)).booleanValue()) {
                        zzgfb = zzger.zzl(new zzw(this), zzcib.zza);
                    } else {
                        zzgfb = zzR(this.zzg, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).zzc();
                    }
                    zzger.zzr(zzgfb, new zzaa(this), this.zzf.zzB());
                }
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                zze.zzg("The webView cannot be null.");
            } else if (this.zzp.contains(webView)) {
                zze.zzi("This webview has already been registered.");
            } else {
                this.zzp.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr), "gmaSdk");
                if (((Boolean) zzba.zzc().zzb(zzbjj.zziD)).booleanValue()) {
                    this.zzH.execute(new zzo(this, webView));
                }
            }
        }
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        View view;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzgV)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzcao zzcao = this.zzm;
            if (zzcao == null) {
                view = null;
            } else {
                view = zzcao.zza;
            }
            this.zzn = zzbx.zza(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation((float) this.zzn.x, (float) this.zzn.y);
            this.zzh.zzd(obtain);
            obtain.recycle();
        }
    }

    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) {
        zzT(list, iObjectWrapper, zzcaf, false);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzcaf zzcaf) {
        zzU(list, iObjectWrapper, zzcaf, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null);
        } catch (zzapk e2) {
            zzcho.zzk("", e2);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzh zzq(zzcgj zzcgj) throws Exception {
        return zzR(this.zzg, zzcgj.zza, zzcgj.zzb, zzcgj.zzc, zzcgj.zzd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzu() throws Exception {
        return zzR(this.zzg, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).zzc();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzv(zzdve[] zzdveArr, String str, zzdve zzdve) throws Exception {
        zzdveArr[0] = zzdve;
        Context context = this.zzg;
        zzcao zzcao = this.zzm;
        Map map = zzcao.zzb;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzcao.zza, (ImageView.ScaleType) null);
        JSONObject zzg2 = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf2 = zzbx.zzf(this.zzm.zza);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg2);
        jSONObject.put("scroll_view_signal", zzf2);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc((String) null, this.zzg, this.zzo, this.zzn));
        }
        return zzdve.zzd(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzgfb zzw(ArrayList arrayList) throws Exception {
        return zzger.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzp(this, arrayList), this.zzk);
    }
}

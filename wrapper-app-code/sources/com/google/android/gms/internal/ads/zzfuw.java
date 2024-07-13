package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzfuw extends zzfuk {
    private zzfyu<Integer> zza;
    private zzfyu<Integer> zzb;
    private zzfuv zzc;
    private HttpURLConnection zzd;

    zzfuw() {
        this(zzfut.zza, zzfuu.zza, (zzfuv) null);
    }

    zzfuw(zzfyu<Integer> zzfyu, zzfyu<Integer> zzfyu2, zzfuv zzfuv) {
        this.zza = zzfyu;
        this.zzb = zzfyu2;
        this.zzc = zzfuv;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzful.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzful.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfuv zzfuv = this.zzc;
        if (zzfuv != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) zzfuv.zza();
            this.zzd = httpURLConnection;
            return httpURLConnection;
        }
        throw null;
    }

    public HttpURLConnection zzn(zzfuv zzfuv, int i, int i2) throws IOException {
        this.zza = new zzfum(i);
        this.zzb = new zzfun(i2);
        this.zzc = zzfuv;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i, int i2) throws IOException {
        this.zza = new zzfuo(i);
        this.zzb = new zzfup(i2);
        this.zzc = new zzfuq(network, url);
        return zzm();
    }

    public URLConnection zzr(URL url, int i) throws IOException {
        this.zza = new zzfur(i);
        this.zzc = new zzfus(url);
        return zzm();
    }
}

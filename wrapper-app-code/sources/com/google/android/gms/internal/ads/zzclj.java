package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzclj implements zzbac {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzbab zzf = new zzbab();
    private final zzbai zzg;
    private zzazv zzh;
    private HttpURLConnection zzi;
    private final Queue zzj;
    private InputStream zzk;
    private boolean zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    zzclj(String str, zzbai zzbai, int i, int i2, long j, long j2) {
        zzbaj.zzb(str);
        this.zze = str;
        this.zzg = zzbai;
        this.zzc = i;
        this.zzd = i2;
        this.zzj = new ArrayDeque();
        this.zzr = j;
        this.zzs = j2;
    }

    private final void zzg() {
        while (!this.zzj.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzj.remove()).disconnect();
            } catch (Exception e2) {
                zze.zzh("Unexpected error while disconnecting", e2);
            }
        }
        this.zzi = null;
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzazz {
        int i3 = i2;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            long j2 = this.zzn;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = (long) i3;
            long j4 = this.zzs;
            long j5 = this.zzq;
            long j6 = j5 + 1;
            if (this.zzo + j2 + j3 + j4 > j6) {
                long j7 = this.zzp;
                if (j5 < j7) {
                    long min = Math.min(j7, Math.max(((this.zzr + j6) - j4) - 1, -1 + j6 + j3));
                    long j8 = j6;
                    long j9 = min;
                    zzf(j8, min, 2);
                    this.zzq = j9;
                    j5 = j9;
                }
            }
            int read = this.zzk.read(bArr, i, (int) Math.min(j3, ((j5 + 1) - this.zzo) - this.zzn));
            if (read != -1) {
                this.zzn += (long) read;
                zzbai zzbai = this.zzg;
                if (zzbai != null) {
                    ((zzclf) zzbai).zzW(this, read);
                }
                return read;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new zzazz(e2, this.zzh, 2);
        }
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void zzd() throws zzazz {
        try {
            InputStream inputStream = this.zzk;
            if (inputStream != null) {
                inputStream.close();
            }
            this.zzk = null;
            zzg();
            if (this.zzl) {
                this.zzl = false;
            }
        } catch (IOException e2) {
            throw new zzazz(e2, this.zzh, 3);
        } catch (Throwable th) {
            this.zzk = null;
            zzg();
            if (this.zzl) {
                this.zzl = false;
            }
            throw th;
        }
    }

    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* access modifiers changed from: package-private */
    public final HttpURLConnection zzf(long j, long j2, int i) throws zzazz {
        String uri = this.zzh.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzc);
            httpURLConnection.setReadTimeout(this.zzd);
            for (Map.Entry entry : this.zzf.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j2);
            httpURLConnection.setRequestProperty("User-Agent", this.zze);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzj.add(httpURLConnection);
            String uri2 = this.zzh.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = httpURLConnection.getHeaderFields();
                    zzg();
                    throw new zzcli(responseCode, headerFields, this.zzh, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzk != null) {
                        inputStream = new SequenceInputStream(this.zzk, inputStream);
                    }
                    this.zzk = inputStream;
                    return httpURLConnection;
                } catch (IOException e2) {
                    zzg();
                    throw new zzazz(e2, this.zzh, i);
                }
            } catch (IOException e3) {
                zzg();
                throw new zzazz("Unable to connect to ".concat(String.valueOf(uri2)), e3, this.zzh, i);
            }
        } catch (IOException e4) {
            throw new zzazz("Unable to connect to ".concat(String.valueOf(uri)), e4, this.zzh, i);
        }
    }

    public final long zzb(zzazv zzazv) throws zzazz {
        long j;
        this.zzh = zzazv;
        this.zzn = 0;
        long j2 = zzazv.zzc;
        long j3 = zzazv.zzd;
        if (j3 == -1) {
            j = this.zzr;
        } else {
            j = Math.min(this.zzr, j3);
        }
        this.zzo = j2;
        HttpURLConnection zzf2 = zzf(j2, (j + j2) - 1, 1);
        this.zzi = zzf2;
        String headerField = zzf2.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zzb.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j4 = zzazv.zzd;
                    if (j4 != -1) {
                        this.zzm = j4;
                        this.zzp = Math.max(parseLong, (this.zzo + j4) - 1);
                    } else {
                        this.zzm = parseLong2 - this.zzo;
                        this.zzp = parseLong2 - 1;
                    }
                    this.zzq = parseLong;
                    this.zzl = true;
                    zzbai zzbai = this.zzg;
                    if (zzbai != null) {
                        ((zzclf) zzbai).zzk(this, zzazv);
                    }
                    return this.zzm;
                } catch (NumberFormatException unused) {
                    zze.zzg("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new zzclh(headerField, zzazv);
    }
}

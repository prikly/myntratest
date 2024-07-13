package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzake implements Comparable {
    /* access modifiers changed from: private */
    public final zzakp zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaki zzf;
    private Integer zzg;
    private zzakh zzh;
    private boolean zzi;
    private zzajn zzj;
    private zzakd zzk;
    private final zzajs zzl;

    public zzake(int i, String str, zzaki zzaki) {
        Uri parse;
        String host;
        this.zza = zzakp.zza ? new zzakp() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaki;
        this.zzl = new zzajs();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzake) obj).zzg.intValue();
    }

    public final String toString() {
        String hexString = Integer.toHexString(this.zzd);
        zzw();
        String str = this.zzc;
        Integer num = this.zzg;
        return "[ ] " + str + " " + "0x".concat(String.valueOf(hexString)) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzajn zzd() {
        return this.zzj;
    }

    public final zzake zze(zzajn zzajn) {
        this.zzj = zzajn;
        return this;
    }

    public final zzake zzf(zzakh zzakh) {
        this.zzh = zzakh;
        return this;
    }

    public final zzake zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract zzakk zzh(zzaka zzaka);

    public final String zzj() {
        String str = this.zzc;
        if (this.zzb == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzajm {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzakp.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzakn zzakn) {
        zzaki zzaki;
        synchronized (this.zze) {
            zzaki = this.zzf;
        }
        if (zzaki != null) {
            zzaki.zza(zzakn);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzakh zzakh = this.zzh;
        if (zzakh != null) {
            zzakh.zzb(this);
        }
        if (zzakp.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzakc(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzakd zzakd;
        synchronized (this.zze) {
            zzakd = this.zzk;
        }
        if (zzakd != null) {
            zzakd.zza(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs(zzakk zzakk) {
        zzakd zzakd;
        synchronized (this.zze) {
            zzakd = this.zzk;
        }
        if (zzakd != null) {
            zzakd.zzb(this, zzakk);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt(int i) {
        zzakh zzakh = this.zzh;
        if (zzakh != null) {
            zzakh.zzc(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu(zzakd zzakd) {
        synchronized (this.zze) {
            this.zzk = zzakd;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzajm {
        return null;
    }

    public final zzajs zzy() {
        return this.zzl;
    }
}

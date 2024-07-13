package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public class zzhea implements zzals, Closeable, Iterator {
    private static final zzalr zza = new zzhdz("eof ");
    private static final zzheh zzb = zzheh.zzb(zzhea.class);
    protected zzalo zzc;
    protected zzheb zzd;
    zzalr zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    public final boolean hasNext() {
        zzalr zzalr = this.zze;
        if (zzalr == zza) {
            return false;
        }
        if (zzalr != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzalr) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: zzd */
    public final zzalr next() {
        zzalr zzb2;
        zzalr zzalr = this.zze;
        if (zzalr == null || zzalr == zza) {
            zzheb zzheb = this.zzd;
            if (zzheb == null || this.zzf >= this.zzg) {
                this.zze = zza;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzheb) {
                    this.zzd.zze(this.zzf);
                    zzb2 = this.zzc.zzb(this.zzd, this);
                    this.zzf = this.zzd.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.zze = null;
            return zzalr;
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzheg(this.zzh, this);
    }

    public final void zzf(zzheb zzheb, long j, zzalo zzalo) throws IOException {
        this.zzd = zzheb;
        this.zzf = zzheb.zzb();
        zzheb.zze(zzheb.zzb() + j);
        this.zzg = zzheb.zzb();
        this.zzc = zzalo;
    }
}

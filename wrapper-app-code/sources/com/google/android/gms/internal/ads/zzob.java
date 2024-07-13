package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzob implements zzne {
    protected zznc zzb;
    protected zznc zzc;
    private zznc zzd = zznc.zza;
    private zznc zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzob() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zznc zznc = zznc.zza;
        this.zze = zznc;
        this.zzb = zznc;
        this.zzc = zznc;
    }

    public final zznc zza(zznc zznc) throws zznd {
        this.zzd = zznc;
        this.zze = zzi(zznc);
        return zzg() ? this.zze : zznc.zza;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zznc.zza;
        zznc zznc = zznc.zza;
        this.zze = zznc;
        this.zzb = zznc;
        this.zzc = zznc;
        zzm();
    }

    public boolean zzg() {
        return this.zze != zznc.zza;
    }

    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    /* access modifiers changed from: protected */
    public zznc zzi(zznc zznc) throws zznd {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public void zzk() {
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    /* access modifiers changed from: protected */
    public void zzm() {
    }

    /* access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzckp extends zzcjd implements TextureView.SurfaceTextureListener, zzcjn {
    private final zzcjx zzd;
    private final zzcjy zze;
    private final zzcjw zzf;
    private zzcjc zzg;
    private Surface zzh;
    private zzcjo zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm = 1;
    private zzcjv zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzckp(Context context, zzcjy zzcjy, zzcjx zzcjx, boolean z, boolean z2, zzcjw zzcjw, Integer num) {
        super(context, num);
        this.zzd = zzcjx;
        this.zze = zzcjy;
        this.zzo = z;
        this.zzf = zzcjw;
        setSurfaceTextureListener(this);
        this.zze.zza(this);
    }

    private static String zzS(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzT() {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            zzcjo.zzM(true);
        }
    }

    private final void zzU() {
        if (!this.zzp) {
            this.zzp = true;
            zzs.zza.post(new zzckj(this));
            zzn();
            this.zze.zzb();
            if (this.zzq) {
                zzp();
            }
        }
    }

    private final void zzV(boolean z) {
        zzcjo zzcjo = this.zzi;
        if ((zzcjo == null || z) && this.zzj != null && this.zzh != null) {
            if (z) {
                if (zzad()) {
                    zzcjo.zzQ();
                    zzX();
                } else {
                    zze.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzj.startsWith("cache:")) {
                zzcma zzbq = this.zzd.zzbq(this.zzj);
                if (zzbq instanceof zzcmj) {
                    zzcjo zzj2 = ((zzcmj) zzbq).zzj();
                    this.zzi = zzj2;
                    if (!zzj2.zzR()) {
                        zze.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzbq instanceof zzcmg) {
                    zzcmg zzcmg = (zzcmg) zzbq;
                    String zzE = zzE();
                    ByteBuffer zzl2 = zzcmg.zzl();
                    boolean zzm2 = zzcmg.zzm();
                    String zzi2 = zzcmg.zzi();
                    if (zzi2 == null) {
                        zze.zzj("Stream cache URL is null.");
                        return;
                    }
                    zzcjo zzD = zzD();
                    this.zzi = zzD;
                    zzD.zzD(new Uri[]{Uri.parse(zzi2)}, zzE, zzl2, zzm2);
                } else {
                    zze.zzj("Stream cache miss: ".concat(String.valueOf(this.zzj)));
                    return;
                }
            } else {
                this.zzi = zzD();
                String zzE2 = zzE();
                Uri[] uriArr = new Uri[this.zzk.length];
                int i = 0;
                while (true) {
                    String[] strArr = this.zzk;
                    if (i >= strArr.length) {
                        break;
                    }
                    uriArr[i] = Uri.parse(strArr[i]);
                    i++;
                }
                this.zzi.zzC(uriArr, zzE2);
            }
            this.zzi.zzI(this);
            zzZ(this.zzh, false);
            if (this.zzi.zzR()) {
                int zzt2 = this.zzi.zzt();
                this.zzm = zzt2;
                if (zzt2 == 3) {
                    zzU();
                }
            }
        }
    }

    private final void zzW() {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            zzcjo.zzM(false);
        }
    }

    private final void zzX() {
        if (this.zzi != null) {
            zzZ((Surface) null, true);
            zzcjo zzcjo = this.zzi;
            if (zzcjo != null) {
                zzcjo.zzI((zzcjn) null);
                this.zzi.zzE();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzY(float f2, boolean z) {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            try {
                zzcjo.zzP(f2, false);
            } catch (IOException e2) {
                zzcho.zzk("", e2);
            }
        } else {
            zze.zzj("Trying to set volume before player is initialized.");
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            try {
                zzcjo.zzO(surface, z);
            } catch (IOException e2) {
                zzcho.zzk("", e2);
            }
        } else {
            zze.zzj("Trying to set surface before player is initialized.");
        }
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i2) {
        float f2 = i2 > 0 ? ((float) i) / ((float) i2) : 1.0f;
        if (this.zzt != f2) {
            this.zzt = f2;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzm != 1;
    }

    private final boolean zzad() {
        zzcjo zzcjo = this.zzi;
        return zzcjo != null && zzcjo.zzR() && !this.zzl;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.zzt;
        if (f2 != 0.0f && this.zzn == null) {
            float f3 = (float) measuredWidth;
            float f4 = f3 / ((float) measuredHeight);
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (((float) measuredHeight) * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcjv zzcjv = this.zzn;
        if (zzcjv != null) {
            zzcjv.zzc(measuredWidth, measuredHeight);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzo) {
            zzcjv zzcjv = new zzcjv(getContext());
            this.zzn = zzcjv;
            zzcjv.zzd(surfaceTexture, i, i2);
            this.zzn.start();
            SurfaceTexture zzb = this.zzn.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzn.zze();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false);
        } else {
            zzZ(surface, true);
            if (!this.zzf.zza) {
                zzT();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        zzs.zza.post(new zzckk(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcjv zzcjv = this.zzn;
        if (zzcjv != null) {
            zzcjv.zze();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzW();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzZ((Surface) null, true);
        }
        zzs.zza.post(new zzckn(this));
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzcjv zzcjv = this.zzn;
        if (zzcjv != null) {
            zzcjv.zzc(i, i2);
        }
        zzs.zza.post(new zzckm(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzg);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        zzs.zza.post(new zzckl(this, i));
        super.onWindowVisibilityChanged(i);
    }

    public final void zzA(int i) {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            zzcjo.zzN(i);
        }
    }

    public final void zzC(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    /* access modifiers changed from: package-private */
    public final zzcjo zzD() {
        if (this.zzf.zzm) {
            return new zzcnb(this.zzd.getContext(), this.zzf, this.zzd);
        }
        return new zzclf(this.zzd.getContext(), this.zzf, this.zzd);
    }

    /* access modifiers changed from: package-private */
    public final String zzE() {
        return zzt.zzp().zzc(this.zzd.getContext(), this.zzd.zzp().zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzF(String str) {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzb("ExoPlayerAdapter error", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG() {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zza();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzH() {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(boolean z, long j) {
        this.zzd.zzx(z, j);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzJ(String str) {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzc("ExoPlayerAdapter exception", str);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzK() {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzL() {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzM() {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzi();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzN(int i, int i2) {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzj(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzO() {
        zzY(this.zzb.zza(), false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzP(int i) {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.onWindowVisibilityChanged(i);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzQ() {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zzd();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzR() {
        zzcjc zzcjc = this.zzg;
        if (zzcjc != null) {
            zzcjc.zze();
        }
    }

    public final int zza() {
        if (zzac()) {
            return (int) this.zzi.zzy();
        }
        return 0;
    }

    public final int zzb() {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            return zzcjo.zzr();
        }
        return -1;
    }

    public final int zzc() {
        if (zzac()) {
            return (int) this.zzi.zzz();
        }
        return 0;
    }

    public final int zzd() {
        return this.zzs;
    }

    public final int zze() {
        return this.zzr;
    }

    public final long zzf() {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            return zzcjo.zzx();
        }
        return -1;
    }

    public final long zzg() {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            return zzcjo.zzA();
        }
        return -1;
    }

    public final long zzh() {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            return zzcjo.zzB();
        }
        return -1;
    }

    public final void zzi(boolean z, long j) {
        if (this.zzd != null) {
            zzcib.zze.execute(new zzckc(this, z, j));
        }
    }

    public final String zzj() {
        return "ExoPlayer/3".concat(true != this.zzo ? "" : " spherical");
    }

    public final void zzk(String str, Exception exc) {
        String zzS = zzS(str, exc);
        zze.zzj("ExoPlayerAdapter error: ".concat(zzS));
        this.zzl = true;
        if (this.zzf.zza) {
            zzW();
        }
        zzs.zza.post(new zzckf(this, zzS));
        zzt.zzo().zzt(exc, "AdExoPlayerView.onError");
    }

    public final void zzl(String str, Exception exc) {
        String zzS = zzS("onLoadException", exc);
        zze.zzj("ExoPlayerAdapter exception: ".concat(zzS));
        zzt.zzo().zzt(exc, "AdExoPlayerView.onException");
        zzs.zza.post(new zzcke(this, zzS));
    }

    public final void zzm(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzU();
            } else if (i == 4) {
                if (this.zzf.zza) {
                    zzW();
                }
                this.zze.zze();
                this.zzb.zzc();
                zzs.zza.post(new zzckd(this));
            }
        }
    }

    public final void zzn() {
        if (this.zzf.zzm) {
            zzs.zza.post(new zzckh(this));
        } else {
            zzY(this.zzb.zza(), false);
        }
    }

    public final void zzo() {
        if (zzac()) {
            if (this.zzf.zza) {
                zzW();
            }
            this.zzi.zzL(false);
            this.zze.zze();
            this.zzb.zzc();
            zzs.zza.post(new zzcki(this));
        }
    }

    public final void zzp() {
        if (zzac()) {
            if (this.zzf.zza) {
                zzT();
            }
            this.zzi.zzL(true);
            this.zze.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            zzs.zza.post(new zzcko(this));
            return;
        }
        this.zzq = true;
    }

    public final void zzq(int i) {
        if (zzac()) {
            this.zzi.zzF((long) i);
        }
    }

    public final void zzr(zzcjc zzcjc) {
        this.zzg = zzcjc;
    }

    public final void zzs(String str) {
        if (str != null) {
            zzB(str, (String[]) null);
        }
    }

    public final void zzt() {
        if (zzad()) {
            this.zzi.zzQ();
            zzX();
        }
        this.zze.zze();
        this.zzb.zzc();
        this.zze.zzd();
    }

    public final void zzu(float f2, float f3) {
        zzcjv zzcjv = this.zzn;
        if (zzcjv != null) {
            zzcjv.zzf(f2, f3);
        }
    }

    public final void zzv() {
        zzs.zza.post(new zzckg(this));
    }

    public final void zzw(int i) {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            zzcjo.zzG(i);
        }
    }

    public final void zzx(int i) {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            zzcjo.zzH(i);
        }
    }

    public final void zzy(int i) {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            zzcjo.zzJ(i);
        }
    }

    public final void zzz(int i) {
        zzcjo zzcjo = this.zzi;
        if (zzcjo != null) {
            zzcjo.zzK(i);
        }
    }

    public final void zzB(String str, String[] strArr) {
        if (str != null) {
            boolean z = true;
            if (strArr == null) {
                this.zzk = new String[]{str};
            } else {
                this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
            }
            String str2 = this.zzj;
            if (!this.zzf.zzn || str2 == null || str.equals(str2) || this.zzm != 4) {
                z = false;
            }
            this.zzj = str;
            zzV(z);
        }
    }
}

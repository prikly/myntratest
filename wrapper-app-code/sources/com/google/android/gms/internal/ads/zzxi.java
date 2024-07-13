package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzxi extends HandlerThread implements Handler.Callback {
    private zzdj zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzxk zze;

    public zzxi() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                zzdj zzdj = this.zza;
                if (zzdj != null) {
                    zzdj.zzb(i2);
                    this.zze = new zzxk(this, this.zza.zza(), i2 != 0, (zzxj) null);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                }
                throw null;
            } catch (RuntimeException e2) {
                zzdw.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzd = e2;
                synchronized (this) {
                    notify();
                }
            } catch (zzdk e3) {
                zzdw.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.zzd = new IllegalStateException(e3);
                synchronized (this) {
                    notify();
                }
            } catch (Error e4) {
                try {
                    zzdw.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.zzc = e4;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
        } else if (i != 2) {
            return true;
        } else {
            try {
                zzdj zzdj2 = this.zza;
                if (zzdj2 != null) {
                    zzdj2.zzc();
                    quit();
                    return true;
                }
                throw null;
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
        }
    }

    public final zzxk zza(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdj(handler, (zzdi) null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzxk zzxk = this.zze;
                if (zzxk != null) {
                    return zzxk;
                }
                throw null;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        if (handler != null) {
            handler.sendEmptyMessage(2);
            return;
        }
        throw null;
    }
}

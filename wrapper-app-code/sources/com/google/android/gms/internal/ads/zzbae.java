package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbae extends Handler implements Runnable {
    public final int zza;
    final /* synthetic */ zzbah zzb;
    private final zzbaf zzc;
    private final zzbad zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbae(zzbah zzbah, Looper looper, zzbaf zzbaf, zzbad zzbad, int i, long j) {
        super(looper);
        this.zzb = zzbah;
        this.zzc = zzbaf;
        this.zzd = zzbad;
        this.zza = i;
        this.zze = j;
    }

    private final void zzd() {
        this.zzf = null;
        zzbah zzbah = this.zzb;
        zzbah.zza.execute(zzbah.zzb);
    }

    public final void handleMessage(Message message) {
        if (!this.zzi) {
            if (message.what == 0) {
                zzd();
            } else if (message.what != 4) {
                this.zzb.zzb = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.zze;
                if (this.zzc.zze()) {
                    this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
                    return;
                }
                int i = message.what;
                int i2 = 1;
                if (i == 1) {
                    this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
                } else if (i == 2) {
                    this.zzd.zzu(this.zzc, elapsedRealtime, j);
                } else if (i == 3) {
                    IOException iOException = (IOException) message.obj;
                    this.zzf = iOException;
                    int zzd2 = this.zzd.zzd(this.zzc, elapsedRealtime, j, iOException);
                    if (zzd2 == 3) {
                        this.zzb.zzc = this.zzf;
                    } else if (zzd2 != 2) {
                        if (zzd2 != 1) {
                            i2 = 1 + this.zzg;
                        }
                        this.zzg = i2;
                        zzc((long) Math.min((i2 - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zze()) {
                String simpleName = this.zzc.getClass().getSimpleName();
                zzbaw.zza("load:" + simpleName);
                this.zzc.zzc();
                zzbaw.zzb();
            }
            if (!this.zzi) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.zzi) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (InterruptedException unused) {
            zzbaj.zze(this.zzc.zze());
            if (!this.zzi) {
                sendEmptyMessage(2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.zzi) {
                obtainMessage(3, new zzbag(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.zzi) {
                obtainMessage(3, new zzbag(e4)).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.zzi) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        } catch (Throwable th) {
            zzbaw.zzb();
            throw th;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzb();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzt(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzbaj.zze(this.zzb.zzb == null);
        this.zzb.zzb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}

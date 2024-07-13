package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfxf {
    private static final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final zzfwu zzc;
    private final String zzd;
    /* access modifiers changed from: private */
    public final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    /* access modifiers changed from: private */
    public boolean zzh;
    private final Intent zzi;
    private final WeakReference zzj;
    private final IBinder.DeathRecipient zzk = new zzfwx(this);
    private final AtomicInteger zzl = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public ServiceConnection zzm;
    /* access modifiers changed from: private */
    public IInterface zzn;
    private final zzfwc zzo;

    public zzfxf(Context context, zzfwu zzfwu, String str, Intent intent, zzfwc zzfwc, zzfxa zzfxa, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzfwu;
        this.zzd = "OverlayDisplayService";
        this.zzi = intent;
        this.zzo = zzfwc;
        this.zzj = new WeakReference((Object) null);
    }

    public static /* synthetic */ void zzh(zzfxf zzfxf) {
        zzfxf.zzc.zzd("reportBinderDeath", new Object[0]);
        zzfxa zzfxa = (zzfxa) zzfxf.zzj.get();
        if (zzfxa != null) {
            zzfxf.zzc.zzd("calling onBinderDied", new Object[0]);
            zzfxa.zza();
        } else {
            zzfxf.zzc.zzd("%s : Binder has died.", zzfxf.zzd);
            for (zzfwv zzc2 : zzfxf.zze) {
                zzc2.zzc(zzfxf.zzs());
            }
            zzfxf.zze.clear();
        }
        zzfxf.zzt();
    }

    static /* bridge */ /* synthetic */ void zzn(zzfxf zzfxf) {
        zzfxf.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzfxf.zzn.asBinder().linkToDeath(zzfxf.zzk, 0);
        } catch (RemoteException e2) {
            zzfxf.zzc.zzc(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzo(zzfxf zzfxf) {
        zzfxf.zzc.zzd("unlinkToDeath", new Object[0]);
        zzfxf.zzn.asBinder().unlinkToDeath(zzfxf.zzk, 0);
    }

    private final RemoteException zzs() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    public final void zzt() {
        synchronized (this.zzg) {
            for (TaskCompletionSource trySetException : this.zzf) {
                trySetException.trySetException(zzs());
            }
            this.zzf.clear();
        }
    }

    public final Handler zzc() {
        Handler handler;
        synchronized (zza) {
            if (!zza.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                zza.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) zza.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzp(zzfwv zzfwv, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new zzfww(this, taskCompletionSource));
        }
        synchronized (this.zzg) {
            if (this.zzl.getAndIncrement() > 0) {
                this.zzc.zza("Already connected to the service.", new Object[0]);
            }
        }
        zzc().post(new zzfwy(this, zzfwv.zzb(), zzfwv));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        zzc().post(new com.google.android.gms.internal.ads.zzfwz(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzr() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zzg
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = r4.zzl     // Catch:{ all -> 0x002e }
            int r1 = r1.get()     // Catch:{ all -> 0x002e }
            if (r1 <= 0) goto L_0x0020
            java.util.concurrent.atomic.AtomicInteger r1 = r4.zzl     // Catch:{ all -> 0x002e }
            int r1 = r1.decrementAndGet()     // Catch:{ all -> 0x002e }
            if (r1 > 0) goto L_0x0014
            goto L_0x0020
        L_0x0014:
            com.google.android.gms.internal.ads.zzfwu r1 = r4.zzc     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "Leaving the connection open for other ongoing calls."
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x002e }
            r1.zzd(r2, r3)     // Catch:{ all -> 0x002e }
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.zzfwz r0 = new com.google.android.gms.internal.ads.zzfwz
            r0.<init>(r4)
            android.os.Handler r1 = r4.zzc()
            r1.post(r0)
            return
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfxf.zzr():void");
    }

    static /* bridge */ /* synthetic */ void zzm(zzfxf zzfxf, zzfwv zzfwv) {
        if (zzfxf.zzn == null && !zzfxf.zzh) {
            zzfxf.zzc.zzd("Initiate binding to the service.", new Object[0]);
            zzfxf.zze.add(zzfwv);
            zzfxe zzfxe = new zzfxe(zzfxf, (zzfxd) null);
            zzfxf.zzm = zzfxe;
            zzfxf.zzh = true;
            if (!zzfxf.zzb.bindService(zzfxf.zzi, zzfxe, 1)) {
                zzfxf.zzc.zzd("Failed to bind to the service.", new Object[0]);
                zzfxf.zzh = false;
                for (zzfwv zzc2 : zzfxf.zze) {
                    zzc2.zzc(new zzfxg());
                }
                zzfxf.zze.clear();
            }
        } else if (zzfxf.zzh) {
            zzfxf.zzc.zzd("Waiting to bind to the service.", new Object[0]);
            zzfxf.zze.add(zzfwv);
        } else {
            zzfwv.run();
        }
    }
}

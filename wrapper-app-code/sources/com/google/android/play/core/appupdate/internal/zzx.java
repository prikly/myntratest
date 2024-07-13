package com.google.android.play.core.appupdate.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.zzl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:app-update@@2.0.0 */
public final class zzx {
    private static final Map zza = new HashMap();
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final zzm zzc;
    private final String zzd;
    /* access modifiers changed from: private */
    public final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    /* access modifiers changed from: private */
    public boolean zzh;
    private final Intent zzi;
    private final WeakReference zzj;
    private final IBinder.DeathRecipient zzk = new zzp(this);
    private final AtomicInteger zzl = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public ServiceConnection zzm;
    /* access modifiers changed from: private */
    public IInterface zzn;
    private final zzl zzo;

    public zzx(Context context, zzm zzm2, String str, Intent intent, zzl zzl2, zzs zzs, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzm2;
        this.zzd = "AppUpdateService";
        this.zzi = intent;
        this.zzo = zzl2;
        this.zzj = new WeakReference((Object) null);
    }

    public static /* synthetic */ void zzh(zzx zzx) {
        zzx.zzc.zzd("reportBinderDeath", new Object[0]);
        zzs zzs = (zzs) zzx.zzj.get();
        if (zzs != null) {
            zzx.zzc.zzd("calling onBinderDied", new Object[0]);
            zzs.zza();
        } else {
            zzx.zzc.zzd("%s : Binder has died.", zzx.zzd);
            for (zzn zzc2 : zzx.zze) {
                zzc2.zzc(zzx.zzs());
            }
            zzx.zze.clear();
        }
        zzx.zzt();
    }

    static /* bridge */ /* synthetic */ void zzn(zzx zzx) {
        zzx.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzx.zzn.asBinder().linkToDeath(zzx.zzk, 0);
        } catch (RemoteException e2) {
            zzx.zzc.zzc(e2, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzo(zzx zzx) {
        zzx.zzc.zzd("unlinkToDeath", new Object[0]);
        zzx.zzn.asBinder().unlinkToDeath(zzx.zzk, 0);
    }

    private final RemoteException zzs() {
        if (Build.VERSION.SDK_INT < 15) {
            return new RemoteException();
        }
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

    public final void zzp(zzn zzn2, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new zzo(this, taskCompletionSource));
        }
        synchronized (this.zzg) {
            if (this.zzl.getAndIncrement() > 0) {
                this.zzc.zza("Already connected to the service.", new Object[0]);
            }
        }
        zzc().post(new zzq(this, zzn2.zzb(), zzn2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        zzc().post(new com.google.android.play.core.appupdate.internal.zzr(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzr(com.google.android.gms.tasks.TaskCompletionSource r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.zzg
            monitor-enter(r0)
            java.util.Set r1 = r3.zzf     // Catch:{ all -> 0x0039 }
            r1.remove(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r3.zzg
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzl     // Catch:{ all -> 0x0036 }
            int r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicInteger r0 = r3.zzl     // Catch:{ all -> 0x0036 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            com.google.android.play.core.appupdate.internal.zzm r0 = r3.zzc     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0036 }
            r0.zzd(r1, r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            com.google.android.play.core.appupdate.internal.zzr r4 = new com.google.android.play.core.appupdate.internal.zzr
            r4.<init>(r3)
            android.os.Handler r0 = r3.zzc()
            r0.post(r4)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.internal.zzx.zzr(com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    static /* bridge */ /* synthetic */ void zzm(zzx zzx, zzn zzn2) {
        if (zzx.zzn == null && !zzx.zzh) {
            zzx.zzc.zzd("Initiate binding to the service.", new Object[0]);
            zzx.zze.add(zzn2);
            zzw zzw = new zzw(zzx, (zzv) null);
            zzx.zzm = zzw;
            zzx.zzh = true;
            if (!zzx.zzb.bindService(zzx.zzi, zzw, 1)) {
                zzx.zzc.zzd("Failed to bind to the service.", new Object[0]);
                zzx.zzh = false;
                for (zzn zzc2 : zzx.zze) {
                    zzc2.zzc(new zzy());
                }
                zzx.zze.clear();
            }
        } else if (zzx.zzh) {
            zzx.zzc.zzd("Waiting to bind to the service.", new Object[0]);
            zzx.zze.add(zzn2);
        } else {
            zzn2.run();
        }
    }
}

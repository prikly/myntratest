package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfss {
    private final Context zza;
    private final Executor zzb;
    private final zzfrz zzc;
    private final zzfsb zzd;
    private final zzfsr zze;
    private final zzfsr zzf;
    private Task zzg;
    private Task zzh;

    zzfss(Context context, Executor executor, zzfrz zzfrz, zzfsb zzfsb, zzfsp zzfsp, zzfsq zzfsq) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfrz;
        this.zzd = zzfsb;
        this.zze = zzfsp;
        this.zzf = zzfsq;
    }

    public static zzfss zze(Context context, Executor executor, zzfrz zzfrz, zzfsb zzfsb) {
        zzfss zzfss = new zzfss(context, executor, zzfrz, zzfsb, new zzfsp(), new zzfsq());
        if (zzfss.zzd.zzd()) {
            zzfss.zzg = zzfss.zzh(new zzfsm(zzfss));
        } else {
            zzfss.zzg = Tasks.forResult(zzfss.zze.zza());
        }
        zzfss.zzh = zzfss.zzh(new zzfsn(zzfss));
        return zzfss;
    }

    private static zzanf zzg(Task task, zzanf zzanf) {
        if (!task.isSuccessful()) {
            return zzanf;
        }
        return (zzanf) task.getResult();
    }

    private final Task zzh(Callable callable) {
        return Tasks.call(this.zzb, callable).addOnFailureListener(this.zzb, (OnFailureListener) new zzfso(this));
    }

    public final zzanf zza() {
        return zzg(this.zzg, this.zze.zza());
    }

    public final zzanf zzb() {
        return zzg(this.zzh, this.zzf.zza());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzanf zzc() throws Exception {
        Context context = this.zza;
        zzaml zza2 = zzanf.zza();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            zza2.zzs(id);
            zza2.zzr(advertisingIdInfo.isLimitAdTrackingEnabled());
            zza2.zzab(6);
        }
        return (zzanf) zza2.zzak();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzanf zzd() throws Exception {
        Context context = this.zza;
        return zzfsh.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1, exc);
    }
}

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzarp extends zzarx {
    private final StackTraceElement[] zzi;

    public zzarp(zzaqj zzaqj, String str, String str2, zzaml zzaml, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzaqj, "5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", zzaml, i, 45);
        this.zzi = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.zzi;
        if (obj != null) {
            int i = 1;
            zzaqb zzaqb = new zzaqb((String) this.zzf.invoke((Object) null, new Object[]{obj}));
            synchronized (this.zze) {
                this.zze.zzF(zzaqb.zza.longValue());
                if (zzaqb.zzb.booleanValue()) {
                    zzaml zzaml = this.zze;
                    if (true != zzaqb.zzc.booleanValue()) {
                        i = 2;
                    }
                    zzaml.zzac(i);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}

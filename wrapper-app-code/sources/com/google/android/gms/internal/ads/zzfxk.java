package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
abstract class zzfxk implements Iterator {
    private Object zza;
    private int zzb = 2;

    protected zzfxk() {
    }

    public final boolean hasNext() {
        zzfye.zzh(this.zzb != 4);
        int i = this.zzb;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.zzb = 4;
                this.zza = zza();
                if (this.zzb != 3) {
                    this.zzb = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public abstract Object zza();

    /* access modifiers changed from: protected */
    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgom {
    private ArrayList zza = new ArrayList();
    private zzgoj zzb = zzgoj.zza;
    private Integer zzc = null;

    public final zzgom zza(zzggo zzggo, int i, zzghb zzghb) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgoo(zzggo, i, zzghb, (zzgon) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzgom zzb(zzgoj zzgoj) {
        if (this.zza != null) {
            this.zzb = zzgoj;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzgom zzc(int i) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzgoq zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((zzgoo) arrayList.get(i)).zza() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzgoq zzgoq = new zzgoq(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, (zzgop) null);
            this.zza = null;
            return zzgoq;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}

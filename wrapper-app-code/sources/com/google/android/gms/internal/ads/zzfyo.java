package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzfyo implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfyr zzb;

    zzfyo(zzfyr zzfyr, CharSequence charSequence) {
        this.zzb = zzfyr;
        this.zza = charSequence;
    }

    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzfxu.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(zzfxu.zza(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}

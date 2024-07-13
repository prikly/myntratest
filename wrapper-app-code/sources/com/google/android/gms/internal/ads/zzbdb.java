package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbdb {
    private final int zza;
    private final zzbcy zzb = new zzbdd();

    public zzbdb(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbda zzbda = new zzbda();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbcz(this));
        for (String zzb2 : split) {
            String[] zzb3 = zzbdc.zzb(zzb2, false);
            if (zzb3.length != 0) {
                zzbdg.zzc(zzb3, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbda.zzb.write(this.zzb.zzb(((zzbdf) it.next()).zzb));
            } catch (IOException e2) {
                zze.zzh("Error while writing hash to byteStream", e2);
            }
        }
        return zzbda.toString();
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzalf extends zzaks {
    public zzalf() {
    }

    public zzalf(zzale zzale, SSLSocketFactory sSLSocketFactory) {
    }

    static List zza(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String zzajw : (List) entry.getValue()) {
                    arrayList.add(new zzajw((String) entry.getKey(), zzajw));
                }
            }
        }
        return arrayList;
    }
}

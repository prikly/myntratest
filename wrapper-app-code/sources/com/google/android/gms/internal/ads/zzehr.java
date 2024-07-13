package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzehr implements zzgdy {
    public static final /* synthetic */ zzehr zza = new zzehr();

    private /* synthetic */ zzehr() {
    }

    public final zzgfb zza(Object obj) {
        return zzger.zzi(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
    }
}

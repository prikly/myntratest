package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzgdy;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzgfb;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzal implements zzgdy {
    public final /* synthetic */ zzccb zza;

    public /* synthetic */ zzal(zzccb zzccb) {
        this.zza = zzccb;
    }

    public final zzgfb zza(Object obj) {
        zzccb zzccb = this.zza;
        zzao zzao = new zzao(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            zzao.zzb = zzay.zzb().zzi(zzccb.zza).toString();
        } catch (JSONException unused) {
            zzao.zzb = JsonUtils.EMPTY_JSON;
        }
        return zzger.zzi(zzao);
    }
}

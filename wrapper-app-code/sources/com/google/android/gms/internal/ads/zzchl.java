package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.onesignal.outcomes.data.OutcomeEventsTable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzchl implements zzchm {
    public final /* synthetic */ byte[] zza;

    public /* synthetic */ zzchl(byte[] bArr) {
        this.zza = bArr;
    }

    public final void zza(JsonWriter jsonWriter) {
        byte[] bArr = this.zza;
        int i = zzchn.zza;
        jsonWriter.name(OutcomeEventsTable.COLUMN_NAME_PARAMS).beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            String zze = zzchh.zze(encode);
            if (zze != null) {
                jsonWriter.name("bodydigest").value(zze);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}

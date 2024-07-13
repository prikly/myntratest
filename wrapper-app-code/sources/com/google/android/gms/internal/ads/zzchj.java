package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.onesignal.outcomes.data.OutcomeEventsTable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final /* synthetic */ class zzchj implements zzchm {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzchj(String str) {
        this.zza = str;
    }

    public final void zza(JsonWriter jsonWriter) {
        String str = this.zza;
        int i = zzchn.zza;
        jsonWriter.name(OutcomeEventsTable.COLUMN_NAME_PARAMS).beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}

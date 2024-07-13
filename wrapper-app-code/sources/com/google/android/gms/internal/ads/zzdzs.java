package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdzs {
    private final Clock zza;

    public zzdzs(Clock clock) {
        this.zza = clock;
    }

    public final void zza(List list, String str, String str2, Object... objArr) {
        if (((Boolean) zzblc.zza.zze()).booleanValue()) {
            long currentTimeMillis = this.zza.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name(OutcomeEventsTable.COLUMN_NAME_PARAMS).beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e2) {
                zze.zzh("unable to log", e2);
            }
            zze.zzi("AD-DBG ".concat(String.valueOf(stringWriter.toString())));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzehz {
    public int zza = 0;
    public Map zzb = new HashMap();
    public String zzc = "";
    public long zzd = -1;

    public static zzehz zza(Reader reader) throws zzfip {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            HashMap hashMap = new HashMap();
            String str = "";
            jsonReader.beginObject();
            int i = 0;
            long j = -1;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("response".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("body".equals(nextName)) {
                    str = jsonReader.nextString();
                } else if ("latency".equals(nextName)) {
                    j = jsonReader.nextLong();
                } else if ("headers".equals(nextName)) {
                    hashMap = new HashMap();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        hashMap.put(jsonReader.nextName(), zzbu.zzd(jsonReader));
                    }
                    jsonReader.endObject();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            zzehz zzehz = new zzehz();
            zzehz.zza = i;
            if (str != null) {
                zzehz.zzc = str;
            }
            zzehz.zzd = j;
            zzehz.zzb = hashMap;
            IOUtils.closeQuietly((Closeable) reader);
            return zzehz;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException e2) {
            throw new zzfip("Unable to parse Response", e2);
        } catch (Throwable th) {
            IOUtils.closeQuietly((Closeable) reader);
            throw th;
        }
    }
}

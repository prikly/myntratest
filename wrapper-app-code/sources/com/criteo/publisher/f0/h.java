package com.criteo.publisher.f0;

import com.criteo.publisher.f0.t;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: AutoValue_MetricRequest_MetricRequestSlot */
final class h extends d {
    h(String str, Integer num, boolean z) {
        super(str, num, z);
    }

    /* compiled from: AutoValue_MetricRequest_MetricRequestSlot */
    static final class a extends TypeAdapter<t.b> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f2456a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f2457b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f2458c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f2459d;

        a(Gson gson) {
            this.f2459d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, t.b bVar) throws IOException {
            if (bVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("impressionId");
            if (bVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f2456a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2459d.getAdapter(String.class);
                    this.f2456a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, bVar.b());
            }
            jsonWriter.name("zoneId");
            if (bVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter2 = this.f2457b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2459d.getAdapter(Integer.class);
                    this.f2457b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, bVar.c());
            }
            jsonWriter.name("cachedBidUsed");
            TypeAdapter<Boolean> typeAdapter3 = this.f2458c;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f2459d.getAdapter(Boolean.class);
                this.f2458c = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Boolean.valueOf(bVar.a()));
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public t.b read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            boolean z = false;
            Integer num = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("impressionId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f2456a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2459d.getAdapter(String.class);
                            this.f2456a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("zoneId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter2 = this.f2457b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2459d.getAdapter(Integer.class);
                            this.f2457b = typeAdapter2;
                        }
                        num = typeAdapter2.read(jsonReader);
                    } else if ("cachedBidUsed".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter3 = this.f2458c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2459d.getAdapter(Boolean.class);
                            this.f2458c = typeAdapter3;
                        }
                        z = typeAdapter3.read(jsonReader).booleanValue();
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new h(str, num, z);
        }

        public String toString() {
            return "TypeAdapter(" + "MetricRequest.MetricRequestSlot" + ")";
        }
    }
}

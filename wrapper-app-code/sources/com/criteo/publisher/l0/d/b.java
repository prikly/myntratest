package com.criteo.publisher.l0.d;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;

/* compiled from: AutoValue_GdprData */
final class b extends a {
    b(String str, Boolean bool, Integer num) {
        super(str, bool, num);
    }

    /* compiled from: AutoValue_GdprData */
    static final class a extends TypeAdapter<c> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f2609a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f2610b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f2611c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f2612d;

        a(Gson gson) {
            this.f2612d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, c cVar) throws IOException {
            if (cVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("consentData");
            if (cVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f2609a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2612d.getAdapter(String.class);
                    this.f2609a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, cVar.a());
            }
            jsonWriter.name("gdprApplies");
            if (cVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Boolean> typeAdapter2 = this.f2610b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2612d.getAdapter(Boolean.class);
                    this.f2610b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, cVar.b());
            }
            jsonWriter.name(MediationMetaData.KEY_VERSION);
            if (cVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter3 = this.f2611c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2612d.getAdapter(Integer.class);
                    this.f2611c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, cVar.c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public c read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            Boolean bool = null;
            Integer num = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("consentData".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f2609a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2612d.getAdapter(String.class);
                            this.f2609a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("gdprApplies".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter2 = this.f2610b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2612d.getAdapter(Boolean.class);
                            this.f2610b = typeAdapter2;
                        }
                        bool = typeAdapter2.read(jsonReader);
                    } else if (MediationMetaData.KEY_VERSION.equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter3 = this.f2611c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2612d.getAdapter(Integer.class);
                            this.f2611c = typeAdapter3;
                        }
                        num = typeAdapter3.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new b(str, bool, num);
        }

        public String toString() {
            return "TypeAdapter(" + "GdprData" + ")";
        }
    }
}

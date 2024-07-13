package com.criteo.publisher.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

/* compiled from: AutoValue_Publisher */
final class j extends c {
    j(String str, String str2, Map<String, Object> map) {
        super(str, str2, map);
    }

    /* compiled from: AutoValue_Publisher */
    static final class a extends TypeAdapter<v> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f2809a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Map<String, Object>> f2810b;

        /* renamed from: c  reason: collision with root package name */
        private final Gson f2811c;

        a(Gson gson) {
            this.f2811c = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, v vVar) throws IOException {
            if (vVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("bundleId");
            if (vVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f2809a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2811c.getAdapter(String.class);
                    this.f2809a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, vVar.a());
            }
            jsonWriter.name("cpId");
            if (vVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f2809a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2811c.getAdapter(String.class);
                    this.f2809a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, vVar.b());
            }
            jsonWriter.name("ext");
            if (vVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Map<String, Object>> typeAdapter3 = this.f2810b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2811c.getAdapter(TypeToken.getParameterized(Map.class, String.class, Object.class));
                    this.f2810b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, vVar.c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public v read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
            Map map = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c2 = 65535;
                    if (nextName.hashCode() == 3059304 && nextName.equals("cpId")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        TypeAdapter<String> typeAdapter = this.f2809a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2811c.getAdapter(String.class);
                            this.f2809a = typeAdapter;
                        }
                        str2 = typeAdapter.read(jsonReader);
                    } else if ("bundleId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f2809a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2811c.getAdapter(String.class);
                            this.f2809a = typeAdapter2;
                        }
                        str = typeAdapter2.read(jsonReader);
                    } else if ("ext".equals(nextName)) {
                        TypeAdapter<Map<String, Object>> typeAdapter3 = this.f2810b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2811c.getAdapter(TypeToken.getParameterized(Map.class, String.class, Object.class));
                            this.f2810b = typeAdapter3;
                        }
                        map = typeAdapter3.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new j(str, str2, map);
        }

        public String toString() {
            return "TypeAdapter(" + "Publisher" + ")";
        }
    }
}

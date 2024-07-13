package com.criteo.publisher.f0;

import com.criteo.publisher.f0.t;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* compiled from: AutoValue_MetricRequest */
final class f extends b {
    f(List<t.a> list, String str, int i) {
        super(list, str, i);
    }

    /* compiled from: AutoValue_MetricRequest */
    static final class a extends TypeAdapter<t> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<List<t.a>> f2446a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<String> f2447b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f2448c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f2449d;

        a(Gson gson) {
            this.f2449d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, t tVar) throws IOException {
            if (tVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("feedbacks");
            if (tVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<t.a>> typeAdapter = this.f2446a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2449d.getAdapter(TypeToken.getParameterized(List.class, t.a.class));
                    this.f2446a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, tVar.a());
            }
            jsonWriter.name("wrapper_version");
            if (tVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f2447b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2449d.getAdapter(String.class);
                    this.f2447b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, tVar.c());
            }
            jsonWriter.name("profile_id");
            TypeAdapter<Integer> typeAdapter3 = this.f2448c;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f2449d.getAdapter(Integer.class);
                this.f2448c = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Integer.valueOf(tVar.b()));
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public t read(JsonReader jsonReader) throws IOException {
            List list = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1102636175) {
                        if (hashCode == 1143342380 && nextName.equals("wrapper_version")) {
                            c2 = 0;
                        }
                    } else if (nextName.equals("profile_id")) {
                        c2 = 1;
                    }
                    if (c2 == 0) {
                        TypeAdapter<String> typeAdapter = this.f2447b;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2449d.getAdapter(String.class);
                            this.f2447b = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if (c2 == 1) {
                        TypeAdapter<Integer> typeAdapter2 = this.f2448c;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2449d.getAdapter(Integer.class);
                            this.f2448c = typeAdapter2;
                        }
                        i = typeAdapter2.read(jsonReader).intValue();
                    } else if ("feedbacks".equals(nextName)) {
                        TypeAdapter<List<t.a>> typeAdapter3 = this.f2446a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2449d.getAdapter(TypeToken.getParameterized(List.class, t.a.class));
                            this.f2446a = typeAdapter3;
                        }
                        list = typeAdapter3.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new f(list, str, i);
        }

        public String toString() {
            return "TypeAdapter(" + "MetricRequest" + ")";
        }
    }
}

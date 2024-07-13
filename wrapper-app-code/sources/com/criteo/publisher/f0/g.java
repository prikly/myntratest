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

/* compiled from: AutoValue_MetricRequest_MetricRequestFeedback */
final class g extends c {
    g(List<t.b> list, Long l, boolean z, long j, Long l2, String str) {
        super(list, l, z, j, l2, str);
    }

    /* compiled from: AutoValue_MetricRequest_MetricRequestFeedback */
    static final class a extends TypeAdapter<t.a> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<List<t.b>> f2450a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Long> f2451b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f2452c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<Long> f2453d;

        /* renamed from: e  reason: collision with root package name */
        private volatile TypeAdapter<String> f2454e;

        /* renamed from: f  reason: collision with root package name */
        private final Gson f2455f;

        a(Gson gson) {
            this.f2455f = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, t.a aVar) throws IOException {
            if (aVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("slots");
            if (aVar.e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<t.b>> typeAdapter = this.f2450a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2455f.getAdapter(TypeToken.getParameterized(List.class, t.b.class));
                    this.f2450a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, aVar.e());
            }
            jsonWriter.name("elapsed");
            if (aVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter2 = this.f2451b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2455f.getAdapter(Long.class);
                    this.f2451b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, aVar.c());
            }
            jsonWriter.name("isTimeout");
            TypeAdapter<Boolean> typeAdapter3 = this.f2452c;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f2455f.getAdapter(Boolean.class);
                this.f2452c = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Boolean.valueOf(aVar.f()));
            jsonWriter.name("cdbCallStartElapsed");
            TypeAdapter<Long> typeAdapter4 = this.f2453d;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.f2455f.getAdapter(Long.class);
                this.f2453d = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, Long.valueOf(aVar.b()));
            jsonWriter.name("cdbCallEndElapsed");
            if (aVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter5 = this.f2451b;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f2455f.getAdapter(Long.class);
                    this.f2451b = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, aVar.a());
            }
            jsonWriter.name("requestGroupId");
            if (aVar.d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f2454e;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f2455f.getAdapter(String.class);
                    this.f2454e = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, aVar.d());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public t.a read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = 0;
            List list = null;
            Long l = null;
            Long l2 = null;
            String str = null;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c2 = 65535;
                    if (nextName.hashCode() == -1893690153 && nextName.equals("isTimeout")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        TypeAdapter<Boolean> typeAdapter = this.f2452c;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2455f.getAdapter(Boolean.class);
                            this.f2452c = typeAdapter;
                        }
                        z = typeAdapter.read(jsonReader).booleanValue();
                    } else if ("slots".equals(nextName)) {
                        TypeAdapter<List<t.b>> typeAdapter2 = this.f2450a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2455f.getAdapter(TypeToken.getParameterized(List.class, t.b.class));
                            this.f2450a = typeAdapter2;
                        }
                        list = typeAdapter2.read(jsonReader);
                    } else if ("elapsed".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter3 = this.f2451b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2455f.getAdapter(Long.class);
                            this.f2451b = typeAdapter3;
                        }
                        l = typeAdapter3.read(jsonReader);
                    } else if ("cdbCallStartElapsed".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter4 = this.f2453d;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2455f.getAdapter(Long.class);
                            this.f2453d = typeAdapter4;
                        }
                        j = typeAdapter4.read(jsonReader).longValue();
                    } else if ("cdbCallEndElapsed".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter5 = this.f2451b;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2455f.getAdapter(Long.class);
                            this.f2451b = typeAdapter5;
                        }
                        l2 = typeAdapter5.read(jsonReader);
                    } else if ("requestGroupId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter6 = this.f2454e;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2455f.getAdapter(String.class);
                            this.f2454e = typeAdapter6;
                        }
                        str = typeAdapter6.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new g(list, l, z, j, l2, str);
        }

        public String toString() {
            return "TypeAdapter(" + "MetricRequest.MetricRequestFeedback" + ")";
        }
    }
}

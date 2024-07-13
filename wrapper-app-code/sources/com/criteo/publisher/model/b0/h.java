package com.criteo.publisher.model.b0;

import com.criteo.publisher.model.b0.n;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* compiled from: AutoValue_NativeAssets */
final class h extends b {
    h(List<r> list, m mVar, q qVar, List<p> list2) {
        super(list, mVar, qVar, list2);
    }

    /* compiled from: AutoValue_NativeAssets */
    static final class a extends TypeAdapter<n> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<List<r>> f2751a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<m> f2752b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<q> f2753c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<List<p>> f2754d;

        /* renamed from: e  reason: collision with root package name */
        private final Gson f2755e;

        a(Gson gson) {
            this.f2755e = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, n nVar) throws IOException {
            if (nVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("products");
            if (nVar.h() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<r>> typeAdapter = this.f2751a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2755e.getAdapter(TypeToken.getParameterized(List.class, r.class));
                    this.f2751a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, nVar.h());
            }
            jsonWriter.name("advertiser");
            if (nVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<m> typeAdapter2 = this.f2752b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2755e.getAdapter(m.class);
                    this.f2752b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, nVar.b());
            }
            jsonWriter.name("privacy");
            if (nVar.j() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<q> typeAdapter3 = this.f2753c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2755e.getAdapter(q.class);
                    this.f2753c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, nVar.j());
            }
            jsonWriter.name("impressionPixels");
            if (nVar.i() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<p>> typeAdapter4 = this.f2754d;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f2755e.getAdapter(TypeToken.getParameterized(List.class, p.class));
                    this.f2754d = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, nVar.i());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public n read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            n.a a2 = n.a();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1684631018) {
                        if (hashCode == -1003761308 && nextName.equals("products")) {
                            c2 = 0;
                        }
                    } else if (nextName.equals("impressionPixels")) {
                        c2 = 1;
                    }
                    if (c2 == 0) {
                        TypeAdapter<List<r>> typeAdapter = this.f2751a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2755e.getAdapter(TypeToken.getParameterized(List.class, r.class));
                            this.f2751a = typeAdapter;
                        }
                        a2.a(typeAdapter.read(jsonReader));
                    } else if (c2 == 1) {
                        TypeAdapter<List<p>> typeAdapter2 = this.f2754d;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2755e.getAdapter(TypeToken.getParameterized(List.class, p.class));
                            this.f2754d = typeAdapter2;
                        }
                        a2.b(typeAdapter2.read(jsonReader));
                    } else if ("advertiser".equals(nextName)) {
                        TypeAdapter<m> typeAdapter3 = this.f2752b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2755e.getAdapter(m.class);
                            this.f2752b = typeAdapter3;
                        }
                        a2.a(typeAdapter3.read(jsonReader));
                    } else if ("privacy".equals(nextName)) {
                        TypeAdapter<q> typeAdapter4 = this.f2753c;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2755e.getAdapter(q.class);
                            this.f2753c = typeAdapter4;
                        }
                        a2.a(typeAdapter4.read(jsonReader));
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return a2.b();
        }

        public String toString() {
            return "TypeAdapter(" + "NativeAssets" + ")";
        }
    }
}

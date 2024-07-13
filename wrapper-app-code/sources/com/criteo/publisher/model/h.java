package com.criteo.publisher.model;

import com.criteo.publisher.l0.d.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.io.IOException;
import java.util.List;

/* compiled from: AutoValue_CdbRequest */
final class h extends a {
    h(String str, v vVar, z zVar, String str2, int i, c cVar, List<q> list) {
        super(str, vVar, zVar, str2, i, cVar, list);
    }

    /* compiled from: AutoValue_CdbRequest */
    static final class a extends TypeAdapter<o> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f2798a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<v> f2799b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<z> f2800c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f2801d;

        /* renamed from: e  reason: collision with root package name */
        private volatile TypeAdapter<c> f2802e;

        /* renamed from: f  reason: collision with root package name */
        private volatile TypeAdapter<List<q>> f2803f;

        /* renamed from: g  reason: collision with root package name */
        private final Gson f2804g;

        a(Gson gson) {
            this.f2804g = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, o oVar) throws IOException {
            if (oVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(OSOutcomeConstants.OUTCOME_ID);
            if (oVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f2798a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2804g.getAdapter(String.class);
                    this.f2798a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, oVar.b());
            }
            jsonWriter.name("publisher");
            if (oVar.d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<v> typeAdapter2 = this.f2799b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2804g.getAdapter(v.class);
                    this.f2799b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, oVar.d());
            }
            jsonWriter.name("user");
            if (oVar.g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<z> typeAdapter3 = this.f2800c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2804g.getAdapter(z.class);
                    this.f2800c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, oVar.g());
            }
            jsonWriter.name("sdkVersion");
            if (oVar.e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter4 = this.f2798a;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f2804g.getAdapter(String.class);
                    this.f2798a = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, oVar.e());
            }
            jsonWriter.name("profileId");
            TypeAdapter<Integer> typeAdapter5 = this.f2801d;
            if (typeAdapter5 == null) {
                typeAdapter5 = this.f2804g.getAdapter(Integer.class);
                this.f2801d = typeAdapter5;
            }
            typeAdapter5.write(jsonWriter, Integer.valueOf(oVar.c()));
            jsonWriter.name("gdprConsent");
            if (oVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<c> typeAdapter6 = this.f2802e;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f2804g.getAdapter(c.class);
                    this.f2802e = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, oVar.a());
            }
            jsonWriter.name("slots");
            if (oVar.f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<List<q>> typeAdapter7 = this.f2803f;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f2804g.getAdapter(TypeToken.getParameterized(List.class, q.class));
                    this.f2803f = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, oVar.f());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public o read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            v vVar = null;
            z zVar = null;
            String str2 = null;
            c cVar = null;
            List list = null;
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c2 = 65535;
                    if (nextName.hashCode() == 282722171 && nextName.equals("gdprConsent")) {
                        c2 = 0;
                    }
                    if (c2 == 0) {
                        TypeAdapter<c> typeAdapter = this.f2802e;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2804g.getAdapter(c.class);
                            this.f2802e = typeAdapter;
                        }
                        cVar = typeAdapter.read(jsonReader);
                    } else if (OSOutcomeConstants.OUTCOME_ID.equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f2798a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2804g.getAdapter(String.class);
                            this.f2798a = typeAdapter2;
                        }
                        str = typeAdapter2.read(jsonReader);
                    } else if ("publisher".equals(nextName)) {
                        TypeAdapter<v> typeAdapter3 = this.f2799b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2804g.getAdapter(v.class);
                            this.f2799b = typeAdapter3;
                        }
                        vVar = typeAdapter3.read(jsonReader);
                    } else if ("user".equals(nextName)) {
                        TypeAdapter<z> typeAdapter4 = this.f2800c;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2804g.getAdapter(z.class);
                            this.f2800c = typeAdapter4;
                        }
                        zVar = typeAdapter4.read(jsonReader);
                    } else if ("sdkVersion".equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.f2798a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2804g.getAdapter(String.class);
                            this.f2798a = typeAdapter5;
                        }
                        str2 = typeAdapter5.read(jsonReader);
                    } else if ("profileId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter6 = this.f2801d;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2804g.getAdapter(Integer.class);
                            this.f2801d = typeAdapter6;
                        }
                        i = typeAdapter6.read(jsonReader).intValue();
                    } else if ("slots".equals(nextName)) {
                        TypeAdapter<List<q>> typeAdapter7 = this.f2803f;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f2804g.getAdapter(TypeToken.getParameterized(List.class, q.class));
                            this.f2803f = typeAdapter7;
                        }
                        list = typeAdapter7.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new h(str, vVar, zVar, str2, i, cVar, list);
        }

        public String toString() {
            return "TypeAdapter(" + "CdbRequest" + ")";
        }
    }
}

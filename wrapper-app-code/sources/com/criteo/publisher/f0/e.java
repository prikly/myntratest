package com.criteo.publisher.f0;

import com.criteo.publisher.f0.n;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: AutoValue_Metric */
final class e extends a {
    e(Long l, Long l2, boolean z, boolean z2, Long l3, String str, String str2, Integer num, Integer num2, boolean z3) {
        super(l, l2, z, z2, l3, str, str2, num, num2, z3);
    }

    /* compiled from: AutoValue_Metric */
    static final class a extends TypeAdapter<n> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<Long> f2434a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Boolean> f2435b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<String> f2436c;

        /* renamed from: d  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f2437d;

        /* renamed from: e  reason: collision with root package name */
        private final Gson f2438e;

        a(Gson gson) {
            this.f2438e = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, n nVar) throws IOException {
            if (nVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("cdbCallStartTimestamp");
            if (nVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter = this.f2434a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2438e.getAdapter(Long.class);
                    this.f2434a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, nVar.c());
            }
            jsonWriter.name("cdbCallEndTimestamp");
            if (nVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter2 = this.f2434a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2438e.getAdapter(Long.class);
                    this.f2434a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, nVar.b());
            }
            jsonWriter.name("cdbCallTimeout");
            TypeAdapter<Boolean> typeAdapter3 = this.f2435b;
            if (typeAdapter3 == null) {
                typeAdapter3 = this.f2438e.getAdapter(Boolean.class);
                this.f2435b = typeAdapter3;
            }
            typeAdapter3.write(jsonWriter, Boolean.valueOf(nVar.j()));
            jsonWriter.name("cachedBidUsed");
            TypeAdapter<Boolean> typeAdapter4 = this.f2435b;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.f2438e.getAdapter(Boolean.class);
                this.f2435b = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, Boolean.valueOf(nVar.i()));
            jsonWriter.name("elapsedTimestamp");
            if (nVar.d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Long> typeAdapter5 = this.f2434a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f2438e.getAdapter(Long.class);
                    this.f2434a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, nVar.d());
            }
            jsonWriter.name("impressionId");
            if (nVar.e() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f2436c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f2438e.getAdapter(String.class);
                    this.f2436c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, nVar.e());
            }
            jsonWriter.name("requestGroupId");
            if (nVar.g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter7 = this.f2436c;
                if (typeAdapter7 == null) {
                    typeAdapter7 = this.f2438e.getAdapter(String.class);
                    this.f2436c = typeAdapter7;
                }
                typeAdapter7.write(jsonWriter, nVar.g());
            }
            jsonWriter.name("zoneId");
            if (nVar.h() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter8 = this.f2437d;
                if (typeAdapter8 == null) {
                    typeAdapter8 = this.f2438e.getAdapter(Integer.class);
                    this.f2437d = typeAdapter8;
                }
                typeAdapter8.write(jsonWriter, nVar.h());
            }
            jsonWriter.name("profileId");
            if (nVar.f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<Integer> typeAdapter9 = this.f2437d;
                if (typeAdapter9 == null) {
                    typeAdapter9 = this.f2438e.getAdapter(Integer.class);
                    this.f2437d = typeAdapter9;
                }
                typeAdapter9.write(jsonWriter, nVar.f());
            }
            jsonWriter.name("readyToSend");
            TypeAdapter<Boolean> typeAdapter10 = this.f2435b;
            if (typeAdapter10 == null) {
                typeAdapter10 = this.f2438e.getAdapter(Boolean.class);
                this.f2435b = typeAdapter10;
            }
            typeAdapter10.write(jsonWriter, Boolean.valueOf(nVar.k()));
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
                    nextName.hashCode();
                    if ("cdbCallStartTimestamp".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter = this.f2434a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2438e.getAdapter(Long.class);
                            this.f2434a = typeAdapter;
                        }
                        a2.b(typeAdapter.read(jsonReader));
                    } else if ("cdbCallEndTimestamp".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter2 = this.f2434a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2438e.getAdapter(Long.class);
                            this.f2434a = typeAdapter2;
                        }
                        a2.a(typeAdapter2.read(jsonReader));
                    } else if ("cdbCallTimeout".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter3 = this.f2435b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2438e.getAdapter(Boolean.class);
                            this.f2435b = typeAdapter3;
                        }
                        a2.b(typeAdapter3.read(jsonReader).booleanValue());
                    } else if ("cachedBidUsed".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter4 = this.f2435b;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2438e.getAdapter(Boolean.class);
                            this.f2435b = typeAdapter4;
                        }
                        a2.a(typeAdapter4.read(jsonReader).booleanValue());
                    } else if ("elapsedTimestamp".equals(nextName)) {
                        TypeAdapter<Long> typeAdapter5 = this.f2434a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2438e.getAdapter(Long.class);
                            this.f2434a = typeAdapter5;
                        }
                        a2.c(typeAdapter5.read(jsonReader));
                    } else if ("impressionId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter6 = this.f2436c;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2438e.getAdapter(String.class);
                            this.f2436c = typeAdapter6;
                        }
                        a2.a(typeAdapter6.read(jsonReader));
                    } else if ("requestGroupId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter7 = this.f2436c;
                        if (typeAdapter7 == null) {
                            typeAdapter7 = this.f2438e.getAdapter(String.class);
                            this.f2436c = typeAdapter7;
                        }
                        a2.b(typeAdapter7.read(jsonReader));
                    } else if ("zoneId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter8 = this.f2437d;
                        if (typeAdapter8 == null) {
                            typeAdapter8 = this.f2438e.getAdapter(Integer.class);
                            this.f2437d = typeAdapter8;
                        }
                        a2.b(typeAdapter8.read(jsonReader));
                    } else if ("profileId".equals(nextName)) {
                        TypeAdapter<Integer> typeAdapter9 = this.f2437d;
                        if (typeAdapter9 == null) {
                            typeAdapter9 = this.f2438e.getAdapter(Integer.class);
                            this.f2437d = typeAdapter9;
                        }
                        a2.a(typeAdapter9.read(jsonReader));
                    } else if ("readyToSend".equals(nextName)) {
                        TypeAdapter<Boolean> typeAdapter10 = this.f2435b;
                        if (typeAdapter10 == null) {
                            typeAdapter10 = this.f2438e.getAdapter(Boolean.class);
                            this.f2435b = typeAdapter10;
                        }
                        a2.c(typeAdapter10.read(jsonReader).booleanValue());
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return a2.a();
        }

        public String toString() {
            return "TypeAdapter(" + "Metric" + ")";
        }
    }
}

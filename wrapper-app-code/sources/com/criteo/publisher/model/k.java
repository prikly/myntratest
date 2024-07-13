package com.criteo.publisher.model;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* compiled from: AutoValue_RemoteConfigRequest */
final class k extends d {
    k(String str, String str2, String str3, int i, String str4, String str5) {
        super(str, str2, str3, i, str4, str5);
    }

    /* compiled from: AutoValue_RemoteConfigRequest */
    static final class a extends TypeAdapter<w> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f2812a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<Integer> f2813b;

        /* renamed from: c  reason: collision with root package name */
        private final Gson f2814c;

        a(Gson gson) {
            this.f2814c = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, w wVar) throws IOException {
            if (wVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("cpId");
            if (wVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f2812a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2814c.getAdapter(String.class);
                    this.f2812a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, wVar.b());
            }
            jsonWriter.name("bundleId");
            if (wVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f2812a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2814c.getAdapter(String.class);
                    this.f2812a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, wVar.a());
            }
            jsonWriter.name("sdkVersion");
            if (wVar.f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f2812a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2814c.getAdapter(String.class);
                    this.f2812a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, wVar.f());
            }
            jsonWriter.name("rtbProfileId");
            TypeAdapter<Integer> typeAdapter4 = this.f2813b;
            if (typeAdapter4 == null) {
                typeAdapter4 = this.f2814c.getAdapter(Integer.class);
                this.f2813b = typeAdapter4;
            }
            typeAdapter4.write(jsonWriter, Integer.valueOf(wVar.e()));
            jsonWriter.name("deviceId");
            if (wVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f2812a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f2814c.getAdapter(String.class);
                    this.f2812a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, wVar.c());
            }
            jsonWriter.name("deviceOs");
            if (wVar.d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter6 = this.f2812a;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f2814c.getAdapter(String.class);
                    this.f2812a = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, wVar.d());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public w read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1537286620) {
                        if (hashCode == 3059304 && nextName.equals("cpId")) {
                            c2 = 0;
                        }
                    } else if (nextName.equals("rtbProfileId")) {
                        c2 = 1;
                    }
                    if (c2 == 0) {
                        TypeAdapter<String> typeAdapter = this.f2812a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2814c.getAdapter(String.class);
                            this.f2812a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if (c2 == 1) {
                        TypeAdapter<Integer> typeAdapter2 = this.f2813b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2814c.getAdapter(Integer.class);
                            this.f2813b = typeAdapter2;
                        }
                        i = typeAdapter2.read(jsonReader).intValue();
                    } else if ("bundleId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.f2812a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2814c.getAdapter(String.class);
                            this.f2812a = typeAdapter3;
                        }
                        str2 = typeAdapter3.read(jsonReader);
                    } else if ("sdkVersion".equals(nextName)) {
                        TypeAdapter<String> typeAdapter4 = this.f2812a;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2814c.getAdapter(String.class);
                            this.f2812a = typeAdapter4;
                        }
                        str3 = typeAdapter4.read(jsonReader);
                    } else if ("deviceId".equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.f2812a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2814c.getAdapter(String.class);
                            this.f2812a = typeAdapter5;
                        }
                        str4 = typeAdapter5.read(jsonReader);
                    } else if ("deviceOs".equals(nextName)) {
                        TypeAdapter<String> typeAdapter6 = this.f2812a;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2814c.getAdapter(String.class);
                            this.f2812a = typeAdapter6;
                        }
                        str5 = typeAdapter6.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new k(str, str2, str3, i, str4, str5);
        }

        public String toString() {
            return "TypeAdapter(" + "RemoteConfigRequest" + ")";
        }
    }
}

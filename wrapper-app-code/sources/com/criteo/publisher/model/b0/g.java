package com.criteo.publisher.model.b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;

/* compiled from: AutoValue_NativeAdvertiser */
final class g extends a {
    g(String str, String str2, URI uri, o oVar) {
        super(str, str2, uri, oVar);
    }

    /* compiled from: AutoValue_NativeAdvertiser */
    static final class a extends TypeAdapter<m> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f2747a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<URI> f2748b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<o> f2749c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f2750d;

        a(Gson gson) {
            this.f2750d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, m mVar) throws IOException {
            if (mVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("domain");
            if (mVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f2747a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2750d.getAdapter(String.class);
                    this.f2747a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, mVar.b());
            }
            jsonWriter.name("description");
            if (mVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f2747a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2750d.getAdapter(String.class);
                    this.f2747a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, mVar.a());
            }
            jsonWriter.name("logoClickUrl");
            if (mVar.d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URI> typeAdapter3 = this.f2748b;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2750d.getAdapter(URI.class);
                    this.f2748b = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, mVar.d());
            }
            jsonWriter.name("logo");
            if (mVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<o> typeAdapter4 = this.f2749c;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f2750d.getAdapter(o.class);
                    this.f2749c = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, mVar.c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public m read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
            URI uri = null;
            o oVar = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("domain".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f2747a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2750d.getAdapter(String.class);
                            this.f2747a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("description".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f2747a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2750d.getAdapter(String.class);
                            this.f2747a = typeAdapter2;
                        }
                        str2 = typeAdapter2.read(jsonReader);
                    } else if ("logoClickUrl".equals(nextName)) {
                        TypeAdapter<URI> typeAdapter3 = this.f2748b;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2750d.getAdapter(URI.class);
                            this.f2748b = typeAdapter3;
                        }
                        uri = typeAdapter3.read(jsonReader);
                    } else if ("logo".equals(nextName)) {
                        TypeAdapter<o> typeAdapter4 = this.f2749c;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2750d.getAdapter(o.class);
                            this.f2749c = typeAdapter4;
                        }
                        oVar = typeAdapter4.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new g(str, str2, uri, oVar);
        }

        public String toString() {
            return "TypeAdapter(" + "NativeAdvertiser" + ")";
        }
    }
}

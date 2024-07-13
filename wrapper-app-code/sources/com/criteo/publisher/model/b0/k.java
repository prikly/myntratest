package com.criteo.publisher.model.b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URL;

/* compiled from: AutoValue_NativePrivacy */
final class k extends e {
    k(URI uri, URL url, String str) {
        super(uri, url, str);
    }

    /* compiled from: AutoValue_NativePrivacy */
    static final class a extends TypeAdapter<q> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<URI> f2760a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<URL> f2761b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<String> f2762c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f2763d;

        a(Gson gson) {
            this.f2763d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, q qVar) throws IOException {
            if (qVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("optoutClickUrl");
            if (qVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URI> typeAdapter = this.f2760a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2763d.getAdapter(URI.class);
                    this.f2760a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, qVar.a());
            }
            jsonWriter.name("optoutImageUrl");
            if (qVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URL> typeAdapter2 = this.f2761b;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2763d.getAdapter(URL.class);
                    this.f2761b = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, qVar.b());
            }
            jsonWriter.name("longLegalText");
            if (qVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f2762c;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2763d.getAdapter(String.class);
                    this.f2762c = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, qVar.c());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public q read(JsonReader jsonReader) throws IOException {
            URI uri = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            URL url = null;
            String str = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    char c2 = 65535;
                    int hashCode = nextName.hashCode();
                    if (hashCode != -111772945) {
                        if (hashCode != 763886698) {
                            if (hashCode == 1654281122 && nextName.equals("optoutClickUrl")) {
                                c2 = 0;
                            }
                        } else if (nextName.equals("longLegalText")) {
                            c2 = 2;
                        }
                    } else if (nextName.equals("optoutImageUrl")) {
                        c2 = 1;
                    }
                    if (c2 == 0) {
                        TypeAdapter<URI> typeAdapter = this.f2760a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2763d.getAdapter(URI.class);
                            this.f2760a = typeAdapter;
                        }
                        uri = typeAdapter.read(jsonReader);
                    } else if (c2 == 1) {
                        TypeAdapter<URL> typeAdapter2 = this.f2761b;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2763d.getAdapter(URL.class);
                            this.f2761b = typeAdapter2;
                        }
                        url = typeAdapter2.read(jsonReader);
                    } else if (c2 != 2) {
                        jsonReader.skipValue();
                    } else {
                        TypeAdapter<String> typeAdapter3 = this.f2762c;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2763d.getAdapter(String.class);
                            this.f2762c = typeAdapter3;
                        }
                        str = typeAdapter3.read(jsonReader);
                    }
                }
            }
            jsonReader.endObject();
            return new k(uri, url, str);
        }

        public String toString() {
            return "TypeAdapter(" + "NativePrivacy" + ")";
        }
    }
}

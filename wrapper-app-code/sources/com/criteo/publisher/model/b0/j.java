package com.criteo.publisher.model.b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URL;

/* compiled from: AutoValue_NativeImpressionPixel */
final class j extends d {
    j(URL url) {
        super(url);
    }

    /* compiled from: AutoValue_NativeImpressionPixel */
    static final class a extends TypeAdapter<p> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<URL> f2758a;

        /* renamed from: b  reason: collision with root package name */
        private final Gson f2759b;

        a(Gson gson) {
            this.f2759b = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, p pVar) throws IOException {
            if (pVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("url");
            if (pVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URL> typeAdapter = this.f2758a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2759b.getAdapter(URL.class);
                    this.f2758a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, pVar.a());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public p read(JsonReader jsonReader) throws IOException {
            URL url = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("url".equals(nextName)) {
                        TypeAdapter<URL> typeAdapter = this.f2758a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2759b.getAdapter(URL.class);
                            this.f2758a = typeAdapter;
                        }
                        url = typeAdapter.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new j(url);
        }

        public String toString() {
            return "TypeAdapter(" + "NativeImpressionPixel" + ")";
        }
    }
}

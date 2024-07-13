package com.criteo.publisher.model.b0;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.utils.IabUtils;
import java.io.IOException;
import java.net.URI;

/* compiled from: AutoValue_NativeProduct */
final class l extends f {
    l(String str, String str2, String str3, URI uri, String str4, o oVar) {
        super(str, str2, str3, uri, str4, oVar);
    }

    /* compiled from: AutoValue_NativeProduct */
    static final class a extends TypeAdapter<r> {

        /* renamed from: a  reason: collision with root package name */
        private volatile TypeAdapter<String> f2764a;

        /* renamed from: b  reason: collision with root package name */
        private volatile TypeAdapter<URI> f2765b;

        /* renamed from: c  reason: collision with root package name */
        private volatile TypeAdapter<o> f2766c;

        /* renamed from: d  reason: collision with root package name */
        private final Gson f2767d;

        a(Gson gson) {
            this.f2767d = gson;
        }

        /* renamed from: a */
        public void write(JsonWriter jsonWriter, r rVar) throws IOException {
            if (rVar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("title");
            if (rVar.g() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter = this.f2764a;
                if (typeAdapter == null) {
                    typeAdapter = this.f2767d.getAdapter(String.class);
                    this.f2764a = typeAdapter;
                }
                typeAdapter.write(jsonWriter, rVar.g());
            }
            jsonWriter.name("description");
            if (rVar.c() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter2 = this.f2764a;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.f2767d.getAdapter(String.class);
                    this.f2764a = typeAdapter2;
                }
                typeAdapter2.write(jsonWriter, rVar.c());
            }
            jsonWriter.name(InAppPurchaseMetaData.KEY_PRICE);
            if (rVar.f() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter3 = this.f2764a;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.f2767d.getAdapter(String.class);
                    this.f2764a = typeAdapter3;
                }
                typeAdapter3.write(jsonWriter, rVar.f());
            }
            jsonWriter.name(IabUtils.KEY_CLICK_URL);
            if (rVar.b() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<URI> typeAdapter4 = this.f2765b;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.f2767d.getAdapter(URI.class);
                    this.f2765b = typeAdapter4;
                }
                typeAdapter4.write(jsonWriter, rVar.b());
            }
            jsonWriter.name("callToAction");
            if (rVar.a() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<String> typeAdapter5 = this.f2764a;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.f2767d.getAdapter(String.class);
                    this.f2764a = typeAdapter5;
                }
                typeAdapter5.write(jsonWriter, rVar.a());
            }
            jsonWriter.name("image");
            if (rVar.d() == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter<o> typeAdapter6 = this.f2766c;
                if (typeAdapter6 == null) {
                    typeAdapter6 = this.f2767d.getAdapter(o.class);
                    this.f2766c = typeAdapter6;
                }
                typeAdapter6.write(jsonWriter, rVar.d());
            }
            jsonWriter.endObject();
        }

        /* renamed from: a */
        public r read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            URI uri = null;
            String str4 = null;
            o oVar = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                } else {
                    nextName.hashCode();
                    if ("title".equals(nextName)) {
                        TypeAdapter<String> typeAdapter = this.f2764a;
                        if (typeAdapter == null) {
                            typeAdapter = this.f2767d.getAdapter(String.class);
                            this.f2764a = typeAdapter;
                        }
                        str = typeAdapter.read(jsonReader);
                    } else if ("description".equals(nextName)) {
                        TypeAdapter<String> typeAdapter2 = this.f2764a;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.f2767d.getAdapter(String.class);
                            this.f2764a = typeAdapter2;
                        }
                        str2 = typeAdapter2.read(jsonReader);
                    } else if (InAppPurchaseMetaData.KEY_PRICE.equals(nextName)) {
                        TypeAdapter<String> typeAdapter3 = this.f2764a;
                        if (typeAdapter3 == null) {
                            typeAdapter3 = this.f2767d.getAdapter(String.class);
                            this.f2764a = typeAdapter3;
                        }
                        str3 = typeAdapter3.read(jsonReader);
                    } else if (IabUtils.KEY_CLICK_URL.equals(nextName)) {
                        TypeAdapter<URI> typeAdapter4 = this.f2765b;
                        if (typeAdapter4 == null) {
                            typeAdapter4 = this.f2767d.getAdapter(URI.class);
                            this.f2765b = typeAdapter4;
                        }
                        uri = typeAdapter4.read(jsonReader);
                    } else if ("callToAction".equals(nextName)) {
                        TypeAdapter<String> typeAdapter5 = this.f2764a;
                        if (typeAdapter5 == null) {
                            typeAdapter5 = this.f2767d.getAdapter(String.class);
                            this.f2764a = typeAdapter5;
                        }
                        str4 = typeAdapter5.read(jsonReader);
                    } else if ("image".equals(nextName)) {
                        TypeAdapter<o> typeAdapter6 = this.f2766c;
                        if (typeAdapter6 == null) {
                            typeAdapter6 = this.f2767d.getAdapter(o.class);
                            this.f2766c = typeAdapter6;
                        }
                        oVar = typeAdapter6.read(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
            return new l(str, str2, str3, uri, str4, oVar);
        }

        public String toString() {
            return "TypeAdapter(" + "NativeProduct" + ")";
        }
    }
}

package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.core.api.JsonParser;
import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.hd  reason: case insensitive filesystem */
public final class C0431hd implements Converter<Object, byte[]>, JsonParser<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ JsonParser<? extends Object> f5919a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Converter<Object, byte[]> f5920b;

    public C0431hd(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f5919a = remoteConfigExtensionConfiguration.getJsonParser();
        this.f5920b = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    /* renamed from: a */
    public Object parse(JSONObject jSONObject) {
        return this.f5919a.parse(jSONObject);
    }

    public Object a(byte[] bArr) {
        return this.f5920b.toModel(bArr);
    }

    public byte[] a(Object obj) {
        return (byte[]) this.f5920b.fromModel(obj);
    }

    public Object fromModel(Object obj) {
        return (byte[]) this.f5920b.fromModel(obj);
    }

    public Object parseOrNull(Object obj) {
        return this.f5919a.parseOrNull((JSONObject) obj);
    }

    public Object toModel(Object obj) {
        return this.f5920b.toModel((byte[]) obj);
    }
}

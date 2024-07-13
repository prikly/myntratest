package com.appodeal.ads.modules.libs.network.httpclients;

import com.appodeal.ads.modules.libs.network.HttpError;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public interface e {

    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final HttpError f16788a;

        public a(Map map, HttpError httpError) {
            Intrinsics.checkNotNullParameter(map, "headers");
            Intrinsics.checkNotNullParameter(httpError, "httpError");
            this.f16788a = httpError;
        }

        public final HttpError a() {
            return this.f16788a;
        }
    }

    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f16789a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16790b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, List<String>> f16791c;

        public b(byte[] bArr, String str, Map map) {
            Intrinsics.checkNotNullParameter(map, "headers");
            this.f16789a = bArr;
            this.f16790b = str;
            this.f16791c = map;
        }

        public final String a() {
            return this.f16790b;
        }

        public final byte[] b() {
            return this.f16789a;
        }

        public final Map<String, List<String>> c() {
            return this.f16791c;
        }
    }
}

package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import java.util.HashMap;
import java.util.Map;

public class PreloadInfo {

    /* renamed from: a  reason: collision with root package name */
    private String f3379a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f3380b;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f3381a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f3382b;

        public PreloadInfo build() {
            return new PreloadInfo(this);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (!(str == null || str2 == null)) {
                this.f3382b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f3381a = str;
            this.f3382b = new HashMap();
        }
    }

    public static Builder newBuilder(String str) {
        return new Builder(str);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f3380b;
    }

    public String getTrackingId() {
        return this.f3379a;
    }

    private PreloadInfo(Builder builder) {
        this.f3379a = builder.f3381a;
        this.f3380b = A2.d(builder.f3382b);
    }
}

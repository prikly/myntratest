package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.Map;
import java.util.UUID;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final String f15764a = UUID.randomUUID().toString();

    /* renamed from: b  reason: collision with root package name */
    private final String f15765b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f15766c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15767d;

    public q(String str, Map<String, String> map, Map<String, Object> map2) {
        this.f15765b = str;
        Map<String, Object> map3 = CollectionUtils.map();
        this.f15766c = map3;
        map3.putAll(map);
        this.f15766c.put("applovin_sdk_super_properties", map2);
        this.f15767d = System.currentTimeMillis();
    }

    public String a() {
        return this.f15765b;
    }

    public Map<String, Object> b() {
        return this.f15766c;
    }

    public long c() {
        return this.f15767d;
    }

    public String d() {
        return this.f15764a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f15767d != qVar.f15767d) {
            return false;
        }
        String str = this.f15765b;
        if (str == null ? qVar.f15765b != null : !str.equals(qVar.f15765b)) {
            return false;
        }
        Map<String, Object> map = this.f15766c;
        if (map == null ? qVar.f15766c != null : !map.equals(qVar.f15766c)) {
            return false;
        }
        String str2 = this.f15764a;
        String str3 = qVar.f15764a;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f15765b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, Object> map = this.f15766c;
        int hashCode2 = map != null ? map.hashCode() : 0;
        long j = this.f15767d;
        int i2 = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f15764a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "Event{name='" + this.f15765b + '\'' + ", id='" + this.f15764a + '\'' + ", creationTimestampMillis=" + this.f15767d + ", parameters=" + this.f15766c + '}';
    }
}

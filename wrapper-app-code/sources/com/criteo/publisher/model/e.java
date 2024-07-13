package com.criteo.publisher.model;

import com.criteo.publisher.logging.RemoteLogRecords;
import com.google.gson.annotations.SerializedName;

/* compiled from: $AutoValue_RemoteConfigResponse */
abstract class e extends y {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f2777a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2778b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2779c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2780d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2781e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f2782f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f2783g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f2784h;
    private final Boolean i;
    private final RemoteLogRecords.RemoteLogLevel j;

    e(Boolean bool, String str, String str2, String str3, String str4, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, RemoteLogRecords.RemoteLogLevel remoteLogLevel) {
        this.f2777a = bool;
        this.f2778b = str;
        this.f2779c = str2;
        this.f2780d = str3;
        this.f2781e = str4;
        this.f2782f = bool2;
        this.f2783g = bool3;
        this.f2784h = num;
        this.i = bool4;
        this.j = remoteLogLevel;
    }

    public Boolean g() {
        return this.f2777a;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidDisplayUrlMacro")
    public String e() {
        return this.f2778b;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagUrlMode")
    public String d() {
        return this.f2779c;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagDataMacro")
    public String b() {
        return this.f2780d;
    }

    /* access modifiers changed from: package-private */
    @SerializedName("AndroidAdTagDataMode")
    public String c() {
        return this.f2781e;
    }

    public Boolean f() {
        return this.f2782f;
    }

    public Boolean h() {
        return this.f2783g;
    }

    public Integer i() {
        return this.f2784h;
    }

    public Boolean j() {
        return this.i;
    }

    public RemoteLogRecords.RemoteLogLevel k() {
        return this.j;
    }

    public String toString() {
        return "RemoteConfigResponse{killSwitch=" + this.f2777a + ", androidDisplayUrlMacro=" + this.f2778b + ", androidAdTagUrlMode=" + this.f2779c + ", androidAdTagDataMacro=" + this.f2780d + ", androidAdTagDataMode=" + this.f2781e + ", csmEnabled=" + this.f2782f + ", liveBiddingEnabled=" + this.f2783g + ", liveBiddingTimeBudgetInMillis=" + this.f2784h + ", prefetchOnInitEnabled=" + this.i + ", remoteLogLevel=" + this.j + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Boolean bool = this.f2777a;
        if (bool != null ? bool.equals(yVar.g()) : yVar.g() == null) {
            String str = this.f2778b;
            if (str != null ? str.equals(yVar.e()) : yVar.e() == null) {
                String str2 = this.f2779c;
                if (str2 != null ? str2.equals(yVar.d()) : yVar.d() == null) {
                    String str3 = this.f2780d;
                    if (str3 != null ? str3.equals(yVar.b()) : yVar.b() == null) {
                        String str4 = this.f2781e;
                        if (str4 != null ? str4.equals(yVar.c()) : yVar.c() == null) {
                            Boolean bool2 = this.f2782f;
                            if (bool2 != null ? bool2.equals(yVar.f()) : yVar.f() == null) {
                                Boolean bool3 = this.f2783g;
                                if (bool3 != null ? bool3.equals(yVar.h()) : yVar.h() == null) {
                                    Integer num = this.f2784h;
                                    if (num != null ? num.equals(yVar.i()) : yVar.i() == null) {
                                        Boolean bool4 = this.i;
                                        if (bool4 != null ? bool4.equals(yVar.j()) : yVar.j() == null) {
                                            RemoteLogRecords.RemoteLogLevel remoteLogLevel = this.j;
                                            if (remoteLogLevel == null) {
                                                if (yVar.k() == null) {
                                                    return true;
                                                }
                                            } else if (remoteLogLevel.equals(yVar.k())) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Boolean bool = this.f2777a;
        int i2 = 0;
        int hashCode = ((bool == null ? 0 : bool.hashCode()) ^ 1000003) * 1000003;
        String str = this.f2778b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f2779c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2780d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f2781e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        Boolean bool2 = this.f2782f;
        int hashCode6 = (hashCode5 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.f2783g;
        int hashCode7 = (hashCode6 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Integer num = this.f2784h;
        int hashCode8 = (hashCode7 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Boolean bool4 = this.i;
        int hashCode9 = (hashCode8 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        RemoteLogRecords.RemoteLogLevel remoteLogLevel = this.j;
        if (remoteLogLevel != null) {
            i2 = remoteLogLevel.hashCode();
        }
        return hashCode9 ^ i2;
    }
}

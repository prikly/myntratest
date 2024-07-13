package com.yandex.metrica.modules.api;

public final class RemoteConfigMetaInfo {

    /* renamed from: a  reason: collision with root package name */
    private final long f7257a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7258b;

    public RemoteConfigMetaInfo(long j, long j2) {
        this.f7257a = j;
        this.f7258b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteConfigMetaInfo)) {
            return false;
        }
        RemoteConfigMetaInfo remoteConfigMetaInfo = (RemoteConfigMetaInfo) obj;
        return this.f7257a == remoteConfigMetaInfo.f7257a && this.f7258b == remoteConfigMetaInfo.f7258b;
    }

    public int hashCode() {
        long j = this.f7257a;
        long j2 = this.f7258b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RemoteConfigMetaInfo(firstSendTime=" + this.f7257a + ", lastUpdateTime=" + this.f7258b + ")";
    }
}

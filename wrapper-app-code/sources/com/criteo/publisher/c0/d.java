package com.criteo.publisher.c0;

import com.criteo.publisher.i;
import java.util.UUID;

/* compiled from: UniqueIdGenerator */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final i f2366a;

    private byte a(long j, int i) {
        int i2 = (64 - (i + 1)) << 2;
        return (byte) ((int) (((j & (15 << i2)) >> i2) & 15));
    }

    private long a(long j, int i, byte b2) {
        int i2 = (64 - (i + 1)) << 2;
        return (j & (~(15 << i2))) | (((long) b2) << i2);
    }

    public d(i iVar) {
        this.f2366a = iVar;
    }

    public String a() {
        return a(UUID.randomUUID(), this.f2366a.a() / 1000);
    }

    /* access modifiers changed from: package-private */
    public String a(UUID uuid, long j) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long a2 = a(mostSignificantBits, 12, a(mostSignificantBits, 0));
        long j2 = (j << 32) | (a2 & 4294967295L);
        return String.format("%016x%016x", new Object[]{Long.valueOf(j2), Long.valueOf(a(leastSignificantBits, 0, a(a2, 1)))});
    }
}

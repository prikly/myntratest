package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

public class E4 {

    /* renamed from: a  reason: collision with root package name */
    private Long f3908a;

    /* renamed from: b  reason: collision with root package name */
    private int f3909b;

    /* renamed from: c  reason: collision with root package name */
    private TimeProvider f3910c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f3911a;

        /* renamed from: b  reason: collision with root package name */
        public final long f3912b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3913c;

        public a(long j, long j2, int i) {
            this.f3911a = j;
            this.f3913c = i;
            this.f3912b = j2;
        }
    }

    public E4() {
        this(new SystemTimeProvider());
    }

    public a a() {
        if (this.f3908a == null) {
            this.f3908a = Long.valueOf(this.f3910c.currentTimeSeconds());
        }
        long longValue = this.f3908a.longValue();
        long longValue2 = this.f3908a.longValue();
        int i = this.f3909b;
        a aVar = new a(longValue, longValue2, i);
        this.f3909b = i + 1;
        return aVar;
    }

    public E4(TimeProvider timeProvider) {
        this.f3910c = timeProvider;
    }
}

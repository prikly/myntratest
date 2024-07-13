package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.mk  reason: case insensitive filesystem */
class C0562mk implements C0829xl {

    /* renamed from: a  reason: collision with root package name */
    private final M0 f6293a;

    /* renamed from: b  reason: collision with root package name */
    private final TimeProvider f6294b;

    /* renamed from: c  reason: collision with root package name */
    private Map<Long, Long> f6295c;

    C0562mk() {
        this(C0609oh.a(), new SystemTimeProvider());
    }

    public synchronized void a(Activity activity, long j) {
        this.f6295c.put(Long.valueOf(j), Long.valueOf(this.f6294b.currentTimeMillis()));
    }

    public void a(Activity activity, boolean z) {
    }

    public void a(Throwable th, C0805wl wlVar) {
    }

    public boolean a(C0389fl flVar) {
        return false;
    }

    C0562mk(M0 m0, TimeProvider timeProvider) {
        this.f6295c = new HashMap();
        this.f6293a = m0;
        this.f6294b = timeProvider;
    }

    public synchronized void a(long j, Activity activity, C0339dl dlVar, List<C0685rl> list, C0389fl flVar, Bk bk) {
        this.f6294b.currentTimeMillis();
        if (this.f6295c.get(Long.valueOf(j)) != null) {
            this.f6295c.remove(Long.valueOf(j));
        } else {
            this.f6293a.reportError("ui_parsing_diagnostics", (Throwable) new IllegalStateException("Unexpected situation: no start time"));
        }
    }
}

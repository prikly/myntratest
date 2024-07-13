package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.dj  reason: case insensitive filesystem */
public class C0337dj {

    /* renamed from: a  reason: collision with root package name */
    private final C0287bj f5691a;

    /* renamed from: b  reason: collision with root package name */
    private final C0710sm f5692b;

    /* renamed from: c  reason: collision with root package name */
    private final C0387fj f5693c;

    /* renamed from: d  reason: collision with root package name */
    private final C0312cj f5694d;

    C0337dj(C0287bj bjVar, C0312cj cjVar, C0710sm smVar, C0387fj fjVar) {
        this.f5691a = bjVar;
        this.f5694d = cjVar;
        this.f5692b = smVar;
        this.f5693c = fjVar;
    }

    public W0 a() {
        String str;
        try {
            this.f5692b.a();
            str = this.f5693c.a();
            try {
                if (TextUtils.isEmpty(str)) {
                    str = this.f5691a.a();
                    if (!TextUtils.isEmpty(str) || this.f5694d.a()) {
                        str = this.f5693c.a(str);
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = null;
        }
        this.f5692b.b();
        if (str == null) {
            return new W0((String) null, U0.UNKNOWN, "Uuid must be obtained via async API YandexMetricaInternal#requestStartupIdentifiers(@NonNull Context context, @NonNull IIdentifierCallback callback,@NonNull String... identifiers)");
        }
        return new W0(str, U0.OK, (String) null);
    }
}

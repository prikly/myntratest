package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.g1  reason: case insensitive filesystem */
public final class C0394g1 {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C0394g1 f5835c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f5836d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private List<String> f5837a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f5838b = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.g1$a */
    public interface a {
        void a();
    }

    C0394g1(Context context) {
        synchronized (this) {
            this.f5837a = a(context.getResources().getConfiguration());
        }
    }

    public static C0394g1 a(Context context) {
        if (f5835c == null) {
            synchronized (f5836d) {
                if (f5835c == null) {
                    f5835c = new C0394g1(context.getApplicationContext());
                }
            }
        }
        return f5835c;
    }

    public void b(Configuration configuration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f5837a = a(configuration);
            arrayList = new ArrayList(this.f5838b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public List<String> a() {
        return this.f5837a;
    }

    public synchronized void a(a aVar) {
        this.f5838b.add(aVar);
    }

    private List<String> a(Configuration configuration) {
        if (!A2.a(24)) {
            return Collections.singletonList(H1.a(configuration.locale));
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales != null) {
            Intrinsics.checkNotNullExpressionValue(locales, "configuration.locales ?: return result");
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                Locale locale = locales.get(i);
                if (locale != null) {
                    String a2 = H1.a(locale);
                    Intrinsics.checkNotNullExpressionValue(a2, "PhoneUtils.normalizedLocale(it)");
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }
}

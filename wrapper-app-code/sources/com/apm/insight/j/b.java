package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.h;
import com.apm.insight.runtime.d;
import com.apm.insight.runtime.p;
import com.apm.insight.runtime.s;
import java.util.Map;

public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private static Runnable f10648b = new Runnable() {
        public void run() {
            p.b().a().removeCallbacks(this);
            p.b().a((Runnable) new b(p.b().a(), 0, 30000, h.g()));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private Context f10649a;

    public b(Handler handler, long j, long j2, Context context) {
        super(handler, j, j2);
        this.f10649a = context;
    }

    public static void d() {
        p.b().a(f10648b, 100);
    }

    public void run() {
        Map<String, Object> map;
        try {
            map = h.a().c().getCommonParams();
        } catch (Throwable unused) {
            map = null;
        }
        if (map != null) {
            try {
                if (d.a(map)) {
                    a(c());
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        s.a().a(map, com.apm.insight.entity.b.b());
    }
}

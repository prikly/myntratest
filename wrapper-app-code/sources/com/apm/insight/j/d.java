package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.l.a;
import com.apm.insight.l.q;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private List<a> f10650a = new ArrayList(3);

    private d(Handler handler, Context context) {
        if (a.b(context)) {
            this.f10650a.add(new c(handler, 0, 15000));
        }
    }

    public static d a(Handler handler, Context context) {
        return new d(handler, context);
    }

    public void a() {
        q.a((Object) "[ScheduleTaskManager] execute, task size=" + this.f10650a.size());
        for (a a2 : this.f10650a) {
            try {
                a2.a();
            } catch (Throwable unused) {
            }
        }
    }
}

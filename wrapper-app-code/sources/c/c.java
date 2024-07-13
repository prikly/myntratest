package c;

import android.content.Context;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.entity.AnalyticsMetricConfig;
import io.bidmachine.analytics.entity.Event;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f9769a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static final List<a> f9770b = new CopyOnWriteArrayList();

    public static final class b implements b {
        private b() {
        }

        public void a(Event event) {
            e.b.a(event);
        }
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        for (a a2 : f9770b) {
            a2.a(applicationContext);
        }
    }

    public static void a(Context context, AnalyticsConfig analyticsConfig) {
        if (f9769a.compareAndSet(false, true)) {
            for (AnalyticsMetricConfig next : analyticsConfig.getAnalyticsMetricConfigList()) {
                try {
                    if (next.getEventName().equals("mimp")) {
                        f9770b.add(new d.a(next, new b()));
                    }
                } catch (Throwable unused) {
                }
            }
            a(context);
        }
    }
}

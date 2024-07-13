package e;

import android.content.Context;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.entity.Event;
import java.util.concurrent.atomic.AtomicBoolean;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f7403a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static a f7404b;

    public static void a(Context context, AnalyticsConfig analyticsConfig) {
        if (f7403a.compareAndSet(false, true)) {
            h.b bVar = new h.b(context);
            bVar.b();
            f7404b = new a(analyticsConfig, bVar);
        }
    }

    public static void a(Event event) {
        a aVar = f7404b;
        if (aVar != null) {
            aVar.b(event);
        }
    }
}

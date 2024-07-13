package io.bidmachine;

import a.a;
import android.content.Context;
import c.c;
import e.b;
import io.bidmachine.analytics.AnalyticsConfig;
import io.bidmachine.analytics.InitializeListener;
import io.bidmachine.analytics.entity.Event;
import java.util.concurrent.atomic.AtomicBoolean;

final class BidMachineAnalytics {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f9650a = new AtomicBoolean(false);

    public static /* synthetic */ void a(Context context, AnalyticsConfig analyticsConfig, InitializeListener initializeListener) {
        try {
            b.a(context, analyticsConfig);
            c.a(context, analyticsConfig);
            if (initializeListener != null) {
                initializeListener.onInitialized();
            }
        } catch (Throwable unused) {
        }
    }

    public static void initialize(Context context, AnalyticsConfig analyticsConfig) {
        initialize(context, analyticsConfig, (InitializeListener) null);
    }

    public static void initialize(Context context, AnalyticsConfig analyticsConfig, InitializeListener initializeListener) {
        if (f9650a.compareAndSet(false, true)) {
            a.b(new Runnable(context.getApplicationContext(), analyticsConfig, initializeListener) {
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ AnalyticsConfig f$1;
                public final /* synthetic */ InitializeListener f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    BidMachineAnalytics.a(this.f$0, this.f$1, this.f$2);
                }
            });
        }
    }

    public static void trackEvent(Event event) {
        b.a(event);
    }
}

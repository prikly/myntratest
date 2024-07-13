package d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import c.b;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import io.bidmachine.analytics.entity.AnalyticsMetricConfig;
import java.util.UUID;

public class a extends c.a {

    /* renamed from: b  reason: collision with root package name */
    public final C0059a f7394b;

    /* renamed from: d.a$a  reason: collision with other inner class name */
    public static final class C0059a implements AppLovinCommunicatorSubscriber {

        /* renamed from: a  reason: collision with root package name */
        public final AnalyticsMetricConfig f7395a;

        /* renamed from: b  reason: collision with root package name */
        public final b f7396b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7397c = UUID.randomUUID().toString();

        public C0059a(AnalyticsMetricConfig analyticsMetricConfig, b bVar) {
            this.f7395a = analyticsMetricConfig;
            this.f7396b = bVar;
        }

        public final String a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj == null) {
                return null;
            }
            String valueOf = String.valueOf(obj);
            if (TextUtils.isEmpty(valueOf)) {
                return null;
            }
            return valueOf;
        }

        public String getCommunicatorId() {
            return this.f7397c;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:53|54|55|56|70) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00ab */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage r7) {
            /*
                r6 = this;
                if (r7 != 0) goto L_0x0003
                return
            L_0x0003:
                java.lang.String r0 = "max_revenue_events"
                java.lang.String r1 = r7.getTopic()     // Catch:{ all -> 0x00b4 }
                boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b4 }
                if (r0 != 0) goto L_0x0010
                return
            L_0x0010:
                android.os.Bundle r7 = r7.getMessageData()     // Catch:{ all -> 0x00b4 }
                int r0 = r7.size()     // Catch:{ all -> 0x00b4 }
                if (r0 == 0) goto L_0x00b4
                io.bidmachine.analytics.entity.Event r0 = new io.bidmachine.analytics.entity.Event     // Catch:{ all -> 0x00b4 }
                java.lang.String r1 = "mimp"
                r0.<init>(r1)     // Catch:{ all -> 0x00b4 }
                io.bidmachine.analytics.entity.AnalyticsMetricConfig r1 = r6.f7395a     // Catch:{ all -> 0x00b4 }
                java.util.List r1 = r1.getDimensions()     // Catch:{ all -> 0x00b4 }
                io.bidmachine.analytics.entity.AnalyticsMetricConfig r2 = r6.f7395a     // Catch:{ all -> 0x00b4 }
                java.util.List r2 = r2.getMetrics()     // Catch:{ all -> 0x00b4 }
                if (r1 == 0) goto L_0x0035
                int r3 = r1.size()     // Catch:{ all -> 0x00b4 }
                if (r3 != 0) goto L_0x003e
            L_0x0035:
                if (r2 == 0) goto L_0x0088
                int r3 = r2.size()     // Catch:{ all -> 0x00b4 }
                if (r3 != 0) goto L_0x003e
                goto L_0x0088
            L_0x003e:
                if (r1 == 0) goto L_0x0061
                int r3 = r1.size()     // Catch:{ all -> 0x00b4 }
                if (r3 <= 0) goto L_0x0061
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b4 }
            L_0x004a:
                boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00b4 }
                if (r3 == 0) goto L_0x0061
                java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b4 }
                java.lang.String r4 = r6.a(r7, r3)     // Catch:{ Exception -> 0x004a }
                if (r4 != 0) goto L_0x005d
                goto L_0x004a
            L_0x005d:
                r0.addDimension(r3, r4)     // Catch:{ Exception -> 0x004a }
                goto L_0x004a
            L_0x0061:
                if (r2 == 0) goto L_0x00af
                int r1 = r2.size()     // Catch:{ all -> 0x00b4 }
                if (r1 <= 0) goto L_0x00af
                java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x00b4 }
            L_0x006d:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b4 }
                if (r2 == 0) goto L_0x00af
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b4 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = r6.a(r7, r2)     // Catch:{ Exception -> 0x006d }
                if (r3 != 0) goto L_0x0080
                goto L_0x006d
            L_0x0080:
                double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x006d }
                r0.addMetric(r2, r3)     // Catch:{ Exception -> 0x006d }
                goto L_0x006d
            L_0x0088:
                java.util.Set r1 = r7.keySet()     // Catch:{ all -> 0x00b4 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00b4 }
            L_0x0090:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00b4 }
                if (r2 == 0) goto L_0x00af
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00b4 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = r6.a(r7, r2)     // Catch:{ Exception -> 0x0090 }
                if (r3 != 0) goto L_0x00a3
                goto L_0x0090
            L_0x00a3:
                double r4 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x00ab }
                r0.addMetric(r2, r4)     // Catch:{ NumberFormatException -> 0x00ab }
                goto L_0x0090
            L_0x00ab:
                r0.addDimension(r2, r3)     // Catch:{ Exception -> 0x0090 }
                goto L_0x0090
            L_0x00af:
                c.b r7 = r6.f7396b     // Catch:{ all -> 0x00b4 }
                r7.a(r0)     // Catch:{ all -> 0x00b4 }
            L_0x00b4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d.a.C0059a.onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage):void");
        }
    }

    public a(AnalyticsMetricConfig analyticsMetricConfig, b bVar) {
        this.f7394b = new C0059a(analyticsMetricConfig, bVar);
    }

    public void b(Context context) {
        AppLovinCommunicator.getInstance(context).subscribe((AppLovinCommunicatorSubscriber) this.f7394b, "max_revenue_events");
    }
}

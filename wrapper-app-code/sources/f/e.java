package f;

import b.a;
import io.bidmachine.protobuf.analytics.SDKAnalyticPayload;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class e extends a<e> {

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f7415f;

    public e(String str, List<a> list) {
        super(d.Post, str);
        this.f7415f = list;
    }

    public final SDKAnalyticPayload.Metric.MetricData a(a aVar) {
        try {
            SDKAnalyticPayload.Metric.MetricData.Builder name = SDKAnalyticPayload.Metric.MetricData.newBuilder().setTimestamp(String.valueOf(aVar.f())).setName(aVar.e());
            JSONObject b2 = aVar.b();
            if (b2.length() > 0) {
                Iterator<String> keys = b2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    name.addDimensions(SDKAnalyticPayload.Metric.MetricData.Dimension.newBuilder().setName(next).setValue(b2.optString(next)));
                }
            }
            JSONObject d2 = aVar.d();
            if (d2.length() > 0) {
                Iterator<String> keys2 = d2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    name.addMeasures(SDKAnalyticPayload.Metric.MetricData.Measure.newBuilder().setName(next2).setValue(d2.optDouble(next2)));
                }
            }
            return name.build();
        } catch (Throwable unused) {
            return null;
        }
    }

    public void c(URLConnection uRLConnection) {
        uRLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
    }

    public byte[] e() {
        try {
            HashMap hashMap = new HashMap();
            for (a next : this.f7415f) {
                String a2 = next.a();
                SDKAnalyticPayload.Metric.Builder builder = (SDKAnalyticPayload.Metric.Builder) hashMap.get(a2);
                if (builder == null) {
                    builder = SDKAnalyticPayload.Metric.newBuilder().setContext(a2);
                    hashMap.put(a2, builder);
                }
                builder.addData(a(next));
            }
            SDKAnalyticPayload.Builder newBuilder = SDKAnalyticPayload.newBuilder();
            for (SDKAnalyticPayload.Metric.Builder addMetrics : hashMap.values()) {
                newBuilder.addMetrics(addMetrics);
            }
            return newBuilder.build().toByteArray();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public e d() {
        return this;
    }

    public List<a> h() {
        return this.f7415f;
    }
}

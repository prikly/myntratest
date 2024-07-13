package com.bytedance.sdk.openadsdk.core.j.b;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastAbsoluteProgressTracker */
public class a extends c implements Comparable<a> {

    /* renamed from: a  reason: collision with root package name */
    public long f1294a;

    protected a(long j, String str, c.b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f1294a = j;
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        String[] split = str.split(":");
        if (split.length == 3) {
            try {
                return (int) (((float) ((Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000))) + (Float.parseFloat(split[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public boolean a(long j) {
        return this.f1294a <= j && !e();
    }

    /* renamed from: a */
    public int compareTo(a aVar) {
        if (aVar == null) {
            return 1;
        }
        long j = this.f1294a;
        long j2 = aVar.f1294a;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.b.a$a  reason: collision with other inner class name */
    /* compiled from: VastAbsoluteProgressTracker */
    public static class C0006a {

        /* renamed from: a  reason: collision with root package name */
        private String f1295a;

        /* renamed from: b  reason: collision with root package name */
        private long f1296b;

        /* renamed from: c  reason: collision with root package name */
        private c.b f1297c = c.b.TRACKING_URL;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1298d = false;

        public C0006a(String str, long j) {
            this.f1295a = str;
            this.f1296b = j;
        }

        public a a() {
            return new a(this.f1296b, this.f1295a, this.f1297c, Boolean.valueOf(this.f1298d));
        }
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, c());
        jSONObject.put("trackingMilliseconds", this.f1294a);
        return jSONObject;
    }
}

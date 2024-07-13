package com.ironsource.mediationsdk.a;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private int f8425a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f8426b = -1;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f8427c;

    public c(int i, long j, JSONObject jSONObject) {
        this.f8425a = i;
        this.f8426b = j;
        this.f8427c = jSONObject;
    }

    public c(int i, JSONObject jSONObject) {
        this.f8425a = i;
        this.f8426b = System.currentTimeMillis();
        if (jSONObject == null) {
            this.f8427c = new JSONObject();
        } else {
            this.f8427c = jSONObject;
        }
    }

    static a a(String str, int i) {
        if ("ironbeast".equals(str)) {
            return new e(i);
        }
        if ("outcome".equals(str)) {
            return new f(i);
        }
        if (i == 2) {
            return new e(i);
        }
        if (i == 3) {
            return new f(i);
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        logger.log(ironSourceTag, "EventsFormatterFactory failed to instantiate a formatter (type: " + str + ", adUnit: " + i + ")", 2);
        return null;
    }

    public int a() {
        return this.f8425a;
    }

    public void a(int i) {
        this.f8425a = i;
    }

    public void a(String str, Object obj) {
        try {
            this.f8427c.put(str, obj);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public long b() {
        return this.f8426b;
    }

    public String c() {
        return this.f8427c.toString();
    }

    public JSONObject d() {
        return this.f8427c;
    }
}

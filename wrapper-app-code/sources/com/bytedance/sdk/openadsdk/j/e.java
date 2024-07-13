package com.bytedance.sdk.openadsdk.j;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PlayableJsBridge */
public class e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f2030a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<g> f2031b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, a> f2032c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public SensorEventListener f2033d = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            g a2;
            if (sensorEvent.sensor.getType() == 1 && (a2 = e.this.d()) != null) {
                float f2 = sensorEvent.values[0];
                float f3 = sensorEvent.values[1];
                float f4 = sensorEvent.values[2];
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) f2);
                    jSONObject.put("y", (double) f3);
                    jSONObject.put("z", (double) f4);
                    a2.a("accelerometer_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public SensorEventListener f2034e = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            g a2;
            if (sensorEvent.sensor.getType() == 4 && (a2 = e.this.d()) != null) {
                float degrees = (float) Math.toDegrees((double) sensorEvent.values[0]);
                float degrees2 = (float) Math.toDegrees((double) sensorEvent.values[1]);
                float degrees3 = (float) Math.toDegrees((double) sensorEvent.values[2]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) degrees);
                    jSONObject.put("y", (double) degrees2);
                    jSONObject.put("z", (double) degrees3);
                    a2.a("gyro_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* compiled from: PlayableJsBridge */
    interface a {
        JSONObject a(JSONObject jSONObject) throws Throwable;
    }

    public e(g gVar) {
        this.f2030a = gVar.a();
        this.f2031b = new WeakReference<>(gVar);
        c();
    }

    public Set<String> a() {
        return this.f2032c.keySet();
    }

    private void c() {
        this.f2032c.put("adInfo", new a() {
            public JSONObject a(JSONObject jSONObject) {
                g a2 = e.this.d();
                if (a2 != null) {
                    return a2.n();
                }
                return null;
            }
        });
        this.f2032c.put("appInfo", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                JSONArray jSONArray = new JSONArray();
                for (String put : e.this.a()) {
                    jSONArray.put(put);
                }
                jSONObject2.put("supportList", jSONArray);
                g a2 = e.this.d();
                if (a2 != null) {
                    jSONObject2.put("deviceId", a2.g());
                    jSONObject2.put("netType", a2.k());
                    jSONObject2.put("innerAppName", a2.d());
                    jSONObject2.put("appName", a2.e());
                    jSONObject2.put("appVersion", a2.f());
                    Map<String, String> b2 = a2.b();
                    for (String next : b2.keySet()) {
                        jSONObject2.put(next, b2.get(next));
                    }
                }
                return jSONObject2;
            }
        });
        this.f2032c.put("playableSDKInfo", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                jSONObject2.put("os", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
                return jSONObject2;
            }
        });
        this.f2032c.put("subscribe_app_ad", new a() {
            public JSONObject a(JSONObject jSONObject) {
                a b2 = e.this.e();
                if (b2 == null) {
                    return null;
                }
                b2.a(jSONObject);
                return null;
            }
        });
        this.f2032c.put("download_app_ad", new a() {
            public JSONObject a(JSONObject jSONObject) {
                a b2 = e.this.e();
                if (b2 == null) {
                    return null;
                }
                b2.b(jSONObject);
                return null;
            }
        });
        this.f2032c.put("isViewable", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("viewStatus", a2.i());
                return jSONObject2;
            }
        });
        this.f2032c.put("getVolume", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("endcard_mute", a2.h());
                return jSONObject2;
            }
        });
        this.f2032c.put("getScreenSize", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return new JSONObject();
                }
                return a2.m();
            }
        });
        this.f2032c.put("start_accelerometer_observer", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        f.a("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                i.a(e.this.f2030a, e.this.f2033d, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f2032c.put("close_accelerometer_observer", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    i.a(e.this.f2030a, e.this.f2033d);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    f.a("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f2032c.put("start_gyro_observer", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        f.a("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                i.b(e.this.f2030a, e.this.f2034e, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f2032c.put("close_gyro_observer", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    i.a(e.this.f2030a, e.this.f2034e);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    f.a("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f2032c.put("device_shake", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    i.a(e.this.f2030a);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    f.a("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f2032c.put("playable_style", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 != null) {
                    return a2.c();
                }
                return null;
            }
        });
        this.f2032c.put("sendReward", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return null;
                }
                a2.p();
                return null;
            }
        });
        this.f2032c.put("webview_time_track", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                return null;
            }
        });
        this.f2032c.put("playable_event", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null || jSONObject == null) {
                    return null;
                }
                a2.b(jSONObject.optString("event", (String) null), jSONObject.optJSONObject(OutcomeEventsTable.COLUMN_NAME_PARAMS));
                return null;
            }
        });
        this.f2032c.put("reportAd", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return null;
                }
                a2.c(jSONObject);
                return null;
            }
        });
        this.f2032c.put("close", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return null;
                }
                a2.d(jSONObject);
                return null;
            }
        });
        this.f2032c.put("openAdLandPageLinks", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return null;
                }
                a2.e(jSONObject);
                return null;
            }
        });
        this.f2032c.put("get_viewport", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return null;
                }
                return a2.o();
            }
        });
        this.f2032c.put("jssdk_load_finish", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return null;
                }
                a2.s();
                return null;
            }
        });
        this.f2032c.put("material_render_result", new a() {
            public JSONObject a(JSONObject jSONObject) throws Throwable {
                g a2 = e.this.d();
                if (a2 == null) {
                    return null;
                }
                a2.b(jSONObject);
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    public g d() {
        WeakReference<g> weakReference = this.f2031b;
        if (weakReference == null) {
            return null;
        }
        return (g) weakReference.get();
    }

    /* access modifiers changed from: private */
    public a e() {
        g d2 = d();
        if (d2 == null) {
            return null;
        }
        return d2.l();
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        try {
            a aVar = this.f2032c.get(str);
            if (aVar == null) {
                return null;
            }
            return aVar.a(jSONObject);
        } catch (Throwable th) {
            f.a("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    public void b() {
        i.a(this.f2030a, this.f2033d);
        i.a(this.f2030a, this.f2034e);
    }
}

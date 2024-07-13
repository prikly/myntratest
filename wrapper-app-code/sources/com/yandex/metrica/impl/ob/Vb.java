package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.appnext.base.b.i;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.metrica.impl.ob.C0604oc;
import com.yandex.metrica.impl.ob.E;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

public class Vb {

    /* renamed from: a  reason: collision with root package name */
    private Context f5226a;

    public Vb(Context context) {
        this.f5226a = context;
    }

    public String a(Hc hc) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", hc.f4106a.a());
            jSONObject.put(i.fC, hc.c().getLatitude());
            jSONObject.put("lon", hc.c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(hc.c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(hc.e()));
            jSONObject.put("receive_elapsed_realtime_seconds", hc.d());
            jSONObject.putOpt("precision", hc.c().hasAccuracy() ? Float.valueOf(hc.c().getAccuracy()) : null);
            jSONObject.putOpt("direction", hc.c().hasBearing() ? Float.valueOf(hc.c().getBearing()) : null);
            jSONObject.putOpt("speed", hc.c().hasSpeed() ? Float.valueOf(hc.c().getSpeed()) : null);
            jSONObject.putOpt("altitude", hc.c().hasAltitude() ? Double.valueOf(hc.c().getAltitude()) : null);
            jSONObject.putOpt(IronSourceConstants.EVENTS_PROVIDER, C0267b.a(hc.c().getProvider(), (String) null));
            jSONObject.put("charge_type", hc.a().a());
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return Tl.b(this.f5226a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    public Hc b(long j, String str) {
        String str2;
        try {
            str2 = Tl.a(this.f5226a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                long optLong = jSONObject.optLong("receive_timestamp", 0);
                long optLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0);
                C0604oc.a a2 = C0604oc.a.a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString(IronSourceConstants.EVENTS_PROVIDER, (String) null));
                location.setLongitude(jSONObject.optDouble("lon", 0.0d));
                location.setLatitude(jSONObject.optDouble(i.fC, 0.0d));
                location.setTime(jSONObject.optLong("timestamp", 0));
                location.setAccuracy((float) jSONObject.optDouble("precision", 0.0d));
                location.setBearing((float) jSONObject.optDouble("direction", 0.0d));
                location.setSpeed((float) jSONObject.optDouble("speed", 0.0d));
                location.setAltitude(jSONObject.optDouble("altitude", 0.0d));
                return new Hc(a2, optLong, optLong2, location, E.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", RecyclerView.UNDEFINED_DURATION))), Long.valueOf(j));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public C0529lc a(long j, String str) {
        String str2;
        try {
            str2 = Tl.a(this.f5226a, str);
        } catch (UnsupportedEncodingException unused) {
            str2 = null;
        }
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            C0529lc lcVar = new C0529lc();
            try {
                lcVar.a(Long.valueOf(j));
                JSONObject jSONObject = new JSONObject(str2);
                lcVar.b(jSONObject.optLong("timestamp", 0));
                lcVar.a(jSONObject.optLong("elapsed_realtime_seconds", 0));
                lcVar.a(jSONObject.optJSONArray("cell_info"));
                lcVar.b(jSONObject.optJSONArray("wifi_info"));
                lcVar.a(E.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", RecyclerView.UNDEFINED_DURATION))));
                lcVar.a(C0604oc.a.a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return lcVar;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public String a(C0529lc lcVar) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", lcVar.d());
            jSONObject.put("elapsed_realtime_seconds", lcVar.c());
            jSONObject.putOpt("wifi_info", lcVar.g());
            jSONObject.putOpt("cell_info", lcVar.a());
            if (lcVar.b() != null) {
                jSONObject.put("charge_type", lcVar.b().a());
            }
            if (lcVar.e() != null) {
                jSONObject.put("collection_mode", lcVar.e().a());
            }
            str = jSONObject.toString();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            return Tl.b(this.f5226a, str);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }
}

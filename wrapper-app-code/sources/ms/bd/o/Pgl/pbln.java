package ms.bd.o.Pgl;

import android.content.Context;
import com.applovin.exoplayer2.common.base.Ascii;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class pbln extends pblm {

    /* renamed from: b  reason: collision with root package name */
    private SDKMonitor f9716b;

    class pgla implements SDKMonitor.IGetExtendParams {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f9717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9718b;

        pgla(pbln pbln, JSONObject jSONObject, String str) {
            this.f9717a = jSONObject;
            this.f9718b = str;
        }

        public Map<String, String> getCommonParams() {
            Object obj;
            HashMap hashMap = new HashMap();
            try {
                String str = (String) pblk.a(16777217, 0, 0, "733bae", new byte[]{41, 39, 69, 4, 77, 119, 53});
                if (this.f9717a.getBoolean((String) pblk.a(16777217, 0, 0, "cf939d", new byte[]{125, 114, 79, 85, Ascii.NAK, 118, 97}))) {
                    obj = pblk.a(16777217, 0, 0, "803313", new byte[]{120});
                } else {
                    obj = pblk.a(16777217, 0, 0, "b1407d", new byte[]{35});
                }
                hashMap.put(str, (String) obj);
            } catch (JSONException unused) {
                String str2 = (String) pblk.a(16777217, 0, 0, "41424e", new byte[]{54, 54, 74, 121, Ascii.FF, 97});
            }
            hashMap.put((String) pblk.a(16777217, 0, 0, "263efa", new byte[]{43, 59, 83, 5, 102, 119, 56, 19}), this.f9718b);
            return hashMap;
        }

        public String getSessionId() {
            return null;
        }
    }

    public void a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        SDKMonitor sDKMonitor = this.f9716b;
        if (sDKMonitor != null) {
            sDKMonitor.monitorApiError(j, j2, str, str2, str3, i, (JSONObject) null);
        }
    }

    public void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (this.f9716b != null) {
            if (jSONObject.length() > 0 || jSONObject2.length() > 0) {
                this.f9716b.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
            }
        }
    }

    public boolean a(String str) {
        JSONObject jSONObject;
        String str2;
        String str3;
        Context b2 = pgla.a().b();
        String str4 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            String str5 = (String) pblk.a(16777217, 0, 0, "b1d526", new byte[]{96, 54, Ascii.SUB});
            jSONObject = null;
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            str2 = jSONObject.getString((String) pblk.a(16777217, 0, 0, "3f2e27", new byte[]{49, 96, 74, 46, Ascii.FF, 41, 52}));
            try {
                str4 = jSONObject.getString((String) pblk.a(16777217, 0, 0, "a19598", new byte[]{120, 60, 89, 85, 57, 46, 107, Ascii.DC4}));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray((String) pblk.a(16777217, 0, 0, "46cfcc", new byte[]{38, 59, Ascii.RS, Ascii.DC4, 85, 115, 2, 37, Ascii.RS, 37}));
                JSONArray jSONArray2 = jSONObject.getJSONArray((String) pblk.a(16777217, 0, 0, "460ac7", new byte[]{55, 49, 83, Ascii.SUB, 78, 52, 2, 37, 77, 34}));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList2.add(jSONArray2.getString(i2));
                }
                if (arrayList.size() <= 0 || arrayList2.size() <= 0) {
                    return false;
                }
                SDKMonitorUtils.setConfigUrl(str2, arrayList);
                SDKMonitorUtils.setDefaultReportUrl(str2, arrayList2);
                jSONObject.remove((String) pblk.a(16777217, 0, 0, "15de5d", new byte[]{35, 56, Ascii.EM, Ascii.ETB, 3, 116, 7, 38, Ascii.EM, 38}));
                jSONObject.remove((String) pblk.a(16777217, 0, 0, "961db1", new byte[]{58, 49, 82, Ascii.US, 79, 50, Ascii.SI, 37, 76, 39}));
                SDKMonitorUtils.initMonitor(b2, str2, jSONObject, new pgla(this, jSONObject, str4));
                this.f9716b = SDKMonitorUtils.getInstance(str2);
                return true;
            } catch (JSONException unused2) {
                str3 = str4;
                str4 = str2;
                String str6 = (String) pblk.a(16777217, 0, 0, "fb349b", new byte[]{100, 101, 77, Ascii.DEL, Ascii.SI});
                str2 = str4;
                str4 = str3;
                jSONObject.remove((String) pblk.a(16777217, 0, 0, "15de5d", new byte[]{35, 56, Ascii.EM, Ascii.ETB, 3, 116, 7, 38, Ascii.EM, 38}));
                jSONObject.remove((String) pblk.a(16777217, 0, 0, "961db1", new byte[]{58, 49, 82, Ascii.US, 79, 50, Ascii.SI, 37, 76, 39}));
                SDKMonitorUtils.initMonitor(b2, str2, jSONObject, new pgla(this, jSONObject, str4));
                this.f9716b = SDKMonitorUtils.getInstance(str2);
                return true;
            }
        } catch (JSONException unused3) {
            str3 = null;
            String str62 = (String) pblk.a(16777217, 0, 0, "fb349b", new byte[]{100, 101, 77, Ascii.DEL, Ascii.SI});
            str2 = str4;
            str4 = str3;
            jSONObject.remove((String) pblk.a(16777217, 0, 0, "15de5d", new byte[]{35, 56, Ascii.EM, Ascii.ETB, 3, 116, 7, 38, Ascii.EM, 38}));
            jSONObject.remove((String) pblk.a(16777217, 0, 0, "961db1", new byte[]{58, 49, 82, Ascii.US, 79, 50, Ascii.SI, 37, 76, 39}));
            SDKMonitorUtils.initMonitor(b2, str2, jSONObject, new pgla(this, jSONObject, str4));
            this.f9716b = SDKMonitorUtils.getInstance(str2);
            return true;
        }
    }

    public void b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        SDKMonitor sDKMonitor = this.f9716b;
        if (sDKMonitor != null) {
            sDKMonitor.monitorSLA(j, j2, str, str2, str3, i, (JSONObject) null);
        }
    }
}

package com.applovin.impl.mediation.b;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.h;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14580a;

    /* renamed from: e  reason: collision with root package name */
    private final String f14581e;

    /* renamed from: f  reason: collision with root package name */
    private final f f14582f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, String> f14583g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, String> f14584h;
    private final MaxError i;

    public d(String str, Map<String, String> map, MaxError maxError, f fVar, n nVar) {
        super("TaskFireMediationPostbacks", nVar);
        this.f14580a = str;
        this.f14581e = str + "_urls";
        this.f14583g = Utils.toUrlSafeMap(map, nVar);
        this.i = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f14582f = fVar;
        Map<String, String> map2 = CollectionUtils.map(7);
        map2.put("AppLovin-Event-Type", str);
        map2.put("AppLovin-Ad-Network-Name", fVar.S());
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) fVar;
            map2.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            map2.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            map2.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.p());
        }
        if (maxError != null) {
            map2.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            map2.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f14584h = map2;
    }

    private String a(String str, MaxError maxError) {
        int i2;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i2 = maxAdapterError.getMediatedNetworkErrorCode();
            str2 = maxAdapterError.getMediatedNetworkErrorMessage();
        } else {
            i2 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUriString(maxError.getMessage(), d())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i2)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUriString(str2, d()));
    }

    private Map<String, String> a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f15418b.a(com.applovin.impl.sdk.c.a.i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private void a(String str, Map<String, Object> map) {
        d().X().a(h.o().c(str).b("POST").b(this.f14584h).a(false).c(map).b(((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.a.Y)).booleanValue()).a());
    }

    private String b(String str, Map<String, String> map) {
        for (String next : map.keySet()) {
            str = str.replace(next, StringUtils.emptyIfNull(map.get(next)));
        }
        return str;
    }

    public void run() {
        List<String> g2 = this.f14582f.g(this.f14581e);
        Map<String, String> a2 = a();
        for (String b2 : g2) {
            Uri parse = Uri.parse(a(b(b2, this.f14583g), this.i));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            Map map = CollectionUtils.map(a2.size());
            for (String next : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(next);
                if (a2.containsKey(queryParameter)) {
                    map.put(next, this.f14582f.h(a2.get(queryParameter)));
                } else {
                    clearQuery.appendQueryParameter(next, queryParameter);
                }
            }
            a(clearQuery.build().toString(), (Map<String, Object>) map);
        }
    }
}

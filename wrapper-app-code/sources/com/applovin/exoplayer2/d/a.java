package com.applovin.exoplayer2.d;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class a {
    private static String a(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static byte[] a(byte[] bArr) {
        return ai.f13525a >= 27 ? bArr : ai.c(a(ai.a(bArr)));
    }

    private static String b(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] b(byte[] bArr) {
        if (ai.f13525a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(ai.a(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return ai.c(sb.toString());
        } catch (JSONException e2) {
            q.c("ClearKeyUtil", "Failed to adjust response data: " + ai.a(bArr), e2);
            return bArr;
        }
    }
}

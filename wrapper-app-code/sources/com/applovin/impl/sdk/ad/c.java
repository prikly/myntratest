package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final n f15246a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15247b;

    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f15252d;

        private a(String str) {
            this.f15252d = str;
        }

        public String toString() {
            return this.f15252d;
        }
    }

    public c(String str, n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        } else if (nVar != null) {
            this.f15247b = str;
            this.f15246a = nVar;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    private String a(b<String> bVar) {
        for (String next : this.f15246a.b(bVar)) {
            if (this.f15247b.startsWith(next)) {
                return next;
            }
        }
        return null;
    }

    public String a() {
        return this.f15247b;
    }

    public a b() {
        return a(b.bj) != null ? a.REGULAR : a(b.bk) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String c() {
        String a2 = a(b.bj);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = a(b.bk);
        if (!TextUtils.isEmpty(a3)) {
            return a3;
        }
        return null;
    }

    public JSONObject d() {
        if (b() != a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f15247b.substring(c().length()), 0), "UTF-8"));
                this.f15246a.D();
                if (v.a()) {
                    v D = this.f15246a.D();
                    D.b("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e2) {
                this.f15246a.D();
                if (!v.a()) {
                    return null;
                }
                v D2 = this.f15246a.D();
                D2.b("AdToken", "Unable to decode token '" + this.f15247b + "' into JSON", e2);
                return null;
            }
        } catch (UnsupportedEncodingException e3) {
            this.f15246a.D();
            if (!v.a()) {
                return null;
            }
            v D3 = this.f15246a.D();
            D3.b("AdToken", "Unable to process ad response from token '" + this.f15247b + "'", e3);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        String str = this.f15247b;
        String str2 = ((c) obj).f15247b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f15247b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.f15247b);
        return "AdToken{id=" + prefixToIndex + ", type=" + b() + '}';
    }
}

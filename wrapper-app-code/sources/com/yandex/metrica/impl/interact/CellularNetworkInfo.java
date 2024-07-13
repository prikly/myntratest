package com.yandex.metrica.impl.interact;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C0263ak;
import com.yandex.metrica.impl.ob.C0755uj;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.Xj;
import com.yandex.metrica.impl.ob.Zj;
import java.util.HashMap;
import java.util.Map;

public class CellularNetworkInfo {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f3671a = "";

    class a implements C0263ak {
        a() {
        }

        public void a(Zj zj) {
            C0755uj b2 = zj.b();
            if (b2 != null) {
                String m = b2.m();
                String n = b2.n();
                Integer l = b2.l();
                Integer k = b2.k();
                Integer b3 = b2.b();
                Integer e2 = b2.e();
                Integer p = b2.p();
                HashMap hashMap = new HashMap();
                hashMap.put("network_type", m);
                hashMap.put("operator_name", n);
                String str = null;
                hashMap.put("country_code", k != null ? String.valueOf(k) : null);
                hashMap.put("operator_id", l != null ? String.valueOf(l) : null);
                hashMap.put("cell_id", b3 != null ? String.valueOf(b3) : null);
                hashMap.put("lac", e2 != null ? String.valueOf(e2) : null);
                if (p != null) {
                    str = String.valueOf(p);
                }
                hashMap.put("signal_strength", str);
                StringBuilder sb = new StringBuilder();
                String str2 = "";
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append(str2);
                        sb.append((String) entry.getKey());
                        sb.append("=");
                        sb.append(str3);
                        str2 = "&";
                    }
                }
                String unused = CellularNetworkInfo.this.f3671a = sb.toString();
            }
        }
    }

    public CellularNetworkInfo(Context context) {
        new Xj(context, P.g().d().b()).a((C0263ak) new a());
    }

    public String getCelluralInfo() {
        return this.f3671a;
    }
}

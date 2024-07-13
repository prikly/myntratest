package com.yandex.metrica.impl.ob;

import org.json.JSONException;
import org.json.JSONObject;

public class Hi {
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(76:8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|(1:82)(1:83)|84|86)(1:88)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a A[Catch:{ all -> 0x0161 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.yandex.metrica.impl.ob.Ui r5, com.yandex.metrica.impl.ob.Tl.a r6) {
        /*
            r4 = this;
            com.yandex.metrica.impl.ob.If$i r0 = new com.yandex.metrica.impl.ob.If$i
            r0.<init>()
            java.lang.String r1 = "features"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0161 }
            r2.<init>()     // Catch:{ all -> 0x0161 }
            java.lang.Object r2 = r6.get(r1)     // Catch:{ all -> 0x0010 }
        L_0x0010:
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ all -> 0x0161 }
            java.lang.String r6 = "list"
            org.json.JSONObject r6 = r2.optJSONObject(r6)     // Catch:{ all -> 0x0161 }
            if (r6 == 0) goto L_0x0161
            com.yandex.metrica.impl.ob.Sh$a r1 = new com.yandex.metrica.impl.ob.Sh$a     // Catch:{ all -> 0x0161 }
            r1.<init>()     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "easy_collecting"
            boolean r3 = r0.f4171a     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.d((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "egress"
            boolean r3 = r0.w     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.e((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "package_info"
            boolean r3 = r0.f4172b     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.m((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "permissions_collecting"
            boolean r3 = r0.f4173c     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.n((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "features_collecting"
            boolean r3 = r0.f4174d     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.f((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "sdk_list"
            boolean r3 = r0.j     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.o((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "google_aid"
            boolean r3 = r0.f4175e     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.g((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "throttling"
            boolean r3 = r0.r     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.q((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "wifi_around"
            boolean r3 = r0.f4176f     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.v((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "wifi_connected"
            boolean r3 = r0.f4177g     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.w((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "cells_around"
            boolean r3 = r0.f4178h     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.c((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "sim_info"
            boolean r3 = r0.i     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.p((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "identity_light_collecting"
            boolean r3 = r0.k     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.j((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "location_collecting"
            boolean r3 = r0.l     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.l((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "lbs_collecting"
            boolean r3 = r0.m     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.k((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "gpl_collecting"
            boolean r3 = r0.n     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.h((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_parsing"
            boolean r3 = r0.o     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.t((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_event_sending"
            boolean r3 = r0.p     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.s((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_raw_event_sending"
            boolean r3 = r0.p     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.u((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "ui_collecting_for_bridge"
            boolean r3 = r0.q     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.r((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "cell_additional_info"
            boolean r3 = r0.s     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.a((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "cell_additional_info_connected_only"
            boolean r3 = r0.t     // Catch:{ all -> 0x0161 }
            boolean r2 = r4.a(r6, r2, r3)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r1 = r1.b((boolean) r2)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "huawei_oaid"
            boolean r0 = r0.v     // Catch:{ all -> 0x0161 }
            boolean r0 = r4.a(r6, r2, r0)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh$a r0 = r1.i((boolean) r0)     // Catch:{ all -> 0x0161 }
            java.lang.String r1 = "ssl_pinning"
            boolean r2 = r6.has(r1)     // Catch:{ all -> 0x0161 }
            if (r2 == 0) goto L_0x014a
            org.json.JSONObject r1 = r6.getJSONObject(r1)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "enabled"
            boolean r1 = r1.getBoolean(r2)     // Catch:{ all -> 0x0161 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0161 }
            goto L_0x014b
        L_0x014a:
            r1 = 0
        L_0x014b:
            com.yandex.metrica.impl.ob.Sh$a r0 = r0.a((java.lang.Boolean) r1)     // Catch:{ all -> 0x0161 }
            com.yandex.metrica.impl.ob.Sh r1 = new com.yandex.metrica.impl.ob.Sh     // Catch:{ all -> 0x0161 }
            r1.<init>(r0)     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = "socket"
            r2 = 0
            boolean r6 = r4.a(r6, r0, r2)     // Catch:{ all -> 0x0161 }
            r5.a((boolean) r6)     // Catch:{ all -> 0x0161 }
            r5.a((com.yandex.metrica.impl.ob.Sh) r1)     // Catch:{ all -> 0x0161 }
        L_0x0161:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Hi.a(com.yandex.metrica.impl.ob.Ui, com.yandex.metrica.impl.ob.Tl$a):void");
    }

    private boolean a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        Boolean valueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null;
        Boolean valueOf2 = Boolean.valueOf(z);
        if (valueOf == null) {
            valueOf = valueOf2;
        }
        return valueOf.booleanValue();
    }
}

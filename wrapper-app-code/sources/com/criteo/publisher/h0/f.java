package com.criteo.publisher.h0;

import com.criteo.publisher.i0.a;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.s;
import java.util.Map;

/* compiled from: OtherAdServersHeaderBidding */
public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final g f2536a = h.b(getClass());

    public boolean b(Object obj) {
        return obj instanceof Map;
    }

    public a a() {
        return a.CUSTOM_APP_BIDDING;
    }

    public void a(Object obj) {
        if (b(obj)) {
            Map map = (Map) obj;
            map.remove("crt_cpm");
            map.remove("crt_displayUrl");
            map.remove("crt_size");
        }
    }

    public void a(Object obj, com.criteo.publisher.n0.a aVar, s sVar) {
        if (b(obj)) {
            Map map = (Map) obj;
            map.put("crt_displayUrl", sVar.d());
            map.put("crt_cpm", sVar.a());
            String str = "crt_displayUrl=" + sVar.d() + "," + "crt_cpm" + "=" + sVar.a();
            if (aVar == com.criteo.publisher.n0.a.CRITEO_BANNER) {
                String str2 = sVar.k() + "x" + sVar.e();
                map.put("crt_size", str2);
                str = str + "," + "crt_size" + "=" + str2;
            }
            this.f2536a.a(a.a(a(), str));
        }
    }
}

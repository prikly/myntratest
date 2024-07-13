package com.bykv.vk.openvk.component.video.a.b.e;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.b;
import com.bykv.vk.openvk.component.video.api.f.c;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;
import java.util.Map;

/* compiled from: NetworkSoureVolleyImpl */
public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private i f18026a;

    public d() {
        this.f18026a = null;
        this.f18026a = b.e();
    }

    public a a(e eVar) throws IOException {
        k.a aVar = new k.a();
        try {
            if (eVar.f18031e != null) {
                for (Map.Entry next : eVar.f18031e.entrySet()) {
                    String str = (String) next.getKey();
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = (String) next.getValue();
                        if (str2 == null) {
                            str2 = "";
                        }
                        aVar.b(str, str2);
                    }
                }
            }
            m a2 = this.f18026a.a(aVar.a(eVar.f18028b).a().b()).a();
            c.b("NetworkSoureVolleyImpl", "response code = ", Integer.valueOf(a2.c()));
            return new f(a2, eVar);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}

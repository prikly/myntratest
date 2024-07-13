package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.h.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SecSdkHelper */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.core.h.a f1535a;

    /* renamed from: b  reason: collision with root package name */
    private String f1536b;

    /* compiled from: SecSdkHelper */
    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final r f1537a = new r();
    }

    private r() {
        this.f1536b = null;
        f1535a = new b();
    }

    public void a(String str) {
        com.bytedance.sdk.openadsdk.core.h.a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f1535a) != null) {
            aVar.a(str);
        }
    }

    public static r a() {
        return a.f1537a;
    }

    public void b(String str) {
        com.bytedance.sdk.openadsdk.core.h.a aVar = f1535a;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    public String b() {
        try {
            l.c("mssdk", "进入getSha1");
            if (!TextUtils.isEmpty(this.f1536b)) {
                l.c("mssdk", "sha1 内存 getSha1 " + this.f1536b);
                return this.f1536b;
            }
            String a2 = h.a("sdk_app_sha1", 2592000000L);
            this.f1536b = a2;
            if (!TextUtils.isEmpty(a2)) {
                l.c("mssdk", "sha1 return sha1: " + this.f1536b);
                return this.f1536b;
            }
            if (f1535a != null) {
                this.f1536b = f1535a.b();
                l.c("mssdk", "sha1: mssdk:  " + this.f1536b);
            }
            if (c(this.f1536b)) {
                String upperCase = this.f1536b.toUpperCase();
                this.f1536b = upperCase;
                h.a("sdk_app_sha1", upperCase);
                return this.f1536b;
            }
            String a3 = c.a(m.a());
            this.f1536b = a3;
            if (!c(a3)) {
                return "";
            }
            String upperCase2 = this.f1536b.toUpperCase();
            this.f1536b = upperCase2;
            h.a("sdk_app_sha1", upperCase2);
            return this.f1536b;
        } catch (Exception unused) {
            return "";
        }
    }

    private boolean c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 20) {
            return false;
        }
        for (String equals : split) {
            if (!"00".equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public String c() {
        com.bytedance.sdk.openadsdk.core.h.a aVar = f1535a;
        if (aVar == null) {
            return "";
        }
        String a2 = aVar.a();
        l.c("mssdk", "sec_did: " + a2);
        return a2 != null ? a2 : "";
    }

    public Map<String, String> a(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.h.a aVar = f1535a;
        if (aVar != null) {
            return aVar.a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", bArr);
        }
        return new HashMap();
    }
}

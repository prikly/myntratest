package com.bytedance.sdk.openadsdk.core.j.c;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.j.a.a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: VastMacroHelper */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f1338a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<b, String> f1339b;

    public c(List<String> list) {
        this.f1338a = list;
        HashMap hashMap = new HashMap();
        this.f1339b = hashMap;
        hashMap.put(b.CACHEBUSTING, b());
    }

    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f1338a) {
            if (!TextUtils.isEmpty(next)) {
                for (b bVar : b.values()) {
                    String str = this.f1339b.get(bVar);
                    if (str == null) {
                        str = "";
                    }
                    next = next.replaceAll("\\[" + bVar.name() + "\\]", str);
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public c a(a aVar) {
        if (aVar != null) {
            this.f1339b.put(b.ERRORCODE, aVar.a());
        }
        return this;
    }

    public c a(long j) {
        if (j >= 0) {
            String b2 = b(j);
            if (!TextUtils.isEmpty(b2)) {
                this.f1339b.put(b.CONTENTPLAYHEAD, b2);
            }
        }
        return this;
    }

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.f1339b.put(b.ASSETURI, str);
        }
        return this;
    }

    private String b() {
        return String.format(Locale.US, "%08d", new Object[]{Long.valueOf(Math.round(Math.random() * 1.0E8d))});
    }

    private String b(long j) {
        return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(j % 1000)});
    }
}

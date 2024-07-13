package com.bytedance.sdk.component.e.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: NetExecutor */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f19138a;

    /* renamed from: c  reason: collision with root package name */
    protected i f19139c;

    /* renamed from: d  reason: collision with root package name */
    protected String f19140d = null;

    /* renamed from: e  reason: collision with root package name */
    protected final Map<String, String> f19141e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    protected String f19142f = null;

    public c(i iVar) {
        this.f19139c = iVar;
        b(UUID.randomUUID().toString());
    }

    /* access modifiers changed from: protected */
    public void a(k.a aVar) {
        if (aVar != null && this.f19141e.size() > 0) {
            for (Map.Entry next : this.f19141e.entrySet()) {
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
    }

    public void a(String str) {
        this.f19142f = str;
    }

    public String b() {
        return this.f19140d;
    }

    public void b(String str) {
        this.f19140d = str;
    }

    public void b(String str, String str2) {
        this.f19141e.put(str, str2);
    }

    public Map<String, Object> c() {
        return this.f19138a;
    }

    public void d(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                this.f19141e.put(next.getKey(), next.getValue());
            }
        }
    }

    public void e(Map<String, Object> map) {
        this.f19138a = map;
    }
}

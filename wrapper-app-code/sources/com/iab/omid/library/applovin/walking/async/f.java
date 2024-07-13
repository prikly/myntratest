package com.iab.omid.library.applovin.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b.C0072b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    private void b(String str) {
        c c2 = c.c();
        if (c2 != null) {
            for (a next : c2.b()) {
                if (this.f7732c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().b(str, this.f7734e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.applovin.utils.c.h(this.f7733d, this.f7736b.a())) {
            return null;
        }
        this.f7736b.a(this.f7733d);
        return this.f7733d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}

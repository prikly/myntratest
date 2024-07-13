package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public class e extends a {
    public e(b.C0072b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    private void b(String str) {
        c c2 = c.c();
        if (c2 != null) {
            for (a next : c2.b()) {
                if (this.f7732c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().a(str, this.f7734e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f7733d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}

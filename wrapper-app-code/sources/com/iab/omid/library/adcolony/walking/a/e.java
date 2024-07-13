package com.iab.omid.library.adcolony.walking.a;

import com.iab.omid.library.adcolony.b.a;
import com.iab.omid.library.adcolony.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public class e extends a {
    public e(b.C0066b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    private void b(String str) {
        a a2 = a.a();
        if (a2 != null) {
            for (com.iab.omid.library.adcolony.adsession.a next : a2.b()) {
                if (this.f7511a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().b(str, this.f7513c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f7512b.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}

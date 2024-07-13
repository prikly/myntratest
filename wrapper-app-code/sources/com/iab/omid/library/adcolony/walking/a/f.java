package com.iab.omid.library.adcolony.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.adcolony.b.a;
import com.iab.omid.library.adcolony.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b.C0066b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    private void b(String str) {
        a a2 = a.a();
        if (a2 != null) {
            for (com.iab.omid.library.adcolony.adsession.a next : a2.b()) {
                if (this.f7511a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().a(str, this.f7513c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.adcolony.d.b.b(this.f7512b, this.f7515d.b())) {
            return null;
        }
        this.f7515d.a(this.f7512b);
        return this.f7512b.toString();
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

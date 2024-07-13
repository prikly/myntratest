package com.iab.omid.library.amazon.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.amazon.b.a;
import com.iab.omid.library.amazon.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b.C0069b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    private void b(String str) {
        a a2 = a.a();
        if (a2 != null) {
            for (com.iab.omid.library.amazon.adsession.a next : a2.b()) {
                if (this.f7618a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().a(str, this.f7620c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.amazon.d.b.b(this.f7619b, this.f7622d.b())) {
            return null;
        }
        this.f7622d.a(this.f7619b);
        return this.f7619b.toString();
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

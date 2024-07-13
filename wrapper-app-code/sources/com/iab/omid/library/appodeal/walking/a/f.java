package com.iab.omid.library.appodeal.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.appodeal.b.a;
import com.iab.omid.library.appodeal.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b.C0075b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    private void b(String str) {
        a a2 = a.a();
        if (a2 != null) {
            for (com.iab.omid.library.appodeal.adsession.a next : a2.b()) {
                if (this.f7839a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().a(str, this.f7841c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.appodeal.d.b.b(this.f7840b, this.f7843d.b())) {
            return null;
        }
        this.f7843d.a(this.f7840b);
        return this.f7840b.toString();
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

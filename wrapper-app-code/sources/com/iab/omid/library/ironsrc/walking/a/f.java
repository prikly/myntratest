package com.iab.omid.library.ironsrc.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.ironsrc.b.a;
import com.iab.omid.library.ironsrc.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

public class f extends a {
    public f(b.C0078b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    private void b(String str) {
        a a2 = a.a();
        if (a2 != null) {
            for (com.iab.omid.library.ironsrc.adsession.a next : a2.b()) {
                if (this.f7947a.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().a(str, this.f7949c);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.ironsrc.d.b.b(this.f7948b, this.f7951d.b())) {
            return null;
        }
        this.f7951d.a(this.f7948b);
        return this.f7948b.toString();
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

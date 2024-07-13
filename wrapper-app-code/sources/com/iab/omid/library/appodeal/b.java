package com.iab.omid.library.appodeal;

import android.content.Context;
import com.iab.omid.library.appodeal.b.d;
import com.iab.omid.library.appodeal.b.f;
import com.iab.omid.library.appodeal.d.e;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f7765a;

    private void b(Context context) {
        e.a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return "1.3.15-Appodeal";
    }

    /* access modifiers changed from: package-private */
    public void a(Context context) {
        b(context);
        if (!b()) {
            a(true);
            f.a().a(context);
            com.iab.omid.library.appodeal.b.b.a().a(context);
            com.iab.omid.library.appodeal.d.b.a(context);
            d.a().a(context);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f7765a = z;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f7765a;
    }
}

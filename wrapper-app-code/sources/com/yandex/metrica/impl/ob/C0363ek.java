package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.ek  reason: case insensitive filesystem */
class C0363ek implements Ok {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f5766a;

    C0363ek(Context context) {
        this(context, new C0565mn());
    }

    public Bundle a(Activity activity) {
        return this.f5766a;
    }

    C0363ek(Context context, C0565mn mnVar) {
        ApplicationInfo a2 = mnVar.a(context, context.getPackageName(), 128);
        if (a2 != null) {
            this.f5766a = a2.metaData;
        } else {
            this.f5766a = null;
        }
    }
}

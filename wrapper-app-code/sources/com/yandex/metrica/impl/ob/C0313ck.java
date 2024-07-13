package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.ck  reason: case insensitive filesystem */
class C0313ck implements Ok {

    /* renamed from: a  reason: collision with root package name */
    private final C0565mn f5642a;

    C0313ck() {
        this(new C0565mn());
    }

    public Bundle a(Activity activity) {
        ActivityInfo activityInfo;
        C0565mn mnVar = this.f5642a;
        ComponentName componentName = activity.getComponentName();
        mnVar.getClass();
        try {
            activityInfo = activity.getPackageManager().getActivityInfo(componentName, 128);
        } catch (Throwable unused) {
            activityInfo = null;
        }
        if (activityInfo != null) {
            return activityInfo.metaData;
        }
        return null;
    }

    C0313ck(C0565mn mnVar) {
        this.f5642a = mnVar;
    }
}

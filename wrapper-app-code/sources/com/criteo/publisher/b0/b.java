package com.criteo.publisher.b0;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: Redirection */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2359a;

    public b(Context context) {
        this.f2359a = context;
    }

    public void a(String str, ComponentName componentName, c cVar) {
        Intent addFlags = new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456);
        if (this.f2359a.getPackageManager().queryIntentActivities(addFlags, 65536).size() > 0) {
            this.f2359a.startActivity(addFlags);
            cVar.b();
            if (componentName != null) {
                Application application = (Application) this.f2359a.getApplicationContext();
                application.registerActivityLifecycleCallbacks(new a(application, componentName, cVar));
            }
        }
    }

    /* compiled from: Redirection */
    private static class a extends com.criteo.publisher.a0.a {

        /* renamed from: a  reason: collision with root package name */
        private final Application f2360a;

        /* renamed from: b  reason: collision with root package name */
        private final ComponentName f2361b;

        /* renamed from: c  reason: collision with root package name */
        private c f2362c;

        public a(Application application, ComponentName componentName, c cVar) {
            this.f2360a = application;
            this.f2361b = componentName;
            this.f2362c = cVar;
        }

        public void onActivityResumed(Activity activity) {
            c cVar;
            if (this.f2361b.equals(activity.getComponentName()) && (cVar = this.f2362c) != null) {
                cVar.a();
                this.f2360a.unregisterActivityLifecycleCallbacks(this);
                this.f2362c = null;
            }
        }
    }
}

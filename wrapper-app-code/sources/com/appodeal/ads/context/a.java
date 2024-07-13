package com.appodeal.ads.context;

import android.app.Activity;

public interface a {

    /* renamed from: com.appodeal.ads.context.a$a  reason: collision with other inner class name */
    public static final class C0180a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f16325a;

        public C0180a(Activity activity) {
            this.f16325a = activity;
        }

        public final Activity getActivity() {
            return this.f16325a;
        }
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f16326a;

        public b(Activity activity) {
            this.f16326a = activity;
        }

        public final Activity getActivity() {
            return this.f16326a;
        }
    }

    Activity getActivity();
}

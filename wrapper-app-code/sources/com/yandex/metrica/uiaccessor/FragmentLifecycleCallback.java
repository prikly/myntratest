package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.metrica.uiaccessor.a;
import java.lang.ref.WeakReference;

public class FragmentLifecycleCallback extends FragmentManager.FragmentLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0058a f7390a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Activity> f7391b;

    public FragmentLifecycleCallback(a.C0058a aVar, Activity activity) {
        this.f7390a = aVar;
        this.f7391b = new WeakReference<>(activity);
    }

    public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        super.onFragmentAttached(fragmentManager, fragment, context);
        Activity activity = (Activity) this.f7391b.get();
        if (activity != null) {
            this.f7390a.fragmentAttached(activity);
        }
    }
}

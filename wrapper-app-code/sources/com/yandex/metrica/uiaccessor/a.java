package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C0058a f7392a;

    /* renamed from: b  reason: collision with root package name */
    private FragmentManager.FragmentLifecycleCallbacks f7393b;

    /* renamed from: com.yandex.metrica.uiaccessor.a$a  reason: collision with other inner class name */
    public interface C0058a {
        void fragmentAttached(Activity activity);
    }

    public a(C0058a aVar) throws Throwable {
        this.f7392a = aVar;
    }

    public void subscribe(Activity activity) throws Throwable {
        if (activity instanceof FragmentActivity) {
            if (this.f7393b == null) {
                this.f7393b = new FragmentLifecycleCallback(this.f7392a, activity);
            }
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.f7393b);
            supportFragmentManager.registerFragmentLifecycleCallbacks(this.f7393b, true);
        }
    }

    public void unsubscribe(Activity activity) throws Throwable {
        if ((activity instanceof FragmentActivity) && this.f7393b != null) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f7393b);
        }
    }
}

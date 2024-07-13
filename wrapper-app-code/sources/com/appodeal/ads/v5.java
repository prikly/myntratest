package com.appodeal.ads;

import android.animation.Animator;
import android.view.View;
import com.appodeal.ads.utils.Log;
import java.lang.ref.WeakReference;

public final class v5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f17613a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x5 f17614b;

    public v5(x5 x5Var, a6 a6Var) {
        this.f17614b = x5Var;
        this.f17613a = a6Var;
    }

    public final void run() {
        AdObjectType adobjecttype;
        UnifiedAdType unifiedadtype;
        try {
            x5 x5Var = this.f17614b;
            View view = x5Var.f17684c;
            if (view == null) {
                Log.debug(x5Var.f17682a, "UnRender", "skip: no current ad view");
                return;
            }
            x5<AdRequestType, AdObjectType>.c cVar = x5Var.i;
            if (cVar != null) {
                x5.m.removeCallbacks(cVar);
                this.f17614b.i = null;
            }
            z5 z5Var = (z5) this.f17613a.y;
            if (!(z5Var == null || (adobjecttype = z5Var.s) == null || (unifiedadtype = ((r5) adobjecttype).f16573f) == null)) {
                unifiedadtype.onHide();
            }
            view.setVisibility(8);
            WeakReference<Animator> weakReference = this.f17614b.f17689h;
            if (!(weakReference == null || weakReference.get() == null)) {
                weakReference.get().cancel();
            }
            this.f17614b.getClass();
            x5.a(view, true, true);
        } catch (Exception e2) {
            Log.log(e2);
        }
    }
}

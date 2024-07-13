package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.o;
import com.applovin.impl.sdk.n;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    private final n f10935a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f10936b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private a f10937c;

    /* renamed from: d  reason: collision with root package name */
    private o f10938d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, o oVar, n nVar) {
        this.f10938d = oVar;
        this.f10935a = nVar;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        o oVar = this.f10938d;
        if (oVar != null) {
            oVar.a();
            this.f10938d = null;
        }
        a aVar = this.f10937c;
        if (aVar != null) {
            aVar.h();
            this.f10937c.k();
            this.f10937c = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        a aVar = this.f10937c;
        if (aVar != null) {
            aVar.g();
            this.f10937c.e();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        a aVar;
        if (!this.f10936b.getAndSet(false) && (aVar = this.f10937c) != null) {
            aVar.f();
            this.f10937c.a(0);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        a aVar = this.f10937c;
        if (aVar != null) {
            aVar.j();
        }
    }

    public void setPresenter(a aVar) {
        this.f10937c = aVar;
    }
}

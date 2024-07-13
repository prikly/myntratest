package com.bytedance.sdk.openadsdk.component.reward.b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.a.c;
import com.bytedance.sdk.openadsdk.component.reward.view.d;
import com.bytedance.sdk.openadsdk.core.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: RewardFullAdType */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected Activity f672a;

    /* renamed from: b  reason: collision with root package name */
    protected n f673b;

    /* renamed from: c  reason: collision with root package name */
    protected int f674c;

    /* renamed from: d  reason: collision with root package name */
    protected int f675d;

    /* renamed from: e  reason: collision with root package name */
    protected int f676e;

    /* renamed from: f  reason: collision with root package name */
    protected float f677f;

    /* renamed from: g  reason: collision with root package name */
    protected String f678g;

    /* renamed from: h  reason: collision with root package name */
    protected e f679h;

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a$a  reason: collision with other inner class name */
    /* compiled from: RewardFullAdType */
    public interface C0003a {
        void a(boolean z);
    }

    public C0003a a() {
        return null;
    }

    public abstract void a(FrameLayout frameLayout);

    public abstract void a(c cVar, d dVar);

    public abstract boolean b();

    public abstract boolean c();

    public a(Activity activity, n nVar, int i, int i2) {
        this.f672a = activity;
        this.f673b = nVar;
        this.f674c = i;
        this.f675d = i2;
    }

    public final void a(int i) {
        this.f676e = i;
    }

    public final void a(float f2) {
        this.f677f = f2;
    }

    public final void a(String str) {
        this.f678g = str;
    }

    public final void a(e eVar) {
        this.f679h = eVar;
    }
}

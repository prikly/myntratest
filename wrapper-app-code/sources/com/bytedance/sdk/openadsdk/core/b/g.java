package com.bytedance.sdk.openadsdk.core.b;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.j.a;

/* compiled from: VastClickListenerWrapper */
public abstract class g extends c {

    /* renamed from: a  reason: collision with root package name */
    private final String f965a;

    /* renamed from: b  reason: collision with root package name */
    private final a f966b;

    /* renamed from: c  reason: collision with root package name */
    private c f967c;

    public abstract void a();

    public g(String str, a aVar) {
        this(str, aVar, (c) null);
    }

    public g(String str, a aVar, c cVar) {
        this.f965a = str;
        this.f966b = aVar;
        this.f967c = cVar;
    }

    public void a(c cVar) {
        this.f967c = cVar;
    }

    /* access modifiers changed from: protected */
    public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
        View view2 = view;
        a aVar = this.f966b;
        if (aVar != null) {
            aVar.e(this.f965a);
        }
        if (view2 != null) {
            if (view.getId() == t.e(view.getContext(), "tt_reward_ad_appname")) {
                view.setTag("VAST_TITLE");
            } else if (view.getId() == t.e(view.getContext(), "tt_reward_ad_description")) {
                view.setTag("VAST_DESCRIPTION");
            } else {
                view.setTag(this.f965a);
            }
        }
        c cVar = this.f967c;
        if (cVar != null) {
            cVar.w = this.w;
            this.f967c.x = this.x;
            this.f967c.y = this.y;
            this.f967c.z = this.y;
            this.f967c.A = this.y;
            this.f967c.a(view, f2, f3, f4, f5, sparseArray, z);
        }
        a();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}

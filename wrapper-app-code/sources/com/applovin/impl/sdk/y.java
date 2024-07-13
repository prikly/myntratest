package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.mediation.a.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.sdk.AppLovinSdkUtils;

public class y {

    /* renamed from: a  reason: collision with root package name */
    private final n f15969a;

    /* renamed from: b  reason: collision with root package name */
    private final v f15970b;

    /* renamed from: c  reason: collision with root package name */
    private final View f15971c;

    public y(View view, n nVar) {
        this.f15969a = nVar;
        this.f15970b = nVar.D();
        this.f15971c = view;
    }

    public long a(e eVar) {
        if (v.a()) {
            this.f15970b.b("ViewabilityTracker", "Checking visibility...");
        }
        long j = 0;
        if (!this.f15971c.isShown()) {
            if (v.a()) {
                this.f15970b.e("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f15971c.getAlpha() < eVar.J()) {
            if (v.a()) {
                this.f15970b.e("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f15971c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (v.a()) {
                this.f15970b.e("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f15971c.getParent() == null) {
            if (v.a()) {
                this.f15970b.e("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f15971c.getContext(), this.f15971c.getWidth());
        if (pxToDp < eVar.H()) {
            if (v.a()) {
                v vVar = this.f15970b;
                vVar.e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f15971c.getContext(), this.f15971c.getHeight());
        if (pxToDp2 < eVar.I()) {
            if (v.a()) {
                v vVar2 = this.f15970b;
                vVar2.e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Point a2 = h.a(this.f15971c.getContext());
        Rect rect = new Rect(0, 0, a2.x, a2.y);
        int[] iArr = {-1, -1};
        this.f15971c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.f15971c.getWidth(), iArr[1] + this.f15971c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (v.a()) {
                v vVar3 = this.f15970b;
                vVar3.e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity a3 = this.f15969a.ai().a();
        if (a3 != null && !Utils.isViewInTopActivity(this.f15971c, a3)) {
            if (v.a()) {
                this.f15970b.e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (v.a()) {
            v vVar4 = this.f15970b;
            vVar4.b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}

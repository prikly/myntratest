package com.appodeal.ads;

import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public final UnifiedAdCallbackClickTrackListener f17449a;

    public u1(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
        this.f17449a = unifiedAdCallbackClickTrackListener;
    }

    public static final void a(u1 u1Var) {
        Intrinsics.checkNotNullParameter(u1Var, "this$0");
        UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener = u1Var.f17449a;
        if (unifiedAdCallbackClickTrackListener != null) {
            unifiedAdCallbackClickTrackListener.onTrackError();
        }
    }

    public static final void a(u1 u1Var, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(u1Var, "this$0");
        UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener = u1Var.f17449a;
        if (unifiedAdCallbackClickTrackListener != null) {
            unifiedAdCallbackClickTrackListener.onTrackSuccess(jSONObject);
        }
    }

    public final void a() {
        h5.f16458a.post(new Runnable() {
            public final void run() {
                u1.a(u1.this);
            }
        });
    }

    public final void a(JSONObject jSONObject) {
        h5.f16458a.post(new Runnable(jSONObject) {
            public final /* synthetic */ JSONObject f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                u1.a(u1.this, this.f$1);
            }
        });
    }
}

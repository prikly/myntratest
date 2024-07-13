package com.bytedance.sdk.openadsdk.dislike;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.dislike.c;

/* compiled from: TTAdDislikeImpl */
public class b implements TTAdDislike {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1889a;

    /* renamed from: b  reason: collision with root package name */
    private n f1890b;

    /* renamed from: c  reason: collision with root package name */
    private c f1891c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public TTAdDislike.DislikeInteractionCallback f1892d;

    public b(Context context, n nVar) {
        if (!(context instanceof Activity)) {
            l.b("Dislike Initialization must use activity, please pass in TTAdManager.createAdNative(activity)");
        }
        this.f1889a = context;
        this.f1890b = nVar;
        a();
    }

    private void a() {
        c cVar = new c(this.f1889a, this.f1890b);
        this.f1891c = cVar;
        cVar.a((c.a) new c.a() {
            public void a() {
                l.b("TTAdDislikeImpl", "onDislikeShow: ");
            }

            public void a(int i, FilterWord filterWord) {
                try {
                    if (!filterWord.hasSecondOptions() && b.this.f1892d != null) {
                        b.this.f1892d.onSelected(i, filterWord.getName());
                    }
                    l.e("TTAdDislikeImpl", "onDislikeSelected: " + i + ", " + String.valueOf(filterWord.getName()));
                } catch (Throwable th) {
                    l.c("TTAdDislikeImpl", "dislike callback selected error: ", th);
                }
            }

            public void b() {
                l.e("TTAdDislikeImpl", "onDislikeDismiss: ");
                try {
                    if (b.this.f1892d != null) {
                        b.this.f1892d.onCancel();
                    }
                } catch (Throwable th) {
                    l.c("TTAdDislikeImpl", "dislike callback cancel error: ", th);
                }
            }

            public void c() {
                l.e("TTAdDislikeImpl", "onDislikeOptionBack: ");
            }
        });
    }

    public void showDislikeDialog() {
        Context context = this.f1889a;
        if (((context instanceof Activity) && !((Activity) context).isFinishing()) && !this.f1891c.isShowing()) {
            this.f1891c.show();
        }
    }

    public void a(n nVar) {
        this.f1891c.a(nVar);
    }

    public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
        this.f1892d = dislikeInteractionCallback;
    }

    public void a(String str) {
        c cVar = this.f1891c;
        if (cVar != null) {
            cVar.a(str);
        }
    }
}

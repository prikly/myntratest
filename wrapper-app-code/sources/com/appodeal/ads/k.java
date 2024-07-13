package com.appodeal.ads;

import com.appodeal.ads.context.b;
import com.appodeal.ads.l;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.n;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import org.json.JSONException;

public final class k implements NetworkInitializationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l.a f16497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f16498b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16499c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ContextProvider f16500d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f16501e;

    public k(l lVar, n.a aVar, r rVar, int i, b bVar) {
        this.f16501e = lVar;
        this.f16497a = aVar;
        this.f16498b = rVar;
        this.f16499c = i;
        this.f16500d = bVar;
    }

    /* access modifiers changed from: private */
    public void a(ContextProvider contextProvider, Object obj, l.a aVar, r rVar) {
        LoadingError loadingError;
        try {
            l lVar = this.f16501e;
            lVar.a(contextProvider, lVar.f16574g, obj, lVar.f16575h, lVar.f16573f);
        } catch (Throwable th) {
            o oVar = n.this.f16797a;
            oVar.getClass();
            Log.log(th);
            if (th instanceof JSONException) {
                loadingError = LoadingError.IncorrectAdunit;
            } else {
                loadingError = LoadingError.InternalError;
            }
            v vVar = (v) oVar;
            vVar.f17605f.f17433d.a(vVar.f17604e, vVar.f17603d, loadingError);
        }
    }

    public final void onInitializationFailed(LoadingError loadingError) {
        h5.f16458a.post(new Runnable(this.f16498b, loadingError) {
            public final /* synthetic */ r f$1;
            public final /* synthetic */ LoadingError f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ((n.a) l.a.this).a(this.f$2);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.appodeal.ads.-$$Lambda$hNZW9Cm-0R-P1uYA39rp72crKxA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializationFinished(java.lang.Object r9) {
        /*
            r8 = this;
            com.appodeal.ads.l r0 = r8.f16501e
            com.appodeal.ads.f5 r0 = r0.f16570c
            com.appodeal.ads.e0 r0 = r0.getRequestResult()
            if (r0 != 0) goto L_0x0047
            com.appodeal.ads.l r0 = r8.f16501e
            com.appodeal.ads.AdNetwork r1 = r0.f16569b
            com.appodeal.ads.unified.UnifiedAd r1 = r0.a((com.appodeal.ads.AdNetwork) r1)
            r0.f16573f = r1
            com.appodeal.ads.l r0 = r8.f16501e
            UnifiedAdType r1 = r0.f16573f
            if (r1 != 0) goto L_0x0024
            com.appodeal.ads.l$a r9 = r8.f16497a
            com.appodeal.ads.r r0 = r8.f16498b
            com.appodeal.ads.-$$Lambda$hNZW9Cm-0R-P1uYA39rp72crKxA r1 = new com.appodeal.ads.-$$Lambda$hNZW9Cm-0R-P1uYA39rp72crKxA
            r1.<init>(r0)
            goto L_0x0042
        L_0x0024:
            int r1 = r8.f16499c
            com.appodeal.ads.unified.UnifiedAdParams r1 = r0.a((int) r1)
            r0.f16574g = r1
            com.appodeal.ads.l r0 = r8.f16501e
            com.appodeal.ads.unified.UnifiedAdCallback r1 = r0.c()
            r0.f16575h = r1
            com.appodeal.ads.modules.common.internal.context.ContextProvider r4 = r8.f16500d
            com.appodeal.ads.l$a r6 = r8.f16497a
            com.appodeal.ads.r r7 = r8.f16498b
            com.appodeal.ads.-$$Lambda$k$IGDzlYiHrW42cqd6Y0LycZUCYbk r1 = new com.appodeal.ads.-$$Lambda$k$IGDzlYiHrW42cqd6Y0LycZUCYbk
            r2 = r1
            r3 = r8
            r5 = r9
            r2.<init>(r4, r5, r6, r7)
        L_0x0042:
            android.os.Handler r9 = com.appodeal.ads.h5.f16458a
            r9.post(r1)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.k.onInitializationFinished(java.lang.Object):void");
    }
}

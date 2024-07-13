package com.bytedance.sdk.component.a;

import android.webkit.WebView;
import com.bytedance.sdk.component.a.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsBridge2 */
public class r {

    /* renamed from: a  reason: collision with root package name */
    static w f18260a;

    /* renamed from: b  reason: collision with root package name */
    private final a f18261b;

    /* renamed from: c  reason: collision with root package name */
    private final WebView f18262c;

    /* renamed from: d  reason: collision with root package name */
    private final j f18263d;

    /* renamed from: e  reason: collision with root package name */
    private final List<n> f18264e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private o f18265f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f18266g = false;

    public static j a(WebView webView) {
        return new j(webView);
    }

    public r a(String str, e<?, ?> eVar) {
        return a(str, (String) null, eVar);
    }

    public r a(String str, String str2, e<?, ?> eVar) {
        b();
        this.f18261b.f18206g.a(str, eVar);
        o oVar = this.f18265f;
        if (oVar != null) {
            oVar.a(str);
        }
        return this;
    }

    public r a(String str, d.b bVar) {
        return a(str, (String) null, bVar);
    }

    public r a(String str, String str2, d.b bVar) {
        b();
        this.f18261b.f18206g.a(str, bVar);
        o oVar = this.f18265f;
        if (oVar != null) {
            oVar.a(str);
        }
        return this;
    }

    public void a() {
        if (!this.f18266g) {
            this.f18261b.b();
            this.f18266g = true;
            for (n next : this.f18264e) {
                if (next != null) {
                    next.a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = f18260a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    r(com.bytedance.sdk.component.a.j r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f18264e = r0
            r0 = 0
            r2.f18266g = r0
            r2.f18263d = r3
            boolean r0 = r3.f18243h
            if (r0 == 0) goto L_0x001e
            com.bytedance.sdk.component.a.w r0 = f18260a
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = r3.k
            com.bytedance.sdk.component.a.v r0 = r0.a((java.lang.String) r1)
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            android.webkit.WebView r1 = r3.f18236a
            if (r1 == 0) goto L_0x0034
            com.bytedance.sdk.component.a.a r1 = r3.f18237b
            if (r1 != 0) goto L_0x002f
            com.bytedance.sdk.component.a.z r1 = new com.bytedance.sdk.component.a.z
            r1.<init>()
            r2.f18261b = r1
            goto L_0x0038
        L_0x002f:
            com.bytedance.sdk.component.a.a r1 = r3.f18237b
            r2.f18261b = r1
            goto L_0x0038
        L_0x0034:
            com.bytedance.sdk.component.a.a r1 = r3.f18237b
            r2.f18261b = r1
        L_0x0038:
            com.bytedance.sdk.component.a.a r1 = r2.f18261b
            r1.a((com.bytedance.sdk.component.a.j) r3, (com.bytedance.sdk.component.a.v) r0)
            android.webkit.WebView r0 = r3.f18236a
            r2.f18262c = r0
            java.util.List<com.bytedance.sdk.component.a.n> r0 = r2.f18264e
            com.bytedance.sdk.component.a.n r1 = r3.j
            r0.add(r1)
            boolean r0 = r3.f18241f
            com.bytedance.sdk.component.a.i.a((boolean) r0)
            boolean r3 = r3.f18242g
            com.bytedance.sdk.component.a.y.a((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.a.r.<init>(com.bytedance.sdk.component.a.j):void");
    }

    private void b() {
        if (this.f18266g) {
            i.a((RuntimeException) new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }
}

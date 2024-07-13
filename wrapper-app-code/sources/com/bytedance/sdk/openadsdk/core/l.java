package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.e.c.a;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.i;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.u;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InteractionManager */
public class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f1358a;

    /* renamed from: b  reason: collision with root package name */
    private c f1359b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Context f1360c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TTNativeAd f1361d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<View> f1362e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f1363f = i.i1657027613257dc("el`f``bXim");

    /* renamed from: g  reason: collision with root package name */
    private TTNativeAd.AdInteractionListener f1364g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public long f1365h;
    /* access modifiers changed from: private */
    public Double i = null;
    /* access modifiers changed from: private */
    public j j = new j();

    public l(Context context, TTNativeAd tTNativeAd, n nVar, String str) {
        this.f1361d = tTNativeAd;
        this.f1358a = nVar;
        this.f1360c = context;
        this.f1363f = str;
        if (nVar.L() == 4) {
            this.f1359b = d.a(this.f1360c, this.f1358a, this.f1363f);
        }
    }

    private EmptyView a(ViewGroup viewGroup) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    static /* synthetic */ long c(l lVar) {
        long j2 = lVar.f1365h;
        while (true) {
            char c2 = ']';
            char c3 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c3) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c3 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c3) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c3 = '[';
                    }
                }
                c2 = '^';
                c3 = 'K';
            }
        }
        return j2;
    }

    public j a() {
        return this.j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        switch(r4) {
            case 55: goto L_0x0024;
            case 56: goto L_0x000c;
            case 57: goto L_0x0024;
            default: goto L_0x001a;
        };
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r3, int r4) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener r4 = r2.f1364g
            r0 = 95
            if (r4 == 0) goto L_0x000c
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = r2.f1361d
            r4.onAdCreativeClick(r3, r1)
            goto L_0x001f
        L_0x000c:
            r3 = 94
            r4 = 125(0x7d, float:1.75E-43)
        L_0x0010:
            switch(r3) {
                case 94: goto L_0x001b;
                case 95: goto L_0x0014;
                case 96: goto L_0x0017;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000c
        L_0x0014:
            switch(r4) {
                case 94: goto L_0x001f;
                case 95: goto L_0x000c;
                case 96: goto L_0x001f;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r4) {
                case 55: goto L_0x0024;
                case 56: goto L_0x000c;
                case 57: goto L_0x0024;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0024
        L_0x001b:
            r3 = 39
            if (r4 != r3) goto L_0x0024
        L_0x001f:
            r3 = 95
            r4 = 95
            goto L_0x0010
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.l.a(android.view.View, int):void");
    }

    public void a(final ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final TTNativeAd.AdInteractionListener adInteractionListener) {
        this.f1364g = adInteractionListener;
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                l.this.j.a(System.currentTimeMillis(), x.a(viewGroup));
            }
        });
        this.f1362e = list;
        e.a(this.f1358a);
        EmptyView a2 = a(viewGroup);
        if (a2 == null) {
            a2 = new EmptyView(this.f1360c, viewGroup);
            viewGroup.addView(a2);
        }
        a2.a();
        a2.setRefClickViews(list2);
        if (list != null) {
            for (View next : this.f1362e) {
                if (next != null) {
                    next.setTag(t.e(m.a(), a.a1657027613243dc("tu]j`ZotWcoibQyrfffp")), true);
                }
            }
            list3.addAll(list);
        }
        a2.setRefCreativeViews(list3);
        HashMap hashMap = new HashMap();
        hashMap.put(a.a1657027613243dc("cmk`oZudmgin"), 1);
        Context context = this.f1360c;
        n nVar = this.f1358a;
        String str = this.f1363f;
        b bVar = new b(context, nVar, str, u.a(str));
        bVar.a((View) viewGroup);
        bVar.b(view);
        bVar.a(this.f1359b);
        bVar.a(this.f1361d);
        bVar.a((Map<String, Object>) hashMap);
        bVar.a((b.a) new b.a() {
            public void a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdClicked(view, l.this.f1361d);
                }
            }
        });
        Context context2 = this.f1360c;
        n nVar2 = this.f1358a;
        String str2 = this.f1363f;
        com.bytedance.sdk.openadsdk.core.b.a aVar = new com.bytedance.sdk.openadsdk.core.b.a(context2, nVar2, str2, u.a(str2));
        aVar.a((View) viewGroup);
        aVar.b(view);
        aVar.a(this.f1359b);
        aVar.a(this.f1361d);
        aVar.a((Map<String, Object>) hashMap);
        aVar.a((b.a) new b.a() {
            public void a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdCreativeClick(view, l.this.f1361d);
                }
            }
        });
        a2.a(list2, bVar);
        a2.a(list3, aVar);
        a2.setCallback(new EmptyView.a() {
            public void a() {
                l.this.j.a(System.currentTimeMillis(), x.a(viewGroup));
            }

            @JProtect
            public void a(View view) {
                l.this.j.a(System.currentTimeMillis(), x.a(viewGroup));
                long unused = l.this.f1365h = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                if (l.this.f1362e != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (View view2 : l.this.f1362e) {
                        if (view2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("whfwl"), view2.getWidth());
                                jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("hdkdlq"), view2.getHeight());
                                jSONObject.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("amrke"), (double) view2.getAlpha());
                            } catch (Throwable unused2) {
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                    hashMap.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("ilcdaZpnm~"), jSONArray.toString());
                }
                if (viewGroup != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("whfwl"), viewGroup.getWidth());
                        jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("hdkdlq"), viewGroup.getHeight());
                        jSONObject2.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("amrke"), (double) viewGroup.getAlpha());
                    } catch (Throwable unused3) {
                    }
                    hashMap.put(com.bytedance.sdk.component.b.a.e.e1657027613270dc("rnmw[sob"), jSONObject2.toString());
                }
                e.a(l.this.f1360c, l.this.f1358a, l.this.f1363f, (Map<String, Object>) hashMap, l.this.i);
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdShow(l.this.f1361d);
                }
                if (l.this.f1358a.ai()) {
                    u.a(l.this.f1358a, view);
                }
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x007c A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0078 A[LOOP:0: B:6:0x0078->B:8:0x0078, LOOP_END, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0076 A[SYNTHETIC] */
            public void a(boolean r7) {
                /*
                    r6 = this;
                    if (r7 != 0) goto L_0x005a
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    long r0 = com.bytedance.sdk.openadsdk.core.l.c(r7)
                    r2 = 0
                    int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r7 <= 0) goto L_0x005a
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    long r0 = java.lang.System.currentTimeMillis()
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.l.this
                    long r4 = com.bytedance.sdk.openadsdk.core.l.c(r4)
                    long r0 = r0 - r4
                    r7.append(r0)
                    java.lang.String r0 = ""
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.b.j r0 = r0.j
                    long r4 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r1 = r9
                    float r1 = com.bytedance.sdk.openadsdk.core.x.a(r1)
                    r0.a(r4, r1)
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.core.e.n r0 = r0.f1358a
                    com.bytedance.sdk.openadsdk.core.l r1 = com.bytedance.sdk.openadsdk.core.l.this
                    java.lang.String r1 = r1.f1363f
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.b.j r4 = r4.j
                    com.bytedance.sdk.openadsdk.b.e.a((java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.e.n) r0, (java.lang.String) r1, (com.bytedance.sdk.openadsdk.b.j) r4)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    long unused = r7.f1365h = r2
                    r7 = 64
                    goto L_0x0078
                L_0x005a:
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    com.bytedance.sdk.openadsdk.b.j r7 = r7.j
                    long r0 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r2 = r9
                    float r2 = com.bytedance.sdk.openadsdk.core.x.a(r2)
                    r7.a(r0, r2)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.l.this
                    long r0 = java.lang.System.currentTimeMillis()
                    long unused = r7.f1365h = r0
                L_0x0076:
                    r7 = 66
                L_0x0078:
                    switch(r7) {
                        case 64: goto L_0x007c;
                        case 65: goto L_0x0076;
                        case 66: goto L_0x007c;
                        default: goto L_0x007b;
                    }
                L_0x007b:
                    goto L_0x0078
                L_0x007c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.l.AnonymousClass4.a(boolean):void");
            }

            public void b() {
                if (l.c(l.this) > 0) {
                    e.a((System.currentTimeMillis() - l.c(l.this)) + "", l.this.f1358a, l.this.f1363f, l.this.j);
                    long unused = l.this.f1365h = 0;
                }
            }
        });
        a2.setNeedCheckingShow(true);
    }

    public void a(Double d2) {
        this.i = d2;
    }
}

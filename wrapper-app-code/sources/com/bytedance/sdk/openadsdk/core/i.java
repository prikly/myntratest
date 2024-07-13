package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.nativeexpress.e;
import com.bytedance.sdk.openadsdk.core.nativeexpress.f;
import com.bytedance.sdk.openadsdk.utils.u;
import com.com.bytedance.overseas.sdk.a.c;
import com.com.bytedance.overseas.sdk.a.d;

/* compiled from: H5AdInteractionManager */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1225a;

    /* renamed from: b  reason: collision with root package name */
    private final n f1226b;

    /* renamed from: c  reason: collision with root package name */
    private c f1227c;

    /* renamed from: d  reason: collision with root package name */
    private f f1228d;

    /* renamed from: e  reason: collision with root package name */
    private e f1229e;

    /* renamed from: f  reason: collision with root package name */
    private View f1230f;

    /* renamed from: g  reason: collision with root package name */
    private String f1231g = "rewarded_video";

    public i(Context context, n nVar, View view) {
        this.f1226b = nVar;
        this.f1225a = context;
        this.f1230f = view;
        this.f1231g = u.b(u.e(nVar));
        if (this.f1226b.L() == 4) {
            this.f1227c = d.a(this.f1225a, this.f1226b, this.f1231g);
        }
        String str = this.f1231g;
        f fVar = new f(context, nVar, str, u.a(str));
        this.f1228d = fVar;
        fVar.a(this.f1230f);
        this.f1228d.a(this.f1227c);
        String str2 = this.f1231g;
        e eVar = new e(context, nVar, str2, u.a(str2));
        this.f1229e = eVar;
        eVar.a(this.f1230f);
        this.f1229e.a(this.f1227c);
    }

    public void a(int i, j jVar) {
        e eVar;
        if (i != -1 && jVar != null) {
            float f2 = jVar.f1082a;
            float f3 = jVar.f1083b;
            float f4 = jVar.f1084c;
            float f5 = jVar.f1085d;
            SparseArray<c.a> sparseArray = jVar.n;
            if (i == 1) {
                f fVar = this.f1228d;
                if (fVar != null) {
                    fVar.a(jVar);
                    this.f1228d.a(this.f1230f, f2, f3, f4, f5, sparseArray, true);
                }
            } else if (i == 2 && (eVar = this.f1229e) != null) {
                eVar.a(jVar);
                this.f1229e.a(this.f1230f, f2, f3, f4, f5, sparseArray, true);
            }
        }
    }
}

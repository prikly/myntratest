package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.b;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.utils.v;
import org.json.JSONObject;

/* compiled from: ExpressClickListener */
public class f extends b {
    public f(Context context, n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* access modifiers changed from: protected */
    public g a(float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, long j, long j2, View view, View view2, String str, float f6, int i, float f7, int i2, JSONObject jSONObject) {
        float f8;
        float f9;
        float f10;
        float f11;
        int i3;
        int i4;
        long j3;
        long j4;
        int i5;
        char c2;
        char c3;
        int i6;
        int[] a2 = v.a(view);
        if (a2 == null || a2.length != 2) {
            f11 = f2;
            f10 = f3;
            f9 = f4;
            f8 = f5;
            i4 = 0;
            i3 = 0;
        } else {
            i4 = a2[0];
            i3 = a2[1];
            if (this.r == 0) {
                float b2 = v.b(this.f939b, f2);
                float f12 = (float) i4;
                float b3 = v.b(this.f939b, f3);
                float f13 = (float) i3;
                f9 = (v.b(this.f939b, f4) + f12) - 0.5f;
                f8 = (v.b(this.f939b, f5) + f13) - 0.5f;
                f10 = (b3 + f13) - 0.5f;
                f11 = (b2 + f12) - 0.5f;
            } else {
                f11 = f2;
                f10 = f3;
                f9 = f4;
                f8 = f5;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (this.f940c != null) {
            j4 = this.f940c.f1086e;
            int i7 = i4;
            j3 = this.f940c.f1087f;
            if (this.r == 0) {
                iArr[0] = ((int) v.b(this.f939b, (float) this.f940c.f1088g)) + i7;
                iArr[1] = ((int) v.b(this.f939b, (float) this.f940c.f1089h)) + i3;
                i6 = (int) v.b(this.f939b, (float) this.f940c.i);
                i5 = (int) v.b(this.f939b, (float) this.f940c.j);
                c3 = 0;
                c2 = 1;
            } else {
                c3 = 0;
                iArr[0] = this.f940c.f1088g;
                c2 = 1;
                iArr[1] = this.f940c.f1089h;
                i6 = this.f940c.i;
                i5 = this.f940c.j;
            }
            iArr2[c3] = i6;
            iArr2[c2] = i5;
            if (i6 == 0 && i5 == 0 && view2 != null) {
                iArr = v.a(view2);
                iArr2 = v.c(view2);
            }
        } else {
            j4 = j;
            j3 = j2;
        }
        this.r = 0;
        return new g.a().f(f11).e(f10).d(f9).c(f8).b(j4).a(j3).b(a2).a(iArr).c(v.c(view)).d(iArr2).d(this.y).e(this.z).f(this.A).b(h.d().b() ? 1 : 2).a(sparseArray).a(str).a(i2).a(jSONObject).a();
    }

    public void a(j jVar) {
        this.f940c = jVar;
    }
}

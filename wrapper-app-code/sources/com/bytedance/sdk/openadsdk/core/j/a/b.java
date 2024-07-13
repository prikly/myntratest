package com.bytedance.sdk.openadsdk.core.j.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.List;
import org.json.JSONObject;

/* compiled from: VastXmlParser */
public abstract class b {

    /* renamed from: e  reason: collision with root package name */
    public static int f1289e;

    /* renamed from: a  reason: collision with root package name */
    protected int f1290a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f1291b;

    /* renamed from: c  reason: collision with root package name */
    protected int f1292c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    protected double f1293d = Double.MIN_VALUE;

    public b(Context context, int i, int i2) {
        if (i2 > 0 && i > 0) {
            this.f1293d = ((double) i) / ((double) i2);
        }
        float e2 = v.e(context);
        if (e2 != 0.0f) {
            this.f1292c = (int) (((float) i) / e2);
        }
        this.f1291b = context.getApplicationContext();
    }

    /* access modifiers changed from: protected */
    public void a(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", exc.getMessage());
            jSONObject.put("error_code", i);
            com.bytedance.sdk.openadsdk.h.b.a().a("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            if (Integer.parseInt(str) < 2) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public String a(String str, List<c> list) {
        String str2;
        int i = this.f1290a;
        if (i >= 5) {
            return null;
        }
        this.f1290a = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.e.b.b c2 = d.a().b().c();
            c2.a(str);
            com.bytedance.sdk.component.e.b a2 = c2.a();
            str2 = a2.d();
            try {
                a2.a();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = null;
            a(e, 0);
            if (!list.isEmpty()) {
                c.b(list, a.WRAPPER_TIMEOUT, -1, (String) null);
            }
            return str2;
        }
        return str2;
    }
}

package com.bytedance.sdk.openadsdk.i.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import java.util.Map;

/* compiled from: GifLoader */
public class a {

    /* compiled from: GifLoader */
    public interface b {
        void a();

        void a(int i, String str, Throwable th);

        void a(String str, b bVar);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    public void a(com.bytedance.sdk.openadsdk.i.a aVar, b bVar, int i, int i2, String str) {
        a(aVar, bVar, i, i2, ImageView.ScaleType.CENTER_INSIDE, str);
    }

    public void a(com.bytedance.sdk.openadsdk.i.a aVar, final b bVar, int i, int i2, ImageView.ScaleType scaleType, String str) {
        com.bytedance.sdk.openadsdk.d.a.a(aVar.f1998a).a(aVar.f1999b).a(i).b(i2).b(str).a(Bitmap.Config.RGB_565).a(scaleType).a(!TextUtils.isEmpty(str)).a((n) new n() {
            public void a(j jVar) {
                a.this.a(jVar, bVar);
            }

            public void a(int i, String str, Throwable th) {
                a.this.a(i, str, th, bVar);
            }
        });
        a();
    }

    /* access modifiers changed from: protected */
    public void a(j jVar, b bVar) {
        if (bVar != null) {
            Object b2 = jVar.b();
            int a2 = a(jVar);
            if (b2 instanceof byte[]) {
                bVar.a(jVar.a(), new b((byte[]) b2, a2));
            } else if (b2 instanceof Bitmap) {
                bVar.a(jVar.a(), new b((Bitmap) b2, a2));
            } else {
                bVar.a(0, "not bitmap or gif result!", (Throwable) null);
            }
        }
        if (bVar != null) {
            bVar.a();
        }
    }

    private int a(j jVar) {
        String str;
        Map<String, String> c2 = jVar.c();
        if (c2 == null || (str = c2.get("image_size")) == null || !(str instanceof Integer)) {
            return 0;
        }
        return ((Integer) str).intValue();
    }

    /* access modifiers changed from: protected */
    public void a(int i, String str, Throwable th, b bVar) {
        if (bVar != null) {
            bVar.a(i, str, th);
        }
    }

    public static C0013a b() {
        return new C0013a();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.i.a.a$a  reason: collision with other inner class name */
    /* compiled from: GifLoader */
    static class C0013a implements b {
        public void a() {
        }

        public void a(int i, String str, Throwable th) {
        }

        public void a(String str, b bVar) {
        }

        C0013a() {
        }
    }
}

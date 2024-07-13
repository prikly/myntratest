package com.appodeal.ads.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.widget.ImageView;
import com.appodeal.ads.f1;
import com.appodeal.ads.h5;
import com.appodeal.ads.l2;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.utils.p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;

public final class p {

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Context f17554a;

        /* renamed from: b  reason: collision with root package name */
        public final String f17555b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<ImageView> f17556c;

        /* renamed from: d  reason: collision with root package name */
        public final b f17557d;

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f17558e;

        public a(Context context, String str, ImageView imageView, l2.b bVar) {
            this.f17554a = context;
            this.f17555b = str;
            this.f17556c = new WeakReference<>(imageView);
            this.f17557d = bVar;
        }

        /* access modifiers changed from: private */
        public void a() {
            Bitmap bitmap;
            ImageView imageView = this.f17556c.get();
            if (imageView == null || (bitmap = this.f17558e) == null) {
                ((l2.b) this.f17557d).getClass();
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "Target ImageView or Bitmap is invalid");
                return;
            }
            ((l2.b) this.f17557d).getClass();
            imageView.setImageBitmap(bitmap);
        }

        public final void run() {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(this.f17555b, options);
                if (options.outWidth != 0) {
                    if (options.outHeight != 0) {
                        int a2 = p.a(this.f17554a);
                        int a3 = p.a(a2, false);
                        int i2 = options.outWidth;
                        int i3 = options.outHeight;
                        while (true) {
                            if (i2 / i <= a2) {
                                if (i3 / i <= a3) {
                                    options.inSampleSize = i;
                                    options.inJustDecodeBounds = false;
                                    this.f17558e = BitmapFactory.decodeFile(this.f17555b, options);
                                    h5.f16458a.post(new Runnable() {
                                        public final void run() {
                                            p.a.this.a();
                                        }
                                    });
                                    return;
                                }
                            }
                            i *= 2;
                        }
                    }
                }
                ((l2.b) this.f17557d).getClass();
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "Image size is (0;0)");
            } catch (Exception e2) {
                if (e2.getMessage() == null) {
                    ((l2.b) this.f17557d).getClass();
                    Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, "ImagePreparation error");
                    return;
                }
                b bVar = this.f17557d;
                String message = e2.getMessage();
                ((l2.b) bVar).getClass();
                Log.log(LogConstants.KEY_NATIVE, LogConstants.EVENT_ASSETS_ERROR, message);
            }
        }
    }

    public interface b {
    }

    public static int a(int i, boolean z) {
        if (z) {
            i = (int) (((float) i) / 1.5f);
        }
        if (i > 700) {
            return 700;
        }
        return i;
    }

    public static int a(Context context) {
        Point o = f1.o(context);
        return Math.min(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, Math.min(o.x, o.y));
    }
}

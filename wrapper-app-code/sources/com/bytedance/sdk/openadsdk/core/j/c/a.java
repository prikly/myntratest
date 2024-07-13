package com.bytedance.sdk.openadsdk.core.j.c;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ResourceHelper */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f1323a = new HashSet<String>() {
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static Set<String> f1324b = new HashSet<String>() {
        {
            add("application/x-javascript");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a$a  reason: collision with other inner class name */
    /* compiled from: ResourceHelper */
    public enum C0007a {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: ResourceHelper */
    public enum b {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point a(Context context, int i, int i2, b bVar) {
        if (context == null) {
            context = m.a();
        }
        Point point = new Point(i, i2);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int e2 = v.e(context, (float) i);
        int e3 = v.e(context, (float) i2);
        if (e2 <= width && e3 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (b.HTML_RESOURCE == bVar) {
            point2.x = Math.min(width, e2);
            point2.y = Math.min(height, e3);
        } else {
            float f2 = (float) e2;
            float f3 = f2 / ((float) width);
            float f4 = (float) e3;
            float f5 = f4 / ((float) height);
            if (f3 >= f5) {
                point2.x = width;
                point2.y = (int) (f4 / f3);
            } else {
                point2.x = (int) (f2 / f5);
                point2.y = height;
            }
        }
        if (point2.x < 0 || point2.y < 0) {
            return point;
        }
        point2.x = v.d(context, (float) point2.x);
        point2.y = v.d(context, (float) point2.y);
        return point2;
    }
}

package com.criteo.publisher.advancednative;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.criteo.publisher.n0.c;
import com.criteo.publisher.n0.g;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: AdChoiceOverlay */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<View, WeakReference<ImageView>> f2308a = new WeakHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final g f2309b;

    /* renamed from: c  reason: collision with root package name */
    private final c f2310c;

    public b(g gVar, c cVar) {
        this.f2309b = gVar;
        this.f2310c = cVar;
    }

    /* access modifiers changed from: package-private */
    public ViewGroup a(View view) {
        Context context = view.getContext();
        ImageView imageView = new ImageView(context);
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            frameLayout.setLayoutParams(layoutParams);
        }
        frameLayout.addView(view);
        frameLayout.addView(imageView);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams2.gravity = 5;
        layoutParams2.width = this.f2310c.a(this.f2309b.b());
        layoutParams2.height = this.f2310c.a(this.f2309b.a());
        imageView.setMinimumWidth(layoutParams2.width);
        imageView.setMinimumHeight(layoutParams2.height);
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setElevation(1000.0f);
            imageView.setOutlineProvider((ViewOutlineProvider) null);
        }
        this.f2308a.put(frameLayout, new WeakReference(imageView));
        return frameLayout;
    }

    /* access modifiers changed from: package-private */
    public ImageView b(View view) {
        WeakReference weakReference = this.f2308a.get(view);
        if (weakReference == null) {
            return null;
        }
        return (ImageView) weakReference.get();
    }

    /* access modifiers changed from: package-private */
    public View c(View view) {
        if (b(view) == null) {
            return null;
        }
        return ((ViewGroup) view).getChildAt(0);
    }
}

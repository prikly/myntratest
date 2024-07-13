package com.criteo.publisher.advancednative;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.criteo.publisher.e0.c;
import com.criteo.publisher.x;
import java.net.URL;

public class RendererHelper {
    /* access modifiers changed from: private */
    public final h imageLoaderHolder;
    private final c uiExecutor;

    public RendererHelper(h hVar, c cVar) {
        this.imageLoaderHolder = hVar;
        this.uiExecutor = cVar;
    }

    class a extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ URL f2298c;

        a(URL url) {
            this.f2298c = url;
        }

        public void a() throws Throwable {
            RendererHelper.this.imageLoaderHolder.a().preload(this.f2298c);
        }
    }

    /* access modifiers changed from: package-private */
    public void preloadMedia(URL url) {
        new a(url).run();
    }

    public void setMediaInView(CriteoMedia criteoMedia, CriteoMediaView criteoMediaView) {
        setMediaInView(criteoMedia.getImageUrl(), criteoMediaView.getImageView(), criteoMediaView.getPlaceholder());
    }

    class b extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ URL f2300c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f2301d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Drawable f2302e;

        b(URL url, ImageView imageView, Drawable drawable) {
            this.f2300c = url;
            this.f2301d = imageView;
            this.f2302e = drawable;
        }

        public void a() throws Throwable {
            RendererHelper.this.imageLoaderHolder.a().loadImageInto(this.f2300c, this.f2301d, this.f2302e);
        }
    }

    /* access modifiers changed from: package-private */
    public void setMediaInView(URL url, ImageView imageView, Drawable drawable) {
        this.uiExecutor.execute(new b(url, imageView, drawable));
    }
}

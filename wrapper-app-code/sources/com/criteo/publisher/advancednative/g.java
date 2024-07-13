package com.criteo.publisher.advancednative;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.criteo.publisher.e0.a;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import io.bidmachine.utils.IabUtils;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: CriteoImageLoader.kt */
public final class g implements ImageLoader {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Picasso f2323a;

    /* renamed from: b  reason: collision with root package name */
    private final com.criteo.publisher.e0.a f2324b;

    /* compiled from: CriteoImageLoader.kt */
    static final class a extends Lambda implements Function1<a.C0021a, Unit> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f2325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ URL f2326b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Drawable f2327c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f2328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, URL url, Drawable drawable, ImageView imageView) {
            super(1);
            this.f2325a = gVar;
            this.f2326b = url;
            this.f2327c = drawable;
            this.f2328d = imageView;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a.C0021a) obj);
            return Unit.INSTANCE;
        }

        public final void a(a.C0021a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            g gVar = this.f2325a;
            RequestCreator load = gVar.f2323a.load(this.f2326b.toString());
            Intrinsics.checkExpressionValueIsNotNull(load, "picasso.load(imageUrl.toString())");
            gVar.a(load, this.f2327c).into(this.f2328d, new C0019a(aVar));
        }

        /* renamed from: com.criteo.publisher.advancednative.g$a$a  reason: collision with other inner class name */
        /* compiled from: CriteoImageLoader.kt */
        public static final class C0019a implements Callback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.C0021a f2329a;

            C0019a(a.C0021a aVar) {
                this.f2329a = aVar;
            }

            public void onSuccess() {
                this.f2329a.a();
            }

            public void onError(Exception exc) {
                Intrinsics.checkParameterIsNotNull(exc, "e");
                this.f2329a.a();
            }
        }
    }

    public g(Picasso picasso, com.criteo.publisher.e0.a aVar) {
        Intrinsics.checkParameterIsNotNull(picasso, "picasso");
        Intrinsics.checkParameterIsNotNull(aVar, "asyncResources");
        this.f2323a = picasso;
        this.f2324b = aVar;
    }

    public void preload(URL url) {
        Intrinsics.checkParameterIsNotNull(url, IabUtils.KEY_IMAGE_URL);
        this.f2323a.load(url.toString()).fetch();
    }

    public void loadImageInto(URL url, ImageView imageView, Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(url, IabUtils.KEY_IMAGE_URL);
        Intrinsics.checkParameterIsNotNull(imageView, "imageView");
        this.f2324b.a(new a(this, url, drawable, imageView));
    }

    /* access modifiers changed from: private */
    public final RequestCreator a(RequestCreator requestCreator, Drawable drawable) {
        if (drawable == null) {
            return requestCreator;
        }
        RequestCreator placeholder = requestCreator.placeholder(drawable);
        Intrinsics.checkExpressionValueIsNotNull(placeholder, "placeholder(placeholder)");
        return placeholder;
    }
}

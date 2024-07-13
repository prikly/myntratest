package com.criteo.publisher.advancednative;

import com.criteo.publisher.model.b0.n;
import java.lang.ref.WeakReference;

/* compiled from: NativeAdMapper */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final q f2344a;

    /* renamed from: b  reason: collision with root package name */
    private final i f2345b;

    /* renamed from: c  reason: collision with root package name */
    private final e f2346c;

    /* renamed from: d  reason: collision with root package name */
    private final f f2347d;

    /* renamed from: e  reason: collision with root package name */
    private final b f2348e;

    /* renamed from: f  reason: collision with root package name */
    private final RendererHelper f2349f;

    public l(q qVar, i iVar, e eVar, f fVar, b bVar, RendererHelper rendererHelper) {
        this.f2344a = qVar;
        this.f2345b = iVar;
        this.f2346c = eVar;
        this.f2347d = fVar;
        this.f2348e = bVar;
        this.f2349f = rendererHelper;
    }

    /* access modifiers changed from: package-private */
    public CriteoNativeAd a(n nVar, WeakReference<CriteoNativeAdListener> weakReference, CriteoNativeRenderer criteoNativeRenderer) {
        j jVar = new j(nVar.g(), weakReference, this.f2345b);
        c cVar = new c(nVar.n().b(), weakReference, this.f2347d);
        a aVar = new a(nVar.l(), weakReference, this.f2347d);
        this.f2349f.preloadMedia(nVar.n().e());
        this.f2349f.preloadMedia(nVar.f());
        this.f2349f.preloadMedia(nVar.m());
        return new CriteoNativeAd(nVar, this.f2344a, jVar, this.f2346c, cVar, aVar, this.f2348e, criteoNativeRenderer, this.f2349f);
    }
}

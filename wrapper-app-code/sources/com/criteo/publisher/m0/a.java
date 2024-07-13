package com.criteo.publisher.m0;

import com.criteo.publisher.CriteoBannerAdListener;
import com.criteo.publisher.CriteoBannerView;
import com.criteo.publisher.CriteoErrorCode;
import com.criteo.publisher.b;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.p;
import java.lang.ref.Reference;

/* compiled from: CriteoBannerListenerCallTask */
public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final g f2686a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final CriteoBannerAdListener f2687b;

    /* renamed from: c  reason: collision with root package name */
    private final Reference<CriteoBannerView> f2688c;

    /* renamed from: d  reason: collision with root package name */
    private final p f2689d;

    public a(CriteoBannerAdListener criteoBannerAdListener, Reference<CriteoBannerView> reference, p pVar) {
        this.f2687b = criteoBannerAdListener;
        this.f2688c = reference;
        this.f2689d = pVar;
    }

    public void run() {
        CriteoBannerView criteoBannerView = this.f2688c.get();
        p pVar = this.f2689d;
        if (pVar == p.INVALID) {
            this.f2686a.a(b.a(criteoBannerView));
        } else if (pVar == p.VALID) {
            this.f2686a.a(b.b(criteoBannerView));
        }
        if (this.f2687b != null && criteoBannerView != null) {
            int i = C0028a.f2690a[this.f2689d.ordinal()];
            if (i == 1) {
                this.f2687b.onAdFailedToReceive(CriteoErrorCode.ERROR_CODE_NO_FILL);
            } else if (i == 2) {
                this.f2687b.onAdReceived(criteoBannerView);
            } else if (i == 3) {
                this.f2687b.onAdClicked();
                this.f2687b.onAdLeftApplication();
            }
        }
    }

    /* renamed from: com.criteo.publisher.m0.a$a  reason: collision with other inner class name */
    /* compiled from: CriteoBannerListenerCallTask */
    static /* synthetic */ class C0028a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2690a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.criteo.publisher.p[] r0 = com.criteo.publisher.p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2690a = r0
                com.criteo.publisher.p r1 = com.criteo.publisher.p.INVALID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2690a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.criteo.publisher.p r1 = com.criteo.publisher.p.VALID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2690a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.criteo.publisher.p r1 = com.criteo.publisher.p.CLICK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.m0.a.C0028a.<clinit>():void");
        }
    }
}

package com.appodeal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.appodeal.ads.Native;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.segments.g;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.appodeal.ads.utils.l;
import com.appodeal.ads.utils.m;
import com.appodeal.ads.utils.n;
import com.appodeal.ads.utils.s;
import java.util.ArrayList;
import java.util.Iterator;

public final class s2 extends l<t2, UnifiedNative, UnifiedNativeParams, UnifiedNativeCallback> {
    public ArrayList s;
    public int t = 0;
    public boolean u = false;

    public static final class b implements UnifiedNativeParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f17232a;

        public b(int i) {
            this.f17232a = i;
        }

        public final int getAdCountToLoad() {
            return this.f17232a;
        }

        public final Native.MediaAssetType getMediaAssetType() {
            return Native.f16127c;
        }

        public final Native.NativeAdType getNativeAdType() {
            return Native.f16126b;
        }

        public final String obtainPlacementId() {
            return g.a(Native.a().l);
        }

        public final String obtainSegmentId() {
            return Native.a().r().toString();
        }
    }

    public s2(t2 t2Var, AdNetwork adNetwork, d0 d0Var) {
        super(t2Var, adNetwork, d0Var, 5000);
    }

    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createNativeAd();
    }

    public final UnifiedAdCallback c() {
        return new a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007e, code lost:
        if (a(r3) != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[Catch:{ Exception -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A[Catch:{ Exception -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r8 = this;
            int r0 = r8.t
            if (r0 != 0) goto L_0x00d4
            monitor-enter(r8)
            java.util.ArrayList r0 = r8.s     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x0019
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.t2) r1     // Catch:{ all -> 0x00d1 }
            r0.a((com.appodeal.ads.t2) r1, (com.appodeal.ads.l) r8)     // Catch:{ all -> 0x00d1 }
            monitor-exit(r8)
            goto L_0x00d4
        L_0x0019:
            boolean r1 = r8.u     // Catch:{ all -> 0x00d1 }
            if (r1 == 0) goto L_0x00cf
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00d1 }
            java.util.ArrayList r1 = r8.s     // Catch:{ all -> 0x00d1 }
            int r1 = r1.size()     // Catch:{ all -> 0x00d1 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x0094
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.NativeAd r2 = (com.appodeal.ads.NativeAd) r2     // Catch:{ all -> 0x00d1 }
            r3 = r2
            com.appodeal.ads.l2 r3 = (com.appodeal.ads.l2) r3     // Catch:{ all -> 0x00d1 }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0085
            java.lang.String r6 = r3.f16580d     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 != 0) goto L_0x0085
            java.lang.String r6 = r3.f16581e     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 != 0) goto L_0x0085
            com.appodeal.ads.Native$MediaAssetType r6 = com.appodeal.ads.Native.f16127c     // Catch:{ Exception -> 0x0081 }
            com.appodeal.ads.Native$MediaAssetType r7 = com.appodeal.ads.Native.MediaAssetType.IMAGE     // Catch:{ Exception -> 0x0081 }
            if (r6 == r7) goto L_0x005f
            java.lang.String r6 = r3.j     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x005f
            android.graphics.Bitmap r6 = r3.k     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r6 = 0
            goto L_0x0060
        L_0x005f:
            r6 = 1
        L_0x0060:
            if (r6 == 0) goto L_0x0085
            com.appodeal.ads.Native$MediaAssetType r6 = com.appodeal.ads.Native.f16127c     // Catch:{ Exception -> 0x0081 }
            com.appodeal.ads.Native$MediaAssetType r7 = com.appodeal.ads.Native.MediaAssetType.ICON     // Catch:{ Exception -> 0x0081 }
            if (r6 == r7) goto L_0x0077
            java.lang.String r6 = r3.l     // Catch:{ Exception -> 0x0081 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x0077
            android.graphics.Bitmap r6 = r3.m     // Catch:{ Exception -> 0x0081 }
            if (r6 == 0) goto L_0x0075
            goto L_0x0077
        L_0x0075:
            r6 = 0
            goto L_0x0078
        L_0x0077:
            r6 = 1
        L_0x0078:
            if (r6 == 0) goto L_0x0085
            boolean r3 = a((com.appodeal.ads.l2) r3)     // Catch:{ Exception -> 0x0081 }
            if (r3 == 0) goto L_0x0085
            goto L_0x0086
        L_0x0081:
            r3 = move-exception
            com.appodeal.ads.utils.Log.log(r3)     // Catch:{ all -> 0x00d1 }
        L_0x0085:
            r4 = 0
        L_0x0086:
            if (r4 != 0) goto L_0x0027
            r0.remove()     // Catch:{ Exception -> 0x008f }
            r2.destroy()     // Catch:{ Exception -> 0x008f }
            goto L_0x0027
        L_0x008f:
            r2 = move-exception
            com.appodeal.ads.utils.Log.log(r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x0027
        L_0x0094:
            java.util.ArrayList r0 = r8.s     // Catch:{ all -> 0x00d1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d1 }
            if (r0 != 0) goto L_0x00aa
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.t2) r1     // Catch:{ all -> 0x00d1 }
            r0.n(r1, r8)     // Catch:{ all -> 0x00d1 }
            goto L_0x00cf
        L_0x00aa:
            if (r1 <= 0) goto L_0x00c2
            r0 = 0
            r1 = 0
            r8.a(r0, r1)     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.t2) r1     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.networking.LoadingError r2 = com.appodeal.ads.networking.LoadingError.InvalidAssets     // Catch:{ all -> 0x00d1 }
            r0.a(r1, r8, (com.appodeal.ads.networking.LoadingError) r2)     // Catch:{ all -> 0x00d1 }
            goto L_0x00cf
        L_0x00c2:
            com.appodeal.ads.Native$b r0 = com.appodeal.ads.Native.b()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.r r1 = r8.d()     // Catch:{ all -> 0x00d1 }
            com.appodeal.ads.t2 r1 = (com.appodeal.ads.t2) r1     // Catch:{ all -> 0x00d1 }
            r0.a((com.appodeal.ads.t2) r1, (com.appodeal.ads.l) r8)     // Catch:{ all -> 0x00d1 }
        L_0x00cf:
            monitor-exit(r8)
            goto L_0x00d4
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.s2.m():void");
    }

    public final void n() {
        String str;
        ArrayList arrayList = this.s;
        if (arrayList == null) {
            Native.b().a((t2) this.f16568a, this, (LoadingError) null);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l2 l2Var = (l2) ((NativeAd) it.next());
            String str2 = l2Var.j;
            String str3 = l2Var.l;
            if (l2Var.containsVideo() && TextUtils.isEmpty(str3) && (str = Native.f16128d) != null) {
                l2Var.l = str;
                str3 = str;
            }
            String str4 = l2Var.f16584h;
            String str5 = l2Var.i;
            Native.MediaAssetType mediaAssetType = Native.f16127c;
            Native.MediaAssetType mediaAssetType2 = Native.MediaAssetType.IMAGE;
            if (mediaAssetType != mediaAssetType2) {
                this.t++;
            }
            Native.MediaAssetType mediaAssetType3 = Native.f16127c;
            Native.MediaAssetType mediaAssetType4 = Native.MediaAssetType.ICON;
            if (mediaAssetType3 != mediaAssetType4) {
                this.t++;
            }
            if (Native.f16127c != mediaAssetType2) {
                if (str2 == null || str2.isEmpty()) {
                    this.t--;
                } else {
                    s.f17568e.f17569a.execute(new l(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), str2, false, new o2(this, l2Var)));
                }
            }
            if (Native.f16127c != mediaAssetType4) {
                if (str3 == null || str3.isEmpty()) {
                    this.t--;
                } else {
                    s.f17568e.f17569a.execute(new l(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), str3, true, new p2(this, l2Var)));
                }
                if (Native.f16126b == Native.NativeAdType.Video) {
                    if (str4 != null && !str4.isEmpty()) {
                        this.t++;
                        if (!str4.isEmpty()) {
                            s.f17568e.f17569a.execute(new m(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), new q2(this, l2Var), str4));
                        } else {
                            this.t--;
                        }
                    } else if (str5 != null && !str5.isEmpty()) {
                        this.t++;
                        s.f17568e.f17569a.execute(new n(com.appodeal.ads.context.b.f16327b.f16328a.getApplicationContext(), new r2(this, l2Var), str5));
                    }
                }
            }
        }
        this.u = true;
        m();
    }

    public final ArrayList o() {
        ArrayList arrayList = this.s;
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public final class a extends UnifiedNativeCallback {
        public a() {
        }

        public final l2 a(int i) {
            ArrayList arrayList = s2.this.s;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            Iterator it = s2.this.s.iterator();
            while (it.hasNext()) {
                NativeAd nativeAd = (NativeAd) it.next();
                if (nativeAd instanceof l2) {
                    l2 l2Var = (l2) nativeAd;
                    if (i == l2Var.a()) {
                        return l2Var;
                    }
                }
            }
            return (l2) s2.this.s.get(0);
        }

        public final void onAdClicked() {
            Native.b b2 = Native.b();
            s2 s2Var = s2.this;
            b2.a((r) (t2) s2Var.f16568a, (l) s2Var, a(-1), (UnifiedAdCallbackClickTrackListener) null);
        }

        public final void onAdClicked(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            onAdClicked(-1, unifiedAdCallbackClickTrackListener);
        }

        public final void onAdExpired() {
            Native.b b2 = Native.b();
            s2 s2Var = s2.this;
            b2.e((t2) s2Var.f16568a, s2Var);
        }

        public final void onAdFinished(int i) {
            Native.b b2 = Native.b();
            s2 s2Var = s2.this;
            b2.i((t2) s2Var.f16568a, s2Var, a(i));
        }

        public final void onAdInfoRequested(Bundle bundle) {
            s2.this.a(bundle);
        }

        public final void onAdLoadFailed(LoadingError loadingError) {
            Native.b b2 = Native.b();
            s2 s2Var = s2.this;
            b2.a((t2) s2Var.f16568a, s2Var, loadingError);
        }

        public final void onAdLoaded(UnifiedNativeAd unifiedNativeAd) {
            s2 s2Var = s2.this;
            UnifiedNativeCallback unifiedNativeCallback = (UnifiedNativeCallback) s2Var.f16575h;
            ArrayList arrayList = s2Var.s;
            if (arrayList == null || unifiedNativeCallback == null) {
                onAdLoadFailed(LoadingError.InternalError);
                return;
            }
            arrayList.add(new l2(s2Var, unifiedNativeAd, unifiedNativeCallback));
            s2.this.n();
        }

        public final void onAdShowFailed() {
            Native.b b2 = Native.b();
            s2 s2Var = s2.this;
            b2.b((t2) s2Var.f16568a, s2Var, a(-1), LoadingError.ShowFailed);
        }

        public final void onAdShown(int i) {
            Native.b b2 = Native.b();
            s2 s2Var = s2.this;
            b2.j((t2) s2Var.f16568a, s2Var, a(i));
        }

        public final void printError(String str, Object obj) {
            s2 s2Var = s2.this;
            ((t2) s2Var.f16568a).a((l) s2Var, str, obj);
        }

        public final void onAdClicked(int i, UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
            Native.b b2 = Native.b();
            s2 s2Var = s2.this;
            b2.a((r) (t2) s2Var.f16568a, (l) s2Var, a(i), unifiedAdCallbackClickTrackListener);
        }
    }

    public final UnifiedAdParams a(int i) {
        return new b(i);
    }

    public static boolean a(l2 l2Var) {
        if (Native.f16127c == Native.MediaAssetType.ICON || Native.f16126b != Native.NativeAdType.Video || l2Var.f16578b.hasVideo() || l2Var.q != null) {
            return true;
        }
        return false;
    }

    public final void a(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback, UnifiedAd unifiedAd) {
        UnifiedNativeParams unifiedNativeParams = (UnifiedNativeParams) unifiedAdParams;
        this.s = new ArrayList(unifiedNativeParams.getAdCountToLoad());
        ((UnifiedNative) unifiedAd).load(contextProvider, unifiedNativeParams, obj, (UnifiedNativeCallback) unifiedAdCallback);
    }
}

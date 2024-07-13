package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

public class i extends p {

    /* renamed from: c  reason: collision with root package name */
    private final long f15546c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15547d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final int f15548e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f15549f = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f15550g = 0;

    /* renamed from: h  reason: collision with root package name */
    private Handler f15551h;
    private final HandlerThread i = new HandlerThread("BlackViewDetector");
    private final Runnable j = new Runnable() {
        public void run() {
            i.this.b();
        }
    };
    /* access modifiers changed from: private */
    public a k;

    public interface a {
        void a(View view);
    }

    private interface b {
        void a(Bitmap bitmap);

        void a(boolean z);
    }

    public i(n nVar) {
        super("black_view", nVar);
        this.f15546c = ((Long) nVar.a(com.applovin.impl.sdk.c.b.fk)).longValue();
        this.f15547d = ((Long) nVar.a(com.applovin.impl.sdk.c.b.fj)).longValue();
        this.f15548e = ((Integer) nVar.a(com.applovin.impl.sdk.c.b.fl)).intValue();
    }

    private void a(View view, final b bVar) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        final Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            Activity b2 = this.f15761a.ai().b();
            if (b2 == null) {
                v vVar = this.f15762b;
                if (v.a()) {
                    this.f15762b.e("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                bVar.a(false);
                return;
            }
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            try {
                PixelCopy.request(b2.getWindow(), new Rect(iArr[0], iArr[1], iArr[0] + measuredWidth, iArr[1] + measuredHeight), createBitmap, new PixelCopy.OnPixelCopyFinishedListener() {
                    public void onPixelCopyFinished(int i) {
                        if (i == 0) {
                            bVar.a(createBitmap);
                            return;
                        }
                        v vVar = i.this.f15762b;
                        if (v.a()) {
                            v vVar2 = i.this.f15762b;
                            vVar2.e("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
                        }
                        bVar.a(true);
                    }
                }, new Handler());
            } catch (Throwable th) {
                v vVar2 = this.f15762b;
                if (v.a()) {
                    v vVar3 = this.f15762b;
                    vVar3.e("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
            }
        } else {
            v vVar4 = this.f15762b;
            if (v.a()) {
                this.f15762b.d("BlackViewDetector", "Unable to capture screenshots on views below API 26");
            }
            bVar.a(true);
        }
    }

    /* access modifiers changed from: private */
    public boolean a(int i2) {
        return Color.red(i2) == 0 && Color.blue(i2) == 0 && Color.green(i2) == 0;
    }

    /* access modifiers changed from: private */
    public void b() {
        View view = (View) this.f15549f.get();
        if (view == null) {
            v vVar = this.f15762b;
            if (v.a()) {
                this.f15762b.d("BlackViewDetector", "Monitored view no longer exists.");
            }
            a();
            return;
        }
        v vVar2 = this.f15762b;
        if (v.a()) {
            v vVar3 = this.f15762b;
            vVar3.b("BlackViewDetector", "Checking for black view: " + view);
        }
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0) {
            v vVar4 = this.f15762b;
            if (v.a()) {
                v vVar5 = this.f15762b;
                vVar5.d("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
            }
            this.f15550g = 0;
            c();
            return;
        }
        a(view, (b) new b() {
            public void a(Bitmap bitmap) {
                int b2 = measuredWidth / i.this.f15548e;
                int b3 = measuredHeight / i.this.f15548e;
                int i = b2 / 2;
                int i2 = b3 / 2;
                loop0:
                while (true) {
                    if (i2 >= measuredHeight) {
                        i.d(i.this);
                        break;
                    }
                    for (int i3 = i; i3 < measuredWidth; i3 += b2) {
                        if (!i.this.a(bitmap.getPixel(i3, i2))) {
                            int unused = i.this.f15550g = 0;
                            break loop0;
                        }
                    }
                    i2 += b3;
                }
                bitmap.recycle();
                i.this.c();
            }

            public void a(boolean z) {
                if (z) {
                    i.this.a();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r6.f15550g == 1) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c() {
        /*
            r6 = this;
            long r0 = r6.f15546c
            r2 = 1
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x002d
            int r3 = r6.f15550g
            if (r3 <= r2) goto L_0x0011
        L_0x000d:
            r6.d()
            goto L_0x0032
        L_0x0011:
            android.os.Handler r2 = r6.f15551h
            if (r2 == 0) goto L_0x001b
            java.lang.Runnable r3 = r6.j
            r2.postDelayed(r3, r0)
            goto L_0x0035
        L_0x001b:
            com.applovin.impl.sdk.v r0 = r6.f15762b
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0032
            com.applovin.impl.sdk.v r0 = r6.f15762b
            java.lang.String r1 = "BlackViewDetector"
            java.lang.String r2 = "Monitoring handler was unexpectedly null"
            r0.d(r1, r2)
            goto L_0x0032
        L_0x002d:
            int r0 = r6.f15550g
            if (r0 != r2) goto L_0x0032
            goto L_0x000d
        L_0x0032:
            r6.a()
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.i.c():void");
    }

    static /* synthetic */ int d(i iVar) {
        int i2 = iVar.f15550g;
        iVar.f15550g = i2 + 1;
        return i2;
    }

    private void d() {
        final View view = (View) this.f15549f.get();
        v vVar = this.f15762b;
        if (v.a()) {
            v vVar2 = this.f15762b;
            vVar2.d("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (i.this.k != null) {
                    i.this.k.a(view);
                }
            }
        });
    }

    public void a() {
        if (this.f15549f.get() != null) {
            v vVar = this.f15762b;
            if (v.a()) {
                v vVar2 = this.f15762b;
                vVar2.b("BlackViewDetector", "Stopped monitoring view: " + this.f15549f.get());
            }
            Handler handler = this.f15551h;
            if (handler != null) {
                handler.removeCallbacks(this.j);
                this.f15551h = null;
                this.i.quit();
            }
            this.f15549f.clear();
            this.k = null;
        }
    }

    public void a(View view, a aVar) {
        if (((Boolean) this.f15761a.a(com.applovin.impl.sdk.c.b.fi)).booleanValue()) {
            View view2 = (View) this.f15549f.get();
            if (view2 != null) {
                v vVar = this.f15762b;
                if (v.a()) {
                    v vVar2 = this.f15762b;
                    vVar2.d("BlackViewDetector", "Monitoring is already in progress for a view:" + view2);
                    return;
                }
                return;
            }
            this.k = aVar;
            this.f15549f = new WeakReference<>(view);
            this.f15550g = 0;
            v vVar3 = this.f15762b;
            if (v.a()) {
                v vVar4 = this.f15762b;
                vVar4.b("BlackViewDetector", "Started monitoring view: " + view);
            }
            this.i.start();
            Handler handler = new Handler(this.i.getLooper());
            this.f15551h = handler;
            handler.postDelayed(this.j, this.f15547d);
        }
    }
}

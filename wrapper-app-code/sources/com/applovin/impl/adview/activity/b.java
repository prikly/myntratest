package com.applovin.impl.adview.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f14038a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14039b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14040c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14041d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f14042e;

    public b(Activity activity) {
        this.f14038a = activity;
        this.f14040c = Utils.getRotation(activity);
        boolean isTablet = AppLovinSdkUtils.isTablet(activity);
        this.f14041d = isTablet;
        this.f14039b = a(this.f14040c, isTablet);
        this.f14042e = this.f14041d && 2 == a((Context) activity);
    }

    private int a(int i, boolean z) {
        if (!z || !this.f14042e) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        } else if (i == 0) {
            return 0;
        } else {
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    private void a(int i) {
        try {
            this.f14038a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r5.f14040c != 1) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r5.f14040c == 2) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005b, code lost:
        if (r5.f14040c == 1) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r6 != 3) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.applovin.impl.sdk.ad.e.b r6) {
        /*
            r5 = this;
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r6 != r0) goto L_0x0032
            boolean r6 = r5.f14041d
            r0 = 9
            if (r6 == 0) goto L_0x0020
            boolean r6 = r5.f14042e
            if (r6 == 0) goto L_0x0020
            int r6 = r5.f14040c
            if (r6 == r3) goto L_0x0018
            if (r6 == r1) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            int r6 = r5.f14040c
            if (r6 != r3) goto L_0x0026
        L_0x001c:
            r5.a((int) r0)
            goto L_0x005e
        L_0x0020:
            int r6 = r5.f14040c
            if (r6 == 0) goto L_0x002a
            if (r6 == r2) goto L_0x002a
        L_0x0026:
            r5.a((int) r3)
            goto L_0x005e
        L_0x002a:
            int r6 = r5.f14040c
            if (r6 != 0) goto L_0x002f
            goto L_0x0026
        L_0x002f:
            r3 = 9
            goto L_0x0026
        L_0x0032:
            com.applovin.impl.sdk.ad.e$b r0 = com.applovin.impl.sdk.ad.e.b.ACTIVITY_LANDSCAPE
            if (r6 != r0) goto L_0x005e
            boolean r6 = r5.f14041d
            r0 = 8
            r4 = 0
            if (r6 == 0) goto L_0x004f
            boolean r6 = r5.f14042e
            if (r6 == 0) goto L_0x004f
            int r6 = r5.f14040c
            if (r6 == 0) goto L_0x0048
            if (r6 == r2) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            int r6 = r5.f14040c
            if (r6 != r2) goto L_0x004d
            goto L_0x001c
        L_0x004d:
            r0 = 0
            goto L_0x001c
        L_0x004f:
            int r6 = r5.f14040c
            if (r6 == r3) goto L_0x0059
            if (r6 == r1) goto L_0x0059
        L_0x0055:
            r5.a((int) r4)
            goto L_0x005e
        L_0x0059:
            int r6 = r5.f14040c
            if (r6 != r3) goto L_0x001c
            goto L_0x004d
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.activity.b.a(com.applovin.impl.sdk.ad.e$b):void");
    }

    public void a(e eVar) {
        int i;
        if (!eVar.F() || (i = this.f14039b) == -1) {
            a(eVar.p());
        } else {
            a(i);
        }
    }
}

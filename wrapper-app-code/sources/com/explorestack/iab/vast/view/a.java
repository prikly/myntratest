package com.explorestack.iab.vast.view;

import android.content.Context;
import android.view.TextureView;

public class a extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public int f3334a;

    /* renamed from: b  reason: collision with root package name */
    public int f3335b;

    public a(Context context) {
        super(context);
    }

    public void a(int i, int i2) {
        this.f3334a = i;
        this.f3335b = i2;
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r1 > r6) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f3334a
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f3335b
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f3334a
            if (r2 <= 0) goto L_0x0078
            int r2 = r5.f3335b
            if (r2 <= 0) goto L_0x0078
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x003c
            if (r1 != r2) goto L_0x003c
            int r0 = r5.f3334a
            int r1 = r0 * r7
            int r2 = r5.f3335b
            int r3 = r6 * r2
            if (r1 >= r3) goto L_0x0037
            int r0 = r1 / r2
            goto L_0x005f
        L_0x0037:
            if (r1 <= r3) goto L_0x005c
            int r1 = r3 / r0
            goto L_0x004d
        L_0x003c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x004f
            int r0 = r5.f3335b
            int r0 = r0 * r6
            int r2 = r5.f3334a
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x004c
            if (r0 <= r7) goto L_0x004c
            goto L_0x005c
        L_0x004c:
            r1 = r0
        L_0x004d:
            r0 = r6
            goto L_0x0078
        L_0x004f:
            if (r1 != r2) goto L_0x0061
            int r1 = r5.f3334a
            int r1 = r1 * r7
            int r2 = r5.f3335b
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x005e
            if (r1 <= r6) goto L_0x005e
        L_0x005c:
            r0 = r6
            goto L_0x005f
        L_0x005e:
            r0 = r1
        L_0x005f:
            r1 = r7
            goto L_0x0078
        L_0x0061:
            int r2 = r5.f3334a
            int r4 = r5.f3335b
            if (r1 != r3) goto L_0x006d
            if (r4 <= r7) goto L_0x006d
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L_0x006f
        L_0x006d:
            r1 = r2
            r7 = r4
        L_0x006f:
            if (r0 != r3) goto L_0x005e
            if (r1 <= r6) goto L_0x005e
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L_0x004d
        L_0x0078:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r7 = "/"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "Size"
            android.util.Log.e(r7, r6)
            r5.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.view.a.onMeasure(int, int):void");
    }
}

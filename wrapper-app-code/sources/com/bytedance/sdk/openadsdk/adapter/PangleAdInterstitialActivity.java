package com.bytedance.sdk.openadsdk.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.b;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.CustomEventInterstitialListener;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.i.d;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.ArrayList;

public class PangleAdInterstitialActivity extends Activity {
    public static final String INTENT_TYPE = "intent_type";
    public static final int INTENT_TYPE_IMAGE_2_3 = 2;
    public static final int INTENT_TYPE_IMAGE_3_2 = 1;
    /* access modifiers changed from: private */
    public static CustomEventInterstitialListener n;
    private static TTNativeAd o;

    /* renamed from: a  reason: collision with root package name */
    private ImageView f196a;

    /* renamed from: b  reason: collision with root package name */
    private RelativeLayout f197b;

    /* renamed from: c  reason: collision with root package name */
    private NiceImageView f198c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f199d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f200e;

    /* renamed from: f  reason: collision with root package name */
    private Button f201f;

    /* renamed from: g  reason: collision with root package name */
    private TTRatingBar2 f202g;

    /* renamed from: h  reason: collision with root package name */
    private Intent f203h;
    private ViewGroup i;
    private RelativeLayout j;
    private ViewGroup k;
    private float l;
    private float m;

    public void onBackPressed() {
    }

    public static void showAd(Context context, TTNativeAd tTNativeAd, int i2, CustomEventInterstitialListener customEventInterstitialListener) {
        o = tTNativeAd;
        n = customEventInterstitialListener;
        Intent intent = new Intent(context, PangleAdInterstitialActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(INTENT_TYPE, i2);
        b.a(context, intent, new b.a() {
            public void a() {
            }

            public void a(Throwable th) {
                if (PangleAdInterstitialActivity.n != null) {
                    PangleAdInterstitialActivity.n.onInterstitialShowFail();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f203h = getIntent();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.l = (float) v.c((Context) this);
        this.m = (float) v.d((Context) this);
        if (this.f203h.getIntExtra(INTENT_TYPE, 0) == 2) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f203h != null) {
            b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r8 = this;
            float r0 = r8.l
            int r0 = (int) r0
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = o
            r2 = 1
            r3 = 0
            java.lang.String r4 = "PangleAdInterstitial"
            if (r1 == 0) goto L_0x0087
            java.util.List r1 = r1.getImageList()
            if (r1 == 0) goto L_0x0087
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = o
            java.util.List r1 = r1.getImageList()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0087
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = o
            java.util.List r1 = r1.getImageList()
            java.lang.Object r1 = r1.get(r3)
            com.bytedance.sdk.openadsdk.TTImage r1 = (com.bytedance.sdk.openadsdk.TTImage) r1
            if (r1 == 0) goto L_0x0087
            boolean r5 = r1.isValid()
            if (r5 == 0) goto L_0x0087
            int r5 = r1.getHeight()
            float r5 = (float) r5
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r1 = r1 / r5
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 * r5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "ratio...."
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r4, (java.lang.String) r6)
            r6 = 1155432448(0x44de8000, float:1780.0)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x006d
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x006d
            float r1 = (float) r0
            r5 = 1071896330(0x3fe3d70a, float:1.78)
            float r1 = r1 / r5
            int r1 = (int) r1
            int r1 = r1 + 30
            java.lang.String r5 = "RATIO_1_7_8...."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0088
        L_0x006d:
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x007f
            float r1 = (float) r0
            r5 = 1072986849(0x3ff47ae1, float:1.91)
            float r1 = r1 / r5
            int r1 = (int) r1
            int r1 = r1 + 30
            java.lang.String r5 = "RATIO_1_9_1...."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r4, (java.lang.String) r5)
            goto L_0x0088
        L_0x007f:
            java.lang.String r1 = "RATIO_1_1...."
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r4, (java.lang.String) r1)
            r1 = r0
            r5 = 1
            goto L_0x0089
        L_0x0087:
            r1 = r0
        L_0x0088:
            r5 = 0
        L_0x0089:
            android.content.Intent r6 = r8.f203h
            java.lang.String r7 = "intent_type"
            int r3 = r6.getIntExtra(r7, r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "intentType="
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = ",isImageRatio_1_1="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = ", imageHeight = "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = "，imageWidth="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r4, (java.lang.String) r0)
            if (r3 == r2) goto L_0x00d8
            r0 = 2
            if (r3 == r0) goto L_0x00c7
            r8.finish()
            goto L_0x0156
        L_0x00c7:
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_2_3"
            int r0 = com.bytedance.sdk.component.utils.t.f(r8, r0)
            r8.setContentView(r0)
            r8.d()
            r8.a((int) r1)
            goto L_0x0156
        L_0x00d8:
            if (r5 != 0) goto L_0x0101
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_3_2"
            int r0 = com.bytedance.sdk.component.utils.t.f(r8, r0)
            r8.setContentView(r0)
            r8.d()
            r0 = 1117126656(0x42960000, float:75.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r8, r0)
            float r0 = (float) r0
            float r2 = r8.m
            float r3 = (float) r1
            float r4 = r2 - r3
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fd
            float r4 = r8.l
            float r4 = r4 - r3
            float r0 = r0 - r4
            float r2 = r2 + r0
            r8.m = r2
        L_0x00fd:
            r8.a((int) r1)
            goto L_0x0156
        L_0x0101:
            java.lang.String r0 = "tt_pangle_ad_instersitial_layout_3_2_1_1"
            int r0 = com.bytedance.sdk.component.utils.t.f(r8, r0)
            r8.setContentView(r0)
            r8.d()
            r0 = 1126825984(0x432a0000, float:170.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r8, r0)
            float r0 = (float) r0
            float r2 = r8.m
            r3 = 1101004800(0x41a00000, float:20.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r8, r3)
            float r3 = (float) r3
            float r2 = r2 - r3
            int r2 = (int) r2
            float r3 = r8.l
            float r4 = (float) r1
            float r5 = r3 - r4
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x012b
            float r3 = r3 - r0
            int r0 = (int) r3
            goto L_0x012c
        L_0x012b:
            r0 = r1
        L_0x012c:
            float r3 = r8.m
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x013a
            int r1 = (int) r3
            r3 = 1111490560(0x42400000, float:48.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r8, r3)
            int r1 = r1 - r3
        L_0x013a:
            android.widget.RelativeLayout r3 = r8.j
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r3.height = r1
            r3.width = r0
            android.widget.RelativeLayout r0 = r8.j
            r0.setLayoutParams(r3)
            android.view.ViewGroup r0 = r8.i
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
            android.view.ViewGroup r1 = r8.i
            r1.setLayoutParams(r0)
        L_0x0156:
            com.bytedance.sdk.openadsdk.TTNativeAd r0 = o
            r8.a((com.bytedance.sdk.openadsdk.TTNativeAd) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity.b():void");
    }

    private void a(int i2) {
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        layoutParams.height = i2;
        this.j.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.i.getLayoutParams();
        layoutParams2.height = (int) (this.m - ((float) i2));
        this.i.setLayoutParams(layoutParams2);
    }

    private void a(TTNativeAd tTNativeAd) {
        TTImage tTImage;
        if (tTNativeAd != null) {
            if (o.getImageList() != null && !o.getImageList().isEmpty() && (tTImage = o.getImageList().get(0)) != null && tTImage.isValid()) {
                d.a().a(tTImage.getImageUrl(), this.f196a);
            }
            if (!(o.getIcon() == null || !o.getIcon().isValid() || o.getIcon().getImageUrl() == null)) {
                d.a().a(o.getIcon().getImageUrl(), (ImageView) this.f198c);
            }
            this.f199d.setText(o.getTitle());
            this.f200e.setText(o.getDescription());
            this.f201f.setText(o.getButtonText());
            c();
            b(tTNativeAd);
        }
    }

    private void b(TTNativeAd tTNativeAd) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f196a);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f201f);
        tTNativeAd.registerViewForInteraction(this.k, arrayList, arrayList2, this.f197b, new TTNativeAd.AdInteractionListener() {
            public void onAdClicked(View view, TTNativeAd tTNativeAd) {
                l.b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.n != null) {
                    PangleAdInterstitialActivity.n.onInterstitialClicked();
                }
            }

            public void onAdCreativeClick(View view, TTNativeAd tTNativeAd) {
                l.b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdClicked....");
                if (PangleAdInterstitialActivity.n != null) {
                    PangleAdInterstitialActivity.n.onInterstitialClicked();
                }
            }

            public void onAdShow(TTNativeAd tTNativeAd) {
                l.b("PangleAdInterstitial", "PangleAdInterstitialActivity-onAdShow....");
                if (PangleAdInterstitialActivity.n != null) {
                    PangleAdInterstitialActivity.n.onInterstitialShown();
                }
            }
        });
    }

    private void c() {
        this.f197b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                PangleAdInterstitialActivity.this.finish();
                if (PangleAdInterstitialActivity.n != null) {
                    PangleAdInterstitialActivity.n.onInterstitialDismissed();
                }
            }
        });
    }

    private void d() {
        TTRatingBar2 tTRatingBar2 = (TTRatingBar2) findViewById(t.e(this, "tt_pangle_ad_score"));
        this.f202g = tTRatingBar2;
        if (tTRatingBar2 != null) {
            v.a((TextView) null, tTRatingBar2, (double) o.getAppScore(), (Context) this);
        }
        this.f196a = (ImageView) findViewById(t.e(this, "tt_pangle_ad_main_img"));
        this.f197b = (RelativeLayout) findViewById(t.e(this, "tt_pangle_ad_close_layout"));
        this.f198c = (NiceImageView) findViewById(t.e(this, "tt_pangle_ad_icon"));
        this.f199d = (TextView) findViewById(t.e(this, "tt_pangle_ad_title"));
        this.f200e = (TextView) findViewById(t.e(this, "tt_pangle_ad_content"));
        this.f201f = (Button) findViewById(t.e(this, "tt_pangle_ad_btn"));
        this.i = (ViewGroup) findViewById(t.e(this, "tt_pangle_ad_content_layout"));
        this.j = (RelativeLayout) findViewById(t.e(this, "tt_pangle_ad_image_layout"));
        this.k = (ViewGroup) findViewById(t.e(this, "tt_pangle_ad_root"));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        o = null;
        n = null;
    }
}

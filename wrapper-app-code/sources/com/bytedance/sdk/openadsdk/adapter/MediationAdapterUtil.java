package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.i.d;
import java.util.List;

public class MediationAdapterUtil {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: android.view.ViewGroup$MarginLayoutParams} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: android.view.ViewGroup$MarginLayoutParams} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0570  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.view.View setAdDataAndBuildBannerView(android.content.Context r25, com.bytedance.sdk.openadsdk.TTNativeAd r26, com.bytedance.sdk.openadsdk.TTNativeAd.AdInteractionListener r27, float r28, float r29) {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r29
            r4 = 0
            if (r0 == 0) goto L_0x057e
            if (r1 == 0) goto L_0x057e
            if (r2 != 0) goto L_0x0011
            goto L_0x057e
        L_0x0011:
            float r5 = r28 / r3
            r6 = 1082130432(0x40800000, float:4.0)
            r7 = 0
            int r8 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0029
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r25)
            java.lang.String r9 = "tt_pangle_ad_banner_layout_600_300"
            int r9 = com.bytedance.sdk.component.utils.t.f(r0, r9)
            android.view.View r8 = r8.inflate(r9, r4, r7)
            goto L_0x0037
        L_0x0029:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r25)
            java.lang.String r9 = "tt_pangle_ad_banner_layout_600_150"
            int r9 = com.bytedance.sdk.component.utils.t.f(r0, r9)
            android.view.View r8 = r8.inflate(r9, r4, r7)
        L_0x0037:
            int r9 = com.bytedance.R.id.tt_pangle_ad_title
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L_0x0048
            java.lang.String r10 = r26.getTitle()
            r9.setText(r10)
        L_0x0048:
            int r10 = com.bytedance.R.id.tt_pangle_ad_content
            android.view.View r10 = r8.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x0059
            java.lang.String r11 = r26.getDescription()
            r10.setText(r11)
        L_0x0059:
            int r11 = com.bytedance.R.id.tt_pangle_ad_btn
            android.view.View r11 = r8.findViewById(r11)
            android.widget.Button r11 = (android.widget.Button) r11
            int r12 = com.bytedance.R.id.tt_pangle_ad_image_layout
            android.view.View r12 = r8.findViewById(r12)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r13 = com.bytedance.R.id.tt_pangle_ad_main_img
            android.view.View r13 = r8.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            int r14 = com.bytedance.R.id.tt_pangle_ad_content_layout
            android.view.View r14 = r8.findViewById(r14)
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            int r15 = com.bytedance.R.id.tt_pangle_ad_icon_adapter
            android.view.View r15 = r8.findViewById(r15)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            if (r12 == 0) goto L_0x008a
            android.view.ViewGroup$LayoutParams r16 = r12.getLayoutParams()
            r17 = r16
            goto L_0x008c
        L_0x008a:
            r17 = r4
        L_0x008c:
            if (r13 == 0) goto L_0x0095
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r18 = r16
            goto L_0x0097
        L_0x0095:
            r18 = r4
        L_0x0097:
            if (r14 == 0) goto L_0x00a0
            android.view.ViewGroup$LayoutParams r16 = r14.getLayoutParams()
            r19 = r16
            goto L_0x00a2
        L_0x00a0:
            r19 = r4
        L_0x00a2:
            if (r11 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r16 = r11.getLayoutParams()
            goto L_0x00ab
        L_0x00a9:
            r16 = r4
        L_0x00ab:
            if (r15 == 0) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r20 = r15.getLayoutParams()
            goto L_0x00b4
        L_0x00b2:
            r20 = r4
        L_0x00b4:
            java.util.List r21 = r26.getImageList()
            if (r21 == 0) goto L_0x053b
            java.util.List r21 = r26.getImageList()
            boolean r21 = r21.isEmpty()
            if (r21 != 0) goto L_0x053b
            java.util.List r4 = r26.getImageList()
            java.lang.Object r4 = r4.get(r7)
            com.bytedance.sdk.openadsdk.TTImage r4 = (com.bytedance.sdk.openadsdk.TTImage) r4
            if (r4 == 0) goto L_0x053b
            boolean r22 = r4.isValid()
            if (r22 == 0) goto L_0x053b
            if (r13 == 0) goto L_0x00e3
            com.bytedance.sdk.openadsdk.i.d r7 = com.bytedance.sdk.openadsdk.i.d.a()
            java.lang.String r6 = r4.getImageUrl()
            r7.a((java.lang.String) r6, (android.widget.ImageView) r13)
        L_0x00e3:
            int r6 = r4.getWidth()
            int r4 = r4.getHeight()
            r23 = 1082130432(0x40800000, float:4.0)
            int r24 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r24 < 0) goto L_0x01c8
            int r5 = com.bytedance.R.id.tt_pangle_ad_logo
            android.view.View r5 = r8.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0135
            android.view.ViewGroup$LayoutParams r13 = r5.getLayoutParams()
            r7 = 1098907648(0x41800000, float:16.0)
            int r7 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r7)
            r13.width = r7
            r7 = 1086324736(0x40c00000, float:6.0)
            int r1 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r7)
            r13.height = r1
            r5.setLayoutParams(r13)
            r1 = 2
            r13 = 0
            r5.setPadding(r1, r13, r13, r13)
            r1 = 1082130432(0x40800000, float:4.0)
            r5.setTextSize(r1)
            int r1 = com.bytedance.R.drawable.tt_ad_logo
            android.graphics.drawable.Drawable r1 = androidx.core.content.ContextCompat.getDrawable(r0, r1)
            if (r1 == 0) goto L_0x0135
            int r2 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r7)
            r7 = 1084227584(0x40a00000, float:5.0)
            int r7 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r7)
            r1.setBounds(r13, r13, r2, r7)
            r2 = 0
            r5.setCompoundDrawables(r1, r2, r2, r2)
        L_0x0135:
            float r1 = (float) r6
            float r1 = r1 * r3
            float r2 = (float) r4
            float r1 = r1 / r2
            int r1 = (int) r1
            int r2 = com.bytedance.sdk.openadsdk.utils.v.c((android.content.Context) r25)
            float r2 = (float) r2
            int r2 = (r28 > r2 ? 1 : (r28 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x014a
            int r2 = com.bytedance.sdk.openadsdk.utils.v.c((android.content.Context) r25)
            float r2 = (float) r2
            goto L_0x014c
        L_0x014a:
            r2 = r28
        L_0x014c:
            r7 = r17
            if (r7 == 0) goto L_0x0158
            int r4 = (int) r3
            r7.height = r4
            r7.width = r1
            r12.setLayoutParams(r7)
        L_0x0158:
            float r1 = (float) r1
            float r1 = r2 - r1
            int r1 = (int) r1
            r4 = r19
            if (r4 == 0) goto L_0x0168
            int r5 = (int) r3
            r4.height = r5
            r4.width = r1
            r14.setLayoutParams(r4)
        L_0x0168:
            float r2 = r2 / r3
            r1 = 1087722837(0x40d55555, float:6.6666665)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0198
            r1 = 1086324736(0x40c00000, float:6.0)
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0177
            goto L_0x0198
        L_0x0177:
            r1 = 1082130432(0x40800000, float:4.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x053b
            r0 = 1125515264(0x43160000, float:150.0)
            float r0 = r3 / r0
            if (r9 == 0) goto L_0x018c
            r1 = 1092616192(0x41200000, float:10.0)
            float r7 = r0 * r1
            r1 = 1
            r9.setTextSize(r1, r7)
            goto L_0x018d
        L_0x018c:
            r1 = 1
        L_0x018d:
            if (r10 == 0) goto L_0x053b
            r2 = 1091567616(0x41100000, float:9.0)
            float r0 = r0 * r2
            r10.setTextSize(r1, r0)
            goto L_0x053b
        L_0x0198:
            r1 = 1
            r2 = 1119092736(0x42b40000, float:90.0)
            float r2 = r3 / r2
            if (r9 == 0) goto L_0x01a6
            r3 = 1090519040(0x41000000, float:8.0)
            float r7 = r2 * r3
            r9.setTextSize(r1, r7)
        L_0x01a6:
            if (r10 == 0) goto L_0x053b
            r3 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 * r3
            r10.setTextSize(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            if (r1 == 0) goto L_0x053b
            android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r2)
            r1.topMargin = r0
            r10.setLayoutParams(r1)
            goto L_0x053b
        L_0x01c8:
            r7 = r17
            r1 = r19
            if (r10 == 0) goto L_0x01d9
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            int r2 = r2.height
            r17 = r8
            r19 = r9
            goto L_0x01de
        L_0x01d9:
            r17 = r8
            r19 = r9
            r2 = 0
        L_0x01de:
            r8 = 1092616192(0x41200000, float:10.0)
            int r9 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r8)
            float r2 = (float) r2
            float r2 = r3 - r2
            float r8 = (float) r9
            float r8 = r2 - r8
            int r8 = (int) r8
            int r6 = r6 * r8
            int r6 = r6 / r4
            r4 = 1077936128(0x40400000, float:3.0)
            float r9 = r28 / r4
            int r9 = (int) r9
            float r6 = (float) r6
            float r6 = r28 - r6
            float r4 = (float) r9
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x01fc
            int r9 = (int) r6
        L_0x01fc:
            r4 = 1094713344(0x41400000, float:12.0)
            r6 = r18
            if (r6 == 0) goto L_0x021a
            if (r13 == 0) goto L_0x021a
            r6.height = r8
            r18 = r11
            float r11 = (float) r9
            float r11 = r28 - r11
            r23 = r10
            int r10 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r4)
            float r10 = (float) r10
            float r11 = r11 - r10
            int r10 = (int) r11
            r6.width = r10
            r13.setLayoutParams(r6)
            goto L_0x021e
        L_0x021a:
            r23 = r10
            r18 = r11
        L_0x021e:
            if (r7 == 0) goto L_0x022b
            r7.height = r8
            float r8 = (float) r9
            float r8 = r28 - r8
            int r8 = (int) r8
            r7.width = r8
            r12.setLayoutParams(r7)
        L_0x022b:
            if (r1 == 0) goto L_0x0235
            int r8 = (int) r3
            r1.height = r8
            r1.width = r9
            r14.setLayoutParams(r1)
        L_0x0235:
            r8 = 1067030938(0x3f99999a, float:1.2)
            r9 = 1106247680(0x41f00000, float:30.0)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x02bf
            r4 = 1140457472(0x43fa0000, float:500.0)
            float r3 = r3 / r4
            if (r20 == 0) goto L_0x0256
            r4 = r20
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r5 = 1084227584(0x40a00000, float:5.0)
            int r5 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r5)
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = (int) r5
            r4.topMargin = r5
            r15.setLayoutParams(r4)
        L_0x0256:
            if (r6 == 0) goto L_0x0268
            if (r13 == 0) goto L_0x0268
            r4 = 1110179840(0x422c0000, float:43.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r4)
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            r6.height = r2
            r13.setLayoutParams(r6)
        L_0x0268:
            if (r7 == 0) goto L_0x0276
            r2 = r7
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r6 == 0) goto L_0x0273
            int r4 = r6.height
            r2.height = r4
        L_0x0273:
            r12.setLayoutParams(r2)
        L_0x0276:
            if (r1 == 0) goto L_0x0281
            if (r6 == 0) goto L_0x027e
            int r2 = r6.height
            r1.height = r2
        L_0x027e:
            r14.setLayoutParams(r1)
        L_0x0281:
            if (r23 == 0) goto L_0x0298
            android.view.ViewGroup$LayoutParams r1 = r23.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r9)
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = (int) r2
            r1.topMargin = r2
            r10 = r23
            r10.setLayoutParams(r1)
        L_0x0298:
            if (r16 == 0) goto L_0x02bb
            r1 = r16
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r2 = 1092616192(0x41200000, float:10.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r2)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = (int) r4
            r1.leftMargin = r4
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r2)
            float r0 = (float) r0
            float r3 = r3 * r0
            int r0 = (int) r3
            r1.rightMargin = r0
            r11 = r18
            r11.setLayoutParams(r1)
            goto L_0x053d
        L_0x02bb:
            r11 = r18
            goto L_0x053d
        L_0x02bf:
            r11 = r18
            r10 = r23
            r8 = 1070386381(0x3fcccccd, float:1.6)
            r9 = 1101004800(0x41a00000, float:20.0)
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x0371
            r4 = 1137180672(0x43c80000, float:400.0)
            float r3 = r3 / r4
            if (r19 == 0) goto L_0x02db
            r4 = 1092616192(0x41200000, float:10.0)
            float r5 = r3 * r4
            r8 = r19
            r4 = 1
            r8.setTextSize(r4, r5)
        L_0x02db:
            if (r20 == 0) goto L_0x02f0
            r4 = r20
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r5 = 1084227584(0x40a00000, float:5.0)
            int r8 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r5)
            float r5 = (float) r8
            float r5 = r5 * r3
            int r5 = (int) r5
            r4.topMargin = r5
            r15.setLayoutParams(r4)
        L_0x02f0:
            if (r10 == 0) goto L_0x0307
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r5 = 1092616192(0x41200000, float:10.0)
            int r8 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r5)
            float r5 = (float) r8
            float r5 = r5 * r3
            int r5 = (int) r5
            r4.topMargin = r5
            r10.setLayoutParams(r4)
        L_0x0307:
            if (r6 == 0) goto L_0x0319
            if (r13 == 0) goto L_0x0319
            r4 = 1103626240(0x41c80000, float:25.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r4)
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            r6.height = r2
            r13.setLayoutParams(r6)
        L_0x0319:
            if (r7 == 0) goto L_0x0333
            r2 = r7
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r6 == 0) goto L_0x0324
            int r4 = r6.height
            r2.height = r4
        L_0x0324:
            r4 = 1084227584(0x40a00000, float:5.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = (int) r4
            r2.topMargin = r4
            r12.setLayoutParams(r2)
        L_0x0333:
            if (r1 == 0) goto L_0x033e
            if (r6 == 0) goto L_0x033b
            int r2 = r6.height
            r1.height = r2
        L_0x033b:
            r14.setLayoutParams(r1)
        L_0x033e:
            if (r16 == 0) goto L_0x053d
            r1 = r16
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r2 = 1092616192(0x41200000, float:10.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r2)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = (int) r4
            r1.leftMargin = r4
            int r2 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r2)
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = (int) r2
            r1.rightMargin = r2
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r9)
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r1.height = r0
            r11.setLayoutParams(r1)
            r0 = 1091567616(0x41100000, float:9.0)
            float r3 = r3 * r0
            r0 = 1
            r11.setTextSize(r0, r3)
            goto L_0x053d
        L_0x0371:
            r8 = r19
            r1 = 1071882493(0x3fe3a0fd, float:1.7783505)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0400
            r1 = 1136787456(0x43c20000, float:388.0)
            float r1 = r3 / r1
            if (r20 == 0) goto L_0x0393
            r2 = r20
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 1086324736(0x40c00000, float:6.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.topMargin = r3
            r15.setLayoutParams(r2)
        L_0x0393:
            if (r8 == 0) goto L_0x039d
            r2 = 1092616192(0x41200000, float:10.0)
            float r3 = r1 * r2
            r2 = 1
            r8.setTextSize(r2, r3)
        L_0x039d:
            if (r7 == 0) goto L_0x03b5
            r2 = r7
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 0
            r2.rightMargin = r3
            r3 = 1090519040(0x41000000, float:8.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.topMargin = r4
            r12.setLayoutParams(r2)
            goto L_0x03b7
        L_0x03b5:
            r3 = 1090519040(0x41000000, float:8.0)
        L_0x03b7:
            if (r16 == 0) goto L_0x03e6
            r2 = r16
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.leftMargin = r4
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.rightMargin = r4
            r4 = 1092616192(0x41200000, float:10.0)
            int r5 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r4)
            float r4 = (float) r5
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.bottomMargin = r4
            r11.setLayoutParams(r2)
            float r7 = r1 * r3
            r2 = 1
            r11.setTextSize(r2, r7)
        L_0x03e6:
            if (r14 == 0) goto L_0x053d
            int r2 = r14.getTop()
            r3 = 1092616192(0x41200000, float:10.0)
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = r14.getBottom()
            r3 = 0
            r14.setPadding(r3, r2, r0, r1)
            goto L_0x053d
        L_0x0400:
            r1 = 1073741824(0x40000000, float:2.0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0484
            r1 = 1133903872(0x43960000, float:300.0)
            float r1 = r3 / r1
            if (r20 == 0) goto L_0x0429
            r2 = r20
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 1108082688(0x420c0000, float:35.0)
            int r5 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r5 = (float) r5
            float r5 = r5 * r1
            int r5 = (int) r5
            r2.width = r5
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.height = r3
            r15.setLayoutParams(r2)
        L_0x0429:
            if (r7 == 0) goto L_0x043d
            r2 = r7
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 1084227584(0x40a00000, float:5.0)
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.topMargin = r3
            r12.setLayoutParams(r2)
        L_0x043d:
            if (r8 == 0) goto L_0x0447
            r2 = 1090519040(0x41000000, float:8.0)
            float r7 = r1 * r2
            r2 = 1
            r8.setTextSize(r2, r7)
        L_0x0447:
            if (r16 == 0) goto L_0x053d
            r2 = r16
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r4)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.bottomMargin = r3
            r3 = 1086324736(0x40c00000, float:6.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.leftMargin = r4
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.rightMargin = r3
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r9)
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.height = r0
            r11.setLayoutParams(r2)
            r2 = 1090519040(0x41000000, float:8.0)
            float r1 = r1 * r2
            r4 = 1
            r11.setTextSize(r4, r1)
            goto L_0x053d
        L_0x0484:
            r2 = 1090519040(0x41000000, float:8.0)
            r4 = 1
            r1 = 1075032379(0x4013b13b, float:2.3076923)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0509
            r1 = 1132593152(0x43820000, float:260.0)
            float r1 = r3 / r1
            if (r8 == 0) goto L_0x0499
            float r3 = r1 * r2
            r8.setTextSize(r4, r3)
        L_0x0499:
            if (r20 == 0) goto L_0x04b8
            r2 = r20
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 1106247680(0x41f00000, float:30.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.width = r4
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.height = r3
            r15.setLayoutParams(r2)
        L_0x04b8:
            if (r7 == 0) goto L_0x04cd
            r2 = r7
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 1090519040(0x41000000, float:8.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.topMargin = r4
            r12.setLayoutParams(r2)
            goto L_0x04cf
        L_0x04cd:
            r3 = 1090519040(0x41000000, float:8.0)
        L_0x04cf:
            if (r16 == 0) goto L_0x053d
            r2 = r16
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2.bottomMargin = r3
            r3 = 1086324736(0x40c00000, float:6.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.leftMargin = r4
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r4 = (float) r4
            float r4 = r4 * r1
            int r4 = (int) r4
            r2.rightMargin = r4
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r9)
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            r2.height = r0
            r11.setLayoutParams(r2)
            float r1 = r1 * r3
            r0 = 1
            r11.setTextSize(r0, r1)
            goto L_0x053d
        L_0x0509:
            r1 = 1077936128(0x40400000, float:3.0)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x053d
            r1 = 1128792064(0x43480000, float:200.0)
            float r1 = r3 / r1
            if (r20 == 0) goto L_0x0525
            r2 = r20
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 1092616192(0x41200000, float:10.0)
            int r4 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            r2.topMargin = r4
            r15.setLayoutParams(r2)
            goto L_0x0527
        L_0x0525:
            r3 = 1092616192(0x41200000, float:10.0)
        L_0x0527:
            if (r16 == 0) goto L_0x053d
            r2 = r16
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = com.bytedance.sdk.openadsdk.utils.v.e(r0, r3)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            r2.bottomMargin = r0
            r11.setLayoutParams(r2)
            goto L_0x053d
        L_0x053b:
            r17 = r8
        L_0x053d:
            com.bytedance.sdk.openadsdk.TTImage r0 = r26.getIcon()
            if (r0 == 0) goto L_0x0556
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L_0x0556
            if (r15 == 0) goto L_0x0556
            com.bytedance.sdk.openadsdk.i.d r1 = com.bytedance.sdk.openadsdk.i.d.a()
            java.lang.String r0 = r0.getImageUrl()
            r1.a((java.lang.String) r0, (android.widget.ImageView) r15)
        L_0x0556:
            if (r11 == 0) goto L_0x055f
            java.lang.String r0 = r26.getButtonText()
            r11.setText(r0)
        L_0x055f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = r17
            r0.add(r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r11 == 0) goto L_0x0573
            r1.add(r11)
        L_0x0573:
            r2 = r8
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = r26
            r4 = r27
            r3.registerViewForInteraction(r2, r0, r1, r4)
            return r8
        L_0x057e:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.adapter.MediationAdapterUtil.setAdDataAndBuildBannerView(android.content.Context, com.bytedance.sdk.openadsdk.TTNativeAd, com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener, float, float):android.view.View");
    }

    public static void addNativeFeedMainView(Context context, int i, MediaView mediaView, View view, List<TTImage> list) {
        TTImage tTImage;
        if (context != null && mediaView != null) {
            if (i == 3 || i == 2 || i == 16 || i == 4 || i == 33) {
                View inflate = LayoutInflater.from(context).inflate(t.f(context, "tt_pangle_native_image_video_layout"), (ViewGroup) null);
                if (inflate != null) {
                    ImageView imageView = (ImageView) inflate.findViewById(t.e(context, "tt_main_image"));
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(t.e(context, "tt_layout_image_group"));
                    if (i != 4) {
                        imageView.setVisibility(0);
                        linearLayout.setVisibility(8);
                        if (list != null && !list.isEmpty() && (tTImage = list.get(0)) != null && tTImage.isValid()) {
                            d.a().a(tTImage.getImageUrl(), imageView);
                        }
                    } else if (list != null && list.size() >= 3) {
                        ImageView imageView2 = (ImageView) inflate.findViewById(t.e(context, "tt_group_image1"));
                        ImageView imageView3 = (ImageView) inflate.findViewById(t.e(context, "tt_group_image2"));
                        ImageView imageView4 = (ImageView) inflate.findViewById(t.e(context, "tt_group_image3"));
                        imageView.setVisibility(8);
                        linearLayout.setVisibility(0);
                        TTImage tTImage2 = list.get(0);
                        TTImage tTImage3 = list.get(1);
                        TTImage tTImage4 = list.get(2);
                        if (!(tTImage2 == null || !tTImage2.isValid() || imageView2 == null)) {
                            d.a().a(tTImage2.getImageUrl(), imageView2);
                        }
                        if (!(tTImage3 == null || !tTImage3.isValid() || imageView3 == null)) {
                            d.a().a(tTImage4.getImageUrl(), imageView3);
                        }
                        if (!(tTImage4 == null || !tTImage4.isValid() || imageView4 == null)) {
                            d.a().a(tTImage4.getImageUrl(), imageView3);
                        }
                    }
                    mediaView.removeAllViews();
                    mediaView.addView(inflate, -1, -1);
                }
            } else if ((i == 5 || i == 15 || i == 50) && view != null && view.getParent() == null) {
                mediaView.removeAllViews();
                mediaView.addView(view, -1, -1);
            }
        }
    }
}

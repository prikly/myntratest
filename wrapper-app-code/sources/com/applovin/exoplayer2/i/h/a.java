package com.applovin.exoplayer2.i.h;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.List;
import kotlin.KotlinVersion;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final y f13146a = new y();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13147b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13148c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13149d;

    /* renamed from: e  reason: collision with root package name */
    private final String f13150e;

    /* renamed from: f  reason: collision with root package name */
    private final float f13151f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13152g;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = true;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f13148c = bArr[24];
            this.f13149d = ((bArr[26] & 255) << Ascii.CAN) | ((bArr[27] & 255) << Ascii.DLE) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f13150e = "Serif".equals(ai.a(bArr, 43, bArr.length - 43)) ? "serif" : str;
            this.f13152g = bArr[25] * Ascii.DC4;
            z = (bArr[0] & 32) == 0 ? false : z;
            this.f13147b = z;
            if (z) {
                this.f13151f = ai.a(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f13152g), 0.0f, 0.95f);
            } else {
                this.f13151f = 0.85f;
            }
        } else {
            this.f13148c = 0;
            this.f13149d = -1;
            this.f13150e = str;
            this.f13147b = false;
            this.f13151f = 0.85f;
            this.f13152g = -1;
        }
    }

    private static String a(y yVar) throws h {
        char g2;
        a(yVar.a() >= 2);
        int i = yVar.i();
        if (i == 0) {
            return "";
        }
        return yVar.a(i, (yVar.a() < 2 || !((g2 = yVar.g()) == 65279 || g2 == 65534)) ? Charsets.UTF_8 : Charsets.UTF_16);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L_0x004c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x000c
            r10 = 1
            goto L_0x000d
        L_0x000c:
            r10 = 0
        L_0x000d:
            r2 = r6 & 2
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r10 == 0) goto L_0x0023
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L_0x001f
            r4 = 3
            r3.<init>(r4)
            goto L_0x002b
        L_0x001f:
            r3.<init>(r1)
            goto L_0x002b
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L_0x002b:
            r5.setSpan(r3, r8, r9, r7)
        L_0x002e:
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x003e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L_0x003e:
            if (r1 != 0) goto L_0x004c
            if (r10 != 0) goto L_0x004c
            if (r2 != 0) goto L_0x004c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.h.a.a(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    private void a(y yVar, SpannableStringBuilder spannableStringBuilder) throws h {
        int i;
        a(yVar.a() >= 12);
        int i2 = yVar.i();
        int i3 = yVar.i();
        yVar.e(2);
        int h2 = yVar.h();
        yVar.e(1);
        int q = yVar.q();
        if (i3 > spannableStringBuilder.length()) {
            q.c("Tx3gDecoder", "Truncating styl end (" + i3 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            i = spannableStringBuilder.length();
        } else {
            i = i3;
        }
        if (i2 >= i) {
            q.c("Tx3gDecoder", "Ignoring styl with start (" + i2 + ") >= end (" + i + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i4 = i2;
        int i5 = i;
        a(spannableStringBuilder2, h2, this.f13148c, i4, i5, 0);
        b(spannableStringBuilder2, q, this.f13149d, i4, i5, 0);
    }

    private static void a(boolean z) throws h {
        if (!z) {
            throw new h("Unexpected subtitle format.");
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i3, i4, i5 | 33);
        }
    }

    /* access modifiers changed from: protected */
    public f a(byte[] bArr, int i, boolean z) throws h {
        this.f13146a.a(bArr, i);
        String a2 = a(this.f13146a);
        if (a2.isEmpty()) {
            return b.f13153a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        a(spannableStringBuilder2, this.f13148c, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder2, this.f13149d, -1, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.f13150e, 0, spannableStringBuilder.length());
        float f2 = this.f13151f;
        while (this.f13146a.a() >= 8) {
            int c2 = this.f13146a.c();
            int q = this.f13146a.q();
            int q2 = this.f13146a.q();
            boolean z2 = true;
            if (q2 == 1937013100) {
                if (this.f13146a.a() < 2) {
                    z2 = false;
                }
                a(z2);
                int i2 = this.f13146a.i();
                for (int i3 = 0; i3 < i2; i3++) {
                    a(this.f13146a, spannableStringBuilder);
                }
            } else if (q2 == 1952608120 && this.f13147b) {
                if (this.f13146a.a() < 2) {
                    z2 = false;
                }
                a(z2);
                f2 = ai.a(((float) this.f13146a.i()) / ((float) this.f13152g), 0.0f, 0.95f);
            }
            this.f13146a.d(c2 + q);
        }
        return new b(new a.C0125a().a((CharSequence) spannableStringBuilder).a(f2, 0).a(0).e());
    }
}

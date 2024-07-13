package com.applovin.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.d.b;

final class j {
    public static float a(int i, float f2, int i2, int i3) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f3 = (float) i3;
        } else if (i == 1) {
            f3 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f2;
        }
        return f2 * f3;
    }

    private static void a(Spannable spannable, Predicate<Object> predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void a(a.C0125a aVar) {
        aVar.d();
        if (aVar.a() instanceof Spanned) {
            if (!(aVar.a() instanceof Spannable)) {
                aVar.a((CharSequence) SpannableString.valueOf(aVar.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(aVar.a()), $$Lambda$j$Wj07K9zwq_368d5eEbFmnr85nI.INSTANCE);
        }
        b(aVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void b(a.C0125a aVar) {
        aVar.b(-3.4028235E38f, RecyclerView.UNDEFINED_DURATION);
        if (aVar.a() instanceof Spanned) {
            if (!(aVar.a() instanceof Spannable)) {
                aVar.a((CharSequence) SpannableString.valueOf(aVar.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(aVar.a()), $$Lambda$j$YbwFiXWaIGPVam87Gsv5lmdzf80.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof b);
    }
}

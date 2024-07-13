package com.yandex.metrica.impl.ob;

import com.appnext.base.a.c.d;
import com.yandex.metrica.impl.ob.C0685rl;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.bl  reason: case insensitive filesystem */
public class C0289bl extends C0685rl {

    /* renamed from: h  reason: collision with root package name */
    public String f5559h;
    public final int i;
    public Integer j;
    public final boolean k;
    public final b l;
    public final Float m;
    public final Float n;
    public final Float o;
    public final String p;
    public final Boolean q;
    public final Boolean r;
    public Integer s;

    /* renamed from: com.yandex.metrica.impl.ob.bl$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5560a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.text.TextUtils$TruncateAt[] r0 = android.text.TextUtils.TruncateAt.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5560a = r0
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5560a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5560a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5560a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.MARQUEE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0289bl.a.<clinit>():void");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.bl$b */
    enum b {
        START("START"),
        END("END"),
        MIDDLE("MIDDLE"),
        MARQUEE("MARQUEE"),
        NONE("NONE"),
        UNKNOWN("UNKNOWN");
        

        /* renamed from: a  reason: collision with root package name */
        final String f5568a;

        private b(String str) {
            this.f5568a = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0289bl(String str, String str2, C0685rl.b bVar, int i2, boolean z, C0685rl.a aVar, String str3, Float f2, Float f3, Float f4, String str4, Boolean bool, Boolean bool2, boolean z2, int i3, b bVar2) {
        super(str, str2, (C0685rl.b) null, i2, z, C0685rl.c.VIEW, aVar);
        this.f5559h = str3;
        this.i = i3;
        this.l = bVar2;
        this.k = z2;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = str4;
        this.q = bool;
        this.r = bool2;
    }

    /* access modifiers changed from: package-private */
    public C0685rl.b a(Ak ak) {
        C0685rl.b bVar = this.f6735c;
        return bVar == null ? ak.a(this.f5559h) : bVar;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return true;
    }

    public String toString() {
        return "TextViewElement{mText='" + this.f5559h + '\'' + ", mVisibleTextLength=" + this.i + ", mOriginalTextLength=" + this.j + ", mIsVisible=" + this.k + ", mTextShorteningType=" + this.l + ", mSizePx=" + this.m + ", mSizeDp=" + this.n + ", mSizeSp=" + this.o + ", mColor='" + this.p + '\'' + ", mIsBold=" + this.q + ", mIsItalic=" + this.r + ", mRelativeTextSize=" + this.s + ", mClassName='" + this.f6733a + '\'' + ", mId='" + this.f6734b + '\'' + ", mParseFilterReason=" + this.f6735c + ", mDepth=" + this.f6736d + ", mListItem=" + this.f6737e + ", mViewType=" + this.f6738f + ", mClassType=" + this.f6739g + '}';
    }

    /* access modifiers changed from: package-private */
    public JSONArray a(C0439hl hlVar) {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            String str = this.f5559h;
            if (str.length() > hlVar.l) {
                this.j = Integer.valueOf(this.f5559h.length());
                str = this.f5559h.substring(0, hlVar.l);
            }
            jSONObject.put(d.COLUMN_TYPE, "TEXT");
            jSONObject.put("vl", str);
            jSONObject.put("i", a(hlVar, str));
            jSONArray.put(jSONObject);
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    private JSONObject a(C0439hl hlVar, String str) {
        int i2;
        JSONObject jSONObject = new JSONObject();
        try {
            if (hlVar.f5943a) {
                jSONObject.putOpt("sp", this.m).putOpt("sd", this.n).putOpt("ss", this.o);
            }
            if (hlVar.f5944b) {
                jSONObject.put("rts", this.s);
            }
            if (hlVar.f5946d) {
                jSONObject.putOpt("c", this.p).putOpt("ib", this.q).putOpt("ii", this.r);
            }
            if (hlVar.f5945c) {
                jSONObject.put("vtl", this.i).put("iv", this.k).put("tst", this.l.f5568a);
            }
            Integer num = this.j;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = this.f5559h.length();
            }
            if (hlVar.f5949g) {
                jSONObject.put("tl", str.length()).put("otl", i2);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}

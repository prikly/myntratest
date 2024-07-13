package com.explorestack.iab.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;

public class IabElementStyle implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public Integer f3059a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f3060b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f3061c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f3062d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f3063e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f3064f;

    /* renamed from: g  reason: collision with root package name */
    public String f3065g;

    /* renamed from: h  reason: collision with root package name */
    public Float f3066h;
    public Float i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public Integer p;
    public Integer q;
    public String r;
    public Float s;
    public Float t;
    public Float u;
    public Integer v;
    public Float w;

    public IabElementStyle() {
    }

    public IabElementStyle(IabElementStyle iabElementStyle) {
        merge(iabElementStyle);
    }

    public void applyAlignment(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = positionAsGravity();
    }

    public void applyMargin(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = getMarginLeft(context).intValue();
        marginLayoutParams.topMargin = getMarginTop(context).intValue();
        marginLayoutParams.rightMargin = getMarginRight(context).intValue();
        marginLayoutParams.bottomMargin = getMarginBottom(context).intValue();
    }

    public void applyPadding(Context context, View view) {
        view.setPadding(getPaddingLeft(context).intValue(), getPaddingTop(context).intValue(), getPaddingRight(context).intValue(), getPaddingBottom(context).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r0 != 17) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyRelativeAlignment(android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.getHorizontalPosition()
            int r0 = r0.intValue()
            r1 = 17
            r2 = 1
            if (r0 == r2) goto L_0x001c
            r2 = 3
            if (r0 == r2) goto L_0x0019
            r2 = 5
            if (r0 == r2) goto L_0x0016
            if (r0 == r1) goto L_0x001c
            goto L_0x0021
        L_0x0016:
            r0 = 11
            goto L_0x001e
        L_0x0019:
            r0 = 9
            goto L_0x001e
        L_0x001c:
            r0 = 14
        L_0x001e:
            r4.addRule(r0)
        L_0x0021:
            java.lang.Integer r0 = r3.getVerticalPosition()
            int r0 = r0.intValue()
            r2 = 16
            if (r0 == r2) goto L_0x003e
            if (r0 == r1) goto L_0x003e
            r1 = 48
            if (r0 == r1) goto L_0x003b
            r1 = 80
            if (r0 == r1) goto L_0x0038
            goto L_0x0043
        L_0x0038:
            r0 = 12
            goto L_0x0040
        L_0x003b:
            r0 = 10
            goto L_0x0040
        L_0x003e:
            r0 = 15
        L_0x0040:
            r4.addRule(r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.utils.IabElementStyle.applyRelativeAlignment(android.widget.RelativeLayout$LayoutParams):void");
    }

    public IabElementStyle copyWith(IabElementStyle iabElementStyle) {
        IabElementStyle iabElementStyle2 = new IabElementStyle();
        iabElementStyle2.merge(this);
        iabElementStyle2.merge(iabElementStyle);
        return iabElementStyle2;
    }

    public String getContent() {
        return this.r;
    }

    public Integer getFillColor() {
        Integer num = this.f3060b;
        return num != null ? num : Integer.valueOf(Assets.backgroundColor);
    }

    public Float getFontSize(Context context) {
        Float f2 = this.w;
        return Float.valueOf((float) Utils.dpToPx(context, f2 != null ? f2.floatValue() : 16.0f));
    }

    public Integer getFontStyle() {
        Integer num = this.v;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public Integer getHeight(Context context) {
        Float f2 = this.u;
        return Integer.valueOf(f2 != null ? (f2.floatValue() == -1.0f || this.u.floatValue() == -2.0f) ? this.u.intValue() : Utils.dpToPx(context, this.u.floatValue()) : -2);
    }

    public Float getHideAfter() {
        return this.i;
    }

    public Integer getHorizontalPosition() {
        Integer num = this.f3063e;
        if (num != null) {
            return num;
        }
        return 3;
    }

    public Integer getMarginBottom(Context context) {
        Integer num = this.q;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getMarginLeft(Context context) {
        Integer num = this.n;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getMarginRight(Context context) {
        Integer num = this.p;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getMarginTop(Context context) {
        Integer num = this.o;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Float getOpacity() {
        Float f2 = this.f3066h;
        return f2 != null ? f2 : Float.valueOf(1.0f);
    }

    public Integer getPaddingBottom(Context context) {
        Integer num = this.m;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getPaddingLeft(Context context) {
        Integer num = this.j;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getPaddingRight(Context context) {
        Integer num = this.k;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getPaddingTop(Context context) {
        Integer num = this.l;
        return Integer.valueOf(num != null ? Utils.dpToPx(context, (float) num.intValue()) : 0);
    }

    public Integer getStrokeColor() {
        Integer num = this.f3059a;
        return num != null ? num : Integer.valueOf(Assets.mainAssetsColor);
    }

    public Float getStrokeWidth(Context context) {
        Float f2 = this.s;
        return Float.valueOf(f2 != null ? (float) Utils.dpToPx(context, f2.floatValue()) : 0.0f);
    }

    public String getStyle() {
        return this.f3065g;
    }

    public Integer getVerticalPosition() {
        Integer num = this.f3064f;
        if (num != null) {
            return num;
        }
        return 48;
    }

    public Integer getWidth(Context context) {
        Float f2 = this.t;
        return Integer.valueOf(f2 != null ? (f2.floatValue() == -1.0f || this.t.floatValue() == -2.0f) ? this.t.intValue() : Utils.dpToPx(context, this.t.floatValue()) : -2);
    }

    public boolean hasFillColor() {
        return this.f3060b != null;
    }

    public boolean hasStrokeColor() {
        return this.f3059a != null;
    }

    public Boolean isOutlined() {
        Boolean bool = this.f3061c;
        return bool != null ? bool : Boolean.FALSE;
    }

    public Boolean isVisible() {
        Boolean bool = this.f3062d;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void merge(IabElementStyle iabElementStyle) {
        if (iabElementStyle != null) {
            Integer num = iabElementStyle.f3059a;
            if (num != null) {
                this.f3059a = num;
            }
            Integer num2 = iabElementStyle.f3060b;
            if (num2 != null) {
                this.f3060b = num2;
            }
            Boolean bool = iabElementStyle.f3061c;
            if (bool != null) {
                this.f3061c = bool;
            }
            Boolean bool2 = iabElementStyle.f3062d;
            if (bool2 != null) {
                this.f3062d = bool2;
            }
            Integer num3 = iabElementStyle.f3063e;
            if (num3 != null) {
                this.f3063e = num3;
            }
            Integer num4 = iabElementStyle.f3064f;
            if (num4 != null) {
                this.f3064f = num4;
            }
            String str = iabElementStyle.f3065g;
            if (str != null) {
                this.f3065g = str;
            }
            Float f2 = iabElementStyle.f3066h;
            if (f2 != null) {
                this.f3066h = f2;
            }
            Float f3 = iabElementStyle.i;
            if (f3 != null) {
                this.i = f3;
            }
            Integer num5 = iabElementStyle.j;
            if (num5 != null) {
                this.j = num5;
            }
            Integer num6 = iabElementStyle.k;
            if (num6 != null) {
                this.k = num6;
            }
            Integer num7 = iabElementStyle.l;
            if (num7 != null) {
                this.l = num7;
            }
            Integer num8 = iabElementStyle.m;
            if (num8 != null) {
                this.m = num8;
            }
            Integer num9 = iabElementStyle.n;
            if (num9 != null) {
                this.n = num9;
            }
            Integer num10 = iabElementStyle.p;
            if (num10 != null) {
                this.p = num10;
            }
            Integer num11 = iabElementStyle.o;
            if (num11 != null) {
                this.o = num11;
            }
            Integer num12 = iabElementStyle.q;
            if (num12 != null) {
                this.q = num12;
            }
            String str2 = iabElementStyle.r;
            if (str2 != null) {
                this.r = str2;
            }
            Float f4 = iabElementStyle.s;
            if (f4 != null) {
                this.s = f4;
            }
            Float f5 = iabElementStyle.t;
            if (f5 != null) {
                this.t = f5;
            }
            Float f6 = iabElementStyle.u;
            if (f6 != null) {
                this.u = f6;
            }
            Integer num13 = iabElementStyle.v;
            if (num13 != null) {
                this.v = num13;
            }
            Float f7 = iabElementStyle.w;
            if (f7 != null) {
                this.w = f7;
            }
        }
    }

    public int positionAsGravity() {
        return getVerticalPosition().intValue() | getHorizontalPosition().intValue();
    }

    public void setContent(String str) {
        this.r = str;
    }

    public void setFillColor(Integer num) {
        this.f3060b = num;
    }

    public void setFontSize(Float f2) {
        this.w = f2;
    }

    public void setFontStyle(Integer num) {
        this.v = num;
    }

    public void setHeight(Number number) {
        this.u = Float.valueOf(number.floatValue());
    }

    public void setHideAfter(Float f2) {
        this.i = f2;
    }

    public void setHorizontalPosition(Integer num) {
        this.f3063e = num;
    }

    public void setMargin(Integer num, Integer num2, Integer num3, Integer num4) {
        this.n = num;
        this.o = num2;
        this.p = num3;
        this.q = num4;
    }

    public void setMargin(String str) {
        if (TextUtils.isEmpty(str)) {
            setMargin((Integer) null, (Integer) null, (Integer) null, (Integer) null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = Utils.convertCssSizeToPx(split[0]).intValue();
            setMargin(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
        } else if (split.length == 2) {
            int intValue2 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue3 = Utils.convertCssSizeToPx(split[1]).intValue();
            setMargin(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else if (split.length == 3) {
            int intValue4 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue5 = Utils.convertCssSizeToPx(split[1]).intValue();
            setMargin(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        } else if (split.length == 4) {
            setMargin(Integer.valueOf(Utils.convertCssSizeToPx(split[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        }
    }

    public void setOpacity(Float f2) {
        this.f3066h = f2;
    }

    public void setOutlined(Boolean bool) {
        this.f3061c = bool;
    }

    public void setPadding(Integer num, Integer num2, Integer num3, Integer num4) {
        this.j = num;
        this.l = num2;
        this.k = num3;
        this.m = num4;
    }

    public void setPadding(String str) {
        if (TextUtils.isEmpty(str)) {
            setPadding((Integer) null, (Integer) null, (Integer) null, (Integer) null);
            return;
        }
        String[] split = str.split(" ");
        if (split.length == 1) {
            int intValue = Utils.convertCssSizeToPx(split[0]).intValue();
            setPadding(Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue), Integer.valueOf(intValue));
        } else if (split.length == 2) {
            int intValue2 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue3 = Utils.convertCssSizeToPx(split[1]).intValue();
            setPadding(Integer.valueOf(intValue3), Integer.valueOf(intValue2), Integer.valueOf(intValue3), Integer.valueOf(intValue2));
        } else if (split.length == 3) {
            int intValue4 = Utils.convertCssSizeToPx(split[0]).intValue();
            int intValue5 = Utils.convertCssSizeToPx(split[1]).intValue();
            setPadding(Integer.valueOf(intValue5), Integer.valueOf(intValue4), Integer.valueOf(intValue5), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        } else if (split.length == 4) {
            setPadding(Integer.valueOf(Utils.convertCssSizeToPx(split[3]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[0]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[1]).intValue()), Integer.valueOf(Utils.convertCssSizeToPx(split[2]).intValue()));
        }
    }

    public void setStrokeColor(Integer num) {
        this.f3059a = num;
    }

    public void setStrokeWidth(Float f2) {
        this.s = f2;
    }

    public void setStyle(String str) {
        this.f3065g = str;
    }

    public void setVerticalPosition(Integer num) {
        this.f3064f = num;
    }

    public void setVisible(Boolean bool) {
        this.f3062d = bool;
    }

    public void setWidth(Number number) {
        this.t = Float.valueOf(number.floatValue());
    }
}

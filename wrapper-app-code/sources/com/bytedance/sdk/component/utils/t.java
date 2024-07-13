package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.onesignal.outcomes.OSOutcomeConstants;

/* compiled from: ResourceHelp */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static String f19264a;

    /* renamed from: b  reason: collision with root package name */
    private static Resources f19265b;

    /* renamed from: c  reason: collision with root package name */
    private static Context f19266c;

    public static void a(String str) {
        f19264a = str;
    }

    private static String b(Context context) {
        if (f19264a == null) {
            f19264a = context.getPackageName();
        }
        return f19264a;
    }

    private static int a(Context context, String str, String str2) {
        if (f19265b == null) {
            f19265b = context.getResources();
        }
        return f19265b.getIdentifier(str, str2, b(context));
    }

    public static String a(Context context, String str) {
        Context context2 = f19266c;
        if (context2 == null) {
            return context.getResources().getString(b(context, str));
        }
        return context2.getResources().getString(b(f19266c, str));
    }

    public static void a(Context context) {
        f19266c = context;
    }

    public static int b(Context context, String str) {
        return a(context, str, "string");
    }

    public static Drawable c(Context context, String str) {
        return context.getResources().getDrawable(d(context, str));
    }

    public static int d(Context context, String str) {
        return a(context, str, "drawable");
    }

    public static int e(Context context, String str) {
        return a(context, str, OSOutcomeConstants.OUTCOME_ID);
    }

    public static int f(Context context, String str) {
        return a(context, str, "layout");
    }

    public static int g(Context context, String str) {
        return a(context, str, "style");
    }

    public static int h(Context context, String str) {
        return a(context, str, "attr");
    }

    public static int i(Context context, String str) {
        return a(context, str, "dimen");
    }

    public static int j(Context context, String str) {
        return context.getResources().getColor(k(context, str));
    }

    public static int k(Context context, String str) {
        return a(context, str, "color");
    }

    public static int l(Context context, String str) {
        return a(context, str, "anim");
    }

    public static int m(Context context, String str) {
        return a(context, str, "integer");
    }

    public static int n(Context context, String str) {
        return context.getResources().getInteger(m(context, str));
    }
}

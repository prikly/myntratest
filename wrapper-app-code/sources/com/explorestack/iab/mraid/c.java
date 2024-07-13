package com.explorestack.iab.mraid;

import android.content.Context;
import java.util.Arrays;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2987a;

    /* renamed from: b  reason: collision with root package name */
    public int f2988b;

    public c(boolean z, int i) {
        this.f2987a = z;
        this.f2988b = i;
    }

    public static int a(String str) {
        int indexOf = Arrays.asList(new String[]{"portrait", "landscape", "none"}).indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    public int a(Context context) {
        int i = context.getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i2 = this.f2988b;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        if (this.f2987a) {
            return -1;
        }
        return i;
    }

    public String a() {
        int i = this.f2988b;
        return i != 0 ? i != 1 ? i != 2 ? "error" : "none" : "landscape" : "portrait";
    }

    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.f2987a + ", forceOrientation=" + a() + '}';
    }
}

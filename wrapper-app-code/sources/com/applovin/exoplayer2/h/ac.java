package com.applovin.exoplayer2.h;

import android.os.Bundle;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.c;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.v;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.List;

public final class ac implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final g.a<ac> f12748b = $$Lambda$ac$L_aEfpqtzq0pMYyjg9Q7hkABVWg.INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public final int f12749a;

    /* renamed from: c  reason: collision with root package name */
    private final v[] f12750c;

    /* renamed from: d  reason: collision with root package name */
    private int f12751d;

    public ac(v... vVarArr) {
        a.a(vVarArr.length > 0);
        this.f12750c = vVarArr;
        this.f12749a = vVarArr.length;
        a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ac a(Bundle bundle) {
        return new ac((v[]) c.a(v.F, (List<Bundle>) bundle.getParcelableArrayList(b(0)), s.g()).toArray(new v[0]));
    }

    private static String a(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private void a() {
        String str;
        String str2;
        String str3;
        String a2 = a(this.f12750c[0].f13924c);
        int c2 = c(this.f12750c[0].f13926e);
        int i = 1;
        while (true) {
            v[] vVarArr = this.f12750c;
            if (i >= vVarArr.length) {
                return;
            }
            if (!a2.equals(a(vVarArr[i].f13924c))) {
                str = this.f12750c[0].f13924c;
                str2 = this.f12750c[i].f13924c;
                str3 = "languages";
                break;
            } else if (c2 != c(this.f12750c[i].f13926e)) {
                str = Integer.toBinaryString(this.f12750c[0].f13926e);
                str2 = Integer.toBinaryString(this.f12750c[i].f13926e);
                str3 = "role flags";
                break;
            } else {
                i++;
            }
        }
        a(str3, str, str2, i);
    }

    private static void a(String str, String str2, String str3, int i) {
        q.c("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    private static int c(int i) {
        return i | 16384;
    }

    public int a(v vVar) {
        int i = 0;
        while (true) {
            v[] vVarArr = this.f12750c;
            if (i >= vVarArr.length) {
                return -1;
            }
            if (vVar == vVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public v a(int i) {
        return this.f12750c[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.f12749a == acVar.f12749a && Arrays.equals(this.f12750c, acVar.f12750c);
    }

    public int hashCode() {
        if (this.f12751d == 0) {
            this.f12751d = IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Arrays.hashCode(this.f12750c);
        }
        return this.f12751d;
    }
}

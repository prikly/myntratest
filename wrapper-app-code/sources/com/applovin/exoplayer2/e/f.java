package com.applovin.exoplayer2.e;

import android.net.Uri;
import com.applovin.exoplayer2.e.b.b;
import com.applovin.exoplayer2.e.e.d;
import com.applovin.exoplayer2.e.g.g;
import com.applovin.exoplayer2.e.i.a;
import com.applovin.exoplayer2.e.i.ac;
import com.applovin.exoplayer2.e.i.c;
import com.applovin.exoplayer2.e.i.e;
import com.applovin.exoplayer2.e.i.w;
import com.applovin.exoplayer2.l.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11948b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor<? extends h> f11949c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11950d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11951e;

    /* renamed from: f  reason: collision with root package name */
    private int f11952f;

    /* renamed from: g  reason: collision with root package name */
    private int f11953g;

    /* renamed from: h  reason: collision with root package name */
    private int f11954h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m = 1;
    private int n;
    private int o = 112800;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.applovin.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.applovin.exoplayer2.ext.flac.FlacExtractor").asSubclass(h.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f11949c = constructor;
    }

    private void a(int i2, List<h> list) {
        Object obj;
        int i3 = 2;
        switch (i2) {
            case 0:
                obj = new a();
                break;
            case 1:
                obj = new c();
                break;
            case 2:
                boolean z = this.f11952f | this.f11950d;
                if (!this.f11951e) {
                    i3 = 0;
                }
                obj = new e(i3 | z ? 1 : 0);
                break;
            case 3:
                boolean z2 = this.f11953g | this.f11950d;
                if (!this.f11951e) {
                    i3 = 0;
                }
                obj = new com.applovin.exoplayer2.e.a.a(i3 | z2 ? 1 : 0);
                break;
            case 4:
                Constructor<? extends h> constructor = f11949c;
                if (constructor == null) {
                    obj = new b(this.f11954h);
                    break;
                } else {
                    try {
                        list.add((h) constructor.newInstance(new Object[]{Integer.valueOf(this.f11954h)}));
                        return;
                    } catch (Exception e2) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
                    }
                }
            case 5:
                obj = new com.applovin.exoplayer2.e.c.b();
                break;
            case 6:
                obj = new d(this.i);
                break;
            case 7:
                boolean z3 = this.l | this.f11950d;
                if (!this.f11951e) {
                    i3 = 0;
                }
                obj = new com.applovin.exoplayer2.e.f.d(i3 | z3 ? 1 : 0);
                break;
            case 8:
                list.add(new com.applovin.exoplayer2.e.g.e(this.k));
                obj = new g(this.j);
                break;
            case 9:
                obj = new com.applovin.exoplayer2.e.h.c();
                break;
            case 10:
                obj = new w();
                break;
            case 11:
                obj = new ac(this.m, this.n, this.o);
                break;
            case 12:
                obj = new com.applovin.exoplayer2.e.j.a();
                break;
            case 14:
                obj = new com.applovin.exoplayer2.e.d.a();
                break;
            default:
                return;
        }
        list.add(obj);
    }

    public synchronized h[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int a2 = l.a(map);
        if (a2 != -1) {
            a(a2, (List<h>) arrayList);
        }
        int a3 = l.a(uri);
        if (!(a3 == -1 || a3 == a2)) {
            a(a3, (List<h>) arrayList);
        }
        for (int i2 : f11948b) {
            if (!(i2 == a2 || i2 == a3)) {
                a(i2, (List<h>) arrayList);
            }
        }
        return (h[]) arrayList.toArray(new h[arrayList.size()]);
    }

    public synchronized h[] createExtractors() {
        return a(Uri.EMPTY, (Map<String, List<String>>) new HashMap());
    }
}

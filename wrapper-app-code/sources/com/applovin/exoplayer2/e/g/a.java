package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinVersion;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f11981a;

    /* renamed from: com.applovin.exoplayer2.e.g.a$a  reason: collision with other inner class name */
    static final class C0116a extends a {

        /* renamed from: b  reason: collision with root package name */
        public final long f11982b;

        /* renamed from: c  reason: collision with root package name */
        public final List<b> f11983c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List<C0116a> f11984d = new ArrayList();

        public C0116a(int i, long j) {
            super(i);
            this.f11982b = j;
        }

        public void a(C0116a aVar) {
            this.f11984d.add(aVar);
        }

        public void a(b bVar) {
            this.f11983c.add(bVar);
        }

        public b d(int i) {
            int size = this.f11983c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.f11983c.get(i2);
                if (bVar.f11981a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public C0116a e(int i) {
            int size = this.f11984d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0116a aVar = this.f11984d.get(i2);
                if (aVar.f11981a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public String toString() {
            return c(this.f11981a) + " leaves: " + Arrays.toString(this.f11983c.toArray()) + " containers: " + Arrays.toString(this.f11984d.toArray());
        }
    }

    static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public final y f11985b;

        public b(int i, y yVar) {
            super(i);
            this.f11985b = yVar;
        }
    }

    public a(int i) {
        this.f11981a = i;
    }

    public static int a(int i) {
        return (i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE;
    }

    public static int b(int i) {
        return i & 16777215;
    }

    public static String c(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public String toString() {
        return c(this.f11981a);
    }
}

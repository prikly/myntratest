package com.yandex.metrica.impl.ob;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.jb  reason: case insensitive filesystem */
public final class C0478jb {

    /* renamed from: a  reason: collision with root package name */
    private final M0 f6063a;

    /* renamed from: com.yandex.metrica.impl.ob.jb$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f6064a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6065b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6066c;

        /* renamed from: d  reason: collision with root package name */
        private final String f6067d;

        public a() {
            this(false, 0, 0, (String) null, 15);
        }

        public a(boolean z, int i, int i2, String str) {
            this.f6064a = z;
            this.f6065b = i;
            this.f6066c = i2;
            this.f6067d = str;
        }

        public final String a() {
            return this.f6067d;
        }

        public final int b() {
            return this.f6065b;
        }

        public final int c() {
            return this.f6066c;
        }

        public final boolean d() {
            return this.f6064a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6064a == aVar.f6064a && this.f6065b == aVar.f6065b && this.f6066c == aVar.f6066c && Intrinsics.areEqual((Object) this.f6067d, (Object) aVar.f6067d);
        }

        public int hashCode() {
            boolean z = this.f6064a;
            if (z) {
                z = true;
            }
            int i = (((((z ? 1 : 0) * true) + this.f6065b) * 31) + this.f6066c) * 31;
            String str = this.f6067d;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "RequestReport(success=" + this.f6064a + ", httpStatus=" + this.f6065b + ", size=" + this.f6066c + ", failureReason=" + this.f6067d + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z, int i, int i2, String str, int i3) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (String) null);
        }
    }

    public C0478jb(Uh uh, M0 m0) {
        this.f6063a = !uh.e() ? null : m0;
    }

    public final void a(a aVar) {
        M0 m0 = this.f6063a;
        if (m0 != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("status", aVar.d() ? "OK" : "FAILED");
            pairArr[1] = TuplesKt.to("http_status", Integer.valueOf(aVar.b()));
            pairArr[2] = TuplesKt.to("size", Integer.valueOf(aVar.c()));
            Map mutableMapOf = MapsKt.mutableMapOf(pairArr);
            String a2 = aVar.a();
            if (a2 != null) {
                mutableMapOf.put(IronSourceConstants.EVENTS_ERROR_REASON, a2);
            }
            m0.reportEvent("egress_status", (Map<String, Object>) MapsKt.toMap(mutableMapOf));
        }
    }
}

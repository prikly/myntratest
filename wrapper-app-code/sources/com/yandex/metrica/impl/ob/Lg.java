package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.Hg;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Lg extends Hg {
    private boolean A;
    private String B;
    private List<String> C;
    private int D;
    private long E;
    private long F;
    private boolean G;
    private long H;
    private List<String> I;
    private boolean o;
    private Location p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    private int u;
    private Boolean v;
    private e w;
    private final d x;
    private String y;
    private boolean z;

    public static final class a extends Eg.a<D3.a, a> {

        /* renamed from: d  reason: collision with root package name */
        public final String f4498d;

        /* renamed from: e  reason: collision with root package name */
        public final Location f4499e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f4500f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f4501g;

        /* renamed from: h  reason: collision with root package name */
        public final int f4502h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final Map<String, String> m;
        public final int n;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(com.yandex.metrica.impl.ob.D3.a r16) {
            /*
                r15 = this;
                r0 = r16
                java.lang.String r1 = r0.f3850a
                java.lang.String r2 = r0.f3851b
                java.lang.String r3 = r0.f3852c
                java.lang.String r4 = r0.f3853d
                java.lang.Boolean r5 = r0.f3854e
                android.location.Location r6 = r0.f3855f
                java.lang.Boolean r7 = r0.f3856g
                java.lang.Integer r8 = r0.f3857h
                java.lang.Integer r9 = r0.i
                java.lang.Integer r10 = r0.j
                java.lang.Boolean r11 = r0.k
                java.lang.Boolean r12 = r0.l
                java.util.Map<java.lang.String, java.lang.String> r13 = r0.m
                java.lang.Integer r14 = r0.n
                r0 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Lg.a.<init>(com.yandex.metrica.impl.ob.D3$a):void");
        }

        public Object a(Object obj) {
            D3.a aVar = (D3.a) obj;
            String str = aVar.f3850a;
            String str2 = this.f3952a;
            if (str != null) {
                str2 = str;
            }
            String str3 = aVar.f3851b;
            String str4 = this.f3953b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = aVar.f3852c;
            String str6 = this.f3954c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = aVar.f3853d;
            String str8 = this.f4498d;
            if (str7 != null) {
                str8 = str7;
            }
            Boolean bool = aVar.f3854e;
            Boolean valueOf = Boolean.valueOf(this.f4500f);
            if (bool != null) {
                valueOf = bool;
            }
            Location location = aVar.f3855f;
            Location location2 = this.f4499e;
            if (location != null) {
                location2 = location;
            }
            Boolean bool2 = aVar.f3856g;
            Boolean valueOf2 = Boolean.valueOf(this.f4501g);
            if (bool2 != null) {
                valueOf2 = bool2;
            }
            Integer num = aVar.f3857h;
            Integer valueOf3 = Integer.valueOf(this.f4502h);
            if (num != null) {
                valueOf3 = num;
            }
            Integer num2 = aVar.i;
            Integer valueOf4 = Integer.valueOf(this.i);
            if (num2 != null) {
                valueOf4 = num2;
            }
            Integer num3 = aVar.j;
            Integer valueOf5 = Integer.valueOf(this.j);
            if (num3 != null) {
                valueOf5 = num3;
            }
            Boolean bool3 = aVar.k;
            Boolean valueOf6 = Boolean.valueOf(this.k);
            if (bool3 != null) {
                valueOf6 = bool3;
            }
            Boolean bool4 = aVar.l;
            Boolean valueOf7 = Boolean.valueOf(this.l);
            if (bool4 != null) {
                valueOf7 = bool4;
            }
            Map<String, String> map = aVar.m;
            Map<String, String> map2 = this.m;
            if (map != null) {
                map2 = map;
            }
            Integer num4 = aVar.n;
            return new a(str2, str4, str6, str8, valueOf, location2, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, map2, num4 == null ? Integer.valueOf(this.n) : num4);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b6, code lost:
            if (r9.getExtras() == null) goto L_0x01b8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(java.lang.Object r9) {
            /*
                r8 = this;
                com.yandex.metrica.impl.ob.D3$a r9 = (com.yandex.metrica.impl.ob.D3.a) r9
                java.lang.String r0 = r9.f3850a
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0012
                java.lang.String r3 = r8.f3952a
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0012
                goto L_0x01be
            L_0x0012:
                java.lang.String r0 = r9.f3851b
                if (r0 == 0) goto L_0x0020
                java.lang.String r3 = r8.f3953b
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0020
                goto L_0x01be
            L_0x0020:
                java.lang.String r0 = r9.f3852c
                if (r0 == 0) goto L_0x002e
                java.lang.String r3 = r8.f3954c
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x002e
                goto L_0x01be
            L_0x002e:
                java.lang.Boolean r0 = r9.f3854e
                if (r0 == 0) goto L_0x003c
                boolean r3 = r8.f4500f
                boolean r0 = r0.booleanValue()
                if (r3 == r0) goto L_0x003c
                goto L_0x01be
            L_0x003c:
                java.lang.Boolean r0 = r9.f3856g
                if (r0 == 0) goto L_0x004a
                boolean r3 = r8.f4501g
                boolean r0 = r0.booleanValue()
                if (r3 == r0) goto L_0x004a
                goto L_0x01be
            L_0x004a:
                java.lang.Integer r0 = r9.f3857h
                if (r0 == 0) goto L_0x0058
                int r3 = r8.f4502h
                int r0 = r0.intValue()
                if (r3 == r0) goto L_0x0058
                goto L_0x01be
            L_0x0058:
                java.lang.Integer r0 = r9.i
                if (r0 == 0) goto L_0x0066
                int r3 = r8.i
                int r0 = r0.intValue()
                if (r3 == r0) goto L_0x0066
                goto L_0x01be
            L_0x0066:
                java.lang.Integer r0 = r9.j
                if (r0 == 0) goto L_0x0074
                int r3 = r8.j
                int r0 = r0.intValue()
                if (r3 == r0) goto L_0x0074
                goto L_0x01be
            L_0x0074:
                java.lang.Boolean r0 = r9.k
                if (r0 == 0) goto L_0x0082
                boolean r3 = r8.k
                boolean r0 = r0.booleanValue()
                if (r3 == r0) goto L_0x0082
                goto L_0x01be
            L_0x0082:
                java.lang.Boolean r0 = r9.l
                if (r0 == 0) goto L_0x0090
                boolean r3 = r8.l
                boolean r0 = r0.booleanValue()
                if (r3 == r0) goto L_0x0090
                goto L_0x01be
            L_0x0090:
                java.lang.String r0 = r9.f3853d
                if (r0 == 0) goto L_0x00a0
                java.lang.String r3 = r8.f4498d
                if (r3 == 0) goto L_0x01be
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L_0x00a0
                goto L_0x01be
            L_0x00a0:
                java.util.Map<java.lang.String, java.lang.String> r0 = r9.m
                if (r0 == 0) goto L_0x00b0
                java.util.Map<java.lang.String, java.lang.String> r3 = r8.m
                if (r3 == 0) goto L_0x01be
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L_0x00b0
                goto L_0x01be
            L_0x00b0:
                java.lang.Integer r0 = r9.n
                if (r0 == 0) goto L_0x00be
                int r3 = r8.n
                int r0 = r0.intValue()
                if (r3 == r0) goto L_0x00be
                goto L_0x01be
            L_0x00be:
                android.location.Location r9 = r9.f3855f
                if (r9 == 0) goto L_0x01bf
                android.location.Location r0 = r8.f4499e
                if (r0 != r9) goto L_0x00c8
                goto L_0x01b8
            L_0x00c8:
                if (r0 == 0) goto L_0x01ba
                long r3 = r0.getTime()
                long r5 = r9.getTime()
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x00d8
                goto L_0x01ba
            L_0x00d8:
                r3 = 17
                boolean r3 = com.yandex.metrica.impl.ob.A2.a((int) r3)
                if (r3 == 0) goto L_0x00ee
                long r3 = r0.getElapsedRealtimeNanos()
                long r5 = r9.getElapsedRealtimeNanos()
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L_0x00ee
                goto L_0x01ba
            L_0x00ee:
                double r3 = r9.getLatitude()
                double r5 = r0.getLatitude()
                int r3 = java.lang.Double.compare(r3, r5)
                if (r3 == 0) goto L_0x00fe
                goto L_0x01ba
            L_0x00fe:
                double r3 = r9.getLongitude()
                double r5 = r0.getLongitude()
                int r3 = java.lang.Double.compare(r3, r5)
                if (r3 == 0) goto L_0x010e
                goto L_0x01ba
            L_0x010e:
                double r3 = r9.getAltitude()
                double r5 = r0.getAltitude()
                int r3 = java.lang.Double.compare(r3, r5)
                if (r3 == 0) goto L_0x011e
                goto L_0x01ba
            L_0x011e:
                float r3 = r9.getSpeed()
                float r4 = r0.getSpeed()
                int r3 = java.lang.Float.compare(r3, r4)
                if (r3 == 0) goto L_0x012e
                goto L_0x01ba
            L_0x012e:
                float r3 = r9.getBearing()
                float r4 = r0.getBearing()
                int r3 = java.lang.Float.compare(r3, r4)
                if (r3 == 0) goto L_0x013e
                goto L_0x01ba
            L_0x013e:
                float r3 = r9.getAccuracy()
                float r4 = r0.getAccuracy()
                int r3 = java.lang.Float.compare(r3, r4)
                if (r3 == 0) goto L_0x014e
                goto L_0x01ba
            L_0x014e:
                r3 = 26
                boolean r3 = com.yandex.metrica.impl.ob.A2.a((int) r3)
                if (r3 == 0) goto L_0x0183
                float r3 = r9.getVerticalAccuracyMeters()
                float r4 = r0.getVerticalAccuracyMeters()
                int r3 = java.lang.Float.compare(r3, r4)
                if (r3 == 0) goto L_0x0165
                goto L_0x01ba
            L_0x0165:
                float r3 = r9.getSpeedAccuracyMetersPerSecond()
                float r4 = r0.getSpeedAccuracyMetersPerSecond()
                int r3 = java.lang.Float.compare(r3, r4)
                if (r3 == 0) goto L_0x0174
                goto L_0x01ba
            L_0x0174:
                float r3 = r9.getBearingAccuracyDegrees()
                float r4 = r0.getBearingAccuracyDegrees()
                int r3 = java.lang.Float.compare(r3, r4)
                if (r3 == 0) goto L_0x0183
                goto L_0x01ba
            L_0x0183:
                java.lang.String r3 = r0.getProvider()
                if (r3 == 0) goto L_0x0198
                java.lang.String r3 = r0.getProvider()
                java.lang.String r4 = r9.getProvider()
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x019f
                goto L_0x01ba
            L_0x0198:
                java.lang.String r3 = r9.getProvider()
                if (r3 == 0) goto L_0x019f
                goto L_0x01ba
            L_0x019f:
                android.os.Bundle r3 = r0.getExtras()
                if (r3 == 0) goto L_0x01b2
                android.os.Bundle r0 = r0.getExtras()
                android.os.Bundle r9 = r9.getExtras()
                boolean r9 = r0.equals(r9)
                goto L_0x01bb
            L_0x01b2:
                android.os.Bundle r9 = r9.getExtras()
                if (r9 != 0) goto L_0x01ba
            L_0x01b8:
                r9 = 1
                goto L_0x01bb
            L_0x01ba:
                r9 = 0
            L_0x01bb:
                if (r9 == 0) goto L_0x01be
                goto L_0x01bf
            L_0x01be:
                r1 = 0
            L_0x01bf:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Lg.a.b(java.lang.Object):boolean");
        }

        a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4) {
            super(str, str2, str3);
            this.f4498d = str4;
            Boolean bool5 = Boolean.FALSE;
            this.f4500f = ((Boolean) Tl.a(bool, bool5)).booleanValue();
            this.f4499e = location;
            this.f4501g = ((Boolean) Tl.a(bool2, bool5)).booleanValue();
            this.f4502h = Math.max(10, ((Integer) Tl.a(num, 10)).intValue());
            this.i = ((Integer) Tl.a(num2, 7)).intValue();
            this.j = ((Integer) Tl.a(num3, 90)).intValue();
            this.k = ((Boolean) Tl.a(bool3, bool5)).booleanValue();
            this.l = ((Boolean) Tl.a(bool4, Boolean.TRUE)).booleanValue();
            this.m = map;
            this.n = ((Integer) Tl.a(num4, 1000)).intValue();
        }
    }

    public static abstract class b implements e {

        /* renamed from: a  reason: collision with root package name */
        protected final C0690s2 f4503a;

        public b(C0690s2 s2Var) {
            this.f4503a = s2Var;
        }

        public boolean a(Boolean bool) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            return bool.booleanValue();
        }
    }

    public static class c extends Hg.a<Lg, a> {

        /* renamed from: d  reason: collision with root package name */
        private final L3 f4504d;

        /* renamed from: e  reason: collision with root package name */
        private final e f4505e;

        /* renamed from: f  reason: collision with root package name */
        private final Rh f4506f;

        public c(L3 l3, e eVar) {
            this(l3, eVar, new Rh());
        }

        public Eg a(Object obj) {
            Eg.c cVar = (Eg.c) obj;
            Lg lg = (Lg) a(cVar);
            Lg.a(lg, ((a) cVar.f3958b).f4498d);
            lg.a(this.f4504d.x().a());
            lg.a(this.f4504d.d().a());
            lg.d(((a) cVar.f3958b).f4500f);
            lg.a(((a) cVar.f3958b).f4499e);
            lg.c(((a) cVar.f3958b).f4501g);
            lg.d(((a) cVar.f3958b).f4502h);
            lg.c(((a) cVar.f3958b).i);
            lg.b(((a) cVar.f3958b).j);
            lg.e(((a) cVar.f3958b).k);
            lg.a(Boolean.valueOf(((a) cVar.f3958b).l), this.f4505e);
            lg.a((long) ((a) cVar.f3958b).n);
            C0635pi piVar = cVar.f3957a;
            a aVar = (a) cVar.f3958b;
            lg.b(piVar.y().contains(aVar.f4498d) ? piVar.z() : piVar.H());
            lg.f(piVar.f().f4954c);
            if (piVar.F() != null) {
                lg.b(piVar.F().f5487a);
                lg.c(piVar.F().f5488b);
            }
            lg.b(piVar.f().f4955d);
            lg.h(piVar.n());
            lg.a(this.f4506f.a(aVar.m, piVar, F0.g().d()));
            return lg;
        }

        c(L3 l3, e eVar, Rh rh) {
            super(l3.g(), l3.e().b());
            this.f4504d = l3;
            this.f4505e = eVar;
            this.f4506f = rh;
        }

        /* access modifiers changed from: protected */
        public Eg a() {
            return new Lg(this.f4504d);
        }
    }

    public interface d {
    }

    public interface e {
        boolean a(Boolean bool);
    }

    Lg(d dVar) {
        this.x = dVar;
    }

    static void a(Lg lg, String str) {
        lg.y = str;
    }

    public String B() {
        return this.y;
    }

    public int C() {
        return this.D;
    }

    public List<String> D() {
        return this.I;
    }

    public String E() {
        String str = this.B;
        return str == null ? "" : str;
    }

    public boolean F() {
        return this.w.a(this.v);
    }

    public int G() {
        return this.s;
    }

    public Location H() {
        return this.p;
    }

    public int I() {
        return this.u;
    }

    public long J() {
        return this.H;
    }

    public long K() {
        return this.E;
    }

    public long L() {
        return this.F;
    }

    public List<String> M() {
        return this.C;
    }

    public int N() {
        return this.r;
    }

    public boolean O() {
        return this.A;
    }

    public boolean P() {
        return this.q;
    }

    public boolean Q() {
        return this.o;
    }

    public boolean R() {
        return this.z;
    }

    public boolean S() {
        return x() && !A2.b((Collection) this.C) && this.G;
    }

    public boolean T() {
        return ((L3) this.x).F();
    }

    public void b(List<String> list) {
        this.C = list;
    }

    public void c(long j) {
        this.F = j;
    }

    public void d(boolean z2) {
        this.o = z2;
    }

    public void e(boolean z2) {
        this.t = z2;
    }

    public void f(boolean z2) {
        this.z = z2;
    }

    /* access modifiers changed from: package-private */
    public void h(String str) {
        this.B = str;
    }

    public String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.o + ", mManualLocation=" + this.p + ", mFirstActivationAsUpdate=" + this.q + ", mSessionTimeout=" + this.r + ", mDispatchPeriod=" + this.s + ", mLogEnabled=" + this.t + ", mMaxReportsCount=" + this.u + ", statisticSendingFromArguments=" + this.v + ", statisticsSendingStrategy=" + this.w + ", mPreloadInfoSendingStrategy=" + this.x + ", mApiKey='" + this.y + '\'' + ", mPermissionsCollectingEnabled=" + this.z + ", mFeaturesCollectingEnabled=" + this.A + ", mClidsFromStartupResponse='" + this.B + '\'' + ", mReportHosts=" + this.C + ", mAttributionId=" + this.D + ", mPermissionsCollectingIntervalSeconds=" + this.E + ", mPermissionsForceSendIntervalSeconds=" + this.F + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.G + ", mMaxReportsInDbCount=" + this.H + ", mCertificates=" + this.I + "} " + super.toString();
    }

    public void a(Location location) {
        this.p = location;
    }

    public void b(long j) {
        this.E = j;
    }

    public void c(boolean z2) {
        this.q = z2;
    }

    public void d(int i) {
        this.r = i;
    }

    public void a(int i) {
        this.D = i;
    }

    public void b(boolean z2) {
        this.A = z2;
    }

    public void c(int i) {
        this.u = i;
    }

    public void a(long j) {
        this.H = j;
    }

    public void b(int i) {
        this.s = i;
    }

    public void a(List<String> list) {
        this.I = list;
    }

    public void a(Boolean bool, e eVar) {
        this.v = bool;
        this.w = eVar;
    }

    public void a(boolean z2) {
        this.G = z2;
    }
}

package com.applovin.exoplayer2.e;

public interface v {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final w f12452a;

        /* renamed from: b  reason: collision with root package name */
        public final w f12453b;

        public a(w wVar) {
            this(wVar, wVar);
        }

        public a(w wVar, w wVar2) {
            this.f12452a = (w) com.applovin.exoplayer2.l.a.b(wVar);
            this.f12453b = (w) com.applovin.exoplayer2.l.a.b(wVar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12452a.equals(aVar.f12452a) && this.f12453b.equals(aVar.f12453b);
        }

        public int hashCode() {
            return (this.f12452a.hashCode() * 31) + this.f12453b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f12452a);
            if (this.f12452a.equals(this.f12453b)) {
                str = "";
            } else {
                str = ", " + this.f12453b;
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }
    }

    public static class b implements v {

        /* renamed from: a  reason: collision with root package name */
        private final long f12454a;

        /* renamed from: b  reason: collision with root package name */
        private final a f12455b;

        public b(long j) {
            this(j, 0);
        }

        public b(long j, long j2) {
            this.f12454a = j;
            this.f12455b = new a(j2 == 0 ? w.f12456a : new w(0, j2));
        }

        public a a(long j) {
            return this.f12455b;
        }

        public boolean a() {
            return false;
        }

        public long b() {
            return this.f12454a;
        }
    }

    a a(long j);

    boolean a();

    long b();
}

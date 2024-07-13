package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.y;
import java.util.Collections;
import java.util.List;

public interface ad {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12177a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12178b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12179c;

        public a(String str, int i, byte[] bArr) {
            this.f12177a = str;
            this.f12178b = i;
            this.f12179c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12180a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12181b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f12182c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f12183d;

        public b(int i, String str, List<a> list, byte[] bArr) {
            this.f12180a = i;
            this.f12181b = str;
            this.f12182c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f12183d = bArr;
        }
    }

    public interface c {
        SparseArray<ad> a();

        ad a(int i, b bVar);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f12184a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12185b;

        /* renamed from: c  reason: collision with root package name */
        private final int f12186c;

        /* renamed from: d  reason: collision with root package name */
        private int f12187d;

        /* renamed from: e  reason: collision with root package name */
        private String f12188e;

        public d(int i, int i2) {
            this(RecyclerView.UNDEFINED_DURATION, i, i2);
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f12184a = str;
            this.f12185b = i2;
            this.f12186c = i3;
            this.f12187d = RecyclerView.UNDEFINED_DURATION;
            this.f12188e = "";
        }

        private void d() {
            if (this.f12187d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i = this.f12187d;
            this.f12187d = i == Integer.MIN_VALUE ? this.f12185b : i + this.f12186c;
            this.f12188e = this.f12184a + this.f12187d;
        }

        public int b() {
            d();
            return this.f12187d;
        }

        public String c() {
            d();
            return this.f12188e;
        }
    }

    void a();

    void a(ag agVar, j jVar, d dVar);

    void a(y yVar, int i) throws ai;
}

package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<e> f13197a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f13198b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f13199c;

    public i(List<e> list) {
        this.f13197a = Collections.unmodifiableList(new ArrayList(list));
        this.f13198b = new long[(list.size() * 2)];
        for (int i = 0; i < list.size(); i++) {
            e eVar = list.get(i);
            int i2 = i * 2;
            this.f13198b[i2] = eVar.f13171b;
            this.f13198b[i2 + 1] = eVar.f13172c;
        }
        long[] jArr = this.f13198b;
        long[] copyOf = Arrays.copyOf(jArr, jArr.length);
        this.f13199c = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j) {
        int b2 = ai.b(this.f13199c, j, false, false);
        if (b2 < this.f13199c.length) {
            return b2;
        }
        return -1;
    }

    public long a(int i) {
        boolean z = true;
        a.a(i >= 0);
        if (i >= this.f13199c.length) {
            z = false;
        }
        a.a(z);
        return this.f13199c[i];
    }

    public List<com.applovin.exoplayer2.i.a> b(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f13197a.size(); i++) {
            long[] jArr = this.f13198b;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                e eVar = this.f13197a.get(i);
                if (eVar.f13170a.f12912f == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(eVar.f13170a);
                }
            }
        }
        Collections.sort(arrayList2, $$Lambda$i$0tJQUjq4SOd_D0syoU6EjHsKTHY.INSTANCE);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((e) arrayList2.get(i3)).f13170a.a().a((float) (-1 - i3), 1).e());
        }
        return arrayList;
    }

    public int f_() {
        return this.f13199c.length;
    }
}

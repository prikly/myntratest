package com.bykv.vk.openvk.component.video.a.b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Urls */
public class l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f18093a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f18094b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<a> f18095c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18096d;

    /* renamed from: e  reason: collision with root package name */
    private int f18097e = -1;

    /* renamed from: f  reason: collision with root package name */
    private int f18098f;

    /* renamed from: g  reason: collision with root package name */
    private final int f18099g;

    l(List<String> list) {
        int i;
        if (!list.isEmpty()) {
            this.f18096d = list.size();
            this.f18095c = new ArrayList<>(this.f18096d);
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            for (String next : list) {
                a aVar = new a(next);
                if (f18093a.contains(next)) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(aVar);
                } else if (f18094b.contains(next)) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(aVar);
                } else {
                    this.f18095c.add(aVar);
                }
            }
            if (arrayList != null) {
                this.f18095c.addAll(arrayList);
            }
            if (arrayList2 != null) {
                this.f18095c.addAll(arrayList2);
            }
            Integer num = e.i;
            if (num == null || num.intValue() <= 0) {
                i = this.f18096d >= 2 ? 1 : 2;
            } else {
                i = num.intValue();
            }
            this.f18099g = i;
            return;
        }
        throw new IllegalArgumentException("urls can't be empty");
    }

    l(String str) {
        ArrayList<a> arrayList = new ArrayList<>(1);
        this.f18095c = arrayList;
        arrayList.add(new a(str));
        this.f18096d = 1;
        this.f18099g = 1;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f18098f < this.f18099g;
    }

    /* access modifiers changed from: package-private */
    public a b() {
        if (a()) {
            int i = this.f18097e + 1;
            if (i >= this.f18096d - 1) {
                this.f18097e = -1;
                this.f18098f++;
            } else {
                this.f18097e = i;
            }
            a aVar = this.f18095c.get(i);
            aVar.f18101b = (this.f18098f * this.f18096d) + this.f18097e;
            return aVar;
        }
        throw new NoSuchElementException();
    }

    /* compiled from: Urls */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        final String f18100a;

        /* renamed from: b  reason: collision with root package name */
        int f18101b;

        a(String str) {
            this.f18100a = str;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            l.f18093a.add(this.f18100a);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            l.f18094b.add(this.f18100a);
        }

        public String toString() {
            return this.f18100a;
        }
    }
}

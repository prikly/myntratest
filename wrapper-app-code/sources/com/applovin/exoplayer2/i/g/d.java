package com.applovin.exoplayer2.i.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f13117a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13118b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13119c;

    /* renamed from: d  reason: collision with root package name */
    public final long f13120d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13121e;

    /* renamed from: f  reason: collision with root package name */
    public final g f13122f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13123g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13124h;
    public final d i;
    private final String[] j;
    private final HashMap<String, Integer> k;
    private final HashMap<String, Integer> l;
    private List<d> m;

    private d(String str, String str2, long j2, long j3, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f13117a = str;
        this.f13118b = str2;
        this.f13124h = str4;
        this.f13122f = gVar;
        this.j = strArr;
        this.f13119c = str2 != null;
        this.f13120d = j2;
        this.f13121e = j3;
        this.f13123g = (String) a.b(str3);
        this.i = dVar;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    private static SpannableStringBuilder a(String str, Map<String, a.C0125a> map) {
        if (!map.containsKey(str)) {
            a.C0125a aVar = new a.C0125a();
            aVar.a((CharSequence) new SpannableStringBuilder());
            map.put(str, aVar);
        }
        return (SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(map.get(str).a());
    }

    public static d a(String str) {
        return new d((String) null, f.a(str), -9223372036854775807L, -9223372036854775807L, (g) null, (String[]) null, "", (String) null, (d) null);
    }

    public static d a(String str, long j2, long j3, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, (String) null, j2, j3, gVar, strArr, str2, str3, dVar);
    }

    private void a(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f13123g)) {
            str = this.f13123g;
        }
        if (!a(j2) || !"div".equals(this.f13117a) || this.f13124h == null) {
            for (int i2 = 0; i2 < a(); i2++) {
                a(i2).a(j2, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f13124h));
    }

    private void a(long j2, Map<String, g> map, Map<String, e> map2, String str, Map<String, a.C0125a> map3) {
        int i2;
        if (a(j2)) {
            String str2 = "".equals(this.f13123g) ? str : this.f13123g;
            Iterator<Map.Entry<String, Integer>> it = this.l.entrySet().iterator();
            while (true) {
                i2 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                int intValue = this.k.containsKey(str3) ? this.k.get(str3).intValue() : 0;
                int intValue2 = ((Integer) next.getValue()).intValue();
                if (intValue != intValue2) {
                    a(map, (a.C0125a) com.applovin.exoplayer2.l.a.b(map3.get(str3)), intValue, intValue2, ((e) com.applovin.exoplayer2.l.a.b(map2.get(str2))).j);
                } else {
                    Map<String, e> map4 = map2;
                    Map<String, a.C0125a> map5 = map3;
                }
            }
            Map<String, e> map6 = map2;
            Map<String, a.C0125a> map7 = map3;
            while (i2 < a()) {
                a(i2).a(j2, map, map2, str2, map3);
                i2++;
                Map<String, e> map8 = map2;
            }
        }
    }

    private void a(long j2, boolean z, String str, Map<String, a.C0125a> map) {
        this.k.clear();
        this.l.clear();
        if (!"metadata".equals(this.f13117a)) {
            if (!"".equals(this.f13123g)) {
                str = this.f13123g;
            }
            if (this.f13119c && z) {
                a(str, map).append((CharSequence) com.applovin.exoplayer2.l.a.b(this.f13118b));
            } else if ("br".equals(this.f13117a) && z) {
                a(str, map).append(10);
            } else if (a(j2)) {
                for (Map.Entry next : map.entrySet()) {
                    this.k.put((String) next.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(((a.C0125a) next.getValue()).a())).length()));
                }
                boolean equals = NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON.equals(this.f13117a);
                for (int i2 = 0; i2 < a(); i2++) {
                    a(i2).a(j2, z || equals, str, map);
                }
                if (equals) {
                    f.a(a(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.l.put((String) next2.getKey(), Integer.valueOf(((CharSequence) com.applovin.exoplayer2.l.a.b(((a.C0125a) next2.getValue()).a())).length()));
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                int i3 = i2 + 1;
                int i4 = i3;
                while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                    i4++;
                }
                int i5 = i4 - i3;
                if (i5 > 0) {
                    spannableStringBuilder.delete(i2, i5 + i2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
            if (spannableStringBuilder.charAt(i6) == 10) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
            if (spannableStringBuilder.charAt(i8) == ' ') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == 10) {
                    spannableStringBuilder.delete(i8, i9);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void a(Map<String, g> map, a.C0125a aVar, int i2, int i3, int i4) {
        g a2 = f.a(this.f13122f, this.j, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.a();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            aVar.a((CharSequence) spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a2 != null) {
            f.a(spannableStringBuilder2, i2, i3, a2, this.i, map, i4);
            if (NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON.equals(this.f13117a)) {
                if (a2.i() != Float.MAX_VALUE) {
                    aVar.d((a2.i() * -90.0f) / 100.0f);
                }
                if (a2.m() != null) {
                    aVar.a(a2.m());
                }
                if (a2.n() != null) {
                    aVar.b(a2.n());
                }
            }
        }
    }

    private void a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_ICON.equals(this.f13117a);
        boolean equals2 = "div".equals(this.f13117a);
        if (z || equals || (equals2 && this.f13124h != null)) {
            long j2 = this.f13120d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f13121e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.m.get(i2).a(treeSet, z || equals);
            }
        }
    }

    public int a() {
        List<d> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public d a(int i2) {
        List<d> list = this.m;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public List<com.applovin.exoplayer2.i.a> a(long j2, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        a(j2, this.f13123g, arrayList);
        TreeMap treeMap = new TreeMap();
        long j3 = j2;
        a(j3, false, this.f13123g, (Map<String, a.C0125a>) treeMap);
        a(j3, map, map2, this.f13123g, (Map<String, a.C0125a>) treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) com.applovin.exoplayer2.l.a.b(map2.get(pair.first));
                arrayList2.add(new a.C0125a().a(decodeByteArray).a(eVar.f13126b).b(0).a(eVar.f13127c, 0).a(eVar.f13129e).b(eVar.f13130f).c(eVar.f13131g).d(eVar.j).e());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) com.applovin.exoplayer2.l.a.b(map2.get(entry.getKey()));
            a.C0125a aVar = (a.C0125a) entry.getValue();
            a((SpannableStringBuilder) com.applovin.exoplayer2.l.a.b(aVar.a()));
            aVar.a(eVar2.f13127c, eVar2.f13128d);
            aVar.a(eVar2.f13129e);
            aVar.a(eVar2.f13126b);
            aVar.b(eVar2.f13130f);
            aVar.b(eVar2.i, eVar2.f13132h);
            aVar.d(eVar2.j);
            arrayList2.add(aVar.e());
        }
        return arrayList2;
    }

    public void a(d dVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(dVar);
    }

    public boolean a(long j2) {
        return (this.f13120d == -9223372036854775807L && this.f13121e == -9223372036854775807L) || (this.f13120d <= j2 && this.f13121e == -9223372036854775807L) || ((this.f13120d == -9223372036854775807L && j2 < this.f13121e) || (this.f13120d <= j2 && j2 < this.f13121e));
    }

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        a((TreeSet<Long>) treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public String[] c() {
        return this.j;
    }
}

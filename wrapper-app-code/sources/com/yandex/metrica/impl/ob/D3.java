package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.ResultReceiver;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.Mg;
import java.util.Map;

public class D3 {

    /* renamed from: a  reason: collision with root package name */
    public final Mg.b f3847a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3848b;

    /* renamed from: c  reason: collision with root package name */
    public final ResultReceiver f3849c;

    public static class a implements Dg<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public final String f3850a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3851b;

        /* renamed from: c  reason: collision with root package name */
        public final String f3852c;

        /* renamed from: d  reason: collision with root package name */
        public final String f3853d;

        /* renamed from: e  reason: collision with root package name */
        public final Boolean f3854e;

        /* renamed from: f  reason: collision with root package name */
        public final Location f3855f;

        /* renamed from: g  reason: collision with root package name */
        public final Boolean f3856g;

        /* renamed from: h  reason: collision with root package name */
        public final Integer f3857h;
        public final Integer i;
        public final Integer j;
        public final Boolean k;
        public final Boolean l;
        public final Map<String, String> m;
        public final Integer n;
        public final Boolean o;
        public final Boolean p;
        public final Boolean q;

        a(String str, String str2, String str3, String str4, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map<String, String> map, Integer num4, Boolean bool5, Boolean bool6, Boolean bool7) {
            this.f3850a = str;
            this.f3851b = str2;
            this.f3852c = str3;
            this.f3853d = str4;
            this.f3854e = bool;
            this.f3855f = location;
            this.f3856g = bool2;
            this.f3857h = num;
            this.i = num2;
            this.j = num3;
            this.k = bool3;
            this.l = bool4;
            this.m = map;
            this.n = num4;
            this.o = bool5;
            this.p = bool6;
            this.q = bool7;
        }

        public boolean b(Object obj) {
            return equals((a) obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f3850a;
            if (str == null ? aVar.f3850a != null : !str.equals(aVar.f3850a)) {
                return false;
            }
            String str2 = this.f3851b;
            if (str2 == null ? aVar.f3851b != null : !str2.equals(aVar.f3851b)) {
                return false;
            }
            String str3 = this.f3852c;
            if (str3 == null ? aVar.f3852c != null : !str3.equals(aVar.f3852c)) {
                return false;
            }
            String str4 = this.f3853d;
            if (str4 == null ? aVar.f3853d != null : !str4.equals(aVar.f3853d)) {
                return false;
            }
            Boolean bool = this.f3854e;
            if (bool == null ? aVar.f3854e != null : !bool.equals(aVar.f3854e)) {
                return false;
            }
            Location location = this.f3855f;
            if (location == null ? aVar.f3855f != null : !location.equals(aVar.f3855f)) {
                return false;
            }
            Boolean bool2 = this.f3856g;
            if (bool2 == null ? aVar.f3856g != null : !bool2.equals(aVar.f3856g)) {
                return false;
            }
            Integer num = this.f3857h;
            if (num == null ? aVar.f3857h != null : !num.equals(aVar.f3857h)) {
                return false;
            }
            Integer num2 = this.i;
            if (num2 == null ? aVar.i != null : !num2.equals(aVar.i)) {
                return false;
            }
            Integer num3 = this.j;
            if (num3 == null ? aVar.j != null : !num3.equals(aVar.j)) {
                return false;
            }
            Boolean bool3 = this.k;
            if (bool3 == null ? aVar.k != null : !bool3.equals(aVar.k)) {
                return false;
            }
            Boolean bool4 = this.l;
            if (bool4 == null ? aVar.l != null : !bool4.equals(aVar.l)) {
                return false;
            }
            Map<String, String> map = this.m;
            if (map == null ? aVar.m != null : !map.equals(aVar.m)) {
                return false;
            }
            Integer num4 = this.n;
            if (num4 == null ? aVar.n != null : !num4.equals(aVar.n)) {
                return false;
            }
            Boolean bool5 = this.o;
            if (bool5 == null ? aVar.o != null : !bool5.equals(aVar.o)) {
                return false;
            }
            Boolean bool6 = this.p;
            if (bool6 == null ? aVar.p != null : !bool6.equals(aVar.p)) {
                return false;
            }
            Boolean bool7 = this.q;
            if (bool7 != null) {
                return bool7.equals(aVar.q);
            }
            if (aVar.q == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f3850a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f3851b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f3852c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f3853d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f3854e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f3855f;
            int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f3856g;
            int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.f3857h;
            int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.i;
            int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.j;
            int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.k;
            int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.l;
            int hashCode12 = (hashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.m;
            int hashCode13 = (hashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.n;
            int hashCode14 = (hashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.o;
            int hashCode15 = (hashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.p;
            int hashCode16 = (hashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.q;
            if (bool7 != null) {
                i2 = bool7.hashCode();
            }
            return hashCode16 + i2;
        }

        public a a(a aVar) {
            a aVar2 = aVar;
            String str = this.f3850a;
            String str2 = aVar2.f3850a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.f3851b;
            String str4 = aVar2.f3851b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.f3852c;
            String str6 = aVar2.f3852c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.f3853d;
            String str8 = aVar2.f3853d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.f3854e;
            Boolean bool2 = aVar2.f3854e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f3855f;
            Location location2 = aVar2.f3855f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.f3856g;
            Boolean bool4 = aVar2.f3856g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.f3857h;
            Integer num2 = aVar2.f3857h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.i;
            Integer num4 = aVar2.i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.j;
            Integer num6 = aVar2.j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.k;
            Boolean bool6 = aVar2.k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.l;
            Boolean bool8 = aVar2.l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.m;
            Map<String, String> map2 = aVar2.m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.n;
            Map<String, String> map3 = map;
            Integer num8 = aVar2.n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar2.o : bool9;
            Boolean bool11 = this.p;
            Boolean bool12 = bool11 == null ? aVar2.p : bool11;
            Boolean bool13 = this.q;
            return new a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar2.q : bool13);
        }

        public a(CounterConfiguration counterConfiguration, Map<String, String> map) {
            this(counterConfiguration.d(), counterConfiguration.c(), counterConfiguration.b(), counterConfiguration.a(), counterConfiguration.o(), counterConfiguration.g(), counterConfiguration.n(), counterConfiguration.l(), counterConfiguration.h(), counterConfiguration.e(), counterConfiguration.p(), counterConfiguration.m(), map, counterConfiguration.i(), counterConfiguration.j(), counterConfiguration.f(), counterConfiguration.q());
        }

        public a() {
            this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (Location) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Boolean) null, (Boolean) null, (Map<String, String>) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null);
        }
    }

    public D3(C0859z3 z3Var) {
        this(new Mg.b(z3Var), new a(z3Var.b(), z3Var.a().a()), z3Var.a().c());
    }

    public D3(Mg.b bVar, a aVar, ResultReceiver resultReceiver) {
        this.f3847a = bVar;
        this.f3848b = aVar;
        this.f3849c = resultReceiver;
    }
}

package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.v3  reason: case insensitive filesystem */
public final class C0763v3 implements C0688s0<a, a> {

    /* renamed from: a  reason: collision with root package name */
    private final a f6959a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f6960b;

    /* renamed from: com.yandex.metrica.impl.ob.v3$a */
    public static final class a implements C0760v0 {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f6961a;

        /* renamed from: b  reason: collision with root package name */
        private final C0736u0 f6962b;

        public a(Map<String, String> map, C0736u0 u0Var) {
            this.f6961a = map;
            this.f6962b = u0Var;
        }

        public C0736u0 a() {
            return this.f6962b;
        }

        public final Map<String, String> b() {
            return this.f6961a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual((Object) this.f6961a, (Object) aVar.f6961a) && Intrinsics.areEqual((Object) this.f6962b, (Object) aVar.f6962b);
        }

        public int hashCode() {
            Map<String, String> map = this.f6961a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            C0736u0 u0Var = this.f6962b;
            if (u0Var != null) {
                i = u0Var.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "Candidate(clids=" + this.f6961a + ", source=" + this.f6962b + ")";
        }
    }

    public C0763v3(a aVar, List<a> list) {
        this.f6959a = aVar;
        this.f6960b = list;
    }

    public List<a> a() {
        return this.f6960b;
    }

    public Object b() {
        return this.f6959a;
    }

    public a c() {
        return this.f6959a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0763v3)) {
            return false;
        }
        C0763v3 v3Var = (C0763v3) obj;
        return Intrinsics.areEqual((Object) this.f6959a, (Object) v3Var.f6959a) && Intrinsics.areEqual((Object) this.f6960b, (Object) v3Var.f6960b);
    }

    public int hashCode() {
        a aVar = this.f6959a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        List<a> list = this.f6960b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ClidsInfo(chosen=" + this.f6959a + ", candidates=" + this.f6960b + ")";
    }
}

package com.yandex.metrica.impl.ob;

import com.yandex.metrica.appsetid.c;
import kotlin.jvm.internal.Intrinsics;

public final class Ab {

    /* renamed from: a  reason: collision with root package name */
    private final String f3697a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3698b;

    public Ab(String str, c cVar) {
        this.f3697a = str;
        this.f3698b = cVar;
    }

    public final String a() {
        return this.f3697a;
    }

    public final c b() {
        return this.f3698b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab = (Ab) obj;
        return Intrinsics.areEqual((Object) this.f3697a, (Object) ab.f3697a) && Intrinsics.areEqual((Object) this.f3698b, (Object) ab.f3698b);
    }

    public int hashCode() {
        String str = this.f3697a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        c cVar = this.f3698b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AppSetId(id=" + this.f3697a + ", scope=" + this.f3698b + ")";
    }
}

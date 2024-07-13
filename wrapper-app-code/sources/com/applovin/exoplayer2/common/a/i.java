package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class i<F, T> extends ai<F> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    final Function<F, ? extends T> f11547a;

    /* renamed from: b  reason: collision with root package name */
    final ai<T> f11548b;

    i(Function<F, ? extends T> function, ai<T> aiVar) {
        this.f11547a = (Function) Preconditions.checkNotNull(function);
        this.f11548b = (ai) Preconditions.checkNotNull(aiVar);
    }

    public int compare(F f2, F f3) {
        return this.f11548b.compare(this.f11547a.apply(f2), this.f11547a.apply(f3));
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f11547a.equals(iVar.f11547a) && this.f11548b.equals(iVar.f11548b);
    }

    public int hashCode() {
        return Objects.hashCode(this.f11547a, this.f11548b);
    }

    public String toString() {
        return this.f11548b + ".onResultOf(" + this.f11547a + ")";
    }
}

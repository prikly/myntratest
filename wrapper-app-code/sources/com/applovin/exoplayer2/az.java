package com.applovin.exoplayer2;

import android.os.Bundle;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.g;
import com.applovin.exoplayer2.l.a;

public final class az extends aq {

    /* renamed from: a  reason: collision with root package name */
    public static final g.a<az> f11179a = $$Lambda$az$Hfby8d0AKGSd4PSO0efsqRw0g.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11180c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f11181d;

    public az() {
        this.f11180c = false;
        this.f11181d = false;
    }

    public az(boolean z) {
        this.f11180c = true;
        this.f11181d = z;
    }

    /* access modifiers changed from: private */
    public static az a(Bundle bundle) {
        a.a(bundle.getInt(a(0), -1) == 3);
        return bundle.getBoolean(a(1), false) ? new az(bundle.getBoolean(a(2), false)) : new az();
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return this.f11181d == azVar.f11181d && this.f11180c == azVar.f11180c;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f11180c), Boolean.valueOf(this.f11181d));
    }
}

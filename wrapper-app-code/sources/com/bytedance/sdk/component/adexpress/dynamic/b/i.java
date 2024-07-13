package com.bytedance.sdk.component.adexpress.dynamic.b;

import java.util.Arrays;

/* compiled from: DynamicPoint */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public float f18530a;

    /* renamed from: b  reason: collision with root package name */
    public float f18531b;

    public i(float f2, float f3) {
        this.f18530a = f2;
        this.f18531b = f3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (Float.compare(iVar.f18530a, this.f18530a) == 0 && Float.compare(iVar.f18531b, this.f18531b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f18530a), Float.valueOf(this.f18531b)});
    }
}

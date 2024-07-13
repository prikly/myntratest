package com.apm.insight.runtime;

import com.apm.insight.entity.Header;
import com.apm.insight.h;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final f f10853b = new f() {

        /* renamed from: a  reason: collision with root package name */
        Header f10855a = null;

        public Object b(String str) {
            if (this.f10855a == null) {
                this.f10855a = Header.b(h.g());
            }
            return this.f10855a.f().opt(str);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private f f10854a;

    f() {
        this(f10853b);
    }

    f(f fVar) {
        this.f10854a = null;
        this.f10854a = fVar;
    }

    public Object a(String str) {
        f fVar = this.f10854a;
        if (fVar != null) {
            return fVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        f fVar = this.f10854a;
        if (fVar != null) {
            return fVar.b(str);
        }
        return null;
    }
}

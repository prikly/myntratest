package com.applovin.exoplayer2.e.c;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;

abstract class d {

    /* renamed from: a  reason: collision with root package name */
    protected final x f11866a;

    public static final class a extends ai {
        public a(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    protected d(x xVar) {
        this.f11866a = xVar;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(y yVar) throws ai;

    /* access modifiers changed from: protected */
    public abstract boolean a(y yVar, long j) throws ai;

    public final boolean b(y yVar, long j) throws ai {
        return a(yVar) && a(yVar, j);
    }
}

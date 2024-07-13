package com.criteo.publisher;

import com.criteo.publisher.c0.d;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: Session.kt */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private final long f2928a;

    /* renamed from: b  reason: collision with root package name */
    private final Lazy f2929b = LazyKt.lazy(new b(this));

    /* renamed from: c  reason: collision with root package name */
    private final i f2930c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final d f2931d;

    static {
        new a((DefaultConstructorMarker) null);
    }

    public String b() {
        return (String) this.f2929b.getValue();
    }

    public z(i iVar, d dVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        Intrinsics.checkParameterIsNotNull(dVar, "uniqueIdGenerator");
        this.f2930c = iVar;
        this.f2931d = dVar;
        this.f2928a = iVar.a();
    }

    /* compiled from: Session.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Session.kt */
    static final class b extends Lambda implements Function0<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f2932a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z zVar) {
            super(0);
            this.f2932a = zVar;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f2932a.f2931d.a();
        }
    }

    public int a() {
        return (int) ((this.f2930c.a() - this.f2928a) / ((long) 1000));
    }
}

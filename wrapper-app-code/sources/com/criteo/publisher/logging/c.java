package com.criteo.publisher.logging;

import android.util.Log;
import com.criteo.publisher.n0.g;
import com.onesignal.OneSignalDbContract;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConsoleHandler.kt */
public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private int f2631a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final g f2632b;

    static {
        new a((DefaultConstructorMarker) null);
    }

    public c(g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        this.f2632b = gVar;
    }

    /* compiled from: ConsoleHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void b(int i) {
        this.f2631a = i;
    }

    public int a() {
        Integer valueOf = Integer.valueOf(this.f2631a);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : this.f2632b.g();
    }

    public void a(String str, e eVar) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        int a2 = eVar.a();
        if (a(a2)) {
            String[] strArr = new String[2];
            boolean z = false;
            strArr[0] = eVar.c();
            Throwable d2 = eVar.d();
            strArr[1] = d2 != null ? b(d2) : null;
            String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((T[]) strArr), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            if (joinToString$default.length() > 0) {
                z = true;
            }
            if (z) {
                a(a2, str, joinToString$default);
            }
        }
    }

    public void a(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        Log.println(i, f.a(str), str2);
    }

    private String b(Throwable th) {
        return a(th);
    }

    public String a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return Log.getStackTraceString(th);
    }

    private boolean a(int i) {
        return i >= a();
    }
}

package com.criteo.publisher.logging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.criteo.publisher.i;
import com.criteo.publisher.i0.c;
import com.criteo.publisher.logging.RemoteLogRecords;
import com.criteo.publisher.n0.b;
import com.criteo.publisher.n0.g;
import com.criteo.publisher.z;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemoteLogRecordsFactory.kt */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final SimpleDateFormat f2656a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2657b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2658c;

    /* renamed from: d  reason: collision with root package name */
    private final b f2659d;

    /* renamed from: e  reason: collision with root package name */
    private final z f2660e;

    /* renamed from: f  reason: collision with root package name */
    private final c f2661f;

    /* renamed from: g  reason: collision with root package name */
    private final i f2662g;

    /* renamed from: h  reason: collision with root package name */
    private final i f2663h;

    public k(g gVar, Context context, b bVar, z zVar, c cVar, i iVar, i iVar2) {
        Intrinsics.checkParameterIsNotNull(gVar, "buildConfigWrapper");
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "advertisingInfo");
        Intrinsics.checkParameterIsNotNull(zVar, OutcomeEventsTable.COLUMN_NAME_SESSION);
        Intrinsics.checkParameterIsNotNull(cVar, "integrationRegistry");
        Intrinsics.checkParameterIsNotNull(iVar, "clock");
        Intrinsics.checkParameterIsNotNull(iVar2, "publisherCodeRemover");
        this.f2657b = gVar;
        this.f2658c = context;
        this.f2659d = bVar;
        this.f2660e = zVar;
        this.f2661f = cVar;
        this.f2662g = iVar;
        this.f2663h = iVar2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.f2656a = simpleDateFormat;
    }

    public RemoteLogRecords a(e eVar) {
        Class<?> cls;
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        RemoteLogRecords.RemoteLogLevel a2 = RemoteLogRecords.RemoteLogLevel.Companion.a(eVar.a());
        String b2 = b(eVar);
        String str = null;
        if (a2 == null || b2 == null) {
            return null;
        }
        RemoteLogRecords.b bVar = new RemoteLogRecords.b(a2, CollectionsKt.listOf(b2));
        String q = this.f2657b.q();
        Intrinsics.checkExpressionValueIsNotNull(q, "buildConfigWrapper.sdkVersion");
        String packageName = this.f2658c.getPackageName();
        Intrinsics.checkExpressionValueIsNotNull(packageName, "context.packageName");
        String b3 = this.f2659d.b();
        String b4 = this.f2660e.b();
        int b5 = this.f2661f.b();
        Throwable d2 = eVar.d();
        if (!(d2 == null || (cls = d2.getClass()) == null)) {
            str = cls.getSimpleName();
        }
        String b6 = eVar.b();
        return new RemoteLogRecords(new RemoteLogRecords.a(q, packageName, b3, b4, b5, str, b6, "android-" + Build.VERSION.SDK_INT), CollectionsKt.listOf(bVar));
    }

    public String b(e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "logMessage");
        if (eVar.c() == null && eVar.d() == null) {
            return null;
        }
        String format = this.f2656a.format(new Date(this.f2662g.a()));
        String[] strArr = new String[4];
        strArr[0] = eVar.c();
        Throwable d2 = eVar.d();
        strArr[1] = d2 != null ? b(d2) : null;
        strArr[2] = "threadId:" + a();
        strArr[3] = format;
        List listOfNotNull = CollectionsKt.listOfNotNull((T[]) strArr);
        List list = listOfNotNull.isEmpty() ^ true ? listOfNotNull : null;
        if (list != null) {
            return CollectionsKt.joinToString$default(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
        }
        return null;
    }

    public String a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
        String name = currentThread.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "Thread.currentThread().name");
        return name;
    }

    private String b(Throwable th) {
        return a(this.f2663h.c(th));
    }

    public String a(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "throwable");
        return Log.getStackTraceString(th);
    }
}

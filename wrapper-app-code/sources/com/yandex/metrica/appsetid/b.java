package com.yandex.metrica.appsetid;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class b implements d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Object f3419a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<OnCompleteListener<AppSetIdInfo>> f3420b = new ArrayList();

    public static final class a implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f3421a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f3422b;

        a(b bVar, a aVar) {
            this.f3421a = bVar;
            this.f3422b = aVar;
        }

        public void onComplete(Task<AppSetIdInfo> task) {
            c cVar;
            synchronized (this.f3421a.f3419a) {
                this.f3421a.f3420b.remove(this);
            }
            if (task.isSuccessful()) {
                a aVar = this.f3422b;
                AppSetIdInfo result = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result, "completedTask.result");
                String id = result.getId();
                b bVar = this.f3421a;
                AppSetIdInfo result2 = task.getResult();
                Intrinsics.checkNotNullExpressionValue(result2, "completedTask.result");
                int scope = result2.getScope();
                bVar.getClass();
                if (scope == 1) {
                    cVar = c.APP;
                } else if (scope != 2) {
                    cVar = c.UNKNOWN;
                } else {
                    cVar = c.DEVELOPER;
                }
                aVar.a(id, cVar);
                return;
            }
            this.f3422b.a(task.getException());
        }
    }

    public void a(Context context, a aVar) throws Throwable {
        AppSetIdClient client = AppSet.getClient(context);
        Intrinsics.checkNotNullExpressionValue(client, "AppSet.getClient(context)");
        Task<AppSetIdInfo> appSetIdInfo = client.getAppSetIdInfo();
        Intrinsics.checkNotNullExpressionValue(appSetIdInfo, "client.appSetIdInfo");
        a aVar2 = new a(this, aVar);
        synchronized (this.f3419a) {
            this.f3420b.add(aVar2);
        }
        appSetIdInfo.addOnCompleteListener(aVar2);
    }
}

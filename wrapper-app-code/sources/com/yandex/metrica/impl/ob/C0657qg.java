package com.yandex.metrica.impl.ob;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C0334dg;

/* renamed from: com.yandex.metrica.impl.ob.qg  reason: case insensitive filesystem */
public class C0657qg implements C0508kg {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final InstallReferrerClient f6638a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ICommonExecutor f6639b;

    /* renamed from: com.yandex.metrica.impl.ob.qg$a */
    class a implements InstallReferrerStateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0776vg f6640a;

        /* renamed from: com.yandex.metrica.impl.ob.qg$a$a  reason: collision with other inner class name */
        class C0056a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0334dg f6642a;

            C0056a(C0334dg dgVar) {
                this.f6642a = dgVar;
            }

            public void run() {
                a.this.f6640a.a(this.f6642a);
            }
        }

        a(C0776vg vgVar) {
            this.f6640a = vgVar;
        }

        public void onInstallReferrerServiceDisconnected() {
        }

        public void onInstallReferrerSetupFinished(int i) {
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = C0657qg.this.f6638a.getInstallReferrer();
                    C0657qg.this.f6639b.execute(new C0056a(new C0334dg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), C0334dg.a.GP)));
                } catch (Throwable th) {
                    C0657qg.a(C0657qg.this, this.f6640a, th);
                }
            } else {
                C0657qg qgVar = C0657qg.this;
                C0776vg vgVar = this.f6640a;
                C0657qg.a(qgVar, vgVar, new IllegalStateException("Referrer check failed with error " + i));
            }
            try {
                C0657qg.this.f6638a.endConnection();
            } catch (Throwable unused) {
            }
        }
    }

    C0657qg(InstallReferrerClient installReferrerClient, ICommonExecutor iCommonExecutor) {
        this.f6638a = installReferrerClient;
        this.f6639b = iCommonExecutor;
    }

    public void a(C0776vg vgVar) throws Throwable {
        this.f6638a.startConnection(new a(vgVar));
    }

    static void a(C0657qg qgVar, C0776vg vgVar, Throwable th) {
        qgVar.f6639b.execute(new C0680rg(qgVar, vgVar, th));
    }
}

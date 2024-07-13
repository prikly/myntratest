package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.Looper;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.a;
import com.bytedance.sdk.component.adexpress.b.c;
import com.bytedance.sdk.component.adexpress.b.f;
import com.bytedance.sdk.component.adexpress.b.m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.k;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeRender */
public class l extends a<BackupView> {

    /* renamed from: a  reason: collision with root package name */
    AtomicBoolean f1469a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private BackupView f1470b;

    /* renamed from: c  reason: collision with root package name */
    private View f1471c;

    /* renamed from: d  reason: collision with root package name */
    private c f1472d;

    /* renamed from: e  reason: collision with root package name */
    private f f1473e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.b.l f1474f;

    public l(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.b.l lVar) {
        this.f1471c = view;
        this.f1474f = lVar;
    }

    public void a(f fVar) {
        this.f1473e = fVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            k.d().post(new Runnable() {
                public void run() {
                    l.this.b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        if (!this.f1469a.get()) {
            c cVar = this.f1472d;
            boolean z = false;
            if (cVar != null && cVar.a((NativeExpressView) this.f1471c, 0)) {
                z = true;
            }
            if (!z) {
                this.f1473e.a(107);
                return;
            }
            this.f1474f.c().e();
            BackupView backupView = (BackupView) this.f1471c.findViewWithTag("tt_express_backup_fl_tag_26");
            this.f1470b = backupView;
            if (backupView != null) {
                m mVar = new m();
                BackupView backupView2 = this.f1470b;
                float f2 = 0.0f;
                float realWidth = backupView2 == null ? 0.0f : backupView2.getRealWidth();
                BackupView backupView3 = this.f1470b;
                if (backupView3 != null) {
                    f2 = backupView3.getRealHeight();
                }
                mVar.a(true);
                mVar.a((double) realWidth);
                mVar.b((double) f2);
                this.f1473e.a(this.f1470b, mVar);
                return;
            }
            this.f1473e.a(107);
        }
    }

    /* renamed from: a */
    public BackupView e() {
        return this.f1470b;
    }

    public void a(c cVar) {
        this.f1472d = cVar;
    }
}

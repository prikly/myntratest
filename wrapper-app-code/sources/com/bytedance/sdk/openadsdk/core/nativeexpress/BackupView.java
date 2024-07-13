package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.b.a;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.dislike.b;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;

public abstract class BackupView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private j f1385a;
    /* access modifiers changed from: protected */

    /* renamed from: b  reason: collision with root package name */
    public Context f1386b;
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public n f1387c;

    /* renamed from: d  reason: collision with root package name */
    protected b f1388d;

    /* renamed from: e  reason: collision with root package name */
    protected TTDislikeDialogAbstract f1389e;
    /* access modifiers changed from: protected */

    /* renamed from: f  reason: collision with root package name */
    public String f1390f = "embeded_ad";

    /* renamed from: g  reason: collision with root package name */
    protected int f1391g;

    /* renamed from: h  reason: collision with root package name */
    protected int f1392h;
    protected int i;
    protected boolean j = true;
    protected boolean k = true;
    protected String l;

    /* access modifiers changed from: protected */
    public abstract void a(View view, int i2, com.bytedance.sdk.openadsdk.core.e.j jVar);

    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public BackupView(Context context) {
        super(context);
        setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.l = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public void setDislikeInner(TTAdDislike tTAdDislike) {
        if (tTAdDislike instanceof b) {
            this.f1388d = (b) tTAdDislike;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        n nVar;
        if (!(tTDislikeDialogAbstract == null || (nVar = this.f1387c) == null)) {
            tTDislikeDialogAbstract.setMaterialMeta(nVar);
        }
        this.f1389e = tTDislikeDialogAbstract;
    }

    public void a() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f1389e;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        b bVar = this.f1388d;
        if (bVar != null) {
            bVar.showDislikeDialog();
        } else {
            TTDelegateActivity.a(this.f1387c, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    public String getNameOrSource() {
        n nVar = this.f1387c;
        if (nVar == null) {
            return "";
        }
        if (nVar.aa() != null && !TextUtils.isEmpty(this.f1387c.aa().b())) {
            return this.f1387c.aa().b();
        }
        if (!TextUtils.isEmpty(this.f1387c.K())) {
            return this.f1387c.K();
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public String getTitle() {
        if (this.f1387c.aa() != null && !TextUtils.isEmpty(this.f1387c.aa().b())) {
            return this.f1387c.aa().b();
        }
        if (!TextUtils.isEmpty(this.f1387c.K())) {
            return this.f1387c.K();
        }
        return !TextUtils.isEmpty(this.f1387c.U()) ? this.f1387c.U() : "";
    }

    /* access modifiers changed from: protected */
    public String getDescription() {
        if (!TextUtils.isEmpty(this.f1387c.U())) {
            return this.f1387c.U();
        }
        return !TextUtils.isEmpty(this.f1387c.V()) ? this.f1387c.V() : "";
    }

    public float getRealWidth() {
        return (float) v.d(this.f1386b, (float) this.f1391g);
    }

    public float getRealHeight() {
        return (float) v.d(this.f1386b, (float) this.f1392h);
    }

    /* access modifiers changed from: protected */
    public void a(View view, boolean z) {
        com.bytedance.sdk.openadsdk.core.b.b bVar;
        if (view != null) {
            if (z) {
                Context context = this.f1386b;
                n nVar = this.f1387c;
                String str = this.f1390f;
                bVar = new a(context, nVar, str, u.a(str));
            } else {
                Context context2 = this.f1386b;
                n nVar2 = this.f1387c;
                String str2 = this.f1390f;
                bVar = new com.bytedance.sdk.openadsdk.core.b.b(context2, nVar2, str2, u.a(str2));
            }
            view.setOnTouchListener(bVar);
            view.setOnClickListener(bVar);
            bVar.a((a) new a() {
                public void a(View view, int i, com.bytedance.sdk.openadsdk.core.e.j jVar) {
                    BackupView.this.a(view, i, jVar);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public View getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        n nVar = this.f1387c;
        if (!(nVar == null || this.f1386b == null)) {
            if (n.c(nVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f1386b, this.f1387c, this.f1390f, true, false, this.f1385a);
                    nativeVideoTsView.setVideoCacheUrl(this.l);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.b() {
                        public void a(boolean z, long j, long j2, long j3, boolean z2) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.j);
                    nativeVideoTsView.setIsQuiet(this.k);
                } catch (Throwable unused) {
                }
                if (n.c(this.f1387c) || nativeVideoTsView == null || !nativeVideoTsView.a(0, true, false)) {
                    return null;
                }
                return nativeVideoTsView;
            }
            nativeVideoTsView = null;
            if (n.c(this.f1387c)) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(int i2) {
        this.k = m.h().a(this.i);
        int c2 = m.h().c(i2);
        if (3 == c2) {
            this.j = false;
            return;
        }
        int c3 = o.c(m.a());
        if (1 == c2 && u.e(c3)) {
            this.j = true;
        } else if (2 == c2) {
            if (u.f(c3) || u.e(c3) || u.g(c3)) {
                this.j = true;
            }
        } else if (5 != c2) {
        } else {
            if (u.e(c3) || u.g(c3)) {
                this.j = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        n nVar = this.f1387c;
        if (nVar != null && nVar.J() != null && view != null) {
            if (this.f1387c.p() != 1 || !this.j) {
                a(view, false);
            } else {
                a(view, true);
            }
        }
    }
}

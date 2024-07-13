package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.bannerexpress.a;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.util.ArrayList;
import java.util.List;

public class TTDislikeListView extends ListView {

    /* renamed from: a  reason: collision with root package name */
    protected IListenerManager f1874a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public n f1875b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public AdapterView.OnItemClickListener f1876c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f1877d;

    /* renamed from: e  reason: collision with root package name */
    private AdapterView.OnItemClickListener f1878e = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (TTDislikeListView.this.getAdapter() == null || TTDislikeListView.this.getAdapter().getItem(i) == null || !(TTDislikeListView.this.getAdapter().getItem(i) instanceof FilterWord)) {
                throw new IllegalArgumentException("Adapter data is abnormal, it must be FilterWord");
            }
            FilterWord filterWord = (FilterWord) TTDislikeListView.this.getAdapter().getItem(i);
            if (!filterWord.hasSecondOptions()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(filterWord);
                if (TTDislikeListView.this.f1875b != null) {
                    e.a(TTDislikeListView.this.f1875b, (List<FilterWord>) arrayList);
                }
                if (!TextUtils.isEmpty(TTDislikeListView.this.f1877d)) {
                    if (b.c()) {
                        TTDislikeListView.this.a("onItemClickClosed");
                    } else {
                        a.C0004a e2 = h.d().e(TTDislikeListView.this.f1877d);
                        if (e2 != null) {
                            e2.a();
                            h.d().f(TTDislikeListView.this.f1877d);
                        }
                    }
                }
            }
            try {
                if (TTDislikeListView.this.f1876c != null) {
                    TTDislikeListView.this.f1876c.onItemClick(adapterView, view, i, j);
                }
            } catch (Throwable unused) {
            }
        }
    };

    public TTDislikeListView(Context context) {
        super(context);
        a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public TTDislikeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public void setMaterialMeta(n nVar) {
        this.f1875b = nVar;
    }

    private void a() {
        super.setOnItemClickListener(this.f1878e);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1876c = onItemClickListener;
    }

    public void setClosedListenerKey(String str) {
        this.f1877d = str;
    }

    /* access modifiers changed from: private */
    public void a(final String str) {
        com.bytedance.sdk.component.f.e.c(new g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    if (!TextUtils.isEmpty(TTDislikeListView.this.f1877d)) {
                        TTDislikeListView.this.a(6).executeDisLikeClosedCallback(TTDislikeListView.this.f1877d, str);
                    }
                } catch (Throwable th) {
                    l.c("TTDislikeListView", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    public IListenerManager a(int i) {
        if (this.f1874a == null) {
            this.f1874a = com.bytedance.sdk.openadsdk.multipro.aidl.a.a.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a()).a(i));
        }
        return this.f1874a;
    }

    public static void a(final int i, final String str, final a.C0004a aVar) {
        if (b.c()) {
            com.bytedance.sdk.component.f.e.c(new g("DislikeClosed_registerMultiProcessListener") {
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.a a2 = com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a());
                    if (i == 6 && aVar != null) {
                        try {
                            l.b("TTDislikeListView", "start registerDislikeClickCloseListener ! ");
                            com.bytedance.sdk.openadsdk.multipro.aidl.b.b bVar = new com.bytedance.sdk.openadsdk.multipro.aidl.b.b(str, aVar);
                            IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.a.e.asInterface(a2.a(6));
                            if (asInterface != null) {
                                asInterface.registerDisLikeClosedListener(str, bVar);
                                l.b("TTDislikeListView", "end registerDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException e2) {
                            e2.printStackTrace();
                            l.b("TTDislikeListView", "multiProcess registerDislikeClickCloseListener error");
                        }
                    }
                }
            }, 5);
        }
    }

    public static void a(final int i, final String str) {
        if (b.c()) {
            com.bytedance.sdk.component.f.e.c(new g("DislikeClosed_unregisterMultiProcessListener") {
                public void run() {
                    com.bytedance.sdk.openadsdk.multipro.aidl.a a2 = com.bytedance.sdk.openadsdk.multipro.aidl.a.a(m.a());
                    if (i == 6) {
                        try {
                            l.b("TTDislikeListView", "start unregisterDislikeClickCloseListener ! ");
                            IListenerManager asInterface = com.bytedance.sdk.openadsdk.multipro.aidl.a.e.asInterface(a2.a(6));
                            if (asInterface != null) {
                                asInterface.unregisterDisLikeClosedListener(str);
                                l.b("TTDislikeListView", "end unregisterDislikeClickCloseListener ! ");
                            }
                        } catch (RemoteException unused) {
                            l.b("TTDislikeListView", "multiProcess unregisterMultiProcessListener error");
                        }
                    }
                }
            }, 5);
        }
    }
}

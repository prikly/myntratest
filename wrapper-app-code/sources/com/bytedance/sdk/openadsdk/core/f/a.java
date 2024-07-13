package com.bytedance.sdk.openadsdk.core.f;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTImage;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.e.k;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.l;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.dislike.b;
import com.bytedance.sdk.openadsdk.utils.q;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: TTNativeAdImpl */
public class a implements TTNativeAd {

    /* renamed from: a  reason: collision with root package name */
    private int f1178a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1179b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1180c;
    /* access modifiers changed from: protected */

    /* renamed from: g  reason: collision with root package name */
    public final l f1181g;

    /* renamed from: h  reason: collision with root package name */
    protected final n f1182h;
    protected final Context i;
    protected TTAdDislike j;
    protected int k;
    protected String l;

    private String a(int i2) {
        return i2 != 1 ? i2 != 2 ? (i2 == 5 || i2 != 9) ? "embeded_ad" : "draw_ad" : "interaction" : "banner_ad";
    }

    public View getAdView() {
        return null;
    }

    public a(Context context, n nVar, int i2) {
        if (nVar == null) {
            com.bytedance.sdk.component.utils.l.b("materialMeta can't been null");
        }
        this.f1182h = nVar;
        this.i = context;
        this.k = i2;
        this.f1181g = new l(context, this, nVar, a(i2));
    }

    public void registerViewForInteraction(ViewGroup viewGroup, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (view == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(view);
            registerViewForInteraction(viewGroup, arrayList, (List<View>) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (list == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else if (list.size() <= 0) {
            com.bytedance.sdk.component.utils.l.b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, list, list2, (View) null, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (list == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else if (list.size() <= 0) {
            com.bytedance.sdk.component.utils.l.b("clickViews size must been more than 1");
        } else {
            registerViewForInteraction(viewGroup, (List<View>) null, list, list2, view, adInteractionListener);
        }
    }

    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, TTNativeAd.AdInteractionListener adInteractionListener) {
        if (viewGroup == null) {
            com.bytedance.sdk.component.utils.l.b("container can't been null");
        } else if (list2 == null) {
            com.bytedance.sdk.component.utils.l.b("clickView can't been null");
        } else if (list2.size() <= 0) {
            com.bytedance.sdk.component.utils.l.b("clickViews size must been more than 1");
        } else {
            a(list3 != null && list3.size() > 0);
            if (a()) {
                list3 = a(list2, list3);
            }
            this.f1181g.a(viewGroup, list, list2, list3, view, adInteractionListener);
        }
    }

    private List<View> a(List<View> list, List<View> list2) {
        LinkedList linkedList = new LinkedList();
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                linkedList.add(list.get(i2));
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                linkedList.add(list2.get(i3));
            }
        }
        return linkedList;
    }

    public TTImage getVideoCoverImage() {
        n nVar = this.f1182h;
        if (nVar == null || nVar.J() == null) {
            return null;
        }
        return new TTImage(this.f1182h.J().b(), this.f1182h.J().c(), this.f1182h.J().h());
    }

    public Bitmap getAdLogo() {
        return BitmapFactory.decodeResource(this.i.getResources(), t.d(m.a(), "tt_ad_logo_new"));
    }

    public String getTitle() {
        if (this.f1182h.aa() != null && !TextUtils.isEmpty(this.f1182h.aa().b())) {
            return this.f1182h.aa().b();
        }
        if (!TextUtils.isEmpty(getSource())) {
            return getSource();
        }
        return this.f1182h.U();
    }

    public String getDescription() {
        if (!TextUtils.isEmpty(this.f1182h.U())) {
            return this.f1182h.U();
        }
        return this.f1182h.V();
    }

    public String getButtonText() {
        return this.f1182h.W();
    }

    public int getAppScore() {
        if (this.f1182h.aa() != null) {
            return (int) this.f1182h.aa().d();
        }
        return 0;
    }

    public int getAppCommentNum() {
        if (this.f1182h.aa() != null) {
            return this.f1182h.aa().e();
        }
        return 0;
    }

    public int getAppSize() {
        if (this.f1182h.aa() != null) {
            return this.f1182h.aa().f();
        }
        return 0;
    }

    public String getSource() {
        return this.f1182h.K();
    }

    public TTImage getIcon() {
        if (this.f1182h.M() == null) {
            return null;
        }
        return k.a(this.f1182h.M());
    }

    public List<TTImage> getImageList() {
        ArrayList arrayList = new ArrayList();
        if (this.f1182h.P() != null && !this.f1182h.P().isEmpty()) {
            for (k a2 : this.f1182h.P()) {
                arrayList.add(k.a(a2));
            }
        }
        return arrayList;
    }

    public int getInteractionType() {
        n nVar = this.f1182h;
        if (nVar == null) {
            return -1;
        }
        return nVar.L();
    }

    public int getImageMode() {
        n nVar = this.f1182h;
        if (nVar == null) {
            return -1;
        }
        return nVar.ad();
    }

    public List<FilterWord> getFilterWords() {
        n nVar = this.f1182h;
        if (nVar == null) {
            return null;
        }
        return nVar.ae();
    }

    public TTAdDislike getDislikeDialog(Activity activity) {
        if (this.j == null) {
            a(activity);
        }
        return this.j;
    }

    public TTAdDislike getDislikeDialog(final TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.setMaterialMeta(this.f1182h);
            return new TTAdDislike() {
                public void setDislikeInteractionCallback(TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
                }

                public void showDislikeDialog() {
                    if ((tTDislikeDialogAbstract.getContext() instanceof Activity) && !((Activity) tTDislikeDialogAbstract.getContext()).isFinishing()) {
                        tTDislikeDialogAbstract.show();
                    }
                }
            };
        }
        throw new IllegalArgumentException("dialog is null, please check");
    }

    public View getAdLogoView() {
        if (this.i == null) {
            com.bytedance.sdk.component.utils.l.e("TTNativeAdImpl", "getAdLogoView mContext == null");
            return null;
        }
        ImageView imageView = new ImageView(this.i);
        imageView.setImageResource(t.d(this.i, "tt_ad_logo_new"));
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                a.this.showPrivacyActivity();
            }
        });
        return imageView;
    }

    public Map<String, Object> getMediaExtraInfo() {
        n nVar = this.f1182h;
        if (nVar != null) {
            return nVar.aj();
        }
        return null;
    }

    private void a(Activity activity) {
        Context context = this.i;
        Context context2 = activity;
        if (context instanceof Activity) {
            context2 = activity;
            if (!((Activity) context).isFinishing()) {
                context2 = this.i;
            }
        }
        this.j = new b(context2, this.f1182h);
    }

    private void a(boolean z) {
        com.bytedance.sdk.openadsdk.h.a.b c2 = com.bytedance.sdk.openadsdk.h.a.b.b().a(this.k).c(String.valueOf(u.f(this.f1182h)));
        if (z) {
            com.bytedance.sdk.openadsdk.h.b.a().c(c2);
        } else {
            com.bytedance.sdk.openadsdk.h.b.a().d(c2);
        }
    }

    private boolean a() {
        n nVar = this.f1182h;
        if (nVar == null || nVar.L() == 5) {
            return false;
        }
        if (this.f1178a == 0) {
            this.f1178a = u.f(this.f1182h);
        }
        if (m.h().d(this.f1178a) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.l = str;
    }

    public void showPrivacyActivity() {
        Context context = this.i;
        if (context != null) {
            TTWebsiteActivity.a(context, this.f1182h, this.l);
        }
    }

    public String getAdCreativeToken() {
        return this.f1182h.n();
    }

    public void win(Double d2) {
        if (!this.f1179b) {
            q.a(this.f1182h, d2);
            this.f1179b = true;
        }
    }

    public void loss(Double d2, String str, String str2) {
        if (!this.f1180c) {
            q.a(this.f1182h, d2, str, str2);
            this.f1180c = true;
        }
    }

    public void setPrice(Double d2) {
        l lVar = this.f1181g;
        if (lVar != null) {
            lVar.a(d2);
        }
    }
}

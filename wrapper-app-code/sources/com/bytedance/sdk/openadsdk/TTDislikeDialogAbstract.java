package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;

public abstract class TTDislikeDialogAbstract extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private View f19369a;

    /* renamed from: b  reason: collision with root package name */
    private n f19370b;

    public abstract int getLayoutId();

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract int[] getTTDislikeListViewIds();

    public TTDislikeDialogAbstract(Context context) {
        super(context);
    }

    public TTDislikeDialogAbstract(Context context, int i) {
        super(context, i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), (ViewGroup) null);
        this.f19369a = inflate;
        if (inflate != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            View view = this.f19369a;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            setContentView(view, layoutParams);
            a();
            return;
        }
        throw new IllegalArgumentException("getLayoutId,layout id may be abnormal, please check");
    }

    private void a() {
        if (this.f19370b != null && this.f19369a != null) {
            int[] tTDislikeListViewIds = getTTDislikeListViewIds();
            if (tTDislikeListViewIds == null || tTDislikeListViewIds.length <= 0) {
                throw new IllegalArgumentException("The options list of dislike is empty, please set TTDislikeListView");
            }
            int length = tTDislikeListViewIds.length;
            int i = 0;
            while (i < length) {
                View findViewById = this.f19369a.findViewById(tTDislikeListViewIds[i]);
                if (findViewById == null) {
                    throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id,please check");
                } else if (findViewById instanceof TTDislikeListView) {
                    ((TTDislikeListView) findViewById).setMaterialMeta(this.f19370b);
                    i++;
                } else {
                    throw new IllegalArgumentException("getTTDislikeListViewIds can not find view by Id , please check");
                }
            }
        }
    }

    public void setMaterialMeta(n nVar) {
        this.f19370b = nVar;
        a();
    }
}

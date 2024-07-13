package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class d extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private List<c> f14881a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Map<Integer, Integer> f14882b = CollectionUtils.map();
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public Context f14883c;

    /* renamed from: d  reason: collision with root package name */
    private a f14884d;

    public interface a {
        void a(a aVar, c cVar);
    }

    protected d(Context context) {
        this.f14883c = context.getApplicationContext();
    }

    private a e(int i) {
        for (int i2 = 0; i2 < e(); i2++) {
            Integer num = this.f14882b.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + a(i2)) {
                    return new a(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i);

    public void a(a aVar) {
        this.f14884d = aVar;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract c b(int i);

    /* access modifiers changed from: protected */
    public abstract List<c> c(int i);

    /* renamed from: d */
    public c getItem(int i) {
        return this.f14881a.get(i);
    }

    /* access modifiers changed from: protected */
    public abstract int e();

    public int getCount() {
        return this.f14881a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return getItem(i).i();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        c d2 = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(d2.j(), viewGroup, false);
            bVar = new b();
            bVar.f14852a = (TextView) view.findViewById(16908308);
            bVar.f14853b = (TextView) view.findViewById(16908309);
            bVar.f14854c = (ImageView) view.findViewById(R.id.imageView);
            bVar.f14855d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(bVar);
            view.setOnClickListener(this);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.a(i);
        bVar.a(d2);
        view.setEnabled(d2.c());
        return view;
    }

    public int getViewTypeCount() {
        return c.h();
    }

    public boolean isEnabled(int i) {
        return getItem(i).c();
    }

    public void n() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                d.this.notifyDataSetChanged();
            }
        });
    }

    public void notifyDataSetChanged() {
        int i;
        super.notifyDataSetChanged();
        this.f14881a = new ArrayList();
        int e2 = e();
        this.f14882b = CollectionUtils.map(e2);
        c o = o();
        if (o != null) {
            this.f14881a.add(o);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < e2; i2++) {
            int a2 = a(i2);
            if (a2 != 0) {
                this.f14881a.add(b(i2));
                this.f14881a.addAll(c(i2));
                this.f14882b.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += a2 + 1;
            }
        }
        this.f14881a.add(new e(""));
    }

    /* access modifiers changed from: protected */
    public c o() {
        return null;
    }

    public void onClick(View view) {
        b bVar = (b) view.getTag();
        c b2 = bVar.b();
        a e2 = e(bVar.a());
        a aVar = this.f14884d;
        if (aVar != null && e2 != null) {
            aVar.a(e2, b2);
        }
    }
}

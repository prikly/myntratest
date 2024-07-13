package com.bytedance.sdk.openadsdk.dislike;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TTDislikeDialogDefault */
public class c extends TTDislikeDialogAbstract {

    /* renamed from: a  reason: collision with root package name */
    private TTDislikeListView f1894a;

    /* renamed from: b  reason: collision with root package name */
    private TTDislikeListView f1895b;

    /* renamed from: c  reason: collision with root package name */
    private RelativeLayout f1896c;

    /* renamed from: d  reason: collision with root package name */
    private View f1897d;

    /* renamed from: e  reason: collision with root package name */
    private b f1898e;

    /* renamed from: f  reason: collision with root package name */
    private b f1899f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public n f1900g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public a f1901h;
    private String i;

    /* compiled from: TTDislikeDialogDefault */
    public interface a {
        void a();

        void a(int i, FilterWord filterWord);

        void b();

        void c();
    }

    public c(Context context, n nVar) {
        super(context, t.g(context, "tt_dislikeDialog"));
        this.f1900g = nVar;
    }

    public void a(n nVar) {
        b bVar = this.f1898e;
        if (bVar != null && nVar != null) {
            this.f1900g = nVar;
            bVar.a(nVar.ae());
            setMaterialMeta(this.f1900g);
        }
    }

    public void a(a aVar) {
        this.f1901h = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        a();
        a(getContext());
        b();
        setMaterialMeta(this.f1900g);
    }

    public void a(String str) {
        this.i = str;
    }

    public int getLayoutId() {
        return t.f(getContext(), "tt_dislike_dialog_layout");
    }

    public int[] getTTDislikeListViewIds() {
        return new int[]{t.e(getContext(), "tt_filer_words_lv"), t.e(getContext(), "tt_filer_words_lv_second")};
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(v.c(getContext()) - 120, -2);
    }

    public void show() {
        super.show();
        c();
    }

    private void a() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.y = 50;
            window.setAttributes(attributes);
        }
    }

    private void b() {
        setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                if (c.this.f1901h != null) {
                    c.this.f1901h.a();
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                if (c.this.f1901h != null) {
                    c.this.f1901h.b();
                }
            }
        });
        b bVar = new b(getLayoutInflater(), this.f1900g.ae());
        this.f1898e = bVar;
        this.f1894a.setAdapter(bVar);
        b bVar2 = new b(getLayoutInflater(), new ArrayList());
        this.f1899f = bVar2;
        bVar2.a(false);
        this.f1895b.setAdapter(this.f1899f);
    }

    private void a(Context context) {
        this.f1896c = (RelativeLayout) findViewById(t.e(getContext(), "tt_dislike_title_content"));
        this.f1897d = findViewById(t.e(getContext(), "tt_dislike_line1"));
        TextView textView = (TextView) findViewById(t.e(getContext(), "tt_dislike_header_back"));
        textView.setText(t.a(getContext(), "tt_dislike_header_tv_back"));
        ((TextView) findViewById(t.e(getContext(), "tt_dislike_header_tv"))).setText(t.a(getContext(), "tt_dislike_header_tv_title"));
        textView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                c.this.c();
                if (c.this.f1901h != null) {
                    c.this.f1901h.c();
                }
            }
        });
        TTDislikeListView tTDislikeListView = (TTDislikeListView) findViewById(t.e(getContext(), "tt_filer_words_lv"));
        this.f1894a = tTDislikeListView;
        tTDislikeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x0027 }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x0027 }
                    boolean r2 = r1.hasSecondOptions()     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0028
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.c.this     // Catch:{ all -> 0x0027 }
                    r2.a((com.bytedance.sdk.openadsdk.FilterWord) r1)     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f1901h     // Catch:{ all -> 0x0027 }
                    if (r2 == 0) goto L_0x0026
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.c.this     // Catch:{ all -> 0x0027 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f1901h     // Catch:{ all -> 0x0027 }
                    r2.a(r3, r1)     // Catch:{ all -> 0x0027 }
                L_0x0026:
                    return
                L_0x0027:
                L_0x0028:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f1901h
                    if (r1 == 0) goto L_0x0049
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.c.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.dislike.c$a r1 = r1.f1901h     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.c.this     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.core.e.n r2 = r2.f1900g     // Catch:{ all -> 0x0049 }
                    java.util.List r2 = r2.ae()     // Catch:{ all -> 0x0049 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0049 }
                    com.bytedance.sdk.openadsdk.FilterWord r2 = (com.bytedance.sdk.openadsdk.FilterWord) r2     // Catch:{ all -> 0x0049 }
                    r1.a(r3, r2)     // Catch:{ all -> 0x0049 }
                L_0x0049:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.c.AnonymousClass4.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f1894a.setClosedListenerKey(this.i);
        TTDislikeListView tTDislikeListView2 = (TTDislikeListView) findViewById(t.e(getContext(), "tt_filer_words_lv_second"));
        this.f1895b = tTDislikeListView2;
        tTDislikeListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.AdapterView<?>, android.widget.AdapterView] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                /*
                    r0 = this;
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.c.this
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f1901h
                    if (r2 == 0) goto L_0x001b
                    android.widget.Adapter r1 = r1.getAdapter()     // Catch:{ all -> 0x001b }
                    java.lang.Object r1 = r1.getItem(r3)     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.FilterWord r1 = (com.bytedance.sdk.openadsdk.FilterWord) r1     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c r2 = com.bytedance.sdk.openadsdk.dislike.c.this     // Catch:{ all -> 0x001b }
                    com.bytedance.sdk.openadsdk.dislike.c$a r2 = r2.f1901h     // Catch:{ all -> 0x001b }
                    r2.a(r3, r1)     // Catch:{ all -> 0x001b }
                L_0x001b:
                    com.bytedance.sdk.openadsdk.dislike.c r1 = com.bytedance.sdk.openadsdk.dislike.c.this
                    r1.dismiss()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.dislike.c.AnonymousClass5.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
            }
        });
        this.f1895b.setClosedListenerKey(this.i);
    }

    /* access modifiers changed from: private */
    public void c() {
        RelativeLayout relativeLayout = this.f1896c;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        View view = this.f1897d;
        if (view != null) {
            view.setVisibility(8);
        }
        TTDislikeListView tTDislikeListView = this.f1894a;
        if (tTDislikeListView != null) {
            tTDislikeListView.setVisibility(0);
        }
        b bVar = this.f1899f;
        if (bVar != null) {
            bVar.a();
        }
        TTDislikeListView tTDislikeListView2 = this.f1895b;
        if (tTDislikeListView2 != null) {
            tTDislikeListView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public void a(FilterWord filterWord) {
        if (filterWord != null) {
            b bVar = this.f1899f;
            if (bVar != null) {
                bVar.a(filterWord.getOptions());
            }
            RelativeLayout relativeLayout = this.f1896c;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            View view = this.f1897d;
            if (view != null) {
                view.setVisibility(0);
            }
            TTDislikeListView tTDislikeListView = this.f1894a;
            if (tTDislikeListView != null) {
                tTDislikeListView.setVisibility(8);
            }
            TTDislikeListView tTDislikeListView2 = this.f1895b;
            if (tTDislikeListView2 != null) {
                tTDislikeListView2.setVisibility(0);
            }
        }
    }

    /* compiled from: TTDislikeDialogDefault */
    public static class b extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1907a = true;

        /* renamed from: b  reason: collision with root package name */
        private final List<FilterWord> f1908b;

        /* renamed from: c  reason: collision with root package name */
        private final LayoutInflater f1909c;

        public long getItemId(int i) {
            return (long) i;
        }

        public b(LayoutInflater layoutInflater, List<FilterWord> list) {
            this.f1908b = list;
            this.f1909c = layoutInflater;
        }

        public void a(boolean z) {
            this.f1907a = z;
        }

        public int getCount() {
            List<FilterWord> list = this.f1908b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Object getItem(int i) {
            return this.f1908b.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            a aVar;
            if (view == null) {
                aVar = new a();
                LayoutInflater layoutInflater = this.f1909c;
                view2 = layoutInflater.inflate(t.f(layoutInflater.getContext(), "tt_dialog_listview_item"), viewGroup, false);
                aVar.f1910a = (TextView) view2.findViewById(t.e(this.f1909c.getContext(), "tt_item_tv"));
                aVar.f1911b = (ImageView) view2.findViewById(t.e(this.f1909c.getContext(), "tt_item_arrow"));
                view2.setTag(aVar);
            } else {
                view2 = view;
                aVar = (a) view.getTag();
            }
            FilterWord filterWord = this.f1908b.get(i);
            aVar.f1910a.setText(filterWord.getName());
            if (i != this.f1908b.size() - 1) {
                aVar.f1910a.setBackgroundResource(t.d(this.f1909c.getContext(), "tt_dislike_middle_seletor"));
            } else {
                aVar.f1910a.setBackgroundResource(t.d(this.f1909c.getContext(), "tt_dislike_bottom_seletor"));
            }
            if (this.f1907a && i == 0) {
                aVar.f1910a.setBackgroundResource(t.d(this.f1909c.getContext(), "tt_dislike_top_seletor"));
            }
            if (filterWord.hasSecondOptions()) {
                aVar.f1911b.setVisibility(0);
            } else {
                aVar.f1911b.setVisibility(8);
            }
            return view2;
        }

        public void a(List<FilterWord> list) {
            if (list != null && !list.isEmpty()) {
                this.f1908b.clear();
                this.f1908b.addAll(list);
                notifyDataSetChanged();
            }
        }

        public void a() {
            this.f1908b.clear();
            notifyDataSetChanged();
        }

        /* compiled from: TTDislikeDialogDefault */
        private static class a {

            /* renamed from: a  reason: collision with root package name */
            TextView f1910a;

            /* renamed from: b  reason: collision with root package name */
            ImageView f1911b;

            private a() {
            }
        }
    }
}

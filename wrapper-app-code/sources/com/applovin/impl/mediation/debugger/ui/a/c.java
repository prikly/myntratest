package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f14769a;

    /* renamed from: b  reason: collision with root package name */
    private n f14770b;

    /* renamed from: c  reason: collision with root package name */
    private d f14771c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<com.applovin.impl.mediation.debugger.ui.d.c> f14772d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14773e;

    /* renamed from: f  reason: collision with root package name */
    private ListView f14774f;

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (com.applovin.impl.mediation.debugger.b.a.a next : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.a(), -16777216));
            spannableStringBuilder.append(new SpannedString("\n"));
            spannableStringBuilder.append(StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append(StringUtils.createListItemDetailSpannedString(next.c(), -16777216));
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.a(c.b.DETAIL).a(StringUtils.createSpannedString(next.b(), -16777216, 18, 1)).b(new SpannedString(spannableStringBuilder)).a((Context) this).a(true).a());
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public n getSdk() {
        return this.f14770b;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.a.a> list, boolean z, final n nVar) {
        this.f14769a = list;
        this.f14773e = z;
        this.f14770b = nVar;
        this.f14772d = a(list);
        AnonymousClass1 r3 = new d(this) {
            /* access modifiers changed from: protected */
            public int a(int i) {
                return list.size();
            }

            /* access modifiers changed from: protected */
            public com.applovin.impl.mediation.debugger.ui.d.c b(int i) {
                return new e("");
            }

            /* access modifiers changed from: protected */
            public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i) {
                return c.this.f14772d;
            }

            /* access modifiers changed from: protected */
            public int e() {
                return 1;
            }
        };
        this.f14771c = r3;
        r3.a((d.a) new d.a() {
            public void a(final com.applovin.impl.mediation.debugger.ui.d.a aVar, com.applovin.impl.mediation.debugger.ui.d.c cVar) {
                b.a(c.this, MaxDebuggerAdUnitDetailActivity.class, nVar.ai(), new b.a<MaxDebuggerAdUnitDetailActivity>() {
                    public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((com.applovin.impl.mediation.debugger.b.a.a) list.get(aVar.b()), (com.applovin.impl.mediation.debugger.b.a.b) null, nVar);
                    }
                });
            }
        });
        this.f14771c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14773e ? "Selective Init " : "");
        sb.append("Ad Units");
        setTitle(sb.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f14774f = listView;
        listView.setAdapter(this.f14771c);
    }
}

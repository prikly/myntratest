package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.ui.a;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public class b extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public n f14921a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f14922b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public d f14923c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<c> f14924d;

    /* renamed from: e  reason: collision with root package name */
    private ListView f14925e;

    public b() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    private List<c> a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final com.applovin.impl.mediation.debugger.b.c.b next : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(this, next) {
                public int a() {
                    if (b.this.f14921a.N().c() == null || !b.this.f14921a.N().c().equals(next.h())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                public int b() {
                    if (b.this.f14921a.N().c() == null || !b.this.f14921a.N().c().equals(next.h())) {
                        return super.b();
                    }
                    return -16776961;
                }

                public SpannedString k() {
                    return StringUtils.createSpannedString(next.i(), c() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public n getSdk() {
        return this.f14921a;
    }

    public void initialize(final List<com.applovin.impl.mediation.debugger.b.c.b> list, final n nVar) {
        this.f14921a = nVar;
        this.f14922b = list;
        this.f14924d = a(list);
        AnonymousClass1 r0 = new d(this) {
            /* access modifiers changed from: protected */
            public int a(int i) {
                return list.size();
            }

            /* access modifiers changed from: protected */
            public c b(int i) {
                return new e("TEST MODE NETWORKS");
            }

            /* access modifiers changed from: protected */
            public List<c> c(int i) {
                return b.this.f14924d;
            }

            /* access modifiers changed from: protected */
            public int e() {
                return 1;
            }

            /* access modifiers changed from: protected */
            public c o() {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }
        };
        this.f14923c = r0;
        r0.a((d.a) new d.a() {
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                com.applovin.impl.mediation.debugger.b.c.b bVar = (com.applovin.impl.mediation.debugger.b.c.b) list.get(aVar.b());
                String h2 = bVar.h();
                String c2 = nVar.N().c();
                if (!StringUtils.isValidString(h2) || !StringUtils.isValidString(c2) || !h2.equals(c2)) {
                    nVar.N().a(true);
                    nVar.N().a(h2);
                    b.this.getSdk().aj().b(bVar.i());
                } else {
                    nVar.N().a(false);
                    nVar.N().a((String) null);
                    b.this.getSdk().aj().b((String) null);
                }
                b.this.f14923c.notifyDataSetChanged();
            }
        });
        this.f14923c.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f14925e = listView;
        listView.setAdapter(this.f14923c);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f14924d = a(this.f14922b);
        this.f14923c.notifyDataSetChanged();
    }
}

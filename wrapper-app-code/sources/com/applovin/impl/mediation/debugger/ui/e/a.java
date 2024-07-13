package com.applovin.impl.mediation.debugger.ui.e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.a.d;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public class a extends com.applovin.impl.mediation.debugger.ui.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public n f14886a;

    /* renamed from: b  reason: collision with root package name */
    private List<d> f14887b;

    /* renamed from: c  reason: collision with root package name */
    private List<d> f14888c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public com.applovin.impl.mediation.debugger.ui.d.d f14889d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<c> f14890e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<c> f14891f;

    /* renamed from: g  reason: collision with root package name */
    private ListView f14892g;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a  reason: collision with other inner class name */
    enum C0150a {
        BIDDERS,
        WATERFALL,
        f14899c
    }

    public a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: private */
    public d a(com.applovin.impl.mediation.debugger.ui.d.a aVar) {
        return (aVar.a() == C0150a.BIDDERS.ordinal() ? this.f14887b : this.f14888c).get(aVar.b());
    }

    private List<c> a(List<d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final d next : list) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(next.c(), this) {
                public int a() {
                    if (a.this.f14886a.N().c() == null || !a.this.f14886a.N().c().equals(next.a())) {
                        return 0;
                    }
                    return R.drawable.applovin_ic_check_mark_borderless;
                }

                public int b() {
                    if (a.this.f14886a.N().c() == null || !a.this.f14886a.N().c().equals(next.a())) {
                        return super.b();
                    }
                    return -16776961;
                }

                public SpannedString k() {
                    return StringUtils.createSpannedString(next.b(), c() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public n getSdk() {
        return this.f14886a;
    }

    public void initialize(List<d> list, List<d> list2, final n nVar) {
        this.f14886a = nVar;
        this.f14887b = list;
        this.f14888c = list2;
        this.f14890e = a(list);
        this.f14891f = a(list2);
        AnonymousClass1 r1 = new com.applovin.impl.mediation.debugger.ui.d.d(this) {
            /* access modifiers changed from: protected */
            public int a(int i) {
                return (i == C0150a.BIDDERS.ordinal() ? a.this.f14890e : a.this.f14891f).size();
            }

            /* access modifiers changed from: protected */
            public c b(int i) {
                return i == C0150a.BIDDERS.ordinal() ? new e("BIDDERS") : new e("WATERFALL");
            }

            /* access modifiers changed from: protected */
            public List<c> c(int i) {
                return i == C0150a.BIDDERS.ordinal() ? a.this.f14890e : a.this.f14891f;
            }

            /* access modifiers changed from: protected */
            public int e() {
                return C0150a.f14899c.ordinal();
            }

            /* access modifiers changed from: protected */
            public c o() {
                return new c.a(c.b.SECTION_CENTERED).a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
            }
        };
        this.f14889d = r1;
        r1.a((d.a) new d.a() {
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                com.applovin.impl.mediation.debugger.b.a.d a2 = a.this.a(aVar);
                if (!StringUtils.isValidString(a2.a()) || !StringUtils.isValidString(nVar.N().c()) || !a2.a().equals(nVar.N().c())) {
                    nVar.N().a(true);
                    nVar.N().a(a2.a());
                    nVar.aj().a(a2.b());
                } else {
                    nVar.N().a(false);
                    nVar.N().a((String) null);
                    nVar.aj().a((String) null);
                }
                a.this.f14889d.notifyDataSetChanged();
            }
        });
        this.f14889d.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f14892g = listView;
        listView.setAdapter(this.f14889d);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f14890e = a(this.f14887b);
        this.f14891f = a(this.f14888c);
        this.f14889d.n();
    }
}

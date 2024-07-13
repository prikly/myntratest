package com.applovin.impl.mediation.debugger.ui.c;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.sdk.R;

public class a extends com.applovin.impl.mediation.debugger.ui.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public b f14831a;

    /* renamed from: b  reason: collision with root package name */
    private ListView f14832b;

    public a() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: protected */
    public n getSdk() {
        b bVar = this.f14831a;
        if (bVar != null) {
            return bVar.a().y();
        }
        return null;
    }

    public void initialize(final b bVar) {
        setTitle(bVar.i());
        b bVar2 = new b(bVar, this);
        this.f14831a = bVar2;
        bVar2.a((d.a) new d.a() {
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.TEST_ADS.ordinal()) {
                    n y = bVar.y();
                    b.C0146b c2 = bVar.c();
                    if (a.this.f14831a.a(aVar)) {
                        if (b.C0146b.READY == c2) {
                            com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerMultiAdActivity.class, y.ai(), new b.a<MaxDebuggerMultiAdActivity>() {
                                public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                                    maxDebuggerMultiAdActivity.initialize(bVar);
                                }
                            });
                            return;
                        } else if (b.C0146b.DISABLED == c2) {
                            y.N().d();
                        }
                    }
                }
                Utils.showAlert(cVar.l(), cVar.m(), (Context) a.this);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f14832b = listView;
        listView.setAdapter(this.f14831a);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f14831a.a().m().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", ""))) {
            this.f14831a.b();
            this.f14831a.n();
        }
    }
}

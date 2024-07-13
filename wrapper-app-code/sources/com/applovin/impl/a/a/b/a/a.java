package com.applovin.impl.a.a.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.a.a.b.a.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.utils.b;
import com.applovin.sdk.R;

public class a extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public b f13970a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f13971b;

    /* renamed from: c  reason: collision with root package name */
    private ListView f13972c;

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.f13971b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f13971b.bringChildToFront(textView);
    }

    public void a(b bVar, final com.applovin.impl.sdk.a aVar) {
        this.f13970a = bVar;
        bVar.a((d.a) new d.a() {
            public void a(final com.applovin.impl.mediation.debugger.ui.d.a aVar, c cVar) {
                if (aVar.a() == b.a.RECENT_ADS.ordinal()) {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxCreativeDebuggerDisplayedAdActivity.class, aVar, new b.a<MaxCreativeDebuggerDisplayedAdActivity>() {
                        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                            maxCreativeDebuggerDisplayedAdActivity.a(a.this.f13970a.d().get(aVar.b()), a.this.f13970a.c());
                        }
                    });
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f13971b = (FrameLayout) findViewById(16908290);
        this.f13972c = (ListView) findViewById(R.id.listView);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f13970a;
        if (bVar != null) {
            bVar.a((d.a) null);
            this.f13970a.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        int i;
        super.onStart();
        this.f13972c.setAdapter(this.f13970a);
        b bVar = this.f13970a;
        if (bVar == null || bVar.c().an().c()) {
            b bVar2 = this.f13970a;
            if (bVar2 != null && bVar2.b()) {
                i = R.string.applovin_creative_debugger_no_ads_text;
            } else {
                return;
            }
        } else {
            i = R.string.applovin_creative_debugger_disabled_text;
        }
        a(i);
    }
}

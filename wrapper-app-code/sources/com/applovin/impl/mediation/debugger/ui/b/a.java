package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.ui.b.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.sdk.R;

public class a extends com.applovin.impl.mediation.debugger.ui.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public b f14788a;

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f14789b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f14790c;

    /* renamed from: d  reason: collision with root package name */
    private ListView f14791d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.adview.a f14792e;

    private void a() {
        String m = this.f14788a.m();
        if (!TextUtils.isEmpty(m)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", m);
            intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
            intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
            startActivity(Intent.createChooser(intent, (CharSequence) null));
        }
    }

    /* access modifiers changed from: private */
    public void a(final Context context) {
        if (StringUtils.isValidString(this.f14788a.i()) && !this.f14788a.c()) {
            this.f14788a.a(true);
            runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert(a.this.f14788a.h(), a.this.f14788a.i(), context);
                }
            });
        }
    }

    private void b() {
        c();
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(this, 50, 16842874);
        this.f14792e = aVar;
        aVar.setColor(-3355444);
        this.f14790c.addView(this.f14792e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f14790c.bringChildToFront(this.f14792e);
        this.f14792e.a();
    }

    /* access modifiers changed from: private */
    public void c() {
        com.applovin.impl.adview.a aVar = this.f14792e;
        if (aVar != null) {
            aVar.b();
            this.f14790c.removeView(this.f14792e);
            this.f14792e = null;
        }
    }

    /* access modifiers changed from: protected */
    public n getSdk() {
        b bVar = this.f14788a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f14790c = (FrameLayout) findViewById(16908290);
        this.f14791d = (ListView) findViewById(R.id.listView);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f14788a;
        if (bVar != null) {
            bVar.unregisterDataSetObserver(this.f14789b);
            this.f14788a.a((d.a) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f14791d.setAdapter(this.f14788a);
        b bVar = this.f14788a;
        if (bVar != null && !bVar.b()) {
            b();
        }
    }

    public void setListAdapter(b bVar, final com.applovin.impl.sdk.a aVar) {
        DataSetObserver dataSetObserver;
        b bVar2 = this.f14788a;
        if (!(bVar2 == null || (dataSetObserver = this.f14789b) == null)) {
            bVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f14788a = bVar;
        this.f14789b = new DataSetObserver() {
            public void onChanged() {
                a.this.c();
                a aVar = a.this;
                aVar.a((Context) aVar);
            }
        };
        a((Context) this);
        this.f14788a.registerDataSetObserver(this.f14789b);
        this.f14788a.a((d.a) new d.a() {
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, final c cVar) {
                a aVar2;
                Class cls;
                com.applovin.impl.sdk.a aVar3;
                b.a r1;
                int a2 = aVar.a();
                if (a2 == b.C0149b.APP_INFO.ordinal() || a2 == b.C0149b.MAX.ordinal()) {
                    Utils.showAlert(cVar.l(), cVar.m(), (Context) a.this);
                } else if (a2 == b.C0149b.ADS.ordinal()) {
                    if (aVar.b() != b.a.AD_UNITS.ordinal()) {
                        if (aVar.b() == b.a.SELECT_LIVE_NETWORKS.ordinal()) {
                            if (a.this.f14788a.j().size() > 0 || a.this.f14788a.k().size() > 0) {
                                if (!a.this.f14788a.d().N().a()) {
                                    aVar2 = a.this;
                                    cls = MaxDebuggerTestLiveNetworkActivity.class;
                                    aVar3 = aVar;
                                    r1 = new b.a<MaxDebuggerTestLiveNetworkActivity>() {
                                        public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                            maxDebuggerTestLiveNetworkActivity.initialize(a.this.f14788a.j(), a.this.f14788a.k(), a.this.f14788a.d());
                                        }
                                    };
                                }
                                Utils.showAlert("Restart Required", cVar.m(), (Context) a.this);
                                return;
                            }
                        } else if (aVar.b() == b.a.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                            if (!a.this.f14788a.d().N().a()) {
                                a.this.getSdk().N().d();
                                Utils.showAlert("Restart Required", cVar.m(), (Context) a.this);
                                return;
                            } else if (a.this.f14788a.l().size() > 0) {
                                aVar2 = a.this;
                                cls = MaxDebuggerTestModeNetworkActivity.class;
                                aVar3 = aVar;
                                r1 = new b.a<MaxDebuggerTestModeNetworkActivity>() {
                                    public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                                        maxDebuggerTestModeNetworkActivity.initialize(a.this.f14788a.l(), a.this.f14788a.d());
                                    }
                                };
                            }
                        } else if (aVar.b() == b.a.INITIALIZATION_AD_UNITS.ordinal()) {
                            aVar2 = a.this;
                            cls = MaxDebuggerAdUnitsListActivity.class;
                            aVar3 = aVar;
                            r1 = new b.a<MaxDebuggerAdUnitsListActivity>() {
                                public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(a.this.f14788a.g(), true, a.this.f14788a.d());
                                }
                            };
                        } else {
                            return;
                        }
                        Utils.showAlert("Complete Integrations", "Please complete integrations in order to access this.", (Context) a.this);
                        return;
                    } else if (a.this.f14788a.f().size() > 0) {
                        aVar2 = a.this;
                        cls = MaxDebuggerAdUnitsListActivity.class;
                        aVar3 = aVar;
                        r1 = new b.a<MaxDebuggerAdUnitsListActivity>() {
                            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                maxDebuggerAdUnitsListActivity.initialize(a.this.f14788a.f(), false, a.this.f14788a.d());
                            }
                        };
                    } else {
                        Utils.showAlert("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", (Context) a.this);
                        return;
                    }
                    com.applovin.impl.sdk.utils.b.a(aVar2, cls, aVar3, r1);
                } else if ((a2 == b.C0149b.INCOMPLETE_NETWORKS.ordinal() || a2 == b.C0149b.COMPLETED_NETWORKS.ordinal()) && (cVar instanceof com.applovin.impl.mediation.debugger.ui.b.a.a)) {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerDetailActivity.class, aVar, new b.a<MaxDebuggerDetailActivity>() {
                        public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                            maxDebuggerDetailActivity.initialize(((com.applovin.impl.mediation.debugger.ui.b.a.a) cVar).f());
                        }
                    });
                }
            }
        });
    }
}

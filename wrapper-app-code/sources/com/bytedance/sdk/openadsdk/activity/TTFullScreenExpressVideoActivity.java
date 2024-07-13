package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.component.reward.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import java.util.HashMap;
import java.util.Map;

public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    /* access modifiers changed from: protected */
    public boolean J() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void o() {
    }

    /* access modifiers changed from: protected */
    public void u() {
        if (this.f29c == null) {
            finish();
            return;
        }
        this.o.a(false);
        super.u();
    }

    /* access modifiers changed from: protected */
    public void d() {
        super.d();
        if (p.i(this.f29c)) {
            this.o.a(true);
            this.o.b();
            a(false);
            return;
        }
        d(0);
    }

    public boolean a(long j, boolean z) {
        j jVar;
        if (this.l == null || this.l.a() == null) {
            jVar = new j();
        } else {
            jVar = this.l.a().getAdShowTime();
        }
        j jVar2 = jVar;
        if (this.L == null || !(this.L instanceof c) || this.M) {
            this.m.a(this.l.b(), this.f29c, this.f27a, I(), jVar2);
        } else {
            this.m.a(((c) this.L).d(), this.f29c, this.f27a, I(), jVar2);
        }
        HashMap hashMap = new HashMap();
        if (this.l != null) {
            hashMap.put("dynamic_show_type", Integer.valueOf(this.l.i()));
        }
        if (!TextUtils.isEmpty(this.D)) {
            hashMap.put("rit_scene", this.D);
        }
        this.m.a((Map<String, Object>) hashMap);
        this.m.a((c.a) new c.a() {
            public void a(long j, int i) {
                TTFullScreenExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.E();
                TTFullScreenExpressVideoActivity.this.l.b(true);
                TTFullScreenExpressVideoActivity.this.M();
                if (TTFullScreenExpressVideoActivity.this.i()) {
                    TTFullScreenExpressVideoActivity.this.a(false);
                } else if (n.c(TTFullScreenExpressVideoActivity.this.f29c)) {
                    TTFullScreenExpressVideoActivity.this.finish();
                } else if (TTFullScreenExpressVideoActivity.this.l != null && TTFullScreenExpressVideoActivity.this.l.a() != null) {
                    TTFullScreenExpressVideoActivity.this.l.a().a((CharSequence) BuildConfig.ADAPTER_VERSION, 0, 0);
                    if (TTFullScreenExpressVideoActivity.this.l.h()) {
                        TTFullScreenExpressVideoActivity.this.k.a(BuildConfig.ADAPTER_VERSION, (CharSequence) "X");
                        TTFullScreenExpressVideoActivity.this.k.e(true);
                    }
                }
            }

            public void b(long j, int i) {
                TTFullScreenExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.D();
                if (!TTFullScreenExpressVideoActivity.this.m.b()) {
                    TTFullScreenExpressVideoActivity.this.E();
                    TTFullScreenExpressVideoActivity.this.m.m();
                    l.e("TTFullScreenExpressVideoActivity", "onError、、、、、、、、");
                    TTFullScreenExpressVideoActivity.this.l.a(true);
                    if (TTFullScreenExpressVideoActivity.this.i()) {
                        TTFullScreenExpressVideoActivity.this.a(false);
                        TTFullScreenExpressVideoActivity.this.m.a(true ^ TTFullScreenExpressVideoActivity.this.m.B() ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenExpressVideoActivity.this.finish();
                }
            }

            public void a() {
                TTFullScreenExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenExpressVideoActivity.this.E();
                l.b("TTFullScreenExpressVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenExpressVideoActivity.this.i()) {
                    TTFullScreenExpressVideoActivity.this.a(false);
                } else {
                    TTFullScreenExpressVideoActivity.this.finish();
                }
                TTFullScreenExpressVideoActivity.this.m.a(TTFullScreenExpressVideoActivity.this.m.B() ^ true ? 1 : 0, TTFullScreenExpressVideoActivity.this.m.B() ^ true ? 1 : 0);
                TTFullScreenExpressVideoActivity.this.m.m();
            }

            public void a(long j, long j2) {
                if (!TTFullScreenExpressVideoActivity.this.H && TTFullScreenExpressVideoActivity.this.m.b()) {
                    TTFullScreenExpressVideoActivity.this.m.o();
                }
                if (!TTFullScreenExpressVideoActivity.this.v.get()) {
                    TTFullScreenExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                    if (j != TTFullScreenExpressVideoActivity.this.m.f()) {
                        TTFullScreenExpressVideoActivity.this.E();
                    }
                    if (TTFullScreenExpressVideoActivity.this.m.b()) {
                        TTFullScreenExpressVideoActivity.this.m.a(j);
                        TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity = TTFullScreenExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTFullScreenExpressVideoActivity.s = (int) (tTFullScreenExpressVideoActivity.m.C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTFullScreenExpressVideoActivity.this.A.get() || TTFullScreenExpressVideoActivity.this.y.get()) && TTFullScreenExpressVideoActivity.this.m.b()) {
                            TTFullScreenExpressVideoActivity.this.m.o();
                        }
                        if (!(TTFullScreenExpressVideoActivity.this.l == null || TTFullScreenExpressVideoActivity.this.l.a() == null)) {
                            TTFullScreenExpressVideoActivity.this.l.a().a((CharSequence) String.valueOf(TTFullScreenExpressVideoActivity.this.s), i, 0);
                        }
                        if (TTFullScreenExpressVideoActivity.this.l.h()) {
                            TTFullScreenExpressVideoActivity.this.e(i);
                            if (TTFullScreenExpressVideoActivity.this.s >= 0) {
                                TTFullScreenExpressVideoActivity.this.k.d(true);
                                TTFullScreenExpressVideoActivity.this.k.a(String.valueOf(TTFullScreenExpressVideoActivity.this.s), (CharSequence) null);
                            }
                        }
                        if (TTFullScreenExpressVideoActivity.this.s <= 0) {
                            l.b("TTFullScreenExpressVideoActivity", "onProgressUpdate、、、、、、、、");
                            if (TTFullScreenExpressVideoActivity.this.i()) {
                                TTFullScreenExpressVideoActivity.this.a(false);
                            } else if (n.c(TTFullScreenExpressVideoActivity.this.f29c)) {
                                TTFullScreenExpressVideoActivity.this.finish();
                            }
                        }
                    }
                }
            }
        });
        return a(j, z, (Map<String, Object>) hashMap);
    }
}

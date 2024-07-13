package com.bytedance.sdk.openadsdk.activity;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.l;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.util.HashMap;
import java.util.Map;

public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
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
        this.m.a(this.l.b(), this.f29c, this.f27a, I(), jVar);
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
                TTRewardExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardExpressVideoActivity.this.E();
                TTRewardExpressVideoActivity.this.l.b(true);
                TTRewardExpressVideoActivity.this.N();
                if (l.b(TTRewardExpressVideoActivity.this.f29c)) {
                    TTRewardExpressVideoActivity.this.N.set(true);
                    TTRewardExpressVideoActivity.this.n();
                } else if (TTRewardExpressVideoActivity.this.i()) {
                    TTRewardExpressVideoActivity.this.a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.S = (int) (System.currentTimeMillis() / 1000);
                TTRewardExpressVideoActivity.this.M();
            }

            public void b(long j, int i) {
                TTRewardExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (b.c()) {
                    TTRewardExpressVideoActivity.this.c("onVideoError");
                } else if (TTRewardExpressVideoActivity.this.T != null) {
                    TTRewardExpressVideoActivity.this.T.onVideoError();
                }
                TTRewardExpressVideoActivity.this.D();
                if (!TTRewardExpressVideoActivity.this.m.b()) {
                    TTRewardExpressVideoActivity.this.E();
                    TTRewardExpressVideoActivity.this.M();
                    TTRewardExpressVideoActivity.this.m.m();
                    if (TTRewardExpressVideoActivity.this.i()) {
                        TTRewardExpressVideoActivity.this.a(false);
                    } else {
                        TTRewardExpressVideoActivity.this.finish();
                    }
                    TTRewardExpressVideoActivity.this.l.a(true);
                    TTRewardExpressVideoActivity.this.m.a(true ^ TTRewardExpressVideoActivity.this.m.B() ? 1 : 0, 2);
                }
            }

            public void a() {
                TTRewardExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardExpressVideoActivity.this.E();
                if (TTRewardExpressVideoActivity.this.i()) {
                    TTRewardExpressVideoActivity.this.a(false);
                } else {
                    TTRewardExpressVideoActivity.this.finish();
                }
                TTRewardExpressVideoActivity.this.m.a(TTRewardExpressVideoActivity.this.m.B() ^ true ? 1 : 0, TTRewardExpressVideoActivity.this.m.B() ^ true ? 1 : 0);
                TTRewardExpressVideoActivity.this.m.m();
            }

            public void a(long j, long j2) {
                if (!TTRewardExpressVideoActivity.this.H && TTRewardExpressVideoActivity.this.m.b()) {
                    TTRewardExpressVideoActivity.this.m.o();
                }
                if (!TTRewardExpressVideoActivity.this.v.get()) {
                    TTRewardExpressVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                    if (j != TTRewardExpressVideoActivity.this.m.f()) {
                        TTRewardExpressVideoActivity.this.E();
                    }
                    if (TTRewardExpressVideoActivity.this.m.b()) {
                        TTRewardExpressVideoActivity.this.m.a(j);
                        int f2 = m.h().f(String.valueOf(TTRewardExpressVideoActivity.this.t));
                        boolean z = TTRewardExpressVideoActivity.this.l.h() && f2 != -1 && f2 >= 0;
                        TTRewardExpressVideoActivity tTRewardExpressVideoActivity = TTRewardExpressVideoActivity.this;
                        long j3 = j / 1000;
                        tTRewardExpressVideoActivity.s = (int) (tTRewardExpressVideoActivity.m.C() - ((double) j3));
                        int i = (int) j3;
                        if ((TTRewardExpressVideoActivity.this.A.get() || TTRewardExpressVideoActivity.this.y.get()) && TTRewardExpressVideoActivity.this.m.b()) {
                            TTRewardExpressVideoActivity.this.m.o();
                        }
                        if (TTRewardExpressVideoActivity.this.s >= 0) {
                            TTRewardExpressVideoActivity.this.k.a(String.valueOf(TTRewardExpressVideoActivity.this.s), (CharSequence) null);
                        }
                        TTRewardExpressVideoActivity.this.i.c(i);
                        TTRewardExpressVideoActivity.this.a(j, j2);
                        if (!(TTRewardExpressVideoActivity.this.l == null || TTRewardExpressVideoActivity.this.l.a() == null)) {
                            TTRewardExpressVideoActivity.this.l.a().a((CharSequence) String.valueOf(TTRewardExpressVideoActivity.this.s), i, 0);
                        }
                        if (TTRewardExpressVideoActivity.this.s > 0) {
                            if (!z || i < f2 || TTRewardExpressVideoActivity.this.f29c.f() == 5) {
                                TTRewardExpressVideoActivity.this.k.a(String.valueOf(TTRewardExpressVideoActivity.this.s), (CharSequence) null);
                                return;
                            }
                            TTRewardExpressVideoActivity.this.w.getAndSet(true);
                            TTRewardExpressVideoActivity.this.k.d(true);
                            TTRewardExpressVideoActivity.this.k.a(String.valueOf(TTRewardExpressVideoActivity.this.s), (CharSequence) f.f1254c);
                            TTRewardExpressVideoActivity.this.k.e(true);
                        } else if (TTRewardExpressVideoActivity.this.i()) {
                            TTRewardExpressVideoActivity.this.a(false);
                        } else {
                            TTRewardExpressVideoActivity.this.finish();
                        }
                    }
                }
            }
        });
        boolean a2 = a(j, z, (Map<String, Object>) hashMap);
        if (a2 && !z) {
            this.R = (int) (System.currentTimeMillis() / 1000);
        }
        return a2;
    }
}

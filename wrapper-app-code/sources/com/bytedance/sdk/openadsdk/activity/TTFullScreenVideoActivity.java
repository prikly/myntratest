package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.b.b.a.a;
import com.bytedance.sdk.openadsdk.b.b.b.o;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.component.reward.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.t;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static TTFullScreenVideoAd.FullScreenVideoAdInteractionListener S;
    /* access modifiers changed from: private */
    public TTFullScreenVideoAd.FullScreenVideoAdInteractionListener R;
    private boolean T;

    /* access modifiers changed from: protected */
    public boolean I() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b(bundle)) {
            t();
            u();
            d();
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        S = this.R;
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: private */
    public void c(final String str) {
        e.c(new g("FullScreen_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTFullScreenVideoActivity.this.a(1).executeFullVideoCallback(TTFullScreenVideoActivity.this.f30d, str);
                } catch (Throwable th) {
                    l.c("TTFullScreenVideoActivity", "executeFullVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        super.a(intent);
        if (intent != null) {
            this.F = intent.getBooleanExtra("is_verity_playable", false);
        }
    }

    private boolean b(Bundle bundle) {
        String stringExtra;
        if (b.c()) {
            Intent intent = getIntent();
            if (!(intent == null || (stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA)) == null)) {
                try {
                    this.f29c = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra));
                } catch (Exception e2) {
                    l.c("TTFullScreenVideoActivity", "initData MultiGlobalInfo throws ", e2);
                }
            }
        } else {
            this.f29c = t.a().c();
            this.R = t.a().e();
        }
        if (!b.c()) {
            t.a().h();
        }
        if (bundle != null) {
            if (this.R == null) {
                this.R = S;
                S = null;
            }
            try {
                this.f29c = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(bundle.getString("material_meta")));
                this.w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.w.get()) {
                    this.k.d(true);
                    N();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f29c == null) {
            l.e("TTFullScreenVideoActivity", "mMaterialMeta is null , no data to display ,the TTFullScreenVideoActivity finished !!");
            finish();
            return false;
        }
        this.n.a(this.f29c, this.f27a);
        this.n.a();
        this.f29c.a(this.f29c.g(), 8);
        return true;
    }

    /* access modifiers changed from: protected */
    public void H() {
        View k = this.i.k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTFullScreenVideoActivity.this.o.r();
                    TTFullScreenVideoActivity.this.s();
                    TTFullScreenVideoActivity.this.finish();
                }
            });
        }
        this.k.a((com.bytedance.sdk.openadsdk.component.reward.top.b) new com.bytedance.sdk.openadsdk.component.reward.top.b() {
            public void a(View view) {
                if (p.i(TTFullScreenVideoActivity.this.f29c) || (com.bytedance.sdk.openadsdk.core.e.l.a(TTFullScreenVideoActivity.this.f29c) && !TTFullScreenVideoActivity.this.f33g.get())) {
                    if (b.c()) {
                        TTFullScreenVideoActivity.this.c("onSkippedVideo");
                    } else if (TTFullScreenVideoActivity.this.R != null) {
                        TTFullScreenVideoActivity.this.R.onSkippedVideo();
                    }
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                o.a aVar = new o.a();
                aVar.a(TTFullScreenVideoActivity.this.m.s());
                aVar.c(TTFullScreenVideoActivity.this.m.u());
                aVar.b(TTFullScreenVideoActivity.this.m.j());
                aVar.e(3);
                aVar.f(TTFullScreenVideoActivity.this.m.r());
                a.a(TTFullScreenVideoActivity.this.m.c(), aVar, TTFullScreenVideoActivity.this.m.a());
                com.bytedance.sdk.openadsdk.core.p.c(TTFullScreenVideoActivity.this.t);
                TTFullScreenVideoActivity.this.m.a("skip", (Map<String, Object>) null);
                TTFullScreenVideoActivity.this.k.d(false);
                if (b.c()) {
                    TTFullScreenVideoActivity.this.c("onSkippedVideo");
                } else if (TTFullScreenVideoActivity.this.R != null) {
                    TTFullScreenVideoActivity.this.R.onSkippedVideo();
                }
                if (TTFullScreenVideoActivity.this.i()) {
                    TTFullScreenVideoActivity.this.a(true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                if (TTFullScreenVideoActivity.this.f29c != null && TTFullScreenVideoActivity.this.f29c.ax() != null && TTFullScreenVideoActivity.this.m != null) {
                    TTFullScreenVideoActivity.this.f29c.ax().a().f(TTFullScreenVideoActivity.this.m.s());
                    TTFullScreenVideoActivity.this.f29c.ax().a().e(TTFullScreenVideoActivity.this.m.s());
                }
            }

            public void b(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.r = !tTFullScreenVideoActivity.r;
                if (!(TTFullScreenVideoActivity.this.L == null || TTFullScreenVideoActivity.this.L.a() == null)) {
                    TTFullScreenVideoActivity.this.L.a().a(TTFullScreenVideoActivity.this.r);
                }
                TTFullScreenVideoActivity.this.m.b(TTFullScreenVideoActivity.this.r);
                if (!p.j(TTFullScreenVideoActivity.this.f29c) || TTFullScreenVideoActivity.this.v.get()) {
                    if (p.a(TTFullScreenVideoActivity.this.f29c)) {
                        TTFullScreenVideoActivity.this.E.a(TTFullScreenVideoActivity.this.r, true);
                    }
                    TTFullScreenVideoActivity.this.o.d(TTFullScreenVideoActivity.this.r);
                    if (TTFullScreenVideoActivity.this.f29c != null && TTFullScreenVideoActivity.this.f29c.ax() != null && TTFullScreenVideoActivity.this.f29c.ax().a() != null && TTFullScreenVideoActivity.this.m != null) {
                        if (TTFullScreenVideoActivity.this.r) {
                            TTFullScreenVideoActivity.this.f29c.ax().a().h(TTFullScreenVideoActivity.this.m.s());
                        } else {
                            TTFullScreenVideoActivity.this.f29c.ax().a().i(TTFullScreenVideoActivity.this.m.s());
                        }
                    }
                }
            }

            public void c(View view) {
                TTFullScreenVideoActivity.this.G();
            }
        });
    }

    public boolean a(long j, boolean z) {
        j jVar = new j();
        jVar.a(System.currentTimeMillis(), 1.0f);
        if (this.L == null || !(this.L instanceof c)) {
            this.m.a(this.i.h(), this.f29c, this.f27a, I(), jVar);
        } else {
            this.m.a(((c) this.L).d(), this.f29c, this.f27a, I(), jVar);
        }
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(this.D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.D);
        }
        this.m.a((Map<String, Object>) hashMap);
        AnonymousClass4 r1 = new c.a() {
            public void a(long j, int i) {
                TTFullScreenVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.E();
                TTFullScreenVideoActivity.this.M();
                if (com.bytedance.sdk.openadsdk.core.e.l.b(TTFullScreenVideoActivity.this.f29c)) {
                    TTFullScreenVideoActivity.this.n();
                    TTFullScreenVideoActivity.this.N.set(true);
                } else if (TTFullScreenVideoActivity.this.i()) {
                    TTFullScreenVideoActivity.this.a(false);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            public void b(long j, int i) {
                TTFullScreenVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.D();
                if (!TTFullScreenVideoActivity.this.m.b()) {
                    TTFullScreenVideoActivity.this.E();
                    TTFullScreenVideoActivity.this.m.m();
                    l.e("TTFullScreenVideoActivity", "onError、、、、、、、、");
                    if (TTFullScreenVideoActivity.this.i()) {
                        TTFullScreenVideoActivity.this.a(false, true);
                        TTFullScreenVideoActivity.this.m.a(TTFullScreenVideoActivity.this.m.B() ^ true ? 1 : 0, 2);
                        return;
                    }
                    TTFullScreenVideoActivity.this.finish();
                }
            }

            public void a() {
                TTFullScreenVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTFullScreenVideoActivity.this.E();
                l.b("TTFullScreenVideoActivity", "onTimeOut、、、、、、、、");
                if (TTFullScreenVideoActivity.this.i()) {
                    TTFullScreenVideoActivity.this.a(false, true);
                } else {
                    TTFullScreenVideoActivity.this.finish();
                }
                TTFullScreenVideoActivity.this.m.a(TTFullScreenVideoActivity.this.m.B() ^ true ? 1 : 0, true ^ TTFullScreenVideoActivity.this.m.B() ? 1 : 0);
                TTFullScreenVideoActivity.this.m.m();
            }

            public void a(long j, long j2) {
                if (!TTFullScreenVideoActivity.this.H && TTFullScreenVideoActivity.this.m.b()) {
                    TTFullScreenVideoActivity.this.m.o();
                }
                if (!TTFullScreenVideoActivity.this.v.get()) {
                    TTFullScreenVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                    if (j != TTFullScreenVideoActivity.this.m.f()) {
                        TTFullScreenVideoActivity.this.E();
                    }
                    TTFullScreenVideoActivity.this.m.a(j);
                    TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                    long j3 = j / 1000;
                    tTFullScreenVideoActivity.s = (int) (tTFullScreenVideoActivity.m.C() - ((double) j3));
                    int i = (int) j3;
                    if ((TTFullScreenVideoActivity.this.A.get() || TTFullScreenVideoActivity.this.y.get()) && TTFullScreenVideoActivity.this.m.b()) {
                        TTFullScreenVideoActivity.this.m.o();
                    }
                    TTFullScreenVideoActivity.this.e(i);
                    if (TTFullScreenVideoActivity.this.s >= 0) {
                        TTFullScreenVideoActivity.this.k.a(String.valueOf(TTFullScreenVideoActivity.this.s), (CharSequence) null);
                    }
                    if (TTFullScreenVideoActivity.this.s <= 0) {
                        TTFullScreenVideoActivity.this.N.set(true);
                        l.b("TTFullScreenVideoActivity", "onProgressUpdate、、、、、、、、");
                        if (TTFullScreenVideoActivity.this.i()) {
                            TTFullScreenVideoActivity.this.a(false);
                        } else {
                            TTFullScreenVideoActivity.this.finish();
                        }
                    }
                }
            }
        };
        this.m.a((c.a) r1);
        if (this.i.x != null) {
            this.i.x.a((c.a) r1);
        }
        return a(j, z, (Map<String, Object>) hashMap);
    }

    /* access modifiers changed from: protected */
    public void e(int i) {
        int e2 = m.h().e(this.t);
        if (e2 < 0) {
            e2 = 5;
        }
        if (m.h().c(String.valueOf(this.t)) && (n.c(this.f29c) || i())) {
            if (!this.w.getAndSet(true)) {
                this.k.d(true);
            }
            if (i <= e2) {
                g(e2 - i);
                this.k.e(false);
                return;
            }
            N();
        } else if (i >= e2) {
            if (!this.w.getAndSet(true)) {
                this.k.d(true);
            }
            N();
        }
    }

    private void N() {
        if (n.c(this.f29c) || i()) {
            this.k.a((String) null, (CharSequence) f.f1254c);
        } else {
            this.k.a((String) null, (CharSequence) "X");
        }
        this.k.e(true);
    }

    private void g(int i) {
        this.k.a((String) null, (CharSequence) new SpannableStringBuilder(String.format(com.bytedance.sdk.component.utils.t.a(m.a(), "tt_skip_ad_time_text"), new Object[]{Integer.valueOf(i)})));
    }

    public void onRewardBarClick(View view) {
        if (!(this.f29c == null || this.f29c.an() == 100.0f)) {
            this.T = true;
        }
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    public void K() {
        if (b.c()) {
            c("onAdShow");
        } else {
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdShow();
            }
        }
        if (J()) {
            this.l.j();
        }
    }

    public void L() {
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onAdVideoBarClick();
        }
    }

    public void f(int i) {
        if (i == 10002) {
            M();
        }
    }

    public void finish() {
        this.p.b(this.F);
        try {
            O();
        } catch (Exception unused) {
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        O();
        if (b.c()) {
            c("recycleRes");
        }
        this.R = null;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        S = null;
    }

    private void O() {
        if (!this.G) {
            this.G = true;
            if (b.c()) {
                c("onAdClose");
                return;
            }
            TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
            if (fullScreenVideoAdInteractionListener != null) {
                fullScreenVideoAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void M() {
        if (b.c()) {
            c("onVideoComplete");
            return;
        }
        TTFullScreenVideoAd.FullScreenVideoAdInteractionListener fullScreenVideoAdInteractionListener = this.R;
        if (fullScreenVideoAdInteractionListener != null) {
            fullScreenVideoAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (b(this.f29c) && !a(this.f29c)) {
            if (this.T) {
                this.T = false;
                finish();
            } else if (this.o.x()) {
                finish();
            }
        }
    }

    private boolean a(n nVar) {
        return nVar == null || nVar.an() == 100.0f;
    }

    private boolean b(n nVar) {
        if (nVar == null) {
            return false;
        }
        return m.h().g(this.t);
    }
}

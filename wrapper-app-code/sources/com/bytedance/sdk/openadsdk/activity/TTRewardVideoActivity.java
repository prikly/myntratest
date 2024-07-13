package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bykv.vk.openvk.component.video.api.d.c;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.b.j;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.o;
import com.bytedance.sdk.openadsdk.core.widget.a;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.l;
import com.bytedance.sdk.openadsdk.utils.u;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static final String U = t.a(m.a(), "tt_reward_msg");
    private static final String V = t.a(m.a(), "tt_msgPlayable");
    private static final String W = t.a(m.a(), "tt_negtiveBtnBtnText");
    private static final String X = t.a(m.a(), "tt_postiveBtnText");
    private static final String Y = t.a(m.a(), "tt_postiveBtnTextPlayable");
    private static TTRewardVideoAd.RewardAdInteractionListener ad;
    protected int R;
    protected int S;
    protected TTRewardVideoAd.RewardAdInteractionListener T;
    /* access modifiers changed from: private */
    public String Z;
    /* access modifiers changed from: private */
    public int aa;
    private String ab;
    private String ac;
    private AtomicBoolean ae = new AtomicBoolean(false);
    private int af = -1;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0066, code lost:
        if (r3.f33g.get() == false) goto L_0x0068;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.b.b.b.o$a r0 = new com.bytedance.sdk.openadsdk.b.b.b.o$a
            r0.<init>()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.m
            long r1 = r1.s()
            r0.a((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.m
            long r1 = r1.u()
            r0.c((long) r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.m
            long r1 = r1.j()
            r0.b((long) r1)
            r1 = 3
            r0.e(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.m
            int r1 = r1.r()
            r0.f(r1)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.m
            com.bykv.vk.openvk.component.video.api.b.a r1 = r1.c()
            com.bytedance.sdk.openadsdk.component.reward.a.e r2 = r3.m
            com.bytedance.sdk.openadsdk.b.j r2 = r2.a()
            com.bytedance.sdk.openadsdk.b.b.a.a.a((com.bykv.vk.openvk.component.video.api.b.a) r1, (com.bytedance.sdk.openadsdk.b.b.b.o.a) r0, (com.bytedance.sdk.openadsdk.b.j) r2)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.m
            r0.m()
            int r0 = r3.t
            com.bytedance.sdk.openadsdk.core.p.c((int) r0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.m
            java.lang.String r1 = "skip"
            r2 = 0
            r0.a((java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.Object>) r2)
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x0068
            r0 = 1
            r3.a((boolean) r0)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f29c
            boolean r0 = com.bytedance.sdk.openadsdk.core.e.l.a((com.bytedance.sdk.openadsdk.core.e.n) r0)
            if (r0 == 0) goto L_0x006b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f33g
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006b
        L_0x0068:
            r3.finish()
        L_0x006b:
            boolean r0 = com.bytedance.sdk.openadsdk.multipro.b.c()
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = "onSkippedVideo"
            r3.c((java.lang.String) r0)
            goto L_0x007e
        L_0x0077:
            com.bytedance.sdk.openadsdk.TTRewardVideoAd$RewardAdInteractionListener r0 = r3.T
            if (r0 == 0) goto L_0x007e
            r0.onSkippedVideo()
        L_0x007e:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f29c
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f29c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.ax()
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.component.reward.a.e r0 = r3.m
            if (r0 == 0) goto L_0x00b4
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f29c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.m
            long r1 = r1.s()
            r0.f((long) r1)
            com.bytedance.sdk.openadsdk.core.e.n r0 = r3.f29c
            com.bytedance.sdk.openadsdk.core.j.a r0 = r0.ax()
            com.bytedance.sdk.openadsdk.core.j.d r0 = r0.a()
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r3.m
            long r1 = r1.s()
            r0.e((long) r1)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.O():void");
    }

    private JSONObject P() {
        JSONObject jSONObject = new JSONObject();
        int v = (int) this.m.v();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("reward_name", this.Z);
            jSONObject.put("reward_amount", this.aa);
            jSONObject.put("network", o.c(this.f28b));
            jSONObject.put("sdk_version", "4.5.0.6");
            int F = this.f29c.F();
            String str = "unKnow";
            if (F == 2) {
                str = u.a();
            } else if (F == 1) {
                str = u.b();
            }
            jSONObject.put("user_agent", str);
            jSONObject.put("extra", this.f29c.aH());
            jSONObject.put("media_extra", this.ab);
            jSONObject.put("video_duration", this.f29c.J().f());
            jSONObject.put("play_start_ts", this.R);
            jSONObject.put("play_end_ts", this.S);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, v);
            jSONObject.put("user_id", this.ac);
            jSONObject.put("trans_id", l.a().replace("-", ""));
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private void Q() {
        if (!this.G) {
            this.G = true;
            if (b.c()) {
                c("onAdClose");
                return;
            }
            TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
            if (rewardAdInteractionListener != null) {
                rewardAdInteractionListener.onAdClose();
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, boolean z, int i, String str2, int i2, String str3) {
        final String str4 = str;
        final boolean z2 = z;
        final int i3 = i;
        final String str5 = str2;
        final int i4 = i2;
        final String str6 = str3;
        e.c(new g("Reward_executeMultiProcessCallback") {
            public void run() {
                try {
                    TTRewardVideoActivity.this.a(0).executeRewardVideoCallback(TTRewardVideoActivity.this.f30d, str4, z2, i3, str5, i4, str6);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.l.c("TTRewardVideoActivity", "executeRewardVideoCallback execute throw Exception : ", th);
                }
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    public void b(final boolean z, final boolean z2) {
        String str;
        a aVar;
        if (!m.h().d(String.valueOf(this.t))) {
            if (z) {
                if (!z2) {
                    if (b.c()) {
                        c("onSkippedVideo");
                    } else {
                        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
                        if (rewardAdInteractionListener != null) {
                            rewardAdInteractionListener.onSkippedVideo();
                        }
                    }
                }
                finish();
                return;
            }
            O();
        } else if (!this.ae.get()) {
            this.A.set(true);
            this.m.o();
            if (z) {
                y();
            }
            final a aVar2 = new a(this);
            this.B = aVar2;
            a aVar3 = this.B;
            if (z) {
                aVar = aVar3.a(V);
                str = Y;
            } else {
                aVar = aVar3.a(U);
                str = X;
            }
            aVar.b(str).c(W);
            this.B.a((a.C0010a) new a.C0010a() {
                public void a() {
                    TTRewardVideoActivity.this.m.n();
                    if (z) {
                        TTRewardVideoActivity.this.z();
                    }
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.A.set(false);
                }

                public void b() {
                    aVar2.dismiss();
                    TTRewardVideoActivity.this.A.set(false);
                    TTRewardVideoActivity.this.p.d(Integer.MAX_VALUE);
                    if (z) {
                        TTRewardVideoActivity.this.s();
                        if (!z2) {
                            if (b.c()) {
                                TTRewardVideoActivity.this.c("onSkippedVideo");
                            } else if (TTRewardVideoActivity.this.T != null) {
                                TTRewardVideoActivity.this.T.onSkippedVideo();
                            }
                        }
                        TTRewardVideoActivity.this.finish();
                        return;
                    }
                    TTRewardVideoActivity.this.O();
                }
            }).show();
        } else if (z) {
            if (!z2) {
                if (b.c()) {
                    c("onSkippedVideo");
                } else {
                    TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener2 = this.T;
                    if (rewardAdInteractionListener2 != null) {
                        rewardAdInteractionListener2.onSkippedVideo();
                    }
                }
            }
            finish();
        } else {
            O();
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
                    com.bytedance.sdk.component.utils.l.c("TTRewardVideoActivity", "TTRewardVideoActivity MultiGlobalInfo throw ", e2);
                }
            }
        } else {
            this.f29c = com.bytedance.sdk.openadsdk.core.t.a().c();
            this.T = com.bytedance.sdk.openadsdk.core.t.a().d();
        }
        if (!b.c()) {
            com.bytedance.sdk.openadsdk.core.t.a().h();
        }
        if (bundle != null) {
            if (this.T == null) {
                this.T = ad;
                ad = null;
            }
            try {
                this.f29c = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(bundle.getString("material_meta")));
                this.w.set(bundle.getBoolean("has_show_skip_btn"));
                if (this.w.get()) {
                    this.k.d(true);
                    this.k.a((String) null, (CharSequence) f.f1254c);
                    this.k.e(true);
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f29c == null) {
            com.bytedance.sdk.component.utils.l.e("TTRewardVideoActivity", "mMaterialMeta is null , no data to display ,the TTRewardVideoActivity finished !!");
            finish();
            return false;
        }
        this.n.a(this.f29c, this.f27a);
        this.n.a();
        this.f29c.a(this.f29c.g(), 7);
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006e, code lost:
        if (r12.o.e().e() != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (((1.0d - (((double) r12.s) / r12.m.C())) * 100.0d) >= ((double) r0)) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A() {
        /*
            r12 = this;
            com.bytedance.sdk.openadsdk.core.i.f r0 = com.bytedance.sdk.openadsdk.core.m.h()
            int r1 = r12.t
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.bytedance.sdk.openadsdk.core.i.a r0 = r0.n(r1)
            int r0 = r0.f1237f
            com.bytedance.sdk.openadsdk.core.e.n r1 = r12.f29c
            boolean r1 = com.bytedance.sdk.openadsdk.core.e.p.j(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0034
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.bytedance.sdk.openadsdk.component.reward.a.e r1 = r12.m
            double r8 = r1.C()
            int r1 = r12.s
            double r10 = (double) r1
            double r10 = r10 / r8
            double r6 = r6 - r10
            double r6 = r6 * r4
            double r0 = (double) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            r3 = r2
            goto L_0x0074
        L_0x0034:
            r1 = 1120403456(0x42c80000, float:100.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.bytedance.sdk.openadsdk.core.e.n r5 = r12.f29c
            int r5 = r5.at()
            float r5 = (float) r5
            com.bytedance.sdk.openadsdk.component.reward.a.b r6 = r12.p
            int r6 = r6.k()
            float r6 = (float) r6
            float r6 = r6 / r5
            float r4 = r4 - r6
            float r4 = r4 * r1
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0051
            r0 = 1
            goto L_0x0052
        L_0x0051:
            r0 = 0
        L_0x0052:
            com.bytedance.sdk.openadsdk.core.i.f r1 = com.bytedance.sdk.openadsdk.core.m.h()
            int r4 = r12.t
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r1.a((java.lang.String) r4)
            if (r1 != 0) goto L_0x0071
            if (r0 == 0) goto L_0x0031
            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = r12.o
            com.bytedance.sdk.openadsdk.core.w r0 = r0.e()
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0071:
            if (r1 != r2) goto L_0x0074
            r3 = r0
        L_0x0074:
            if (r3 == 0) goto L_0x007b
            r0 = 10000(0x2710, float:1.4013E-41)
            r12.f(r0)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity.A():void");
    }

    /* access modifiers changed from: protected */
    public void H() {
        View k = this.i.k();
        if (k != null) {
            k.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTRewardVideoActivity.this.o.r();
                    TTRewardVideoActivity.this.s();
                    if (p.i(TTRewardVideoActivity.this.f29c)) {
                        TTRewardVideoActivity.this.b(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            });
        }
        this.k.a((com.bytedance.sdk.openadsdk.component.reward.top.b) new com.bytedance.sdk.openadsdk.component.reward.top.b() {
            public void a(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.b(p.i(tTRewardVideoActivity.f29c), false);
            }

            public void b(View view) {
                if (!(TTRewardVideoActivity.this.L == null || TTRewardVideoActivity.this.L.a() == null)) {
                    TTRewardVideoActivity.this.L.a().a(TTRewardVideoActivity.this.r);
                }
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.r = !tTRewardVideoActivity.r;
                com.bytedance.sdk.component.utils.l.b("TTRewardVideoActivity", "will set is Mute " + TTRewardVideoActivity.this.r + " mLastVolume=" + TTRewardVideoActivity.this.E.b());
                TTRewardVideoActivity.this.m.b(TTRewardVideoActivity.this.r);
                if (!p.j(TTRewardVideoActivity.this.f29c) || TTRewardVideoActivity.this.v.get()) {
                    if (p.a(TTRewardVideoActivity.this.f29c)) {
                        TTRewardVideoActivity.this.E.a(TTRewardVideoActivity.this.r, true);
                    }
                    TTRewardVideoActivity.this.o.d(TTRewardVideoActivity.this.r);
                    if (TTRewardVideoActivity.this.f29c != null && TTRewardVideoActivity.this.f29c.ax() != null && TTRewardVideoActivity.this.f29c.ax().a() != null && TTRewardVideoActivity.this.m != null) {
                        if (TTRewardVideoActivity.this.r) {
                            TTRewardVideoActivity.this.f29c.ax().a().h(TTRewardVideoActivity.this.m.s());
                        } else {
                            TTRewardVideoActivity.this.f29c.ax().a().i(TTRewardVideoActivity.this.m.s());
                        }
                    }
                }
            }

            public void c(View view) {
                TTRewardVideoActivity.this.G();
            }
        });
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return true;
    }

    public void K() {
        if (b.c()) {
            c("onAdShow");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdShow();
        }
    }

    public void L() {
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    public void M() {
        if (!this.ae.get()) {
            this.ae.set(true);
            if (!m.h().l(String.valueOf(this.t))) {
                m.f().a(P(), (n.b) new n.b() {
                    public void a(int i, String str) {
                        if (b.c()) {
                            TTRewardVideoActivity.this.a("onRewardVerify", false, 0, "", i, str);
                        } else if (TTRewardVideoActivity.this.T != null) {
                            TTRewardVideoActivity.this.T.onRewardVerify(false, 0, "", i, str);
                        }
                    }

                    public void a(final o.b bVar) {
                        final int a2 = bVar.f1528c.a();
                        final String b2 = bVar.f1528c.b();
                        if (b.c()) {
                            TTRewardVideoActivity.this.a("onRewardVerify", bVar.f1527b, a2, b2, 0, "");
                        } else {
                            TTRewardVideoActivity.this.q.post(new Runnable() {
                                public void run() {
                                    if (TTRewardVideoActivity.this.T != null) {
                                        TTRewardVideoActivity.this.T.onRewardVerify(bVar.f1527b, a2, b2, 0, "");
                                    }
                                }
                            });
                        }
                    }
                });
            } else if (b.c()) {
                a("onRewardVerify", true, this.aa, this.Z, 0, "");
            } else {
                this.q.post(new Runnable() {
                    public void run() {
                        if (TTRewardVideoActivity.this.T != null) {
                            TTRewardVideoActivity.this.T.onRewardVerify(true, TTRewardVideoActivity.this.aa, TTRewardVideoActivity.this.Z, 0, "");
                        }
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    public void N() {
        if (b.c()) {
            c("onVideoComplete");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onVideoComplete();
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j, long j2) {
        long j3 = j + (((long) this.O) * 1000);
        if (this.af == -1) {
            this.af = m.h().n(String.valueOf(this.t)).f1237f;
        }
        if (j2 > 0) {
            if (j2 >= 30000 && j3 >= 27000) {
                M();
            } else if (((float) (j3 * 100)) / ((float) j2) >= ((float) this.af)) {
                M();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        super.a(intent);
        if (intent != null) {
            this.Z = intent.getStringExtra("reward_name");
            this.aa = intent.getIntExtra("reward_amount", 0);
            this.ab = intent.getStringExtra("media_extra");
            this.ac = intent.getStringExtra("user_id");
        }
    }

    public boolean a(long j, boolean z) {
        HashMap hashMap;
        j jVar = new j();
        jVar.a(System.currentTimeMillis(), 1.0f);
        this.m.a(this.i.h(), this.f29c, this.f27a, I(), jVar);
        if (!TextUtils.isEmpty(this.D)) {
            hashMap = new HashMap();
            hashMap.put("rit_scene", this.D);
        } else {
            hashMap = null;
        }
        this.m.a((Map<String, Object>) hashMap);
        AnonymousClass5 r1 = new c.a() {
            public void a(long j, int i) {
                TTRewardVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardVideoActivity.this.E();
                TTRewardVideoActivity.this.N();
                TTRewardVideoActivity.this.N.set(true);
                if (TTRewardVideoActivity.this.i()) {
                    TTRewardVideoActivity.this.a(false);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.S = (int) (System.currentTimeMillis() / 1000);
                TTRewardVideoActivity.this.M();
            }

            public void b(long j, int i) {
                TTRewardVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                if (b.c()) {
                    TTRewardVideoActivity.this.c("onVideoError");
                } else if (TTRewardVideoActivity.this.T != null) {
                    TTRewardVideoActivity.this.T.onVideoError();
                }
                TTRewardVideoActivity.this.D();
                if (!TTRewardVideoActivity.this.m.b()) {
                    TTRewardVideoActivity.this.E();
                    TTRewardVideoActivity.this.m.m();
                    TTRewardVideoActivity.this.M();
                    if (TTRewardVideoActivity.this.i()) {
                        TTRewardVideoActivity.this.a(false, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                    TTRewardVideoActivity.this.m.a(true ^ TTRewardVideoActivity.this.m.B() ? 1 : 0, 2);
                }
            }

            public void a() {
                TTRewardVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                TTRewardVideoActivity.this.E();
                if (TTRewardVideoActivity.this.i()) {
                    TTRewardVideoActivity.this.a(false, true);
                } else {
                    TTRewardVideoActivity.this.finish();
                }
                TTRewardVideoActivity.this.m.a(TTRewardVideoActivity.this.m.B() ^ true ? 1 : 0, true ^ TTRewardVideoActivity.this.m.B() ? 1 : 0);
                TTRewardVideoActivity.this.m.m();
            }

            public void a(long j, long j2) {
                if (!TTRewardVideoActivity.this.H && TTRewardVideoActivity.this.m.b()) {
                    TTRewardVideoActivity.this.m.o();
                }
                if (!TTRewardVideoActivity.this.v.get()) {
                    TTRewardVideoActivity.this.q.removeMessages(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                    if (j != TTRewardVideoActivity.this.m.f()) {
                        TTRewardVideoActivity.this.E();
                    }
                    TTRewardVideoActivity.this.m.a(j);
                    TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                    long j3 = j / 1000;
                    double d2 = (double) j3;
                    tTRewardVideoActivity.s = (int) (tTRewardVideoActivity.m.C() - d2);
                    if (TTRewardVideoActivity.this.s >= 0) {
                        TTRewardVideoActivity.this.k.a(String.valueOf(TTRewardVideoActivity.this.s), (CharSequence) null);
                    }
                    TTRewardVideoActivity tTRewardVideoActivity2 = TTRewardVideoActivity.this;
                    tTRewardVideoActivity2.s = (int) (tTRewardVideoActivity2.m.C() - d2);
                    int i = (int) j3;
                    int f2 = m.h().f(String.valueOf(TTRewardVideoActivity.this.t));
                    boolean z = f2 >= 0;
                    if ((TTRewardVideoActivity.this.A.get() || TTRewardVideoActivity.this.y.get()) && TTRewardVideoActivity.this.m.b()) {
                        TTRewardVideoActivity.this.m.o();
                    }
                    TTRewardVideoActivity.this.i.c(i);
                    TTRewardVideoActivity.this.a(j, j2);
                    if (TTRewardVideoActivity.this.s > 0) {
                        TTRewardVideoActivity.this.k.d(true);
                        if (!z || i < f2) {
                            TTRewardVideoActivity.this.k.a(String.valueOf(TTRewardVideoActivity.this.s), (CharSequence) null);
                            return;
                        }
                        TTRewardVideoActivity.this.w.getAndSet(true);
                        TTRewardVideoActivity.this.k.a(String.valueOf(TTRewardVideoActivity.this.s), (CharSequence) f.f1254c);
                        TTRewardVideoActivity.this.k.e(true);
                    } else if (com.bytedance.sdk.openadsdk.core.e.l.c(TTRewardVideoActivity.this.f29c) || com.bytedance.sdk.openadsdk.core.e.l.b(TTRewardVideoActivity.this.f29c)) {
                        TTRewardVideoActivity.this.a(false);
                    } else if (com.bytedance.sdk.openadsdk.core.e.l.a(TTRewardVideoActivity.this.f29c) && !TTRewardVideoActivity.this.f33g.get()) {
                        TTRewardVideoActivity.this.w.getAndSet(true);
                        TTRewardVideoActivity.this.k.d(true);
                        TTRewardVideoActivity.this.k.e(true);
                    } else if (TTRewardVideoActivity.this.i()) {
                        TTRewardVideoActivity.this.a(false);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            }
        };
        this.m.a((c.a) r1);
        this.m.a((c.a) r1);
        if (this.i.x != null) {
            this.i.x.a((c.a) r1);
        }
        boolean a2 = a(j, z, (Map<String, Object>) hashMap);
        if (a2 && !z) {
            this.R = (int) (System.currentTimeMillis() / 1000);
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        a(str, false, 0, "", 0, "");
    }

    public void e() {
        M();
    }

    public void f(int i) {
        if (i == 10000) {
            M();
        } else if (i == 10001) {
            N();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        ad = null;
    }

    public void finish() {
        Q();
        super.finish();
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
    public void onDestroy() {
        super.onDestroy();
        if (this.l != null) {
            this.l.f();
        }
        Q();
        if (b.c()) {
            c("recycleRes");
        }
        this.T = null;
    }

    public void onRewardBarClick(View view) {
        if (b.c()) {
            c("onAdVideoBarClick");
            return;
        }
        TTRewardVideoAd.RewardAdInteractionListener rewardAdInteractionListener = this.T;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdVideoBarClick();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        ad = this.T;
        super.onSaveInstanceState(bundle);
    }
}

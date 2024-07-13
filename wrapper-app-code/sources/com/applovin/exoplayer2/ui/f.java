package com.applovin.exoplayer2.ui;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.i;
import com.applovin.exoplayer2.j.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.m.o;
import com.applovin.exoplayer2.t;
import com.applovin.exoplayer2.ui.k;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f extends FrameLayout {
    private final Drawable A;
    private final Drawable B;
    private final float C;
    private final float D;
    private final String E;
    private final String F;
    /* access modifiers changed from: private */
    public an G;
    /* access modifiers changed from: private */
    public i H;
    private c I;
    private boolean J;
    private boolean K;
    private boolean L;
    /* access modifiers changed from: private */
    public boolean M;
    private int N = 5000;
    private int O = 200;
    /* access modifiers changed from: private */
    public int P = 0;
    private boolean Q = true;
    private boolean R = true;
    private boolean S = true;
    private boolean T = true;
    private boolean U = false;
    private long V = -9223372036854775807L;
    private long[] W;

    /* renamed from: a  reason: collision with root package name */
    private final b f13874a;
    private boolean[] aa;
    private long[] ab;
    private boolean[] ac;
    private long ad;
    private long ae;
    private long af;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<d> f13875b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final View f13876c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final View f13877d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final View f13878e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final View f13879f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final View f13880g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final View f13881h;
    /* access modifiers changed from: private */
    public final ImageView i;
    /* access modifiers changed from: private */
    public final ImageView j;
    private final View k;
    private final TextView l;
    /* access modifiers changed from: private */
    public final TextView m;
    private final k n;
    /* access modifiers changed from: private */
    public final StringBuilder o;
    /* access modifiers changed from: private */
    public final Formatter p;
    private final ba.a q;
    private final ba.c r;
    private final Runnable s;
    private final Runnable t;
    private final Drawable u;
    private final Drawable v;
    private final Drawable w;
    private final String x;
    private final String y;
    private final String z;

    private static final class a {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    private final class b implements View.OnClickListener, an.d, k.a {
        private b() {
        }

        public /* synthetic */ void a() {
            an.d.CC.$default$a(this);
        }

        public /* synthetic */ void a(float f2) {
            an.d.CC.$default$a((an.d) this, f2);
        }

        public /* synthetic */ void a(int i, int i2) {
            an.d.CC.$default$a((an.d) this, i, i2);
        }

        public /* synthetic */ void a(int i, boolean z) {
            an.d.CC.$default$a((an.d) this, i, z);
        }

        public /* synthetic */ void a(ab abVar, int i) {
            an.d.CC.$default$a((an.d) this, abVar, i);
        }

        public /* synthetic */ void a(ac acVar) {
            an.d.CC.$default$a((an.d) this, acVar);
        }

        public /* synthetic */ void a(ak akVar) {
            an.d.CC.$default$a((an.d) this, akVar);
        }

        public /* synthetic */ void a(am amVar) {
            an.d.CC.$default$a((an.d) this, amVar);
        }

        public /* synthetic */ void a(an.a aVar) {
            an.d.CC.$default$a((an.d) this, aVar);
        }

        public /* synthetic */ void a(an.e eVar, an.e eVar2, int i) {
            an.d.CC.$default$a(this, eVar, eVar2, i);
        }

        public void a(an anVar, an.c cVar) {
            if (cVar.a(4, 5)) {
                f.this.f();
            }
            if (cVar.a(4, 5, 7)) {
                f.this.k();
            }
            if (cVar.a(8)) {
                f.this.h();
            }
            if (cVar.a(9)) {
                f.this.i();
            }
            if (cVar.a(8, 9, 11, 0, 13)) {
                f.this.g();
            }
            if (cVar.a(11, 0)) {
                f.this.j();
            }
        }

        public /* synthetic */ void a(ba baVar, int i) {
            an.d.CC.$default$a((an.d) this, baVar, i);
        }

        public /* synthetic */ void a(com.applovin.exoplayer2.g.a aVar) {
            an.d.CC.$default$a((an.d) this, aVar);
        }

        public /* synthetic */ void a(ad adVar, h hVar) {
            an.d.CC.$default$a((an.d) this, adVar, hVar);
        }

        public /* synthetic */ void a(o oVar) {
            an.d.CC.$default$a((an.d) this, oVar);
        }

        public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
            an.d.CC.$default$a((an.d) this, oVar);
        }

        public void a(k kVar, long j) {
            boolean unused = f.this.M = true;
            if (f.this.m != null) {
                f.this.m.setText(ai.a(f.this.o, f.this.p, j));
            }
        }

        public void a(k kVar, long j, boolean z) {
            boolean unused = f.this.M = false;
            if (!z && f.this.G != null) {
                f fVar = f.this;
                fVar.a(fVar.G, j);
            }
        }

        public /* synthetic */ void a(List<com.applovin.exoplayer2.i.a> list) {
            an.d.CC.$default$a((an.d) this, (List) list);
        }

        @Deprecated
        public /* synthetic */ void a(boolean z, int i) {
            an.b.CC.$default$a((an.b) this, z, i);
        }

        public /* synthetic */ void a_(boolean z) {
            an.d.CC.$default$a_(this, z);
        }

        @Deprecated
        public /* synthetic */ void b() {
            an.b.CC.$default$b(this);
        }

        public /* synthetic */ void b(int i) {
            an.d.CC.$default$b((an.d) this, i);
        }

        public /* synthetic */ void b(ak akVar) {
            an.d.CC.$default$b((an.d) this, akVar);
        }

        public void b(k kVar, long j) {
            if (f.this.m != null) {
                f.this.m.setText(ai.a(f.this.o, f.this.p, j));
            }
        }

        public /* synthetic */ void b(boolean z, int i) {
            an.d.CC.$default$b(this, z, i);
        }

        public /* synthetic */ void b_(boolean z) {
            an.d.CC.$default$b_(this, z);
        }

        public /* synthetic */ void c(int i) {
            an.d.CC.$default$c(this, i);
        }

        @Deprecated
        public /* synthetic */ void c(boolean z) {
            an.b.CC.$default$c((an.b) this, z);
        }

        public /* synthetic */ void d(int i) {
            an.d.CC.$default$d((an.d) this, i);
        }

        public /* synthetic */ void d(boolean z) {
            an.d.CC.$default$d((an.d) this, z);
        }

        @Deprecated
        public /* synthetic */ void e(int i) {
            an.b.CC.$default$e((an.b) this, i);
        }

        public /* synthetic */ void e(boolean z) {
            an.d.CC.$default$e(this, z);
        }

        public void onClick(View view) {
            an j = f.this.G;
            if (j != null) {
                if (f.this.f13877d == view) {
                    f.this.H.c(j);
                } else if (f.this.f13876c == view) {
                    f.this.H.b(j);
                } else if (f.this.f13880g == view) {
                    if (j.t() != 4) {
                        f.this.H.e(j);
                    }
                } else if (f.this.f13881h == view) {
                    f.this.H.d(j);
                } else if (f.this.f13878e == view) {
                    f.this.b(j);
                } else if (f.this.f13879f == view) {
                    f.this.c(j);
                } else if (f.this.i == view) {
                    f.this.H.a(j, com.applovin.exoplayer2.l.ab.a(j.y(), f.this.P));
                } else if (f.this.j == view) {
                    f.this.H.b(j, !j.z());
                }
            }
        }
    }

    public interface c {
        void a(long j, long j2);
    }

    public interface d {
        void a(int i);
    }

    static {
        t.a("goog.exo.ui");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r4, android.util.AttributeSet r5, int r6, android.util.AttributeSet r7) {
        /*
            r3 = this;
            r3.<init>(r4, r5, r6)
            int r5 = com.applovin.sdk.R.layout.applovin_exo_player_control_view
            r0 = 5000(0x1388, float:7.006E-42)
            r3.N = r0
            r0 = 0
            r3.P = r0
            r1 = 200(0xc8, float:2.8E-43)
            r3.O = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.V = r1
            r1 = 1
            r3.Q = r1
            r3.R = r1
            r3.S = r1
            r3.T = r1
            r3.U = r0
            if (r7 == 0) goto L_0x008c
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int[] r2 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView
            android.content.res.TypedArray r6 = r1.obtainStyledAttributes(r7, r2, r6, r0)
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_timeout     // Catch:{ all -> 0x0087 }
            int r2 = r3.N     // Catch:{ all -> 0x0087 }
            int r1 = r6.getInt(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.N = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_controller_layout_id     // Catch:{ all -> 0x0087 }
            int r5 = r6.getResourceId(r1, r5)     // Catch:{ all -> 0x0087 }
            int r1 = r3.P     // Catch:{ all -> 0x0087 }
            int r1 = a((android.content.res.TypedArray) r6, (int) r1)     // Catch:{ all -> 0x0087 }
            r3.P = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_rewind_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.Q     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.Q = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_fastforward_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.R     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.R = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_previous_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.S     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.S = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_next_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.T     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.T = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_show_shuffle_button     // Catch:{ all -> 0x0087 }
            boolean r2 = r3.U     // Catch:{ all -> 0x0087 }
            boolean r1 = r6.getBoolean(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.U = r1     // Catch:{ all -> 0x0087 }
            int r1 = com.applovin.sdk.R.styleable.AppLovinPlayerControlView_al_time_bar_min_update_interval     // Catch:{ all -> 0x0087 }
            int r2 = r3.O     // Catch:{ all -> 0x0087 }
            int r1 = r6.getInt(r1, r2)     // Catch:{ all -> 0x0087 }
            r3.setTimeBarMinUpdateInterval(r1)     // Catch:{ all -> 0x0087 }
            r6.recycle()
            goto L_0x008c
        L_0x0087:
            r4 = move-exception
            r6.recycle()
            throw r4
        L_0x008c:
            java.util.concurrent.CopyOnWriteArrayList r6 = new java.util.concurrent.CopyOnWriteArrayList
            r6.<init>()
            r3.f13875b = r6
            com.applovin.exoplayer2.ba$a r6 = new com.applovin.exoplayer2.ba$a
            r6.<init>()
            r3.q = r6
            com.applovin.exoplayer2.ba$c r6 = new com.applovin.exoplayer2.ba$c
            r6.<init>()
            r3.r = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r3.o = r6
            java.util.Formatter r6 = new java.util.Formatter
            java.lang.StringBuilder r1 = r3.o
            java.util.Locale r2 = java.util.Locale.getDefault()
            r6.<init>(r1, r2)
            r3.p = r6
            long[] r6 = new long[r0]
            r3.W = r6
            boolean[] r6 = new boolean[r0]
            r3.aa = r6
            long[] r6 = new long[r0]
            r3.ab = r6
            boolean[] r6 = new boolean[r0]
            r3.ac = r6
            com.applovin.exoplayer2.ui.f$b r6 = new com.applovin.exoplayer2.ui.f$b
            r1 = 0
            r6.<init>()
            r3.f13874a = r6
            com.applovin.exoplayer2.j r6 = new com.applovin.exoplayer2.j
            r6.<init>()
            r3.H = r6
            com.applovin.exoplayer2.ui.-$$Lambda$f$HOUhDgOu5XHOS9rBEb_jr5wCE8g r6 = new com.applovin.exoplayer2.ui.-$$Lambda$f$HOUhDgOu5XHOS9rBEb_jr5wCE8g
            r6.<init>()
            r3.s = r6
            com.applovin.exoplayer2.ui.-$$Lambda$UYas5eXFtG7n_uq6CrQ8KdCtlyI r6 = new com.applovin.exoplayer2.ui.-$$Lambda$UYas5eXFtG7n_uq6CrQ8KdCtlyI
            r6.<init>()
            r3.t = r6
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r4)
            r6.inflate(r5, r3)
            r5 = 262144(0x40000, float:3.67342E-40)
            r3.setDescendantFocusability(r5)
            int r5 = com.applovin.sdk.R.id.al_exo_progress
            android.view.View r5 = r3.findViewById(r5)
            com.applovin.exoplayer2.ui.k r5 = (com.applovin.exoplayer2.ui.k) r5
            int r6 = com.applovin.sdk.R.id.al_exo_progress_placeholder
            android.view.View r6 = r3.findViewById(r6)
            if (r5 == 0) goto L_0x0101
        L_0x00fe:
            r3.n = r5
            goto L_0x0127
        L_0x0101:
            if (r6 == 0) goto L_0x0125
            com.applovin.exoplayer2.ui.d r5 = new com.applovin.exoplayer2.ui.d
            r5.<init>(r4, r1, r0, r7)
            int r7 = com.applovin.sdk.R.id.al_exo_progress
            r5.setId(r7)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            r5.setLayoutParams(r7)
            android.view.ViewParent r7 = r6.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r1 = r7.indexOfChild(r6)
            r7.removeView(r6)
            r7.addView(r5, r1)
            goto L_0x00fe
        L_0x0125:
            r3.n = r1
        L_0x0127:
            int r5 = com.applovin.sdk.R.id.al_exo_duration
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.l = r5
            int r5 = com.applovin.sdk.R.id.al_exo_position
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.m = r5
            com.applovin.exoplayer2.ui.k r5 = r3.n
            if (r5 == 0) goto L_0x0144
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.a(r6)
        L_0x0144:
            int r5 = com.applovin.sdk.R.id.al_exo_play
            android.view.View r5 = r3.findViewById(r5)
            r3.f13878e = r5
            if (r5 == 0) goto L_0x0153
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x0153:
            int r5 = com.applovin.sdk.R.id.al_exo_pause
            android.view.View r5 = r3.findViewById(r5)
            r3.f13879f = r5
            if (r5 == 0) goto L_0x0162
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x0162:
            int r5 = com.applovin.sdk.R.id.al_exo_prev
            android.view.View r5 = r3.findViewById(r5)
            r3.f13876c = r5
            if (r5 == 0) goto L_0x0171
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x0171:
            int r5 = com.applovin.sdk.R.id.al_exo_next
            android.view.View r5 = r3.findViewById(r5)
            r3.f13877d = r5
            if (r5 == 0) goto L_0x0180
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x0180:
            int r5 = com.applovin.sdk.R.id.al_exo_rew
            android.view.View r5 = r3.findViewById(r5)
            r3.f13881h = r5
            if (r5 == 0) goto L_0x018f
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x018f:
            int r5 = com.applovin.sdk.R.id.al_exo_ffwd
            android.view.View r5 = r3.findViewById(r5)
            r3.f13880g = r5
            if (r5 == 0) goto L_0x019e
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x019e:
            int r5 = com.applovin.sdk.R.id.al_exo_repeat_toggle
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.i = r5
            if (r5 == 0) goto L_0x01af
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x01af:
            int r5 = com.applovin.sdk.R.id.al_exo_shuffle
            android.view.View r5 = r3.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.j = r5
            if (r5 == 0) goto L_0x01c0
            com.applovin.exoplayer2.ui.f$b r6 = r3.f13874a
            r5.setOnClickListener(r6)
        L_0x01c0:
            int r5 = com.applovin.sdk.R.id.al_exo_vr
            android.view.View r5 = r3.findViewById(r5)
            r3.k = r5
            r3.setShowVrButton(r0)
            android.view.View r5 = r3.k
            r3.a((boolean) r0, (boolean) r0, (android.view.View) r5)
            android.content.res.Resources r4 = r4.getResources()
            int r5 = com.applovin.sdk.R.integer.al_exo_media_button_opacity_percentage_enabled
            int r5 = r4.getInteger(r5)
            float r5 = (float) r5
            r6 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 / r6
            r3.C = r5
            int r5 = com.applovin.sdk.R.integer.al_exo_media_button_opacity_percentage_disabled
            int r5 = r4.getInteger(r5)
            float r5 = (float) r5
            float r5 = r5 / r6
            r3.D = r5
            int r5 = com.applovin.sdk.R.drawable.al_exo_controls_repeat_off
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.u = r5
            int r5 = com.applovin.sdk.R.drawable.al_exo_controls_repeat_one
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.v = r5
            int r5 = com.applovin.sdk.R.drawable.al_exo_controls_repeat_all
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.w = r5
            int r5 = com.applovin.sdk.R.drawable.al_exo_controls_shuffle_on
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.A = r5
            int r5 = com.applovin.sdk.R.drawable.al_exo_controls_shuffle_off
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r3.B = r5
            int r5 = com.applovin.sdk.R.string.al_exo_controls_repeat_off_description
            java.lang.String r5 = r4.getString(r5)
            r3.x = r5
            int r5 = com.applovin.sdk.R.string.al_exo_controls_repeat_one_description
            java.lang.String r5 = r4.getString(r5)
            r3.y = r5
            int r5 = com.applovin.sdk.R.string.al_exo_controls_repeat_all_description
            java.lang.String r5 = r4.getString(r5)
            r3.z = r5
            int r5 = com.applovin.sdk.R.string.al_exo_controls_shuffle_on_description
            java.lang.String r5 = r4.getString(r5)
            r3.E = r5
            int r5 = com.applovin.sdk.R.string.al_exo_controls_shuffle_off_description
            java.lang.String r4 = r4.getString(r5)
            r3.F = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.f.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    private static int a(TypedArray typedArray, int i2) {
        return typedArray.getInt(R.styleable.AppLovinPlayerControlView_al_repeat_toggle_modes, i2);
    }

    private void a(an anVar) {
        int t2 = anVar.t();
        if (t2 == 1 || t2 == 4 || !anVar.x()) {
            b(anVar);
        } else {
            c(anVar);
        }
    }

    /* access modifiers changed from: private */
    public void a(an anVar, long j2) {
        int i2;
        ba S2 = anVar.S();
        if (this.L && !S2.d()) {
            int b2 = S2.b();
            i2 = 0;
            while (true) {
                long c2 = S2.a(i2, this.r).c();
                if (j2 < c2) {
                    break;
                } else if (i2 == b2 - 1) {
                    j2 = c2;
                    break;
                } else {
                    j2 -= c2;
                    i2++;
                }
            }
        } else {
            i2 = anVar.G();
        }
        a(anVar, i2, j2);
        k();
    }

    private void a(boolean z2, boolean z3, View view) {
        if (view != null) {
            view.setEnabled(z3);
            view.setAlpha(z3 ? this.C : this.D);
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    private static boolean a(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    private boolean a(an anVar, int i2, long j2) {
        return this.H.a(anVar, i2, j2);
    }

    private static boolean a(ba baVar, ba.c cVar) {
        if (baVar.b() > 100) {
            return false;
        }
        int b2 = baVar.b();
        for (int i2 = 0; i2 < b2; i2++) {
            if (baVar.a(i2, cVar).o == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void b(an anVar) {
        int t2 = anVar.t();
        if (t2 == 1) {
            this.H.a(anVar);
        } else if (t2 == 4) {
            a(anVar, anVar.G(), -9223372036854775807L);
        }
        this.H.a(anVar, true);
    }

    /* access modifiers changed from: private */
    public void c(an anVar) {
        this.H.a(anVar, false);
    }

    private void d() {
        removeCallbacks(this.t);
        if (this.N > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i2 = this.N;
            this.V = uptimeMillis + ((long) i2);
            if (this.J) {
                postDelayed(this.t, (long) i2);
                return;
            }
            return;
        }
        this.V = -9223372036854775807L;
    }

    private void e() {
        f();
        g();
        h();
        i();
        j();
    }

    /* access modifiers changed from: private */
    public void f() {
        boolean z2;
        boolean z3;
        if (c() && this.J) {
            boolean n2 = n();
            View view = this.f13878e;
            int i2 = 8;
            boolean z4 = true;
            if (view != null) {
                z3 = (n2 && view.isFocused()) | false;
                z2 = (ai.f13525a < 21 ? z3 : n2 && a.a(this.f13878e)) | false;
                this.f13878e.setVisibility(n2 ? 8 : 0);
            } else {
                z3 = false;
                z2 = false;
            }
            View view2 = this.f13879f;
            if (view2 != null) {
                z3 |= !n2 && view2.isFocused();
                if (ai.f13525a < 21) {
                    z4 = z3;
                } else if (n2 || !a.a(this.f13879f)) {
                    z4 = false;
                }
                z2 |= z4;
                View view3 = this.f13879f;
                if (n2) {
                    i2 = 0;
                }
                view3.setVisibility(i2);
            }
            if (z3) {
                l();
            }
            if (z2) {
                m();
            }
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (c() && this.J) {
            an anVar = this.G;
            boolean z6 = false;
            if (anVar != null) {
                boolean a2 = anVar.a(4);
                boolean a3 = anVar.a(6);
                z2 = anVar.a(10) && this.H.a();
                if (anVar.a(11) && this.H.b()) {
                    z6 = true;
                }
                boolean z7 = a2;
                z4 = anVar.a(8);
                z5 = z6;
                z6 = a3;
                z3 = z7;
            } else {
                z5 = false;
                z4 = false;
                z3 = false;
                z2 = false;
            }
            a(this.S, z6, this.f13876c);
            a(this.Q, z2, this.f13881h);
            a(this.R, z5, this.f13880g);
            a(this.T, z4, this.f13877d);
            k kVar = this.n;
            if (kVar != null) {
                kVar.setEnabled(z3);
            }
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        ImageView imageView;
        String str;
        ImageView imageView2;
        if (c() && this.J && (imageView = this.i) != null) {
            if (this.P == 0) {
                a(false, false, (View) imageView);
                return;
            }
            an anVar = this.G;
            if (anVar == null) {
                a(true, false, (View) imageView);
                this.i.setImageDrawable(this.u);
                this.i.setContentDescription(this.x);
                return;
            }
            a(true, true, (View) imageView);
            int y2 = anVar.y();
            if (y2 == 0) {
                this.i.setImageDrawable(this.u);
                imageView2 = this.i;
                str = this.x;
            } else if (y2 != 1) {
                if (y2 == 2) {
                    this.i.setImageDrawable(this.w);
                    imageView2 = this.i;
                    str = this.z;
                }
                this.i.setVisibility(0);
            } else {
                this.i.setImageDrawable(this.v);
                imageView2 = this.i;
                str = this.y;
            }
            imageView2.setContentDescription(str);
            this.i.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (c() && this.J && (imageView = this.j) != null) {
            an anVar = this.G;
            if (!this.U) {
                a(false, false, (View) imageView);
                return;
            }
            if (anVar == null) {
                a(true, false, (View) imageView);
                this.j.setImageDrawable(this.B);
                imageView2 = this.j;
            } else {
                a(true, true, (View) imageView);
                this.j.setImageDrawable(anVar.z() ? this.A : this.B);
                imageView2 = this.j;
                if (anVar.z()) {
                    str = this.E;
                    imageView2.setContentDescription(str);
                }
            }
            str = this.F;
            imageView2.setContentDescription(str);
        }
    }

    /* access modifiers changed from: private */
    public void j() {
        int i2;
        long j2;
        an anVar = this.G;
        if (anVar != null) {
            boolean z2 = true;
            this.L = this.K && a(anVar.S(), this.r);
            this.ad = 0;
            ba S2 = anVar.S();
            if (!S2.d()) {
                int G2 = anVar.G();
                int i3 = this.L ? 0 : G2;
                int b2 = this.L ? S2.b() - 1 : G2;
                long j3 = 0;
                i2 = 0;
                while (true) {
                    if (i3 > b2) {
                        break;
                    }
                    if (i3 == G2) {
                        this.ad = com.applovin.exoplayer2.h.a(j3);
                    }
                    S2.a(i3, this.r);
                    if (this.r.o == -9223372036854775807L) {
                        com.applovin.exoplayer2.l.a.b(this.L ^ z2);
                        break;
                    }
                    for (int i4 = this.r.p; i4 <= this.r.q; i4++) {
                        S2.a(i4, this.q);
                        int d2 = this.q.d();
                        for (int e2 = this.q.e(); e2 < d2; e2++) {
                            long a2 = this.q.a(e2);
                            if (a2 == Long.MIN_VALUE) {
                                if (this.q.f11365d == -9223372036854775807L) {
                                } else {
                                    a2 = this.q.f11365d;
                                }
                            }
                            long c2 = a2 + this.q.c();
                            if (c2 >= 0) {
                                long[] jArr = this.W;
                                if (i2 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.W = Arrays.copyOf(this.W, length);
                                    this.aa = Arrays.copyOf(this.aa, length);
                                }
                                this.W[i2] = com.applovin.exoplayer2.h.a(j3 + c2);
                                this.aa[i2] = this.q.c(e2);
                                i2++;
                            }
                        }
                    }
                    j3 += this.r.o;
                    i3++;
                    z2 = true;
                }
                j2 = j3;
            } else {
                j2 = 0;
                i2 = 0;
            }
            long a3 = com.applovin.exoplayer2.h.a(j2);
            TextView textView = this.l;
            if (textView != null) {
                textView.setText(ai.a(this.o, this.p, a3));
            }
            k kVar = this.n;
            if (kVar != null) {
                kVar.setDuration(a3);
                int length2 = this.ab.length;
                int i5 = i2 + length2;
                long[] jArr2 = this.W;
                if (i5 > jArr2.length) {
                    this.W = Arrays.copyOf(jArr2, i5);
                    this.aa = Arrays.copyOf(this.aa, i5);
                }
                System.arraycopy(this.ab, 0, this.W, i2, length2);
                System.arraycopy(this.ac, 0, this.aa, i2, length2);
                this.n.a(this.W, this.aa, i5);
            }
            k();
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        long j2;
        if (c() && this.J) {
            an anVar = this.G;
            long j3 = 0;
            if (anVar != null) {
                j3 = this.ad + anVar.N();
                j2 = this.ad + anVar.O();
            } else {
                j2 = 0;
            }
            boolean z2 = false;
            boolean z3 = j3 != this.ae;
            if (j2 != this.af) {
                z2 = true;
            }
            this.ae = j3;
            this.af = j2;
            TextView textView = this.m;
            if (textView != null && !this.M && z3) {
                textView.setText(ai.a(this.o, this.p, j3));
            }
            k kVar = this.n;
            if (kVar != null) {
                kVar.setPosition(j3);
                this.n.setBufferedPosition(j2);
            }
            if (this.I != null && (z3 || z2)) {
                this.I.a(j3, j2);
            }
            removeCallbacks(this.s);
            int t2 = anVar == null ? 1 : anVar.t();
            long j4 = 1000;
            if (anVar != null && anVar.a()) {
                k kVar2 = this.n;
                long min = Math.min(kVar2 != null ? kVar2.getPreferredUpdateDelay() : 1000, 1000 - (j3 % 1000));
                float f2 = anVar.D().f11106b;
                if (f2 > 0.0f) {
                    j4 = (long) (((float) min) / f2);
                }
                postDelayed(this.s, ai.a(j4, (long) this.O, 1000));
            } else if (t2 != 4 && t2 != 1) {
                postDelayed(this.s, 1000);
            }
        }
    }

    private void l() {
        View view;
        View view2;
        boolean n2 = n();
        if (!n2 && (view2 = this.f13878e) != null) {
            view2.requestFocus();
        } else if (n2 && (view = this.f13879f) != null) {
            view.requestFocus();
        }
    }

    private void m() {
        View view;
        View view2;
        boolean n2 = n();
        if (!n2 && (view2 = this.f13878e) != null) {
            view2.sendAccessibilityEvent(8);
        } else if (n2 && (view = this.f13879f) != null) {
            view.sendAccessibilityEvent(8);
        }
    }

    private boolean n() {
        an anVar = this.G;
        return (anVar == null || anVar.t() == 4 || this.G.t() == 1 || !this.G.x()) ? false : true;
    }

    public void a() {
        if (!c()) {
            setVisibility(0);
            Iterator<d> it = this.f13875b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            e();
            l();
            m();
        }
        d();
    }

    public void a(d dVar) {
        com.applovin.exoplayer2.l.a.b(dVar);
        this.f13875b.add(dVar);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        an anVar = this.G;
        if (anVar == null || !a(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (anVar.t() == 4) {
                return true;
            }
            this.H.e(anVar);
            return true;
        } else if (keyCode == 89) {
            this.H.d(anVar);
            return true;
        } else if (keyEvent.getRepeatCount() != 0) {
            return true;
        } else {
            if (keyCode == 79 || keyCode == 85) {
                a(anVar);
                return true;
            } else if (keyCode == 87) {
                this.H.c(anVar);
                return true;
            } else if (keyCode == 88) {
                this.H.b(anVar);
                return true;
            } else if (keyCode == 126) {
                b(anVar);
                return true;
            } else if (keyCode != 127) {
                return true;
            } else {
                c(anVar);
                return true;
            }
        }
    }

    public void b() {
        if (c()) {
            setVisibility(8);
            Iterator<d> it = this.f13875b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.V = -9223372036854775807L;
        }
    }

    public void b(d dVar) {
        this.f13875b.remove(dVar);
    }

    public boolean c() {
        return getVisibility() == 0;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public an getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.P;
    }

    public boolean getShowShuffleButton() {
        return this.U;
    }

    public int getShowTimeoutMs() {
        return this.N;
    }

    public boolean getShowVrButton() {
        View view = this.k;
        return view != null && view.getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        long j2 = this.V;
        if (j2 != -9223372036854775807L) {
            long uptimeMillis = j2 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                b();
            } else {
                postDelayed(this.t, uptimeMillis);
            }
        } else if (c()) {
            d();
        }
        e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    @Deprecated
    public void setControlDispatcher(i iVar) {
        if (this.H != iVar) {
            this.H = iVar;
            g();
        }
    }

    public void setPlayer(an anVar) {
        boolean z2 = true;
        com.applovin.exoplayer2.l.a.b(Looper.myLooper() == Looper.getMainLooper());
        if (!(anVar == null || anVar.r() == Looper.getMainLooper())) {
            z2 = false;
        }
        com.applovin.exoplayer2.l.a.a(z2);
        an anVar2 = this.G;
        if (anVar2 != anVar) {
            if (anVar2 != null) {
                anVar2.b((an.d) this.f13874a);
            }
            this.G = anVar;
            if (anVar != null) {
                anVar.a((an.d) this.f13874a);
            }
            e();
        }
    }

    public void setProgressUpdateListener(c cVar) {
        this.I = cVar;
    }

    public void setRepeatToggleModes(int i2) {
        int i3;
        i iVar;
        an anVar;
        this.P = i2;
        an anVar2 = this.G;
        if (anVar2 != null) {
            int y2 = anVar2.y();
            if (i2 != 0 || y2 == 0) {
                i3 = 2;
                if (i2 == 1 && y2 == 2) {
                    this.H.a(this.G, 1);
                } else if (i2 == 2 && y2 == 1) {
                    iVar = this.H;
                    anVar = this.G;
                }
            } else {
                iVar = this.H;
                anVar = this.G;
                i3 = 0;
            }
            iVar.a(anVar, i3);
        }
        h();
    }

    public void setShowFastForwardButton(boolean z2) {
        this.R = z2;
        g();
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        this.K = z2;
        j();
    }

    public void setShowNextButton(boolean z2) {
        this.T = z2;
        g();
    }

    public void setShowPreviousButton(boolean z2) {
        this.S = z2;
        g();
    }

    public void setShowRewindButton(boolean z2) {
        this.Q = z2;
        g();
    }

    public void setShowShuffleButton(boolean z2) {
        this.U = z2;
        i();
    }

    public void setShowTimeoutMs(int i2) {
        this.N = i2;
        if (c()) {
            d();
        }
    }

    public void setShowVrButton(boolean z2) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.O = ai.a(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            a(getShowVrButton(), onClickListener != null, this.k);
        }
    }
}

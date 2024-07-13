package com.applovin.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.a.s;
import com.applovin.exoplayer2.h.ad;
import com.applovin.exoplayer2.i;
import com.applovin.exoplayer2.j.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.k;
import com.applovin.exoplayer2.l.u;
import com.applovin.exoplayer2.m.o;
import com.applovin.exoplayer2.ui.AspectRatioFrameLayout;
import com.applovin.exoplayer2.ui.f;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

public class g extends FrameLayout {
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    private final a f13883a;

    /* renamed from: b  reason: collision with root package name */
    private final AspectRatioFrameLayout f13884b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final View f13885c;

    /* renamed from: d  reason: collision with root package name */
    private final View f13886d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f13887e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageView f13888f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final SubtitleView f13889g;

    /* renamed from: h  reason: collision with root package name */
    private final View f13890h;
    private final TextView i;
    private final f j;
    private final FrameLayout k;
    private final FrameLayout l;
    /* access modifiers changed from: private */
    public an m;
    private boolean n;
    private f.d o;
    private boolean p;
    private Drawable q;
    private int r;
    private boolean s;
    private k<? super ak> t;
    private CharSequence u;
    private int v;
    private boolean w;
    /* access modifiers changed from: private */
    public boolean x;
    private boolean y;
    /* access modifiers changed from: private */
    public int z;

    private final class a implements View.OnClickListener, View.OnLayoutChangeListener, an.d, f.d {

        /* renamed from: b  reason: collision with root package name */
        private final ba.a f13892b = new ba.a();

        /* renamed from: c  reason: collision with root package name */
        private Object f13893c;

        public a() {
        }

        public void a() {
            if (g.this.f13885c != null) {
                g.this.f13885c.setVisibility(4);
            }
        }

        public /* synthetic */ void a(float f2) {
            an.d.CC.$default$a((an.d) this, f2);
        }

        public void a(int i) {
            g.this.m();
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

        public void a(an.e eVar, an.e eVar2, int i) {
            if (g.this.g() && g.this.x) {
                g.this.b();
            }
        }

        public /* synthetic */ void a(an anVar, an.c cVar) {
            an.d.CC.$default$a((an.d) this, anVar, cVar);
        }

        public /* synthetic */ void a(ba baVar, int i) {
            an.d.CC.$default$a((an.d) this, baVar, i);
        }

        public /* synthetic */ void a(com.applovin.exoplayer2.g.a aVar) {
            an.d.CC.$default$a((an.d) this, aVar);
        }

        public void a(ad adVar, h hVar) {
            an anVar = (an) com.applovin.exoplayer2.l.a.b(g.this.m);
            ba S = anVar.S();
            if (!S.d()) {
                if (!anVar.P().a()) {
                    this.f13893c = S.a(anVar.F(), this.f13892b, true).f11363b;
                } else {
                    Object obj = this.f13893c;
                    if (obj != null) {
                        int c2 = S.c(obj);
                        if (c2 != -1 && anVar.G() == S.a(c2, this.f13892b).f11364c) {
                            return;
                        }
                    }
                }
                g.this.c(false);
            }
            this.f13893c = null;
            g.this.c(false);
        }

        public void a(o oVar) {
            g.this.h();
        }

        public /* synthetic */ void a(com.applovin.exoplayer2.o oVar) {
            an.d.CC.$default$a((an.d) this, oVar);
        }

        public void a(List<com.applovin.exoplayer2.i.a> list) {
            if (g.this.f13889g != null) {
                g.this.f13889g.setCues(list);
            }
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

        public void b(int i) {
            g.this.k();
            g.this.l();
            g.this.n();
        }

        public /* synthetic */ void b(ak akVar) {
            an.d.CC.$default$b((an.d) this, akVar);
        }

        public void b(boolean z, int i) {
            g.this.k();
            g.this.n();
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
            boolean unused = g.this.e();
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            g.b((TextureView) view, g.this.z);
        }
    }

    public g(Context context) {
        this(context, (AttributeSet) null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        this.f13883a = new a();
        if (isInEditMode()) {
            this.f13884b = null;
            this.f13885c = null;
            this.f13886d = null;
            this.f13887e = false;
            this.f13888f = null;
            this.f13889g = null;
            this.f13890h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            ImageView imageView = new ImageView(context2);
            if (ai.f13525a >= 23) {
                a(getResources(), imageView);
            } else {
                b(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i9 = R.layout.applovin_exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinPlayerView, i2, 0);
            try {
                z4 = obtainStyledAttributes.hasValue(R.styleable.AppLovinPlayerView_al_shutter_background_color);
                i7 = obtainStyledAttributes.getColor(R.styleable.AppLovinPlayerView_al_shutter_background_color, 0);
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_player_layout_id, i9);
                z3 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_artwork, true);
                i6 = obtainStyledAttributes.getResourceId(R.styleable.AppLovinPlayerView_al_default_artwork, 0);
                z2 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_use_controller, true);
                i5 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_surface_type, 1);
                i4 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_resize_mode, 0);
                int i10 = obtainStyledAttributes.getInt(R.styleable.AppLovinPlayerView_al_show_timeout, 5000);
                boolean z10 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_on_touch, true);
                boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_auto_show, true);
                int i11 = resourceId;
                i8 = obtainStyledAttributes.getInteger(R.styleable.AppLovinPlayerView_al_show_buffering, 0);
                boolean z12 = z10;
                this.s = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_keep_content_on_player_reset, this.s);
                boolean z13 = obtainStyledAttributes.getBoolean(R.styleable.AppLovinPlayerView_al_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                z7 = z12;
                boolean z14 = z13;
                i9 = i11;
                i3 = i10;
                z5 = z11;
                z6 = z14;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i3 = 5000;
            z7 = true;
            z6 = true;
            z5 = true;
            i8 = 0;
            z4 = false;
            i7 = 0;
            z3 = true;
            i6 = 0;
            z2 = true;
            i5 = 1;
            i4 = 0;
        }
        LayoutInflater.from(context).inflate(i9, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.al_exo_content_frame);
        this.f13884b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            a(aspectRatioFrameLayout, i4);
        }
        View findViewById = findViewById(R.id.al_exo_shutter);
        this.f13885c = findViewById;
        if (findViewById != null && z4) {
            findViewById.setBackgroundColor(i7);
        }
        if (this.f13884b == null || i5 == 0) {
            this.f13886d = null;
            z8 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i5 == 2) {
                this.f13886d = new TextureView(context2);
            } else if (i5 == 3) {
                try {
                    this.f13886d = (View) Class.forName("com.applovin.exoplayer2.m.a.i").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                    z9 = true;
                    this.f13886d.setLayoutParams(layoutParams);
                    this.f13886d.setOnClickListener(this.f13883a);
                    this.f13886d.setClickable(false);
                    this.f13884b.addView(this.f13886d, 0);
                    z8 = z9;
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i5 != 4) {
                this.f13886d = new SurfaceView(context2);
            } else {
                try {
                    this.f13886d = (View) Class.forName("com.applovin.exoplayer2.m.i").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context2});
                } catch (Exception e3) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z9 = false;
            this.f13886d.setLayoutParams(layoutParams);
            this.f13886d.setOnClickListener(this.f13883a);
            this.f13886d.setClickable(false);
            this.f13884b.addView(this.f13886d, 0);
            z8 = z9;
        }
        this.f13887e = z8;
        this.k = (FrameLayout) findViewById(R.id.al_exo_ad_overlay);
        this.l = (FrameLayout) findViewById(R.id.al_exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.al_exo_artwork);
        this.f13888f = imageView2;
        this.p = z3 && imageView2 != null;
        if (i6 != 0) {
            this.q = ContextCompat.getDrawable(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.al_exo_subtitles);
        this.f13889g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            this.f13889g.c();
        }
        View findViewById2 = findViewById(R.id.al_exo_buffering);
        this.f13890h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.r = i8;
        TextView textView = (TextView) findViewById(R.id.al_exo_error_message);
        this.i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        f fVar = (f) findViewById(R.id.al_exo_controller);
        View findViewById3 = findViewById(R.id.al_exo_controller_placeholder);
        if (fVar != null) {
            this.j = fVar;
        } else if (findViewById3 != null) {
            f fVar2 = new f(context2, (AttributeSet) null, 0, attributeSet2);
            this.j = fVar2;
            fVar2.setId(R.id.al_exo_controller);
            this.j.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(this.j, indexOfChild);
        } else {
            this.j = null;
        }
        this.v = this.j != null ? i3 : 0;
        this.y = z7;
        this.w = z5;
        this.x = z6;
        this.n = z2 && this.j != null;
        b();
        m();
        f fVar3 = this.j;
        if (fVar3 != null) {
            fVar3.a((f.d) this.f13883a);
        }
    }

    private static void a(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color, (Resources.Theme) null));
    }

    private static void a(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    private void a(boolean z2) {
        if ((!g() || !this.x) && c()) {
            boolean z3 = this.j.c() && this.j.getShowTimeoutMs() <= 0;
            boolean f2 = f();
            if (z2 || z3 || f2) {
                b(f2);
            }
        }
    }

    private boolean a(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    private boolean a(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                a(this.f13884b, ((float) intrinsicWidth) / ((float) intrinsicHeight));
                this.f13888f.setImageDrawable(drawable);
                this.f13888f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private boolean a(ac acVar) {
        if (acVar.l == null) {
            return false;
        }
        return a((Drawable) new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(acVar.l, 0, acVar.l.length)));
    }

    private static void b(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.applovin_exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.al_exo_edit_mode_background_color));
    }

    /* access modifiers changed from: private */
    public static void b(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (!(width == 0.0f || height == 0.0f || i2 == 0)) {
            float f2 = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate((float) i2, f2, f3);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        }
        textureView.setTransform(matrix);
    }

    private void b(boolean z2) {
        if (c()) {
            this.j.setShowTimeoutMs(z2 ? 0 : this.v);
            this.j.a();
        }
    }

    /* access modifiers changed from: private */
    public void c(boolean z2) {
        an anVar = this.m;
        if (anVar != null && !anVar.P().a()) {
            if (z2 && !this.s) {
                j();
            }
            h Q = anVar.Q();
            for (int i2 = 0; i2 < Q.f13298a; i2++) {
                com.applovin.exoplayer2.j.g a2 = Q.a(i2);
                if (a2 != null) {
                    for (int i3 = 0; i3 < a2.e(); i3++) {
                        if (u.e(a2.a(i3).l) == 2) {
                            i();
                            return;
                        }
                    }
                    continue;
                }
            }
            j();
            if (!d() || (!a(anVar.R()) && !a(this.q))) {
                i();
            }
        } else if (!this.s) {
            i();
            j();
        }
    }

    private boolean c() {
        if (!this.n) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.j);
        return true;
    }

    private boolean d() {
        if (!this.p) {
            return false;
        }
        com.applovin.exoplayer2.l.a.a(this.f13888f);
        return true;
    }

    /* access modifiers changed from: private */
    public boolean e() {
        if (!c() || this.m == null) {
            return false;
        }
        if (!this.j.c()) {
            a(true);
        } else if (this.y) {
            this.j.b();
        }
        return true;
    }

    private boolean f() {
        an anVar = this.m;
        if (anVar == null) {
            return true;
        }
        int t2 = anVar.t();
        return this.w && (t2 == 1 || t2 == 4 || !this.m.x());
    }

    /* access modifiers changed from: private */
    public boolean g() {
        an anVar = this.m;
        return anVar != null && anVar.K() && this.m.x();
    }

    /* access modifiers changed from: private */
    public void h() {
        an anVar = this.m;
        o T = anVar != null ? anVar.T() : o.f13756a;
        int i2 = T.f13758b;
        int i3 = T.f13759c;
        int i4 = T.f13760d;
        float f2 = 0.0f;
        float f3 = (i3 == 0 || i2 == 0) ? 0.0f : (((float) i2) * T.f13761e) / ((float) i3);
        if (this.f13886d instanceof TextureView) {
            if (f3 > 0.0f && (i4 == 90 || i4 == 270)) {
                f3 = 1.0f / f3;
            }
            if (this.z != 0) {
                this.f13886d.removeOnLayoutChangeListener(this.f13883a);
            }
            this.z = i4;
            if (i4 != 0) {
                this.f13886d.addOnLayoutChangeListener(this.f13883a);
            }
            b((TextureView) this.f13886d, this.z);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f13884b;
        if (!this.f13887e) {
            f2 = f3;
        }
        a(aspectRatioFrameLayout, f2);
    }

    private void i() {
        ImageView imageView = this.f13888f;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f13888f.setVisibility(4);
        }
    }

    private void j() {
        View view = this.f13885c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        int i2;
        if (this.f13890h != null) {
            an anVar = this.m;
            boolean z2 = true;
            int i3 = 0;
            if (anVar == null || anVar.t() != 2 || ((i2 = this.r) != 2 && (i2 != 1 || !this.m.x()))) {
                z2 = false;
            }
            View view = this.f13890h;
            if (!z2) {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        k<? super ak> kVar;
        TextView textView = this.i;
        if (textView != null) {
            CharSequence charSequence = this.u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.i.setVisibility(0);
                return;
            }
            an anVar = this.m;
            ak e2 = anVar != null ? anVar.e() : null;
            if (e2 == null || (kVar = this.t) == null) {
                this.i.setVisibility(8);
                return;
            }
            this.i.setText((CharSequence) kVar.a(e2).second);
            this.i.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void m() {
        f fVar = this.j;
        String str = null;
        if (fVar != null && this.n) {
            if (fVar.getVisibility() != 0) {
                setContentDescription(getResources().getString(R.string.al_exo_controls_show));
                return;
            } else if (this.y) {
                str = getResources().getString(R.string.al_exo_controls_hide);
            }
        }
        setContentDescription(str);
    }

    /* access modifiers changed from: private */
    public void n() {
        if (!g() || !this.x) {
            a(false);
        } else {
            b();
        }
    }

    public void a() {
        b(f());
    }

    /* access modifiers changed from: protected */
    public void a(AspectRatioFrameLayout aspectRatioFrameLayout, float f2) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public boolean a(KeyEvent keyEvent) {
        return c() && this.j.a(keyEvent);
    }

    public void b() {
        f fVar = this.j;
        if (fVar != null) {
            fVar.b();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        an anVar = this.m;
        if (anVar != null && anVar.K()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean a2 = a(keyEvent.getKeyCode());
        if ((a2 && c() && !this.j.c()) || a(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            a(true);
            return true;
        } else if (!a2 || !c()) {
            return false;
        } else {
            a(true);
            return false;
        }
    }

    public List<a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            arrayList.add(new a(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        f fVar = this.j;
        if (fVar != null) {
            arrayList.add(new a(fVar, 0));
        }
        return s.a(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) com.applovin.exoplayer2.l.a.a(this.k, (Object) "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.w;
    }

    public boolean getControllerHideOnTouch() {
        return this.y;
    }

    public int getControllerShowTimeoutMs() {
        return this.v;
    }

    public Drawable getDefaultArtwork() {
        return this.q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.l;
    }

    public an getPlayer() {
        return this.m;
    }

    public int getResizeMode() {
        com.applovin.exoplayer2.l.a.a(this.f13884b);
        return this.f13884b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f13889g;
    }

    public boolean getUseArtwork() {
        return this.p;
    }

    public boolean getUseController() {
        return this.n;
    }

    public View getVideoSurfaceView() {
        return this.f13886d;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c() || this.m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = true;
            return true;
        } else if (action != 1 || !this.A) {
            return false;
        } else {
            this.A = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!c() || this.m == null) {
            return false;
        }
        a(true);
        return true;
    }

    public boolean performClick() {
        super.performClick();
        return e();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        com.applovin.exoplayer2.l.a.a(this.f13884b);
        this.f13884b.setAspectRatioListener(aVar);
    }

    @Deprecated
    public void setControlDispatcher(i iVar) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setControlDispatcher(iVar);
    }

    public void setControllerAutoShow(boolean z2) {
        this.w = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.x = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.y = z2;
        m();
    }

    public void setControllerShowTimeoutMs(int i2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.v = i2;
        if (this.j.c()) {
            a();
        }
    }

    public void setControllerVisibilityListener(f.d dVar) {
        com.applovin.exoplayer2.l.a.a(this.j);
        f.d dVar2 = this.o;
        if (dVar2 != dVar) {
            if (dVar2 != null) {
                this.j.b(dVar2);
            }
            this.o = dVar;
            if (dVar != null) {
                this.j.a(dVar);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        com.applovin.exoplayer2.l.a.b(this.i != null);
        this.u = charSequence;
        l();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            c(false);
        }
    }

    public void setErrorMessageProvider(k<? super ak> kVar) {
        if (this.t != kVar) {
            this.t = kVar;
            l();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.s != z2) {
            this.s = z2;
            c(false);
        }
    }

    public void setPlayer(an anVar) {
        com.applovin.exoplayer2.l.a.b(Looper.myLooper() == Looper.getMainLooper());
        com.applovin.exoplayer2.l.a.a(anVar == null || anVar.r() == Looper.getMainLooper());
        an anVar2 = this.m;
        if (anVar2 != anVar) {
            if (anVar2 != null) {
                anVar2.b((an.d) this.f13883a);
                if (anVar2.a(26)) {
                    View view = this.f13886d;
                    if (view instanceof TextureView) {
                        anVar2.b((TextureView) view);
                    } else if (view instanceof SurfaceView) {
                        anVar2.b((SurfaceView) view);
                    }
                }
            }
            SubtitleView subtitleView = this.f13889g;
            if (subtitleView != null) {
                subtitleView.setCues((List<com.applovin.exoplayer2.i.a>) null);
            }
            this.m = anVar;
            if (c()) {
                this.j.setPlayer(anVar);
            }
            k();
            l();
            c(true);
            if (anVar != null) {
                if (anVar.a(26)) {
                    View view2 = this.f13886d;
                    if (view2 instanceof TextureView) {
                        anVar.a((TextureView) view2);
                    } else if (view2 instanceof SurfaceView) {
                        anVar.a((SurfaceView) view2);
                    }
                    h();
                }
                if (this.f13889g != null && anVar.a(27)) {
                    this.f13889g.setCues(anVar.V());
                }
                anVar.a((an.d) this.f13883a);
                a(false);
                return;
            }
            b();
        }
    }

    public void setRepeatToggleModes(int i2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        com.applovin.exoplayer2.l.a.a(this.f13884b);
        this.f13884b.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.r != i2) {
            this.r = i2;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowFastForwardButton(z2);
    }

    public void setShowMultiWindowTimeBar(boolean z2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowMultiWindowTimeBar(z2);
    }

    public void setShowNextButton(boolean z2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowNextButton(z2);
    }

    public void setShowPreviousButton(boolean z2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowPreviousButton(z2);
    }

    public void setShowRewindButton(boolean z2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowRewindButton(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        com.applovin.exoplayer2.l.a.a(this.j);
        this.j.setShowShuffleButton(z2);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f13885c;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z2) {
        com.applovin.exoplayer2.l.a.b(!z2 || this.f13888f != null);
        if (this.p != z2) {
            this.p = z2;
            c(false);
        }
    }

    public void setUseController(boolean z2) {
        f fVar;
        an anVar;
        com.applovin.exoplayer2.l.a.b(!z2 || this.j != null);
        if (this.n != z2) {
            this.n = z2;
            if (c()) {
                fVar = this.j;
                anVar = this.m;
            } else {
                f fVar2 = this.j;
                if (fVar2 != null) {
                    fVar2.b();
                    fVar = this.j;
                    anVar = null;
                }
                m();
            }
            fVar.setPlayer(anVar);
            m();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f13886d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }
}

package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: VideoTrafficTipLayout */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private View f1841a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1842b;

    /* renamed from: c  reason: collision with root package name */
    private Context f1843c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.video.nativevideo.a f1844d;

    /* renamed from: e  reason: collision with root package name */
    private b f1845e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1846f = false;

    /* renamed from: g  reason: collision with root package name */
    private com.bykv.vk.openvk.component.video.api.c.b f1847g;

    /* renamed from: h  reason: collision with root package name */
    private ViewStub f1848h;
    private View i;

    /* compiled from: VideoTrafficTipLayout */
    public enum a {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* compiled from: VideoTrafficTipLayout */
    public interface b {
        boolean j();

        void l();
    }

    public void a(Context context, View view) {
        if (context != null && (view instanceof ViewGroup)) {
            this.i = view;
            this.f1843c = m.a().getApplicationContext();
            this.f1848h = (ViewStub) LayoutInflater.from(context).inflate(t.f(context, "tt_video_traffic_tip"), (ViewGroup) view, true).findViewById(t.e(context, "tt_video_traffic_tip_layout_viewStub"));
        }
    }

    private void a(Context context, View view, boolean z) {
        ViewStub viewStub;
        if (context != null && view != null && (viewStub = this.f1848h) != null && viewStub.getParent() != null && this.f1841a == null) {
            this.f1848h.inflate();
            this.f1841a = view.findViewById(t.e(context, "tt_video_traffic_tip_layout"));
            this.f1842b = (TextView) view.findViewById(t.e(context, "tt_video_traffic_tip_tv"));
            View findViewById = view.findViewById(t.e(context, "tt_video_traffic_continue_play_btn"));
            if (z) {
                findViewById.setClickable(true);
                findViewById.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        e.this.c();
                        if (e.this.f1844d != null) {
                            e.this.f1844d.a(a.START_VIDEO, (String) null);
                        }
                    }
                });
                return;
            }
            findViewById.setOnClickListener((View.OnClickListener) null);
            findViewById.setClickable(false);
        }
    }

    public void a(com.bytedance.sdk.openadsdk.core.video.nativevideo.a aVar, b bVar) {
        this.f1845e = bVar;
        this.f1844d = aVar;
    }

    private void b() {
        this.f1847g = null;
    }

    public boolean a(int i2, com.bykv.vk.openvk.component.video.api.c.b bVar, boolean z) {
        Context context = this.f1843c;
        if (context == null || bVar == null) {
            return true;
        }
        a(context, this.i, z);
        this.f1847g = bVar;
        if (i2 == 1 || i2 == 2) {
            return a(i2);
        }
        return true;
    }

    private boolean a(int i2) {
        b bVar;
        if (a() || this.f1846f) {
            return true;
        }
        if (!(this.f1844d == null || (bVar = this.f1845e) == null)) {
            if (bVar.j()) {
                this.f1844d.e((com.bykv.vk.openvk.component.video.api.d.b) null, (View) null);
            }
            this.f1844d.a(a.PAUSE_VIDEO, (String) null);
        }
        a(this.f1847g, true);
        return false;
    }

    /* access modifiers changed from: private */
    public void c() {
        if (this.f1843c != null) {
            d();
        }
    }

    public void a(boolean z) {
        if (z) {
            b();
        }
        d();
    }

    public boolean a() {
        View view = this.f1841a;
        return view != null && view.getVisibility() == 0;
    }

    private void d() {
        View view = this.f1841a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void a(com.bykv.vk.openvk.component.video.api.c.b bVar, boolean z) {
        View view;
        String str;
        View view2;
        if (bVar != null && (view = this.f1841a) != null && this.f1843c != null && view.getVisibility() != 0) {
            b bVar2 = this.f1845e;
            if (bVar2 != null) {
                bVar2.l();
            }
            double ceil = Math.ceil((((double) bVar.e()) * 1.0d) / 1048576.0d);
            if (z) {
                str = String.format(t.a(this.f1843c, "tt_video_without_wifi_tips"), new Object[]{Float.valueOf(Double.valueOf(ceil).floatValue())});
            } else {
                str = t.a(this.f1843c, "tt_video_without_wifi_tips") + t.a(this.f1843c, "tt_video_bytesize");
            }
            v.a(this.f1841a, 0);
            v.a(this.f1842b, (CharSequence) str);
            Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
            if (v.d(this.f1841a) && (view2 = this.f1841a) != null) {
                view2.bringToFront();
                Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
            }
        }
    }
}

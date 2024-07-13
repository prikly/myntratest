package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.j;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.utils.u;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class EmptyView extends View implements x.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f885a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f886b;

    /* renamed from: c  reason: collision with root package name */
    private a f887c;

    /* renamed from: d  reason: collision with root package name */
    private View f888d;

    /* renamed from: e  reason: collision with root package name */
    private List<View> f889e;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f890f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f891g;

    /* renamed from: h  reason: collision with root package name */
    private int f892h;
    private final Handler i = new x(Looper.getMainLooper(), this);
    private final AtomicBoolean j = new AtomicBoolean(true);

    public interface a {
        void a();

        void a(View view);

        void a(boolean z);

        void b();
    }

    public EmptyView(Context context, View view) {
        super(m.a());
        this.f888d = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.f887c;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        this.f891g = false;
        b();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
    }

    private void b() {
        a aVar;
        if (this.j.getAndSet(false) && (aVar = this.f887c) != null) {
            aVar.a();
        }
    }

    private void c() {
        a aVar;
        if (!this.j.getAndSet(true) && (aVar = this.f887c) != null) {
            aVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        this.f891g = true;
        c();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        c();
    }

    public void setRefClickViews(List<View> list) {
        this.f889e = list;
    }

    public void setRefCreativeViews(List<View> list) {
        this.f890f = list;
    }

    public void a() {
        a(this.f889e, (c) null);
        a(this.f890f, (c) null);
    }

    public void a(List<View> list, c cVar) {
        if (j.b(list)) {
            for (View next : list) {
                if (next != null) {
                    next.setOnClickListener(cVar);
                    next.setOnTouchListener(cVar);
                }
            }
        }
    }

    private void d() {
        if (this.f886b && !this.f885a) {
            this.f885a = true;
            this.i.sendEmptyMessage(1);
        }
    }

    private void e() {
        if (this.f885a) {
            this.i.removeCallbacksAndMessages((Object) null);
            this.f885a = false;
        }
    }

    public void setNeedCheckingShow(boolean z) {
        this.f886b = z;
        if (!z && this.f885a) {
            e();
        } else if (z && !this.f885a) {
            d();
        }
    }

    public void setCallback(a aVar) {
        this.f887c = aVar;
    }

    public void setAdType(int i2) {
        this.f892h = i2;
    }

    public void a(Message message) {
        int i2 = message.what;
        if (i2 != 1) {
            if (i2 == 2) {
                boolean c2 = u.c(m.a(), m.a().getPackageName());
                if (x.a(this.f888d, 20, this.f892h) || !c2) {
                    this.i.sendEmptyMessageDelayed(2, 1000);
                } else if (!this.f891g) {
                    setNeedCheckingShow(true);
                }
            }
        } else if (!this.f885a) {
        } else {
            if (x.a(this.f888d, 20, this.f892h)) {
                e();
                this.i.sendEmptyMessageDelayed(2, 1000);
                a aVar = this.f887c;
                if (aVar != null) {
                    aVar.a(this.f888d);
                    return;
                }
                return;
            }
            this.i.sendEmptyMessageDelayed(1, 1000);
        }
    }
}

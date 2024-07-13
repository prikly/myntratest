package com.bykv.vk.openvk.component.video.a.d;

import com.bykv.vk.openvk.component.video.a.d.c;

/* compiled from: AbstractMediaPlayer */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f18106a = false;

    /* renamed from: b  reason: collision with root package name */
    private c.e f18107b;

    /* renamed from: c  reason: collision with root package name */
    private c.b f18108c;

    /* renamed from: d  reason: collision with root package name */
    private c.a f18109d;

    /* renamed from: e  reason: collision with root package name */
    private c.f f18110e;

    /* renamed from: f  reason: collision with root package name */
    private c.g f18111f;

    /* renamed from: g  reason: collision with root package name */
    private c.C0218c f18112g;

    /* renamed from: h  reason: collision with root package name */
    private c.d f18113h;

    public final void a(c.e eVar) {
        this.f18107b = eVar;
    }

    public final void a(c.b bVar) {
        this.f18108c = bVar;
    }

    public final void a(c.a aVar) {
        this.f18109d = aVar;
    }

    public final void a(c.f fVar) {
        this.f18110e = fVar;
    }

    public final void a(c.C0218c cVar) {
        this.f18112g = cVar;
    }

    public final void a(c.d dVar) {
        this.f18113h = dVar;
    }

    public final void a(c.g gVar) {
        this.f18111f = gVar;
    }

    public void a() {
        this.f18107b = null;
        this.f18109d = null;
        this.f18108c = null;
        this.f18110e = null;
        this.f18111f = null;
        this.f18112g = null;
        this.f18113h = null;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        try {
            if (this.f18107b != null) {
                this.f18107b.b(this);
            }
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.api.f.c.c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnPrepared error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        try {
            if (this.f18108c != null) {
                this.f18108c.a(this);
            }
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.api.f.c.c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnCompletion error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i) {
        try {
            if (this.f18109d != null) {
                this.f18109d.a(this, i);
            }
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.api.f.c.c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnBufferingUpdate error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        try {
            if (this.f18110e != null) {
                this.f18110e.c(this);
            }
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.api.f.c.c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnSeekComplete error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i, int i2, int i3, int i4) {
        try {
            if (this.f18111f != null) {
                this.f18111f.a(this, i, i2, i3, i4);
            }
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.api.f.c.c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnVideoSizeChanged error: ", th);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, int i2) {
        try {
            return this.f18112g != null && this.f18112g.a(this, i, i2);
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.api.f.c.c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnError error: ", th);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i, int i2) {
        try {
            return this.f18113h != null && this.f18113h.b(this, i, i2);
        } catch (Throwable th) {
            com.bykv.vk.openvk.component.video.api.f.c.c("AbstractMediaPlayer", "AbstractMediaPlayer.notifyOnInfo error: ", th);
            return false;
        }
    }

    public void a(boolean z) {
        this.f18106a = z;
    }
}

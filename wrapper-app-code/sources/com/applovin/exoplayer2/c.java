package com.applovin.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.applovin.exoplayer2.b.d;
import com.applovin.exoplayer2.c;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.unity3d.services.core.device.MimeTypes;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final AudioManager f11389a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11390b;

    /* renamed from: c  reason: collision with root package name */
    private b f11391c;

    /* renamed from: d  reason: collision with root package name */
    private d f11392d;

    /* renamed from: e  reason: collision with root package name */
    private int f11393e;

    /* renamed from: f  reason: collision with root package name */
    private int f11394f;

    /* renamed from: g  reason: collision with root package name */
    private float f11395g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f11396h;
    private boolean i;

    private class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f11398b;

        public a(Handler handler) {
            this.f11398b = handler;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i) {
            c.this.c(i);
        }

        public void onAudioFocusChange(int i) {
            this.f11398b.post(new Runnable(i) {
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    c.a.this.a(this.f$1);
                }
            });
        }
    }

    public interface b {
        void a(float f2);

        void a(int i);
    }

    public c(Context context, Handler handler, b bVar) {
        this.f11389a = (AudioManager) com.applovin.exoplayer2.l.a.b((AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO));
        this.f11391c = bVar;
        this.f11390b = new a(handler);
        this.f11393e = 0;
    }

    private boolean a(int i2) {
        return i2 == 1 || this.f11394f != 1;
    }

    private static int b(d dVar) {
        if (dVar == null) {
            return 0;
        }
        switch (dVar.f11215d) {
            case 0:
                q.c("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (dVar.f11213b == 1) {
                    return 2;
                }
                break;
            case 16:
                return ai.f13525a >= 19 ? 4 : 2;
            default:
                q.c("AudioFocusManager", "Unidentified audio usage: " + dVar.f11215d);
                return 0;
        }
        return 3;
    }

    private void b(int i2) {
        if (this.f11393e != i2) {
            this.f11393e = i2;
            float f2 = i2 == 3 ? 0.2f : 1.0f;
            if (this.f11395g != f2) {
                this.f11395g = f2;
                b bVar = this.f11391c;
                if (bVar != null) {
                    bVar.a(f2);
                }
            }
        }
    }

    private int c() {
        if (this.f11393e == 1) {
            return 1;
        }
        if ((ai.f13525a >= 26 ? f() : e()) == 1) {
            b(1);
            return 1;
        }
        b(0);
        return -1;
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        int i3;
        if (i2 == -3 || i2 == -2) {
            if (i2 == -2 || i()) {
                d(0);
                i3 = 2;
            } else {
                i3 = 3;
            }
            b(i3);
        } else if (i2 == -1) {
            d(-1);
            d();
        } else if (i2 != 1) {
            q.c("AudioFocusManager", "Unknown focus change type: " + i2);
        } else {
            b(1);
            d(1);
        }
    }

    private void d() {
        if (this.f11393e != 0) {
            if (ai.f13525a >= 26) {
                h();
            } else {
                g();
            }
            b(0);
        }
    }

    private void d(int i2) {
        b bVar = this.f11391c;
        if (bVar != null) {
            bVar.a(i2);
        }
    }

    private int e() {
        return this.f11389a.requestAudioFocus(this.f11390b, ai.g(((d) com.applovin.exoplayer2.l.a.b(this.f11392d)).f11215d), this.f11394f);
    }

    private int f() {
        if (this.f11396h == null || this.i) {
            this.f11396h = (this.f11396h == null ? new AudioFocusRequest.Builder(this.f11394f) : new AudioFocusRequest.Builder(this.f11396h)).setAudioAttributes(((d) com.applovin.exoplayer2.l.a.b(this.f11392d)).a()).setWillPauseWhenDucked(i()).setOnAudioFocusChangeListener(this.f11390b).build();
            this.i = false;
        }
        return this.f11389a.requestAudioFocus(this.f11396h);
    }

    private void g() {
        this.f11389a.abandonAudioFocus(this.f11390b);
    }

    private void h() {
        AudioFocusRequest audioFocusRequest = this.f11396h;
        if (audioFocusRequest != null) {
            this.f11389a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private boolean i() {
        d dVar = this.f11392d;
        return dVar != null && dVar.f11213b == 1;
    }

    public float a() {
        return this.f11395g;
    }

    public int a(boolean z, int i2) {
        if (a(i2)) {
            d();
            return z ? 1 : -1;
        } else if (z) {
            return c();
        } else {
            return -1;
        }
    }

    public void a(d dVar) {
        if (!ai.a((Object) this.f11392d, (Object) dVar)) {
            this.f11392d = dVar;
            int b2 = b(dVar);
            this.f11394f = b2;
            boolean z = true;
            if (!(b2 == 1 || b2 == 0)) {
                z = false;
            }
            com.applovin.exoplayer2.l.a.a(z, (Object) "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public void b() {
        this.f11391c = null;
        d();
    }
}

package com.applovin.exoplayer2.g;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.as;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.e;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import com.applovin.exoplayer2.w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class f extends e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final c f12658a;

    /* renamed from: b  reason: collision with root package name */
    private final e f12659b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f12660c;

    /* renamed from: d  reason: collision with root package name */
    private final d f12661d;

    /* renamed from: e  reason: collision with root package name */
    private b f12662e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12663f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f12664g;

    /* renamed from: h  reason: collision with root package name */
    private long f12665h;
    private long i;
    private a j;

    public f(e eVar, Looper looper) {
        this(eVar, looper, c.f12591a);
    }

    public f(e eVar, Looper looper, c cVar) {
        super(5);
        this.f12659b = (e) a.b(eVar);
        this.f12660c = looper == null ? null : ai.a(looper, (Handler.Callback) this);
        this.f12658a = (c) a.b(cVar);
        this.f12661d = new d();
        this.i = -9223372036854775807L;
    }

    private void B() {
        if (!this.f12663f && this.j == null) {
            this.f12661d.a();
            w t = t();
            int a2 = a(t, (g) this.f12661d, 0);
            if (a2 == -4) {
                if (this.f12661d.c()) {
                    this.f12663f = true;
                    return;
                }
                this.f12661d.f12602f = this.f12665h;
                this.f12661d.h();
                a a3 = ((b) ai.a(this.f12662e)).a(this.f12661d);
                if (a3 != null) {
                    ArrayList arrayList = new ArrayList(a3.a());
                    a(a3, (List<a.C0122a>) arrayList);
                    if (!arrayList.isEmpty()) {
                        this.j = new a((List<? extends a.C0122a>) arrayList);
                        this.i = this.f12661d.f11421d;
                    }
                }
            } else if (a2 == -5) {
                this.f12665h = ((v) com.applovin.exoplayer2.l.a.b(t.f13939b)).p;
            }
        }
    }

    private void a(a aVar) {
        Handler handler = this.f12660c;
        if (handler != null) {
            handler.obtainMessage(0, aVar).sendToTarget();
        } else {
            b(aVar);
        }
    }

    private void a(a aVar, List<a.C0122a> list) {
        for (int i2 = 0; i2 < aVar.a(); i2++) {
            v a2 = aVar.a(i2).a();
            if (a2 == null || !this.f12658a.a(a2)) {
                list.add(aVar.a(i2));
            } else {
                b b2 = this.f12658a.b(a2);
                byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar.a(i2).b());
                this.f12661d.a();
                this.f12661d.f(bArr.length);
                ((ByteBuffer) ai.a(this.f12661d.f11419b)).put(bArr);
                this.f12661d.h();
                a a3 = b2.a(this.f12661d);
                if (a3 != null) {
                    a(a3, list);
                }
            }
        }
    }

    private void b(a aVar) {
        this.f12659b.a(aVar);
    }

    private boolean c(long j2) {
        boolean z;
        a aVar = this.j;
        if (aVar == null || this.i > j2) {
            z = false;
        } else {
            a(aVar);
            this.j = null;
            this.i = -9223372036854775807L;
            z = true;
        }
        if (this.f12663f && this.j == null) {
            this.f12664g = true;
        }
        return z;
    }

    public boolean A() {
        return this.f12664g;
    }

    public int a(v vVar) {
        if (!this.f12658a.a(vVar)) {
            return as.CC.b(0);
        }
        return as.CC.b(vVar.E == 0 ? 4 : 2);
    }

    public void a(long j2, long j3) {
        boolean z = true;
        while (z) {
            B();
            z = c(j2);
        }
    }

    /* access modifiers changed from: protected */
    public void a(long j2, boolean z) {
        this.j = null;
        this.i = -9223372036854775807L;
        this.f12663f = false;
        this.f12664g = false;
    }

    /* access modifiers changed from: protected */
    public void a(v[] vVarArr, long j2, long j3) {
        this.f12662e = this.f12658a.b(vVarArr[0]);
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((a) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void r() {
        this.j = null;
        this.i = -9223372036854775807L;
        this.f12662e = null;
    }

    public String y() {
        return "MetadataRenderer";
    }

    public boolean z() {
        return true;
    }
}

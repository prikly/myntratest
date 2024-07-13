package com.applovin.exoplayer2.k;

import android.net.Uri;
import com.applovin.exoplayer2.l.a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class z implements i {

    /* renamed from: a  reason: collision with root package name */
    private final i f13493a;

    /* renamed from: b  reason: collision with root package name */
    private long f13494b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f13495c = Uri.EMPTY;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, List<String>> f13496d = Collections.emptyMap();

    public z(i iVar) {
        this.f13493a = (i) a.b(iVar);
    }

    public int a(byte[] bArr, int i, int i2) throws IOException {
        int a2 = this.f13493a.a(bArr, i, i2);
        if (a2 != -1) {
            this.f13494b += (long) a2;
        }
        return a2;
    }

    public long a(l lVar) throws IOException {
        this.f13495c = lVar.f13370a;
        this.f13496d = Collections.emptyMap();
        long a2 = this.f13493a.a(lVar);
        this.f13495c = (Uri) a.b(a());
        this.f13496d = b();
        return a2;
    }

    public Uri a() {
        return this.f13493a.a();
    }

    public void a(aa aaVar) {
        a.b(aaVar);
        this.f13493a.a(aaVar);
    }

    public Map<String, List<String>> b() {
        return this.f13493a.b();
    }

    public void c() throws IOException {
        this.f13493a.c();
    }

    public long d() {
        return this.f13494b;
    }

    public Uri e() {
        return this.f13495c;
    }

    public Map<String, List<String>> f() {
        return this.f13496d;
    }
}

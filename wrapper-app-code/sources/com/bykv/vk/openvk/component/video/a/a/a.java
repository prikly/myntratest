package com.bykv.vk.openvk.component.video.a.a;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.a.a.a.b;
import com.bykv.vk.openvk.component.video.api.c.c;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SdkMediaDataSource */
public class a extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, a> f17907a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private b f17908b = null;

    /* renamed from: c  reason: collision with root package name */
    private long f17909c = -2147483648L;

    /* renamed from: d  reason: collision with root package name */
    private Context f17910d;

    /* renamed from: e  reason: collision with root package name */
    private final c f17911e;

    public a(Context context, c cVar) {
        this.f17910d = context;
        this.f17911e = cVar;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        b();
        int a2 = this.f17908b.a(j, bArr, i, i2);
        com.bykv.vk.openvk.component.video.api.f.c.b("SdkMediaDataSource", "readAt: position = " + j + "  buffer.length =" + bArr.length + "  offset = " + i + " size =" + a2 + "  current = " + Thread.currentThread());
        return a2;
    }

    private void b() {
        if (this.f17908b == null) {
            this.f17908b = new com.bykv.vk.openvk.component.video.a.a.a.c(this.f17910d, this.f17911e);
        }
    }

    public long getSize() throws IOException {
        b();
        if (this.f17909c == -2147483648L) {
            if (this.f17910d == null || TextUtils.isEmpty(this.f17911e.j())) {
                return -1;
            }
            this.f17909c = this.f17908b.b();
            com.bykv.vk.openvk.component.video.api.f.c.b("SdkMediaDataSource", "getSize: " + this.f17909c);
        }
        return this.f17909c;
    }

    public void close() throws IOException {
        com.bykv.vk.openvk.component.video.api.f.c.b("SdkMediaDataSource", "close: ", this.f17911e.j());
        b bVar = this.f17908b;
        if (bVar != null) {
            bVar.a();
        }
        f17907a.remove(this.f17911e.k());
    }

    public c a() {
        return this.f17911e;
    }

    public static a a(Context context, c cVar) {
        a aVar = new a(context, cVar);
        f17907a.put(cVar.k(), aVar);
        return aVar;
    }
}

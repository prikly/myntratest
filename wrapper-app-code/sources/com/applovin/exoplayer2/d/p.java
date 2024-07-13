package com.applovin.exoplayer2.d;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.k.k;
import com.applovin.exoplayer2.k.l;
import com.applovin.exoplayer2.k.t;
import com.applovin.exoplayer2.k.z;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class p implements r {

    /* renamed from: a  reason: collision with root package name */
    private final t.b f11786a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11787b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f11788c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f11789d;

    public p(String str, boolean z, t.b bVar) {
        a.a(!z || !TextUtils.isEmpty(str));
        this.f11786a = bVar;
        this.f11787b = str;
        this.f11788c = z;
        this.f11789d = new HashMap();
    }

    private static String a(t.e eVar, int i) {
        Map<String, List<String>> map;
        List list;
        if (((eVar.f13445d == 307 || eVar.f13445d == 308) && i < 5) && (map = eVar.f13447f) != null && (list = map.get(LogConstants.EVENT_LOCATION)) != null && !list.isEmpty()) {
            return (String) list.get(0);
        }
        return null;
    }

    private static byte[] a(t.b bVar, String str, byte[] bArr, Map<String, String> map) throws s {
        k kVar;
        z zVar = new z(bVar.c());
        l a2 = new l.a().a(str).a(map).a(2).a(bArr).b(1).a();
        int i = 0;
        l lVar = a2;
        while (true) {
            try {
                kVar = new k(zVar, lVar);
                byte[] a3 = ai.a((InputStream) kVar);
                ai.a((Closeable) kVar);
                return a3;
            } catch (t.e e2) {
                String a4 = a(e2, i);
                if (a4 != null) {
                    i++;
                    lVar = lVar.b().a(a4).a();
                    ai.a((Closeable) kVar);
                } else {
                    throw e2;
                }
            } catch (Exception e3) {
                throw new s(a2, (Uri) a.b(zVar.e()), zVar.b(), zVar.d(), e3);
            } catch (Throwable th) {
                ai.a((Closeable) kVar);
                throw th;
            }
        }
    }

    public void a(String str, String str2) {
        a.b(str);
        a.b(str2);
        synchronized (this.f11789d) {
            this.f11789d.put(str, str2);
        }
    }

    public byte[] a(UUID uuid, m.a aVar) throws s {
        String b2 = aVar.b();
        if (this.f11788c || TextUtils.isEmpty(b2)) {
            b2 = this.f11787b;
        }
        if (!TextUtils.isEmpty(b2)) {
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", h.f12716e.equals(uuid) ? "text/xml" : h.f12714c.equals(uuid) ? "application/json" : "application/octet-stream");
            if (h.f12716e.equals(uuid)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (this.f11789d) {
                hashMap.putAll(this.f11789d);
            }
            return a(this.f11786a, b2, aVar.a(), hashMap);
        }
        throw new s(new l.a().a(Uri.EMPTY).a(), Uri.EMPTY, u.a(), 0, new IllegalStateException("No license URL"));
    }

    public byte[] a(UUID uuid, m.d dVar) throws s {
        return a(this.f11786a, dVar.b() + "&signedRequest=" + ai.a(dVar.a()), (byte[]) null, Collections.emptyMap());
    }
}

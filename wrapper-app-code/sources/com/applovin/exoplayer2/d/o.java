package com.applovin.exoplayer2.d;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.d.m;
import com.applovin.exoplayer2.h;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class o implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final m.c f11782a = $$Lambda$o$XVYXmOdxA2_o_KZZ58SbICq1sI.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final UUID f11783b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaDrm f11784c;

    /* renamed from: d  reason: collision with root package name */
    private int f11785d = 1;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }
    }

    private o(UUID uuid) throws UnsupportedSchemeException {
        com.applovin.exoplayer2.l.a.b(uuid);
        com.applovin.exoplayer2.l.a.a(!h.f12713b.equals(uuid), (Object) "Use C.CLEARKEY_UUID instead");
        this.f11783b = uuid;
        this.f11784c = new MediaDrm(b(uuid));
        if (h.f12715d.equals(uuid) && e()) {
            a(this.f11784c);
        }
    }

    private static e.a a(UUID uuid, List<e.a> list) {
        boolean z;
        if (h.f12715d.equals(uuid)) {
            if (ai.f13525a >= 28 && list.size() > 1) {
                e.a aVar = list.get(0);
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    }
                    e.a aVar2 = list.get(i);
                    byte[] bArr = (byte[]) com.applovin.exoplayer2.l.a.b(aVar2.f11761d);
                    if (!ai.a((Object) aVar2.f11760c, (Object) aVar.f11760c) || !ai.a((Object) aVar2.f11759b, (Object) aVar.f11759b) || !com.applovin.exoplayer2.e.g.h.a(bArr)) {
                        z = false;
                    } else {
                        i2 += bArr.length;
                        i++;
                    }
                }
                z = false;
                if (z) {
                    byte[] bArr2 = new byte[i2];
                    int i3 = 0;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        byte[] bArr3 = (byte[]) com.applovin.exoplayer2.l.a.b(list.get(i4).f11761d);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i3, length);
                        i3 += length;
                    }
                    return aVar.a(bArr2);
                }
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                e.a aVar3 = list.get(i5);
                int c2 = com.applovin.exoplayer2.e.g.h.c((byte[]) com.applovin.exoplayer2.l.a.b(aVar3.f11761d));
                if (ai.f13525a < 23 && c2 == 0) {
                    return aVar3;
                }
                if (ai.f13525a >= 23 && c2 == 1) {
                    return aVar3;
                }
            }
        }
        return list.get(0);
    }

    public static o a(UUID uuid) throws t {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e2) {
            throw new t(1, e2);
        } catch (Exception e3) {
            throw new t(2, e3);
        }
    }

    private static String a(UUID uuid, String str) {
        return (ai.f13525a >= 26 || !h.f12714c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    private static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
        bVar.a(this, bArr, i, i2, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r2 = com.applovin.exoplayer2.e.g.h.a(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(java.util.UUID r2, byte[] r3) {
        /*
            java.util.UUID r0 = com.applovin.exoplayer2.h.f12716e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x001a
            byte[] r0 = com.applovin.exoplayer2.e.g.h.a((byte[]) r3, (java.util.UUID) r2)
            if (r0 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            java.util.UUID r0 = com.applovin.exoplayer2.h.f12716e
            byte[] r3 = f(r3)
            byte[] r3 = com.applovin.exoplayer2.e.g.h.a((java.util.UUID) r0, (byte[]) r3)
        L_0x001a:
            int r0 = com.applovin.exoplayer2.l.ai.f13525a
            r1 = 23
            if (r0 >= r1) goto L_0x0028
            java.util.UUID r0 = com.applovin.exoplayer2.h.f12715d
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0062
        L_0x0028:
            java.util.UUID r0 = com.applovin.exoplayer2.h.f12716e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13527c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r1 = "AFTS"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r1 = "AFTM"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = com.applovin.exoplayer2.l.ai.f13528d
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0069
        L_0x0062:
            byte[] r2 = com.applovin.exoplayer2.e.g.h.a((byte[]) r3, (java.util.UUID) r2)
            if (r2 == 0) goto L_0x0069
            return r2
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.d.o.a(java.util.UUID, byte[]):byte[]");
    }

    private static UUID b(UUID uuid) {
        return (ai.f13525a >= 27 || !h.f12714c.equals(uuid)) ? uuid : h.f12713b;
    }

    private static byte[] b(UUID uuid, byte[] bArr) {
        return h.f12714c.equals(uuid) ? a.a(bArr) : bArr;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ m c(UUID uuid) {
        try {
            return a(uuid);
        } catch (t unused) {
            q.d("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    private static boolean e() {
        return "ASUS_Z00AD".equals(ai.f13528d);
    }

    private static byte[] f(byte[] bArr) {
        y yVar = new y(bArr);
        int r = yVar.r();
        short l = yVar.l();
        short l2 = yVar.l();
        if (l == 1 && l2 == 1) {
            String a2 = yVar.a((int) yVar.l(), Charsets.UTF_16LE);
            if (a2.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = a2.indexOf("</DATA>");
            if (indexOf == -1) {
                q.c("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String str = a2.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + a2.substring(indexOf);
            int i = r + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i);
            allocate.putShort((short) l);
            allocate.putShort((short) l2);
            allocate.putShort((short) (str.length() * 2));
            allocate.put(str.getBytes(Charsets.UTF_16LE));
            return allocate.array();
        }
        q.b("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    public m.a a(byte[] bArr, List<e.a> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException {
        String str;
        byte[] bArr2;
        e.a aVar = null;
        if (list != null) {
            aVar = a(this.f11783b, list);
            bArr2 = a(this.f11783b, (byte[]) com.applovin.exoplayer2.l.a.b(aVar.f11761d));
            str = a(this.f11783b, aVar.f11760c);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f11784c.getKeyRequest(bArr, bArr2, str, i, hashMap);
        byte[] b2 = b(this.f11783b, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && aVar != null && !TextUtils.isEmpty(aVar.f11759b)) {
            defaultUrl = aVar.f11759b;
        }
        return new m.a(b2, defaultUrl, ai.f13525a >= 23 ? keyRequest.getRequestType() : RecyclerView.UNDEFINED_DURATION);
    }

    public String a(String str) {
        return this.f11784c.getPropertyString(str);
    }

    public void a(m.b bVar) {
        this.f11784c.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener(bVar) {
            public final /* synthetic */ m.b f$1;

            {
                this.f$1 = r2;
            }

            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                o.this.a(this.f$1, mediaDrm, bArr, i, i2, bArr2);
            }
        });
    }

    public void a(byte[] bArr) {
        this.f11784c.closeSession(bArr);
    }

    public boolean a(byte[] bArr, String str) {
        if (ai.f13525a >= 31) {
            return a.a(this.f11784c, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f11783b, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public byte[] a() throws MediaDrmException {
        return this.f11784c.openSession();
    }

    public byte[] a(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        if (h.f12714c.equals(this.f11783b)) {
            bArr2 = a.b(bArr2);
        }
        return this.f11784c.provideKeyResponse(bArr, bArr2);
    }

    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f11784c.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public void b(byte[] bArr) throws DeniedByServerException {
        this.f11784c.provideProvisionResponse(bArr);
    }

    public void b(byte[] bArr, byte[] bArr2) {
        this.f11784c.restoreKeys(bArr, bArr2);
    }

    public Map<String, String> c(byte[] bArr) {
        return this.f11784c.queryKeyStatus(bArr);
    }

    public synchronized void c() {
        int i = this.f11785d - 1;
        this.f11785d = i;
        if (i == 0) {
            this.f11784c.release();
        }
    }

    public int d() {
        return 2;
    }

    /* renamed from: e */
    public n d(byte[] bArr) throws MediaCryptoException {
        return new n(b(this.f11783b), bArr, ai.f13525a < 21 && h.f12715d.equals(this.f11783b) && "L3".equals(a("securityLevel")));
    }
}

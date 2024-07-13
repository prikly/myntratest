package com.bykv.vk.openvk.component.video.a.b;

import android.util.Log;
import com.bykv.vk.openvk.component.video.a.b.c.d;
import com.bykv.vk.openvk.component.video.a.b.h;
import com.bykv.vk.openvk.component.video.a.b.i;
import com.bykv.vk.openvk.component.video.a.b.l;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* compiled from: ProxyTask */
class g extends a {
    private final Socket m;
    private final c n;
    /* access modifiers changed from: private */
    public final d o;
    private volatile b p;
    private volatile boolean q = true;

    /* compiled from: ProxyTask */
    public interface c {
        void a(g gVar);

        void b(g gVar);
    }

    private void a(boolean z, int i, int i2, int i3, int i4) {
    }

    g(a aVar) {
        super(aVar.f18066a, aVar.f18067b);
        this.m = aVar.f18068c;
        this.n = aVar.f18069d;
        this.o = d.c();
    }

    private b h() {
        try {
            this.i = i.a(this.m.getInputStream());
            OutputStream outputStream = this.m.getOutputStream();
            com.bykv.vk.openvk.component.video.a.b.a.a aVar = this.i.f18076c.f18077a == 1 ? e.f18015a : e.f18016b;
            if (aVar == null) {
                if (e.f18017c) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.f17939a = aVar;
            this.f17945g = this.i.f18076c.f18078b;
            this.f17946h = this.i.f18076c.f18079c;
            this.j = new l(this.i.f18076c.f18083g);
            this.f17944f = this.i.f18075b;
            if (e.f18017c) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.i.toString());
            }
            return new b(outputStream, this.i.f18076c.f18080d);
        } catch (IOException e2) {
            com.bykv.vk.openvk.component.video.a.c.a.a(this.m);
            if (e.f18017c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
            }
            a(this.f17939a == null ? null : Boolean.valueOf(g()), this.f17945g, e2);
            return null;
        } catch (i.d e3) {
            com.bykv.vk.openvk.component.video.a.c.a.a(this.m);
            if (e.f18017c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e3));
            }
            a(this.f17939a == null ? null : Boolean.valueOf(g()), this.f17945g, e3);
            return null;
        }
    }

    public void run() {
        com.bykv.vk.openvk.component.video.a.b.b.a a2;
        b h2 = h();
        if (h2 != null) {
            c cVar = this.n;
            if (cVar != null) {
                cVar.a(this);
            }
            this.f17939a.a(this.f17946h);
            if (e.f18022h != 0 && ((a2 = this.f17940b.a(this.f17946h, this.i.f18076c.f18077a)) == null || this.f17939a.c(this.f17946h).length() < ((long) a2.f17977c))) {
                this.o.a(g(), this.f17946h);
            }
            try {
                a(h2);
            } catch (com.bykv.vk.openvk.component.video.a.b.c.a e2) {
                if (e.f18017c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
                }
            } catch (Throwable th) {
                if (e.f18017c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
                }
            }
            this.f17939a.b(this.f17946h);
            this.o.a(g(), (String) null);
            a();
            com.bykv.vk.openvk.component.video.a.c.a.a(this.m);
            c cVar2 = this.n;
            if (cVar2 != null) {
                cVar2.b(this);
            }
        }
    }

    private boolean a(b bVar) throws com.bykv.vk.openvk.component.video.a.b.c.a {
        while (this.j.a()) {
            e();
            l.a b2 = this.j.b();
            try {
                a(bVar, b2);
                return true;
            } catch (com.bykv.vk.openvk.component.video.a.b.c.c e2) {
                b2.a();
                a(Boolean.valueOf(g()), this.f17945g, e2);
            } catch (IOException e3) {
                if (e3 instanceof SocketTimeoutException) {
                    b2.b();
                }
                if (!b()) {
                    a(Boolean.valueOf(g()), this.f17945g, e3);
                } else if (e.f18017c) {
                    if ("Canceled".equalsIgnoreCase(e3.getMessage())) {
                        Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                    } else {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e3));
                    }
                }
            } catch (d e4) {
                if (e.f18017c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
                }
                return true;
            } catch (h.a e5) {
                if (e.f18017c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e5));
                }
                this.q = false;
                a(Boolean.valueOf(g()), this.f17945g, e5);
            } catch (com.bykv.vk.openvk.component.video.a.b.c.b e6) {
                if (e.f18017c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e6));
                }
                return false;
            } catch (Exception e7) {
                if (e.f18017c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e7));
                }
            }
        }
        return false;
    }

    private void a(b bVar, l.a aVar) throws d, IOException, h.a, com.bykv.vk.openvk.component.video.a.b.c.a, com.bykv.vk.openvk.component.video.a.b.c.b {
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(this.i.f18074a.f18086a)) {
            b(bVar, aVar);
        } else {
            c(bVar, aVar);
        }
    }

    private void b(b bVar, l.a aVar) throws IOException, d {
        byte[] a2 = a(this.f17940b.a(this.f17946h, this.i.f18076c.f18077a), bVar, aVar);
        if (a2 != null) {
            bVar.a(a2, 0, a2.length);
        }
    }

    private void c(b bVar, l.a aVar) throws h.a, d, IOException, com.bykv.vk.openvk.component.video.a.b.c.a, com.bykv.vk.openvk.component.video.a.b.c.b {
        int i;
        if (this.q) {
            File c2 = this.f17939a.c(this.f17946h);
            long length = c2.length();
            com.bykv.vk.openvk.component.video.a.b.b.a a2 = this.f17940b.a(this.f17946h, this.i.f18076c.f18077a);
            int b2 = bVar.b();
            long j = length - ((long) b2);
            int i2 = (int) j;
            if (a2 == null) {
                i = -1;
            } else {
                i = a2.f17977c;
            }
            if (length > ((long) bVar.b())) {
                if (e.f18017c) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + j);
                }
                a(true, i2, i, (int) length, b2);
                a(a2, c2, bVar, aVar);
                return;
            }
            a(false, i2, i, (int) length, b2);
        } else {
            a(false, 0, 0, 0, bVar.b());
        }
        d(bVar, aVar);
    }

    private byte[] a(com.bykv.vk.openvk.component.video.a.b.b.a aVar, b bVar, l.a aVar2) throws IOException {
        if (aVar != null) {
            if (e.f18017c) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return com.bykv.vk.openvk.component.video.a.c.a.a(aVar, bVar.b()).getBytes(com.bykv.vk.openvk.component.video.a.c.a.f18103a);
        }
        com.bykv.vk.openvk.component.video.a.b.e.a a2 = a(aVar2, 0, -1, VersionInfo.GIT_BRANCH);
        if (a2 == null) {
            return null;
        }
        try {
            String a3 = com.bykv.vk.openvk.component.video.a.c.a.a(a2, false, false);
            if (a3 == null) {
                com.bykv.vk.openvk.component.video.a.b.b.a a4 = com.bykv.vk.openvk.component.video.a.c.a.a(a2, this.f17940b, this.f17946h, this.i.f18076c.f18077a);
                if (e.f18017c) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                return com.bykv.vk.openvk.component.video.a.c.a.a(a4, bVar.b()).getBytes(com.bykv.vk.openvk.component.video.a.c.a.f18103a);
            }
            throw new com.bykv.vk.openvk.component.video.a.b.c.c(a3 + ", rawKey: " + this.f17945g + ", url: " + aVar2);
        } finally {
            com.bykv.vk.openvk.component.video.a.c.a.a((Closeable) a2.d());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cd A[SYNTHETIC, Splitter:B:92:0x01cd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.bykv.vk.openvk.component.video.a.b.b.a r8, java.io.File r9, com.bykv.vk.openvk.component.video.a.b.g.b r10, com.bykv.vk.openvk.component.video.a.b.l.a r11) throws java.io.IOException, com.bykv.vk.openvk.component.video.a.b.c.d, com.bykv.vk.openvk.component.video.a.b.h.a, com.bykv.vk.openvk.component.video.a.b.c.a, com.bykv.vk.openvk.component.video.a.b.c.b {
        /*
            r7 = this;
            boolean r0 = r10.a()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            byte[] r0 = r7.a(r8, r10, r11)
            r7.e()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r2 = r0.length
            r10.a(r0, r1, r2)
        L_0x0015:
            r0 = 0
            if (r8 != 0) goto L_0x0068
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f17940b
            java.lang.String r2 = r7.f17946h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f18076c
            int r3 = r3.f18077a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.a((java.lang.String) r2, (int) r3)
            if (r8 != 0) goto L_0x0068
            boolean r8 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r8 == 0) goto L_0x0033
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info from db"
            android.util.Log.e(r8, r2)
        L_0x0033:
            r7.a(r0, r10, r11)
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f17940b
            java.lang.String r2 = r7.f17946h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f18076c
            int r3 = r3.f18077a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.a((java.lang.String) r2, (int) r3)
            if (r8 == 0) goto L_0x0047
            goto L_0x0068
        L_0x0047:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "failed to get header, rawKey: "
            r9.append(r10)
            java.lang.String r10 = r7.f17945g
            r9.append(r10)
            java.lang.String r10 = ", url: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0068:
            long r2 = r9.length()
            int r4 = r8.f17977c
            long r4 = (long) r4
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e4
            com.bykv.vk.openvk.component.video.a.b.b r2 = r7.p
            if (r2 == 0) goto L_0x0083
            boolean r3 = r2.b()
            if (r3 != 0) goto L_0x0083
            boolean r2 = r2.d()
            if (r2 == 0) goto L_0x00e4
        L_0x0083:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a
            r2.<init>()
            com.bykv.vk.openvk.component.video.a.b.a.a r3 = r7.f17939a
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.a.a) r3)
            com.bykv.vk.openvk.component.video.a.b.b.c r3 = r7.f17940b
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.b.c) r3)
            java.lang.String r3 = r7.f17945g
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((java.lang.String) r3)
            java.lang.String r3 = r7.f17946h
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.b(r3)
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l
            java.lang.String r4 = r11.f18100a
            r3.<init>((java.lang.String) r4)
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.l) r3)
            java.util.List r3 = r7.f17944f
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((java.util.List<com.bykv.vk.openvk.component.video.a.b.i.b>) r3)
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.i
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.i) r3)
            com.bykv.vk.openvk.component.video.a.b.g$1 r3 = new com.bykv.vk.openvk.component.video.a.b.g$1
            r3.<init>()
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.a((com.bykv.vk.openvk.component.video.a.b.b.C0215b) r3)
            com.bykv.vk.openvk.component.video.a.b.b r2 = r2.a()
            r7.p = r2
            com.bytedance.sdk.component.f.f r3 = new com.bytedance.sdk.component.f.f
            r4 = 10
            r5 = 1
            r3.<init>(r2, r0, r4, r5)
            com.bykv.vk.openvk.component.video.a.b.g$2 r2 = new com.bykv.vk.openvk.component.video.a.b.g$2
            java.lang.String r4 = "processCacheNetWorkConcurrent"
            r2.<init>(r4, r3)
            com.bytedance.sdk.component.f.e.a((com.bytedance.sdk.component.f.g) r2)
            boolean r2 = com.bykv.vk.openvk.component.video.a.b.e.f18017c
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.String r4 = "fire download in process cache task"
            android.util.Log.e(r2, r4)
            goto L_0x00e5
        L_0x00e4:
            r3 = r0
        L_0x00e5:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "r"
            r4.<init>(r9, r5)     // Catch:{ all -> 0x01c5 }
            int r9 = r10.b()     // Catch:{ all -> 0x01c2 }
            long r5 = (long) r9     // Catch:{ all -> 0x01c2 }
            r4.a((long) r5)     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f18076c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f18081e     // Catch:{ all -> 0x01c2 }
            if (r9 <= 0) goto L_0x010d
            int r8 = r8.f17977c     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f18076c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f18081e     // Catch:{ all -> 0x01c2 }
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x010d:
            int r8 = r8.f17977c     // Catch:{ all -> 0x01c2 }
        L_0x010f:
            int r9 = r10.b()     // Catch:{ all -> 0x01c2 }
            if (r9 >= r8) goto L_0x018b
            r7.e()     // Catch:{ all -> 0x01c2 }
            int r9 = r4.a((byte[]) r2)     // Catch:{ all -> 0x01c2 }
            if (r9 > 0) goto L_0x0184
            com.bykv.vk.openvk.component.video.a.b.b r9 = r7.p     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x0131
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = r9.i()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0130
            com.bykv.vk.openvk.component.video.a.b.h$a r0 = r9.h()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0130:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0131:
            if (r9 == 0) goto L_0x0158
            boolean r0 = r9.b()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0158
            boolean r0 = r9.d()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0140
            goto L_0x0158
        L_0x0140:
            r7.e()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r9.m     // Catch:{ all -> 0x01c2 }
            monitor-enter(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Object r9 = r9.m     // Catch:{ InterruptedException -> 0x0150 }
            r5 = 1000(0x3e8, double:4.94E-321)
            r9.wait(r5)     // Catch:{ InterruptedException -> 0x0150 }
            goto L_0x0154
        L_0x014e:
            r8 = move-exception
            goto L_0x0156
        L_0x0150:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x014e }
        L_0x0154:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            goto L_0x0187
        L_0x0156:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0158:
            boolean r8 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01c2 }
            if (r8 == 0) goto L_0x0163
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r9 = "download task has finished!!!"
            android.util.Log.e(r8, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0163:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r9.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = "illegal state download task has finished, rawKey: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = r7.f17945g     // Catch:{ all -> 0x01c2 }
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", url: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            r9.append(r11)     // Catch:{ all -> 0x01c2 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01c2 }
            r8.<init>(r9)     // Catch:{ all -> 0x01c2 }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0184:
            r10.b(r2, r1, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0187:
            r7.e()     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x018b:
            boolean r9 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x01b1
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r11.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "read cache file complete: "
            r11.append(r0)     // Catch:{ all -> 0x01c2 }
            int r10 = r10.b()     // Catch:{ all -> 0x01c2 }
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", "
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            r11.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x01c2 }
            android.util.Log.i(r9, r8)     // Catch:{ all -> 0x01c2 }
        L_0x01b1:
            r7.c()     // Catch:{ all -> 0x01c2 }
            r4.a()
            if (r3 == 0) goto L_0x01c1
            r3.get()     // Catch:{ all -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r8 = move-exception
            r8.printStackTrace()
        L_0x01c1:
            return
        L_0x01c2:
            r8 = move-exception
            r0 = r4
            goto L_0x01c6
        L_0x01c5:
            r8 = move-exception
        L_0x01c6:
            if (r0 == 0) goto L_0x01cb
            r0.a()
        L_0x01cb:
            if (r3 == 0) goto L_0x01d5
            r3.get()     // Catch:{ all -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r9 = move-exception
            r9.printStackTrace()
        L_0x01d5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.g.a(com.bykv.vk.openvk.component.video.a.b.b.a, java.io.File, com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ad A[EDGE_INSN: B:100:0x01ad->B:77:0x01ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104 A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015c A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015e A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b1 A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0208  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(com.bykv.vk.openvk.component.video.a.b.g.b r13, com.bykv.vk.openvk.component.video.a.b.l.a r14) throws com.bykv.vk.openvk.component.video.a.b.c.d, java.io.IOException, com.bykv.vk.openvk.component.video.a.b.c.a, com.bykv.vk.openvk.component.video.a.b.c.b {
        /*
            r12 = this;
            r12.i()
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r13.b()
            com.bykv.vk.openvk.component.video.a.b.i r3 = r12.i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f18076c
            int r3 = r3.f18081e
            java.lang.String r4 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r3 = r12.a(r14, r2, r3, r4)
            if (r3 != 0) goto L_0x001a
            return
        L_0x001a:
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r4 = com.bykv.vk.openvk.component.video.a.c.a.a(r3, r6, r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", rawKey: "
            if (r4 != 0) goto L_0x01dc
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f17940b     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r12.f17946h     // Catch:{ all -> 0x01fe }
            int r9 = r12.f()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.a((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x01fe }
            int r8 = com.bykv.vk.openvk.component.video.a.c.a.a((com.bykv.vk.openvk.component.video.a.b.e.a) r3)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            if (r4 == 0) goto L_0x00a4
            int r10 = r4.f17977c     // Catch:{ all -> 0x01fe }
            if (r10 == r8) goto L_0x00a4
            boolean r13 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01fe }
            if (r13 == 0) goto L_0x0069
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r13.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "Content-Length not match, old: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r4.f17977c     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            r13.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", key: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f17946h     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.e(r9, r13)     // Catch:{ all -> 0x01fe }
        L_0x0069:
            com.bykv.vk.openvk.component.video.a.b.c.b r13 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "Content-Length not match, old length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            int r9 = r4.f17977c     // Catch:{ all -> 0x01fe }
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = ", new length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            r2.append(r8)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f17945g     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", currentUrl: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = ", previousInfo: "
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r4.f17979e     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x00a4:
            boolean r14 = r13.a()     // Catch:{ all -> 0x01fe }
            if (r14 != 0) goto L_0x00bb
            java.lang.String r14 = com.bykv.vk.openvk.component.video.a.c.a.a((com.bykv.vk.openvk.component.video.a.b.e.a) r3, (int) r2)     // Catch:{ all -> 0x01fe }
            r12.e()     // Catch:{ all -> 0x01fe }
            java.nio.charset.Charset r2 = com.bykv.vk.openvk.component.video.a.c.a.f18103a     // Catch:{ all -> 0x01fe }
            byte[] r14 = r14.getBytes(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r14.length     // Catch:{ all -> 0x01fe }
            r13.a(r14, r6, r2)     // Catch:{ all -> 0x01fe }
        L_0x00bb:
            r12.e()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.a.a r14 = r12.f17939a     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f17946h     // Catch:{ all -> 0x01fe }
            java.io.File r14 = r14.d(r2)     // Catch:{ all -> 0x01fe }
            boolean r2 = r12.q     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", from: "
            if (r2 == 0) goto L_0x0127
            if (r14 == 0) goto L_0x0127
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            int r2 = r13.b()     // Catch:{ all -> 0x01fe }
            long r10 = (long) r2     // Catch:{ all -> 0x01fe }
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0127
            com.bykv.vk.openvk.component.video.a.b.b.c r2 = r12.f17940b     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f17946h     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i r8 = r12.i     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i$a r8 = r8.f18076c     // Catch:{ all -> 0x01fe }
            int r8 = r8.f18077a     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.c.a.a(r3, r2, r7, r8)     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.h r2 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ a -> 0x00fa }
            java.lang.String r7 = "rwd"
            r2.<init>(r14, r7)     // Catch:{ a -> 0x00fa }
            int r7 = r13.b()     // Catch:{ a -> 0x00f8 }
            long r7 = (long) r7     // Catch:{ a -> 0x00f8 }
            r2.a((long) r7)     // Catch:{ a -> 0x00f8 }
            goto L_0x0100
        L_0x00f8:
            r7 = move-exception
            goto L_0x00fc
        L_0x00fa:
            r7 = move-exception
            r2 = r5
        L_0x00fc:
            r7.printStackTrace()     // Catch:{ all -> 0x01d9 }
            r2 = r5
        L_0x0100:
            boolean r7 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01d9 }
            if (r7 == 0) goto L_0x014e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r7.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r8 = "can write to cache file in network task, cache file size: "
            r7.append(r8)     // Catch:{ all -> 0x01d9 }
            long r10 = r14.length()     // Catch:{ all -> 0x01d9 }
            r7.append(r10)     // Catch:{ all -> 0x01d9 }
            r7.append(r4)     // Catch:{ all -> 0x01d9 }
            int r14 = r13.b()     // Catch:{ all -> 0x01d9 }
            r7.append(r14)     // Catch:{ all -> 0x01d9 }
            java.lang.String r14 = r7.toString()     // Catch:{ all -> 0x01d9 }
            android.util.Log.i(r9, r14)     // Catch:{ all -> 0x01d9 }
            goto L_0x014e
        L_0x0127:
            boolean r2 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01fe }
            if (r2 == 0) goto L_0x014d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = "can't write to cache file in network task, cache file size: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            int r14 = r13.b()     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.w(r9, r14)     // Catch:{ all -> 0x01fe }
        L_0x014d:
            r2 = r5
        L_0x014e:
            com.bykv.vk.openvk.component.video.a.b.b.c r14 = r12.f17940b     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = r12.f17946h     // Catch:{ all -> 0x01d9 }
            int r7 = r12.f()     // Catch:{ all -> 0x01d9 }
            com.bykv.vk.openvk.component.video.a.b.b.a r14 = r14.a((java.lang.String) r4, (int) r7)     // Catch:{ all -> 0x01d9 }
            if (r14 != 0) goto L_0x015e
            r14 = 0
            goto L_0x0160
        L_0x015e:
            int r14 = r14.f17977c     // Catch:{ all -> 0x01d9 }
        L_0x0160:
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x01d9 }
            java.io.InputStream r7 = r3.d()     // Catch:{ all -> 0x01d9 }
            r8 = 0
        L_0x0169:
            int r10 = r7.read(r4)     // Catch:{ all -> 0x01d5 }
            if (r10 < 0) goto L_0x01ad
            r12.e()     // Catch:{ all -> 0x01d5 }
            if (r10 <= 0) goto L_0x01a9
            r13.b(r4, r6, r10)     // Catch:{ all -> 0x01d5 }
            int r8 = r8 + r10
            if (r2 == 0) goto L_0x01a2
            r2.a(r4, r6, r10)     // Catch:{ all -> 0x017e }
            goto L_0x01a2
        L_0x017e:
            r10 = move-exception
            r2.a()     // Catch:{ all -> 0x01d5 }
            boolean r2 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01a0 }
            if (r2 == 0) goto L_0x019e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a0 }
            r2.<init>()     // Catch:{ all -> 0x01a0 }
            java.lang.String r11 = "append to cache file error in network task!!! "
            r2.append(r11)     // Catch:{ all -> 0x01a0 }
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch:{ all -> 0x01a0 }
            r2.append(r10)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a0 }
            android.util.Log.e(r9, r2)     // Catch:{ all -> 0x01a0 }
        L_0x019e:
            r2 = r5
            goto L_0x01a2
        L_0x01a0:
            r13 = move-exception
            goto L_0x01d7
        L_0x01a2:
            int r10 = r13.b()     // Catch:{ all -> 0x01d5 }
            r12.a(r14, r10)     // Catch:{ all -> 0x01d5 }
        L_0x01a9:
            r12.e()     // Catch:{ all -> 0x01d5 }
            goto L_0x0169
        L_0x01ad:
            boolean r13 = com.bykv.vk.openvk.component.video.a.b.e.f18017c     // Catch:{ all -> 0x01d5 }
            if (r13 == 0) goto L_0x01b6
            java.lang.String r13 = "read from net complete!"
            android.util.Log.i(r9, r13)     // Catch:{ all -> 0x01d5 }
        L_0x01b6:
            r12.c()     // Catch:{ all -> 0x01d5 }
            java.io.InputStream r13 = r3.d()
            com.bykv.vk.openvk.component.video.a.c.a.a((java.io.Closeable) r13)
            if (r2 == 0) goto L_0x01c5
            r2.a()
        L_0x01c5:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.f17941c
            r13.addAndGet(r8)
            java.util.concurrent.atomic.AtomicLong r13 = r12.f17942d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r13.addAndGet(r2)
            return
        L_0x01d5:
            r13 = move-exception
            r5 = r2
        L_0x01d7:
            r6 = r8
            goto L_0x01ff
        L_0x01d9:
            r13 = move-exception
            r5 = r2
            goto L_0x01ff
        L_0x01dc:
            com.bykv.vk.openvk.component.video.a.b.c.c r13 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = r12.f17945g     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", url: "
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r13 = move-exception
        L_0x01ff:
            java.io.InputStream r14 = r3.d()
            com.bykv.vk.openvk.component.video.a.c.a.a((java.io.Closeable) r14)
            if (r5 == 0) goto L_0x020b
            r5.a()
        L_0x020b:
            java.util.concurrent.atomic.AtomicInteger r14 = r12.f17941c
            r14.addAndGet(r6)
            java.util.concurrent.atomic.AtomicLong r14 = r12.f17942d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r14.addAndGet(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.vk.openvk.component.video.a.b.g.d(com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    public void a() {
        super.a();
        i();
    }

    private void i() {
        b bVar = this.p;
        this.p = null;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* compiled from: ProxyTask */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final OutputStream f18070a;

        /* renamed from: b  reason: collision with root package name */
        private int f18071b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f18072c;

        b(OutputStream outputStream, int i) {
            this.f18070a = outputStream;
            this.f18071b = i;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f18072c;
        }

        /* access modifiers changed from: package-private */
        public void a(byte[] bArr, int i, int i2) throws d {
            if (!this.f18072c) {
                try {
                    this.f18070a.write(bArr, i, i2);
                    this.f18072c = true;
                } catch (IOException e2) {
                    throw new d(e2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(byte[] bArr, int i, int i2) throws d {
            try {
                this.f18070a.write(bArr, i, i2);
                this.f18071b += i2;
            } catch (IOException e2) {
                throw new d(e2);
            }
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f18071b;
        }
    }

    /* compiled from: ProxyTask */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        com.bykv.vk.openvk.component.video.a.b.a.a f18066a;

        /* renamed from: b  reason: collision with root package name */
        com.bykv.vk.openvk.component.video.a.b.b.c f18067b;

        /* renamed from: c  reason: collision with root package name */
        Socket f18068c;

        /* renamed from: d  reason: collision with root package name */
        c f18069d;

        a() {
        }

        /* access modifiers changed from: package-private */
        public a a(com.bykv.vk.openvk.component.video.a.b.b.c cVar) {
            if (cVar != null) {
                this.f18067b = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        public a a(Socket socket) {
            if (socket != null) {
                this.f18068c = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        /* access modifiers changed from: package-private */
        public a a(c cVar) {
            this.f18069d = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public g a() {
            if (this.f18067b != null && this.f18068c != null) {
                return new g(this);
            }
            throw new IllegalArgumentException();
        }
    }
}

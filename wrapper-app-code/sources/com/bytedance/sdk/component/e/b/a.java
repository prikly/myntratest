package com.bytedance.sdk.component.e.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.b;
import com.bytedance.sdk.component.b.a.c;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: DownloadExecutor */
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public File f19127a;

    /* renamed from: b  reason: collision with root package name */
    public File f19128b;

    public a(i iVar) {
        super(iVar);
    }

    public void a(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f19127a = new File(str, str2);
        this.f19128b = new File(str, str2 + ".temp");
    }

    public void a(final com.bytedance.sdk.component.e.a.a aVar) {
        File file = this.f19127a;
        if (file != null && this.f19128b != null) {
            final long j = 0;
            if (!file.exists() || this.f19127a.length() == 0 || aVar == null) {
                long length = this.f19128b.length();
                if (length >= 0) {
                    j = length;
                }
                k.a aVar2 = new k.a();
                aVar2.a((Object) b());
                b("Range", "bytes=" + j + "-");
                if (TextUtils.isEmpty(this.f19142f)) {
                    aVar.a((c) this, new IOException("Url is Empty"));
                    return;
                }
                try {
                    aVar2.a(this.f19142f);
                    a(aVar2);
                    this.f19139c.a(aVar2.a().b()).a(new c() {
                        public void a(b bVar, IOException iOException) {
                            com.bytedance.sdk.component.e.a.a aVar = aVar;
                            if (aVar != null) {
                                aVar.a((c) a.this, iOException);
                            }
                            a.this.d();
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:106:0x0287 A[Catch:{ all -> 0x029d, all -> 0x02a4, all -> 0x02ab }] */
                        /* JADX WARNING: Removed duplicated region for block: B:108:0x028e A[SYNTHETIC, Splitter:B:108:0x028e] */
                        /* JADX WARNING: Removed duplicated region for block: B:129:0x01bd A[EDGE_INSN: B:129:0x01bd->B:68:0x01bd ?: BREAK  , SYNTHETIC] */
                        /* JADX WARNING: Removed duplicated region for block: B:55:0x0172 A[Catch:{ all -> 0x0265 }] */
                        /* JADX WARNING: Removed duplicated region for block: B:70:0x01c4 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:73:0x01d2 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:80:0x01f0 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:84:0x0228 A[Catch:{ all -> 0x01cf }] */
                        /* JADX WARNING: Removed duplicated region for block: B:90:0x0256 A[SYNTHETIC, Splitter:B:90:0x0256] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void a(com.bytedance.sdk.component.b.a.b r29, com.bytedance.sdk.component.b.a.m r30) throws java.io.IOException {
                            /*
                                r28 = this;
                                r1 = r28
                                java.lang.String r2 = "Error occured when calling tmpFile.close"
                                java.lang.String r3 = "Error occured when calling InputStream.close"
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                if (r0 == 0) goto L_0x02b7
                                java.util.HashMap r0 = new java.util.HashMap
                                r0.<init>()
                                if (r30 == 0) goto L_0x02b7
                                com.bytedance.sdk.component.b.a.e r4 = r30.g()
                                if (r4 == 0) goto L_0x002c
                                r5 = 0
                            L_0x0018:
                                int r6 = r4.a()
                                if (r5 >= r6) goto L_0x002c
                                java.lang.String r6 = r4.a(r5)
                                java.lang.String r7 = r4.b(r5)
                                r0.put(r6, r7)
                                int r5 = r5 + 1
                                goto L_0x0018
                            L_0x002c:
                                com.bytedance.sdk.component.e.b r15 = new com.bytedance.sdk.component.e.b
                                boolean r5 = r30.d()
                                int r6 = r30.c()
                                java.lang.String r7 = r30.e()
                                r9 = 0
                                long r10 = r30.b()
                                long r12 = r30.a()
                                r4 = r15
                                r8 = r0
                                r4.<init>(r5, r6, r7, r8, r9, r10, r12)
                                boolean r4 = r30.d()
                                if (r4 == 0) goto L_0x02af
                                com.bytedance.sdk.component.b.a.n r4 = r30.f()
                                long r4 = r4.a()
                                r6 = 0
                                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                                if (r8 > 0) goto L_0x0060
                                long r4 = com.bytedance.sdk.component.e.b.a.g(r0)
                            L_0x0060:
                                boolean r8 = com.bytedance.sdk.component.e.b.a.f(r0)
                                r9 = -1
                                if (r8 == 0) goto L_0x00d9
                                long r10 = r1
                                long r4 = r4 + r10
                                java.lang.String r10 = "Content-Range"
                                java.lang.Object r10 = r0.get(r10)
                                java.lang.String r10 = (java.lang.String) r10
                                boolean r11 = android.text.TextUtils.isEmpty(r10)
                                if (r11 != 0) goto L_0x00d9
                                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                                r11.<init>()
                                java.lang.String r12 = "bytes "
                                r11.append(r12)
                                long r12 = r1
                                r11.append(r12)
                                java.lang.String r12 = "-"
                                r11.append(r12)
                                r12 = 1
                                long r12 = r4 - r12
                                r11.append(r12)
                                java.lang.String r11 = r11.toString()
                                int r12 = android.text.TextUtils.indexOf(r10, r11)
                                if (r12 != r9) goto L_0x00d9
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this
                                r0.d()
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this
                                java.io.IOException r3 = new java.io.IOException
                                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                r4.<init>()
                                java.lang.String r5 = "The Content-Range Header is invalid Assume["
                                r4.append(r5)
                                r4.append(r11)
                                java.lang.String r5 = "] vs Real["
                                r4.append(r5)
                                r4.append(r10)
                                java.lang.String r5 = "], please remove the temporary file ["
                                r4.append(r5)
                                com.bytedance.sdk.component.e.b.a r5 = com.bytedance.sdk.component.e.b.a.this
                                java.io.File r5 = r5.f19128b
                                r4.append(r5)
                                java.lang.String r5 = "]."
                                r4.append(r5)
                                java.lang.String r4 = r4.toString()
                                r3.<init>(r4)
                                r0.a((com.bytedance.sdk.component.e.b.c) r2, (java.io.IOException) r3)
                                return
                            L_0x00d9:
                                r10 = r4
                                java.lang.String r4 = "Rename fail"
                                int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                                if (r5 <= 0) goto L_0x012a
                                com.bytedance.sdk.component.e.b.a r5 = com.bytedance.sdk.component.e.b.a.this
                                java.io.File r5 = r5.f19128b
                                boolean r5 = r5.exists()
                                if (r5 == 0) goto L_0x012a
                                com.bytedance.sdk.component.e.b.a r5 = com.bytedance.sdk.component.e.b.a.this
                                java.io.File r5 = r5.f19128b
                                long r12 = r5.length()
                                int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                                if (r5 != 0) goto L_0x012a
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this
                                java.io.File r0 = r0.f19128b
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this
                                java.io.File r2 = r2.f19127a
                                boolean r0 = r0.renameTo(r2)
                                if (r0 == 0) goto L_0x011d
                                com.bytedance.sdk.component.e.b.a r5 = com.bytedance.sdk.component.e.b.a.this
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                r6 = r10
                                r8 = r10
                                r10 = r0
                                r5.a(r6, r8, r10)
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this
                                java.io.File r0 = r0.f19127a
                                r15.a(r0)
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this
                                r0.a((com.bytedance.sdk.component.e.b.c) r2, (com.bytedance.sdk.component.e.b) r15)
                                goto L_0x0129
                            L_0x011d:
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this
                                java.io.IOException r3 = new java.io.IOException
                                r3.<init>(r4)
                                r0.a((com.bytedance.sdk.component.e.b.c) r2, (java.io.IOException) r3)
                            L_0x0129:
                                return
                            L_0x012a:
                                java.io.RandomAccessFile r12 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0146 }
                                com.bytedance.sdk.component.e.b.a r13 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x0146 }
                                java.io.File r13 = r13.f19128b     // Catch:{ all -> 0x0146 }
                                java.lang.String r5 = "rw"
                                r12.<init>(r13, r5)     // Catch:{ all -> 0x0146 }
                                if (r8 == 0) goto L_0x0140
                                r13 = r15
                                long r14 = r1     // Catch:{ all -> 0x0144 }
                                r12.seek(r14)     // Catch:{ all -> 0x0144 }
                                long r14 = r1     // Catch:{ all -> 0x0144 }
                                goto L_0x0149
                            L_0x0140:
                                r13 = r15
                                r12.setLength(r6)     // Catch:{ all -> 0x0144 }
                            L_0x0144:
                                r14 = r6
                                goto L_0x0149
                            L_0x0146:
                                r13 = r15
                                r12 = 0
                                goto L_0x0144
                            L_0x0149:
                                com.bytedance.sdk.component.b.a.n r16 = r30.f()     // Catch:{ all -> 0x0269 }
                                java.io.InputStream r5 = r16.c()     // Catch:{ all -> 0x0269 }
                                boolean r0 = com.bytedance.sdk.component.e.b.a.h(r0)     // Catch:{ all -> 0x0265 }
                                if (r0 == 0) goto L_0x0161
                                boolean r0 = r5 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0265 }
                                if (r0 != 0) goto L_0x0161
                                java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0265 }
                                r0.<init>(r5)     // Catch:{ all -> 0x0265 }
                                r5 = r0
                            L_0x0161:
                                r0 = 16384(0x4000, float:2.2959E-41)
                                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0265 }
                                r18 = r6
                                r6 = 0
                            L_0x0168:
                                int r7 = 16384 - r6
                                int r7 = r5.read(r0, r6, r7)     // Catch:{ all -> 0x0265 }
                                r16 = 1
                                if (r7 == r9) goto L_0x01bd
                                int r6 = r6 + r7
                                r23 = r10
                                long r9 = (long) r7     // Catch:{ all -> 0x0265 }
                                long r9 = r18 + r9
                                r18 = 16384(0x4000, double:8.0948E-320)
                                long r18 = r9 % r18
                                r20 = 0
                                int r7 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
                                if (r7 == 0) goto L_0x0190
                                r7 = r2
                                r11 = r3
                                long r2 = r1     // Catch:{ all -> 0x01cf }
                                long r2 = r23 - r2
                                int r18 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                                if (r18 != 0) goto L_0x018d
                                goto L_0x0192
                            L_0x018d:
                                r16 = 0
                                goto L_0x0192
                            L_0x0190:
                                r7 = r2
                                r11 = r3
                            L_0x0192:
                                if (r16 == 0) goto L_0x019e
                                r12.seek(r14)     // Catch:{ all -> 0x01cf }
                                r2 = 0
                                r12.write(r0, r2, r6)     // Catch:{ all -> 0x01cf }
                                long r2 = (long) r6     // Catch:{ all -> 0x01cf }
                                long r14 = r14 + r2
                                r6 = 0
                            L_0x019e:
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                r3 = r13
                                r25 = r14
                                long r13 = r1     // Catch:{ all -> 0x01cf }
                                long r17 = r13 + r9
                                com.bytedance.sdk.component.e.a.a r13 = r14     // Catch:{ all -> 0x01cf }
                                r16 = r2
                                r19 = r23
                                r21 = r13
                                r16.a(r17, r19, r21)     // Catch:{ all -> 0x01cf }
                                r13 = r3
                                r2 = r7
                                r18 = r9
                                r3 = r11
                                r10 = r23
                                r14 = r25
                                r9 = -1
                                goto L_0x0168
                            L_0x01bd:
                                r7 = r2
                                r23 = r10
                                r11 = r3
                                r3 = r13
                                if (r8 != 0) goto L_0x01d2
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f19128b     // Catch:{ all -> 0x01cf }
                                long r9 = r0.length()     // Catch:{ all -> 0x01cf }
                                r25 = r9
                                goto L_0x01d4
                            L_0x01cf:
                                r0 = move-exception
                                goto L_0x026d
                            L_0x01d2:
                                r25 = r23
                            L_0x01d4:
                                r9 = 0
                                int r0 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
                                if (r0 <= 0) goto L_0x0228
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f19128b     // Catch:{ all -> 0x01cf }
                                boolean r0 = r0.exists()     // Catch:{ all -> 0x01cf }
                                if (r0 == 0) goto L_0x0228
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f19128b     // Catch:{ all -> 0x01cf }
                                long r9 = r0.length()     // Catch:{ all -> 0x01cf }
                                int r0 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
                                if (r0 != 0) goto L_0x0228
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f19128b     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r2 = r2.f19127a     // Catch:{ all -> 0x01cf }
                                boolean r0 = r0.renameTo(r2)     // Catch:{ all -> 0x01cf }
                                if (r0 == 0) goto L_0x021b
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.a.a r2 = r14     // Catch:{ all -> 0x01cf }
                                r22 = r0
                                r23 = r25
                                r27 = r2
                                r22.a(r23, r25, r27)     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r0 = r0.f19127a     // Catch:{ all -> 0x01cf }
                                r2 = r3
                                r2.a(r0)     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.a.a r0 = r14     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r3 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                r0.a((com.bytedance.sdk.component.e.b.c) r3, (com.bytedance.sdk.component.e.b) r2)     // Catch:{ all -> 0x01cf }
                                goto L_0x0254
                            L_0x021b:
                                com.bytedance.sdk.component.e.a.a r0 = r14     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01cf }
                                r3.<init>(r4)     // Catch:{ all -> 0x01cf }
                                r0.a((com.bytedance.sdk.component.e.b.c) r2, (java.io.IOException) r3)     // Catch:{ all -> 0x01cf }
                                goto L_0x0254
                            L_0x0228:
                                com.bytedance.sdk.component.e.a.a r0 = r14     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r2 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x01cf }
                                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01cf }
                                r4.<init>()     // Catch:{ all -> 0x01cf }
                                java.lang.String r6 = " tempFile.length() == fileSize is"
                                r4.append(r6)     // Catch:{ all -> 0x01cf }
                                com.bytedance.sdk.component.e.b.a r6 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x01cf }
                                java.io.File r6 = r6.f19128b     // Catch:{ all -> 0x01cf }
                                long r9 = r6.length()     // Catch:{ all -> 0x01cf }
                                int r6 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
                                if (r6 != 0) goto L_0x0246
                                r14 = 1
                                goto L_0x0247
                            L_0x0246:
                                r14 = 0
                            L_0x0247:
                                r4.append(r14)     // Catch:{ all -> 0x01cf }
                                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01cf }
                                r3.<init>(r4)     // Catch:{ all -> 0x01cf }
                                r0.a((com.bytedance.sdk.component.e.b.c) r2, (java.io.IOException) r3)     // Catch:{ all -> 0x01cf }
                            L_0x0254:
                                if (r5 == 0) goto L_0x025d
                                r5.close()     // Catch:{ all -> 0x025a }
                                goto L_0x025d
                            L_0x025a:
                                com.bytedance.sdk.component.e.d.d.a(r11)
                            L_0x025d:
                                r12.close()     // Catch:{ all -> 0x0261 }
                                goto L_0x02b7
                            L_0x0261:
                                com.bytedance.sdk.component.e.d.d.a(r7)
                                goto L_0x02b7
                            L_0x0265:
                                r0 = move-exception
                                r7 = r2
                                r11 = r3
                                goto L_0x026d
                            L_0x0269:
                                r0 = move-exception
                                r7 = r2
                                r11 = r3
                                r5 = 0
                            L_0x026d:
                                java.lang.String r2 = "Error occured when FileRequest.parseHttpResponse"
                                com.bytedance.sdk.component.e.d.d.a(r2)     // Catch:{ all -> 0x029d }
                                r0.printStackTrace()     // Catch:{ all -> 0x029d }
                                com.bytedance.sdk.component.e.a.a r2 = r14     // Catch:{ all -> 0x029d }
                                com.bytedance.sdk.component.e.b.a r3 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x029d }
                                java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x029d }
                                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x029d }
                                r4.<init>(r0)     // Catch:{ all -> 0x029d }
                                r2.a((com.bytedance.sdk.component.e.b.c) r3, (java.io.IOException) r4)     // Catch:{ all -> 0x029d }
                                if (r8 != 0) goto L_0x028c
                                com.bytedance.sdk.component.e.b.a r0 = com.bytedance.sdk.component.e.b.a.this     // Catch:{ all -> 0x029d }
                                r0.d()     // Catch:{ all -> 0x029d }
                            L_0x028c:
                                if (r5 == 0) goto L_0x0295
                                r5.close()     // Catch:{ all -> 0x0292 }
                                goto L_0x0295
                            L_0x0292:
                                com.bytedance.sdk.component.e.d.d.a(r11)
                            L_0x0295:
                                r12.close()     // Catch:{ all -> 0x0299 }
                                goto L_0x029c
                            L_0x0299:
                                com.bytedance.sdk.component.e.d.d.a(r7)
                            L_0x029c:
                                return
                            L_0x029d:
                                r0 = move-exception
                                if (r5 == 0) goto L_0x02a7
                                r5.close()     // Catch:{ all -> 0x02a4 }
                                goto L_0x02a7
                            L_0x02a4:
                                com.bytedance.sdk.component.e.d.d.a(r11)
                            L_0x02a7:
                                r12.close()     // Catch:{ all -> 0x02ab }
                                goto L_0x02ae
                            L_0x02ab:
                                com.bytedance.sdk.component.e.d.d.a(r7)
                            L_0x02ae:
                                throw r0
                            L_0x02af:
                                r2 = r15
                                com.bytedance.sdk.component.e.a.a r0 = r14
                                com.bytedance.sdk.component.e.b.a r3 = com.bytedance.sdk.component.e.b.a.this
                                r0.a((com.bytedance.sdk.component.e.b.c) r3, (com.bytedance.sdk.component.e.b) r2)
                            L_0x02b7:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.b.a.AnonymousClass1.a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
                        }
                    });
                } catch (IllegalArgumentException unused) {
                    aVar.a((c) this, new IOException("Url is not a valid HTTP or HTTPS URL"));
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                com.bytedance.sdk.component.e.b bVar = new com.bytedance.sdk.component.e.b(true, 200, "Success", (Map<String, String>) null, (String) null, currentTimeMillis, currentTimeMillis);
                bVar.a(this.f19127a);
                aVar.a((c) this, bVar);
            }
        } else if (aVar != null) {
            aVar.a((c) this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:120|121|(1:123)(1:124)|125|(4:127|128|129|130)|131|132|133|134|177) */
    /* JADX WARNING: Can't wrap try/catch for region: R(11:135|138|139|140|(1:142)|(4:144|145|146|147)|148|149|150|151|179) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:102|103|104|105) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:112|113|114|115) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:127|128|129|130) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:144|145|146|147) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(4:112|113|114|115)|116|117|118|119|175) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:100|(4:102|103|104|105)|106|107|108|109|110) */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:?, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x024c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x0253 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:114:0x025d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x0265 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0293 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x029b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x02b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x02bf */
    /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x02cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x02d2 */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x026a A[SYNTHETIC, Splitter:B:120:0x026a] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ae A[Catch:{ all -> 0x02c4, all -> 0x02cb, all -> 0x02d2, IOException -> 0x02d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3 A[SYNTHETIC, Splitter:B:144:0x02b3] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0209 A[EDGE_INSN: B:171:0x0209->B:86:0x0209 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01dd A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x020e A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0216 A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021d A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0237 A[Catch:{ all -> 0x02a0 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:160:0x02d2=Splitter:B:160:0x02d2, B:108:0x0253=Splitter:B:108:0x0253, B:129:0x0293=Splitter:B:129:0x0293, B:118:0x0265=Splitter:B:118:0x0265, B:146:0x02b7=Splitter:B:146:0x02b7, B:133:0x029b=Splitter:B:133:0x029b, B:156:0x02cb=Splitter:B:156:0x02cb, B:104:0x024c=Splitter:B:104:0x024c, B:114:0x025d=Splitter:B:114:0x025d, B:150:0x02bf=Splitter:B:150:0x02bf} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.component.e.b a() {
        /*
            r28 = this;
            r1 = r28
            java.lang.String r2 = "Error occured when calling tmpFile.close"
            java.lang.String r3 = "Error occured when calling InputStream.close"
            java.io.File r0 = r1.f19127a
            r4 = 0
            if (r0 == 0) goto L_0x02e7
            java.io.File r5 = r1.f19128b
            if (r5 != 0) goto L_0x0011
            goto L_0x02e7
        L_0x0011:
            boolean r0 = r0.exists()
            r5 = 0
            if (r0 == 0) goto L_0x003b
            java.io.File r0 = r1.f19127a
            long r7 = r0.length()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x003b
            long r15 = java.lang.System.currentTimeMillis()
            com.bytedance.sdk.component.e.b r0 = new com.bytedance.sdk.component.e.b
            r8 = 1
            r9 = 200(0xc8, float:2.8E-43)
            r11 = 0
            r12 = 0
            java.lang.String r10 = "Success"
            r7 = r0
            r13 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r15)
            java.io.File r2 = r1.f19127a
            r0.a(r2)
            return r0
        L_0x003b:
            java.io.File r0 = r1.f19128b
            long r7 = r0.length()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r7 = r5
        L_0x0046:
            com.bytedance.sdk.component.b.a.k$a r0 = new com.bytedance.sdk.component.b.a.k$a
            r0.<init>()
            java.lang.String r9 = r28.b()
            r0.a((java.lang.Object) r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "bytes="
            r9.append(r10)
            r9.append(r7)
            java.lang.String r10 = "-"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "Range"
            r1.b(r11, r9)
            java.lang.String r9 = r1.f19142f
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r11 = "DownloadExecutor"
            if (r9 == 0) goto L_0x007d
            java.lang.String r0 = "execute: Url is Empty"
            android.util.Log.e(r11, r0)
            return r4
        L_0x007d:
            java.lang.String r9 = r1.f19142f     // Catch:{ IllegalArgumentException -> 0x02df }
            r0.a((java.lang.String) r9)     // Catch:{ IllegalArgumentException -> 0x02df }
            r1.a((com.bytedance.sdk.component.b.a.k.a) r0)
            com.bytedance.sdk.component.b.a.k$a r0 = r0.a()
            com.bytedance.sdk.component.b.a.k r0 = r0.b()
            com.bytedance.sdk.component.b.a.i r9 = r1.f19139c     // Catch:{ IOException -> 0x02d6 }
            com.bytedance.sdk.component.b.a.b r0 = r9.a(r0)     // Catch:{ IOException -> 0x02d6 }
            com.bytedance.sdk.component.b.a.m r0 = r0.a()     // Catch:{ IOException -> 0x02d6 }
            if (r0 == 0) goto L_0x02dd
            boolean r9 = r0.d()     // Catch:{ IOException -> 0x02d6 }
            if (r9 == 0) goto L_0x02dd
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ IOException -> 0x02d6 }
            r9.<init>()     // Catch:{ IOException -> 0x02d6 }
            com.bytedance.sdk.component.b.a.e r12 = r0.g()     // Catch:{ IOException -> 0x02d6 }
            if (r12 == 0) goto L_0x00bf
            r13 = 0
        L_0x00ab:
            int r14 = r12.a()     // Catch:{ IOException -> 0x02d6 }
            if (r13 >= r14) goto L_0x00bf
            java.lang.String r14 = r12.a(r13)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r15 = r12.b(r13)     // Catch:{ IOException -> 0x02d6 }
            r9.put(r14, r15)     // Catch:{ IOException -> 0x02d6 }
            int r13 = r13 + 1
            goto L_0x00ab
        L_0x00bf:
            com.bytedance.sdk.component.e.b r15 = new com.bytedance.sdk.component.e.b     // Catch:{ IOException -> 0x02d6 }
            boolean r13 = r0.d()     // Catch:{ IOException -> 0x02d6 }
            int r14 = r0.c()     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r17 = r0.e()     // Catch:{ IOException -> 0x02d6 }
            r18 = 0
            long r19 = r0.b()     // Catch:{ IOException -> 0x02d6 }
            long r21 = r0.a()     // Catch:{ IOException -> 0x02d6 }
            r12 = r15
            r23 = r15
            r15 = r17
            r16 = r9
            r17 = r18
            r18 = r19
            r20 = r21
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)     // Catch:{ IOException -> 0x02d6 }
            com.bytedance.sdk.component.b.a.n r12 = r0.f()     // Catch:{ IOException -> 0x02d6 }
            long r12 = r12.a()     // Catch:{ IOException -> 0x02d6 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 > 0) goto L_0x00f7
            long r12 = g(r9)     // Catch:{ IOException -> 0x02d6 }
        L_0x00f7:
            java.io.File r14 = r1.f19128b     // Catch:{ IOException -> 0x02d6 }
            long r14 = r14.length()     // Catch:{ IOException -> 0x02d6 }
            boolean r16 = f(r9)     // Catch:{ IOException -> 0x02d6 }
            if (r16 == 0) goto L_0x0164
            long r12 = r12 + r14
            java.lang.String r6 = "Content-Range"
            java.lang.Object r6 = r9.get(r6)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x02d6 }
            boolean r19 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException -> 0x02d6 }
            if (r19 != 0) goto L_0x0164
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d6 }
            r4.<init>()     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r5 = "bytes "
            r4.append(r5)     // Catch:{ IOException -> 0x02d6 }
            r4.append(r14)     // Catch:{ IOException -> 0x02d6 }
            r4.append(r10)     // Catch:{ IOException -> 0x02d6 }
            r14 = 1
            long r14 = r12 - r14
            r4.append(r14)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x02d6 }
            int r5 = android.text.TextUtils.indexOf(r6, r4)     // Catch:{ IOException -> 0x02d6 }
            r10 = -1
            if (r5 != r10) goto L_0x0164
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02d6 }
            r0.<init>()     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r2 = "execute: The Content-Range Header is invalid Assume["
            r0.append(r2)     // Catch:{ IOException -> 0x02d6 }
            r0.append(r4)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r2 = "] vs Real["
            r0.append(r2)     // Catch:{ IOException -> 0x02d6 }
            r0.append(r6)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r2 = "], please remove the temporary file ["
            r0.append(r2)     // Catch:{ IOException -> 0x02d6 }
            java.io.File r2 = r1.f19128b     // Catch:{ IOException -> 0x02d6 }
            r0.append(r2)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r2 = "]."
            r0.append(r2)     // Catch:{ IOException -> 0x02d6 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x02d6 }
            com.bytedance.sdk.component.e.d.d.b(r11, r0)     // Catch:{ IOException -> 0x02d6 }
            r28.d()     // Catch:{ IOException -> 0x02d6 }
            r2 = 0
            return r2
        L_0x0164:
            r4 = 0
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0195
            java.io.File r4 = r1.f19128b     // Catch:{ IOException -> 0x02d6 }
            boolean r4 = r4.exists()     // Catch:{ IOException -> 0x02d6 }
            if (r4 == 0) goto L_0x0195
            java.io.File r4 = r1.f19128b     // Catch:{ IOException -> 0x02d6 }
            long r4 = r4.length()     // Catch:{ IOException -> 0x02d6 }
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x0195
            java.io.File r0 = r1.f19128b     // Catch:{ IOException -> 0x02d6 }
            java.io.File r2 = r1.f19127a     // Catch:{ IOException -> 0x02d6 }
            boolean r0 = r0.renameTo(r2)     // Catch:{ IOException -> 0x02d6 }
            if (r0 == 0) goto L_0x018e
            java.io.File r0 = r1.f19127a     // Catch:{ IOException -> 0x02d6 }
            r4 = r23
            r4.a(r0)     // Catch:{ IOException -> 0x02d6 }
            return r4
        L_0x018e:
            java.lang.String r0 = "Rename fail"
            com.bytedance.sdk.component.e.d.d.b(r11, r0)     // Catch:{ IOException -> 0x02d6 }
            r2 = 0
            return r2
        L_0x0195:
            r4 = r23
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x01af }
            java.io.File r6 = r1.f19128b     // Catch:{ all -> 0x01af }
            java.lang.String r10 = "rw"
            r5.<init>(r6, r10)     // Catch:{ all -> 0x01af }
            if (r16 == 0) goto L_0x01a7
            r5.seek(r7)     // Catch:{ all -> 0x01ac }
            r14 = r7
            goto L_0x01b1
        L_0x01a7:
            r14 = 0
            r5.setLength(r14)     // Catch:{ all -> 0x01ac }
        L_0x01ac:
            r14 = 0
            goto L_0x01b1
        L_0x01af:
            r5 = 0
            goto L_0x01ac
        L_0x01b1:
            com.bytedance.sdk.component.b.a.n r0 = r0.f()     // Catch:{ all -> 0x02a2 }
            java.io.InputStream r6 = r0.c()     // Catch:{ all -> 0x02a2 }
            boolean r0 = h(r9)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r6 instanceof java.util.zip.GZIPInputStream     // Catch:{ all -> 0x02a0 }
            if (r0 != 0) goto L_0x01c9
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x02a0 }
            r0.<init>(r6)     // Catch:{ all -> 0x02a0 }
            r6 = r0
        L_0x01c9:
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x02a0 }
            r9 = 0
            r21 = 0
        L_0x01d0:
            int r10 = 16384 - r9
            int r10 = r6.read(r0, r9, r10)     // Catch:{ all -> 0x02a0 }
            r23 = 1
            r24 = r11
            r11 = -1
            if (r10 == r11) goto L_0x0209
            int r9 = r9 + r10
            r25 = r12
            long r11 = (long) r10     // Catch:{ all -> 0x02a0 }
            long r21 = r21 + r11
            r10 = 16384(0x4000, double:8.0948E-320)
            long r10 = r21 % r10
            r12 = 0
            int r27 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r27 == 0) goto L_0x01f6
            long r12 = r25 - r7
            int r10 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r23 = 0
        L_0x01f6:
            if (r23 == 0) goto L_0x0203
            r5.seek(r14)     // Catch:{ all -> 0x02a0 }
            r11 = 0
            r5.write(r0, r11, r9)     // Catch:{ all -> 0x02a0 }
            long r9 = (long) r9     // Catch:{ all -> 0x02a0 }
            long r14 = r14 + r9
            r9 = 0
            goto L_0x0204
        L_0x0203:
            r11 = 0
        L_0x0204:
            r11 = r24
            r12 = r25
            goto L_0x01d0
        L_0x0209:
            r25 = r12
            r11 = 0
            if (r10 == 0) goto L_0x0214
            r5.seek(r14)     // Catch:{ all -> 0x02a0 }
            r5.write(r0, r11, r9)     // Catch:{ all -> 0x02a0 }
        L_0x0214:
            if (r16 != 0) goto L_0x021d
            java.io.File r0 = r1.f19128b     // Catch:{ all -> 0x02a0 }
            long r12 = r0.length()     // Catch:{ all -> 0x02a0 }
            goto L_0x021f
        L_0x021d:
            r12 = r25
        L_0x021f:
            r7 = 0
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x026a
            java.io.File r0 = r1.f19128b     // Catch:{ all -> 0x02a0 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x026a
            java.io.File r0 = r1.f19128b     // Catch:{ all -> 0x02a0 }
            long r7 = r0.length()     // Catch:{ all -> 0x02a0 }
            int r0 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x026a
            java.io.File r0 = r1.f19128b     // Catch:{ all -> 0x02a0 }
            java.io.File r7 = r1.f19127a     // Catch:{ all -> 0x02a0 }
            boolean r0 = r0.renameTo(r7)     // Catch:{ all -> 0x02a0 }
            if (r0 == 0) goto L_0x0257
            java.io.File r0 = r1.f19127a     // Catch:{ all -> 0x02a0 }
            r4.a(r0)     // Catch:{ all -> 0x02a0 }
            if (r6 == 0) goto L_0x024f
            r6.close()     // Catch:{ all -> 0x024c }
            goto L_0x024f
        L_0x024c:
            com.bytedance.sdk.component.e.d.d.a(r3)     // Catch:{ IOException -> 0x02d6 }
        L_0x024f:
            r5.close()     // Catch:{ all -> 0x0253 }
            goto L_0x0256
        L_0x0253:
            com.bytedance.sdk.component.e.d.d.a(r2)     // Catch:{ IOException -> 0x02d6 }
        L_0x0256:
            return r4
        L_0x0257:
            if (r6 == 0) goto L_0x0260
            r6.close()     // Catch:{ all -> 0x025d }
            goto L_0x0260
        L_0x025d:
            com.bytedance.sdk.component.e.d.d.a(r3)     // Catch:{ IOException -> 0x02d6 }
        L_0x0260:
            r5.close()     // Catch:{ all -> 0x0265 }
        L_0x0263:
            r2 = 0
            goto L_0x0269
        L_0x0265:
            com.bytedance.sdk.component.e.d.d.a(r2)     // Catch:{ IOException -> 0x02d6 }
            goto L_0x0263
        L_0x0269:
            return r2
        L_0x026a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02a0 }
            r0.<init>()     // Catch:{ all -> 0x02a0 }
            java.lang.String r4 = " tempFile.length() == fileSize is"
            r0.append(r4)     // Catch:{ all -> 0x02a0 }
            java.io.File r4 = r1.f19128b     // Catch:{ all -> 0x02a0 }
            long r7 = r4.length()     // Catch:{ all -> 0x02a0 }
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0280
            r15 = 1
            goto L_0x0281
        L_0x0280:
            r15 = 0
        L_0x0281:
            r0.append(r15)     // Catch:{ all -> 0x02a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02a0 }
            r4 = r24
            com.bytedance.sdk.component.e.d.d.b(r4, r0)     // Catch:{ all -> 0x02a0 }
            if (r6 == 0) goto L_0x0296
            r6.close()     // Catch:{ all -> 0x0293 }
            goto L_0x0296
        L_0x0293:
            com.bytedance.sdk.component.e.d.d.a(r3)     // Catch:{ IOException -> 0x02d6 }
        L_0x0296:
            r5.close()     // Catch:{ all -> 0x029b }
        L_0x0299:
            r2 = 0
            goto L_0x029f
        L_0x029b:
            com.bytedance.sdk.component.e.d.d.a(r2)     // Catch:{ IOException -> 0x02d6 }
            goto L_0x0299
        L_0x029f:
            return r2
        L_0x02a0:
            r0 = move-exception
            goto L_0x02a4
        L_0x02a2:
            r0 = move-exception
            r6 = 0
        L_0x02a4:
            java.lang.String r4 = "Error occured when FileRequest.parseHttpResponse"
            com.bytedance.sdk.component.e.d.d.a(r4)     // Catch:{ all -> 0x02c4 }
            r0.printStackTrace()     // Catch:{ all -> 0x02c4 }
            if (r16 != 0) goto L_0x02b1
            r28.d()     // Catch:{ all -> 0x02c4 }
        L_0x02b1:
            if (r6 == 0) goto L_0x02ba
            r6.close()     // Catch:{ all -> 0x02b7 }
            goto L_0x02ba
        L_0x02b7:
            com.bytedance.sdk.component.e.d.d.a(r3)     // Catch:{ IOException -> 0x02d6 }
        L_0x02ba:
            r5.close()     // Catch:{ all -> 0x02bf }
        L_0x02bd:
            r2 = 0
            goto L_0x02c3
        L_0x02bf:
            com.bytedance.sdk.component.e.d.d.a(r2)     // Catch:{ IOException -> 0x02d6 }
            goto L_0x02bd
        L_0x02c3:
            return r2
        L_0x02c4:
            r0 = move-exception
            if (r6 == 0) goto L_0x02ce
            r6.close()     // Catch:{ all -> 0x02cb }
            goto L_0x02ce
        L_0x02cb:
            com.bytedance.sdk.component.e.d.d.a(r3)     // Catch:{ IOException -> 0x02d6 }
        L_0x02ce:
            r5.close()     // Catch:{ all -> 0x02d2 }
            goto L_0x02d5
        L_0x02d2:
            com.bytedance.sdk.component.e.d.d.a(r2)     // Catch:{ IOException -> 0x02d6 }
        L_0x02d5:
            throw r0     // Catch:{ IOException -> 0x02d6 }
        L_0x02d6:
            r0 = move-exception
            r0.printStackTrace()
            r28.d()
        L_0x02dd:
            r2 = 0
            return r2
        L_0x02df:
            r2 = r4
            r4 = r11
            java.lang.String r0 = "execute: Url is not a valid HTTP or HTTPS URL"
            android.util.Log.e(r4, r0)
            return r2
        L_0x02e7:
            r2 = r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.b.a.a():com.bytedance.sdk.component.e.b");
    }

    /* access modifiers changed from: private */
    public static boolean f(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        if (str == null || !str.startsWith("bytes")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static long g(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static boolean h(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    /* access modifiers changed from: protected */
    public void a(long j, long j2, com.bytedance.sdk.component.e.a.a aVar) {
        if (aVar != null) {
            aVar.a(this, j, j2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r1 = this;
            java.io.File r0 = r1.f19127a     // Catch:{ all -> 0x0005 }
            r0.delete()     // Catch:{ all -> 0x0005 }
        L_0x0005:
            java.io.File r0 = r1.f19128b     // Catch:{ all -> 0x000a }
            r0.delete()     // Catch:{ all -> 0x000a }
        L_0x000a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.b.a.d():void");
    }
}

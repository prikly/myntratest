package ms.bd.o.Pgl;

import com.applovin.exoplayer2.common.base.Ascii;

public class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9742a = ((String) pblk.a(16777217, 0, 0, "34ae67", new byte[]{54, 34, 45, Ascii.US, 8, 110, 51, Ascii.SI, 60}));

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c3 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ba A[SYNTHETIC, Splitter:B:40:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r14) {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r6.<init>()     // Catch:{ all -> 0x0096 }
            java.io.File r7 = r14.getFilesDir()     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x0096 }
            r6.append(r7)     // Catch:{ all -> 0x0096 }
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "1a0248"
            byte[] r13 = new byte[r2]     // Catch:{ all -> 0x0096 }
            r7 = 111(0x6f, float:1.56E-43)
            r13[r4] = r7     // Catch:{ all -> 0x0096 }
            java.lang.Object r7 = ms.bd.o.Pgl.pblk.a(r8, r9, r10, r12, r13)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0096 }
            r6.append(r7)     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = f9742a     // Catch:{ all -> 0x0096 }
            r6.append(r7)     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0096 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0096 }
            r7.<init>(r6)     // Catch:{ all -> 0x0096 }
            boolean r8 = r7.exists()     // Catch:{ all -> 0x0096 }
            if (r8 == 0) goto L_0x004a
            r7.delete()     // Catch:{ all -> 0x0047 }
            r5 = 2
            goto L_0x004a
        L_0x0047:
            r14 = r3
            r5 = 2
            goto L_0x0097
        L_0x004a:
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ all -> 0x0096 }
            android.content.res.AssetManager r14 = r14.getAssets()     // Catch:{ all -> 0x0096 }
            java.lang.String r7 = f9742a     // Catch:{ all -> 0x0096 }
            java.io.InputStream r14 = r14.open(r7)     // Catch:{ all -> 0x0096 }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0097 }
            r7.<init>()     // Catch:{ all -> 0x0097 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x0094 }
        L_0x0061:
            int r9 = r14.read(r8, r4, r3)     // Catch:{ all -> 0x0094 }
            r10 = -1
            if (r9 == r10) goto L_0x006c
            r7.write(r8, r4, r9)     // Catch:{ all -> 0x0094 }
            goto L_0x0061
        L_0x006c:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0094 }
            r3.<init>(r6)     // Catch:{ all -> 0x0094 }
            byte[] r8 = r7.toByteArray()     // Catch:{ all -> 0x0094 }
            r3.write(r8)     // Catch:{ all -> 0x0094 }
            r3.close()     // Catch:{ all -> 0x0094 }
            int r3 = r7.size()     // Catch:{ all -> 0x0094 }
            if (r3 > 0) goto L_0x0082
            goto L_0x0090
        L_0x0082:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0094 }
            r3.<init>(r6)     // Catch:{ all -> 0x0094 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x008f
            r0 = 0
            goto L_0x0090
        L_0x008f:
            r0 = r5
        L_0x0090:
            r14.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00c3
        L_0x0094:
            r3 = r7
            goto L_0x0097
        L_0x0096:
            r14 = r3
        L_0x0097:
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "9e0a0a"
            r11 = 4
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x00c8 }
            r12 = 41
            r11[r4] = r12     // Catch:{ all -> 0x00c8 }
            r4 = 100
            r11[r2] = r4     // Catch:{ all -> 0x00c8 }
            r2 = 124(0x7c, float:1.74E-43)
            r11[r1] = r2     // Catch:{ all -> 0x00c8 }
            r1 = 18
            r11[r0] = r1     // Catch:{ all -> 0x00c8 }
            java.lang.Object r0 = ms.bd.o.Pgl.pblk.a(r6, r7, r8, r10, r11)     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00c8 }
            if (r14 == 0) goto L_0x00bf
            r14.close()     // Catch:{ all -> 0x00be }
            goto L_0x00bf
        L_0x00be:
        L_0x00bf:
            if (r3 == 0) goto L_0x00c7
            r7 = r3
            r0 = r5
        L_0x00c3:
            r7.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r5 = r0
        L_0x00c7:
            return r5
        L_0x00c8:
            r0 = move-exception
            if (r14 == 0) goto L_0x00d0
            r14.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d0
        L_0x00cf:
        L_0x00d0:
            if (r3 == 0) goto L_0x00d5
            r3.close()     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.s0.a(android.content.Context):int");
    }
}

package com.yandex.metrica.impl.ob;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class L0 {

    /* renamed from: a  reason: collision with root package name */
    private static final B0 f4453a = new B0();

    public static String a(byte[] bArr) {
        try {
            return Base64.encodeToString(b(bArr), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] b(byte[] bArr) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream2);
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    A2.a((Closeable) gZIPOutputStream);
                    A2.a((Closeable) byteArrayOutputStream2);
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    A2.a((Closeable) gZIPOutputStream);
                    A2.a((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
                byteArrayOutputStream = byteArrayOutputStream2;
                A2.a((Closeable) gZIPOutputStream);
                A2.a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
            A2.a((Closeable) gZIPOutputStream);
            A2.a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    public static byte[] a(String str) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            InputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                inputStream = new GZIPInputStream(byteArrayInputStream);
            } catch (Throwable unused) {
                inputStream = inputStream2;
                inputStream2 = byteArrayInputStream;
                try {
                    return new byte[0];
                } finally {
                    A2.a((Closeable) inputStream);
                    A2.a((Closeable) inputStream2);
                }
            }
            try {
                byte[] a2 = a(inputStream);
                A2.a((Closeable) inputStream);
                A2.a((Closeable) byteArrayInputStream);
                return a2;
            } catch (Throwable unused2) {
                inputStream2 = byteArrayInputStream;
                return new byte[0];
            }
        } catch (Throwable unused3) {
            inputStream = inputStream2;
            return new byte[0];
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    break;
                } else if (i > Integer.MAX_VALUE) {
                    break;
                } else if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                    i += read;
                }
            } finally {
                A2.a((Closeable) byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079 A[SYNTHETIC, Splitter:B:33:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0076
            boolean r1 = r9.exists()
            if (r1 != 0) goto L_0x000b
            goto L_0x0076
        L_0x000b:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException | SecurityException -> 0x006b, all -> 0x0047 }
            java.lang.String r2 = "r"
            r1.<init>(r9, r2)     // Catch:{ IOException | SecurityException -> 0x006b, all -> 0x0047 }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ IOException | SecurityException -> 0x0045, all -> 0x0042 }
            r4 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 1
            r3 = r2
            java.nio.channels.FileLock r3 = r3.lock(r4, r6, r8)     // Catch:{ IOException | SecurityException -> 0x0045, all -> 0x0042 }
            long r4 = r9.length()     // Catch:{ IOException | SecurityException -> 0x006d, all -> 0x0040 }
            int r5 = (int) r4     // Catch:{ IOException | SecurityException -> 0x006d, all -> 0x0040 }
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r5)     // Catch:{ IOException | SecurityException -> 0x006d, all -> 0x0040 }
            r2.read(r4)     // Catch:{ IOException | SecurityException -> 0x006d, all -> 0x0040 }
            r4.flip()     // Catch:{ IOException | SecurityException -> 0x006d, all -> 0x0040 }
            byte[] r2 = r4.array()     // Catch:{ IOException | SecurityException -> 0x006d, all -> 0x0040 }
            r9.getAbsolutePath()
            a((java.nio.channels.FileLock) r3)
            com.yandex.metrica.impl.ob.A2.a((java.io.Closeable) r1)
            goto L_0x0077
        L_0x0040:
            r2 = move-exception
            goto L_0x004b
        L_0x0042:
            r2 = move-exception
            r3 = r0
            goto L_0x004b
        L_0x0045:
            r3 = r0
            goto L_0x006d
        L_0x0047:
            r1 = move-exception
            r2 = r1
            r1 = r0
            r3 = r1
        L_0x004b:
            com.yandex.metrica.impl.ob.M0 r4 = com.yandex.metrica.impl.ob.C0609oh.a()     // Catch:{ all -> 0x0060 }
            java.lang.String r5 = "error_during_file_reading"
            com.yandex.metrica.impl.ob.nh r4 = (com.yandex.metrica.impl.ob.C0584nh) r4
            r4.reportError((java.lang.String) r5, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0060 }
            r9.getAbsolutePath()
            a((java.nio.channels.FileLock) r3)
            com.yandex.metrica.impl.ob.A2.a((java.io.Closeable) r1)
            goto L_0x0076
        L_0x0060:
            r0 = move-exception
            r9.getAbsolutePath()
            a((java.nio.channels.FileLock) r3)
            com.yandex.metrica.impl.ob.A2.a((java.io.Closeable) r1)
            throw r0
        L_0x006b:
            r1 = r0
            r3 = r1
        L_0x006d:
            r9.getAbsolutePath()
            a((java.nio.channels.FileLock) r3)
            com.yandex.metrica.impl.ob.A2.a((java.io.Closeable) r1)
        L_0x0076:
            r2 = r0
        L_0x0077:
            if (r2 == 0) goto L_0x0092
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            java.lang.String r9 = "UTF-8"
            r0.<init>(r2, r9)     // Catch:{ UnsupportedEncodingException -> 0x0081 }
            goto L_0x0092
        L_0x0081:
            r9 = move-exception
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            com.yandex.metrica.impl.ob.M0 r1 = com.yandex.metrica.impl.ob.C0609oh.a()
            com.yandex.metrica.impl.ob.nh r1 = (com.yandex.metrica.impl.ob.C0584nh) r1
            java.lang.String r2 = "read_share_file_with_unsupported_encoding"
            r1.reportError((java.lang.String) r2, (java.lang.Throwable) r9)
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.L0.a(java.io.File):java.lang.String");
    }

    public static void a(FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:0|(4:2|3|(1:5)(1:6)|(1:12))|13|14|(2:16|(1:26)(2:20|22))(1:24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 24
            boolean r0 = com.yandex.metrica.impl.ob.A2.a((int) r0)
            if (r0 == 0) goto L_0x0027
            java.io.File r0 = r2.getNoBackupFilesDir()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0016
        L_0x0010:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0027 }
            r1.<init>(r0, r3)     // Catch:{ all -> 0x0027 }
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x0027
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0027
            boolean r1 = r0.canWrite()     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0027
            r0.delete()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            java.io.File r2 = r2.getFileStreamPath(r3)     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x0045 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0045 }
            r3.<init>(r2)     // Catch:{ all -> 0x0045 }
            boolean r2 = r3.exists()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0045
            boolean r2 = r3.canWrite()     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0045
            r3.delete()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.L0.a(android.content.Context, java.lang.String):void");
    }

    public static void a(String str, String str2, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (IOException unused) {
        } finally {
            a(fileLock);
            A2.a((Closeable) fileOutputStream);
        }
    }
}

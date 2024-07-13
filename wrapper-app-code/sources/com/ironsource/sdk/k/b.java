package com.ironsource.sdk.k;

import android.os.Handler;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f9570c;

    /* renamed from: a  reason: collision with root package name */
    public a f9571a = new a(com.ironsource.environment.e.a.a());

    /* renamed from: b  reason: collision with root package name */
    public final String f9572b;

    /* renamed from: d  reason: collision with root package name */
    private Thread f9573d;

    static class a implements Callable<C0091b> {

        /* renamed from: a  reason: collision with root package name */
        private String f9574a;

        /* renamed from: b  reason: collision with root package name */
        private String f9575b;

        /* renamed from: c  reason: collision with root package name */
        private String f9576c;

        /* renamed from: d  reason: collision with root package name */
        private long f9577d;

        /* renamed from: e  reason: collision with root package name */
        private String f9578e;

        a(String str, String str2, String str3, long j, String str4) {
            this.f9574a = str;
            this.f9575b = str2;
            this.f9576c = str3;
            this.f9577d = j;
            this.f9578e = str4;
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v1, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v5 */
        /* JADX WARNING: type inference failed for: r3v6, types: [java.net.HttpURLConnection] */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v9, types: [java.io.InputStream] */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
            r10 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
            r4 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
            r4 = r3;
            r3 = r5;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x012f A[Catch:{ all -> 0x012b }] */
        /* JADX WARNING: Removed duplicated region for block: B:109:? A[ExcHandler: URISyntaxException (unused java.net.URISyntaxException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x013e A[SYNTHETIC, Splitter:B:110:0x013e] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0146 A[Catch:{ all -> 0x0142 }] */
        /* JADX WARNING: Removed duplicated region for block: B:121:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x0155 A[SYNTHETIC, Splitter:B:122:0x0155] */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x015d A[Catch:{ all -> 0x0159 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0093 A[ExcHandler: Error (e java.lang.Error), Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab A[Catch:{ all -> 0x00f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b4 A[SYNTHETIC, Splitter:B:46:0x00b4] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc A[Catch:{ all -> 0x00b8 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00d6 A[Catch:{ all -> 0x00f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x00df A[SYNTHETIC, Splitter:B:62:0x00df] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x00e7 A[Catch:{ all -> 0x00e3 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x00f9 A[SYNTHETIC, Splitter:B:73:0x00f9] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0101 A[Catch:{ all -> 0x00fd }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0110 A[SYNTHETIC, Splitter:B:86:0x0110] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0118 A[Catch:{ all -> 0x0114 }] */
        /* JADX WARNING: Removed duplicated region for block: B:97:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:8:0x0028] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0127 A[SYNTHETIC, Splitter:B:98:0x0127] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:41:0x00a1=Splitter:B:41:0x00a1, B:57:0x00cc=Splitter:B:57:0x00cc} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.ironsource.sdk.k.b.C0091b a(java.lang.String r9, int r10) {
            /*
                r8 = this;
                java.lang.String r0 = "DownloadManager"
                com.ironsource.sdk.k.b$b r1 = new com.ironsource.sdk.k.b$b
                r1.<init>()
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 == 0) goto L_0x0014
                r1.f9579a = r9
                r9 = 1007(0x3ef, float:1.411E-42)
                r1.f9580b = r9
                return r1
            L_0x0014:
                r2 = 1019(0x3fb, float:1.428E-42)
                r3 = 0
                r4 = 0
                java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                r5.<init>(r9)     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                r5.toURI()     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                java.net.URLConnection r5 = r5.openConnection()     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x0152, URISyntaxException -> 0x013b, SocketTimeoutException -> 0x0124, FileNotFoundException -> 0x010d, Exception -> 0x00c9, Error -> 0x009f, all -> 0x009b }
                java.lang.String r6 = "GET"
                r5.setRequestMethod(r6)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r6 = 5000(0x1388, float:7.006E-42)
                r5.setConnectTimeout(r6)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r5.setReadTimeout(r6)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r5.connect()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                int r4 = r5.getResponseCode()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x0097, Error -> 0x0093, all -> 0x0091 }
                r6 = 200(0xc8, float:2.8E-43)
                if (r4 < r6) goto L_0x004e
                r6 = 400(0x190, float:5.6E-43)
                if (r4 < r6) goto L_0x0043
                goto L_0x004e
            L_0x0043:
                java.io.InputStream r3 = r5.getInputStream()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                byte[] r10 = a(r3)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r1.f9581c = r10     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                goto L_0x0071
            L_0x004e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r7 = " RESPONSE CODE: "
                r6.<init>(r7)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r6.append(r4)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r7 = " URL: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r6.append(r9)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r7 = " ATTEMPT: "
                r6.append(r7)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r6.append(r10)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                java.lang.String r10 = r6.toString()     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                com.ironsource.sdk.utils.Logger.i(r0, r10)     // Catch:{ MalformedURLException -> 0x0153, URISyntaxException -> 0x013c, SocketTimeoutException -> 0x0125, FileNotFoundException -> 0x010e, Exception -> 0x008c, Error -> 0x0093, all -> 0x0088 }
                r4 = 1011(0x3f3, float:1.417E-42)
            L_0x0071:
                if (r3 == 0) goto L_0x0079
                r3.close()     // Catch:{ all -> 0x0077 }
                goto L_0x0079
            L_0x0077:
                r10 = move-exception
                goto L_0x007f
            L_0x0079:
                if (r5 == 0) goto L_0x0082
                r5.disconnect()     // Catch:{ all -> 0x0077 }
                goto L_0x0082
            L_0x007f:
                r10.printStackTrace()
            L_0x0082:
                r1.f9579a = r9
                r1.f9580b = r4
                goto L_0x016a
            L_0x0088:
                r10 = move-exception
                r2 = r4
                goto L_0x00f7
            L_0x008c:
                r10 = move-exception
                r2 = r4
                r4 = r3
                r3 = r5
                goto L_0x00cc
            L_0x0091:
                r10 = move-exception
                goto L_0x009d
            L_0x0093:
                r10 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x00a1
            L_0x0097:
                r10 = move-exception
                r4 = r3
                r3 = r5
                goto L_0x00cb
            L_0x009b:
                r10 = move-exception
                r5 = r3
            L_0x009d:
                r2 = 0
                goto L_0x00f7
            L_0x009f:
                r10 = move-exception
                r4 = r3
            L_0x00a1:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f4 }
                if (r5 != 0) goto L_0x00b2
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                com.ironsource.sdk.utils.Logger.i(r0, r10)     // Catch:{ all -> 0x00f4 }
            L_0x00b2:
                if (r4 == 0) goto L_0x00ba
                r4.close()     // Catch:{ all -> 0x00b8 }
                goto L_0x00ba
            L_0x00b8:
                r10 = move-exception
                goto L_0x00c0
            L_0x00ba:
                if (r3 == 0) goto L_0x00c3
                r3.disconnect()     // Catch:{ all -> 0x00b8 }
                goto L_0x00c3
            L_0x00c0:
                r10.printStackTrace()
            L_0x00c3:
                r1.f9579a = r9
                r1.f9580b = r2
                goto L_0x016a
            L_0x00c9:
                r10 = move-exception
                r4 = r3
            L_0x00cb:
                r2 = 0
            L_0x00cc:
                java.lang.String r5 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00f4 }
                if (r5 != 0) goto L_0x00dd
                java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00f4 }
                com.ironsource.sdk.utils.Logger.i(r0, r10)     // Catch:{ all -> 0x00f4 }
            L_0x00dd:
                if (r4 == 0) goto L_0x00e5
                r4.close()     // Catch:{ all -> 0x00e3 }
                goto L_0x00e5
            L_0x00e3:
                r10 = move-exception
                goto L_0x00eb
            L_0x00e5:
                if (r3 == 0) goto L_0x00ee
                r3.disconnect()     // Catch:{ all -> 0x00e3 }
                goto L_0x00ee
            L_0x00eb:
                r10.printStackTrace()
            L_0x00ee:
                r1.f9579a = r9
                r9 = 1009(0x3f1, float:1.414E-42)
                goto L_0x0168
            L_0x00f4:
                r10 = move-exception
                r5 = r3
                r3 = r4
            L_0x00f7:
                if (r3 == 0) goto L_0x00ff
                r3.close()     // Catch:{ all -> 0x00fd }
                goto L_0x00ff
            L_0x00fd:
                r0 = move-exception
                goto L_0x0105
            L_0x00ff:
                if (r5 == 0) goto L_0x0108
                r5.disconnect()     // Catch:{ all -> 0x00fd }
                goto L_0x0108
            L_0x0105:
                r0.printStackTrace()
            L_0x0108:
                r1.f9579a = r9
                r1.f9580b = r2
                throw r10
            L_0x010d:
                r5 = r3
            L_0x010e:
                if (r3 == 0) goto L_0x0116
                r3.close()     // Catch:{ all -> 0x0114 }
                goto L_0x0116
            L_0x0114:
                r10 = move-exception
                goto L_0x011c
            L_0x0116:
                if (r5 == 0) goto L_0x011f
                r5.disconnect()     // Catch:{ all -> 0x0114 }
                goto L_0x011f
            L_0x011c:
                r10.printStackTrace()
            L_0x011f:
                r1.f9579a = r9
                r9 = 1018(0x3fa, float:1.427E-42)
                goto L_0x0168
            L_0x0124:
                r5 = r3
            L_0x0125:
                if (r3 == 0) goto L_0x012d
                r3.close()     // Catch:{ all -> 0x012b }
                goto L_0x012d
            L_0x012b:
                r10 = move-exception
                goto L_0x0133
            L_0x012d:
                if (r5 == 0) goto L_0x0136
                r5.disconnect()     // Catch:{ all -> 0x012b }
                goto L_0x0136
            L_0x0133:
                r10.printStackTrace()
            L_0x0136:
                r1.f9579a = r9
                r9 = 1008(0x3f0, float:1.413E-42)
                goto L_0x0168
            L_0x013b:
                r5 = r3
            L_0x013c:
                if (r3 == 0) goto L_0x0144
                r3.close()     // Catch:{ all -> 0x0142 }
                goto L_0x0144
            L_0x0142:
                r10 = move-exception
                goto L_0x014a
            L_0x0144:
                if (r5 == 0) goto L_0x014d
                r5.disconnect()     // Catch:{ all -> 0x0142 }
                goto L_0x014d
            L_0x014a:
                r10.printStackTrace()
            L_0x014d:
                r1.f9579a = r9
                r9 = 1010(0x3f2, float:1.415E-42)
                goto L_0x0168
            L_0x0152:
                r5 = r3
            L_0x0153:
                if (r3 == 0) goto L_0x015b
                r3.close()     // Catch:{ all -> 0x0159 }
                goto L_0x015b
            L_0x0159:
                r10 = move-exception
                goto L_0x0161
            L_0x015b:
                if (r5 == 0) goto L_0x0164
                r5.disconnect()     // Catch:{ all -> 0x0159 }
                goto L_0x0164
            L_0x0161:
                r10.printStackTrace()
            L_0x0164:
                r1.f9579a = r9
                r9 = 1004(0x3ec, float:1.407E-42)
            L_0x0168:
                r1.f9580b = r9
            L_0x016a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.k.b.a.a(java.lang.String, int):com.ironsource.sdk.k.b$b");
        }

        private static byte[] a(InputStream inputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr, 0, 8192);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            r2 = a(r9.f9574a, r1);
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ironsource.sdk.k.b.C0091b call() {
            /*
                r9 = this;
                java.lang.String r0 = "DownloadManager"
                long r1 = r9.f9577d
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L_0x000e
                r1 = 1
                r9.f9577d = r1
            L_0x000e:
                r1 = 0
                r2 = 0
            L_0x0010:
                long r3 = (long) r1
                long r5 = r9.f9577d
                r7 = 1009(0x3f1, float:1.414E-42)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 >= 0) goto L_0x002a
                java.lang.String r2 = r9.f9574a
                com.ironsource.sdk.k.b$b r2 = r9.a(r2, r1)
                int r3 = r2.f9580b
                r4 = 1008(0x3f0, float:1.413E-42)
                if (r3 == r4) goto L_0x0027
                if (r3 != r7) goto L_0x002a
            L_0x0027:
                int r1 = r1 + 1
                goto L_0x0010
            L_0x002a:
                if (r2 == 0) goto L_0x00ab
                byte[] r1 = r2.f9581c
                if (r1 == 0) goto L_0x00ab
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = r9.f9575b
                r1.append(r3)
                java.lang.String r3 = java.io.File.separator
                r1.append(r3)
                java.lang.String r3 = r9.f9576c
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r9.f9578e
                r3.append(r4)
                java.lang.String r4 = java.io.File.separator
                r3.append(r4)
                java.lang.String r4 = "tmp_"
                r3.append(r4)
                java.lang.String r4 = r9.f9576c
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                byte[] r4 = r2.f9581c     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                int r4 = com.ironsource.sdk.utils.IronSourceStorageUtils.saveFile(r4, r3)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r4 != 0) goto L_0x0072
                r1 = 1006(0x3ee, float:1.41E-42)
                r2.f9580b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x0072:
                boolean r1 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r3, r1)     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                if (r1 != 0) goto L_0x00ab
                r1 = 1020(0x3fc, float:1.43E-42)
                r2.f9580b = r1     // Catch:{ FileNotFoundException -> 0x00a7, Exception -> 0x0092, Error -> 0x007d }
                goto L_0x00ab
            L_0x007d:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x008f
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
            L_0x008f:
                r0 = 1019(0x3fb, float:1.428E-42)
                goto L_0x00a9
            L_0x0092:
                r1 = move-exception
                java.lang.String r3 = r1.getMessage()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x00a4
                java.lang.String r1 = r1.getMessage()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
            L_0x00a4:
                r2.f9580b = r7
                goto L_0x00ab
            L_0x00a7:
                r0 = 1018(0x3fa, float:1.427E-42)
            L_0x00a9:
                r2.f9580b = r0
            L_0x00ab:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.k.b.a.call():com.ironsource.sdk.k.b$b");
        }
    }

    /* renamed from: com.ironsource.sdk.k.b$b  reason: collision with other inner class name */
    static class C0091b {

        /* renamed from: a  reason: collision with root package name */
        public String f9579a;

        /* renamed from: b  reason: collision with root package name */
        int f9580b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f9581c;

        C0091b() {
        }
    }

    static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final long f9582a = 3;

        /* renamed from: b  reason: collision with root package name */
        private final String f9583b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f9584c;

        /* renamed from: d  reason: collision with root package name */
        private String f9585d;

        /* renamed from: e  reason: collision with root package name */
        private String f9586e;

        /* renamed from: f  reason: collision with root package name */
        private String f9587f;

        /* renamed from: g  reason: collision with root package name */
        private long f9588g;

        c(com.ironsource.sdk.h.c cVar, String str, Handler handler, String str2) {
            this.f9585d = str;
            this.f9586e = cVar.getParent();
            this.f9587f = cVar.getName();
            this.f9588g = 3;
            this.f9584c = handler;
            this.f9583b = str2;
        }

        public final void run() {
            int i;
            com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(this.f9586e, this.f9587f);
            Message message = new Message();
            message.obj = cVar;
            String makeDir = IronSourceStorageUtils.makeDir(cVar.getParent());
            if (makeDir == null) {
                i = IronSourceError.ERROR_IS_EMPTY_DEFAULT_PLACEMENT;
            } else {
                C0091b a2 = new a(this.f9585d, makeDir, cVar.getName(), this.f9588g, this.f9583b).call();
                i = a2.f9580b == 200 ? 1016 : a2.f9580b;
            }
            message.what = i;
            this.f9584c.sendMessage(message);
        }
    }

    private b(String str, com.ironsource.environment.e.a aVar) {
        this.f9572b = str;
        IronSourceStorageUtils.deleteFolder(c());
        IronSourceStorageUtils.makeDir(c());
    }

    public static synchronized b a(String str, com.ironsource.environment.e.a aVar) {
        b bVar;
        synchronized (b.class) {
            if (f9570c == null) {
                f9570c = new b(str, aVar);
            }
            bVar = f9570c;
        }
        return bVar;
    }

    private String c() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f9572b, "temp");
    }

    public final synchronized void a() {
        f9570c = null;
        if (this.f9571a != null) {
            this.f9571a.f9569a = null;
            this.f9571a = null;
        }
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str) {
        Thread thread = new Thread(new c(cVar, str, this.f9571a, c()));
        this.f9573d = thread;
        thread.start();
    }

    public final void a(com.ironsource.sdk.h.c cVar, String str, Handler handler) {
        new Thread(new c(cVar, str, handler, c())).start();
    }

    public final boolean b() {
        Thread thread = this.f9573d;
        return thread != null && thread.isAlive();
    }
}

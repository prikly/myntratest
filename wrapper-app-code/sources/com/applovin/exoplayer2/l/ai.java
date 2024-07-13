package com.applovin.exoplayer2.l;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.exoplayer2.k.i;
import com.applovin.exoplayer2.v;
import com.appodeal.ads.modules.common.internal.Constants;
import com.explorestack.protobuf.openrtb.LossReason;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.outcomes.OSOutcomeConstants;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.MimeTypes;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

public final class ai {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13525a = Build.VERSION.SDK_INT;

    /* renamed from: b  reason: collision with root package name */
    public static final String f13526b = Build.DEVICE;

    /* renamed from: c  reason: collision with root package name */
    public static final String f13527c = Build.MANUFACTURER;

    /* renamed from: d  reason: collision with root package name */
    public static final String f13528d = Build.MODEL;

    /* renamed from: e  reason: collision with root package name */
    public static final String f13529e = (f13526b + ", " + f13528d + ", " + f13527c + ", " + f13525a);

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f13530f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f13531g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f13532h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static final Pattern i = Pattern.compile("%([A-Fa-f0-9]{2})");
    private static final Pattern j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    private static HashMap<String, String> k;
    private static final String[] l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", OSOutcomeConstants.OUTCOME_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    private static final String[] m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    private static final int[] n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final int[] o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, LossReason.LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS_VALUE, 196, 195, LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS_VALUE, 144, 151, 158, 153, IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE, 219, 220, 213, LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE, 200, 221, 218, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 145, 152, 159, 138, 141, 132, 131, 222, 217, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE, 215, 194, 197, 204, LossReason.LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED_VALUE, 230, 225, 232, 239, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 253, 244, 243};

    public static float a(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int a(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int a(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int a(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public static int a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int a(r rVar, long j2, boolean z, boolean z2) {
        int i2;
        int a2 = rVar.a() - 1;
        int i3 = 0;
        while (i3 <= a2) {
            int i4 = (i3 + a2) >>> 1;
            if (rVar.a(i4) < j2) {
                i3 = i4 + 1;
            } else {
                a2 = i4 - 1;
            }
        }
        if (z && (i2 = a2 + 1) < rVar.a() && rVar.a(i2) == j2) {
            return i2;
        }
        if (!z2 || a2 != -1) {
            return a2;
        }
        return 0;
    }

    public static int a(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int a(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.a(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static int a(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = n[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static int a(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0019
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0013
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            int r2 = r0 + 1
            goto L_0x0019
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r5 == 0) goto L_0x0020
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.a(int[], int, boolean, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.a(long[], long, boolean, boolean):int");
    }

    public static long a(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static long a(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(((double) j2) * ((double) f2));
    }

    public static long a(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static Point a(Context context, Display display) {
        if (display.getDisplayId() == 0 && c(context)) {
            String e2 = e(f13525a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(e2)) {
                try {
                    String[] a2 = a(e2.trim(), "x");
                    if (a2.length == 2) {
                        int parseInt = Integer.parseInt(a2[0]);
                        int parseInt2 = Integer.parseInt(a2[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                q.d("Util", "Invalid display size: " + e2);
            }
            if ("Sony".equals(f13527c) && f13528d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i2 = f13525a;
        if (i2 >= 23) {
            a(display, point);
        } else if (i2 >= 17) {
            b(display, point);
        } else {
            c(display, point);
        }
        return point;
    }

    public static Handler a() {
        return a((Handler.Callback) null);
    }

    public static Handler a(Handler.Callback callback) {
        return a((Looper) a.a(Looper.myLooper()), callback);
    }

    public static Handler a(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static CharSequence a(CharSequence charSequence, int i2) {
        return charSequence.length() <= i2 ? charSequence : charSequence.subSequence(0, i2);
    }

    public static <T> T a(T t) {
        return t;
    }

    public static String a(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + "ExoPlayerLib/2.15.1";
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String a(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        return (j5 > 0 ? formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}) : formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j4), Long.valueOf(j3)})).toString();
    }

    public static String a(Locale locale) {
        return f13525a >= 21 ? b(locale) : locale.toString();
    }

    public static String a(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    public static String a(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charsets.UTF_8);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static ExecutorService a(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final Thread newThread(Runnable runnable) {
                return ai.a(this.f$0, runnable);
            }
        });
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    private static void a(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void a(i iVar) {
        if (iVar != null) {
            try {
                iVar.c();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static <T> void a(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    public static void a(long[] jArr, long j2, long j3) {
        int i2 = 0;
        int i3 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i3 >= 0 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
        } else if (i3 >= 0 || j2 % j3 != 0) {
            double d2 = ((double) j2) / ((double) j3);
            while (i2 < jArr.length) {
                jArr[i2] = (long) (((double) jArr[i2]) * d2);
                i2++;
            }
        } else {
            long j5 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
        }
    }

    public static boolean a(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean a(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean a(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean a(y yVar, y yVar2, Inflater inflater) {
        if (yVar.a() <= 0) {
            return false;
        }
        if (yVar2.e() < yVar.a()) {
            yVar2.b(yVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(yVar.d(), yVar.c(), yVar.a());
        int i2 = 0;
        while (true) {
            try {
                i2 += inflater.inflate(yVar2.d(), i2, yVar2.e() - i2);
                if (inflater.finished()) {
                    yVar2.c(i2);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i2 == yVar2.e()) {
                    yVar2.b(yVar2.e() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static <T> T[] a(T[] tArr) {
        return tArr;
    }

    public static <T> T[] a(T[] tArr, int i2) {
        a.a(i2 <= tArr.length);
        return Arrays.copyOf(tArr, i2);
    }

    public static <T> T[] a(T[] tArr, int i2, int i3) {
        boolean z = true;
        a.a(i2 >= 0);
        if (i3 > tArr.length) {
            z = false;
        }
        a.a(z);
        return Arrays.copyOfRange(tArr, i2, i3);
    }

    public static <T> T[] a(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    private static String[] a(Configuration configuration) {
        return a(configuration.getLocales().toLanguageTags(), ",");
    }

    public static String[] a(String str, String str2) {
        return str.split(str2, -1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int b(java.util.List<? extends java.lang.Comparable<? super T>> r3, T r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x0023
        L_0x0008:
            int r1 = r3.size()
        L_0x000c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x001d
            java.lang.Object r2 = r3.get(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x000c
        L_0x001d:
            if (r5 == 0) goto L_0x0022
            int r4 = r0 + -1
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            int r3 = r3.size()
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.b(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    public static int b(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = o[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r7 == 0) goto L_0x0019
            int r5 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r5 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.b(long[], long, boolean, boolean):int");
    }

    public static long b(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static long b(int i2, int i3) {
        return b(i3) | (b(i2) << 32);
    }

    public static long b(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long b(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(((double) j2) / ((double) f2));
    }

    public static long b(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    public static Handler b() {
        return b((Handler.Callback) null);
    }

    public static Handler b(Handler.Callback callback) {
        return a(c(), callback);
    }

    public static v b(int i2, int i3, int i4) {
        return new v.a().f("audio/raw").k(i3).l(i4).m(i2).a();
    }

    public static String b(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = b(lowerCase, "-")[0];
        if (k == null) {
            k = f();
        }
        String str3 = k.get(str2);
        if (str3 != null) {
            lowerCase = str3 + lowerCase.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? f(lowerCase) : lowerCase;
    }

    private static String b(Locale locale) {
        return locale.toLanguageTag();
    }

    public static String b(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private static void b(Display display, Point point) {
        display.getRealSize(point);
    }

    public static String[] b(String str, String str2) {
        return str.split(str2, 2);
    }

    public static int c(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static int c(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 == 536870912) {
                        return i3 * 3;
                    }
                    if (i2 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    public static long c(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static long c(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    public static Looper c() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    private static void c(Display display, Point point) {
        display.getSize(point);
    }

    public static boolean c(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static byte[] c(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    public static int d(String str) {
        String[] a2;
        int length;
        if (str == null || (length = a2.length) < 2) {
            return 0;
        }
        String str2 = (a2 = a(str, "_"))[length - 1];
        boolean z = length >= 3 && "neg".equals(a2[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) a.b(str2));
            return z ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long d(long j2, long j3, long j4) {
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (i2 < 0 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        return (long) (((double) j2) * (((double) j3) / ((double) j4)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (android.hardware.display.DisplayManager) r2.getSystemService(io.bidmachine.BidMachineFetcher.AD_TYPE_DISPLAY);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point d(android.content.Context r2) {
        /*
            int r0 = f13525a
            r1 = 17
            if (r0 < r1) goto L_0x0016
            java.lang.String r0 = "display"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L_0x0016
            r1 = 0
            android.view.Display r0 = r0.getDisplay(r1)
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "window"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            java.lang.Object r0 = com.applovin.exoplayer2.l.a.b(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
        L_0x002b:
            android.graphics.Point r2 = a((android.content.Context) r2, (android.view.Display) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.l.ai.d(android.content.Context):android.graphics.Point");
    }

    public static boolean d(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static String[] d() {
        String[] e2 = e();
        for (int i2 = 0; i2 < e2.length; i2++) {
            e2[i2] = b(e2[i2]);
        }
        return e2;
    }

    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod(Constants.GET, new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e2) {
            q.c("Util", "Failed to read system property " + str, e2);
            return null;
        }
    }

    public static boolean e(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    private static String[] e() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f13525a >= 24) {
            return a(configuration);
        }
        return new String[]{a(configuration.locale)};
    }

    public static int f(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = f13525a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    private static String f(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = m;
            if (i2 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i2])) {
                return m[i2 + 1] + str.substring(m[i2].length());
            }
            i2 += 2;
        }
    }

    private static HashMap<String, String> f() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + l.length);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = l;
            if (i2 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int g(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static int h(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i2) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static String i(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
}

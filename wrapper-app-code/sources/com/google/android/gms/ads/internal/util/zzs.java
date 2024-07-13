package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzchn;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzcib;
import com.google.android.gms.internal.ads.zzcnf;
import com.google.android.gms.internal.ads.zzcol;
import com.google.android.gms.internal.ads.zzdws;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzfvb;
import com.google.android.gms.internal.ads.zzger;
import com.google.android.gms.internal.ads.zzgfb;
import com.google.android.gms.internal.ads.zzhfd;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzs {
    public static final zzfvb zza = new zzf(Looper.getMainLooper());
    private final AtomicReference zzb = new AtomicReference((Object) null);
    private final AtomicReference zzc = new AtomicReference((Object) null);
    /* access modifiers changed from: private */
    public boolean zzd = true;
    private final Object zze = new Object();
    private String zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final Executor zzi = Executors.newSingleThreadExecutor();

    public static final boolean zzA(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zze.zzh("Error loading class.", th);
            zzt.zzo().zzu(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzB() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzC(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzD(Context context) {
        Bundle zzV = zzV(context);
        return TextUtils.isEmpty(zzW(zzV)) && !TextUtils.isEmpty(zzV.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static final boolean zzE(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void zzF(View view, int i, MotionEvent motionEvent) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        zzfil zzF;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdws) {
                view2 = ((zzdws) view2).getChildAt(0);
            }
            if ((view2 instanceof zzg) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i3 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i3 = 0;
            }
            zzt.zzp();
            long zzt = zzt(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (view2 instanceof zzcol) {
                zzfio zzR = ((zzcol) view2).zzR();
                if (zzR != null) {
                    str2 = zzR.zzb;
                    int hashCode = view2.hashCode();
                    view2.setContentDescription(str2 + ":" + hashCode);
                    if ((view2 instanceof zzcnf) && (zzF = ((zzcnf) view2).zzF()) != null) {
                        str = zzfil.zza(zzF.zzb);
                        i2 = zzF.zzf;
                        str3 = zzF.zzF;
                    }
                    zze.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(zzt), Integer.toString(i, 2)}));
                }
            }
            str2 = str3;
            str = zzfil.zza(zzF.zzb);
            i2 = zzF.zzf;
            str3 = zzF.zzF;
            zze.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(zzt), Integer.toString(i, 2)}));
        } catch (Exception e2) {
            zze.zzh("Failure getting view location.", e2);
        }
    }

    public static final AlertDialog.Builder zzG(Context context) {
        return new AlertDialog.Builder(context, zzt.zzq().zza());
    }

    public static final void zzH(Context context, String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str2);
        for (String zzby : arrayList) {
            new zzby(context, str, zzby).zzb();
        }
    }

    public static final void zzI(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzblh.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final String zzJ(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    public static final int zzK(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            zze.zzj("Could not parse value:".concat(e2.toString()));
            return 0;
        }
    }

    public static final Map zzL(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap;
    }

    public static final WebResourceResponse zzM(HttpURLConnection httpURLConnection) throws IOException {
        String str;
        zzt.zzp();
        String contentType = httpURLConnection.getContentType();
        String str2 = "";
        if (TextUtils.isEmpty(contentType)) {
            str = str2;
        } else {
            str = contentType.split(";")[0].trim();
        }
        zzt.zzp();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str2 = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str3 = str2;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).isEmpty())) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return zzt.zzq().zzc(str, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static final int[] zzN(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return zzs();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] zzO(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = zzs()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.zzchh r1 = com.google.android.gms.ads.internal.client.zzay.zzb()
            r5 = r4[r3]
            int r1 = r1.zzb(r6, r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.zzchh r1 = com.google.android.gms.ads.internal.client.zzay.zzb()
            r3 = r4[r2]
            int r6 = r1.zzb(r6, r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzO(android.app.Activity):int[]");
    }

    public static final boolean zzP(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = zzt.zzp().zzd || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzl(view);
        long zzt = zzt(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzbe)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) zzba.zzc().zzb(zzbjj.zziN)).booleanValue()) {
                    return true;
                }
                if (zzt < ((long) ((Integer) zzba.zzc().zzb(zzbjj.zziP)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void zzQ(Context context, Intent intent) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzjf)).booleanValue()) {
            try {
                zzY(context, intent);
            } catch (SecurityException e2) {
                zzcho.zzk("", e2);
                zzt.zzo().zzu(e2, "AdUtil.startActivityWithUnknownContext");
            }
        } else {
            zzY(context, intent);
        }
    }

    public static final void zzR(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzm(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            zze.zze("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e2) {
            zze.zzh("No browser is found.", e2);
        }
    }

    public static final int[] zzS(Activity activity) {
        int[] zzN = zzN(activity);
        return new int[]{zzay.zzb().zzb(activity, zzN[0]), zzay.zzb().zzb(activity, zzN[1])};
    }

    public static final boolean zzT(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzP(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzU(context));
    }

    private static KeyguardManager zzU(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle zzV(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            zze.zzb("Error getting metadata", e2);
            return null;
        }
    }

    private static String zzW(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    private static boolean zzX(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzY(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        zze.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    public static void zzf(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzcib.zza.execute(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean zzl(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzl(android.view.View):boolean");
    }

    public static final void zzm(Context context, Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static final ViewGroup.LayoutParams zzn() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final String zzo(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzW(zzV(context));
    }

    static final String zzp() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzq() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final DisplayMetrics zzr(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzs() {
        return new int[]{0, 0};
    }

    public static final long zzt(View view) {
        float f2;
        int i;
        float f3 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f2 = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f3 = Math.min(f3, view2.getAlpha());
            i = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f3 >= 0.0f) {
            f2 = f3;
        }
        return (long) Math.round(f2 * 100.0f);
    }

    public static final WebResourceResponse zzu(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", zzt.zzp().zzc(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            zze.zzk("Could not fetch MRAID JS.", e2);
        }
        return null;
    }

    public static final String zzv() {
        Resources zzd2 = zzt.zzo().zzd();
        return zzd2 != null ? zzd2.getString(R.string.s7) : "Test Ad";
    }

    public static final zzbr zzw(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zze.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbr) {
                return (zzbr) queryLocalInterface;
            }
            return new zzbp(iBinder);
        } catch (Exception e2) {
            zzt.zzo().zzu(e2, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzx(Context context, String str) {
        Context zza2 = zzccp.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzy(String str) {
        if (!zzchn.zzl()) {
            return false;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzeu)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzba.zzc().zzb(zzbjj.zzew);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzba.zzc().zzb(zzbjj.zzev);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzz(Context context) {
        KeyguardManager zzU;
        if (context == null || (zzU = zzU(context)) == null || !zzU.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public final zzgfb zzb(Uri uri) {
        return zzger.zzk(new zzl(uri), this.zzi);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:11|12|(1:14)(3:15|(1:17)(1:18)|19)|20|21|22|(1:24)|25|(1:27)|28|(3:29|30|(1:32))|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004d A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083 A[Catch:{ Exception -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String zzc(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zze
            monitor-enter(r0)
            java.lang.String r1 = r4.zzf     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r1
        L_0x0009:
            if (r6 != 0) goto L_0x0011
            java.lang.String r5 = zzp()     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x0011:
            com.google.android.gms.ads.internal.util.zzce r1 = com.google.android.gms.ads.internal.util.zzce.zza()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = r1.zza     // Catch:{ Exception -> 0x0045 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0045 }
            if (r2 != 0) goto L_0x001e
            goto L_0x0041
        L_0x001e:
            boolean r2 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()     // Catch:{ Exception -> 0x0045 }
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.ads.internal.util.zzcc r2 = new com.google.android.gms.ads.internal.util.zzcc     // Catch:{ Exception -> 0x0045 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.zzcb.zza(r5, r2)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
            goto L_0x003f
        L_0x0030:
            android.content.Context r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r5)     // Catch:{ Exception -> 0x0045 }
            com.google.android.gms.ads.internal.util.zzcd r3 = new com.google.android.gms.ads.internal.util.zzcd     // Catch:{ Exception -> 0x0045 }
            r3.<init>(r2, r5)     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r2 = com.google.android.gms.ads.internal.util.zzcb.zza(r5, r3)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0045 }
        L_0x003f:
            r1.zza = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0041:
            java.lang.String r1 = r1.zza     // Catch:{ Exception -> 0x0045 }
            r4.zzf = r1     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            java.lang.String r1 = r4.zzf     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = android.webkit.WebSettings.getDefaultUserAgent(r5)     // Catch:{ all -> 0x00ba }
            r4.zzf = r1     // Catch:{ all -> 0x00ba }
        L_0x0053:
            java.lang.String r1 = r4.zzf     // Catch:{ all -> 0x00ba }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00ba }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = zzp()     // Catch:{ all -> 0x00ba }
            r4.zzf = r1     // Catch:{ all -> 0x00ba }
        L_0x0061:
            java.lang.String r1 = r4.zzf     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r2.<init>()     // Catch:{ all -> 0x00ba }
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = " (Mobile; "
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            r2.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00ba }
            r4.zzf = r6     // Catch:{ all -> 0x00ba }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r5 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r5)     // Catch:{ Exception -> 0x0099 }
            boolean r5 = r5.isCallerInstantApp()     // Catch:{ Exception -> 0x0099 }
            if (r5 == 0) goto L_0x00a3
            java.lang.String r5 = r4.zzf     // Catch:{ Exception -> 0x0099 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0099 }
            r6.<init>()     // Catch:{ Exception -> 0x0099 }
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = ";aia"
            r6.append(r5)     // Catch:{ Exception -> 0x0099 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0099 }
            r4.zzf = r5     // Catch:{ Exception -> 0x0099 }
            goto L_0x00a3
        L_0x0099:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzcgx r6 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.zzu(r5, r1)     // Catch:{ all -> 0x00ba }
        L_0x00a3:
            java.lang.String r5 = r4.zzf     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r6.<init>()     // Catch:{ all -> 0x00ba }
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = ")"
            r6.append(r5)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00ba }
            r4.zzf = r5     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            return r5
        L_0x00ba:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzc(android.content.Context, java.lang.String):java.lang.String");
    }

    public final void zze(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        zze.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty("User-Agent"))) {
            httpURLConnection.setRequestProperty("User-Agent", zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    public final boolean zzg(String str) {
        return zzX(str, this.zzb, (String) zzba.zzc().zzb(zzbjj.zzZ));
    }

    public final boolean zzh(String str) {
        return zzX(str, this.zzc, (String) zzba.zzc().zzb(zzbjj.zzaa));
    }

    public final boolean zzi(Context context) {
        if (this.zzh) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbjj.zzc(context);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzje)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, (zzo) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzp(this, (zzo) null), intentFilter, 4);
        }
        this.zzh = true;
        return true;
    }

    public final boolean zzj(Context context) {
        if (this.zzg) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbjj.zzc(context);
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzje)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzr(this, (zzq) null), intentFilter);
        } else {
            context.getApplicationContext().registerReceiver(new zzr(this, (zzq) null), intentFilter, 4);
        }
        this.zzg = true;
        return true;
    }

    public final int zzk(Context context, Uri uri) {
        int i;
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        }
        if (!(context instanceof Activity)) {
            zze.zza("Chrome Custom Tabs can only work with Activity context.");
            i = 2;
        } else {
            i = 0;
        }
        if (true == ((Boolean) zzba.zzc().zzb(zzbjj.zzea)).equals(zzba.zzc().zzb(zzbjj.zzeb))) {
            i = 9;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzea)).booleanValue()) {
            zzbkh zzbkh = new zzbkh();
            zzbkh.zze(new zzn(this, zzbkh, context, uri));
            zzbkh.zzb((Activity) context);
        }
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzeb)).booleanValue()) {
            return 5;
        }
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setPackage(zzhfd.zza(context));
        build.launchUrl(context, uri);
        return 5;
    }
}

package com.explorestack.iab.vast;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.measurer.VastAdMeasurer;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastUrlProcessorRegistry;
import com.explorestack.iab.vast.activity.VastActivity;
import com.explorestack.iab.vast.activity.VastView;
import com.explorestack.iab.vast.processor.VastAd;
import com.explorestack.iab.vast.processor.a;
import com.explorestack.iab.vast.tags.AppodealExtensionTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import com.explorestack.protobuf.openrtb.LossReason;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class VastRequest {
    public static int y = 5;
    public static final VastUrlProcessorRegistry.b z = new f();

    /* renamed from: a  reason: collision with root package name */
    public final String f3138a = UUID.randomUUID().toString();

    /* renamed from: b  reason: collision with root package name */
    public CacheControl f3139b = CacheControl.FullLoad;

    /* renamed from: c  reason: collision with root package name */
    public Uri f3140c;

    /* renamed from: d  reason: collision with root package name */
    public VastAd f3141d;

    /* renamed from: e  reason: collision with root package name */
    public String f3142e;

    /* renamed from: f  reason: collision with root package name */
    public VideoType f3143f = VideoType.NonRewarded;

    /* renamed from: g  reason: collision with root package name */
    public Bundle f3144g;

    /* renamed from: h  reason: collision with root package name */
    public com.explorestack.iab.vast.processor.b<MediaFileTag> f3145h;
    public d i;
    public float j = 3.0f;
    public float k = -1.0f;
    public float l;
    public boolean m;
    public int n;
    public int o = 0;
    public boolean p;
    public boolean q = false;
    public boolean r = true;
    public boolean s = true;
    public boolean t = false;
    public boolean u = false;
    public int v = -1;
    public final AtomicBoolean w = new AtomicBoolean(false);
    public final AtomicBoolean x = new AtomicBoolean(false);

    public class Builder {
        public Builder() {
        }

        public Builder addExtra(String str, String str2) {
            VastRequest.this.addExtra(str, str2);
            return this;
        }

        public VastRequest build() {
            return VastRequest.this;
        }

        public Builder forceUseNativeCloseTime(boolean z) {
            boolean unused = VastRequest.this.m = z;
            return this;
        }

        public Builder setAutoClose(boolean z) {
            boolean unused = VastRequest.this.p = z;
            return this;
        }

        public Builder setCacheControl(CacheControl cacheControl) {
            CacheControl unused = VastRequest.this.f3139b = cacheControl;
            return this;
        }

        public Builder setCompanionCloseTime(int i) {
            float unused = VastRequest.this.l = (float) i;
            return this;
        }

        public Builder setMaxDuration(int i) {
            int unused = VastRequest.this.n = i;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f2) {
            float unused = VastRequest.this.j = f2;
            return this;
        }

        public Builder setVideoCloseTime(int i) {
            float unused = VastRequest.this.k = (float) i;
            return this;
        }

        public Builder setXmlUrl(String str) {
            String unused = VastRequest.this.f3142e = str;
            return this;
        }
    }

    public class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3147a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f3148b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f3149c;

        public b(Context context, String str, VastRequestListener vastRequestListener) {
            this.f3147a = context;
            this.f3148b = str;
            this.f3149c = vastRequestListener;
        }

        public void run() {
            VastRequest.this.loadVideoWithDataSync(this.f3147a, this.f3148b, this.f3149c);
        }
    }

    public class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3151a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f3152b;

        public c(Context context, VastRequestListener vastRequestListener) {
            this.f3151a = context;
            this.f3152b = vastRequestListener;
        }

        public void run() {
            VastRequest vastRequest = VastRequest.this;
            vastRequest.a(this.f3151a, vastRequest.f3141d, this.f3152b);
        }
    }

    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VastRequestListener f3154a;

        public d(VastRequestListener vastRequestListener) {
            this.f3154a = vastRequestListener;
        }

        public void run() {
            this.f3154a.onVastLoaded(VastRequest.this);
        }
    }

    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VastErrorListener f3156a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f3157b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f3158c;

        public e(VastErrorListener vastErrorListener, Context context, int i) {
            this.f3156a = vastErrorListener;
            this.f3157b = context;
            this.f3158c = i;
        }

        public void run() {
            int i;
            VastRequest vastRequest;
            Context context;
            VastErrorListener vastErrorListener;
            if (VastRequest.this.f3139b != CacheControl.PartialLoad || !VastRequest.this.w.get() || VastRequest.this.x.get()) {
                vastErrorListener = this.f3156a;
                context = this.f3157b;
                vastRequest = VastRequest.this;
                i = this.f3158c;
            } else {
                vastErrorListener = this.f3156a;
                context = this.f3157b;
                vastRequest = VastRequest.this;
                i = 4;
            }
            vastErrorListener.onVastError(context, vastRequest, i);
        }
    }

    public class f implements VastUrlProcessorRegistry.b {
        public void a(String str) {
            VastLog.d("VastRequest", String.format("Fire url: %s", new Object[]{str}));
            Utils.httpGetURL(str);
        }
    }

    public class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VastAd f3160a;

        public g(VastAd vastAd) {
            this.f3160a = vastAd;
        }

        public void run() {
            if (VastRequest.this.i != null) {
                VastRequest.this.i.a(VastRequest.this, this.f3160a);
            }
        }
    }

    public class h implements Runnable {
        public h() {
        }

        public void run() {
            if (VastRequest.this.i != null) {
                VastRequest.this.i.a(VastRequest.this);
            }
        }
    }

    public static /* synthetic */ class i {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3163a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.explorestack.iab.CacheControl[] r0 = com.explorestack.iab.CacheControl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3163a = r0
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.FullLoad     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3163a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.Stream     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3163a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.explorestack.iab.CacheControl r1 = com.explorestack.iab.CacheControl.PartialLoad     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.VastRequest.i.<clinit>():void");
        }
    }

    public class j implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public long f3164a;

        /* renamed from: b  reason: collision with root package name */
        public File f3165b;

        public j(File file) {
            this.f3165b = file;
            this.f3164a = file.lastModified();
        }

        public int compareTo(Object obj) {
            int i = (this.f3164a > ((j) obj).f3164a ? 1 : (this.f3164a == ((j) obj).f3164a ? 0 : -1));
            if (i > 0) {
                return -1;
            }
            return i == 0 ? 0 : 1;
        }
    }

    private VastRequest() {
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static void setCacheSize(int i2) {
        if (i2 > 0) {
            y = i2;
        }
    }

    public final Uri a(Context context, String str) {
        String b2 = b(context);
        if (b2 != null) {
            File file = new File(b2);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str2 = "temp" + System.currentTimeMillis();
            String replace = str.substring(0, Math.min(230 - file.getPath().length(), str.length())).replace("/", "").replace(":", "");
            File file2 = new File(file, replace);
            if (file2.exists()) {
                return Uri.fromFile(file2);
            }
            File file3 = new File(file, str2);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            long contentLength = (long) httpURLConnection.getContentLength();
            long j2 = 0;
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                j2 += (long) read;
            }
            fileOutputStream.close();
            if (contentLength == j2) {
                file3.renameTo(new File(file, replace));
            }
            return Uri.fromFile(new File(file, replace));
        }
        throw new FileNotFoundException("No dir for caching file");
    }

    public final synchronized void a() {
        if (this.i != null) {
            Utils.onUiThread(new h());
        }
    }

    public final void a(int i2) {
        try {
            sendError(i2);
        } catch (Exception e2) {
            VastLog.a("VastRequest", (Throwable) e2);
        }
    }

    public final void a(Context context) {
        File[] listFiles;
        try {
            String b2 = b(context);
            if (b2 != null && (listFiles = new File(b2).listFiles()) != null && listFiles.length > y) {
                j[] jVarArr = new j[listFiles.length];
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    jVarArr[i2] = new j(listFiles[i2]);
                }
                Arrays.sort(jVarArr);
                for (int i3 = 0; i3 < listFiles.length; i3++) {
                    listFiles[i3] = jVarArr[i3].f3165b;
                }
                for (int i4 = y; i4 < listFiles.length; i4++) {
                    if (!Uri.fromFile(listFiles[i4]).equals(this.f3140c)) {
                        listFiles[i4].delete();
                    }
                }
            }
        } catch (Exception e2) {
            VastLog.a("VastRequest", (Throwable) e2);
        }
    }

    public final void a(Context context, int i2, VastErrorListener vastErrorListener) {
        VastLog.d("VastRequest", "sendError, code: " + i2);
        if (VastError.a(i2)) {
            a(i2);
        }
        if (vastErrorListener != null) {
            Utils.onUiThread(new e(vastErrorListener, context, i2));
        }
    }

    public final void a(Context context, VastAd vastAd, VastRequestListener vastRequestListener) {
        String str;
        try {
            Uri a2 = a(context, vastAd.getPickedMediaFileTag().getText());
            if (a2 != null && !TextUtils.isEmpty(a2.getPath())) {
                if (new File(a2.getPath()).exists()) {
                    Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a2.getPath(), 1);
                    if (createVideoThumbnail == null) {
                        str = "video file not supported";
                        VastLog.d("VastRequest", str);
                    } else if (!createVideoThumbnail.equals(Bitmap.createBitmap(createVideoThumbnail.getWidth(), createVideoThumbnail.getHeight(), createVideoThumbnail.getConfig()))) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(context, a2);
                            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                            int i2 = this.n;
                            if (i2 != 0) {
                                if (parseLong > ((long) i2)) {
                                    a();
                                    a(context, (int) LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE, (VastErrorListener) vastRequestListener);
                                    a(context);
                                    return;
                                }
                            }
                            this.f3140c = a2;
                            a(vastAd);
                            a(vastRequestListener);
                        } catch (Exception e2) {
                            VastLog.a("VastRequest", (Throwable) e2);
                        }
                        a(context);
                        return;
                    } else {
                        str = "empty thumbnail";
                        VastLog.d("VastRequest", str);
                    }
                    a();
                    a(context, (int) TTAdConstant.DEEPLINK_UNAVAILABLE_CODE, (VastErrorListener) vastRequestListener);
                    a(context);
                    return;
                }
            }
            VastLog.d("VastRequest", "fileUri is null");
            a();
            a(context, 301, (VastErrorListener) vastRequestListener);
        } catch (Exception unused) {
            VastLog.d("VastRequest", "exception when to cache file");
            a();
            a(context, 301, (VastErrorListener) vastRequestListener);
        }
    }

    public final void a(VastRequestListener vastRequestListener) {
        if (!this.w.getAndSet(true)) {
            VastLog.d("VastRequest", "sendReady");
            if (vastRequestListener != null) {
                Utils.onUiThread(new d(vastRequestListener));
            }
        }
    }

    public final synchronized void a(VastAd vastAd) {
        if (this.i != null) {
            Utils.onUiThread(new g(vastAd));
        }
    }

    public void addExtra(String str, String str2) {
        if (this.f3144g == null) {
            this.f3144g = new Bundle();
        }
        this.f3144g.putString(str, str2);
    }

    public final String b(Context context) {
        File externalFilesDir = context.getExternalFilesDir((String) null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getPath() + "/vast_rtb_cache/";
    }

    public boolean canDisplay() {
        return this.w.get() && (this.f3139b != CacheControl.FullLoad || checkFile());
    }

    public boolean checkFile() {
        try {
            Uri uri = this.f3140c;
            return uri != null && !TextUtils.isEmpty(uri.getPath()) && new File(this.f3140c.getPath()).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public void display(Context context, VideoType videoType, VastActivityListener vastActivityListener) {
        display(context, videoType, vastActivityListener, (VastPlaybackListener) null, (VastAdMeasurer) null);
    }

    public void display(Context context, VideoType videoType, VastActivityListener vastActivityListener, VastPlaybackListener vastPlaybackListener, VastAdMeasurer vastAdMeasurer) {
        this.x.set(true);
        VastLog.d("VastRequest", "play");
        if (this.f3141d == null) {
            VastLog.d("VastRequest", "vastAd is null; nothing to play");
        } else if (Utils.isNetworkAvailable(context)) {
            this.f3143f = videoType;
            this.o = context.getResources().getConfiguration().orientation;
            if (!new VastActivity.Builder().setRequest(this).setListener(vastActivityListener).setPlaybackListener(vastPlaybackListener).setAdMeasurer(vastAdMeasurer).display(context)) {
                a(context, 2, (VastErrorListener) vastActivityListener);
            }
        } else {
            a(context, 1, (VastErrorListener) vastActivityListener);
        }
    }

    public void display(VastView vastView) {
        this.x.set(true);
        if (this.f3141d != null) {
            this.f3143f = VideoType.NonRewarded;
            c.b(this);
            vastView.display(this, Boolean.FALSE);
            return;
        }
        VastLog.d("VastRequest", "vastAd is null; nothing to play");
    }

    public void fireErrorUrls(List<String> list, Bundle bundle) {
        fireUrls(list, bundle);
    }

    public void fireUrls(List<String> list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3144g;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (list != null) {
            VastUrlProcessorRegistry.a(list, bundle2, z);
        } else {
            VastLog.d("VastRequest", "Url list is null");
        }
    }

    public CacheControl getCacheControl() {
        return this.f3139b;
    }

    public float getCompanionCloseTime() {
        return this.l;
    }

    public Uri getFileUri() {
        return this.f3140c;
    }

    public int getForceOrientation() {
        return this.v;
    }

    public String getId() {
        return this.f3138a;
    }

    public int getMaxDurationMillis() {
        return this.n;
    }

    public float getPlaceholderTimeoutSec() {
        return this.j;
    }

    public int getPreferredVideoOrientation() {
        if (!shouldUseScreenSizeForVideoOrientation()) {
            return 0;
        }
        VastAd vastAd = this.f3141d;
        if (vastAd == null) {
            return 2;
        }
        MediaFileTag pickedMediaFileTag = vastAd.getPickedMediaFileTag();
        return Utils.orientationBySize(pickedMediaFileTag.getWidth(), pickedMediaFileTag.getHeight());
    }

    public int getRequestedOrientation() {
        return this.o;
    }

    public VastAd getVastAd() {
        return this.f3141d;
    }

    public float getVideoCloseTime() {
        return this.k;
    }

    public VideoType getVideoType() {
        return this.f3143f;
    }

    public boolean isAutoClose() {
        return this.p;
    }

    public boolean isForceUseNativeCloseTime() {
        return this.m;
    }

    public boolean isR1() {
        return this.t;
    }

    public boolean isR2() {
        return this.u;
    }

    public void loadVideoWithData(Context context, String str, VastRequestListener vastRequestListener) {
        int i2;
        VastLog.d("VastRequest", "loadVideoWithData\n" + str);
        this.f3141d = null;
        if (Utils.isNetworkAvailable(context)) {
            try {
                new b(context, str, vastRequestListener).start();
            } catch (Exception unused) {
                i2 = 301;
            }
        } else {
            i2 = 1;
            a(context, i2, (VastErrorListener) vastRequestListener);
        }
    }

    public void loadVideoWithDataSync(Context context, String str, VastRequestListener vastRequestListener) {
        com.explorestack.iab.vast.processor.b bVar = this.f3145h;
        if (bVar == null) {
            bVar = new a(context);
        }
        com.explorestack.iab.vast.processor.d a2 = new com.explorestack.iab.vast.processor.c(this, bVar).a(str);
        if (!a2.d()) {
            a(context, a2.b(), (VastErrorListener) vastRequestListener);
            return;
        }
        VastAd c2 = a2.c();
        this.f3141d = c2;
        c2.setVastRequest(this);
        AppodealExtensionTag appodealExtension = this.f3141d.getAppodealExtension();
        if (appodealExtension != null) {
            Boolean isAutoRotate = appodealExtension.isAutoRotate();
            if (isAutoRotate != null) {
                if (isAutoRotate.booleanValue()) {
                    this.q = false;
                    this.r = false;
                } else {
                    this.q = true;
                    this.r = true;
                }
            }
            if (appodealExtension.getPostBannerTag().getCloseTimeSec() > 0.0f) {
                this.l = appodealExtension.getPostBannerTag().getCloseTimeSec();
            }
            if (appodealExtension.getCloseTimeSec() != null) {
                this.k = appodealExtension.getCloseTimeSec().floatValue();
            }
            this.t = appodealExtension.isR1();
            this.u = appodealExtension.isR2();
            Integer forceOrientation = appodealExtension.getForceOrientation();
            if (forceOrientation != null) {
                this.v = forceOrientation.intValue();
            }
        }
        int i2 = i.f3163a[this.f3139b.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                a(vastRequestListener);
                return;
            } else if (i2 == 3) {
                a(vastRequestListener);
            } else {
                return;
            }
        }
        a(context, this.f3141d, vastRequestListener);
    }

    public void performCache(Context context, VastRequestListener vastRequestListener) {
        if (this.f3141d == null) {
            a();
            a(context, 5, (VastErrorListener) vastRequestListener);
            return;
        }
        try {
            new c(context, vastRequestListener).start();
        } catch (Exception unused) {
            a();
            a(context, 301, (VastErrorListener) vastRequestListener);
        }
    }

    public void sendError(int i2) {
        if (this.f3141d != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("params_error_code", i2);
            fireErrorUrls(this.f3141d.getErrorUrlList(), bundle);
        }
    }

    public synchronized void setVastFileLoadedListener(d dVar) {
        this.i = dVar;
    }

    public boolean shouldPreloadCompanion() {
        return this.s;
    }

    public boolean shouldUseScreenSizeForCompanionOrientation() {
        return this.r;
    }

    public boolean shouldUseScreenSizeForVideoOrientation() {
        return this.q;
    }
}

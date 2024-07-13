package io.bidmachine.utils;

import com.explorestack.iab.CacheControl;
import io.bidmachine.protobuf.CreativeLoadingMethod;

public class IabUtils {
    private static final CacheControl DEFAULT_CACHE_CONTROL = CacheControl.FullLoad;
    public static final String KEY_CACHE_CONTROL = "cacheControl";
    public static final String KEY_CLICK_URL = "clickUrl";
    public static final String KEY_CLOSABLE_VIEW_STYLE = "closeable_view_style";
    public static final String KEY_COMPANION_SKIP_OFFSET = "companionSkipOffset";
    public static final String KEY_COUNTDOWN_STYLE = "countdown_style";
    public static final String KEY_CREATIVE_ADM = "creativeAdm";
    public static final String KEY_CREATIVE_ID = "creativeId";
    public static final String KEY_CTA = "cta";
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_ICON_URL = "iconUrl";
    public static final String KEY_IMAGE_URL = "imageUrl";
    public static final String KEY_OM_SDK_ENABLED = "omsdk_enabled";
    public static final String KEY_PLACEHOLDER_TIMEOUT_SEC = "placeholderTimeoutSec";
    public static final String KEY_PROGRESS_DURATION = "progress_duration";
    public static final String KEY_PROGRESS_STYLE = "progress_style";
    public static final String KEY_R1 = "r1";
    public static final String KEY_R2 = "r2";
    public static final String KEY_RATING = "rating";
    public static final String KEY_SKIP_OFFSET = "skipOffset";
    public static final String KEY_STORE_URL = "store_url";
    public static final String KEY_TITLE = "title";
    public static final String KEY_USE_NATIVE_CLOSE = "useNativeClose";
    public static final String KEY_VIDEO_ADM = "videoAdm";
    public static final String KEY_VIDEO_URL = "videoUrl";
    public static final String KEY_WIDTH = "width";

    public static CacheControl toCacheControl(Object obj) {
        if (obj == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        if (obj instanceof CacheControl) {
            return (CacheControl) obj;
        }
        CreativeLoadingMethod creativeLoadingMethod = null;
        if (obj instanceof CreativeLoadingMethod) {
            creativeLoadingMethod = (CreativeLoadingMethod) obj;
        } else if (obj instanceof String) {
            try {
                creativeLoadingMethod = CreativeLoadingMethod.valueOf((String) obj);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (creativeLoadingMethod == null) {
            return DEFAULT_CACHE_CONTROL;
        }
        int i = AnonymousClass1.$SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod[creativeLoadingMethod.ordinal()];
        if (i == 1) {
            return CacheControl.Stream;
        }
        if (i != 2) {
            return DEFAULT_CACHE_CONTROL;
        }
        return CacheControl.PartialLoad;
    }

    /* renamed from: io.bidmachine.utils.IabUtils$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.bidmachine.protobuf.CreativeLoadingMethod[] r0 = io.bidmachine.protobuf.CreativeLoadingMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod = r0
                io.bidmachine.protobuf.CreativeLoadingMethod r1 = io.bidmachine.protobuf.CreativeLoadingMethod.Stream     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$bidmachine$protobuf$CreativeLoadingMethod     // Catch:{ NoSuchFieldError -> 0x001d }
                io.bidmachine.protobuf.CreativeLoadingMethod r1 = io.bidmachine.protobuf.CreativeLoadingMethod.PartialLoad     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.utils.IabUtils.AnonymousClass1.<clinit>():void");
        }
    }
}

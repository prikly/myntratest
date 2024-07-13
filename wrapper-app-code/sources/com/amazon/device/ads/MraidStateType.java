package com.amazon.device.ads;

import com.appnext.ads.fullscreen.RewardedVideo;

enum MraidStateType {
    LOADING,
    DEFAULT,
    EXPANDED,
    RESIZED,
    HIDDEN;

    /* renamed from: com.amazon.device.ads.MraidStateType$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.amazon.device.ads.MraidStateType[] r0 = com.amazon.device.ads.MraidStateType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$amazon$device$ads$MraidStateType = r0
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.LOADING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.HIDDEN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.RESIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$amazon$device$ads$MraidStateType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.amazon.device.ads.MraidStateType r1 = com.amazon.device.ads.MraidStateType.EXPANDED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.MraidStateType.AnonymousClass1.<clinit>():void");
        }
    }

    public String toString() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$device$ads$MraidStateType[ordinal()];
        if (i == 1) {
            return "loading";
        }
        if (i == 2) {
            return "hidden";
        }
        if (i == 3) {
            return RewardedVideo.VIDEO_MODE_DEFAULT;
        }
        if (i != 4) {
            return i != 5 ? "" : "expanded";
        }
        return "resized";
    }
}

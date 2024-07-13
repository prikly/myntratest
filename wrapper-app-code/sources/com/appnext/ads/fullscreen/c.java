package com.appnext.ads.fullscreen;

import com.appnext.core.f;
import com.appnext.core.p;
import com.appodeal.ads.adapters.admob.BuildConfig;
import java.util.HashMap;

public final class c extends p {
    private static c aP;
    private String aQ = ("https://cdn.appnext.com/tools/sdk/confign/fullscreen/" + f.bi() + "/fullscreen_config.txt");
    private HashMap<String, String> aR = null;

    public static synchronized c m() {
        c cVar;
        synchronized (c.class) {
            if (aP == null) {
                aP = new c();
            }
            cVar = aP;
        }
        return cVar;
    }

    private c() {
    }

    /* access modifiers changed from: protected */
    public final String getUrl() {
        return this.aQ;
    }

    /* access modifiers changed from: protected */
    public final HashMap<String, String> n() {
        return this.aR;
    }

    public final void setUrl(String str) {
        this.aQ = str;
    }

    public final void a(HashMap<String, String> hashMap) {
        this.aR = hashMap;
    }

    /* access modifiers changed from: protected */
    public final HashMap<String, String> o() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("can_close", "true");
        hashMap.put("show_close", "true");
        hashMap.put("show_close_time", "2000");
        hashMap.put("video_length", "15");
        hashMap.put("mute", "false");
        hashMap.put("urlApp_protection", "false");
        hashMap.put("pview", "true");
        hashMap.put("min_internet_connection_video", "3g");
        hashMap.put("banner_expiration_time", BuildConfig.ADAPTER_VERSION);
        hashMap.put("postpone_vta_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("postpone_impression_sec", BuildConfig.ADAPTER_VERSION);
        hashMap.put("resolve_timeout", "8");
        hashMap.put("num_saved_videos", "5");
        hashMap.put("caption_text_time", "3");
        hashMap.put("ads_caching_time_minutes", BuildConfig.ADAPTER_VERSION);
        hashMap.put("gdpr", "false");
        hashMap.put("clickType_a", BuildConfig.ADAPTER_VERSION);
        hashMap.put("clickType_b", BuildConfig.ADAPTER_VERSION);
        hashMap.put("didPrivacy", "false");
        hashMap.put("stp_flag", "false");
        return hashMap;
    }
}

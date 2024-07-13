package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;

public class Kg {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f4438a;

    public Kg() {
        HashMap hashMap = new HashMap();
        this.f4438a = hashMap;
        hashMap.put("easy_collecting", "ec");
        hashMap.put("cells_around", "ca");
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("throttling", "tht");
        hashMap.put("wifi_around", "wa");
        hashMap.put("wifi_connected", "wc");
        hashMap.put("features_collecting", "fc");
        hashMap.put("cell_additional_info", "cai");
        hashMap.put("cell_additional_info_connected_only", "caico");
        hashMap.put("location_collecting", "lc");
        hashMap.put("lbs_collecting", "lbs");
        hashMap.put("package_info", "pi");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("sdk_list", "sl");
        hashMap.put("socket", "s");
        hashMap.put("identity_light_collecting", "ilc");
        hashMap.put("gpl_collecting", "gplc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("ui_parsing", "up");
        hashMap.put("ui_collecting_for_bridge", "ucfb");
        hashMap.put("ui_event_sending", "ues");
        hashMap.put("ui_raw_event_sending", "ures");
        hashMap.put("cache_control", "cc");
        hashMap.put("mediascope_api_keys", "mak");
        hashMap.put("diagnostics", "d");
        hashMap.put("auto_inapp_collecting", "aic");
        hashMap.put("attribution", "at");
        hashMap.put("egress", "eg");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
    }

    public String a(String str) {
        return this.f4438a.containsKey(str) ? this.f4438a.get(str) : str;
    }
}

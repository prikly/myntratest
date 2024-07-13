package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.o;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f10775a;

    public a(File file) {
        String a2;
        File c2 = o.c(file);
        if (c2.exists() && c2.length() != 0 && (a2 = NativeImpl.a(c2.getAbsolutePath())) != null) {
            String[] split = a2.split("\n");
            this.f10775a = new HashMap();
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3.length == 2) {
                    this.f10775a.put(split3[0], split3[1]);
                }
            }
        }
    }

    public boolean a() {
        Map<String, String> map = this.f10775a;
        return map != null && !map.isEmpty() && !TextUtils.isEmpty(this.f10775a.get("process_name")) && !TextUtils.isEmpty(this.f10775a.get("crash_thread_name")) && !TextUtils.isEmpty(this.f10775a.get("pid")) && !TextUtils.isEmpty(this.f10775a.get(ScarConstants.TOKEN_ID_KEY)) && !TextUtils.isEmpty(this.f10775a.get("start_time")) && !TextUtils.isEmpty(this.f10775a.get("crash_time")) && !TextUtils.isEmpty(this.f10775a.get("signal_line"));
    }

    public String b() {
        return this.f10775a.get("signal_line");
    }

    public Map<String, String> c() {
        return this.f10775a;
    }
}

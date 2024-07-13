package com.apm.insight.runtime;

import android.content.Context;
import com.apm.insight.b;
import com.apm.insight.l.i;
import com.apm.insight.l.l;
import com.apm.insight.l.o;
import com.apm.insight.l.r;
import com.appnext.ads.fullscreen.RewardedVideo;
import com.appnext.banners.BannerAdRequest;
import com.appodeal.ads.modules.common.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private Context f10861a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, Long> f10862b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f10863c = 50;

    /* renamed from: d  reason: collision with root package name */
    private int f10864d = 100;

    public h(Context context) {
        this.f10861a = context;
        this.f10862b = c();
        b();
    }

    private void a(File file) {
        File g2 = o.g(this.f10861a);
        file.renameTo(new File(g2, String.valueOf(System.currentTimeMillis())));
        String[] list = g2.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            new File(g2, list[0]).delete();
        }
    }

    private void b() {
        this.f10863c = a.a(this.f10863c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f10864d = a.a(this.f10864d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> c() {
        File h2 = o.h(this.f10861a);
        HashMap<String, Long> hashMap = new HashMap<>();
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray b2 = i.b(h2.getAbsolutePath());
            if (l.a(b2)) {
                return hashMap;
            }
            Long decode = Long.decode(b2.optString(0, (String) null));
            if (System.currentTimeMillis() - decode.longValue() > Constants.MILLIS_IN_DAY) {
                a(h2);
                return hashMap;
            }
            hashMap.put("time", decode);
            for (int i = 1; i < b2.length(); i++) {
                String[] split = b2.optString(i, "").split(" ");
                if (split.length == 2) {
                    hashMap.put(split[0], Long.decode(split[1]));
                }
            }
            return hashMap;
        } catch (IOException unused) {
        } catch (Throwable th) {
            b.a().a("NPTH_CATCH", th);
        }
    }

    public void a() {
        HashMap<String, Long> hashMap = this.f10862b;
        Long remove = hashMap.remove("time");
        if (remove == null) {
            b.a().a("NPTH_CATCH", (Throwable) new RuntimeException("err times, no time"));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(remove);
        sb.append(10);
        for (Map.Entry next : hashMap.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(' ');
            sb.append(next.getValue());
            sb.append(10);
        }
        try {
            i.a(o.h(this.f10861a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    public boolean a(String str) {
        if (str == null) {
            str = RewardedVideo.VIDEO_MODE_DEFAULT;
        }
        return r.a(this.f10862b, str, 1L).longValue() < ((long) this.f10863c) && r.a(this.f10862b, BannerAdRequest.TYPE_ALL, 1L).longValue() < ((long) this.f10864d);
    }
}

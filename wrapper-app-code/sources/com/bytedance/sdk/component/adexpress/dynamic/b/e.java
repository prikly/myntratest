package com.bytedance.sdk.component.adexpress.dynamic.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DynamicLayoutBrick */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Integer> f18503a;

    /* renamed from: b  reason: collision with root package name */
    private String f18504b;

    /* renamed from: c  reason: collision with root package name */
    private String f18505c;

    /* renamed from: d  reason: collision with root package name */
    private f f18506d;

    /* renamed from: e  reason: collision with root package name */
    private f f18507e;

    /* renamed from: f  reason: collision with root package name */
    private String f18508f;

    static {
        HashMap hashMap = new HashMap();
        f18503a = hashMap;
        hashMap.put("root", 8);
        f18503a.put("footer", 6);
        f18503a.put("empty", 6);
        f18503a.put("title", 0);
        f18503a.put("subtitle", 0);
        f18503a.put("source", 0);
        f18503a.put("score-count", 0);
        f18503a.put("text_star", 0);
        f18503a.put("text", 0);
        f18503a.put("tag-group", 17);
        f18503a.put("app-version", 0);
        f18503a.put("development-name", 0);
        f18503a.put("privacy-detail", 23);
        f18503a.put("image", 1);
        f18503a.put("image-wide", 1);
        f18503a.put("image-square", 1);
        f18503a.put("image-long", 1);
        f18503a.put("image-splash", 1);
        f18503a.put("image-cover", 1);
        f18503a.put("app-icon", 1);
        f18503a.put("icon-download", 1);
        f18503a.put("logoad", 4);
        f18503a.put("logounion", 5);
        f18503a.put("logo-union", 9);
        f18503a.put("dislike", 3);
        f18503a.put("close", 3);
        f18503a.put("close-fill", 3);
        f18503a.put("webview-close", 22);
        f18503a.put("feedback-dislike", 12);
        f18503a.put("button", 2);
        f18503a.put("downloadWithIcon", 2);
        f18503a.put("downloadButton", 2);
        f18503a.put("fillButton", 2);
        f18503a.put("laceButton", 2);
        f18503a.put("cardButton", 2);
        f18503a.put("colourMixtureButton", 2);
        f18503a.put("arrowButton", 1);
        f18503a.put("download-progress-button", 2);
        f18503a.put("vessel", 6);
        f18503a.put("image-group", 6);
        f18503a.put("custom-component-vessel", 6);
        f18503a.put("carousel", 24);
        f18503a.put("video-hd", 7);
        f18503a.put("video", 7);
        f18503a.put("video-vd", 7);
        f18503a.put("muted", 10);
        f18503a.put("star", 11);
        f18503a.put("skip-countdowns", 19);
        f18503a.put("skip-with-countdowns-skip-btn", 21);
        f18503a.put("skip-with-countdowns-video-countdown", 13);
        f18503a.put("skip-with-countdowns-skip-countdown", 20);
        f18503a.put("skip-with-time", 14);
        f18503a.put("skip-with-time-countdown", 13);
        f18503a.put("skip-with-time-skip-btn", 15);
        f18503a.put("skip", 15);
        f18503a.put("timedown", 13);
        f18503a.put("icon", 16);
        f18503a.put("scoreCountWithIcon", 6);
        f18503a.put("split-line", 18);
        f18503a.put("creative-playable-bait", 0);
        f18503a.put("score-count-type-2", 0);
    }

    public int a() {
        if (TextUtils.isEmpty(this.f18504b)) {
            return 0;
        }
        if (this.f18504b.equals("logo")) {
            String str = this.f18504b + this.f18505c;
            this.f18504b = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f18504b.contains("logounion")) {
                return 5;
            }
        }
        if (f18503a.get(this.f18504b) != null) {
            return f18503a.get(this.f18504b).intValue();
        }
        return -1;
    }

    public String b() {
        return this.f18504b;
    }

    public void a(String str) {
        this.f18504b = str;
    }

    public String c() {
        return this.f18505c;
    }

    public void b(String str) {
        this.f18505c = str;
    }

    public void c(String str) {
        this.f18508f = str;
    }

    public String d() {
        return this.f18508f;
    }

    public f e() {
        return this.f18506d;
    }

    public void a(f fVar) {
        this.f18506d = fVar;
    }

    public void b(f fVar) {
        this.f18507e = fVar;
    }

    public f f() {
        return this.f18507e;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f18504b + '\'' + ", data='" + this.f18505c + '\'' + ", value=" + this.f18506d + ", themeValue=" + this.f18507e + ", dataExtraInfo='" + this.f18508f + '\'' + '}';
    }

    public static void a(JSONObject jSONObject, e eVar) {
        if (jSONObject != null && eVar != null) {
            eVar.a(jSONObject.optString("type", "root"));
            eVar.b(jSONObject.optString("data"));
            eVar.c(jSONObject.optString("dataExtraInfo"));
            f c2 = f.c(jSONObject.optJSONObject("values"));
            f c3 = f.c(jSONObject.optJSONObject("nightThemeValues"));
            eVar.a(c2);
            eVar.b(c3);
        }
    }
}

package com.applovin.impl.b;

import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.s;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final List<String> f14281c = Arrays.asList(new String[]{"video/mp4", MimeTypes.VIDEO_WEBM, "video/3gpp", "video/x-matroska"});

    /* renamed from: a  reason: collision with root package name */
    protected List<s> f14282a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final n f14283b;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f14284d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f14285e;

    /* renamed from: f  reason: collision with root package name */
    private final b f14286f;

    /* renamed from: g  reason: collision with root package name */
    private final long f14287g = System.currentTimeMillis();

    public e(JSONObject jSONObject, JSONObject jSONObject2, b bVar, n nVar) {
        this.f14283b = nVar;
        this.f14284d = jSONObject;
        this.f14285e = jSONObject2;
        this.f14286f = bVar;
    }

    public int a() {
        return this.f14282a.size();
    }

    public List<s> b() {
        return this.f14282a;
    }

    public JSONObject c() {
        return this.f14284d;
    }

    public JSONObject d() {
        return this.f14285e;
    }

    public b e() {
        return this.f14286f;
    }

    public long f() {
        return this.f14287g;
    }

    public List<String> g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f14284d, "vast_preferred_video_types", (String) null));
        return !explode.isEmpty() ? explode : f14281c;
    }

    public int h() {
        return Utils.getVideoCompletionPercent(this.f14284d);
    }
}

package com.bykv.vk.openvk.component.video.api.c;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: VideoInfo */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f18163a;

    /* renamed from: b  reason: collision with root package name */
    private int f18164b;

    /* renamed from: c  reason: collision with root package name */
    private long f18165c;

    /* renamed from: d  reason: collision with root package name */
    private double f18166d;

    /* renamed from: e  reason: collision with root package name */
    private String f18167e;

    /* renamed from: f  reason: collision with root package name */
    private String f18168f;

    /* renamed from: g  reason: collision with root package name */
    private String f18169g;

    /* renamed from: h  reason: collision with root package name */
    private String f18170h;
    private String i;
    private String j;
    private int k;
    private int l;
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private int q = 307200;

    public int a() {
        return this.k;
    }

    public void a(int i2) {
        this.k = i2;
    }

    public int b() {
        return this.f18163a;
    }

    public void b(int i2) {
        this.f18163a = i2;
    }

    public int c() {
        return this.f18164b;
    }

    public void c(int i2) {
        this.f18164b = i2;
    }

    public int d() {
        return this.l;
    }

    public void d(int i2) {
        this.l = i2;
    }

    public long e() {
        return this.f18165c;
    }

    public void a(long j2) {
        this.f18165c = j2;
    }

    public double f() {
        return this.f18166d;
    }

    public void a(double d2) {
        this.f18166d = d2;
    }

    public String g() {
        return this.f18167e;
    }

    public void a(String str) {
        this.f18167e = str;
    }

    public String h() {
        return this.f18168f;
    }

    public void b(String str) {
        this.f18168f = str;
    }

    public String i() {
        return this.f18169g;
    }

    public void c(String str) {
        this.f18169g = str;
    }

    public String j() {
        return this.f18170h;
    }

    public void d(String str) {
        this.f18170h = str;
    }

    public String k() {
        return this.i;
    }

    public void e(String str) {
        this.i = str;
    }

    public String l() {
        if (TextUtils.isEmpty(this.j)) {
            this.j = com.bykv.vk.openvk.component.video.api.f.b.a(this.f18169g);
        }
        return this.j;
    }

    public void f(String str) {
        this.j = str;
    }

    public int m() {
        if (this.q < 0) {
            this.q = 307200;
        }
        long j2 = this.f18165c;
        if (((long) this.q) > j2) {
            this.q = (int) j2;
        }
        return this.q;
    }

    public void e(int i2) {
        this.q = i2;
    }

    public int n() {
        return this.o;
    }

    public void f(int i2) {
        this.o = i2;
    }

    public int o() {
        return this.p;
    }

    public void g(int i2) {
        this.p = i2;
    }

    public JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", b());
            jSONObject.put("cover_url", h());
            jSONObject.put("cover_width", c());
            jSONObject.put("endcard", j());
            jSONObject.put("file_hash", l());
            jSONObject.put("resolution", g());
            jSONObject.put("size", e());
            jSONObject.put("video_duration", f());
            jSONObject.put("video_url", i());
            jSONObject.put("playable_download_url", k());
            jSONObject.put("if_playable_loading_show", q());
            jSONObject.put("remove_loading_page_type", r());
            jSONObject.put("fallback_endcard_judge", a());
            jSONObject.put("video_preload_size", m());
            jSONObject.put("reward_video_cached_type", n());
            jSONObject.put("execute_cached_type", o());
            jSONObject.put("endcard_render", d());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int q() {
        return this.m;
    }

    public void h(int i2) {
        this.m = i2;
    }

    public int r() {
        return this.n;
    }

    public void i(int i2) {
        this.n = i2;
    }

    public boolean s() {
        return this.p == 1;
    }

    public boolean t() {
        return this.o == 0;
    }
}

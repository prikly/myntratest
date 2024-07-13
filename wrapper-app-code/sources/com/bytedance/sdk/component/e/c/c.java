package com.bytedance.sdk.component.e.c;

import java.util.Map;

/* compiled from: TNCConfig */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19158a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f19159b = true;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Integer> f19160c = null;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f19161d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f19162e = 10;

    /* renamed from: f  reason: collision with root package name */
    public int f19163f = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f19164g = 1;

    /* renamed from: h  reason: collision with root package name */
    public int f19165h = 10;
    public int i = 1;
    public int j = 1;
    public int k = 900;
    public int l = 120;
    public String m = null;
    public int n = 0;
    public long o = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f19158a);
        sb.append(" probeEnable: ");
        sb.append(this.f19159b);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.f19160c;
        int i2 = 0;
        sb.append(map != null ? map.size() : 0);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.f19161d;
        if (map2 != null) {
            i2 = map2.size();
        }
        sb.append(i2);
        sb.append(" reqTo: ");
        sb.append(this.f19162e);
        sb.append("#");
        sb.append(this.f19163f);
        sb.append("#");
        sb.append(this.f19164g);
        sb.append(" reqErr: ");
        sb.append(this.f19165h);
        sb.append("#");
        sb.append(this.i);
        sb.append("#");
        sb.append(this.j);
        sb.append(" updateInterval: ");
        sb.append(this.k);
        sb.append(" updateRandom: ");
        sb.append(this.l);
        sb.append(" httpBlack: ");
        sb.append(this.m);
        return sb.toString();
    }
}

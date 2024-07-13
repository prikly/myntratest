package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.bi  reason: case insensitive filesystem */
public class C0286bi {

    /* renamed from: a  reason: collision with root package name */
    public final String f5550a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5551b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5552c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Pair<String, String>> f5553d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f5554e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f5555f;

    /* renamed from: com.yandex.metrica.impl.ob.bi$a */
    public enum a {
        WIFI,
        CELL
    }

    public C0286bi(String str, String str2, String str3, List<Pair<String, String>> list, Long l, List<a> list2) {
        this.f5550a = str;
        this.f5551b = str2;
        this.f5552c = str3;
        this.f5553d = A2.c(list);
        this.f5554e = l;
        this.f5555f = list2;
    }
}

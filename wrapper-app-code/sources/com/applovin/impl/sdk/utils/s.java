package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f15948a = new s();

    /* renamed from: b  reason: collision with root package name */
    protected String f15949b;

    /* renamed from: c  reason: collision with root package name */
    protected final List<s> f15950c;

    /* renamed from: d  reason: collision with root package name */
    private final s f15951d;

    /* renamed from: e  reason: collision with root package name */
    private final String f15952e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f15953f;

    private s() {
        this.f15951d = null;
        this.f15952e = "";
        this.f15953f = Collections.emptyMap();
        this.f15949b = "";
        this.f15950c = Collections.emptyList();
    }

    public s(String str, Map<String, String> map, s sVar) {
        this.f15951d = sVar;
        this.f15952e = str;
        this.f15953f = Collections.unmodifiableMap(map);
        this.f15950c = new ArrayList();
    }

    public String a() {
        return this.f15952e;
    }

    public List<s> a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f15950c.size());
            for (s next : this.f15950c) {
                if (str.equalsIgnoreCase(next.a())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public s b(String str) {
        if (str != null) {
            for (s next : this.f15950c) {
                if (str.equalsIgnoreCase(next.a())) {
                    return next;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map<String, String> b() {
        return this.f15953f;
    }

    public s c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        } else if (this.f15950c.size() <= 0) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                s sVar = (s) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(sVar.a())) {
                    return sVar;
                }
                arrayList.addAll(sVar.d());
            }
            return null;
        }
    }

    public String c() {
        return this.f15949b;
    }

    public List<s> d() {
        return Collections.unmodifiableList(this.f15950c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f15952e + '\'' + ", text='" + this.f15949b + '\'' + ", attributes=" + this.f15953f + '}';
    }
}

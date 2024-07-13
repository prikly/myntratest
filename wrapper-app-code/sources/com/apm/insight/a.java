package com.apm.insight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Map<CrashType, List<AttachUserData>> f10433a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<CrashType, List<AttachUserData>> f10434b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f10435c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private ICrashFilter f10436d = null;

    private void c(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f10433a.get(crashType) == null) {
            list = new ArrayList();
            this.f10433a.put(crashType, list);
        } else {
            list = this.f10433a.get(crashType);
        }
        list.add(attachUserData);
    }

    private void d(CrashType crashType, AttachUserData attachUserData) {
        List list;
        if (this.f10434b.get(crashType) == null) {
            list = new ArrayList();
            this.f10434b.put(crashType, list);
        } else {
            list = this.f10434b.get(crashType);
        }
        list.add(attachUserData);
    }

    private void e(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f10433a.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    private void f(CrashType crashType, AttachUserData attachUserData) {
        List list = this.f10434b.get(crashType);
        if (list != null) {
            list.remove(attachUserData);
        }
    }

    public List<AttachUserData> a(CrashType crashType) {
        return this.f10433a.get(crashType);
    }

    public Map<String, String> a() {
        return this.f10435c;
    }

    /* access modifiers changed from: package-private */
    public void a(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            c(CrashType.LAUNCH, attachUserData);
            c(CrashType.JAVA, attachUserData);
            c(CrashType.CUSTOM_JAVA, attachUserData);
            c(CrashType.NATIVE, attachUserData);
            c(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        c(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    public void a(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            e(CrashType.LAUNCH, attachUserData);
            e(CrashType.JAVA, attachUserData);
            e(CrashType.CUSTOM_JAVA, attachUserData);
            e(CrashType.NATIVE, attachUserData);
            e(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        e(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    public void a(ICrashFilter iCrashFilter) {
        this.f10436d = iCrashFilter;
    }

    /* access modifiers changed from: package-private */
    public void a(Map<? extends String, ? extends String> map) {
        this.f10435c.putAll(map);
    }

    public ICrashFilter b() {
        return this.f10436d;
    }

    public List<AttachUserData> b(CrashType crashType) {
        return this.f10434b.get(crashType);
    }

    /* access modifiers changed from: package-private */
    public void b(AttachUserData attachUserData, CrashType crashType) {
        if (crashType == CrashType.ALL) {
            d(CrashType.LAUNCH, attachUserData);
            d(CrashType.JAVA, attachUserData);
            d(CrashType.CUSTOM_JAVA, attachUserData);
            d(CrashType.NATIVE, attachUserData);
            d(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        d(crashType, attachUserData);
    }

    /* access modifiers changed from: package-private */
    public void b(CrashType crashType, AttachUserData attachUserData) {
        if (crashType == CrashType.ALL) {
            f(CrashType.LAUNCH, attachUserData);
            f(CrashType.JAVA, attachUserData);
            f(CrashType.CUSTOM_JAVA, attachUserData);
            f(CrashType.NATIVE, attachUserData);
            f(CrashType.ANR, attachUserData);
            crashType = CrashType.DART;
        }
        f(crashType, attachUserData);
    }
}

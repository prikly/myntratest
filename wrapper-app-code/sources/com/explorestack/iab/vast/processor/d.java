package com.explorestack.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import com.explorestack.iab.vast.VastUrlProcessorRegistry;
import com.explorestack.iab.vast.tags.AdContentTag;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f3257a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public VastAd f3258b;

    /* renamed from: c  reason: collision with root package name */
    public int f3259c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3260d = true;

    public List<String> a() {
        return this.f3257a;
    }

    public void a(int i) {
        this.f3259c = i;
    }

    public void a(VastAd vastAd) {
        this.f3258b = vastAd;
    }

    public void a(AdContentTag adContentTag, int i) {
        a(i);
        Bundle bundle = new Bundle();
        bundle.putInt("params_error_code", i);
        List<String> errorUrlList = adContentTag.getErrorUrlList();
        if (errorUrlList != null && !errorUrlList.isEmpty()) {
            for (String a2 : errorUrlList) {
                String a3 = VastUrlProcessorRegistry.a(a2, bundle);
                if (!TextUtils.isEmpty(a3)) {
                    this.f3257a.add(a3);
                }
            }
        }
    }

    public void a(boolean z) {
        this.f3260d = z;
    }

    public int b() {
        return this.f3259c;
    }

    public VastAd c() {
        return this.f3258b;
    }

    public boolean d() {
        return this.f3258b != null;
    }

    public boolean e() {
        return this.f3260d;
    }
}

package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

public class FilterWord {

    /* renamed from: a  reason: collision with root package name */
    private String f19312a;

    /* renamed from: b  reason: collision with root package name */
    private String f19313b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19314c;

    /* renamed from: d  reason: collision with root package name */
    private List<FilterWord> f19315d;

    public FilterWord(String str, String str2) {
        this.f19312a = str;
        this.f19313b = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.f19312a;
    }

    public void setId(String str) {
        this.f19312a = str;
    }

    public String getName() {
        return this.f19313b;
    }

    public void setName(String str) {
        this.f19313b = str;
    }

    public boolean getIsSelected() {
        return this.f19314c;
    }

    public void setIsSelected(boolean z) {
        this.f19314c = z;
    }

    public List<FilterWord> getOptions() {
        return this.f19315d;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord != null) {
            if (this.f19315d == null) {
                this.f19315d = new ArrayList();
            }
            this.f19315d.add(filterWord);
        }
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(this.f19312a) && !TextUtils.isEmpty(this.f19313b);
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.f19315d;
        return list != null && !list.isEmpty();
    }
}

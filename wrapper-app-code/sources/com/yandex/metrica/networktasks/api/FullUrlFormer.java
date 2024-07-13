package com.yandex.metrica.networktasks.api;

import android.net.Uri;
import com.yandex.metrica.networktasks.impl.b;
import java.util.ArrayList;
import java.util.List;

public class FullUrlFormer {

    /* renamed from: a  reason: collision with root package name */
    private List f7299a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private int f7300b = -1;

    /* renamed from: c  reason: collision with root package name */
    private String f7301c;

    /* renamed from: d  reason: collision with root package name */
    private final IParamsAppender f7302d;

    /* renamed from: e  reason: collision with root package name */
    private final ConfigProvider f7303e;

    public FullUrlFormer(IParamsAppender iParamsAppender, ConfigProvider configProvider) {
        this.f7302d = iParamsAppender;
        this.f7303e = configProvider;
    }

    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f7299a.get(this.f7300b)).buildUpon();
        this.f7302d.appendParams(buildUpon, this.f7303e.getConfig());
        this.f7301c = buildUpon.build().toString();
    }

    public List getAllHosts() {
        return this.f7299a;
    }

    public String getUrl() {
        return new b(this.f7301c).a();
    }

    public boolean hasMoreHosts() {
        return this.f7300b + 1 < this.f7299a.size();
    }

    public void incrementAttemptNumber() {
        this.f7300b++;
    }

    public void setHosts(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        this.f7299a = list;
    }
}

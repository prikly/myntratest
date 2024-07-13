package com.applovin.exoplayer2.d;

import android.net.Uri;
import com.applovin.exoplayer2.k.l;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public final class s extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final l f11790a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f11791b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, List<String>> f11792c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11793d;

    public s(l lVar, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.f11790a = lVar;
        this.f11791b = uri;
        this.f11792c = map;
        this.f11793d = j;
    }
}

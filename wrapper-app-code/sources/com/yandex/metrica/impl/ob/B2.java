package com.yandex.metrica.impl.ob;

import android.app.WallpaperManager;

final class B2<T, R> implements C0614om<WallpaperManager, Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f3729a;

    B2(int i) {
        this.f3729a = i;
    }

    public Object a(Object obj) {
        return Integer.valueOf(((WallpaperManager) obj).getWallpaperId(this.f3729a));
    }
}

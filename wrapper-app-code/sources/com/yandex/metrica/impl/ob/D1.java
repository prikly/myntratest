package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.util.SparseArray;
import com.yandex.metrica.YandexMetrica;

public abstract class D1 {

    interface a {
        void a(Context context);
    }

    /* access modifiers changed from: protected */
    public abstract int a(Nd nd);

    /* access modifiers changed from: package-private */
    public abstract SparseArray<a> a();

    public synchronized void a(Context context) {
        Nd nd = new Nd(context);
        int a2 = a(nd);
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        if (a2 != libraryApiLevel) {
            if (a2 > 0 && a2 < libraryApiLevel) {
                SparseArray<a> a3 = a();
                while (true) {
                    a2++;
                    if (a2 > libraryApiLevel) {
                        break;
                    }
                    a aVar = a3.get(a2);
                    if (aVar != null) {
                        aVar.a(context);
                    }
                }
            }
            a(nd, libraryApiLevel);
            nd.b();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Nd nd, int i);
}

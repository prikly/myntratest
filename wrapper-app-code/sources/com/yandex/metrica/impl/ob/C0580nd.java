package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ResponseValidityChecker;

/* renamed from: com.yandex.metrica.impl.ob.nd  reason: case insensitive filesystem */
public final class C0580nd implements ResponseValidityChecker {
    public boolean isResponseValid(int i) {
        return (i == 400 || i == 500) ? false : true;
    }
}

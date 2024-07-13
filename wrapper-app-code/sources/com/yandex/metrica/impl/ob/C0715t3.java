package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.t3  reason: case insensitive filesystem */
public final class C0715t3 implements W<Map<String, ? extends String>> {
    public Object invoke(Object obj) {
        String asString = ((ContentValues) obj).getAsString("clids");
        HashMap<String, String> d2 = Tl.d(asString);
        if (Tl.d((Map<String, String>) d2)) {
            return d2;
        }
        C0420h2.b("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}

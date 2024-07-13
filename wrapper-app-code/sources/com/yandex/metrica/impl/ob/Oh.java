package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.List;

public class Oh {

    /* renamed from: a  reason: collision with root package name */
    public final List<Pair<String, a>> f4715a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f4716a;

        public a(String str) {
            this.f4716a = str;
        }

        public String toString() {
            return this.f4716a;
        }
    }

    public Oh(List<Pair<String, a>> list) {
        this.f4715a = list;
    }

    public String toString() {
        return "AttributionConfig{deeplinkConditions=" + this.f4715a + '}';
    }
}

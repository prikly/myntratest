package com.explorestack.iab.vast;

import android.os.Bundle;
import com.explorestack.iab.vast.processor.url.UrlProcessor;
import java.util.ArrayList;
import java.util.List;

public class VastUrlProcessorRegistry {

    /* renamed from: a  reason: collision with root package name */
    public static List<UrlProcessor> f3167a = new a();

    public class a extends ArrayList<UrlProcessor> {
        public a() {
            add(new com.explorestack.iab.vast.processor.url.a());
        }
    }

    public interface b {
        void a(String str);
    }

    public static String a(String str, Bundle bundle) {
        if (str == null) {
            return null;
        }
        for (UrlProcessor prepare : f3167a) {
            str = prepare.prepare(str, bundle);
        }
        return str;
    }

    public static void a(List<String> list, Bundle bundle, b bVar) {
        if (list != null && !list.isEmpty() && bVar != null) {
            for (String a2 : list) {
                bVar.a(a(a2, bundle));
            }
        }
    }
}

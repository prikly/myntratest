package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

public final class I6 {
    public static final H6 a(Throwable th, C0790w6 w6Var, List<StackTraceElement> list, String str, Boolean bool) {
        F6 f6;
        ArrayList arrayList = null;
        if (th != null) {
            f6 = G6.a(th);
        } else {
            f6 = null;
        }
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (StackTraceElement d6 : list) {
                arrayList.add(new D6(d6));
            }
        }
        return new H6(f6, w6Var, arrayList, (String) null, (String) null, (Map<String, String>) null, str, bool);
    }

    public static final H6 a(String str, String str2, List<? extends StackTraceItem> list, String str3, String str4, Map<String, String> map, String str5, Boolean bool) {
        ArrayList arrayList;
        List<? extends StackTraceItem> list2 = list;
        if (list2 != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (StackTraceItem stackTraceItem : list) {
                arrayList.add(new D6(stackTraceItem.getClassName(), stackTraceItem.getFileName(), stackTraceItem.getLine(), stackTraceItem.getColumn(), stackTraceItem.getMethodName(), (Boolean) null));
            }
        } else {
            arrayList = null;
        }
        return new H6(new F6(str, str2, arrayList, (F6) null, (List<F6>) null), (C0790w6) null, (List<D6>) null, str3, str4, map, str5, bool);
    }
}

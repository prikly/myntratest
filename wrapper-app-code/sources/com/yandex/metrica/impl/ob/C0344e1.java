package com.yandex.metrica.impl.ob;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.e1  reason: case insensitive filesystem */
public class C0344e1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f5697a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f5698b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    public boolean a(List<StackTraceElement> list) {
        return a(list, f5697a);
    }

    public boolean b(List<StackTraceElement> list) {
        return a(list, f5698b);
    }

    private boolean a(List<StackTraceElement> list, Pattern pattern) {
        for (StackTraceElement className : list) {
            if (pattern.matcher(className.getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}

package com.iab.omid.library.appodeal;

import com.iab.omid.library.appodeal.d.e;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f7789a = Pattern.compile("<(head)( [^>]*)?>", 2);

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f7790b = Pattern.compile("<(head)( [^>]*)?/>", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f7791c = Pattern.compile("<(body)( [^>]*?)?>", 2);

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f7792d = Pattern.compile("<(body)( [^>]*?)?/>", 2);

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f7793e = Pattern.compile("<(html)( [^>]*?)?>", 2);

    /* renamed from: f  reason: collision with root package name */
    private static final Pattern f7794f = Pattern.compile("<(html)( [^>]*?)?/>", 2);

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f7795g = Pattern.compile("<!DOCTYPE [^>]*>", 2);

    static String a(String str, String str2) {
        return b(str2, "<script type=\"text/javascript\">" + str + "</script>");
    }

    private static boolean a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (i >= iArr2[0] && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end()));
                sb.append(str2);
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }

    private static int[][] a(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int indexOf = str.indexOf("<!--", i);
            if (indexOf >= 0) {
                int indexOf2 = str.indexOf("-->", indexOf);
                int[] iArr = new int[2];
                if (indexOf2 >= 0) {
                    iArr[0] = indexOf;
                    iArr[1] = indexOf2;
                    arrayList.add(iArr);
                    i = indexOf2 + 3;
                } else {
                    iArr[0] = indexOf;
                    iArr[1] = length;
                    arrayList.add(iArr);
                }
            }
            i = length;
        }
        return (int[][]) arrayList.toArray((int[][]) Array.newInstance(int.class, new int[]{0, 2}));
    }

    static String b(String str, String str2) {
        e.a(str, "HTML is null or empty");
        int[][] a2 = a(str);
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 16);
        if (b(str, sb, f7790b, str2, a2)) {
            return sb.toString();
        }
        if (a(str, sb, f7789a, str2, a2)) {
            return sb.toString();
        }
        if (b(str, sb, f7792d, str2, a2)) {
            return sb.toString();
        }
        if (a(str, sb, f7791c, str2, a2)) {
            return sb.toString();
        }
        if (b(str, sb, f7794f, str2, a2)) {
            return sb.toString();
        }
        if (a(str, sb, f7793e, str2, a2)) {
            return sb.toString();
        }
        if (a(str, sb, f7795g, str2, a2)) {
            return sb.toString();
        }
        return str2 + str;
    }

    private static boolean b(String str, StringBuilder sb, Pattern pattern, String str2, int[][] iArr) {
        Matcher matcher = pattern.matcher(str);
        int i = 0;
        while (matcher.find(i)) {
            int start = matcher.start();
            int end = matcher.end();
            if (!a(start, iArr)) {
                sb.append(str.substring(0, matcher.end() - 2));
                sb.append(">");
                sb.append(str2);
                sb.append("</");
                sb.append(matcher.group(1));
                sb.append(">");
                sb.append(str.substring(matcher.end()));
                return true;
            }
            i = end;
        }
        return false;
    }
}

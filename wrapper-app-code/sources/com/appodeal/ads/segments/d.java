package com.appodeal.ads.segments;

import com.appodeal.ads.m;
import com.appodeal.ads.utils.Version;

public final class d {
    public static boolean a(i iVar, Object obj) {
        int a2 = m.a(iVar.f17263d);
        return a2 != 0 ? (a2 == 1 || a2 == 3 || a2 == 5 || a2 == 6) && obj != null && obj.equals(iVar.f17262c) : ((Version) iVar.f17262c).compareTo((Version) obj) == 0;
    }

    public static boolean b(i iVar, Object obj) {
        int a2 = m.a(iVar.f17263d);
        if (a2 == 1) {
            return ((String) obj).toLowerCase().contains(((String) iVar.f17262c).toLowerCase());
        }
        if (a2 == 2) {
            String str = (String) obj;
            for (String equals : (String[]) iVar.f17262c) {
                if (str.equals(equals)) {
                    return true;
                }
            }
            return false;
        } else if (a2 == 4) {
            Integer num = (Integer) obj;
            for (Integer equals2 : (Integer[]) iVar.f17262c) {
                if (equals2.equals(num)) {
                    return true;
                }
            }
            return false;
        } else if (a2 != 7) {
            return false;
        } else {
            String str2 = (String) iVar.f17262c;
            int intValue = ((Integer) obj).intValue();
            return intValue >= 0 && str2.length() > intValue && str2.charAt(intValue) == '1';
        }
    }

    public static boolean c(i iVar, Object obj) {
        int i = iVar.f17263d;
        return i == 6 ? ((Float) iVar.f17262c).floatValue() > ((Float) obj).floatValue() : i == 4 ? ((Integer) iVar.f17262c).intValue() > ((Integer) obj).intValue() : i == 1 && ((Version) iVar.f17262c).compareTo((Version) obj) > 0;
    }

    public static boolean d(i iVar, Object obj) {
        return a(iVar, obj) || c(iVar, obj);
    }

    public static boolean e(i iVar, Object obj) {
        int i = iVar.f17263d;
        return i == 6 ? ((Float) obj).floatValue() % ((Float) iVar.f17262c).floatValue() == 0.0f : i == 4 && ((Integer) obj).intValue() % ((Integer) iVar.f17262c).intValue() == 0;
    }

    public static boolean f(i iVar, Object obj) {
        int i = iVar.f17263d;
        return i == 6 ? ((Float) iVar.f17262c).floatValue() < ((Float) obj).floatValue() : i == 4 ? ((Integer) iVar.f17262c).intValue() < ((Integer) obj).intValue() : i == 1 && ((Version) iVar.f17262c).compareTo((Version) obj) < 0;
    }

    public static boolean g(i iVar, Object obj) {
        return a(iVar, obj) || f(iVar, obj);
    }
}

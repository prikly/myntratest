package com.google.android.gms.internal.ads;

import com.appodeal.ads.modules.common.internal.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzp {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzgzn zzgzn, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzgzn, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb, i, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb, i, str, zzb2);
            }
        } else {
            sb.append(10);
            zzc(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzhav.zza(zzgwv.zzx((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgwv) {
                sb.append(": \"");
                sb.append(zzhav.zza((zzgwv) obj));
                sb.append('\"');
            } else if (obj instanceof zzgyd) {
                sb.append(" {");
                zzd((zzgyd) obj, sb, i + 2);
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i3 = i + 2;
                zzb(sb, i3, "key", entry.getKey());
                zzb(sb, i3, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
                sb.append("\n");
                zzc(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    private static void zzd(zzgzn zzgzn, StringBuilder sb, int i) {
        int i2;
        boolean z;
        Method method;
        Method method2;
        zzgzn zzgzn2 = zzgzn;
        StringBuilder sb2 = sb;
        int i3 = i;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgzn.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith(Constants.GET)) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i3, substring.substring(0, substring.length() - 4), zzgyd.zzaO(method2, zzgzn2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i3, substring.substring(0, substring.length() - 3), zzgyd.zzaO(method, zzgzn2, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey(Constants.GET.concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object zzaO = zzgyd.zzaO(method4, zzgzn2, new Object[0]);
                    if (method5 == null) {
                        if (zzaO instanceof Boolean) {
                            if (!((Boolean) zzaO).booleanValue()) {
                            }
                        } else if (zzaO instanceof Integer) {
                            if (((Integer) zzaO).intValue() == 0) {
                            }
                        } else if (zzaO instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaO).floatValue()) == 0) {
                            }
                        } else if (!(zzaO instanceof Double)) {
                            if (zzaO instanceof String) {
                                z = zzaO.equals("");
                            } else if (zzaO instanceof zzgwv) {
                                z = zzaO.equals(zzgwv.zzb);
                            } else if (zzaO instanceof zzgzn) {
                                if (zzaO == ((zzgzn) zzaO).zzbh()) {
                                }
                            } else if ((zzaO instanceof Enum) && ((Enum) zzaO).ordinal() == 0) {
                            }
                            if (z) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzaO).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzgyd.zzaO(method5, zzgzn2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb2, i3, substring, zzaO);
                }
            }
            i2 = 3;
        }
        if (!(zzgzn2 instanceof zzgya)) {
            zzhay zzhay = ((zzgyd) zzgzn2).zzc;
            if (zzhay != null) {
                zzhay.zzi(sb2, i3);
                return;
            }
            return;
        }
        zzgxu zzgxu = ((zzgya) zzgzn2).zzb;
        throw null;
    }
}

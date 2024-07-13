package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@5.1.0 */
final class zzp {
    static void zza(Object obj, Object obj2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("null key in entry: null=");
            sb.append(obj2);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }
}

package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;
import java.util.Map;

/* compiled from: TTClientBiddingUtil */
public class q {
    public static void a(n nVar, Double d2) {
        if (nVar != null && nVar.aj() != null) {
            Map<String, Object> aj = nVar.aj();
            try {
                Object obj = nVar.aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str = (String) aj.get("nurl");
                    if (!TextUtils.isEmpty(str)) {
                        if (d2 != null) {
                            str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d2));
                        }
                        m.f().a(str);
                    }
                }
            } catch (Throwable unused) {
                l.b("report Win error");
            }
        }
    }

    public static void a(n nVar, Double d2, String str, String str2) {
        if (nVar != null && nVar.aj() != null) {
            Map<String, Object> aj = nVar.aj();
            try {
                Object obj = nVar.aj().get("sdk_bidding_type");
                if (obj == null) {
                    return;
                }
                if (Integer.parseInt(obj.toString()) == 2) {
                    String str3 = (String) aj.get("lurl");
                    if (!TextUtils.isEmpty(str3)) {
                        if (d2 != null) {
                            str3 = str3.replace("${AUCTION_PRICE}", String.valueOf(d2));
                        }
                        if (str != null) {
                            str3 = str3.replace("${AUCTION_LOSS}", str);
                        }
                        if (str2 != null) {
                            str3 = str3.replace("${AUCTION_WINNER}", str2);
                        }
                        m.f().a(str3);
                    }
                }
            } catch (Throwable unused) {
                l.b("report Loss error");
            }
        }
    }
}

package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.c;
import com.bytedance.sdk.component.adexpress.c.b;
import com.bytedance.sdk.component.adexpress.dynamic.c.a;
import com.bytedance.sdk.component.utils.t;
import io.bidmachine.utils.IabUtils;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LayoutUnitSizeUtils */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f18577a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"dislike", "close", "close-fill", "webview-close"})));

    /* renamed from: b  reason: collision with root package name */
    private static String f18578b;

    public static a.c a(String str, String str2, String str3, boolean z, boolean z2, int i) {
        float f2;
        int i2;
        int i3;
        a.c cVar = new a.c();
        if (str.startsWith("<svg") || f18577a.contains(str2)) {
            try {
                if ("close".equals(str2)) {
                    float optDouble = (float) new JSONObject(str3).optDouble("fontSize");
                    cVar.f18544a = optDouble;
                    cVar.f18545b = optDouble;
                    return cVar;
                }
            } catch (Exception unused) {
            }
            cVar.f18544a = 10.0f;
            cVar.f18545b = 10.0f;
            return cVar;
        } else if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                str = "开发者：" + str;
            }
            if ("app-version".equals(str2)) {
                str = "版本号：V" + str;
            }
            if ("score-count".equals(str2)) {
                try {
                    i3 = Integer.parseInt(str);
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
                return a("(" + String.format(t.a(c.a(), "tt_comment_num"), new Object[]{Integer.valueOf(i3)}) + ")", str3);
            } else if ("score-count-type-2".equals(str2)) {
                try {
                    i2 = Integer.parseInt(str);
                } catch (NumberFormatException unused3) {
                    i2 = 0;
                }
                return a("(" + String.format(new DecimalFormat("###,###,###").format((long) i2), new Object[]{Integer.valueOf(i2)}) + ")", str3);
            } else if ("feedback-dislike".equals(str2)) {
                return a(t.a(c.a(), "tt_reward_feedback"), str3);
            } else {
                if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                    return a("00S", str3);
                }
                if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                    return a(" | " + t.a(c.a(), "tt_reward_screen_skip_tx"), str3);
                } else if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                    return a(" | " + String.format(t.a(c.a(), "tt_reward_full_skip_count_down"), new Object[]{"00"}), str3);
                } else if ("skip-with-time-skip-btn".equals(str2)) {
                    return a(" |  " + t.a(c.a(), "tt_reward_screen_skip_tx"), str3);
                } else if ("skip".equals(str2)) {
                    return a(t.a(c.a(), "tt_reward_screen_skip_tx"), str3);
                } else {
                    if ("timedown".equals(str2)) {
                        return a("0.0", str3);
                    }
                    if ("text_star".equals(str2)) {
                        return a("0.00", str3);
                    }
                    if (TextUtils.equals("privacy-detail", str2)) {
                        return a("权限列表 | 隐私政策", str3);
                    }
                    if ("arrowButton".equals(str2)) {
                        return a("立即下载", str3);
                    }
                    if ("title".equals(str2)) {
                        try {
                            return a(str.replace(10, ' '), str3, true);
                        } catch (Exception unused4) {
                        }
                    }
                    if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || "source".equals(str2) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2)) {
                        return a(str, str3);
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str3);
                        int length = str.length();
                        float optDouble2 = (float) jSONObject.optDouble("fontSize");
                        float optDouble3 = (float) jSONObject.optDouble("letterSpacing");
                        float optDouble4 = (float) jSONObject.optDouble("lineHeight");
                        float optDouble5 = (float) jSONObject.optDouble("maxWidth");
                        float f3 = (((float) length) * (optDouble2 + optDouble3)) - optDouble3;
                        com.bytedance.sdk.component.utils.l.e("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + optDouble3 + ",lineHeight==" + optDouble4 + ",maxWidth ==" + optDouble5 + ",totalStrLength" + f3);
                        if ("muted".equals(str2)) {
                            cVar.f18544a = optDouble2;
                            cVar.f18545b = optDouble2;
                            return cVar;
                        } else if ("star".equals(str2)) {
                            cVar.f18544a = 5.0f * optDouble2;
                            cVar.f18545b = optDouble2;
                            return cVar;
                        } else if ("icon".equals(str2)) {
                            cVar.f18544a = optDouble2;
                            cVar.f18545b = optDouble2;
                            return cVar;
                        } else {
                            if (z) {
                                int i4 = ((int) (f3 / optDouble5)) + 1;
                                if (!z2 || i4 < i) {
                                    i = i4;
                                }
                                f2 = (float) (((double) (optDouble4 * optDouble2 * ((float) i))) * 1.2d);
                            } else {
                                float f4 = (float) (((double) (optDouble4 * optDouble2)) * 1.2d);
                                if (f3 <= optDouble5) {
                                    optDouble5 = f3;
                                }
                                f2 = f4;
                            }
                            cVar.f18544a = optDouble5;
                            cVar.f18545b = f2;
                            return cVar;
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        } else if (c.b() || ((TextUtils.isEmpty(str) || !str.contains("adx:")) && !b())) {
            cVar.f18544a = "union".equals(str) ? 10.0f : 20.0f;
            cVar.f18545b = 10.0f;
            if (c.b()) {
                if ((str2 + str).contains("logoad")) {
                    return a("AD", str3);
                }
            }
            return cVar;
        } else if (b()) {
            return a(cVar, str, str3, f18578b);
        } else {
            return a(cVar, str, str3, "");
        }
    }

    public static String a(String str) {
        String[] split;
        if (!TextUtils.isEmpty(str) && (split = str.split("adx:")) != null && split.length >= 2) {
            return split[1];
        }
        return "";
    }

    private static a.c a(a.c cVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            cVar.f18544a = 0.0f;
            cVar.f18545b = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = a(str);
            }
            if (!TextUtils.isEmpty(str3)) {
                return a(str3, str2);
            }
            cVar.f18544a = 0.0f;
            cVar.f18545b = 0.0f;
        }
        return cVar;
    }

    public static String b(String str, String str2, String str3, boolean z, boolean z2, int i) {
        JSONObject jSONObject = new JSONObject();
        a.c a2 = a(str, str2, str3, z, z2, i);
        try {
            jSONObject.put(IabUtils.KEY_WIDTH, (double) a2.f18544a);
            jSONObject.put(IabUtils.KEY_HEIGHT, (double) a2.f18545b);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static a.c a(String str, String str2) {
        return a(str, str2, false);
    }

    public static a.c a(String str, String str2, boolean z) {
        a.c cVar = new a.c();
        try {
            int[] a2 = a(str, (int) Double.parseDouble(new JSONObject(str2).optString("fontSize")), z);
            cVar.f18544a = (float) a2[0];
            cVar.f18545b = (float) a2[1];
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return cVar;
    }

    public static int[] a(String str, int i, boolean z) {
        int[] a2 = a(str, (float) i, z);
        return new int[]{b.b(c.a(), (float) a2[0]), b.b(c.a(), (float) a2[1])};
    }

    public static int[] a(String str, float f2, boolean z) {
        TextView textView = new TextView(c.a());
        textView.setTextSize(f2);
        textView.setText(str);
        textView.setIncludeFontPadding(false);
        if (z) {
            textView.setSingleLine();
        }
        textView.measure(-2, -2);
        return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
    }

    public static void b(String str) {
        f18578b = str;
    }

    public static String a() {
        return f18578b;
    }

    public static boolean b() {
        return !TextUtils.isEmpty(f18578b);
    }
}

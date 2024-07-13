package com.explorestack.iab.bridge;

import android.text.TextUtils;
import com.explorestack.iab.mraid.MraidLog;
import com.explorestack.iab.mraid.g;
import com.explorestack.iab.mraid.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JsBridgeHandler {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2933a;

    /* renamed from: b  reason: collision with root package name */
    public static final List<a> f2934b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ boolean f2935c;

    static {
        Class<JsBridgeHandler> cls = JsBridgeHandler.class;
        f2935c = !cls.desiredAssertionStatus();
        f2933a = cls.getSimpleName();
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (a next : f2934b) {
            if (!f2935c && str == null) {
                throw new AssertionError();
            } else if (next.a(str)) {
                return next;
            }
        }
        return null;
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        for (a b2 : f2934b) {
            sb.append("<script type='application/javascript'>");
            sb.append(b2.b());
            sb.append("</script>");
        }
        return sb.toString();
    }

    public static void a(i iVar, String str) {
        Map<String, String> a2;
        String str2 = f2933a;
        MraidLog.d(str2, "handleJsCommand " + str);
        try {
            a a3 = a(str);
            if (a3 != null && (a2 = g.a(str, a3.a())) != null) {
                String str3 = a2.get("command");
                if (str3 == null) {
                    MraidLog.b(str2, "handleJsCommand: not found");
                } else {
                    a3.a(iVar, str3, a2);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean addBridge(a aVar) {
        List<a> list = f2934b;
        return !list.contains(aVar) && list.add(aVar);
    }

    public static boolean b(String str) {
        return a(str) != null;
    }
}

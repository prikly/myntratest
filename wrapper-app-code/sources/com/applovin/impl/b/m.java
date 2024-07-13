package com.applovin.impl.b;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.s;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.appodeal.ads.modules.common.internal.LogConstants;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final DateFormat f14320a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b  reason: collision with root package name */
    private static final Random f14321b = new Random(System.currentTimeMillis());

    public static Uri a(String str, long j, Uri uri, f fVar, n nVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(fVar.a());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", a()).replace("[TIMESTAMP]", b()));
            } catch (Throwable th) {
                nVar.D();
                if (v.a()) {
                    v D = nVar.D();
                    D.b("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                return null;
            }
        } else {
            nVar.D();
            if (v.a()) {
                nVar.D().e("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
    }

    public static f a(a aVar) {
        if (b(aVar) || c(aVar)) {
            return null;
        }
        return f.GENERAL_WRAPPER_ERROR;
    }

    private static String a() {
        return Integer.toString(f14321b.nextInt(89999999) + 10000000);
    }

    private static String a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        long hours = TimeUnit.SECONDS.toHours(j);
        long seconds = j % TimeUnit.MINUTES.toSeconds(1);
        return String.format(Locale.US, "%02d:%02d:%02d.000", new Object[]{Long.valueOf(hours), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(seconds)});
    }

    public static String a(e eVar) {
        s c2;
        if (eVar != null) {
            List<s> b2 = eVar.b();
            int size = eVar.b().size();
            if (size <= 0 || (c2 = b2.get(size - 1).c("VASTAdTagURI")) == null) {
                return null;
            }
            return c2.c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    public static String a(s sVar, String str, String str2) {
        s b2 = sVar.b(str);
        if (b2 != null) {
            String c2 = b2.c();
            if (StringUtils.isValidString(c2)) {
                return c2;
            }
        }
        return str2;
    }

    private static Set<k> a(e eVar, n nVar) {
        if (eVar == null) {
            return null;
        }
        List<s> b2 = eVar.b();
        Set<k> hashSet = new HashSet<>(b2.size());
        for (s next : b2) {
            s c2 = next.c("Wrapper");
            if (c2 == null) {
                c2 = next.c("InLine");
            }
            hashSet = a(hashSet, c2 != null ? c2.a(LogConstants.EVENT_ERROR) : next.a(LogConstants.EVENT_ERROR), eVar, nVar);
        }
        nVar.D();
        if (v.a()) {
            v D = nVar.D();
            D.b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    private static Set<k> a(Set<k> set, List<s> list, e eVar, n nVar) {
        if (list != null) {
            for (s a2 : list) {
                k a3 = k.a(a2, eVar, nVar);
                if (a3 != null) {
                    set.add(a3);
                }
            }
        }
        return set;
    }

    public static void a(e eVar, AppLovinAdLoadListener appLovinAdLoadListener, f fVar, int i, n nVar) {
        if (nVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
            }
            a(a(eVar, nVar), fVar, nVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    public static void a(s sVar, Map<String, Set<k>> map, e eVar, n nVar) {
        List<s> a2;
        if (nVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        } else if (sVar == null) {
            nVar.D();
            if (v.a()) {
                nVar.D().e("VastUtils", "Unable to render event trackers; null node provided");
            }
        } else if (map == null) {
            nVar.D();
            if (v.a()) {
                nVar.D().e("VastUtils", "Unable to render event trackers; null event trackers provided");
            }
        } else {
            s b2 = sVar.b("TrackingEvents");
            if (b2 != null && (a2 = b2.a("Tracking")) != null) {
                for (s next : a2) {
                    String str = next.b().get("event");
                    if (StringUtils.isValidString(str)) {
                        k a3 = k.a(next, eVar, nVar);
                        if (a3 != null) {
                            Set set = map.get(str);
                            if (set != null) {
                                set.add(a3);
                            } else {
                                HashSet hashSet = new HashSet();
                                hashSet.add(a3);
                                map.put(str, hashSet);
                            }
                        }
                    } else {
                        nVar.D();
                        if (v.a()) {
                            v D = nVar.D();
                            D.e("VastUtils", "Could not find event for tracking node = " + next);
                        }
                    }
                }
            }
        }
    }

    public static void a(List<s> list, Set<k> set, e eVar, n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        } else if (list == null) {
            nVar.D();
            if (v.a()) {
                nVar.D().e("VastUtils", "Unable to render trackers; null nodes provided");
            }
        } else if (set == null) {
            nVar.D();
            if (v.a()) {
                nVar.D().e("VastUtils", "Unable to render trackers; null trackers provided");
            }
        } else {
            for (s a2 : list) {
                k a3 = k.a(a2, eVar, nVar);
                if (a3 != null) {
                    set.add(a3);
                }
            }
        }
    }

    public static void a(Set<k> set, long j, Uri uri, f fVar, n nVar) {
        if (nVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        } else if (set != null && !set.isEmpty()) {
            for (k b2 : set) {
                Uri a2 = a(b2.b(), j, uri, fVar, nVar);
                if (a2 != null) {
                    nVar.X().a(h.o().c(a2.toString()).a(false).a(), false);
                }
            }
        }
    }

    public static void a(Set<k> set, f fVar, n nVar) {
        a(set, -1, (Uri) null, fVar, nVar);
    }

    public static void a(Set<k> set, n nVar) {
        a(set, -1, (Uri) null, f.UNSPECIFIED, nVar);
    }

    public static boolean a(s sVar) {
        if (sVar != null) {
            return sVar.c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    private static String b() {
        f14320a.setTimeZone(TimeZone.getDefault());
        return f14320a.format(new Date());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = (r1 = r1.aM()).a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(com.applovin.impl.b.a r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.applovin.impl.b.n r1 = r1.aM()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = r1.a()
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.b.m.b(com.applovin.impl.b.a):boolean");
    }

    public static boolean b(s sVar) {
        if (sVar != null) {
            return sVar.c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    public static boolean c(a aVar) {
        d aO;
        i b2;
        if (aVar == null || (aO = aVar.aO()) == null || (b2 = aO.b()) == null) {
            return false;
        }
        return b2.b() != null || StringUtils.isValidString(b2.c());
    }
}

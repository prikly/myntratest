package com.explorestack.iab.vast.processor;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.explorestack.iab.vast.TrackingEvent;
import com.explorestack.iab.vast.VastLog;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.tags.AdContentTag;
import com.explorestack.iab.vast.tags.AdTag;
import com.explorestack.iab.vast.tags.CompanionAdsCreativeTag;
import com.explorestack.iab.vast.tags.CompanionTag;
import com.explorestack.iab.vast.tags.CreativeContentTag;
import com.explorestack.iab.vast.tags.CreativeTag;
import com.explorestack.iab.vast.tags.InLineAdTag;
import com.explorestack.iab.vast.tags.LinearCreativeTag;
import com.explorestack.iab.vast.tags.MediaFileTag;
import com.explorestack.iab.vast.tags.VastTag;
import com.explorestack.iab.vast.tags.WrapperAdTag;
import com.explorestack.iab.vast.tags.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final VastRequest f3252a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3253b;

    /* renamed from: c  reason: collision with root package name */
    public b<MediaFileTag> f3254c;

    /* renamed from: d  reason: collision with root package name */
    public final Stack<AdContentTag> f3255d;

    /* renamed from: e  reason: collision with root package name */
    public int f3256e;

    public c(VastRequest vastRequest, b<MediaFileTag> bVar) {
        this(vastRequest, bVar, 5);
    }

    public c(VastRequest vastRequest, b<MediaFileTag> bVar, int i) {
        this.f3255d = new Stack<>();
        this.f3256e = 0;
        this.f3252a = vastRequest;
        this.f3254c = bVar;
        this.f3253b = i;
    }

    public final Pair<LinearCreativeTag, MediaFileTag> a(InLineAdTag inLineAdTag) {
        LinearCreativeTag linearCreativeTag;
        List<MediaFileTag> mediaFileTagList;
        ArrayList arrayList = new ArrayList();
        for (CreativeTag next : inLineAdTag.getCreativeTagList()) {
            if (next != null) {
                CreativeContentTag creativeContentTag = next.getCreativeContentTag();
                if ((creativeContentTag instanceof LinearCreativeTag) && (mediaFileTagList = linearCreativeTag.getMediaFileTagList()) != null && !mediaFileTagList.isEmpty()) {
                    for (MediaFileTag pair : mediaFileTagList) {
                        arrayList.add(new Pair((linearCreativeTag = (LinearCreativeTag) creativeContentTag), pair));
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        b<MediaFileTag> bVar = this.f3254c;
        Pair<LinearCreativeTag, MediaFileTag> a2 = bVar != null ? bVar.a(arrayList) : null;
        return a2 != null ? a2 : new Pair<>((Object) null, (Object) null);
    }

    public final d a(AdContentTag adContentTag, VastTag vastTag, e eVar) {
        d dVar = new d();
        int i = 0;
        while (true) {
            int i2 = 303;
            if (i < vastTag.getAdTagList().size()) {
                AdTag adTag = vastTag.getAdTagList().get(i);
                if (!(adTag == null || adTag.getAdContentTag() == null)) {
                    AdContentTag adContentTag2 = adTag.getAdContentTag();
                    if (adContentTag2 instanceof InLineAdTag) {
                        d b2 = b((InLineAdTag) adContentTag2);
                        if (b2.d()) {
                            return b2;
                        }
                        a(b2.a());
                        if (adContentTag == null) {
                            dVar.a(b2.b());
                        } else if (b2.e()) {
                            dVar.a(adContentTag, b2.b());
                        }
                    } else if ((adContentTag2 instanceof WrapperAdTag) && eVar.c()) {
                        d a2 = a((WrapperAdTag) adContentTag2);
                        if (a2.d()) {
                            return a2;
                        }
                        a(a2.a());
                        if (adContentTag != null) {
                            if (a2.e()) {
                                i2 = a2.b();
                            }
                            dVar.a(adContentTag, i2);
                        } else {
                            dVar.a(303);
                        }
                        if (i == 0 && !eVar.b()) {
                            return dVar;
                        }
                    }
                    b(adContentTag2);
                }
                i++;
            } else {
                if (dVar.b() == -1 && adContentTag != null) {
                    dVar.a(adContentTag, 303);
                }
                return dVar;
            }
        }
    }

    public d a(WrapperAdTag wrapperAdTag) {
        d dVar = new d();
        if (b()) {
            VastLog.a("VastProcessor", String.format(Locale.ENGLISH, "VAST wrapping exceeded max limit of %d", new Object[]{Integer.valueOf(this.f3253b)}));
            dVar.a(wrapperAdTag, IronSourceConstants.OFFERWALL_AVAILABLE);
            return dVar;
        }
        this.f3256e++;
        this.f3255d.push(wrapperAdTag);
        if (TextUtils.isEmpty(wrapperAdTag.getVastAdTagUri())) {
            VastLog.a("VastProcessor", "VASTAdTagURI is null or empty");
            dVar.a(wrapperAdTag, 301);
            return dVar;
        }
        e eVar = new e(wrapperAdTag);
        InputStream inputStream = null;
        try {
            URLConnection openConnection = new URL(wrapperAdTag.getVastAdTagUri()).openConnection();
            int responseCode = ((HttpURLConnection) openConnection).getResponseCode();
            if (responseCode == 200) {
                inputStream = openConnection.getInputStream();
                VastTag a2 = a.a(inputStream);
                if (a2 == null) {
                    VastLog.a("VastProcessor", "Invalid Vast");
                    dVar.a(wrapperAdTag, 101);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            VastLog.a("VastProcessor", (Throwable) e2);
                        }
                    }
                    return dVar;
                } else if (!a2.hasAd()) {
                    VastLog.a("VastProcessor", "Vast has no ad");
                    dVar.a(wrapperAdTag, 303);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e3) {
                            VastLog.a("VastProcessor", (Throwable) e3);
                        }
                    }
                    return dVar;
                } else if (a2.getAdTagList().size() <= 1 || eVar.a()) {
                    d a3 = a(wrapperAdTag, a2, eVar);
                    a3.a(false);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e4) {
                            VastLog.a("VastProcessor", (Throwable) e4);
                        }
                    }
                    return a3;
                } else {
                    dVar.a(wrapperAdTag, ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e5) {
                            VastLog.a("VastProcessor", (Throwable) e5);
                        }
                    }
                    return dVar;
                }
            } else if (responseCode != 204) {
                dVar.a(wrapperAdTag, 301);
                return dVar;
            } else {
                VastLog.a("VastProcessor", "Wrapper response code: 204");
                dVar.a(wrapperAdTag, 303);
                return dVar;
            }
        } catch (MalformedURLException e6) {
            VastLog.a("VastProcessor", (Throwable) e6);
            dVar.a(wrapperAdTag, 301);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e7) {
                    VastLog.a("VastProcessor", (Throwable) e7);
                }
            }
            return dVar;
        } catch (SocketTimeoutException | UnknownHostException | SSLException | ConnectTimeoutException e8) {
            VastLog.a("VastProcessor", e8);
            dVar.a(wrapperAdTag, 301);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e9) {
                    VastLog.a("VastProcessor", (Throwable) e9);
                }
            }
            return dVar;
        } catch (IOException e10) {
            VastLog.a("VastProcessor", (Throwable) e10);
            dVar.a(wrapperAdTag, 301);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    VastLog.a("VastProcessor", (Throwable) e11);
                }
            }
            return dVar;
        } catch (Exception e12) {
            VastLog.a("VastProcessor", (Throwable) e12);
            dVar.a(wrapperAdTag, 100);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e13) {
                    VastLog.a("VastProcessor", (Throwable) e13);
                }
            }
            return dVar;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e14) {
                    VastLog.a("VastProcessor", (Throwable) e14);
                }
            }
            throw th;
        }
    }

    public d a(String str) {
        int i;
        VastLog.d("VastProcessor", "process");
        d dVar = new d();
        try {
            VastTag a2 = a.a(str);
            if (a2 != null && a2.hasAd()) {
                return a((AdContentTag) null, a2, new e());
            }
            i = 101;
            dVar.a(i);
            return dVar;
        } catch (Exception unused) {
            i = 100;
        }
    }

    public final ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f3255d.empty()) {
            return arrayList;
        }
        Iterator it = this.f3255d.iterator();
        while (it.hasNext()) {
            AdContentTag adContentTag = (AdContentTag) it.next();
            if (!(adContentTag == null || adContentTag.getErrorUrlList() == null)) {
                arrayList.addAll(adContentTag.getErrorUrlList());
            }
        }
        return arrayList;
    }

    public final ArrayList<CompanionTag> a(AdContentTag adContentTag) {
        ArrayList<CompanionTag> arrayList = new ArrayList<>();
        for (CreativeTag next : adContentTag.getCreativeTagList()) {
            if (next != null) {
                CreativeContentTag creativeContentTag = next.getCreativeContentTag();
                if (creativeContentTag instanceof CompanionAdsCreativeTag) {
                    CompanionAdsCreativeTag companionAdsCreativeTag = (CompanionAdsCreativeTag) creativeContentTag;
                    if (companionAdsCreativeTag.getCompanionTagList() != null) {
                        arrayList.addAll(companionAdsCreativeTag.getCompanionTagList());
                    }
                }
            }
        }
        return arrayList;
    }

    public void a(List<String> list) {
        this.f3252a.fireErrorUrls(list, (Bundle) null);
    }

    public final void a(List<String> list, CompanionAdsCreativeTag companionAdsCreativeTag) {
        List<String> companionClickTrackingList;
        for (CompanionTag next : companionAdsCreativeTag.getCompanionTagList()) {
            if (!next.hasCreative() && (companionClickTrackingList = next.getCompanionClickTrackingList()) != null) {
                list.addAll(companionClickTrackingList);
            }
        }
    }

    public final void a(Map<TrackingEvent, List<String>> map, Map<TrackingEvent, List<String>> map2) {
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry next : map2.entrySet()) {
                TrackingEvent trackingEvent = (TrackingEvent) next.getKey();
                List list = map.get(trackingEvent);
                if (list == null) {
                    list = new ArrayList();
                    map.put(trackingEvent, list);
                }
                list.addAll((Collection) next.getValue());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [com.explorestack.iab.vast.tags.ExtensionTag] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.explorestack.iab.vast.processor.d b(com.explorestack.iab.vast.tags.InLineAdTag r15) {
        /*
            r14 = this;
            java.util.Stack<com.explorestack.iab.vast.tags.AdContentTag> r0 = r14.f3255d
            r0.push(r15)
            com.explorestack.iab.vast.processor.d r0 = new com.explorestack.iab.vast.processor.d
            r0.<init>()
            android.util.Pair r1 = r14.a((com.explorestack.iab.vast.tags.InLineAdTag) r15)
            if (r1 != 0) goto L_0x0017
            r1 = 101(0x65, float:1.42E-43)
        L_0x0012:
            r0.a(r15, r1)
            goto L_0x0112
        L_0x0017:
            java.lang.Object r2 = r1.first
            if (r2 != 0) goto L_0x0022
            java.lang.Object r2 = r1.second
            if (r2 != 0) goto L_0x0022
            r1 = 403(0x193, float:5.65E-43)
            goto L_0x0012
        L_0x0022:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.EnumMap r5 = new java.util.EnumMap
            java.lang.Class<com.explorestack.iab.vast.TrackingEvent> r6 = com.explorestack.iab.vast.TrackingEvent.class
            r5.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.util.Stack<com.explorestack.iab.vast.tags.AdContentTag> r8 = r14.f3255d
            boolean r8 = r8.empty()
            if (r8 != 0) goto L_0x00de
            java.util.Stack<com.explorestack.iab.vast.tags.AdContentTag> r8 = r14.f3255d
            java.util.Iterator r8 = r8.iterator()
        L_0x004c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00de
            java.lang.Object r9 = r8.next()
            com.explorestack.iab.vast.tags.AdContentTag r9 = (com.explorestack.iab.vast.tags.AdContentTag) r9
            if (r9 != 0) goto L_0x005b
            goto L_0x004c
        L_0x005b:
            java.util.List r10 = r9.getImpressionUrlList()
            if (r10 == 0) goto L_0x0068
            java.util.List r10 = r9.getImpressionUrlList()
            r2.addAll(r10)
        L_0x0068:
            java.util.List r10 = r9.getCreativeTagList()
            if (r10 == 0) goto L_0x00b4
            java.util.List r10 = r9.getCreativeTagList()
            java.util.Iterator r10 = r10.iterator()
        L_0x0076:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00b4
            java.lang.Object r11 = r10.next()
            com.explorestack.iab.vast.tags.CreativeTag r11 = (com.explorestack.iab.vast.tags.CreativeTag) r11
            if (r11 != 0) goto L_0x0085
            goto L_0x0076
        L_0x0085:
            com.explorestack.iab.vast.tags.CreativeContentTag r11 = r11.getCreativeContentTag()
            boolean r12 = r11 instanceof com.explorestack.iab.vast.tags.LinearCreativeTag
            if (r12 == 0) goto L_0x00aa
            com.explorestack.iab.vast.tags.LinearCreativeTag r11 = (com.explorestack.iab.vast.tags.LinearCreativeTag) r11
            com.explorestack.iab.vast.tags.VideoClicksTag r12 = r11.getVideoClicksTag()
            if (r12 == 0) goto L_0x00a2
            java.util.List r13 = r12.getClickTrackingUrlList()
            if (r13 == 0) goto L_0x00a2
            java.util.List r12 = r12.getClickTrackingUrlList()
            r3.addAll(r12)
        L_0x00a2:
            java.util.Map r11 = r11.getTrackingEventListMap()
            r14.a((java.util.Map<com.explorestack.iab.vast.TrackingEvent, java.util.List<java.lang.String>>) r5, (java.util.Map<com.explorestack.iab.vast.TrackingEvent, java.util.List<java.lang.String>>) r11)
            goto L_0x0076
        L_0x00aa:
            boolean r12 = r11 instanceof com.explorestack.iab.vast.tags.CompanionAdsCreativeTag
            if (r12 == 0) goto L_0x0076
            com.explorestack.iab.vast.tags.CompanionAdsCreativeTag r11 = (com.explorestack.iab.vast.tags.CompanionAdsCreativeTag) r11
            r14.a((java.util.List<java.lang.String>) r4, (com.explorestack.iab.vast.tags.CompanionAdsCreativeTag) r11)
            goto L_0x0076
        L_0x00b4:
            java.util.List r9 = r9.getExtensionTagList()
            if (r9 == 0) goto L_0x004c
            java.util.Iterator r9 = r9.iterator()
        L_0x00be:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x004c
            java.lang.Object r10 = r9.next()
            com.explorestack.iab.vast.tags.ExtensionTag r10 = (com.explorestack.iab.vast.tags.ExtensionTag) r10
            boolean r11 = r10 instanceof com.explorestack.iab.vast.tags.AppodealExtensionTag
            if (r11 == 0) goto L_0x00d4
            if (r7 != 0) goto L_0x00be
            r7 = r10
            com.explorestack.iab.vast.tags.AppodealExtensionTag r7 = (com.explorestack.iab.vast.tags.AppodealExtensionTag) r7
            goto L_0x00be
        L_0x00d4:
            boolean r11 = r10 instanceof com.explorestack.iab.vast.tags.AdVerificationsExtensionTag
            if (r11 == 0) goto L_0x00be
            com.explorestack.iab.vast.tags.AdVerificationsExtensionTag r10 = (com.explorestack.iab.vast.tags.AdVerificationsExtensionTag) r10
            r6.add(r10)
            goto L_0x00be
        L_0x00de:
            com.explorestack.iab.vast.processor.VastAd r8 = new com.explorestack.iab.vast.processor.VastAd
            java.lang.Object r9 = r1.first
            com.explorestack.iab.vast.tags.LinearCreativeTag r9 = (com.explorestack.iab.vast.tags.LinearCreativeTag) r9
            java.lang.Object r1 = r1.second
            com.explorestack.iab.vast.tags.MediaFileTag r1 = (com.explorestack.iab.vast.tags.MediaFileTag) r1
            r8.<init>(r9, r1)
            r8.d(r2)
            java.util.ArrayList r1 = r14.a()
            r8.c(r1)
            r8.a((java.util.ArrayList<java.lang.String>) r3)
            r8.setWrapperCompanionClickTrackingUrlList(r4)
            r8.a((java.util.EnumMap<com.explorestack.iab.vast.TrackingEvent, java.util.List<java.lang.String>>) r5)
            java.util.ArrayList r15 = r14.a((com.explorestack.iab.vast.tags.AdContentTag) r15)
            r8.b(r15)
            r8.a((com.explorestack.iab.vast.tags.AppodealExtensionTag) r7)
            r8.setAdVerificationsExtensionList(r6)
            r15 = 0
            r0.a((int) r15)
            r0.a((com.explorestack.iab.vast.processor.VastAd) r8)
        L_0x0112:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.processor.c.b(com.explorestack.iab.vast.tags.InLineAdTag):com.explorestack.iab.vast.processor.d");
    }

    public void b(AdContentTag adContentTag) {
        if (!this.f3255d.empty()) {
            int search = this.f3255d.search(adContentTag);
            for (int i = 0; i < search; i++) {
                this.f3255d.pop();
            }
        }
    }

    public final boolean b() {
        return this.f3256e >= this.f3253b;
    }
}

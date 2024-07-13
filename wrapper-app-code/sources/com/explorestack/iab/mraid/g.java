package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.explorestack.iab.IabSettings;
import com.onesignal.OSInAppMessageContentKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final long f3006a = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f3007b = Arrays.asList(new String[]{"close", "expand", "open", "playVideo", "resize", "setOrientationProperties", "setResizeProperties", "useCustomClose", "noFill", "loaded", "AdStarted", "AdStopped", "AdSkipped", "AdSkippableStateChange", "AdVideoStart", "AdVideoFirstQuartile", "AdVideoMidpoint", "AdVideoThirdQuartile", "AdVideoComplete", "AdUserClose", "AdPaused", "AdPlaying", "AdClickThru", "AdLog", "AdError"});

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f3008c = {'\"', '\''};

    /* renamed from: d  reason: collision with root package name */
    public static final a f3009d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static String f3010e;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ boolean f3011f = (!g.class.desiredAssertionStatus());

    public class a implements a {
        public String a(String str) {
            return str.substring(8);
        }

        public boolean a(String str, Map<String, String> map) {
            return g.b(str, map);
        }

        public boolean b(String str) {
            return g.b(str);
        }
    }

    public static int a(String str, String str2, List<Pair<Integer, Integer>> list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (list == null) {
                list = a(str, f3008c);
            }
            Matcher matcher = Pattern.compile(String.format("<%s[^>]*>", new Object[]{str2}), 2).matcher(str);
            while (matcher.find()) {
                int end = matcher.end();
                if (a(end, list)) {
                    return end;
                }
            }
        }
        return -1;
    }

    public static View a(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        return ((Activity) context).getWindow().getDecorView().findViewById(16908290);
    }

    public static View a(Context context, View view) {
        View a2 = a(context);
        return a2 != null ? a2 : a(view);
    }

    public static View a(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }

    public static String a() {
        return "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\" /><style>body { margin:0; padding:0;}*:not(input) { -webkit-touch-callout:none; -webkit-user-select:none; -webkit-text-size-adjust:none; }</style>";
    }

    public static List<Pair<Integer, Integer>> a(String str, char... cArr) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && cArr != null) {
            if (f3011f || str != null) {
                try {
                    int[] iArr = new int[cArr.length];
                    Arrays.fill(iArr, -1);
                    for (int i = 0; i < str.length(); i++) {
                        char charAt = str.charAt(i);
                        int i2 = 0;
                        while (true) {
                            if (i2 >= cArr.length) {
                                break;
                            } else if (charAt == cArr[i2]) {
                                int i3 = iArr[i2];
                                if (i3 > -1) {
                                    arrayList.add(new Pair(Integer.valueOf(i3), Integer.valueOf(i)));
                                    iArr[i2] = -1;
                                } else {
                                    iArr[i2] = i;
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else {
                throw new AssertionError();
            }
        }
        return arrayList;
    }

    public static Map<String, String> a(String str, a aVar) {
        String str2;
        MraidLog.d("parseCommandUrl", str);
        String a2 = aVar.a(str);
        HashMap hashMap = new HashMap();
        int indexOf = a2.indexOf(63);
        if (indexOf != -1) {
            String substring = a2.substring(0, indexOf);
            for (String str3 : a2.substring(indexOf + 1).split("&")) {
                int indexOf2 = str3.indexOf(61);
                hashMap.put(str3.substring(0, indexOf2), str3.substring(indexOf2 + 1));
            }
            a2 = substring;
        }
        if (!aVar.b(a2)) {
            str2 = a2 + " is unknown";
        } else if (!aVar.a(a2, hashMap)) {
            str2 = "URL " + str + " is missing parameters";
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("command", a2);
            hashMap2.putAll(hashMap);
            return hashMap2;
        }
        MraidLog.b("command", str2);
        return null;
    }

    public static void a(StringBuffer stringBuffer) {
        if (!TextUtils.isEmpty(stringBuffer)) {
            if (f3011f || stringBuffer != null) {
                int a2 = a(stringBuffer.toString(), "head", (List<Pair<Integer, Integer>>) null);
                if (a2 > -1) {
                    stringBuffer.insert(a2, a());
                    return;
                }
                return;
            }
            throw new AssertionError();
        }
    }

    public static boolean a(int i, List<Pair<Integer, Integer>> list) {
        for (Pair next : list) {
            if (i >= ((Integer) next.first).intValue() && i <= ((Integer) next.second).intValue()) {
                return false;
            }
        }
        return true;
    }

    public static View b(Context context, View view) {
        View a2 = a(context, view);
        return a2 instanceof ViewGroup ? (ViewGroup) a2 : view;
    }

    public static String b() {
        if (f3010e == null) {
            f3010e = new String(Base64.decode("IWZ1bmN0aW9uKCl7Y29uc29sZS5sb2coIk1SQUlEIG9iamVjdCBsb2FkaW5nLi4uIik7dmFyIGU9MCx0PTEsaT0yLG49MyxyPXQsbz17ZDpmdW5jdGlvbih0KXtyPD1lJiZjb25zb2xlLmxvZygiKEQtbXJhaWQuanMpICIrdCl9LGk6ZnVuY3Rpb24oZSl7cjw9dCYmY29uc29sZS5sb2coIihJLW1yYWlkLmpzKSAiK2UpfSx3OmZ1bmN0aW9uKGUpe3I8PWkmJmNvbnNvbGUubG9nKCIoVy1tcmFpZC5qcykgIitlKX0sZTpmdW5jdGlvbihlKXtyPD1uJiZjb25zb2xlLmxvZygiKEUtbXJhaWQuanMpICIrZSl9fSxzPXdpbmRvdy5tcmFpZD17aXNOYXRpdmVTZGtSZWFkeTohMSxuYXRpdmVDYWxsUXVldWU6W10sbmF0aXZlQ2FsbFJ1bm5pbmc6ITF9LGE9cy5TVEFURVM9e0xPQURJTkc6ImxvYWRpbmciLERFRkFVTFQ6ImRlZmF1bHQiLEVYUEFOREVEOiJleHBhbmRlZCIsUkVTSVpFRDoicmVzaXplZCIsSElEREVOOiJoaWRkZW4ifSxkPXMuUExBQ0VNRU5UX1RZUEVTPXtJTkxJTkU6ImlubGluZSIsSU5URVJTVElUSUFMOiJpbnRlcnN0aXRpYWwifSxmPXMuUkVTSVpFX1BST1BFUlRJRVNfQ1VTVE9NX0NMT1NFX1BPU0lUSU9OPXtUT1BfTEVGVDoidG9wLWxlZnQiLFRPUF9DRU5URVI6InRvcC1jZW50ZXIiLFRPUF9SSUdIVDoidG9wLXJpZ2h0IixDRU5URVI6ImNlbnRlciIsQk9UVE9NX0xFRlQ6ImJvdHRvbS1sZWZ0IixCT1RUT01fQ0VOVEVSOiJib3R0b20tY2VudGVyIixCT1RUT01fUklHSFQ6ImJvdHRvbS1yaWdodCJ9LGw9cy5PUklFTlRBVElPTl9QUk9QRVJUSUVTX0ZPUkNFX09SSUVOVEFUSU9OPXtQT1JUUkFJVDoicG9ydHJhaXQiLExBTkRTQ0FQRToibGFuZHNjYXBlIixOT05FOiJub25lIn0sdT1zLkVWRU5UUz17RVJST1I6ImVycm9yIixSRUFEWToicmVhZHkiLFNJWkVDSEFOR0U6InNpemVDaGFuZ2UiLFNUQVRFQ0hBTkdFOiJzdGF0ZUNoYW5nZSIsVklFV0FCTEVDSEFOR0U6InZpZXdhYmxlQ2hhbmdlIn0saD0ocy5TVVBQT1JURURfRkVBVFVSRVM9e1NNUzoic21zIixURUw6InRlbCIsQ0FMRU5EQVI6ImNhbGVuZGFyIixTVE9SRVBJQ1RVUkU6InN0b3JlUGljdHVyZSIsSU5MSU5FVklERU86ImlubGluZVZpZGVvIn0sYS5MT0FESU5HKSxjPWQuSU5MSU5FLEU9e30sZz0hMSxtPSExLHA9ITEsdj17d2lkdGg6MCxoZWlnaHQ6MCx1c2VDdXN0b21DbG9zZTohMSxpc01vZGFsOiEwfSxDPXthbGxvd09yaWVudGF0aW9uQ2hhbmdlOiEwLGZvcmNlT3JpZW50YXRpb246bC5OT05FfSxPPXt3aWR0aDowLGhlaWdodDowLGN1c3RvbUNsb3NlUG9zaXRpb246Zi5UT1BfUklHSFQsb2Zmc2V0WDowLG9mZnNldFk6MCxhbGxvd09mZnNjcmVlbjohMH0sdz17eDowLHk6MCx3aWR0aDowLGhlaWdodDowfSxQPXt4OjAseTowLHdpZHRoOjAsaGVpZ2h0OjB9LFI9e3dpZHRoOjAsaGVpZ2h0OjB9LHk9e3dpZHRoOjAsaGVpZ2h0OjB9LFM9e307cy5hZGRFdmVudExpc3RlbmVyPWZ1bmN0aW9uKGUsdCl7aWYoby5pKCJtcmFpZC5hZGRFdmVudExpc3RlbmVyICIrZSsiOiAiK1N0cmluZyh0KSksZSYmdClpZih4KGUsdSkpe2Zvcih2YXIgaT1TW2VdPVNbZV18fFtdLG49MDtuPGkubGVuZ3RoO24rKyl7dmFyIHI9U3RyaW5nKHQpLGE9U3RyaW5nKGlbbl0pO2lmKHQ9PT1pW25dfHxyPT09YSlyZXR1cm4gdm9pZCBvLmkoImxpc3RlbmVyICIrcisiIGlzIGFscmVhZHkgcmVnaXN0ZXJlZCBmb3IgZXZlbnQgIitlKX1pLnB1c2godCl9ZWxzZSBzLmZpcmVFcnJvckV2ZW50KCJVbmtub3duIE1SQUlEIGV2ZW50OiAiK2UsImFkZEV2ZW50TGlzdGVuZXIiKTtlbHNlIHMuZmlyZUVycm9yRXZlbnQoIkJvdGggZXZlbnQgYW5kIGxpc3RlbmVyIGFyZSByZXF1aXJlZC4iLCJhZGRFdmVudExpc3RlbmVyIil9LHMuY3JlYXRlQ2FsZW5kYXJFdmVudD1mdW5jdGlvbihlKXtvLmkoIm1yYWlkLmNyZWF0ZUNhbGVuZGFyRXZlbnQgd2l0aCAiK2UpLEVbcy5TVVBQT1JURURfRkVBVFVSRVMuQ0FMRU5EQVJdP04oImNyZWF0ZUNhbGVuZGFyRXZlbnQ/ZXZlbnRKU09OPSIrSlNPTi5zdHJpbmdpZnkoZSkpOm8uZSgiY3JlYXRlQ2FsZW5kYXJFdmVudCBpcyBub3Qgc3VwcG9ydGVkIil9LHMuY2xvc2U9ZnVuY3Rpb24oKXtvLmkoIm1yYWlkLmNsb3NlIiksaD09PWEuTE9BRElOR3x8aD09PWEuREVGQVVMVCYmYz09PWQuSU5MSU5FfHxoPT09YS5ISURERU58fE4oImNsb3NlIil9LHMuZXhwYW5kPWZ1bmN0aW9uKGUpe3ZvaWQgMD09PWU/by5pKCJtcmFpZC5leHBhbmQgKDEtcGFydCkiKTpvLmkoIm1yYWlkLmV4cGFuZCAiK2UpLGMhPT1kLklOTElORXx8aCE9PWEuREVGQVVMVCYmaCE9PWEuUkVTSVpFRHx8Tih2b2lkIDA9PT1lPyJleHBhbmQiOiJleHBhbmQ/dXJsPSIrZW5jb2RlVVJJQ29tcG9uZW50KGUpKX0scy5nZXRDdXJyZW50UG9zaXRpb249ZnVuY3Rpb24oKXtyZXR1cm4gby5pKCJtcmFpZC5nZXRDdXJyZW50UG9zaXRpb24iKSx3fSxzLmdldERlZmF1bHRQb3NpdGlvbj1mdW5jdGlvbigpe3JldHVybiBvLmkoIm1yYWlkLmdldERlZmF1bHRQb3NpdGlvbiIpLFB9LHMuZ2V0RXhwYW5kUHJvcGVydGllcz1mdW5jdGlvbigpe3JldHVybiBvLmkoIm1yYWlkLmdldEV4cGFuZFByb3BlcnRpZXMiKSx2fSxzLmdldE1heFNpemU9ZnVuY3Rpb24oKXtyZXR1cm4gby5pKCJtcmFpZC5nZXRNYXhTaXplIiksUn0scy5nZXRPcmllbnRhdGlvblByb3BlcnRpZXM9ZnVuY3Rpb24oKXtyZXR1cm4gby5pKCJtcmFpZC5nZXRPcmllbnRhdGlvblByb3BlcnRpZXMiKSxDfSxzLmdldFBsYWNlbWVudFR5cGU9ZnVuY3Rpb24oKXtyZXR1cm4gby5pKCJtcmFpZC5nZXRQbGFjZW1lbnRUeXBlIiksY30scy5nZXRSZXNpemVQcm9wZXJ0aWVzPWZ1bmN0aW9uKCl7cmV0dXJuIG8uaSgibXJhaWQuZ2V0UmVzaXplUHJvcGVydGllcyIpLE99LHMuZ2V0U2NyZWVuU2l6ZT1mdW5jdGlvbigpe3JldHVybiBvLmkoIm1yYWlkLmdldFNjcmVlblNpemUiKSx5fSxzLmdldFN0YXRlPWZ1bmN0aW9uKCl7cmV0dXJuIG8uaSgibXJhaWQuZ2V0U3RhdGUiKSxofSxzLmdldFZlcnNpb249ZnVuY3Rpb24oKXtyZXR1cm4gby5pKCJtcmFpZC5nZXRWZXJzaW9uIiksIjIuMCJ9LHMuaXNWaWV3YWJsZT1mdW5jdGlvbigpe3JldHVybiBvLmkoIm1yYWlkLmlzVmlld2FibGUiKSxnfSxzLm9wZW49ZnVuY3Rpb24oZSl7by5pKCJtcmFpZC5vcGVuICIrZSksTigib3Blbj91cmw9IitlbmNvZGVVUklDb21wb25lbnQoZSkpfSxzLnBsYXlWaWRlbz1mdW5jdGlvbihlKXtvLmkoIm1yYWlkLnBsYXlWaWRlbyAiK2UpLE4oInBsYXlWaWRlbz91cmw9IitlbmNvZGVVUklDb21wb25lbnQoZSkpfSxzLnJlbW92ZUV2ZW50TGlzdGVuZXI9ZnVuY3Rpb24oZSx0KXtpZihvLmkoIm1yYWlkLnJlbW92ZUV2ZW50TGlzdGVuZXIgIitlKyIgOiAiK1N0cmluZyh0KSksZSlpZih4KGUsdSkpaWYoUy5oYXNPd25Qcm9wZXJ0eShlKSlpZih0KXtmb3IodmFyIGk9U1tlXSxuPWkubGVuZ3RoLHI9MDtyPG47cisrKXt2YXIgYT1pW3JdLGQ9U3RyaW5nKHQpLGY9U3RyaW5nKGEpO2lmKHQ9PT1hfHxkPT09Zil7aS5zcGxpY2UociwxKTticmVha319cj09PW4mJm8uaSgibGlzdGVuZXIgIitkKyIgbm90IGZvdW5kIGZvciBldmVudCAiK2UpLDA9PT1pLmxlbmd0aCYmZGVsZXRlIFNbZV19ZWxzZSBkZWxldGUgU1tlXTtlbHNlIG8uaSgibm8gbGlzdGVuZXJzIHJlZ2lzdGVyZWQgZm9yIGV2ZW50ICIrZSk7ZWxzZSBzLmZpcmVFcnJvckV2ZW50KCJVbmtub3duIE1SQUlEIGV2ZW50OiAiK2UsInJlbW92ZUV2ZW50TGlzdGVuZXIiKTtlbHNlIHMuZmlyZUVycm9yRXZlbnQoIkV2ZW50IGlzIHJlcXVpcmVkLiIsInJlbW92ZUV2ZW50TGlzdGVuZXIiKX0scy5yZXNpemU9ZnVuY3Rpb24oKXsoby5pKCJtcmFpZC5yZXNpemUiKSxjIT09ZC5JTlRFUlNUSVRJQUwmJmghPT1hLkxPQURJTkcmJmghPT1hLkhJRERFTikmJihoIT09YS5FWFBBTkRFRD9wP04oInJlc2l6ZT8iKygid2lkdGg9IitPLndpZHRoKyImaGVpZ2h0PSIrTy5oZWlnaHQrIiZvZmZzZXRYPSIrKE8ub2Zmc2V0WCthZGp1c3RtZW50cy54KSsiJm9mZnNldFk9IisoTy5vZmZzZXRZK2FkanVzdG1lbnRzLnkpKyImY3VzdG9tQ2xvc2VQb3NpdGlvbj0iK08uY3VzdG9tQ2xvc2VQb3NpdGlvbisiJmFsbG93T2Zmc2NyZWVuPSIrTy5hbGxvd09mZnNjcmVlbikpOnMuZmlyZUVycm9yRXZlbnQoIm1yYWlkLnJlc2l6ZSBpcyBub3QgcmVhZHkgdG8gYmUgY2FsbGVkIiwibXJhaWQucmVzaXplIik6cy5maXJlRXJyb3JFdmVudCgibXJhaWQucmVzaXplIGNhbGxlZCB3aGVuIGFkIGlzIGluIGV4cGFuZGVkIHN0YXRlIiwibXJhaWQucmVzaXplIikpfSxzLnNldEV4cGFuZFByb3BlcnRpZXM9ZnVuY3Rpb24oZSl7aWYoby5pKCJtcmFpZC5zZXRFeHBhbmRQcm9wZXJ0aWVzIiksSShlLCJzZXRFeHBhbmRQcm9wZXJ0aWVzIikpe2Zvcih2YXIgdD12LnVzZUN1c3RvbUNsb3NlLGk9WyJ3aWR0aCIsImhlaWdodCIsInVzZUN1c3RvbUNsb3NlIl0sbj0wO248aS5sZW5ndGg7bisrKXt2YXIgcj1pW25dO2UuaGFzT3duUHJvcGVydHkocikmJih2W3JdPWVbcl0pfXYudXNlQ3VzdG9tQ2xvc2UhPT10JiZOKCJ1c2VDdXN0b21DbG9zZT91c2VDdXN0b21DbG9zZT0iK3YudXNlQ3VzdG9tQ2xvc2UpLG09ITB9ZWxzZSBvLmUoImZhaWxlZCB2YWxpZGF0aW9uIil9LHMuc2V0T3JpZW50YXRpb25Qcm9wZXJ0aWVzPWZ1bmN0aW9uKGUpe2lmKG8uaSgibXJhaWQuc2V0T3JpZW50YXRpb25Qcm9wZXJ0aWVzIiksSShlLCJzZXRPcmllbnRhdGlvblByb3BlcnRpZXMiKSl7dmFyIHQ9e307dC5hbGxvd09yaWVudGF0aW9uQ2hhbmdlPUMuYWxsb3dPcmllbnRhdGlvbkNoYW5nZSx0LmZvcmNlT3JpZW50YXRpb249Qy5mb3JjZU9yaWVudGF0aW9uO2Zvcih2YXIgaT1bImFsbG93T3JpZW50YXRpb25DaGFuZ2UiLCJmb3JjZU9yaWVudGF0aW9uIl0sbj0wO248aS5sZW5ndGg7bisrKXt2YXIgcj1pW25dO2UuaGFzT3duUHJvcGVydHkocikmJih0W3JdPWVbcl0pfWlmKHQuYWxsb3dPcmllbnRhdGlvbkNoYW5nZSYmdC5mb3JjZU9yaWVudGF0aW9uIT09cy5PUklFTlRBVElPTl9QUk9QRVJUSUVTX0ZPUkNFX09SSUVOVEFUSU9OLk5PTkUpcy5maXJlRXJyb3JFdmVudCgiYWxsb3dPcmllbnRhdGlvbkNoYW5nZSBpcyB0cnVlIGJ1dCBmb3JjZU9yaWVudGF0aW9uIGlzICIrdC5mb3JjZU9yaWVudGF0aW9uLCJzZXRPcmllbnRhdGlvblByb3BlcnRpZXMiKTtlbHNlIEMuYWxsb3dPcmllbnRhdGlvbkNoYW5nZT10LmFsbG93T3JpZW50YXRpb25DaGFuZ2UsQy5mb3JjZU9yaWVudGF0aW9uPXQuZm9yY2VPcmllbnRhdGlvbixOKCJzZXRPcmllbnRhdGlvblByb3BlcnRpZXM/IisoImFsbG93T3JpZW50YXRpb25DaGFuZ2U9IitDLmFsbG93T3JpZW50YXRpb25DaGFuZ2UrIiZmb3JjZU9yaWVudGF0aW9uPSIrQy5mb3JjZU9yaWVudGF0aW9uKSl9ZWxzZSBvLmUoImZhaWxlZCB2YWxpZGF0aW9uIil9LHMuc2V0UmVzaXplUHJvcGVydGllcz1mdW5jdGlvbihlKXtvLmkoIm1yYWlkLnNldFJlc2l6ZVByb3BlcnRpZXMiKSxwPSExO2Zvcih2YXIgdD1bIndpZHRoIiwiaGVpZ2h0Iiwib2Zmc2V0WCIsIm9mZnNldFkiXSxpPTA7aTx0Lmxlbmd0aDtpKyspe3ZhciBuPXRbaV07aWYoIWUuaGFzT3duUHJvcGVydHkobikpcmV0dXJuIHZvaWQgcy5maXJlRXJyb3JFdmVudCgicmVxdWlyZWQgcHJvcGVydHkgIituKyIgaXMgbWlzc2luZyIsIm1yYWlkLnNldFJlc2l6ZVByb3BlcnRpZXMiKX1pZihJKGUsInNldFJlc2l6ZVByb3BlcnRpZXMiKSl7dmFyIHI9e3g6MCx5OjB9O2lmKGUuaGFzT3duUHJvcGVydHkoImFsbG93T2Zmc2NyZWVuIik/ZS5hbGxvd09mZnNjcmVlbjpPLmFsbG93T2Zmc2NyZWVuKXtpZighZnVuY3Rpb24oZSl7by5kKCJpc0Nsb3NlUmVnaW9uT25TY3JlZW4iKSxvLmQoImRlZmF1bHRQb3NpdGlvbiAiK1AueCsiICIrUC55KSxvLmQoIm9mZnNldCAiK2Uub2Zmc2V0WCsiICIrZS5vZmZzZXRZKTt2YXIgdD17fTt0Lng9UC54K2Uub2Zmc2V0WCx0Lnk9UC55K2Uub2Zmc2V0WSx0LndpZHRoPWUud2lkdGgsdC5oZWlnaHQ9ZS5oZWlnaHQsRCgicmVzaXplUmVjdCIsdCk7dmFyIGk9ZS5oYXNPd25Qcm9wZXJ0eSgiY3VzdG9tQ2xvc2VQb3NpdGlvbiIpP2UuY3VzdG9tQ2xvc2VQb3NpdGlvbjpPLmN1c3RvbUNsb3NlUG9zaXRpb247by5kKCJjdXN0b21DbG9zZVBvc2l0aW9uICIraSk7dmFyIG49e3dpZHRoOjUwLGhlaWdodDo1MH07LTEhPT1pLnNlYXJjaCgibGVmdCIpP24ueD10Lng6LTEhPT1pLnNlYXJjaCgiY2VudGVyIik/bi54PXQueCt0LndpZHRoLzItMjU6LTEhPT1pLnNlYXJjaCgicmlnaHQiKSYmKG4ueD10LngrdC53aWR0aC01MCk7LTEhPT1pLnNlYXJjaCgidG9wIik/bi55PXQueToiY2VudGVyIj09PWk/bi55PXQueSt0LmhlaWdodC8yLTI1Oi0xIT09aS5zZWFyY2goImJvdHRvbSIpJiYobi55PXQueSt0LmhlaWdodC01MCk7dmFyIHI9e3g6MCx5OjB9O3JldHVybiByLndpZHRoPVIud2lkdGgsci5oZWlnaHQ9Ui5oZWlnaHQseihyLG4pfShlKSlyZXR1cm4gdm9pZCBzLmZpcmVFcnJvckV2ZW50KCJjbG9zZSBldmVudCByZWdpb24gd2lsbCBub3QgYXBwZWFyIGVudGlyZWx5IG9uc2NyZWVuIiwibXJhaWQuc2V0UmVzaXplUHJvcGVydGllcyIpfWVsc2V7aWYoZS53aWR0aD5SLndpZHRofHxlLmhlaWdodD5SLmhlaWdodClyZXR1cm4gdm9pZCBzLmZpcmVFcnJvckV2ZW50KCJyZXNpemUgd2lkdGggb3IgaGVpZ2h0IGlzIGdyZWF0ZXIgdGhhbiB0aGUgbWF4U2l6ZSB3aWR0aCBvciBoZWlnaHQiLCJtcmFpZC5zZXRSZXNpemVQcm9wZXJ0aWVzIik7cj1mdW5jdGlvbihlKXtvLmQoImZpdFJlc2l6ZVZpZXdPblNjcmVlbiIpLG8uZCgiZGVmYXVsdFBvc2l0aW9uICIrUC54KyIgIitQLnkpLG8uZCgib2Zmc2V0ICIrZS5vZmZzZXRYKyIgIitlLm9mZnNldFkpO3ZhciB0PXt9O3QueD1QLngrZS5vZmZzZXRYLHQueT1QLnkrZS5vZmZzZXRZLHQud2lkdGg9ZS53aWR0aCx0LmhlaWdodD1lLmhlaWdodCxEKCJyZXNpemVSZWN0Iix0KTt2YXIgaT17eDowLHk6MH07aS53aWR0aD1SLndpZHRoLGkuaGVpZ2h0PVIuaGVpZ2h0O3ZhciBuPXt4OjAseTowfTtpZih6KGksdCkpcmV0dXJuIG8uZCgibm8gYWRqdXN0bWVudCBuZWNlc3NhcnkiKSxuO3QueDxpLng/bi54PWkueC10Lng6dC54K3Qud2lkdGg+aS54K2kud2lkdGgmJihuLng9aS54K2kud2lkdGgtKHQueCt0LndpZHRoKSk7by5kKCJhZGp1c3RtZW50cy54ICIrbi54KSx0Lnk8aS55P24ueT1pLnktdC55OnQueSt0LmhlaWdodD5pLnkraS5oZWlnaHQmJihuLnk9aS55K2kuaGVpZ2h0LSh0LnkrdC5oZWlnaHQpKTtyZXR1cm4gby5kKCJhZGp1c3RtZW50cy55ICIrbi55KSx0Lng9UC54K2Uub2Zmc2V0WCtuLngsdC55PVAueStlLm9mZnNldFkrbi55LEQoImFkanVzdGVkIHJlc2l6ZVJlY3QiLHQpLG59KGUpfXZhciBhPVsid2lkdGgiLCJoZWlnaHQiLCJvZmZzZXRYIiwib2Zmc2V0WSIsImN1c3RvbUNsb3NlUG9zaXRpb24iLCJhbGxvd09mZnNjcmVlbiJdO2ZvcihpPTA7aTxhLmxlbmd0aDtpKyspe249YVtpXTtlLmhhc093blByb3BlcnR5KG4pJiYoT1tuXT1lW25dKX1OKCJzZXRSZXNpemVQcm9wZXJ0aWVzPyIrKCJ3aWR0aD0iK08ud2lkdGgrIiZoZWlnaHQ9IitPLmhlaWdodCsiJm9mZnNldFg9IisoTy5vZmZzZXRYK3IueCkrIiZvZmZzZXRZPSIrKE8ub2Zmc2V0WStyLnkpKyImY3VzdG9tQ2xvc2VQb3NpdGlvbj0iK08uY3VzdG9tQ2xvc2VQb3NpdGlvbisiJmFsbG93T2Zmc2NyZWVuPSIrTy5hbGxvd09mZnNjcmVlbikpLHA9ITB9ZWxzZSBzLmZpcmVFcnJvckV2ZW50KCJmYWlsZWQgdmFsaWRhdGlvbiIsIm1yYWlkLnNldFJlc2l6ZVByb3BlcnRpZXMiKX0scy5zdG9yZVBpY3R1cmU9ZnVuY3Rpb24oZSl7by5pKCJtcmFpZC5zdG9yZVBpY3R1cmUgIitlKSxFW3MuU1VQUE9SVEVEX0ZFQVRVUkVTLlNUT1JFUElDVFVSRV0/Tigic3RvcmVQaWN0dXJlP3VybD0iK2VuY29kZVVSSUNvbXBvbmVudChlKSk6by5lKCJzdG9yZVBpY3R1cmUgaXMgbm90IHN1cHBvcnRlZCIpfSxzLnN1cHBvcnRzPWZ1bmN0aW9uKGUpe28uaSgibXJhaWQuc3VwcG9ydHMgIitlKyIgIitFW2VdKTt2YXIgdD1FW2VdO3JldHVybiB2b2lkIDA9PT10JiYodD0hMSksdH0scy51c2VDdXN0b21DbG9zZT1mdW5jdGlvbihlKXtvLmkoIm1yYWlkLnVzZUN1c3RvbUNsb3NlICIrZSksdi51c2VDdXN0b21DbG9zZSE9PWUmJih2LnVzZUN1c3RvbUNsb3NlPWUsTigidXNlQ3VzdG9tQ2xvc2U/dXNlQ3VzdG9tQ2xvc2U9Iit2LnVzZUN1c3RvbUNsb3NlKSl9LHMuc2V0Q3VycmVudFBvc2l0aW9uPWZ1bmN0aW9uKGUsdCxpLG4pe28uaSgibXJhaWQuc2V0Q3VycmVudFBvc2l0aW9uICIrZSsiLCIrdCsiLCIraSsiLCIrbiksdy54PWUsdy55PXQsdy53aWR0aD1pLHcuaGVpZ2h0PW59LHMuc2V0RGVmYXVsdFBvc2l0aW9uPWZ1bmN0aW9uKGUsdCxpLG4pe28uaSgibXJhaWQuc2V0RGVmYXVsdFBvc2l0aW9uICIrZSsiLCIrdCsiLCIraSsiLCIrbiksUC54PWUsUC55PXQsUC53aWR0aD1pLFAuaGVpZ2h0PW59LHMuc2V0RXhwYW5kU2l6ZT1mdW5jdGlvbihlLHQpe28uaSgibXJhaWQuc2V0RXhwYW5kU2l6ZSAiK2UrIngiK3QpLHYud2lkdGg9ZSx2LmhlaWdodD10fSxzLnNldE1heFNpemU9ZnVuY3Rpb24oZSx0KXtvLmkoIm1yYWlkLnNldE1heFNpemUgIitlKyJ4Iit0KSxSLndpZHRoPWUsUi5oZWlnaHQ9dH0scy5zZXRQbGFjZW1lbnRUeXBlPWZ1bmN0aW9uKGUpe28uaSgibXJhaWQuc2V0UGxhY2VtZW50VHlwZSAiK2UpLGM9ZX0scy5zZXRTY3JlZW5TaXplPWZ1bmN0aW9uKGUsdCl7by5pKCJtcmFpZC5zZXRTY3JlZW5TaXplICIrZSsieCIrdCkseS53aWR0aD1lLHkuaGVpZ2h0PXQsbXx8KHYud2lkdGg9ZSx2LmhlaWdodD10KX0scy5zZXRTdXBwb3J0cz1mdW5jdGlvbihlLHQpe28uaSgibXJhaWQuc2V0U3VwcG9ydHMgIitlKyIgIit0KSxFW2VdPXR9LHMuZmlyZUVycm9yRXZlbnQ9ZnVuY3Rpb24oZSx0KXtvLmkoIm1yYWlkLmZpcmVFcnJvckV2ZW50ICIrZSsiICIrdCksVChzLkVWRU5UUy5FUlJPUixlLHQpfSxzLmZpcmVSZWFkeUV2ZW50PWZ1bmN0aW9uKCl7dGhpcy5pc05hdGl2ZVNka1JlYWR5PSEwLG8uaSgibXJhaWQuZmlyZVJlYWR5RXZlbnQ6ICIrdGhpcy5pc05hdGl2ZVNka1JlYWR5KSxUKHMuRVZFTlRTLlJFQURZKX0scy5maXJlU2l6ZUNoYW5nZUV2ZW50PWZ1bmN0aW9uKGUsdCl7by5pKCJtcmFpZC5maXJlU2l6ZUNoYW5nZUV2ZW50ICIrZSsieCIrdCksaCE9PXMuU1RBVEVTLkxPQURJTkcmJlQocy5FVkVOVFMuU0laRUNIQU5HRSxlLHQpfSxzLmZpcmVTdGF0ZUNoYW5nZUV2ZW50PWZ1bmN0aW9uKGUpe28uaSgibXJhaWQuZmlyZVN0YXRlQ2hhbmdlRXZlbnQgIitlKSxoIT09ZSYmKGg9ZSxUKHMuRVZFTlRTLlNUQVRFQ0hBTkdFLGgpKX0scy5maXJlVmlld2FibGVDaGFuZ2VFdmVudD1mdW5jdGlvbihlKXtvLmkoIm1yYWlkLmZpcmVWaWV3YWJsZUNoYW5nZUV2ZW50ICIrZSksZyE9PWUmJihnPWUsVChzLkVWRU5UUy5WSUVXQUJMRUNIQU5HRSxnKSl9LHMuYWRMb2FkZWQ9ITE7ZnVuY3Rpb24gTihlKXtpZighcy5pc05hdGl2ZVNka1JlYWR5KXJldHVybiBjb25zb2xlLmxvZygicmVqZWN0aW5nICIrZSsiIGJlY2F1c2UgbXJhaWQgaXMgbm90IHJlYWR5Iiksdm9pZCBzLmZpcmVFcnJvckV2ZW50KCJtcmFpZCBpcyBub3QgcmVhZHkiLGUpO3ZhciB0PSJtcmFpZDovLyIrZTtzLm5hdGl2ZUNhbGxSdW5uaW5nP3MubmF0aXZlQ2FsbFF1ZXVlLnB1c2godCk6KHMubmF0aXZlQ2FsbFJ1bm5pbmc9ITAsd2luZG93LmxvY2F0aW9uPXQpfWZ1bmN0aW9uIFQoZSl7dmFyIHQ9QXJyYXkucHJvdG90eXBlLnNsaWNlLmNhbGwoYXJndW1lbnRzKTt0LnNoaWZ0KCksby5pKCJmaXJlRXZlbnQgIitlKyIgWyIrdC50b1N0cmluZygpKyJdIik7dmFyIGk9U1tlXTtpZihpKXt2YXIgbj1pLnNsaWNlKCkscj1uLmxlbmd0aDtvLmkocisiIGxpc3RlbmVyKHMpIGZvdW5kIik7Zm9yKHZhciBzPTA7czxyO3MrKyluW3NdLmFwcGx5KG51bGwsdCl9ZWxzZSBvLmkoIm5vIGxpc3RlbmVycyBmb3VuZCBmb3IgIitlKX1mdW5jdGlvbiB4KGUsdCl7Zm9yKHZhciBpIGluIHQpaWYodFtpXT09PWUpcmV0dXJuITA7cmV0dXJuITF9ZnVuY3Rpb24gSShlLHQpe3ZhciBpPSEwLG49QVt0XTtmb3IodmFyIHIgaW4gZSl7dmFyIG89bltyXSxhPWVbcl07byYmIW8oYSkmJihzLmZpcmVFcnJvckV2ZW50KCJWYWx1ZSBvZiBwcm9wZXJ0eSAiK3IrIiAoIithKyIpIGlzIGludmFsaWQiLCJtcmFpZC4iK3QpLGk9ITEpfXJldHVybiBpfXMubm9GaWxsPWZ1bmN0aW9uKCl7cy5hZExvYWRlZHx8KG8uaSgibXJhaWQubm9GaWxsIiksTigibm9GaWxsIikpfSxzLmxvYWRlZD1mdW5jdGlvbigpe28uaSgibXJhaWQubG9hZGVkIikscy5hZExvYWRlZD0hMCxOKCJsb2FkZWQiKX0scy5nZXRBcHBvZGVhbFZlcnNpb249ZnVuY3Rpb24oKXtyZXR1cm4gby5pKCJtcmFpZC5nZXRBcHBvZGVhbFZlcnNpb24iKSwiJSVWRVJTSU9OJSUifSxzLm5hdGl2ZUNhbGxDb21wbGV0ZT1mdW5jdGlvbigpe2lmKG8uaSgibXJhaWQubmF0aXZlQ2FsbENvbXBsZXRlIiksMCE9PXRoaXMubmF0aXZlQ2FsbFF1ZXVlLmxlbmd0aCl7dmFyIGU9dGhpcy5uYXRpdmVDYWxsUXVldWUucG9wKCk7d2luZG93LmxvY2F0aW9uPWV9ZWxzZSB0aGlzLm5hdGl2ZUNhbGxSdW5uaW5nPSExfTt2YXIgQT17c2V0RXhwYW5kUHJvcGVydGllczp7d2lkdGg6ZnVuY3Rpb24oZSl7cmV0dXJuIWlzTmFOKGUpfSxoZWlnaHQ6ZnVuY3Rpb24oZSl7cmV0dXJuIWlzTmFOKGUpfSx1c2VDdXN0b21DbG9zZTpmdW5jdGlvbihlKXtyZXR1cm4iYm9vbGVhbiI9PXR5cGVvZiBlfX0sc2V0T3JpZW50YXRpb25Qcm9wZXJ0aWVzOnthbGxvd09yaWVudGF0aW9uQ2hhbmdlOmZ1bmN0aW9uKGUpe3JldHVybiJib29sZWFuIj09dHlwZW9mIGV9LGZvcmNlT3JpZW50YXRpb246ZnVuY3Rpb24oZSl7cmV0dXJuInN0cmluZyI9PXR5cGVvZiBlJiYtMSE9PVsicG9ydHJhaXQiLCJsYW5kc2NhcGUiLCJub25lIl0uaW5kZXhPZihlKX19LHNldFJlc2l6ZVByb3BlcnRpZXM6e3dpZHRoOmZ1bmN0aW9uKGUpe3JldHVybiFpc05hTihlKSYmNTA8PWV9LGhlaWdodDpmdW5jdGlvbihlKXtyZXR1cm4haXNOYU4oZSkmJjUwPD1lfSxvZmZzZXRYOmZ1bmN0aW9uKGUpe3JldHVybiFpc05hTihlKX0sb2Zmc2V0WTpmdW5jdGlvbihlKXtyZXR1cm4haXNOYU4oZSl9LGN1c3RvbUNsb3NlUG9zaXRpb246ZnVuY3Rpb24oZSl7cmV0dXJuInN0cmluZyI9PXR5cGVvZiBlJiYtMSE9PVsidG9wLWxlZnQiLCJ0b3AtY2VudGVyIiwidG9wLXJpZ2h0IiwiY2VudGVyIiwiYm90dG9tLWxlZnQiLCJib3R0b20tY2VudGVyIiwiYm90dG9tLXJpZ2h0Il0uaW5kZXhPZihlKX0sYWxsb3dPZmZzY3JlZW46ZnVuY3Rpb24oZSl7cmV0dXJuImJvb2xlYW4iPT10eXBlb2YgZX19fTtmdW5jdGlvbiB6KGUsdCl7cmV0dXJuIG8uZCgiaXNSZWN0Q29udGFpbmVkIiksRCgiY29udGFpbmluZ1JlY3QiLGUpLEQoImNvbnRhaW5lZFJlY3QiLHQpLHQueD49ZS54JiZ0LngrdC53aWR0aDw9ZS54K2Uud2lkdGgmJnQueT49ZS55JiZ0LnkrdC5oZWlnaHQ8PWUueStlLmhlaWdodH1mdW5jdGlvbiBEKGUsdCl7by5kKGUrIiBbIit0LngrIiwiK3QueSsiXSxbIisodC54K3Qud2lkdGgpKyIsIisodC55K3QuaGVpZ2h0KSsiXSAoIit0LndpZHRoKyJ4Iit0LmhlaWdodCsiKSIpfXMuZHVtcExpc3RlbmVycz1mdW5jdGlvbigpe3ZhciBlPU9iamVjdC5rZXlzKFMpLmxlbmd0aDtmb3IodmFyIHQgaW4gby5pKCJkdW1waW5nIGxpc3RlbmVycyAoIitlKyIgZXZlbnRzKSIpLFMpe3ZhciBpPVNbdF07by5pKCIgICIrdCsiIGNvbnRhaW5zICIraS5sZW5ndGgrIiBsaXN0ZW5lcnMiKTtmb3IodmFyIG49MDtuPGkubGVuZ3RoO24rKylvLmkoIiAgICAiK2lbbl0pfX0sY29uc29sZS5sb2coIk1SQUlEIG9iamVjdCBsb2FkZWQiKX0oKTs=", 0)).replace("%%VERSION%%", IabSettings.mediatorVersion);
        }
        return f3010e;
    }

    public static boolean b(String str) {
        return f3007b.contains(str);
    }

    public static boolean b(String str, String str2, List<Pair<Integer, Integer>> list) {
        return a(str, str2, list) > -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r7.hashCode()
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            java.lang.String r4 = "useCustomClose"
            r5 = 0
            r6 = 1
            switch(r0) {
                case -1886160473: goto L_0x003c;
                case 3417674: goto L_0x0031;
                case 133423073: goto L_0x0026;
                case 624734601: goto L_0x001b;
                case 1614272768: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0047
        L_0x0012:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0019
            goto L_0x0047
        L_0x0019:
            r7 = 4
            goto L_0x0048
        L_0x001b:
            java.lang.String r0 = "setResizeProperties"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0024
            goto L_0x0047
        L_0x0024:
            r7 = 3
            goto L_0x0048
        L_0x0026:
            java.lang.String r0 = "setOrientationProperties"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x002f
            goto L_0x0047
        L_0x002f:
            r7 = 2
            goto L_0x0048
        L_0x0031:
            java.lang.String r0 = "open"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            r7 = 1
            goto L_0x0048
        L_0x003c:
            java.lang.String r0 = "playVideo"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r7 = 0
            goto L_0x0048
        L_0x0047:
            r7 = -1
        L_0x0048:
            if (r7 == 0) goto L_0x009c
            if (r7 == r6) goto L_0x009c
            if (r7 == r3) goto L_0x008a
            if (r7 == r2) goto L_0x0058
            if (r7 == r1) goto L_0x0053
            return r6
        L_0x0053:
            boolean r7 = r8.containsKey(r4)
            return r7
        L_0x0058:
            java.lang.String r7 = "width"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x0089
            java.lang.String r7 = "height"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x0089
            java.lang.String r7 = "offsetX"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x0089
            java.lang.String r7 = "offsetY"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x0089
            java.lang.String r7 = "customClosePosition"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x0089
            java.lang.String r7 = "allowOffscreen"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x0089
            r5 = 1
        L_0x0089:
            return r5
        L_0x008a:
            java.lang.String r7 = "allowOrientationChange"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x009b
            java.lang.String r7 = "forceOrientation"
            boolean r7 = r8.containsKey(r7)
            if (r7 == 0) goto L_0x009b
            r5 = 1
        L_0x009b:
            return r5
        L_0x009c:
            java.lang.String r7 = "url"
            boolean r7 = r8.containsKey(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.mraid.g.b(java.lang.String, java.util.Map):boolean");
    }

    public static Map<String, String> c(String str) {
        return a(str, f3009d);
    }

    public static String d(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*([\\\"\\'])mraid\\.js\\1[^>]*>\\s*</script>\\n*", 2).matcher(stringBuffer);
        if (matcher.find()) {
            stringBuffer.delete(matcher.start(), matcher.end());
        }
        List<Pair<Integer, Integer>> a2 = a(str, f3008c);
        boolean b2 = b(str, OSInAppMessageContentKt.HTML, a2);
        boolean b3 = b(str, "head", a2);
        boolean b4 = b(str, "body", a2);
        if ((!b2 && (b3 || b4)) || (b2 && !b4)) {
            return str;
        }
        if (!b2) {
            stringBuffer.insert(0, "<html><head></head><body><div align=\"center\">");
            stringBuffer.append("</div></body></html>");
        } else if (!b3) {
            Matcher matcher2 = Pattern.compile("<html[^>]*>", 2).matcher(stringBuffer);
            for (int i = 0; matcher2.find(i); i = matcher2.end()) {
                stringBuffer.insert(matcher2.end(), "<head></head>");
            }
        }
        a(stringBuffer);
        return stringBuffer.toString();
    }
}

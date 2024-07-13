package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.adcolony.sdk.AdColonyAppOptions;
import com.applovin.impl.mediation.a.a;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import io.bidmachine.BidMachine;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final TreeMap<String, String> f14610a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<String> f14611b = new ArrayList(f14610a.keySet());

    /* renamed from: c  reason: collision with root package name */
    private static JSONArray f14612c;

    /* renamed from: d  reason: collision with root package name */
    private static final Object f14613d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f14610a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        f14610a.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        f14610a.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        f14610a.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        f14610a.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        f14610a.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", BidMachine.NAME);
        f14610a.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        f14610a.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        f14610a.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        f14610a.put("com.applovin.mediation.adapters.CSJMediationAdapter", "CSJ");
        f14610a.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        f14610a.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        f14610a.put("com.applovin.mediation.adapters.GoogleMediationAdapter", AdColonyAppOptions.ADMOB);
        f14610a.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        f14610a.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        f14610a.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        f14610a.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", AdColonyAppOptions.FYBER);
        f14610a.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", AdColonyAppOptions.IRONSOURCE);
        f14610a.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        f14610a.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        f14610a.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        f14610a.put("com.applovin.mediation.adapters.MobileFuseMediationAdapter", "MobileFuse");
        f14610a.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        f14610a.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        f14610a.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        f14610a.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        f14610a.put("com.applovin.mediation.adapters.PangleMediationAdapter", "Pangle");
        f14610a.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        f14610a.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        f14610a.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        f14610a.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        f14610a.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        f14610a.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        f14610a.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        f14610a.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        f14610a.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        f14610a.put("com.applovin.mediation.adapters.YahooMediationAdapter", "Yahoo");
        f14610a.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
    }

    public static o.a a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? o.a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.APP_OPEN ? o.a.MEDIATION_APP_OPEN : maxAdFormat == MaxAdFormat.REWARDED ? o.a.MEDIATION_INCENTIVIZED : maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? o.a.MEDIATION_REWARDED_INTERSTITIAL : o.a.MEDIATION_BANNER;
    }

    public static AppLovinSdkUtils.Size a(int i, MaxAdFormat maxAdFormat, Context context) {
        if (i < 0) {
            try {
                Display defaultDisplay = (context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        Class<?> cls = Class.forName("com.google.android.gms.ads.AdSize");
        Method method = cls.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", new Class[]{Context.class, Integer.TYPE});
        Method method2 = cls.getMethod("getWidth", new Class[0]);
        Method method3 = cls.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke((Object) null, new Object[]{context, Integer.valueOf(i)});
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }

    public static JSONArray a(n nVar) {
        if (f14612c != null) {
            b(nVar);
            return f14612c;
        }
        f14612c = new JSONArray();
        for (String next : f14611b) {
            MaxAdapter b2 = b(next, nVar);
            if (b2 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", f14610a.get(next));
                    jSONObject.put("class", next);
                    jSONObject.put("sdk_version", b2.getSdkVersion());
                    jSONObject.put(MediationMetaData.KEY_VERSION, b2.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f14613d) {
                    f14612c.put(jSONObject);
                }
            }
        }
        return f14612c;
    }

    public static JSONObject a(String str, n nVar) {
        JSONArray a2 = a(nVar);
        for (int i = 0; i < a2.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(a2, i, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", (String) null))) {
                return jSONObject;
            }
        }
        return null;
    }

    public static boolean a(Object obj) {
        return (obj instanceof e) && StringUtils.isValidString(((e) obj).N());
    }

    public static MaxAdapter b(String str, n nVar) {
        if (TextUtils.isEmpty(str)) {
            nVar.D();
            if (v.a()) {
                nVar.D().e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{nVar.ab()});
            }
            nVar.D();
            if (v.a()) {
                v D = nVar.D();
                D.e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            }
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            nVar.D();
            if (v.a()) {
                v D2 = nVar.D();
                D2.b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
    }

    private static void b(n nVar) {
        MaxAdapter b2;
        for (int i = 0; i < f14612c.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f14612c, i, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (b2 = b(string, nVar)) != null) {
                String sdkVersion = b2.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (f14613d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public static boolean b(Object obj) {
        return (obj instanceof a) && "APPLOVIN".equals(((a) obj).T());
    }
}

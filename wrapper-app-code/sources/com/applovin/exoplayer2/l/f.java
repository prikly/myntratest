package com.applovin.exoplayer2.l;

import android.graphics.Color;
import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13537a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f13538b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f13539c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Integer> f13540d;

    static {
        HashMap hashMap = new HashMap();
        f13540d = hashMap;
        hashMap.put("aliceblue", -984833);
        f13540d.put("antiquewhite", -332841);
        f13540d.put("aqua", -16711681);
        f13540d.put("aquamarine", -8388652);
        f13540d.put("azure", -983041);
        f13540d.put("beige", -657956);
        f13540d.put("bisque", -6972);
        f13540d.put("black", -16777216);
        f13540d.put("blanchedalmond", -5171);
        f13540d.put("blue", -16776961);
        f13540d.put("blueviolet", -7722014);
        f13540d.put("brown", -5952982);
        f13540d.put("burlywood", -2180985);
        f13540d.put("cadetblue", -10510688);
        f13540d.put("chartreuse", -8388864);
        f13540d.put("chocolate", -2987746);
        f13540d.put("coral", -32944);
        f13540d.put("cornflowerblue", -10185235);
        f13540d.put("cornsilk", -1828);
        f13540d.put("crimson", -2354116);
        f13540d.put("cyan", -16711681);
        f13540d.put("darkblue", -16777077);
        f13540d.put("darkcyan", -16741493);
        f13540d.put("darkgoldenrod", -4684277);
        f13540d.put("darkgray", -5658199);
        f13540d.put("darkgreen", -16751616);
        f13540d.put("darkgrey", -5658199);
        f13540d.put("darkkhaki", -4343957);
        f13540d.put("darkmagenta", -7667573);
        f13540d.put("darkolivegreen", -11179217);
        f13540d.put("darkorange", -29696);
        f13540d.put("darkorchid", -6737204);
        f13540d.put("darkred", -7667712);
        f13540d.put("darksalmon", -1468806);
        f13540d.put("darkseagreen", -7357297);
        f13540d.put("darkslateblue", -12042869);
        f13540d.put("darkslategray", -13676721);
        f13540d.put("darkslategrey", -13676721);
        f13540d.put("darkturquoise", -16724271);
        f13540d.put("darkviolet", -7077677);
        f13540d.put("deeppink", -60269);
        f13540d.put("deepskyblue", -16728065);
        f13540d.put("dimgray", -9868951);
        f13540d.put("dimgrey", -9868951);
        f13540d.put("dodgerblue", -14774017);
        f13540d.put("firebrick", -5103070);
        f13540d.put("floralwhite", -1296);
        f13540d.put("forestgreen", -14513374);
        f13540d.put("fuchsia", -65281);
        f13540d.put("gainsboro", -2302756);
        f13540d.put("ghostwhite", -460545);
        f13540d.put("gold", -10496);
        f13540d.put("goldenrod", -2448096);
        f13540d.put("gray", -8355712);
        f13540d.put("green", -16744448);
        f13540d.put("greenyellow", -5374161);
        f13540d.put("grey", -8355712);
        f13540d.put("honeydew", -983056);
        f13540d.put("hotpink", -38476);
        f13540d.put("indianred", -3318692);
        f13540d.put("indigo", -11861886);
        f13540d.put("ivory", -16);
        f13540d.put("khaki", -989556);
        f13540d.put("lavender", -1644806);
        f13540d.put("lavenderblush", -3851);
        f13540d.put("lawngreen", -8586240);
        f13540d.put("lemonchiffon", -1331);
        f13540d.put("lightblue", -5383962);
        f13540d.put("lightcoral", -1015680);
        f13540d.put("lightcyan", -2031617);
        f13540d.put("lightgoldenrodyellow", -329006);
        f13540d.put("lightgray", -2894893);
        f13540d.put("lightgreen", -7278960);
        f13540d.put("lightgrey", -2894893);
        f13540d.put("lightpink", -18751);
        f13540d.put("lightsalmon", -24454);
        f13540d.put("lightseagreen", -14634326);
        f13540d.put("lightskyblue", -7876870);
        f13540d.put("lightslategray", -8943463);
        f13540d.put("lightslategrey", -8943463);
        f13540d.put("lightsteelblue", -5192482);
        f13540d.put("lightyellow", -32);
        f13540d.put("lime", -16711936);
        f13540d.put("limegreen", -13447886);
        f13540d.put("linen", -331546);
        f13540d.put("magenta", -65281);
        f13540d.put("maroon", -8388608);
        f13540d.put("mediumaquamarine", -10039894);
        f13540d.put("mediumblue", -16777011);
        f13540d.put("mediumorchid", -4565549);
        f13540d.put("mediumpurple", -7114533);
        f13540d.put("mediumseagreen", -12799119);
        f13540d.put("mediumslateblue", -8689426);
        f13540d.put("mediumspringgreen", -16713062);
        f13540d.put("mediumturquoise", -12004916);
        f13540d.put("mediumvioletred", -3730043);
        f13540d.put("midnightblue", -15132304);
        f13540d.put("mintcream", -655366);
        f13540d.put("mistyrose", -6943);
        f13540d.put("moccasin", -6987);
        f13540d.put("navajowhite", -8531);
        f13540d.put("navy", -16777088);
        f13540d.put("oldlace", -133658);
        f13540d.put("olive", -8355840);
        f13540d.put("olivedrab", -9728477);
        f13540d.put("orange", -23296);
        f13540d.put("orangered", -47872);
        f13540d.put("orchid", -2461482);
        f13540d.put("palegoldenrod", -1120086);
        f13540d.put("palegreen", -6751336);
        f13540d.put("paleturquoise", -5247250);
        f13540d.put("palevioletred", -2396013);
        f13540d.put("papayawhip", -4139);
        f13540d.put("peachpuff", -9543);
        f13540d.put("peru", -3308225);
        f13540d.put("pink", -16181);
        f13540d.put("plum", -2252579);
        f13540d.put("powderblue", -5185306);
        f13540d.put("purple", -8388480);
        f13540d.put("rebeccapurple", -10079335);
        f13540d.put("red", -65536);
        f13540d.put("rosybrown", -4419697);
        f13540d.put("royalblue", -12490271);
        f13540d.put("saddlebrown", -7650029);
        f13540d.put("salmon", -360334);
        f13540d.put("sandybrown", -744352);
        f13540d.put("seagreen", -13726889);
        f13540d.put("seashell", -2578);
        f13540d.put("sienna", -6270419);
        f13540d.put("silver", -4144960);
        f13540d.put("skyblue", -7876885);
        f13540d.put("slateblue", -9807155);
        f13540d.put("slategray", -9404272);
        f13540d.put("slategrey", -9404272);
        f13540d.put("snow", -1286);
        f13540d.put("springgreen", -16711809);
        f13540d.put("steelblue", -12156236);
        f13540d.put("tan", -2968436);
        f13540d.put("teal", -16744320);
        f13540d.put("thistle", -2572328);
        f13540d.put("tomato", -40121);
        f13540d.put("transparent", 0);
        f13540d.put("turquoise", -12525360);
        f13540d.put("violet", -1146130);
        f13540d.put("wheat", -663885);
        f13540d.put("white", -1);
        f13540d.put("whitesmoke", -657931);
        f13540d.put("yellow", -256);
        f13540d.put("yellowgreen", -6632142);
    }

    public static int a(String str) {
        return a(str, false);
    }

    private static int a(String str, boolean z) {
        a.a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return -16777216 | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f13539c : f13538b).matcher(replace);
            if (matcher.matches()) {
                return Color.argb(z ? (int) (Float.parseFloat((String) a.b(matcher.group(4))) * 255.0f) : Integer.parseInt((String) a.b(matcher.group(4)), 10), Integer.parseInt((String) a.b(matcher.group(1)), 10), Integer.parseInt((String) a.b(matcher.group(2)), 10), Integer.parseInt((String) a.b(matcher.group(3)), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f13537a.matcher(replace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt((String) a.b(matcher2.group(1)), 10), Integer.parseInt((String) a.b(matcher2.group(2)), 10), Integer.parseInt((String) a.b(matcher2.group(3)), 10));
            }
        } else {
            Integer num = f13540d.get(Ascii.toLowerCase(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int b(String str) {
        return a(str, true);
    }
}

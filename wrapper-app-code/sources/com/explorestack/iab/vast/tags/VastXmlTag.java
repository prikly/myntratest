package com.explorestack.iab.vast.tags;

import android.graphics.Color;
import android.text.TextUtils;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.explorestack.iab.utils.IabElementStyle;
import com.explorestack.iab.utils.Utils;
import com.explorestack.iab.vast.VastLog;
import io.bidmachine.utils.IabUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class VastXmlTag implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public String f3307a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, String> f3308b;

    public VastXmlTag() {
    }

    public VastXmlTag(XmlPullParser xmlPullParser) {
        parse(xmlPullParser);
    }

    public static HashMap<String, String> a(VastXmlTag vastXmlTag, XmlPullParser xmlPullParser) {
        if (xmlPullParser.getAttributeCount() <= 0) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (vastXmlTag.d(xmlPullParser.getAttributeName(i))) {
                hashMap.put(xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
            }
        }
        return hashMap;
    }

    public static void a(XmlPullParser xmlPullParser, IabElementStyle iabElementStyle) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (!TextUtils.isEmpty(attributeValue)) {
                try {
                    if ("stroke".equals(attributeName)) {
                        iabElementStyle.setStrokeColor(c(attributeValue));
                    } else if ("fill".equals(attributeName)) {
                        iabElementStyle.setFillColor(c(attributeValue));
                    } else if ("outlined".equals(attributeName)) {
                        iabElementStyle.setOutlined(Boolean.valueOf(k(attributeValue)));
                    } else if ("visible".equals(attributeName)) {
                        iabElementStyle.setVisible(Boolean.valueOf(k(attributeValue)));
                    } else if ("x".equals(attributeName)) {
                        iabElementStyle.setHorizontalPosition(h(attributeValue));
                    } else if ("y".equals(attributeName)) {
                        iabElementStyle.setVerticalPosition(i(attributeValue));
                    } else if ("style".equals(attributeName)) {
                        iabElementStyle.setStyle(attributeValue);
                    } else if ("opacity".equals(attributeName)) {
                        iabElementStyle.setOpacity(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("hideafter".equals(attributeName)) {
                        iabElementStyle.setHideAfter(Float.valueOf(Float.parseFloat(attributeValue)));
                    } else if ("padding".equals(attributeName)) {
                        iabElementStyle.setPadding(attributeValue);
                    } else if ("margin".equals(attributeName)) {
                        iabElementStyle.setMargin(attributeValue);
                    } else if ("strokewidth".equals(attributeName)) {
                        iabElementStyle.setStrokeWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if (IabUtils.KEY_WIDTH.equals(attributeName)) {
                        iabElementStyle.setWidth(Utils.convertCssSizeToPx(attributeValue));
                    } else if (IabUtils.KEY_HEIGHT.equals(attributeName)) {
                        iabElementStyle.setHeight(Utils.convertCssSizeToPx(attributeValue));
                    } else if ("fontstyle".equals(attributeName)) {
                        iabElementStyle.setFontStyle(Integer.valueOf(Integer.parseInt(attributeValue)));
                    } else if ("fontsize".equals(attributeName)) {
                        iabElementStyle.setFontSize(Utils.convertCssSizeToPx(attributeValue));
                    }
                } catch (Throwable th) {
                    VastLog.a("VastXmlTag", th);
                }
            }
        }
        try {
            iabElementStyle.setContent(c(xmlPullParser));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            xmlPullParser.require(3, (String) null, xmlPullParser.getName());
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    public static boolean a(String str, String str2) {
        return str != null && str.equalsIgnoreCase(str2);
    }

    public static boolean b(XmlPullParser xmlPullParser) {
        return k(c(xmlPullParser));
    }

    public static Integer c(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception e2) {
            VastLog.a("VastXmlTag", e2.getMessage());
            return null;
        }
    }

    public static String c(XmlPullParser xmlPullParser) {
        if (xmlPullParser.next() != 4) {
            return null;
        }
        String text = xmlPullParser.getText();
        if (!TextUtils.isEmpty(text)) {
            text = text.trim();
        }
        xmlPullParser.nextTag();
        return text;
    }

    public static void d(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static int e(String str) {
        if (str == null) {
            return -1;
        }
        int indexOf = str.indexOf(".");
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        String[] split = str.split(":");
        if (split.length <= 2) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[0]) * 60 * 60) + (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
        } catch (Exception e2) {
            VastLog.a("VastXmlTag", (Throwable) e2);
            return -1;
        }
    }

    public static int f(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length <= 1) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[0]) * 60) + Integer.parseInt(split[1]);
        } catch (Exception e2) {
            VastLog.a("VastXmlTag", (Throwable) e2);
            return -1;
        }
    }

    public static Integer g(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        if (lowerCase.equals("portrait")) {
            i = 1;
        } else if (!lowerCase.equals("landscape")) {
            return null;
        } else {
            i = 2;
        }
        return Integer.valueOf(i);
    }

    public static Integer h(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c2 = 65535;
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1364013995) {
            if (hashCode != 3317767) {
                if (hashCode == 108511772 && lowerCase.equals("right")) {
                    c2 = 2;
                }
            } else if (lowerCase.equals("left")) {
                c2 = 1;
            }
        } else if (lowerCase.equals("center")) {
            c2 = 0;
        }
        if (c2 == 0) {
            return 1;
        }
        if (c2 == 1) {
            i = 3;
        } else if (c2 != 2) {
            return null;
        } else {
            i = 5;
        }
        return Integer.valueOf(i);
    }

    public static Integer i(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        char c2 = 65535;
        int hashCode = lowerCase.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode != -1364013995) {
                if (hashCode == 115029 && lowerCase.equals("top")) {
                    c2 = 2;
                }
            } else if (lowerCase.equals("center")) {
                c2 = 1;
            }
        } else if (lowerCase.equals("bottom")) {
            c2 = 0;
        }
        if (c2 == 0) {
            i = 80;
        } else if (c2 == 1) {
            i = 16;
        } else if (c2 != 2) {
            return null;
        } else {
            i = 48;
        }
        return Integer.valueOf(i);
    }

    public static boolean j(String str) {
        return str != null && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase(BuildConfig.ADAPTER_VERSION));
    }

    public static boolean k(String str) {
        return str != null && (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("1"));
    }

    public final String a(String str) {
        if (a()) {
            return this.f3308b.get(str);
        }
        return null;
    }

    public final void a(HashMap<String, String> hashMap) {
        this.f3308b = hashMap;
    }

    public void a(XmlPullParser xmlPullParser) {
    }

    public final boolean a() {
        HashMap<String, String> hashMap = this.f3308b;
        return hashMap != null && !hashMap.isEmpty();
    }

    public final int b(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            VastLog.d("VastXmlTag", String.format(Locale.ENGLISH, "Error parse attribute value - %s, by name - %s", new Object[]{a2, str}));
            return -1;
        }
        try {
            return Integer.parseInt(a2);
        } catch (Exception unused) {
            VastLog.a("VastXmlTag", String.format(Locale.ENGLISH, "Error parse attribute value - %s, by name - %s", new Object[]{a2, str}));
            return -1;
        }
    }

    public final boolean d(String str) {
        String[] supportedAttributes = getSupportedAttributes();
        if (supportedAttributes != null && supportedAttributes.length > 0) {
            for (String equals : supportedAttributes) {
                if (equals.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean getBooleanAttributeValueByName(String str, boolean z) {
        String a2 = a(str);
        if (k(a2)) {
            return true;
        }
        if (j(a2)) {
            return false;
        }
        return z;
    }

    public String[] getSupportedAttributes() {
        return new String[0];
    }

    public final String getText() {
        return this.f3307a;
    }

    public boolean isTextSupported() {
        return false;
    }

    public boolean isValidTag() {
        return true;
    }

    public void parse(XmlPullParser xmlPullParser) {
        a(a(this, xmlPullParser));
        if (isTextSupported()) {
            setText(c(xmlPullParser));
        }
        a(xmlPullParser);
    }

    public final void setText(String str) {
        this.f3307a = str;
    }
}

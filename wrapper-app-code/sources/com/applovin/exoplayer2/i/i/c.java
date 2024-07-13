package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.f;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.appnext.banners.BannerAdRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13158a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f13159b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: c  reason: collision with root package name */
    private final y f13160c = new y();

    /* renamed from: d  reason: collision with root package name */
    private final StringBuilder f13161d = new StringBuilder();

    private static char a(y yVar, int i) {
        return (char) yVar.d()[i];
    }

    static String a(y yVar, StringBuilder sb) {
        b(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String d2 = d(yVar, sb);
        if (!"".equals(d2)) {
            return d2;
        }
        return "" + ((char) yVar.h());
    }

    private void a(d dVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f13158a.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    dVar.c((String) a.b(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] a2 = ai.a(str, "\\.");
            String str2 = a2[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                dVar.b(str2.substring(0, indexOf2));
                dVar.a(str2.substring(indexOf2 + 1));
            } else {
                dVar.b(str2);
            }
            if (a2.length > 1) {
                dVar.a((String[]) ai.a((T[]) a2, 1, a2.length));
            }
        }
    }

    private static void a(y yVar, d dVar, StringBuilder sb) {
        b(yVar);
        String d2 = d(yVar, sb);
        if (!"".equals(d2) && ":".equals(a(yVar, sb))) {
            b(yVar);
            String c2 = c(yVar, sb);
            if (c2 != null && !"".equals(c2)) {
                int c3 = yVar.c();
                String a2 = a(yVar, sb);
                if (!";".equals(a2)) {
                    if ("}".equals(a2)) {
                        yVar.d(c3);
                    } else {
                        return;
                    }
                }
                if ("color".equals(d2)) {
                    dVar.a(f.b(c2));
                } else if ("background-color".equals(d2)) {
                    dVar.b(f.b(c2));
                } else {
                    boolean z = true;
                    if ("ruby-position".equals(d2)) {
                        if ("over".equals(c2)) {
                            dVar.d(1);
                        } else if ("under".equals(c2)) {
                            dVar.d(2);
                        }
                    } else if ("text-combine-upright".equals(d2)) {
                        if (!BannerAdRequest.TYPE_ALL.equals(c2) && !c2.startsWith("digits")) {
                            z = false;
                        }
                        dVar.d(z);
                    } else if ("text-decoration".equals(d2)) {
                        if ("underline".equals(c2)) {
                            dVar.a(true);
                        }
                    } else if ("font-family".equals(d2)) {
                        dVar.d(c2);
                    } else if ("font-weight".equals(d2)) {
                        if ("bold".equals(c2)) {
                            dVar.b(true);
                        }
                    } else if ("font-style".equals(d2)) {
                        if ("italic".equals(c2)) {
                            dVar.c(true);
                        }
                    } else if ("font-size".equals(d2)) {
                        a(c2, dVar);
                    }
                }
            }
        }
    }

    private static void a(String str, d dVar) {
        Matcher matcher = f13159b.matcher(Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            q.c("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        int i = 2;
        String str2 = (String) a.b(matcher.group(2));
        char c2 = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != 37) {
            if (hashCode != 3240) {
                if (hashCode == 3592 && str2.equals("px")) {
                    c2 = 0;
                }
            } else if (str2.equals("em")) {
                c2 = 1;
            }
        } else if (str2.equals("%")) {
            c2 = 2;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 == 2) {
                    i = 3;
                } else {
                    throw new IllegalStateException();
                }
            }
            dVar.c(i);
        } else {
            dVar.c(1);
        }
        dVar.a(Float.parseFloat((String) a.b(matcher.group(1))));
    }

    private static String b(y yVar, StringBuilder sb) {
        b(yVar);
        if (yVar.a() < 5 || !"::cue".equals(yVar.f(5))) {
            return null;
        }
        int c2 = yVar.c();
        String a2 = a(yVar, sb);
        if (a2 == null) {
            return null;
        }
        if ("{".equals(a2)) {
            yVar.d(c2);
            return "";
        }
        String d2 = "(".equals(a2) ? d(yVar) : null;
        if (!")".equals(a(yVar, sb))) {
            return null;
        }
        return d2;
    }

    static void b(y yVar) {
        while (true) {
            boolean z = true;
            while (yVar.a() > 0 && z) {
                if (!e(yVar) && !f(yVar)) {
                    z = false;
                }
            }
            return;
        }
    }

    private static String c(y yVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int c2 = yVar.c();
            String a2 = a(yVar, sb);
            if (a2 == null) {
                return null;
            }
            if ("}".equals(a2) || ";".equals(a2)) {
                yVar.d(c2);
                z = true;
            } else {
                sb2.append(a2);
            }
        }
        return sb2.toString();
    }

    static void c(y yVar) {
        do {
        } while (!TextUtils.isEmpty(yVar.C()));
    }

    private static String d(y yVar) {
        int c2 = yVar.c();
        int b2 = yVar.b();
        boolean z = false;
        while (c2 < b2 && !z) {
            int i = c2 + 1;
            z = ((char) yVar.d()[c2]) == ')';
            c2 = i;
        }
        return yVar.f((c2 - 1) - yVar.c()).trim();
    }

    private static String d(y yVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int c2 = yVar.c();
        int b2 = yVar.b();
        while (c2 < b2 && !z) {
            char c3 = (char) yVar.d()[c2];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z = true;
            } else {
                c2++;
                sb.append(c3);
            }
        }
        yVar.e(c2 - yVar.c());
        return sb.toString();
    }

    private static boolean e(y yVar) {
        char a2 = a(yVar, yVar.c());
        if (a2 != 9 && a2 != 10 && a2 != 12 && a2 != 13 && a2 != ' ') {
            return false;
        }
        yVar.e(1);
        return true;
    }

    private static boolean f(y yVar) {
        int c2 = yVar.c();
        int b2 = yVar.b();
        byte[] d2 = yVar.d();
        if (c2 + 2 > b2) {
            return false;
        }
        int i = c2 + 1;
        if (d2[c2] != 47) {
            return false;
        }
        int i2 = i + 1;
        if (d2[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= b2) {
                yVar.e(b2 - yVar.c());
                return true;
            } else if (((char) d2[i2]) == '*' && ((char) d2[i3]) == '/') {
                i2 = i3 + 1;
                b2 = i2;
            } else {
                i2 = i3;
            }
        }
    }

    public List<d> a(y yVar) {
        this.f13161d.setLength(0);
        int c2 = yVar.c();
        c(yVar);
        this.f13160c.a(yVar.d(), yVar.c());
        this.f13160c.d(c2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String b2 = b(this.f13160c, this.f13161d);
            if (b2 == null || !"{".equals(a(this.f13160c, this.f13161d))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, b2);
            String str = null;
            boolean z = false;
            while (!z) {
                int c3 = this.f13160c.c();
                String a2 = a(this.f13160c, this.f13161d);
                boolean z2 = a2 == null || "}".equals(a2);
                if (!z2) {
                    this.f13160c.d(c3);
                    a(this.f13160c, dVar, this.f13161d);
                }
                str = a2;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}

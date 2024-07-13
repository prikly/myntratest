package com.bykv.vk.openvk.component.video.a.b;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Request */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f18074a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f18075b;

    /* renamed from: c  reason: collision with root package name */
    public final a f18076c;

    public i(c cVar, List<b> list, a aVar) {
        this.f18074a = cVar;
        this.f18075b = list;
        this.f18076c = aVar;
    }

    public static i a(InputStream inputStream) throws IOException, d {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, com.bykv.vk.openvk.component.video.a.c.a.f18103a));
        ArrayList arrayList = new ArrayList();
        c cVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (cVar == null) {
                cVar = c.a(trim);
            } else {
                arrayList.add(b.a(trim));
            }
        }
        if (cVar != null) {
            return new i(cVar, arrayList, a.a(cVar, arrayList));
        }
        throw new d("request line is null");
    }

    /* compiled from: Request */
    static final class c {

        /* renamed from: a  reason: collision with root package name */
        final String f18086a;

        /* renamed from: b  reason: collision with root package name */
        final String f18087b;

        /* renamed from: c  reason: collision with root package name */
        final String f18088c;

        private c(String str, String str2, String str3) {
            this.f18086a = str;
            this.f18087b = str2;
            this.f18088c = str3;
        }

        static c a(String str) throws d {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new c(trim, trim2, trim3);
                    }
                    throw new d("request line format error, line: " + str);
                }
                throw new d("request line format error, line: " + str);
            }
            throw new d("request line format error, line: " + str);
        }

        public String toString() {
            return "RequestLine{method='" + this.f18086a + '\'' + ", path='" + this.f18087b + '\'' + ", version='" + this.f18088c + '\'' + '}';
        }
    }

    /* compiled from: Request */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f18084a;

        /* renamed from: b  reason: collision with root package name */
        public final String f18085b;

        public b(String str, String str2) {
            this.f18084a = str;
            this.f18085b = str2;
        }

        static b a(String str) throws d {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new b(trim, trim2);
                }
                throw new d("request header format error, header: " + str);
            }
            throw new d("request header format error, header: " + str);
        }

        public String toString() {
            return "Header{name='" + this.f18084a + '\'' + ", value='" + this.f18085b + '\'' + '}';
        }
    }

    /* compiled from: Request */
    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int f18077a;

        /* renamed from: b  reason: collision with root package name */
        final String f18078b;

        /* renamed from: c  reason: collision with root package name */
        final String f18079c;

        /* renamed from: d  reason: collision with root package name */
        final int f18080d;

        /* renamed from: e  reason: collision with root package name */
        final int f18081e;

        /* renamed from: f  reason: collision with root package name */
        final String f18082f;

        /* renamed from: g  reason: collision with root package name */
        final List<String> f18083g;

        private a(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f18077a = i;
            this.f18078b = str;
            this.f18079c = str2;
            this.f18080d = i2;
            this.f18081e = i3;
            this.f18082f = str3;
            this.f18083g = list;
        }

        static a a(c cVar, List<b> list) throws d {
            int i;
            String str;
            int i2;
            int indexOf = cVar.f18087b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i3 = 0;
                for (String split : cVar.f18087b.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str3 = Uri.decode(split2[1]);
                        } else if ("k".equals(split2[0])) {
                            str4 = Uri.decode(split2[1]);
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if ("f".equals(split2[0]) && com.bykv.vk.openvk.component.video.a.c.a.b(split2[1]) == 1) {
                            i3 = 1;
                        }
                    }
                }
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    throw new d("rawKey or key is empty, path: " + cVar.f18087b);
                }
                if (list != null) {
                    i2 = 0;
                    int i4 = 0;
                    for (b next : list) {
                        if (next != null && "Range".equalsIgnoreCase(next.f18084a)) {
                            int indexOf2 = next.f18085b.indexOf("=");
                            if (indexOf2 == -1) {
                                throw new d("Range format error, Range: " + next.f18085b);
                            } else if ("bytes".equalsIgnoreCase(next.f18085b.substring(0, indexOf2).trim())) {
                                String substring = next.f18085b.substring(indexOf2 + 1);
                                if (!substring.contains(",")) {
                                    int indexOf3 = substring.indexOf("-");
                                    if (indexOf3 != -1) {
                                        String trim = substring.substring(0, indexOf3).trim();
                                        String trim2 = substring.substring(indexOf3 + 1).trim();
                                        try {
                                            if (trim.length() > 0) {
                                                i2 = Integer.parseInt(trim);
                                            }
                                            if (trim2.length() > 0) {
                                                i4 = Integer.parseInt(trim2);
                                                if (i2 > i4) {
                                                    throw new d("Range format error, Range: " + next.f18085b);
                                                }
                                            }
                                            str2 = next.f18085b;
                                        } catch (NumberFormatException unused) {
                                            throw new d("Range format error, Range: " + next.f18085b);
                                        }
                                    } else {
                                        throw new d("Range format error, Range: " + next.f18085b);
                                    }
                                } else {
                                    throw new d("Range format error, Range: " + next.f18085b);
                                }
                            } else {
                                throw new d("Range format error, Range: " + next.f18085b);
                            }
                        }
                    }
                    i = i4;
                    str = str2;
                } else {
                    str = null;
                    i = 0;
                    i2 = 0;
                }
                if (!arrayList.isEmpty()) {
                    return new a(i3, str3, str4, i2, i, str, arrayList);
                }
                throw new d("no url found: path: " + cVar.f18087b);
            }
            throw new d("path format error, path: " + cVar.f18087b);
        }

        public String toString() {
            return "Extra{flag=" + this.f18077a + ", rawKey='" + this.f18078b + '\'' + ", key='" + this.f18079c + '\'' + ", from=" + this.f18080d + ", to=" + this.f18081e + ", urls=" + this.f18083g + '}';
        }
    }

    static String a(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = a(sb, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    private static String a(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk");
        sb.append("=");
        sb.append(Uri.encode(str));
        sb.append("&");
        sb.append("k");
        sb.append("=");
        sb.append(Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&");
            sb.append("u");
            sb.append(i);
            sb.append("=");
            sb.append(Uri.encode(list.get(i)));
        }
        return sb.toString();
    }

    public String toString() {
        return "Request{requestLine=" + this.f18074a + ", headers=" + this.f18075b + ", extra=" + this.f18076c + '}';
    }

    /* compiled from: Request */
    static final class d extends Exception {
        d(String str) {
            super(str);
        }
    }
}

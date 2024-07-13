package com.apm.insight.nativecrash;

import com.apm.insight.b;
import com.apm.insight.l.k;
import com.apm.insight.l.o;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d {
    private static final Pattern i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    private static final Pattern j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");
    private static final Pattern k = Pattern.compile("^Abort message: (.*)$");
    private static final Pattern l = Pattern.compile("^Crash message: (.*)$");
    private static final Pattern m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a  reason: collision with root package name */
    private String f10797a;

    /* renamed from: b  reason: collision with root package name */
    private String f10798b;

    /* renamed from: c  reason: collision with root package name */
    private String f10799c;

    /* renamed from: d  reason: collision with root package name */
    private String f10800d;

    /* renamed from: e  reason: collision with root package name */
    private String f10801e;

    /* renamed from: f  reason: collision with root package name */
    private String f10802f;

    /* renamed from: g  reason: collision with root package name */
    private String f10803g;

    /* renamed from: h  reason: collision with root package name */
    private Map<String, String> f10804h = new HashMap();

    public d(File file) {
        b(o.b(file));
    }

    private void b(File file) {
        String str;
        if (file.exists() && file.length() != 0) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                int i2 = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null || i2 >= 64) {
                            break;
                        }
                        if (this.f10797a != null || !readLine.startsWith("pid: ")) {
                            if (this.f10801e == null) {
                                if (readLine.startsWith("signal ")) {
                                    Matcher matcher = j.matcher(readLine);
                                    if (matcher.find() && matcher.groupCount() == 3) {
                                        String replace = matcher.group(1).replace(" ", "");
                                        String replace2 = matcher.group(2).replace(" ", "");
                                        int indexOf = replace2.indexOf("frompid");
                                        if (indexOf > 0) {
                                            replace2 = replace2.substring(0, indexOf) + ")";
                                        }
                                        this.f10801e = "Signal " + replace + ", Code " + replace2 + "\n";
                                    }
                                }
                            }
                            if (this.f10802f == null && readLine.startsWith("Abort ")) {
                                Matcher matcher2 = k.matcher(readLine);
                                if (matcher2.find() && matcher2.groupCount() == 1) {
                                    str = "abort message: " + matcher2.group(1) + "\n";
                                }
                            } else if (this.f10802f == null && readLine.startsWith("Crash ")) {
                                Matcher matcher3 = l.matcher(readLine);
                                if (matcher3.find() && matcher3.groupCount() == 1) {
                                    str = "crash message: " + matcher3.group(1) + "\n";
                                }
                            } else if (this.f10803g == null && readLine.startsWith("backtrace:")) {
                                StringBuilder sb = new StringBuilder();
                                while (true) {
                                    String readLine2 = bufferedReader2.readLine();
                                    if (readLine2 == null || !readLine2.startsWith("    #")) {
                                        i2++;
                                        this.f10803g = sb.toString();
                                    } else {
                                        sb.append(readLine2.substring(4));
                                        sb.append(10);
                                    }
                                }
                                i2++;
                                this.f10803g = sb.toString();
                            } else if (this.f10804h.isEmpty() && readLine.startsWith("build id:")) {
                                while (true) {
                                    String readLine3 = bufferedReader2.readLine();
                                    if (readLine3 == null) {
                                        break;
                                    } else if (!readLine3.contains("BuildId:")) {
                                        break;
                                    } else {
                                        Matcher matcher4 = m.matcher(readLine3);
                                        if (matcher4.find()) {
                                            String group = matcher4.group(1);
                                            String group2 = matcher4.group(2);
                                            String group3 = matcher4.group(3);
                                            if (group.equals("data")) {
                                                this.f10804h.put(group2, group3);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f10802f = str;
                        } else {
                            Matcher matcher5 = i.matcher(readLine);
                            if (matcher5.find() && matcher5.groupCount() == 4) {
                                this.f10797a = matcher5.group(1);
                                this.f10798b = matcher5.group(2);
                                this.f10800d = matcher5.group(3);
                                this.f10799c = matcher5.group(4);
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        try {
                            b.a().a("NPTH_CATCH", th);
                        } finally {
                            k.a((Closeable) bufferedReader);
                        }
                    }
                }
                k.a((Closeable) bufferedReader2);
            } catch (Throwable th2) {
                th = th2;
                b.a().a("NPTH_CATCH", th);
            }
        }
    }

    public String a() {
        return this.f10803g;
    }

    public void a(File file) {
        File b2 = o.b(file);
        if (b2.exists()) {
            b2.renameTo(new File(b2.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        b(o.b(file));
    }

    public Map<String, String> b() {
        return this.f10804h;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f10801e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f10802f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f10803g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}

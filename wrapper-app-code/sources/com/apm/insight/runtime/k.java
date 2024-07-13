package com.apm.insight.runtime;

import android.text.TextUtils;
import com.apm.insight.b;
import com.apm.insight.h;
import com.apm.insight.l.f;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static j f10865a;

    public static JSONArray a(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                File file = new File(str);
                if (file.length() > 512000) {
                    bufferedReader.skip(file.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        jSONArray.put(readLine);
                    } else {
                        com.apm.insight.l.k.a((Closeable) bufferedReader);
                        return jSONArray;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    com.apm.insight.l.k.a((Closeable) bufferedReader);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    com.apm.insight.l.k.a((Closeable) bufferedReader2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
            e.printStackTrace();
            com.apm.insight.l.k.a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th2) {
            th = th2;
            com.apm.insight.l.k.a((Closeable) bufferedReader2);
            throw th;
        }
    }

    public static void a(j jVar) {
        f10865a = jVar;
    }

    public static JSONArray b(String str) {
        if (f10865a != null && h.f().equals(str)) {
            try {
                return a(f10865a.a());
            } catch (Throwable th) {
                b.a().a("NPTH_CATCH", th);
            }
        }
        try {
            return a(f.a(str, h.i().getLogcatDumpCount(), h.i().getLogcatLevel()).getAbsolutePath());
        } catch (Throwable th2) {
            b.a().a("NPTH_CATCH", th2);
            return null;
        }
    }
}

package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Reflection;

public final class Q7 implements C0376f8 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4818a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4819b;

    /* renamed from: c  reason: collision with root package name */
    private final B0 f4820c;

    public Q7(Context context, String str, B0 b0) {
        this.f4818a = context;
        this.f4819b = str;
        this.f4820c = b0;
    }

    public void a(String str) {
        try {
            File a2 = this.f4820c.a(this.f4818a, this.f4819b);
            if (a2 != null) {
                FilesKt.writeText$default(a2, str, (Charset) null, 2, (Object) null);
            }
        } catch (FileNotFoundException unused) {
            ((C0584nh) C0609oh.a()).reportEvent("vital_data_provider_write_file_not_found", (Map<String, Object>) MapsKt.mapOf(TuplesKt.to("fileName", this.f4819b)));
        } catch (Throwable th) {
            M0 a3 = C0609oh.a();
            C0584nh nhVar = (C0584nh) a3;
            nhVar.reportEvent("vital_data_provider_write_exception", (Map<String, Object>) MapsKt.mapOf(TuplesKt.to("fileName", this.f4819b), TuplesKt.to("exception", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName())));
            M0 a4 = C0609oh.a();
            ((C0584nh) a4).reportError("Error during writing file with name " + this.f4819b, th);
        }
    }

    public String c() {
        try {
            File a2 = this.f4820c.a(this.f4818a, this.f4819b);
            if (a2 != null) {
                return FilesKt.readText$default(a2, (Charset) null, 1, (Object) null);
            }
            return null;
        } catch (FileNotFoundException unused) {
            ((C0584nh) C0609oh.a()).reportEvent("vital_data_provider_read_file_not_found", (Map<String, Object>) MapsKt.mapOf(TuplesKt.to("fileName", this.f4819b)));
            return null;
        } catch (Throwable th) {
            M0 a3 = C0609oh.a();
            C0584nh nhVar = (C0584nh) a3;
            nhVar.reportEvent("vital_data_provider_read_exception", (Map<String, Object>) MapsKt.mapOf(TuplesKt.to("fileName", this.f4819b), TuplesKt.to("exception", Reflection.getOrCreateKotlinClass(th.getClass()).getSimpleName())));
            M0 a4 = C0609oh.a();
            ((C0584nh) a4).reportError("Error during reading file with name " + this.f4819b, th);
            return null;
        }
    }
}

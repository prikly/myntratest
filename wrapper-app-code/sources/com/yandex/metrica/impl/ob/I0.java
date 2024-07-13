package com.yandex.metrica.impl.ob;

import com.yandex.metrica.plugins.IPluginReporter;
import java.util.Map;

public interface I0 extends M0, IPluginReporter {
    void a(int i, String str, String str2, Map<String, String> map, Map<String, byte[]> map2);

    void a(String str, String str2);

    void a(String str, byte[] bArr);

    void b(String str);

    void c(String str);
}

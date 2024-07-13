package com.yandex.metrica.plugins;

import com.yandex.metrica.impl.ob.A2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PluginErrorDetails {

    /* renamed from: a  reason: collision with root package name */
    private final String f7354a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7355b;

    /* renamed from: c  reason: collision with root package name */
    private final List<StackTraceItem> f7356c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7357d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7358e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f7359f;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f7360a;

        /* renamed from: b  reason: collision with root package name */
        private String f7361b;

        /* renamed from: c  reason: collision with root package name */
        private List<StackTraceItem> f7362c;

        /* renamed from: d  reason: collision with root package name */
        private String f7363d;

        /* renamed from: e  reason: collision with root package name */
        private String f7364e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f7365f;

        public PluginErrorDetails build() {
            String str = this.f7360a;
            String str2 = this.f7361b;
            List<StackTraceItem> list = this.f7362c;
            List<StackTraceItem> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList = list;
            }
            String str3 = this.f7363d;
            String str4 = this.f7364e;
            Map<String, String> map = this.f7365f;
            Map<String, String> hashMap = new HashMap<>();
            if (map != null) {
                hashMap = map;
            }
            return new PluginErrorDetails(str, str2, arrayList, str3, str4, hashMap);
        }

        public Builder withExceptionClass(String str) {
            this.f7360a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f7361b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f7363d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f7365f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f7362c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f7364e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public String getExceptionClass() {
        return this.f7354a;
    }

    public String getMessage() {
        return this.f7355b;
    }

    public String getPlatform() {
        return this.f7357d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f7359f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f7356c;
    }

    public String getVirtualMachineVersion() {
        return this.f7358e;
    }

    private PluginErrorDetails(String str, String str2, List<StackTraceItem> list, String str3, String str4, Map<String, String> map) {
        this.f7354a = str;
        this.f7355b = str2;
        this.f7356c = new ArrayList(list);
        this.f7357d = str3;
        this.f7358e = str4;
        this.f7359f = A2.a(A2.a(map));
    }
}

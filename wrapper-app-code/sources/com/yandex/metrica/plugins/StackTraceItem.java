package com.yandex.metrica.plugins;

public class StackTraceItem {

    /* renamed from: a  reason: collision with root package name */
    private final String f7366a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7367b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f7368c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f7369d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7370e;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f7371a;

        /* renamed from: b  reason: collision with root package name */
        private String f7372b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f7373c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f7374d;

        /* renamed from: e  reason: collision with root package name */
        private String f7375e;

        public StackTraceItem build() {
            return new StackTraceItem(this.f7371a, this.f7372b, this.f7373c, this.f7374d, this.f7375e);
        }

        public Builder withClassName(String str) {
            this.f7371a = str;
            return this;
        }

        public Builder withColumn(Integer num) {
            this.f7374d = num;
            return this;
        }

        public Builder withFileName(String str) {
            this.f7372b = str;
            return this;
        }

        public Builder withLine(Integer num) {
            this.f7373c = num;
            return this;
        }

        public Builder withMethodName(String str) {
            this.f7375e = str;
            return this;
        }
    }

    public String getClassName() {
        return this.f7366a;
    }

    public Integer getColumn() {
        return this.f7369d;
    }

    public String getFileName() {
        return this.f7367b;
    }

    public Integer getLine() {
        return this.f7368c;
    }

    public String getMethodName() {
        return this.f7370e;
    }

    private StackTraceItem(String str, String str2, Integer num, Integer num2, String str3) {
        this.f7366a = str;
        this.f7367b = str2;
        this.f7368c = num;
        this.f7369d = num2;
        this.f7370e = str3;
    }
}

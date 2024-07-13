package com.yandex.metrica.networktasks.api;

class c {

    /* renamed from: a  reason: collision with root package name */
    final NetworkTask f7336a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7337b;

    private c(NetworkTask networkTask) {
        this.f7336a = networkTask;
        this.f7337b = networkTask.description();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f7337b.equals(((c) obj).f7337b);
    }

    public int hashCode() {
        return this.f7337b.hashCode();
    }
}

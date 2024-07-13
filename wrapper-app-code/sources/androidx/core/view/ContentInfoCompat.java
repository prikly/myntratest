package androidx.core.view;

public final class ContentInfoCompat {
    private final Compat mCompat;

    private interface Compat {
    }

    public String toString() {
        return this.mCompat.toString();
    }
}

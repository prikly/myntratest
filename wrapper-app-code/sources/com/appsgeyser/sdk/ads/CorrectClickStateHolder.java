package com.appsgeyser.sdk.ads;

public class CorrectClickStateHolder {
    private static CorrectClickStateHolder instance;
    private int state = 0;

    public static CorrectClickStateHolder getInstance() {
        CorrectClickStateHolder correctClickStateHolder = instance;
        if (correctClickStateHolder == null) {
            synchronized (CorrectClickStateHolder.class) {
                correctClickStateHolder = instance;
                if (correctClickStateHolder == null) {
                    correctClickStateHolder = new CorrectClickStateHolder();
                    instance = correctClickStateHolder;
                }
            }
        }
        return correctClickStateHolder;
    }

    private CorrectClickStateHolder() {
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.state = 0;
    }

    /* access modifiers changed from: package-private */
    public void allowClick() {
        this.state++;
    }

    /* access modifiers changed from: package-private */
    public boolean isClickAllowed() {
        return this.state > 0;
    }
}

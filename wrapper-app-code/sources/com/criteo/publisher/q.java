package com.criteo.publisher;

/* compiled from: CriteoNotInitializedException */
public class q extends IllegalStateException {
    public q(String str) {
        super(str + "\nDid you properly initialize the Criteo SDK ?\nPlease follow this step: https://publisherdocs.criteotilt.com/app/android/standalone/#sdk-initialization\n");
    }
}

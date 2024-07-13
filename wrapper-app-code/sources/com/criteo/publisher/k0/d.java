package com.criteo.publisher.k0;

import java.io.IOException;

/* compiled from: HttpResponseException */
public class d extends IOException {
    public d(int i) {
        super("Received HTTP error status: " + i);
    }
}

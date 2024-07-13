package com.google.android.exoplayer2.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class EventMessageEncoder {
    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
    private final DataOutputStream dataOutputStream = new DataOutputStream(this.byteArrayOutputStream);
}

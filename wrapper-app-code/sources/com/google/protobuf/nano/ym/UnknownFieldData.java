package com.google.protobuf.nano.ym;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

final class UnknownFieldData {
    final byte[] bytes;
    final int tag;

    UnknownFieldData(int i, byte[] bArr) {
        this.tag = i;
        this.bytes = bArr;
    }

    /* access modifiers changed from: package-private */
    public int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + 0 + this.bytes.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnknownFieldData)) {
            return false;
        }
        UnknownFieldData unknownFieldData = (UnknownFieldData) obj;
        return this.tag == unknownFieldData.tag && Arrays.equals(this.bytes, unknownFieldData.bytes);
    }

    public int hashCode() {
        return ((this.tag + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.bytes);
    }

    /* access modifiers changed from: package-private */
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        codedOutputByteBufferNano.writeRawVarint32(this.tag);
        codedOutputByteBufferNano.writeRawBytes(this.bytes);
    }
}

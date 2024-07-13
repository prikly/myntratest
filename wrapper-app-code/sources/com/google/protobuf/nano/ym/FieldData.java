package com.google.protobuf.nano.ym;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FieldData {
    private Extension cachedExtension;
    private List unknownFieldData;
    private Object value;

    FieldData() {
        this.unknownFieldData = new ArrayList();
    }

    FieldData(Extension extension, Object obj) {
        this.cachedExtension = extension;
        this.value = obj;
    }

    private byte[] toByteArray() {
        byte[] bArr = new byte[computeSerializedSize()];
        writeTo(CodedOutputByteBufferNano.newInstance(bArr));
        return bArr;
    }

    /* access modifiers changed from: package-private */
    public void addUnknownField(UnknownFieldData unknownFieldData2) {
        this.unknownFieldData.add(unknownFieldData2);
    }

    /* access modifiers changed from: package-private */
    public int computeSerializedSize() {
        Object obj = this.value;
        if (obj != null) {
            return this.cachedExtension.computeSerializedSize(obj);
        }
        int i = 0;
        for (UnknownFieldData computeSerializedSize : this.unknownFieldData) {
            i += computeSerializedSize.computeSerializedSize();
        }
        return i;
    }

    public boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldData)) {
            return false;
        }
        FieldData fieldData = (FieldData) obj;
        if (this.value == null || fieldData.value == null) {
            List list2 = this.unknownFieldData;
            if (list2 != null && (list = fieldData.unknownFieldData) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(toByteArray(), fieldData.toByteArray());
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            Extension extension = this.cachedExtension;
            if (extension != fieldData.cachedExtension) {
                return false;
            }
            if (!extension.clazz.isArray()) {
                return this.value.equals(fieldData.value);
            }
            Object obj2 = this.value;
            return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) fieldData.value) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) fieldData.value) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) fieldData.value) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) fieldData.value) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) fieldData.value) : obj2 instanceof boolean[] ? Arrays.equals((boolean[]) obj2, (boolean[]) fieldData.value) : Arrays.deepEquals((Object[]) obj2, (Object[]) fieldData.value);
        }
    }

    /* access modifiers changed from: package-private */
    public Object getValue(Extension extension) {
        if (this.value == null) {
            this.cachedExtension = extension;
            this.value = extension.getValueFrom(this.unknownFieldData);
            this.unknownFieldData = null;
        } else if (this.cachedExtension != extension) {
            throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
        }
        return this.value;
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(toByteArray()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public void setValue(Extension extension, Object obj) {
        this.cachedExtension = extension;
        this.value = obj;
        this.unknownFieldData = null;
    }

    /* access modifiers changed from: package-private */
    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        Object obj = this.value;
        if (obj != null) {
            this.cachedExtension.writeTo(obj, codedOutputByteBufferNano);
            return;
        }
        for (UnknownFieldData writeTo : this.unknownFieldData) {
            writeTo.writeTo(codedOutputByteBufferNano);
        }
    }
}

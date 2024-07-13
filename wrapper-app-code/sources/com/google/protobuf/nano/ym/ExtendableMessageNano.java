package com.google.protobuf.nano.ym;

public abstract class ExtendableMessageNano extends MessageNano {
    protected FieldArray unknownFieldData;

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        if (this.unknownFieldData == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.unknownFieldData.size(); i2++) {
            i += this.unknownFieldData.dataAt(i2).computeSerializedSize();
        }
        return i;
    }

    public final Object getExtension(Extension extension) {
        FieldData fieldData;
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null || (fieldData = fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag))) == null) {
            return null;
        }
        return fieldData.getValue(extension);
    }

    public final boolean hasExtension(Extension extension) {
        FieldArray fieldArray = this.unknownFieldData;
        return (fieldArray == null || fieldArray.get(WireFormatNano.getTagFieldNumber(extension.tag)) == null) ? false : true;
    }

    public final ExtendableMessageNano setExtension(Extension extension, Object obj) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(extension.tag);
        FieldData fieldData = null;
        if (obj == null) {
            FieldArray fieldArray = this.unknownFieldData;
            if (fieldArray != null) {
                fieldArray.remove(tagFieldNumber);
                if (this.unknownFieldData.isEmpty()) {
                    this.unknownFieldData = null;
                }
            }
        } else {
            FieldArray fieldArray2 = this.unknownFieldData;
            if (fieldArray2 == null) {
                this.unknownFieldData = new FieldArray();
            } else {
                fieldData = fieldArray2.get(tagFieldNumber);
            }
            if (fieldData == null) {
                this.unknownFieldData.put(tagFieldNumber, new FieldData(extension, obj));
            } else {
                fieldData.setValue(extension, obj);
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final boolean storeUnknownField(CodedInputByteBufferNano codedInputByteBufferNano, int i) {
        int position = codedInputByteBufferNano.getPosition();
        if (!codedInputByteBufferNano.skipField(i)) {
            return false;
        }
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(i);
        UnknownFieldData unknownFieldData2 = new UnknownFieldData(i, codedInputByteBufferNano.getData(position, codedInputByteBufferNano.getPosition() - position));
        FieldData fieldData = null;
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null) {
            this.unknownFieldData = new FieldArray();
        } else {
            fieldData = fieldArray.get(tagFieldNumber);
        }
        if (fieldData == null) {
            fieldData = new FieldData();
            this.unknownFieldData.put(tagFieldNumber, fieldData);
        }
        fieldData.addUnknownField(unknownFieldData2);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean unknownFieldDataEquals(ExtendableMessageNano extendableMessageNano) {
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray != null && !fieldArray.isEmpty()) {
            return this.unknownFieldData.equals(extendableMessageNano.unknownFieldData);
        }
        FieldArray fieldArray2 = extendableMessageNano.unknownFieldData;
        return fieldArray2 == null || fieldArray2.isEmpty();
    }

    /* access modifiers changed from: protected */
    public final int unknownFieldDataHashCode() {
        FieldArray fieldArray = this.unknownFieldData;
        if (fieldArray == null || fieldArray.isEmpty()) {
            return 0;
        }
        return this.unknownFieldData.hashCode();
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.unknownFieldData != null) {
            for (int i = 0; i < this.unknownFieldData.size(); i++) {
                this.unknownFieldData.dataAt(i).writeTo(codedOutputByteBufferNano);
            }
        }
    }
}

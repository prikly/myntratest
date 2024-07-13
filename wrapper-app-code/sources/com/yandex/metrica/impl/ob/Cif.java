package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.if  reason: invalid class name */
public final class Cif extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public int f5990a;

    /* renamed from: b  reason: collision with root package name */
    public String f5991b;

    public Cif() {
        a();
    }

    public Cif a() {
        this.f5990a = 0;
        this.f5991b = "";
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f5990a;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !this.f5991b.equals("") ? computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f5991b) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 8) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f5990a = readInt32;
                }
            } else if (readTag == 18) {
                this.f5991b = codedInputByteBufferNano.readString();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f5990a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f5991b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5991b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

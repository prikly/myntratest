package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ef  reason: case insensitive filesystem */
public final class C0358ef extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public C0333df f5748a;

    /* renamed from: b  reason: collision with root package name */
    public String f5749b;

    /* renamed from: c  reason: collision with root package name */
    public int f5750c;

    public C0358ef() {
        a();
    }

    public C0358ef a() {
        this.f5748a = null;
        this.f5749b = "";
        this.f5750c = -1;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C0333df dfVar = this.f5748a;
        if (dfVar != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, dfVar);
        }
        if (!this.f5749b.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f5749b);
        }
        int i = this.f5750c;
        return i != -1 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                if (this.f5748a == null) {
                    this.f5748a = new C0333df();
                }
                codedInputByteBufferNano.readMessage(this.f5748a);
            } else if (readTag == 18) {
                this.f5749b = codedInputByteBufferNano.readString();
            } else if (readTag == 24) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == -1 || readInt32 == 0 || readInt32 == 1) {
                    this.f5750c = readInt32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C0333df dfVar = this.f5748a;
        if (dfVar != null) {
            codedOutputByteBufferNano.writeMessage(1, dfVar);
        }
        if (!this.f5749b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f5749b);
        }
        int i = this.f5750c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

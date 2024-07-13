package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.sf  reason: case insensitive filesystem */
public final class C0703sf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f6781a;

    /* renamed from: b  reason: collision with root package name */
    public long f6782b;

    /* renamed from: c  reason: collision with root package name */
    public long f6783c;

    /* renamed from: d  reason: collision with root package name */
    public int f6784d;

    public C0703sf() {
        a();
    }

    public C0703sf a() {
        this.f6781a = WireFormatNano.EMPTY_BYTES;
        this.f6782b = 0;
        this.f6783c = 0;
        this.f6784d = 0;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize() + CodedOutputByteBufferNano.computeBytesSize(1, this.f6781a);
        long j = this.f6782b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f6783c;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f6784d;
        return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f6781a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                this.f6782b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f6783c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6784d = readInt32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f6781a);
        long j = this.f6782b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f6783c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f6784d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

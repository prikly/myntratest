package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.tf  reason: case insensitive filesystem */
public final class C0727tf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public String f6836a;

    /* renamed from: b  reason: collision with root package name */
    public long f6837b;

    /* renamed from: c  reason: collision with root package name */
    public long f6838c;

    /* renamed from: d  reason: collision with root package name */
    public int f6839d;

    public C0727tf() {
        a();
    }

    public C0727tf a() {
        this.f6836a = "";
        this.f6837b = 0;
        this.f6838c = 0;
        this.f6839d = 0;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f6836a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6836a);
        }
        long j = this.f6837b;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f6838c;
        if (j2 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f6839d;
        return i != 0 ? computeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f6836a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f6837b = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 24) {
                this.f6838c = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 32) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2) {
                    this.f6839d = readInt32;
                }
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6836a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6836a);
        }
        long j = this.f6837b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f6838c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f6839d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C0727tf a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0727tf) MessageNano.mergeFrom(new C0727tf(), bArr);
    }
}

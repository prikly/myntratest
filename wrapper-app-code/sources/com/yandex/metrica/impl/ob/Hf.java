package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.InternalNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public final class Hf extends MessageNano {

    /* renamed from: c  reason: collision with root package name */
    private static volatile Hf[] f4114c;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f4115a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f4116b;

    public Hf() {
        a();
    }

    public static Hf[] b() {
        if (f4114c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f4114c == null) {
                    f4114c = new Hf[0];
                }
            }
        }
        return f4114c;
    }

    public Hf a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f4115a = bArr;
        this.f4116b = bArr;
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f4115a, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f4115a);
        }
        return !Arrays.equals(this.f4116b, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f4116b) : computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                this.f4115a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f4116b = codedInputByteBufferNano.readBytes();
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f4115a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f4115a);
        }
        if (!Arrays.equals(this.f4116b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f4116b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

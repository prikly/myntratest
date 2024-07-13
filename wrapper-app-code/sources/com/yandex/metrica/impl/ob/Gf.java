package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.CodedInputByteBufferNano;
import com.google.protobuf.nano.ym.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ym.MessageNano;
import com.google.protobuf.nano.ym.WireFormatNano;
import java.io.IOException;

public final class Gf extends MessageNano {

    /* renamed from: a  reason: collision with root package name */
    public Hf[] f4051a;

    public Gf() {
        a();
    }

    public Gf a() {
        this.f4051a = Hf.b();
        this.cachedSize = -1;
        return this;
    }

    /* access modifiers changed from: protected */
    public int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        Hf[] hfArr = this.f4051a;
        if (hfArr != null && hfArr.length > 0) {
            int i = 0;
            while (true) {
                Hf[] hfArr2 = this.f4051a;
                if (i >= hfArr2.length) {
                    break;
                }
                Hf hf = hfArr2[i];
                if (hf != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, hf);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                Hf[] hfArr = this.f4051a;
                int length = hfArr == null ? 0 : hfArr.length;
                int i = repeatedFieldArrayLength + length;
                Hf[] hfArr2 = new Hf[i];
                if (length != 0) {
                    System.arraycopy(hfArr, 0, hfArr2, 0, length);
                }
                while (length < i - 1) {
                    hfArr2[length] = new Hf();
                    codedInputByteBufferNano.readMessage(hfArr2[length]);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                hfArr2[length] = new Hf();
                codedInputByteBufferNano.readMessage(hfArr2[length]);
                this.f4051a = hfArr2;
            } else if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                break;
            }
        }
        return this;
    }

    public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        Hf[] hfArr = this.f4051a;
        if (hfArr != null && hfArr.length > 0) {
            int i = 0;
            while (true) {
                Hf[] hfArr2 = this.f4051a;
                if (i >= hfArr2.length) {
                    break;
                }
                Hf hf = hfArr2[i];
                if (hf != null) {
                    codedOutputByteBufferNano.writeMessage(1, hf);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}

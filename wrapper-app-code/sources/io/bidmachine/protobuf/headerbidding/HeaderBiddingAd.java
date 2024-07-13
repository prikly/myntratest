package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

public final class HeaderBiddingAd extends GeneratedMessageV3 implements HeaderBiddingAdOrBuilder {
    public static final int BIDDER_FIELD_NUMBER = 1;
    public static final int CLIENT_PARAMS_FIELD_NUMBER = 2;
    private static final HeaderBiddingAd DEFAULT_INSTANCE = new HeaderBiddingAd();
    /* access modifiers changed from: private */
    public static final Parser<HeaderBiddingAd> PARSER = new AbstractParser<HeaderBiddingAd>() {
        public HeaderBiddingAd parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new HeaderBiddingAd(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SERVER_PARAMS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object bidder_;
    /* access modifiers changed from: private */
    public MapField<String, String> clientParams_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public MapField<String, String> serverParams_;

    private HeaderBiddingAd(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private HeaderBiddingAd() {
        this.memoizedIsInitialized = -1;
        this.bidder_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new HeaderBiddingAd();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private HeaderBiddingAd(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.bidder_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            if (!z2 || !true) {
                                this.clientParams_ = MapField.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
                                z2 |= true;
                            }
                            MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                            this.clientParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                        } else if (readTag == 26) {
                            if (!z2 || !true) {
                                this.serverParams_ = MapField.newMapField(ServerParamsDefaultEntryHolder.defaultEntry);
                                z2 |= true;
                            }
                            MapEntry mapEntry2 = (MapEntry) codedInputStream.readMessage(ServerParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                            this.serverParams_.getMutableMap().put(mapEntry2.getKey(), mapEntry2.getValue());
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
    }

    /* access modifiers changed from: protected */
    public MapField internalGetMapField(int i) {
        if (i == 2) {
            return internalGetClientParams();
        }
        if (i == 3) {
            return internalGetServerParams();
        }
        throw new RuntimeException("Invalid map field number: " + i);
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingAd.class, Builder.class);
    }

    public String getBidder() {
        Object obj = this.bidder_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidder_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBidderBytes() {
        Object obj = this.bidder_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidder_ = copyFromUtf8;
        return copyFromUtf8;
    }

    private static final class ClientParamsDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ClientParamsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private ClientParamsDefaultEntryHolder() {
        }
    }

    /* access modifiers changed from: private */
    public MapField<String, String> internalGetClientParams() {
        MapField<String, String> mapField = this.clientParams_;
        return mapField == null ? MapField.emptyMapField(ClientParamsDefaultEntryHolder.defaultEntry) : mapField;
    }

    public int getClientParamsCount() {
        return internalGetClientParams().getMap().size();
    }

    public boolean containsClientParams(String str) {
        if (str != null) {
            return internalGetClientParams().getMap().containsKey(str);
        }
        throw null;
    }

    @Deprecated
    public Map<String, String> getClientParams() {
        return getClientParamsMap();
    }

    public Map<String, String> getClientParamsMap() {
        return internalGetClientParams().getMap();
    }

    public String getClientParamsOrDefault(String str, String str2) {
        if (str != null) {
            Map<String, String> map = internalGetClientParams().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }
        throw null;
    }

    public String getClientParamsOrThrow(String str) {
        if (str != null) {
            Map<String, String> map = internalGetClientParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw null;
    }

    private static final class ServerParamsDefaultEntryHolder {
        static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_ServerParamsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

        private ServerParamsDefaultEntryHolder() {
        }
    }

    /* access modifiers changed from: private */
    public MapField<String, String> internalGetServerParams() {
        MapField<String, String> mapField = this.serverParams_;
        return mapField == null ? MapField.emptyMapField(ServerParamsDefaultEntryHolder.defaultEntry) : mapField;
    }

    public int getServerParamsCount() {
        return internalGetServerParams().getMap().size();
    }

    public boolean containsServerParams(String str) {
        if (str != null) {
            return internalGetServerParams().getMap().containsKey(str);
        }
        throw null;
    }

    @Deprecated
    public Map<String, String> getServerParams() {
        return getServerParamsMap();
    }

    public Map<String, String> getServerParamsMap() {
        return internalGetServerParams().getMap();
    }

    public String getServerParamsOrDefault(String str, String str2) {
        if (str != null) {
            Map<String, String> map = internalGetServerParams().getMap();
            return map.containsKey(str) ? map.get(str) : str2;
        }
        throw null;
    }

    public String getServerParamsOrThrow(String str) {
        if (str != null) {
            Map<String, String> map = internalGetServerParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }
        throw null;
    }

    public final boolean isInitialized() {
        byte b2 = this.memoizedIsInitialized;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!getBidderBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.bidder_);
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 2);
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetServerParams(), ServerParamsDefaultEntryHolder.defaultEntry, 3);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getBidderBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.bidder_);
        }
        for (Map.Entry next : internalGetClientParams().getMap().entrySet()) {
            i2 += CodedOutputStream.computeMessageSize(2, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
        }
        for (Map.Entry next2 : internalGetServerParams().getMap().entrySet()) {
            i2 += CodedOutputStream.computeMessageSize(3, ServerParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next2.getKey()).setValue(next2.getValue()).build());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingAd)) {
            return super.equals(obj);
        }
        HeaderBiddingAd headerBiddingAd = (HeaderBiddingAd) obj;
        if (getBidder().equals(headerBiddingAd.getBidder()) && internalGetClientParams().equals(headerBiddingAd.internalGetClientParams()) && internalGetServerParams().equals(headerBiddingAd.internalGetServerParams()) && this.unknownFields.equals(headerBiddingAd.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBidder().hashCode();
        if (!internalGetClientParams().getMap().isEmpty()) {
            hashCode = (((hashCode * 37) + 2) * 53) + internalGetClientParams().hashCode();
        }
        if (!internalGetServerParams().getMap().isEmpty()) {
            hashCode = (((hashCode * 37) + 3) * 53) + internalGetServerParams().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static HeaderBiddingAd parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static HeaderBiddingAd parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static HeaderBiddingAd parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static HeaderBiddingAd parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingAd parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingAd) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingAd) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingAd parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingAd) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static HeaderBiddingAd parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HeaderBiddingAd) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static HeaderBiddingAd parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingAd) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(HeaderBiddingAd headerBiddingAd) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingAd);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeaderBiddingAdOrBuilder {
        private Object bidder_;
        private int bitField0_;
        private MapField<String, String> clientParams_;
        private MapField<String, String> serverParams_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 2) {
                return internalGetClientParams();
            }
            if (i == 3) {
                return internalGetServerParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMutableMapField(int i) {
            if (i == 2) {
                return internalGetMutableClientParams();
            }
            if (i == 3) {
                return internalGetMutableServerParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingAd.class, Builder.class);
        }

        private Builder() {
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.bidder_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = HeaderBiddingAd.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.bidder_ = "";
            internalGetMutableClientParams().clear();
            internalGetMutableServerParams().clear();
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingAd_descriptor;
        }

        public HeaderBiddingAd getDefaultInstanceForType() {
            return HeaderBiddingAd.getDefaultInstance();
        }

        public HeaderBiddingAd build() {
            HeaderBiddingAd buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public HeaderBiddingAd buildPartial() {
            HeaderBiddingAd headerBiddingAd = new HeaderBiddingAd((GeneratedMessageV3.Builder) this);
            Object unused = headerBiddingAd.bidder_ = this.bidder_;
            MapField unused2 = headerBiddingAd.clientParams_ = internalGetClientParams();
            headerBiddingAd.clientParams_.makeImmutable();
            MapField unused3 = headerBiddingAd.serverParams_ = internalGetServerParams();
            headerBiddingAd.serverParams_.makeImmutable();
            onBuilt();
            return headerBiddingAd;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        public Builder mergeFrom(Message message) {
            if (message instanceof HeaderBiddingAd) {
                return mergeFrom((HeaderBiddingAd) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(HeaderBiddingAd headerBiddingAd) {
            if (headerBiddingAd == HeaderBiddingAd.getDefaultInstance()) {
                return this;
            }
            if (!headerBiddingAd.getBidder().isEmpty()) {
                this.bidder_ = headerBiddingAd.bidder_;
                onChanged();
            }
            internalGetMutableClientParams().mergeFrom(headerBiddingAd.internalGetClientParams());
            internalGetMutableServerParams().mergeFrom(headerBiddingAd.internalGetServerParams());
            mergeUnknownFields(headerBiddingAd.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.headerbidding.HeaderBiddingAd r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.headerbidding.HeaderBiddingAd r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.headerbidding.HeaderBiddingAd) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingAd.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.headerbidding.HeaderBiddingAd$Builder");
        }

        public String getBidder() {
            Object obj = this.bidder_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidder_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBidderBytes() {
            Object obj = this.bidder_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidder_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setBidder(String str) {
            if (str != null) {
                this.bidder_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearBidder() {
            this.bidder_ = HeaderBiddingAd.getDefaultInstance().getBidder();
            onChanged();
            return this;
        }

        public Builder setBidderBytes(ByteString byteString) {
            if (byteString != null) {
                HeaderBiddingAd.checkByteStringIsUtf8(byteString);
                this.bidder_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        private MapField<String, String> internalGetClientParams() {
            MapField<String, String> mapField = this.clientParams_;
            return mapField == null ? MapField.emptyMapField(ClientParamsDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableClientParams() {
            onChanged();
            if (this.clientParams_ == null) {
                this.clientParams_ = MapField.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.clientParams_.isMutable()) {
                this.clientParams_ = this.clientParams_.copy();
            }
            return this.clientParams_;
        }

        public int getClientParamsCount() {
            return internalGetClientParams().getMap().size();
        }

        public boolean containsClientParams(String str) {
            if (str != null) {
                return internalGetClientParams().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getClientParams() {
            return getClientParamsMap();
        }

        public Map<String, String> getClientParamsMap() {
            return internalGetClientParams().getMap();
        }

        public String getClientParamsOrDefault(String str, String str2) {
            if (str != null) {
                Map<String, String> map = internalGetClientParams().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }
            throw null;
        }

        public String getClientParamsOrThrow(String str) {
            if (str != null) {
                Map<String, String> map = internalGetClientParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
        }

        public Builder clearClientParams() {
            internalGetMutableClientParams().getMutableMap().clear();
            return this;
        }

        public Builder removeClientParams(String str) {
            if (str != null) {
                internalGetMutableClientParams().getMutableMap().remove(str);
                return this;
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getMutableClientParams() {
            return internalGetMutableClientParams().getMutableMap();
        }

        public Builder putClientParams(String str, String str2) {
            if (str == null) {
                throw null;
            } else if (str2 != null) {
                internalGetMutableClientParams().getMutableMap().put(str, str2);
                return this;
            } else {
                throw null;
            }
        }

        public Builder putAllClientParams(Map<String, String> map) {
            internalGetMutableClientParams().getMutableMap().putAll(map);
            return this;
        }

        private MapField<String, String> internalGetServerParams() {
            MapField<String, String> mapField = this.serverParams_;
            return mapField == null ? MapField.emptyMapField(ServerParamsDefaultEntryHolder.defaultEntry) : mapField;
        }

        private MapField<String, String> internalGetMutableServerParams() {
            onChanged();
            if (this.serverParams_ == null) {
                this.serverParams_ = MapField.newMapField(ServerParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.serverParams_.isMutable()) {
                this.serverParams_ = this.serverParams_.copy();
            }
            return this.serverParams_;
        }

        public int getServerParamsCount() {
            return internalGetServerParams().getMap().size();
        }

        public boolean containsServerParams(String str) {
            if (str != null) {
                return internalGetServerParams().getMap().containsKey(str);
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getServerParams() {
            return getServerParamsMap();
        }

        public Map<String, String> getServerParamsMap() {
            return internalGetServerParams().getMap();
        }

        public String getServerParamsOrDefault(String str, String str2) {
            if (str != null) {
                Map<String, String> map = internalGetServerParams().getMap();
                return map.containsKey(str) ? map.get(str) : str2;
            }
            throw null;
        }

        public String getServerParamsOrThrow(String str) {
            if (str != null) {
                Map<String, String> map = internalGetServerParams().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }
            throw null;
        }

        public Builder clearServerParams() {
            internalGetMutableServerParams().getMutableMap().clear();
            return this;
        }

        public Builder removeServerParams(String str) {
            if (str != null) {
                internalGetMutableServerParams().getMutableMap().remove(str);
                return this;
            }
            throw null;
        }

        @Deprecated
        public Map<String, String> getMutableServerParams() {
            return internalGetMutableServerParams().getMutableMap();
        }

        public Builder putServerParams(String str, String str2) {
            if (str == null) {
                throw null;
            } else if (str2 != null) {
                internalGetMutableServerParams().getMutableMap().put(str, str2);
                return this;
            } else {
                throw null;
            }
        }

        public Builder putAllServerParams(Map<String, String> map) {
            internalGetMutableServerParams().getMutableMap().putAll(map);
            return this;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static HeaderBiddingAd getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HeaderBiddingAd> parser() {
        return PARSER;
    }

    public Parser<HeaderBiddingAd> getParserForType() {
        return PARSER;
    }

    public HeaderBiddingAd getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}

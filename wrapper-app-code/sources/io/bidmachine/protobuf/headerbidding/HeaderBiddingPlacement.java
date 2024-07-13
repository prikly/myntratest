package io.bidmachine.protobuf.headerbidding;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class HeaderBiddingPlacement extends GeneratedMessageV3 implements HeaderBiddingPlacementOrBuilder {
    public static final int AD_UNITS_FIELD_NUMBER = 1;
    private static final HeaderBiddingPlacement DEFAULT_INSTANCE = new HeaderBiddingPlacement();
    /* access modifiers changed from: private */
    public static final Parser<HeaderBiddingPlacement> PARSER = new AbstractParser<HeaderBiddingPlacement>() {
        public HeaderBiddingPlacement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new HeaderBiddingPlacement(codedInputStream, extensionRegistryLite);
        }
    };
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public List<AdUnit> adUnits_;
    private byte memoizedIsInitialized;

    public interface AdUnitOrBuilder extends MessageOrBuilder {
        boolean containsClientParams(String str);

        String getBidder();

        ByteString getBidderBytes();

        String getBidderSdkver();

        ByteString getBidderSdkverBytes();

        @Deprecated
        Map<String, String> getClientParams();

        int getClientParamsCount();

        Map<String, String> getClientParamsMap();

        String getClientParamsOrDefault(String str, String str2);

        String getClientParamsOrThrow(String str);

        double getPriceEstimate();
    }

    private HeaderBiddingPlacement(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private HeaderBiddingPlacement() {
        this.memoizedIsInitialized = -1;
        this.adUnits_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new HeaderBiddingPlacement();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private HeaderBiddingPlacement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            if (!z2 || !true) {
                                this.adUnits_ = new ArrayList();
                                z2 |= true;
                            }
                            this.adUnits_.add(codedInputStream.readMessage(AdUnit.parser(), extensionRegistryLite));
                        } else if (!parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.setUnfinishedMessage(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingPlacement.class, Builder.class);
    }

    public static final class AdUnit extends GeneratedMessageV3 implements AdUnitOrBuilder {
        public static final int BIDDER_FIELD_NUMBER = 1;
        public static final int BIDDER_SDKVER_FIELD_NUMBER = 2;
        public static final int CLIENT_PARAMS_FIELD_NUMBER = 3;
        private static final AdUnit DEFAULT_INSTANCE = new AdUnit();
        /* access modifiers changed from: private */
        public static final Parser<AdUnit> PARSER = new AbstractParser<AdUnit>() {
            public AdUnit parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdUnit(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PRICE_ESTIMATE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public volatile Object bidderSdkver_;
        /* access modifiers changed from: private */
        public volatile Object bidder_;
        /* access modifiers changed from: private */
        public MapField<String, String> clientParams_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public double priceEstimate_;

        private AdUnit(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private AdUnit() {
            this.memoizedIsInitialized = -1;
            this.bidder_ = "";
            this.bidderSdkver_ = "";
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new AdUnit();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AdUnit(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.bidderSdkver_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                if (!z2 || !true) {
                                    this.clientParams_ = MapField.newMapField(ClientParamsDefaultEntryHolder.defaultEntry);
                                    z2 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(ClientParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.clientParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            } else if (readTag == 33) {
                                this.priceEstimate_ = codedInputStream.readDouble();
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
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
        }

        /* access modifiers changed from: protected */
        public MapField internalGetMapField(int i) {
            if (i == 3) {
                return internalGetClientParams();
            }
            throw new RuntimeException("Invalid map field number: " + i);
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
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

        public String getBidderSdkver() {
            Object obj = this.bidderSdkver_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidderSdkver_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBidderSdkverBytes() {
            Object obj = this.bidderSdkver_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidderSdkver_ = copyFromUtf8;
            return copyFromUtf8;
        }

        private static final class ClientParamsDefaultEntryHolder {
            static final MapEntry<String, String> defaultEntry = MapEntry.newDefaultInstance(HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_ClientParamsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.STRING, "");

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

        public double getPriceEstimate() {
            return this.priceEstimate_;
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
            if (!getBidderSdkverBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.bidderSdkver_);
            }
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetClientParams(), ClientParamsDefaultEntryHolder.defaultEntry, 3);
            double d2 = this.priceEstimate_;
            if (d2 != 0.0d) {
                codedOutputStream.writeDouble(4, d2);
            }
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
            if (!getBidderSdkverBytes().isEmpty()) {
                i2 += GeneratedMessageV3.computeStringSize(2, this.bidderSdkver_);
            }
            for (Map.Entry next : internalGetClientParams().getMap().entrySet()) {
                i2 += CodedOutputStream.computeMessageSize(3, ClientParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(next.getKey()).setValue(next.getValue()).build());
            }
            double d2 = this.priceEstimate_;
            if (d2 != 0.0d) {
                i2 += CodedOutputStream.computeDoubleSize(4, d2);
            }
            int serializedSize = i2 + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return super.equals(obj);
            }
            AdUnit adUnit = (AdUnit) obj;
            if (getBidder().equals(adUnit.getBidder()) && getBidderSdkver().equals(adUnit.getBidderSdkver()) && internalGetClientParams().equals(adUnit.internalGetClientParams()) && Double.doubleToLongBits(getPriceEstimate()) == Double.doubleToLongBits(adUnit.getPriceEstimate()) && this.unknownFields.equals(adUnit.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getBidder().hashCode()) * 37) + 2) * 53) + getBidderSdkver().hashCode();
            if (!internalGetClientParams().getMap().isEmpty()) {
                hashCode = (((hashCode * 37) + 3) * 53) + internalGetClientParams().hashCode();
            }
            int hashLong = (((((hashCode * 37) + 4) * 53) + Internal.hashLong(Double.doubleToLongBits(getPriceEstimate()))) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashLong;
            return hashLong;
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static AdUnit parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static AdUnit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static AdUnit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AdUnit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static AdUnit parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AdUnit parseFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdUnit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AdUnit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdUnit) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(AdUnit adUnit) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adUnit);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdUnitOrBuilder {
            private Object bidderSdkver_;
            private Object bidder_;
            private int bitField0_;
            private MapField<String, String> clientParams_;
            private double priceEstimate_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMapField(int i) {
                if (i == 3) {
                    return internalGetClientParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public MapField internalGetMutableMapField(int i) {
                if (i == 3) {
                    return internalGetMutableClientParams();
                }
                throw new RuntimeException("Invalid map field number: " + i);
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_fieldAccessorTable.ensureFieldAccessorsInitialized(AdUnit.class, Builder.class);
            }

            private Builder() {
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = AdUnit.alwaysUseFieldBuilders;
            }

            public Builder clear() {
                super.clear();
                this.bidder_ = "";
                this.bidderSdkver_ = "";
                internalGetMutableClientParams().clear();
                this.priceEstimate_ = 0.0d;
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_AdUnit_descriptor;
            }

            public AdUnit getDefaultInstanceForType() {
                return AdUnit.getDefaultInstance();
            }

            public AdUnit build() {
                AdUnit buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public AdUnit buildPartial() {
                AdUnit adUnit = new AdUnit((GeneratedMessageV3.Builder) this);
                Object unused = adUnit.bidder_ = this.bidder_;
                Object unused2 = adUnit.bidderSdkver_ = this.bidderSdkver_;
                MapField unused3 = adUnit.clientParams_ = internalGetClientParams();
                adUnit.clientParams_.makeImmutable();
                double unused4 = adUnit.priceEstimate_ = this.priceEstimate_;
                onBuilt();
                return adUnit;
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
                if (message instanceof AdUnit) {
                    return mergeFrom((AdUnit) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdUnit adUnit) {
                if (adUnit == AdUnit.getDefaultInstance()) {
                    return this;
                }
                if (!adUnit.getBidder().isEmpty()) {
                    this.bidder_ = adUnit.bidder_;
                    onChanged();
                }
                if (!adUnit.getBidderSdkver().isEmpty()) {
                    this.bidderSdkver_ = adUnit.bidderSdkver_;
                    onChanged();
                }
                internalGetMutableClientParams().mergeFrom(adUnit.internalGetClientParams());
                if (adUnit.getPriceEstimate() != 0.0d) {
                    setPriceEstimate(adUnit.getPriceEstimate());
                }
                mergeUnknownFields(adUnit.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.AdUnit.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$AdUnit$Builder");
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
                this.bidder_ = AdUnit.getDefaultInstance().getBidder();
                onChanged();
                return this;
            }

            public Builder setBidderBytes(ByteString byteString) {
                if (byteString != null) {
                    AdUnit.checkByteStringIsUtf8(byteString);
                    this.bidder_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public String getBidderSdkver() {
                Object obj = this.bidderSdkver_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.bidderSdkver_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBidderSdkverBytes() {
                Object obj = this.bidderSdkver_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bidderSdkver_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setBidderSdkver(String str) {
                if (str != null) {
                    this.bidderSdkver_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearBidderSdkver() {
                this.bidderSdkver_ = AdUnit.getDefaultInstance().getBidderSdkver();
                onChanged();
                return this;
            }

            public Builder setBidderSdkverBytes(ByteString byteString) {
                if (byteString != null) {
                    AdUnit.checkByteStringIsUtf8(byteString);
                    this.bidderSdkver_ = byteString;
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

            public double getPriceEstimate() {
                return this.priceEstimate_;
            }

            public Builder setPriceEstimate(double d2) {
                this.priceEstimate_ = d2;
                onChanged();
                return this;
            }

            public Builder clearPriceEstimate() {
                this.priceEstimate_ = 0.0d;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static AdUnit getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<AdUnit> parser() {
            return PARSER;
        }

        public Parser<AdUnit> getParserForType() {
            return PARSER;
        }

        public AdUnit getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    public List<AdUnit> getAdUnitsList() {
        return this.adUnits_;
    }

    public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
        return this.adUnits_;
    }

    public int getAdUnitsCount() {
        return this.adUnits_.size();
    }

    public AdUnit getAdUnits(int i) {
        return this.adUnits_.get(i);
    }

    public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
        return this.adUnits_.get(i);
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
        for (int i = 0; i < this.adUnits_.size(); i++) {
            codedOutputStream.writeMessage(1, this.adUnits_.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.adUnits_.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, this.adUnits_.get(i3));
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeaderBiddingPlacement)) {
            return super.equals(obj);
        }
        HeaderBiddingPlacement headerBiddingPlacement = (HeaderBiddingPlacement) obj;
        if (getAdUnitsList().equals(headerBiddingPlacement.getAdUnitsList()) && this.unknownFields.equals(headerBiddingPlacement.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = 779 + getDescriptor().hashCode();
        if (getAdUnitsCount() > 0) {
            hashCode = (((hashCode * 37) + 1) * 53) + getAdUnitsList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static HeaderBiddingPlacement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static HeaderBiddingPlacement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static HeaderBiddingPlacement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingPlacement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static HeaderBiddingPlacement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static HeaderBiddingPlacement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static HeaderBiddingPlacement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HeaderBiddingPlacement) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(HeaderBiddingPlacement headerBiddingPlacement) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(headerBiddingPlacement);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeaderBiddingPlacementOrBuilder {
        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> adUnitsBuilder_;
        private List<AdUnit> adUnits_;
        private int bitField0_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_fieldAccessorTable.ensureFieldAccessorsInitialized(HeaderBiddingPlacement.class, Builder.class);
        }

        private Builder() {
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.adUnits_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (HeaderBiddingPlacement.alwaysUseFieldBuilders) {
                getAdUnitsFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adUnits_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return HeaderBiddingProto.internal_static_bidmachine_protobuf_headerbidding_HeaderBiddingPlacement_descriptor;
        }

        public HeaderBiddingPlacement getDefaultInstanceForType() {
            return HeaderBiddingPlacement.getDefaultInstance();
        }

        public HeaderBiddingPlacement build() {
            HeaderBiddingPlacement buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public HeaderBiddingPlacement buildPartial() {
            HeaderBiddingPlacement headerBiddingPlacement = new HeaderBiddingPlacement((GeneratedMessageV3.Builder) this);
            int i = this.bitField0_;
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i & 1) != 0) {
                    this.adUnits_ = Collections.unmodifiableList(this.adUnits_);
                    this.bitField0_ &= -2;
                }
                List unused = headerBiddingPlacement.adUnits_ = this.adUnits_;
            } else {
                List unused2 = headerBiddingPlacement.adUnits_ = repeatedFieldBuilderV3.build();
            }
            onBuilt();
            return headerBiddingPlacement;
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
            if (message instanceof HeaderBiddingPlacement) {
                return mergeFrom((HeaderBiddingPlacement) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(HeaderBiddingPlacement headerBiddingPlacement) {
            if (headerBiddingPlacement == HeaderBiddingPlacement.getDefaultInstance()) {
                return this;
            }
            if (this.adUnitsBuilder_ == null) {
                if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                    if (this.adUnits_.isEmpty()) {
                        this.adUnits_ = headerBiddingPlacement.adUnits_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureAdUnitsIsMutable();
                        this.adUnits_.addAll(headerBiddingPlacement.adUnits_);
                    }
                    onChanged();
                }
            } else if (!headerBiddingPlacement.adUnits_.isEmpty()) {
                if (this.adUnitsBuilder_.isEmpty()) {
                    this.adUnitsBuilder_.dispose();
                    RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = null;
                    this.adUnitsBuilder_ = null;
                    this.adUnits_ = headerBiddingPlacement.adUnits_;
                    this.bitField0_ &= -2;
                    if (HeaderBiddingPlacement.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getAdUnitsFieldBuilder();
                    }
                    this.adUnitsBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.adUnitsBuilder_.addAllMessages(headerBiddingPlacement.adUnits_);
                }
            }
            mergeUnknownFields(headerBiddingPlacement.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r3 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement r4 = (io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement$Builder");
        }

        private void ensureAdUnitsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.adUnits_ = new ArrayList(this.adUnits_);
                this.bitField0_ |= 1;
            }
        }

        public List<AdUnit> getAdUnitsList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.adUnits_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getAdUnitsCount() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public AdUnit getAdUnits(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setAdUnits(int i, AdUnit adUnit) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, adUnit);
            } else if (adUnit != null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i, adUnit);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setAdUnits(int i, AdUnit.Builder builder) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAdUnits(AdUnit adUnit) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(adUnit);
            } else if (adUnit != null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(adUnit);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addAdUnits(int i, AdUnit adUnit) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, adUnit);
            } else if (adUnit != null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i, adUnit);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addAdUnits(AdUnit.Builder builder) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addAdUnits(int i, AdUnit.Builder builder) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllAdUnits(Iterable<? extends AdUnit> iterable) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.adUnits_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearAdUnits() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.adUnits_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeAdUnits(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureAdUnitsIsMutable();
                this.adUnits_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public AdUnit.Builder getAdUnitsBuilder(int i) {
            return getAdUnitsFieldBuilder().getBuilder(i);
        }

        public AdUnitOrBuilder getAdUnitsOrBuilder(int i) {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.adUnits_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends AdUnitOrBuilder> getAdUnitsOrBuilderList() {
            RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> repeatedFieldBuilderV3 = this.adUnitsBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.adUnits_);
        }

        public AdUnit.Builder addAdUnitsBuilder() {
            return getAdUnitsFieldBuilder().addBuilder(AdUnit.getDefaultInstance());
        }

        public AdUnit.Builder addAdUnitsBuilder(int i) {
            return getAdUnitsFieldBuilder().addBuilder(i, AdUnit.getDefaultInstance());
        }

        public List<AdUnit.Builder> getAdUnitsBuilderList() {
            return getAdUnitsFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<AdUnit, AdUnit.Builder, AdUnitOrBuilder> getAdUnitsFieldBuilder() {
            if (this.adUnitsBuilder_ == null) {
                List<AdUnit> list = this.adUnits_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.adUnitsBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.adUnits_ = null;
            }
            return this.adUnitsBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static HeaderBiddingPlacement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<HeaderBiddingPlacement> parser() {
        return PARSER;
    }

    public Parser<HeaderBiddingPlacement> getParserForType() {
        return PARSER;
    }

    public HeaderBiddingPlacement getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}

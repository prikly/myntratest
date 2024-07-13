package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.adcom.Context;
import com.explorestack.protobuf.adcom.ContextOrBuilder;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementOrBuilder;
import com.explorestack.protobuf.openrtb.Request;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AuctionContext extends GeneratedMessageV3 implements AuctionContextOrBuilder {
    public static final int AT_FIELD_NUMBER = 4;
    public static final int CONTEXT_FIELD_NUMBER = 8;
    private static final AuctionContext DEFAULT_INSTANCE = new AuctionContext();
    public static final int ID_FIELD_NUMBER = 2;
    public static final int ITEM_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final Parser<AuctionContext> PARSER = new AbstractParser<AuctionContext>() {
        public AuctionContext parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AuctionContext(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int PLACEMENT_FIELD_NUMBER = 7;
    public static final int PLACEMENT_TAG_FIELD_NUMBER = 5;
    public static final int TEST_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public int at_;
    /* access modifiers changed from: private */
    public Context context_;
    /* access modifiers changed from: private */
    public volatile Object id_;
    /* access modifiers changed from: private */
    public Request.Item item_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int placementTag_;
    /* access modifiers changed from: private */
    public Placement placement_;
    /* access modifiers changed from: private */
    public boolean test_;
    /* access modifiers changed from: private */
    public volatile Object timestamp_;

    private AuctionContext(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private AuctionContext() {
        this.memoizedIsInitialized = -1;
        this.timestamp_ = "";
        this.id_ = "";
        this.placementTag_ = 0;
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AuctionContext();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private AuctionContext(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 10) {
                            this.timestamp_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.id_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 24) {
                            this.test_ = codedInputStream.readBool();
                        } else if (readTag == 32) {
                            this.at_ = codedInputStream.readUInt32();
                        } else if (readTag == 40) {
                            this.placementTag_ = codedInputStream.readEnum();
                        } else if (readTag == 50) {
                            Request.Item.Builder builder = this.item_ != null ? this.item_.toBuilder() : null;
                            Request.Item item = (Request.Item) codedInputStream.readMessage(Request.Item.parser(), extensionRegistryLite);
                            this.item_ = item;
                            if (builder != null) {
                                builder.mergeFrom(item);
                                this.item_ = builder.buildPartial();
                            }
                        } else if (readTag == 58) {
                            Placement.Builder builder2 = this.placement_ != null ? this.placement_.toBuilder() : null;
                            Placement placement = (Placement) codedInputStream.readMessage(Placement.parser(), extensionRegistryLite);
                            this.placement_ = placement;
                            if (builder2 != null) {
                                builder2.mergeFrom(placement);
                                this.placement_ = builder2.buildPartial();
                            }
                        } else if (readTag == 66) {
                            Context.Builder builder3 = this.context_ != null ? this.context_.toBuilder() : null;
                            Context context = (Context) codedInputStream.readMessage(Context.parser(), extensionRegistryLite);
                            this.context_ = context;
                            if (builder3 != null) {
                                builder3.mergeFrom(context);
                                this.context_ = builder3.buildPartial();
                            }
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
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AuctionContext.class, Builder.class);
    }

    public String getTimestamp() {
        Object obj = this.timestamp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.timestamp_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getTimestampBytes() {
        Object obj = this.timestamp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.timestamp_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getId() {
        Object obj = this.id_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.id_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getIdBytes() {
        Object obj = this.id_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.id_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public boolean getTest() {
        return this.test_;
    }

    public int getAt() {
        return this.at_;
    }

    public int getPlacementTagValue() {
        return this.placementTag_;
    }

    public PlacementTag getPlacementTag() {
        PlacementTag valueOf = PlacementTag.valueOf(this.placementTag_);
        return valueOf == null ? PlacementTag.UNRECOGNIZED : valueOf;
    }

    public boolean hasItem() {
        return this.item_ != null;
    }

    public Request.Item getItem() {
        Request.Item item = this.item_;
        return item == null ? Request.Item.getDefaultInstance() : item;
    }

    public Request.ItemOrBuilder getItemOrBuilder() {
        return getItem();
    }

    public boolean hasPlacement() {
        return this.placement_ != null;
    }

    public Placement getPlacement() {
        Placement placement = this.placement_;
        return placement == null ? Placement.getDefaultInstance() : placement;
    }

    public PlacementOrBuilder getPlacementOrBuilder() {
        return getPlacement();
    }

    public boolean hasContext() {
        return this.context_ != null;
    }

    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    public ContextOrBuilder getContextOrBuilder() {
        return getContext();
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
        if (!getTimestampBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.timestamp_);
        }
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.id_);
        }
        boolean z = this.test_;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        int i = this.at_;
        if (i != 0) {
            codedOutputStream.writeUInt32(4, i);
        }
        if (this.placementTag_ != PlacementTag.PLACEMENT_TAG_INVALID.getNumber()) {
            codedOutputStream.writeEnum(5, this.placementTag_);
        }
        if (this.item_ != null) {
            codedOutputStream.writeMessage(6, getItem());
        }
        if (this.placement_ != null) {
            codedOutputStream.writeMessage(7, getPlacement());
        }
        if (this.context_ != null) {
            codedOutputStream.writeMessage(8, getContext());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!getTimestampBytes().isEmpty()) {
            i2 = 0 + GeneratedMessageV3.computeStringSize(1, this.timestamp_);
        }
        if (!getIdBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.id_);
        }
        boolean z = this.test_;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(3, z);
        }
        int i3 = this.at_;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeUInt32Size(4, i3);
        }
        if (this.placementTag_ != PlacementTag.PLACEMENT_TAG_INVALID.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(5, this.placementTag_);
        }
        if (this.item_ != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getItem());
        }
        if (this.placement_ != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getPlacement());
        }
        if (this.context_ != null) {
            i2 += CodedOutputStream.computeMessageSize(8, getContext());
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuctionContext)) {
            return super.equals(obj);
        }
        AuctionContext auctionContext = (AuctionContext) obj;
        if (!getTimestamp().equals(auctionContext.getTimestamp()) || !getId().equals(auctionContext.getId()) || getTest() != auctionContext.getTest() || getAt() != auctionContext.getAt() || this.placementTag_ != auctionContext.placementTag_ || hasItem() != auctionContext.hasItem()) {
            return false;
        }
        if ((hasItem() && !getItem().equals(auctionContext.getItem())) || hasPlacement() != auctionContext.hasPlacement()) {
            return false;
        }
        if ((hasPlacement() && !getPlacement().equals(auctionContext.getPlacement())) || hasContext() != auctionContext.hasContext()) {
            return false;
        }
        if ((!hasContext() || getContext().equals(auctionContext.getContext())) && this.unknownFields.equals(auctionContext.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getTimestamp().hashCode()) * 37) + 2) * 53) + getId().hashCode()) * 37) + 3) * 53) + Internal.hashBoolean(getTest())) * 37) + 4) * 53) + getAt()) * 37) + 5) * 53) + this.placementTag_;
        if (hasItem()) {
            hashCode = (((hashCode * 37) + 6) * 53) + getItem().hashCode();
        }
        if (hasPlacement()) {
            hashCode = (((hashCode * 37) + 7) * 53) + getPlacement().hashCode();
        }
        if (hasContext()) {
            hashCode = (((hashCode * 37) + 8) * 53) + getContext().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static AuctionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static AuctionContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static AuctionContext parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static AuctionContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static AuctionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static AuctionContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AuctionContext parseFrom(InputStream inputStream) throws IOException {
        return (AuctionContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AuctionContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuctionContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuctionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuctionContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AuctionContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuctionContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AuctionContext parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuctionContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AuctionContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuctionContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuctionContext auctionContext) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(auctionContext);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AuctionContextOrBuilder {
        private int at_;
        private SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> contextBuilder_;
        private Context context_;
        private Object id_;
        private SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> itemBuilder_;
        private Request.Item item_;
        private SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> placementBuilder_;
        private int placementTag_;
        private Placement placement_;
        private boolean test_;
        private Object timestamp_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_fieldAccessorTable.ensureFieldAccessorsInitialized(AuctionContext.class, Builder.class);
        }

        private Builder() {
            this.timestamp_ = "";
            this.id_ = "";
            this.placementTag_ = 0;
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.timestamp_ = "";
            this.id_ = "";
            this.placementTag_ = 0;
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = AuctionContext.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.timestamp_ = "";
            this.id_ = "";
            this.test_ = false;
            this.at_ = 0;
            this.placementTag_ = 0;
            if (this.itemBuilder_ == null) {
                this.item_ = null;
            } else {
                this.item_ = null;
                this.itemBuilder_ = null;
            }
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            if (this.contextBuilder_ == null) {
                this.context_ = null;
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return AnalyticsProto.internal_static_bidmachine_protobuf_analytics_AuctionContext_descriptor;
        }

        public AuctionContext getDefaultInstanceForType() {
            return AuctionContext.getDefaultInstance();
        }

        public AuctionContext build() {
            AuctionContext buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public AuctionContext buildPartial() {
            AuctionContext auctionContext = new AuctionContext((GeneratedMessageV3.Builder) this);
            Object unused = auctionContext.timestamp_ = this.timestamp_;
            Object unused2 = auctionContext.id_ = this.id_;
            boolean unused3 = auctionContext.test_ = this.test_;
            int unused4 = auctionContext.at_ = this.at_;
            int unused5 = auctionContext.placementTag_ = this.placementTag_;
            SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> singleFieldBuilderV3 = this.itemBuilder_;
            if (singleFieldBuilderV3 == null) {
                Request.Item unused6 = auctionContext.item_ = this.item_;
            } else {
                Request.Item unused7 = auctionContext.item_ = singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV32 = this.placementBuilder_;
            if (singleFieldBuilderV32 == null) {
                Placement unused8 = auctionContext.placement_ = this.placement_;
            } else {
                Placement unused9 = auctionContext.placement_ = singleFieldBuilderV32.build();
            }
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV33 = this.contextBuilder_;
            if (singleFieldBuilderV33 == null) {
                Context unused10 = auctionContext.context_ = this.context_;
            } else {
                Context unused11 = auctionContext.context_ = singleFieldBuilderV33.build();
            }
            onBuilt();
            return auctionContext;
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
            if (message instanceof AuctionContext) {
                return mergeFrom((AuctionContext) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AuctionContext auctionContext) {
            if (auctionContext == AuctionContext.getDefaultInstance()) {
                return this;
            }
            if (!auctionContext.getTimestamp().isEmpty()) {
                this.timestamp_ = auctionContext.timestamp_;
                onChanged();
            }
            if (!auctionContext.getId().isEmpty()) {
                this.id_ = auctionContext.id_;
                onChanged();
            }
            if (auctionContext.getTest()) {
                setTest(auctionContext.getTest());
            }
            if (auctionContext.getAt() != 0) {
                setAt(auctionContext.getAt());
            }
            if (auctionContext.placementTag_ != 0) {
                setPlacementTagValue(auctionContext.getPlacementTagValue());
            }
            if (auctionContext.hasItem()) {
                mergeItem(auctionContext.getItem());
            }
            if (auctionContext.hasPlacement()) {
                mergePlacement(auctionContext.getPlacement());
            }
            if (auctionContext.hasContext()) {
                mergeContext(auctionContext.getContext());
            }
            mergeUnknownFields(auctionContext.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public io.bidmachine.protobuf.analytics.AuctionContext.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = io.bidmachine.protobuf.analytics.AuctionContext.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                io.bidmachine.protobuf.analytics.AuctionContext r3 = (io.bidmachine.protobuf.analytics.AuctionContext) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((io.bidmachine.protobuf.analytics.AuctionContext) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                io.bidmachine.protobuf.analytics.AuctionContext r4 = (io.bidmachine.protobuf.analytics.AuctionContext) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((io.bidmachine.protobuf.analytics.AuctionContext) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.protobuf.analytics.AuctionContext.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):io.bidmachine.protobuf.analytics.AuctionContext$Builder");
        }

        public String getTimestamp() {
            Object obj = this.timestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.timestamp_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getTimestampBytes() {
            Object obj = this.timestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.timestamp_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setTimestamp(String str) {
            if (str != null) {
                this.timestamp_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearTimestamp() {
            this.timestamp_ = AuctionContext.getDefaultInstance().getTimestamp();
            onChanged();
            return this;
        }

        public Builder setTimestampBytes(ByteString byteString) {
            if (byteString != null) {
                AuctionContext.checkByteStringIsUtf8(byteString);
                this.timestamp_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.id_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setId(String str) {
            if (str != null) {
                this.id_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearId() {
            this.id_ = AuctionContext.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            if (byteString != null) {
                AuctionContext.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public boolean getTest() {
            return this.test_;
        }

        public Builder setTest(boolean z) {
            this.test_ = z;
            onChanged();
            return this;
        }

        public Builder clearTest() {
            this.test_ = false;
            onChanged();
            return this;
        }

        public int getAt() {
            return this.at_;
        }

        public Builder setAt(int i) {
            this.at_ = i;
            onChanged();
            return this;
        }

        public Builder clearAt() {
            this.at_ = 0;
            onChanged();
            return this;
        }

        public int getPlacementTagValue() {
            return this.placementTag_;
        }

        public Builder setPlacementTagValue(int i) {
            this.placementTag_ = i;
            onChanged();
            return this;
        }

        public PlacementTag getPlacementTag() {
            PlacementTag valueOf = PlacementTag.valueOf(this.placementTag_);
            return valueOf == null ? PlacementTag.UNRECOGNIZED : valueOf;
        }

        public Builder setPlacementTag(PlacementTag placementTag) {
            if (placementTag != null) {
                this.placementTag_ = placementTag.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearPlacementTag() {
            this.placementTag_ = 0;
            onChanged();
            return this;
        }

        public boolean hasItem() {
            return (this.itemBuilder_ == null && this.item_ == null) ? false : true;
        }

        public Request.Item getItem() {
            SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> singleFieldBuilderV3 = this.itemBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Request.Item item = this.item_;
            return item == null ? Request.Item.getDefaultInstance() : item;
        }

        public Builder setItem(Request.Item item) {
            SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> singleFieldBuilderV3 = this.itemBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(item);
            } else if (item != null) {
                this.item_ = item;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setItem(Request.Item.Builder builder) {
            SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> singleFieldBuilderV3 = this.itemBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.item_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeItem(Request.Item item) {
            SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> singleFieldBuilderV3 = this.itemBuilder_;
            if (singleFieldBuilderV3 == null) {
                Request.Item item2 = this.item_;
                if (item2 != null) {
                    this.item_ = Request.Item.newBuilder(item2).mergeFrom(item).buildPartial();
                } else {
                    this.item_ = item;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(item);
            }
            return this;
        }

        public Builder clearItem() {
            if (this.itemBuilder_ == null) {
                this.item_ = null;
                onChanged();
            } else {
                this.item_ = null;
                this.itemBuilder_ = null;
            }
            return this;
        }

        public Request.Item.Builder getItemBuilder() {
            onChanged();
            return getItemFieldBuilder().getBuilder();
        }

        public Request.ItemOrBuilder getItemOrBuilder() {
            SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> singleFieldBuilderV3 = this.itemBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Request.Item item = this.item_;
            return item == null ? Request.Item.getDefaultInstance() : item;
        }

        private SingleFieldBuilderV3<Request.Item, Request.Item.Builder, Request.ItemOrBuilder> getItemFieldBuilder() {
            if (this.itemBuilder_ == null) {
                this.itemBuilder_ = new SingleFieldBuilderV3<>(getItem(), getParentForChildren(), isClean());
                this.item_ = null;
            }
            return this.itemBuilder_;
        }

        public boolean hasPlacement() {
            return (this.placementBuilder_ == null && this.placement_ == null) ? false : true;
        }

        public Placement getPlacement() {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.placementBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        public Builder setPlacement(Placement placement) {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.placementBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(placement);
            } else if (placement != null) {
                this.placement_ = placement;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setPlacement(Placement.Builder builder) {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.placementBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.placement_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergePlacement(Placement placement) {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.placementBuilder_;
            if (singleFieldBuilderV3 == null) {
                Placement placement2 = this.placement_;
                if (placement2 != null) {
                    this.placement_ = Placement.newBuilder(placement2).mergeFrom(placement).buildPartial();
                } else {
                    this.placement_ = placement;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(placement);
            }
            return this;
        }

        public Builder clearPlacement() {
            if (this.placementBuilder_ == null) {
                this.placement_ = null;
                onChanged();
            } else {
                this.placement_ = null;
                this.placementBuilder_ = null;
            }
            return this;
        }

        public Placement.Builder getPlacementBuilder() {
            onChanged();
            return getPlacementFieldBuilder().getBuilder();
        }

        public PlacementOrBuilder getPlacementOrBuilder() {
            SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> singleFieldBuilderV3 = this.placementBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Placement placement = this.placement_;
            return placement == null ? Placement.getDefaultInstance() : placement;
        }

        private SingleFieldBuilderV3<Placement, Placement.Builder, PlacementOrBuilder> getPlacementFieldBuilder() {
            if (this.placementBuilder_ == null) {
                this.placementBuilder_ = new SingleFieldBuilderV3<>(getPlacement(), getParentForChildren(), isClean());
                this.placement_ = null;
            }
            return this.placementBuilder_;
        }

        public boolean hasContext() {
            return (this.contextBuilder_ == null && this.context_ == null) ? false : true;
        }

        public Context getContext() {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        public Builder setContext(Context context) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(context);
            } else if (context != null) {
                this.context_ = context;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.context_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeContext(Context context) {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 == null) {
                Context context2 = this.context_;
                if (context2 != null) {
                    this.context_ = Context.newBuilder(context2).mergeFrom(context).buildPartial();
                } else {
                    this.context_ = context;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(context);
            }
            return this;
        }

        public Builder clearContext() {
            if (this.contextBuilder_ == null) {
                this.context_ = null;
                onChanged();
            } else {
                this.context_ = null;
                this.contextBuilder_ = null;
            }
            return this;
        }

        public Context.Builder getContextBuilder() {
            onChanged();
            return getContextFieldBuilder().getBuilder();
        }

        public ContextOrBuilder getContextOrBuilder() {
            SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> singleFieldBuilderV3 = this.contextBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Context context = this.context_;
            return context == null ? Context.getDefaultInstance() : context;
        }

        private SingleFieldBuilderV3<Context, Context.Builder, ContextOrBuilder> getContextFieldBuilder() {
            if (this.contextBuilder_ == null) {
                this.contextBuilder_ = new SingleFieldBuilderV3<>(getContext(), getParentForChildren(), isClean());
                this.context_ = null;
            }
            return this.contextBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static AuctionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<AuctionContext> parser() {
        return PARSER;
    }

    public Parser<AuctionContext> getParserForType() {
        return PARSER;
    }

    public AuctionContext getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}

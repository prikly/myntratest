package com.appodeal.ads.api;

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
import com.explorestack.protobuf.ProtocolMessageEnum;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;

public final class Event extends GeneratedMessageV3 implements EventOrBuilder {
    private static final Event DEFAULT_INSTANCE = new Event();
    /* access modifiers changed from: private */
    public static final Parser<Event> PARSER = new AbstractParser<Event>() {
        public Event parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Event(codedInputStream, extensionRegistryLite);
        }
    };
    /* access modifiers changed from: private */
    public float amount_;
    /* access modifiers changed from: private */
    public volatile Object currency_;
    /* access modifiers changed from: private */
    public int eventType_;
    /* access modifiers changed from: private */
    public volatile Object id_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int placementId_;

    private Event(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Event() {
        this.memoizedIsInitialized = -1;
        this.eventType_ = 0;
        this.id_ = "";
        this.currency_ = "";
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Event();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Event(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        if (extensionRegistryLite != null) {
            UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    int readTag = codedInputStream.readTag();
                    if (readTag != 0) {
                        if (readTag == 8) {
                            this.eventType_ = codedInputStream.readEnum();
                        } else if (readTag == 18) {
                            this.id_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 24) {
                            this.placementId_ = codedInputStream.readInt32();
                        } else if (readTag == 34) {
                            this.currency_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 45) {
                            this.amount_ = codedInputStream.readFloat();
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
        return Api.internal_static_com_appodeal_ads_Event_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Api.internal_static_com_appodeal_ads_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
    }

    public enum EventType implements ProtocolMessageEnum {
        INSTALL(0),
        IAP(1),
        SHOW(2),
        CLICK(3),
        FINISH(4),
        UNRECOGNIZED(-1);
        
        private static final EventType[] VALUES = null;
        private static final Internal.EnumLiteMap<EventType> internalValueMap = null;
        private final int value;

        static {
            internalValueMap = new Internal.EnumLiteMap<EventType>() {
                public EventType findValueByNumber(int i) {
                    return EventType.forNumber(i);
                }
            };
            VALUES = values();
        }

        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static EventType forNumber(int i) {
            if (i == 0) {
                return INSTALL;
            }
            if (i == 1) {
                return IAP;
            }
            if (i == 2) {
                return SHOW;
            }
            if (i == 3) {
                return CLICK;
            }
            if (i != 4) {
                return null;
            }
            return FINISH;
        }

        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return Event.getDescriptor().getEnumTypes().get(0);
        }

        private EventType(int i) {
            this.value = i;
        }
    }

    public int getEventTypeValue() {
        return this.eventType_;
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

    public int getPlacementId() {
        return this.placementId_;
    }

    public String getCurrency() {
        Object obj = this.currency_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.currency_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCurrencyBytes() {
        Object obj = this.currency_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.currency_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public float getAmount() {
        return this.amount_;
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
        if (this.eventType_ != EventType.INSTALL.getNumber()) {
            codedOutputStream.writeEnum(1, this.eventType_);
        }
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.id_);
        }
        int i = this.placementId_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        if (!getCurrencyBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.currency_);
        }
        float f2 = this.amount_;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(5, f2);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.eventType_ != EventType.INSTALL.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.eventType_);
        }
        if (!getIdBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(2, this.id_);
        }
        int i3 = this.placementId_;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(3, i3);
        }
        if (!getCurrencyBytes().isEmpty()) {
            i2 += GeneratedMessageV3.computeStringSize(4, this.currency_);
        }
        float f2 = this.amount_;
        if (f2 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(5, f2);
        }
        int serializedSize = i2 + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return super.equals(obj);
        }
        Event event = (Event) obj;
        if (this.eventType_ == event.eventType_ && getId().equals(event.getId()) && getPlacementId() == event.getPlacementId() && getCurrency().equals(event.getCurrency()) && Float.floatToIntBits(getAmount()) == Float.floatToIntBits(event.getAmount()) && this.unknownFields.equals(event.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.eventType_) * 37) + 2) * 53) + getId().hashCode()) * 37) + 3) * 53) + getPlacementId()) * 37) + 4) * 53) + getCurrency().hashCode()) * 37) + 5) * 53) + Float.floatToIntBits(getAmount())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Event event) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventOrBuilder {
        private float amount_;
        private Object currency_;
        private int eventType_;
        private Object id_;
        private int placementId_;

        public final boolean isInitialized() {
            return true;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Api.internal_static_com_appodeal_ads_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
        }

        private Builder() {
            this.eventType_ = 0;
            this.id_ = "";
            this.currency_ = "";
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.eventType_ = 0;
            this.id_ = "";
            this.currency_ = "";
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = Event.alwaysUseFieldBuilders;
        }

        public Builder clear() {
            super.clear();
            this.eventType_ = 0;
            this.id_ = "";
            this.placementId_ = 0;
            this.currency_ = "";
            this.amount_ = 0.0f;
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return Api.internal_static_com_appodeal_ads_Event_descriptor;
        }

        public Event getDefaultInstanceForType() {
            return Event.getDefaultInstance();
        }

        public Event build() {
            Event buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Event buildPartial() {
            Event event = new Event((GeneratedMessageV3.Builder) this);
            int unused = event.eventType_ = this.eventType_;
            Object unused2 = event.id_ = this.id_;
            int unused3 = event.placementId_ = this.placementId_;
            Object unused4 = event.currency_ = this.currency_;
            float unused5 = event.amount_ = this.amount_;
            onBuilt();
            return event;
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
            if (message instanceof Event) {
                return mergeFrom((Event) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Event event) {
            if (event == Event.getDefaultInstance()) {
                return this;
            }
            if (event.eventType_ != 0) {
                setEventTypeValue(event.getEventTypeValue());
            }
            if (!event.getId().isEmpty()) {
                this.id_ = event.id_;
                onChanged();
            }
            if (event.getPlacementId() != 0) {
                setPlacementId(event.getPlacementId());
            }
            if (!event.getCurrency().isEmpty()) {
                this.currency_ = event.currency_;
                onChanged();
            }
            if (event.getAmount() != 0.0f) {
                setAmount(event.getAmount());
            }
            mergeUnknownFields(event.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.appodeal.ads.api.Event.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.appodeal.ads.api.Event.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.appodeal.ads.api.Event r3 = (com.appodeal.ads.api.Event) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.appodeal.ads.api.Event) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.appodeal.ads.api.Event r4 = (com.appodeal.ads.api.Event) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.appodeal.ads.api.Event) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.api.Event.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.appodeal.ads.api.Event$Builder");
        }

        public Builder setEventTypeValue(int i) {
            this.eventType_ = i;
            onChanged();
            return this;
        }

        public Builder setPlacementId(int i) {
            this.placementId_ = i;
            onChanged();
            return this;
        }

        public Builder setAmount(float f2) {
            this.amount_ = f2;
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

    public static Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Event> parser() {
        return PARSER;
    }

    public Parser<Event> getParserForType() {
        return PARSER;
    }

    public Event getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}

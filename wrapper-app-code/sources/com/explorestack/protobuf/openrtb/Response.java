package com.explorestack.protobuf.openrtb;

import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.AnyOrBuilder;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.StructOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Response extends GeneratedMessageV3 implements ResponseOrBuilder {
    public static final int BIDID_FIELD_NUMBER = 2;
    public static final int CDATA_FIELD_NUMBER = 5;
    public static final int CUR_FIELD_NUMBER = 4;
    private static final Response DEFAULT_INSTANCE = new Response();
    public static final int EXT_FIELD_NUMBER = 8;
    public static final int EXT_PROTO_FIELD_NUMBER = 7;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NBR_FIELD_NUMBER = 3;
    /* access modifiers changed from: private */
    public static final Parser<Response> PARSER = new AbstractParser<Response>() {
        public Response parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Response(codedInputStream, extensionRegistryLite);
        }
    };
    public static final int SEATBID_FIELD_NUMBER = 6;
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public volatile Object bidid_;
    /* access modifiers changed from: private */
    public volatile Object cdata_;
    /* access modifiers changed from: private */
    public volatile Object cur_;
    /* access modifiers changed from: private */
    public List<Any> extProto_;
    /* access modifiers changed from: private */
    public Struct ext_;
    /* access modifiers changed from: private */
    public volatile Object id_;
    private byte memoizedIsInitialized;
    /* access modifiers changed from: private */
    public int nbr_;
    /* access modifiers changed from: private */
    public List<Seatbid> seatbid_;

    public interface SeatbidOrBuilder extends MessageOrBuilder {
        Seatbid.Bid getBid(int i);

        int getBidCount();

        List<Seatbid.Bid> getBidList();

        Seatbid.BidOrBuilder getBidOrBuilder(int i);

        List<? extends Seatbid.BidOrBuilder> getBidOrBuilderList();

        Struct getExt();

        StructOrBuilder getExtOrBuilder();

        Any getExtProto(int i);

        int getExtProtoCount();

        List<Any> getExtProtoList();

        AnyOrBuilder getExtProtoOrBuilder(int i);

        List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

        boolean getPackage();

        String getSeat();

        ByteString getSeatBytes();

        boolean hasExt();
    }

    private Response(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = -1;
    }

    private Response() {
        this.memoizedIsInitialized = -1;
        this.id_ = "";
        this.bidid_ = "";
        this.nbr_ = 0;
        this.cur_ = "";
        this.cdata_ = "";
        this.seatbid_ = Collections.emptyList();
        this.extProto_ = Collections.emptyList();
    }

    /* access modifiers changed from: protected */
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new Response();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private Response(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            this.id_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 18) {
                            this.bidid_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 24) {
                            this.nbr_ = codedInputStream.readEnum();
                        } else if (readTag == 34) {
                            this.cur_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 42) {
                            this.cdata_ = codedInputStream.readStringRequireUtf8();
                        } else if (readTag == 50) {
                            if (!z2 || !true) {
                                this.seatbid_ = new ArrayList();
                                z2 |= true;
                            }
                            this.seatbid_.add(codedInputStream.readMessage(Seatbid.parser(), extensionRegistryLite));
                        } else if (readTag == 58) {
                            if (!z2 || !true) {
                                this.extProto_ = new ArrayList();
                                z2 |= true;
                            }
                            this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                        } else if (readTag == 66) {
                            Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                            Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                            this.ext_ = struct;
                            if (builder != null) {
                                builder.mergeFrom(struct);
                                this.ext_ = builder.buildPartial();
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
                    if (z2 && true) {
                        this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z2 && true) {
                this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
            }
            if (z2 && true) {
                this.extProto_ = Collections.unmodifiableList(this.extProto_);
            }
            this.unknownFields = newBuilder.build();
            makeExtensionsImmutable();
            return;
        }
        throw null;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_descriptor;
    }

    /* access modifiers changed from: protected */
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(Response.class, Builder.class);
    }

    public static final class Seatbid extends GeneratedMessageV3 implements SeatbidOrBuilder {
        public static final int BID_FIELD_NUMBER = 3;
        private static final Seatbid DEFAULT_INSTANCE = new Seatbid();
        public static final int EXT_FIELD_NUMBER = 5;
        public static final int EXT_PROTO_FIELD_NUMBER = 4;
        public static final int PACKAGE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final Parser<Seatbid> PARSER = new AbstractParser<Seatbid>() {
            public Seatbid parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Seatbid(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int SEAT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        /* access modifiers changed from: private */
        public List<Bid> bid_;
        /* access modifiers changed from: private */
        public List<Any> extProto_;
        /* access modifiers changed from: private */
        public Struct ext_;
        private byte memoizedIsInitialized;
        /* access modifiers changed from: private */
        public boolean package_;
        /* access modifiers changed from: private */
        public volatile Object seat_;

        public interface BidOrBuilder extends MessageOrBuilder {
            String getBurl();

            ByteString getBurlBytes();

            String getCid();

            ByteString getCidBytes();

            String getDeal();

            ByteString getDealBytes();

            int getExp();

            Struct getExt();

            StructOrBuilder getExtOrBuilder();

            Any getExtProto(int i);

            int getExtProtoCount();

            List<Any> getExtProtoList();

            AnyOrBuilder getExtProtoOrBuilder(int i);

            List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

            String getId();

            ByteString getIdBytes();

            String getItem();

            ByteString getItemBytes();

            String getLurl();

            ByteString getLurlBytes();

            Bid.Macro getMacro(int i);

            int getMacroCount();

            List<Bid.Macro> getMacroList();

            Bid.MacroOrBuilder getMacroOrBuilder(int i);

            List<? extends Bid.MacroOrBuilder> getMacroOrBuilderList();

            Any getMedia();

            AnyOrBuilder getMediaOrBuilder();

            String getMid();

            ByteString getMidBytes();

            double getPrice();

            String getPurl();

            ByteString getPurlBytes();

            String getTactic();

            ByteString getTacticBytes();

            boolean hasExt();

            boolean hasMedia();
        }

        private Seatbid(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private Seatbid() {
            this.memoizedIsInitialized = -1;
            this.seat_ = "";
            this.bid_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
        }

        /* access modifiers changed from: protected */
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Seatbid();
        }

        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private Seatbid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.seat_ = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 16) {
                                this.package_ = codedInputStream.readBool();
                            } else if (readTag == 26) {
                                if (!z2 || !true) {
                                    this.bid_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.bid_.add(codedInputStream.readMessage(Bid.parser(), extensionRegistryLite));
                            } else if (readTag == 34) {
                                if (!z2 || !true) {
                                    this.extProto_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                            } else if (readTag == 42) {
                                Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                this.ext_ = struct;
                                if (builder != null) {
                                    builder.mergeFrom(struct);
                                    this.ext_ = builder.buildPartial();
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
                        if (z2 && true) {
                            this.bid_ = Collections.unmodifiableList(this.bid_);
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        throw th;
                    }
                }
                if (z2 && true) {
                    this.bid_ = Collections.unmodifiableList(this.bid_);
                }
                if (z2 && true) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                }
                this.unknownFields = newBuilder.build();
                makeExtensionsImmutable();
                return;
            }
            throw null;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_fieldAccessorTable.ensureFieldAccessorsInitialized(Seatbid.class, Builder.class);
        }

        public static final class Bid extends GeneratedMessageV3 implements BidOrBuilder {
            public static final int BURL_FIELD_NUMBER = 8;
            public static final int CID_FIELD_NUMBER = 5;
            public static final int DEAL_FIELD_NUMBER = 4;
            private static final Bid DEFAULT_INSTANCE = new Bid();
            public static final int EXP_FIELD_NUMBER = 10;
            public static final int EXT_FIELD_NUMBER = 15;
            public static final int EXT_PROTO_FIELD_NUMBER = 14;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int ITEM_FIELD_NUMBER = 2;
            public static final int LURL_FIELD_NUMBER = 9;
            public static final int MACRO_FIELD_NUMBER = 12;
            public static final int MEDIA_FIELD_NUMBER = 13;
            public static final int MID_FIELD_NUMBER = 11;
            /* access modifiers changed from: private */
            public static final Parser<Bid> PARSER = new AbstractParser<Bid>() {
                public Bid parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Bid(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int PRICE_FIELD_NUMBER = 3;
            public static final int PURL_FIELD_NUMBER = 7;
            public static final int TACTIC_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            /* access modifiers changed from: private */
            public volatile Object burl_;
            /* access modifiers changed from: private */
            public volatile Object cid_;
            /* access modifiers changed from: private */
            public volatile Object deal_;
            /* access modifiers changed from: private */
            public int exp_;
            /* access modifiers changed from: private */
            public List<Any> extProto_;
            /* access modifiers changed from: private */
            public Struct ext_;
            /* access modifiers changed from: private */
            public volatile Object id_;
            /* access modifiers changed from: private */
            public volatile Object item_;
            /* access modifiers changed from: private */
            public volatile Object lurl_;
            /* access modifiers changed from: private */
            public List<Macro> macro_;
            /* access modifiers changed from: private */
            public Any media_;
            private byte memoizedIsInitialized;
            /* access modifiers changed from: private */
            public volatile Object mid_;
            /* access modifiers changed from: private */
            public double price_;
            /* access modifiers changed from: private */
            public volatile Object purl_;
            /* access modifiers changed from: private */
            public volatile Object tactic_;

            public interface MacroOrBuilder extends MessageOrBuilder {
                Struct getExt();

                StructOrBuilder getExtOrBuilder();

                Any getExtProto(int i);

                int getExtProtoCount();

                List<Any> getExtProtoList();

                AnyOrBuilder getExtProtoOrBuilder(int i);

                List<? extends AnyOrBuilder> getExtProtoOrBuilderList();

                String getKey();

                ByteString getKeyBytes();

                String getValue();

                ByteString getValueBytes();

                boolean hasExt();
            }

            private Bid(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = -1;
            }

            private Bid() {
                this.memoizedIsInitialized = -1;
                this.id_ = "";
                this.item_ = "";
                this.deal_ = "";
                this.cid_ = "";
                this.tactic_ = "";
                this.purl_ = "";
                this.burl_ = "";
                this.lurl_ = "";
                this.mid_ = "";
                this.macro_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
            }

            /* access modifiers changed from: protected */
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new Bid();
            }

            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            private Bid(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                if (extensionRegistryLite != null) {
                    UnknownFieldSet.Builder newBuilder = UnknownFieldSet.newBuilder();
                    boolean z = false;
                    boolean z2 = false;
                    while (!z) {
                        try {
                            int readTag = codedInputStream.readTag();
                            switch (readTag) {
                                case 0:
                                    z = true;
                                    break;
                                case 10:
                                    this.id_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 18:
                                    this.item_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 25:
                                    this.price_ = codedInputStream.readDouble();
                                    break;
                                case 34:
                                    this.deal_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 42:
                                    this.cid_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 50:
                                    this.tactic_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 58:
                                    this.purl_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 66:
                                    this.burl_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 74:
                                    this.lurl_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 80:
                                    this.exp_ = codedInputStream.readUInt32();
                                    break;
                                case 90:
                                    this.mid_ = codedInputStream.readStringRequireUtf8();
                                    break;
                                case 98:
                                    if (!z2 || !true) {
                                        this.macro_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.macro_.add(codedInputStream.readMessage(Macro.parser(), extensionRegistryLite));
                                    break;
                                case 106:
                                    Any.Builder builder = this.media_ != null ? this.media_.toBuilder() : null;
                                    Any any = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                    this.media_ = any;
                                    if (builder == null) {
                                        break;
                                    } else {
                                        builder.mergeFrom(any);
                                        this.media_ = builder.buildPartial();
                                        break;
                                    }
                                case 114:
                                    if (!z2 || !true) {
                                        this.extProto_ = new ArrayList();
                                        z2 |= true;
                                    }
                                    this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    break;
                                case 122:
                                    Struct.Builder builder2 = this.ext_ != null ? this.ext_.toBuilder() : null;
                                    Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                    this.ext_ = struct;
                                    if (builder2 == null) {
                                        break;
                                    } else {
                                        builder2.mergeFrom(struct);
                                        this.ext_ = builder2.buildPartial();
                                        break;
                                    }
                                default:
                                    if (parseUnknownField(codedInputStream, newBuilder, extensionRegistryLite, readTag)) {
                                        break;
                                    }
                                    z = true;
                                    break;
                            }
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.setUnfinishedMessage(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
                        } catch (Throwable th) {
                            if (z2 && true) {
                                this.macro_ = Collections.unmodifiableList(this.macro_);
                            }
                            if (z2 && true) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            }
                            this.unknownFields = newBuilder.build();
                            makeExtensionsImmutable();
                            throw th;
                        }
                    }
                    if (z2 && true) {
                        this.macro_ = Collections.unmodifiableList(this.macro_);
                    }
                    if (z2 && true) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    }
                    this.unknownFields = newBuilder.build();
                    makeExtensionsImmutable();
                    return;
                }
                throw null;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_fieldAccessorTable.ensureFieldAccessorsInitialized(Bid.class, Builder.class);
            }

            public static final class Macro extends GeneratedMessageV3 implements MacroOrBuilder {
                private static final Macro DEFAULT_INSTANCE = new Macro();
                public static final int EXT_FIELD_NUMBER = 4;
                public static final int EXT_PROTO_FIELD_NUMBER = 3;
                public static final int KEY_FIELD_NUMBER = 1;
                /* access modifiers changed from: private */
                public static final Parser<Macro> PARSER = new AbstractParser<Macro>() {
                    public Macro parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Macro(codedInputStream, extensionRegistryLite);
                    }
                };
                public static final int VALUE_FIELD_NUMBER = 2;
                private static final long serialVersionUID = 0;
                /* access modifiers changed from: private */
                public List<Any> extProto_;
                /* access modifiers changed from: private */
                public Struct ext_;
                /* access modifiers changed from: private */
                public volatile Object key_;
                private byte memoizedIsInitialized;
                /* access modifiers changed from: private */
                public volatile Object value_;

                private Macro(GeneratedMessageV3.Builder<?> builder) {
                    super(builder);
                    this.memoizedIsInitialized = -1;
                }

                private Macro() {
                    this.memoizedIsInitialized = -1;
                    this.key_ = "";
                    this.value_ = "";
                    this.extProto_ = Collections.emptyList();
                }

                /* access modifiers changed from: protected */
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Macro();
                }

                public final UnknownFieldSet getUnknownFields() {
                    return this.unknownFields;
                }

                private Macro(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.key_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 18) {
                                        this.value_ = codedInputStream.readStringRequireUtf8();
                                    } else if (readTag == 26) {
                                        if (!z2 || !true) {
                                            this.extProto_ = new ArrayList();
                                            z2 |= true;
                                        }
                                        this.extProto_.add(codedInputStream.readMessage(Any.parser(), extensionRegistryLite));
                                    } else if (readTag == 34) {
                                        Struct.Builder builder = this.ext_ != null ? this.ext_.toBuilder() : null;
                                        Struct struct = (Struct) codedInputStream.readMessage(Struct.parser(), extensionRegistryLite);
                                        this.ext_ = struct;
                                        if (builder != null) {
                                            builder.mergeFrom(struct);
                                            this.ext_ = builder.buildPartial();
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
                                if (z2 && true) {
                                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                }
                                this.unknownFields = newBuilder.build();
                                makeExtensionsImmutable();
                                throw th;
                            }
                        }
                        if (z2 && true) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        }
                        this.unknownFields = newBuilder.build();
                        makeExtensionsImmutable();
                        return;
                    }
                    throw null;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_Macro_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_Macro_fieldAccessorTable.ensureFieldAccessorsInitialized(Macro.class, Builder.class);
                }

                public String getKey() {
                    Object obj = this.key_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.key_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getKeyBytes() {
                    Object obj = this.key_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.key_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.value_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public boolean hasExt() {
                    return this.ext_ != null;
                }

                public Struct getExt() {
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public StructOrBuilder getExtOrBuilder() {
                    return getExt();
                }

                public List<Any> getExtProtoList() {
                    return this.extProto_;
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    return this.extProto_;
                }

                public int getExtProtoCount() {
                    return this.extProto_.size();
                }

                public Any getExtProto(int i) {
                    return this.extProto_.get(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    return this.extProto_.get(i);
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
                    if (!getKeyBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.key_);
                    }
                    if (!getValueBytes().isEmpty()) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
                    }
                    for (int i = 0; i < this.extProto_.size(); i++) {
                        codedOutputStream.writeMessage(3, this.extProto_.get(i));
                    }
                    if (this.ext_ != null) {
                        codedOutputStream.writeMessage(4, getExt());
                    }
                    this.unknownFields.writeTo(codedOutputStream);
                }

                public int getSerializedSize() {
                    int i = this.memoizedSize;
                    if (i != -1) {
                        return i;
                    }
                    int computeStringSize = !getKeyBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.key_) + 0 : 0;
                    if (!getValueBytes().isEmpty()) {
                        computeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
                    }
                    for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                        computeStringSize += CodedOutputStream.computeMessageSize(3, this.extProto_.get(i2));
                    }
                    if (this.ext_ != null) {
                        computeStringSize += CodedOutputStream.computeMessageSize(4, getExt());
                    }
                    int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Macro)) {
                        return super.equals(obj);
                    }
                    Macro macro = (Macro) obj;
                    if (!getKey().equals(macro.getKey()) || !getValue().equals(macro.getValue()) || hasExt() != macro.hasExt()) {
                        return false;
                    }
                    if ((!hasExt() || getExt().equals(macro.getExt())) && getExtProtoList().equals(macro.getExtProtoList()) && this.unknownFields.equals(macro.unknownFields)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    if (this.memoizedHashCode != 0) {
                        return this.memoizedHashCode;
                    }
                    int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getKey().hashCode()) * 37) + 2) * 53) + getValue().hashCode();
                    if (hasExt()) {
                        hashCode = (((hashCode * 37) + 4) * 53) + getExt().hashCode();
                    }
                    if (getExtProtoCount() > 0) {
                        hashCode = (((hashCode * 37) + 3) * 53) + getExtProtoList().hashCode();
                    }
                    int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                    this.memoizedHashCode = hashCode2;
                    return hashCode2;
                }

                public static Macro parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer);
                }

                public static Macro parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
                }

                public static Macro parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString);
                }

                public static Macro parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(byteString, extensionRegistryLite);
                }

                public static Macro parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr);
                }

                public static Macro parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return PARSER.parseFrom(bArr, extensionRegistryLite);
                }

                public static Macro parseFrom(InputStream inputStream) throws IOException {
                    return (Macro) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
                }

                public static Macro parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Macro) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Macro parseDelimitedFrom(InputStream inputStream) throws IOException {
                    return (Macro) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
                }

                public static Macro parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Macro) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
                }

                public static Macro parseFrom(CodedInputStream codedInputStream) throws IOException {
                    return (Macro) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
                }

                public static Macro parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                    return (Macro) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
                }

                public Builder newBuilderForType() {
                    return newBuilder();
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.toBuilder();
                }

                public static Builder newBuilder(Macro macro) {
                    return DEFAULT_INSTANCE.toBuilder().mergeFrom(macro);
                }

                public Builder toBuilder() {
                    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
                }

                /* access modifiers changed from: protected */
                public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new Builder(builderParent);
                }

                public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MacroOrBuilder {
                    private int bitField0_;
                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                    private List<Any> extProto_;
                    private Struct ext_;
                    private Object key_;
                    private Object value_;

                    public final boolean isInitialized() {
                        return true;
                    }

                    public static final Descriptors.Descriptor getDescriptor() {
                        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_Macro_descriptor;
                    }

                    /* access modifiers changed from: protected */
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_Macro_fieldAccessorTable.ensureFieldAccessorsInitialized(Macro.class, Builder.class);
                    }

                    private Builder() {
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.key_ = "";
                        this.value_ = "";
                        this.extProto_ = Collections.emptyList();
                        maybeForceBuilderInitialization();
                    }

                    private void maybeForceBuilderInitialization() {
                        if (Macro.alwaysUseFieldBuilders) {
                            getExtProtoFieldBuilder();
                        }
                    }

                    public Builder clear() {
                        super.clear();
                        this.key_ = "";
                        this.value_ = "";
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    public Descriptors.Descriptor getDescriptorForType() {
                        return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_Macro_descriptor;
                    }

                    public Macro getDefaultInstanceForType() {
                        return Macro.getDefaultInstance();
                    }

                    public Macro build() {
                        Macro buildPartial = buildPartial();
                        if (buildPartial.isInitialized()) {
                            return buildPartial;
                        }
                        throw newUninitializedMessageException(buildPartial);
                    }

                    public Macro buildPartial() {
                        Macro macro = new Macro((GeneratedMessageV3.Builder) this);
                        Object unused = macro.key_ = this.key_;
                        Object unused2 = macro.value_ = this.value_;
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            Struct unused3 = macro.ext_ = this.ext_;
                        } else {
                            Struct unused4 = macro.ext_ = singleFieldBuilderV3.build();
                        }
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            if ((this.bitField0_ & 1) != 0) {
                                this.extProto_ = Collections.unmodifiableList(this.extProto_);
                                this.bitField0_ &= -2;
                            }
                            List unused5 = macro.extProto_ = this.extProto_;
                        } else {
                            List unused6 = macro.extProto_ = repeatedFieldBuilderV3.build();
                        }
                        onBuilt();
                        return macro;
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
                        if (message instanceof Macro) {
                            return mergeFrom((Macro) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public Builder mergeFrom(Macro macro) {
                        if (macro == Macro.getDefaultInstance()) {
                            return this;
                        }
                        if (!macro.getKey().isEmpty()) {
                            this.key_ = macro.key_;
                            onChanged();
                        }
                        if (!macro.getValue().isEmpty()) {
                            this.value_ = macro.value_;
                            onChanged();
                        }
                        if (macro.hasExt()) {
                            mergeExt(macro.getExt());
                        }
                        if (this.extProtoBuilder_ == null) {
                            if (!macro.extProto_.isEmpty()) {
                                if (this.extProto_.isEmpty()) {
                                    this.extProto_ = macro.extProto_;
                                    this.bitField0_ &= -2;
                                } else {
                                    ensureExtProtoIsMutable();
                                    this.extProto_.addAll(macro.extProto_);
                                }
                                onChanged();
                            }
                        } else if (!macro.extProto_.isEmpty()) {
                            if (this.extProtoBuilder_.isEmpty()) {
                                this.extProtoBuilder_.dispose();
                                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                                this.extProtoBuilder_ = null;
                                this.extProto_ = macro.extProto_;
                                this.bitField0_ &= -2;
                                if (Macro.alwaysUseFieldBuilders) {
                                    repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                                }
                                this.extProtoBuilder_ = repeatedFieldBuilderV3;
                            } else {
                                this.extProtoBuilder_.addAllMessages(macro.extProto_);
                            }
                        }
                        mergeUnknownFields(macro.unknownFields);
                        onChanged();
                        return this;
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                        /*
                            r2 = this;
                            r0 = 0
                            com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                            if (r3 == 0) goto L_0x0010
                            r2.mergeFrom((com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r3)
                        L_0x0010:
                            return r2
                        L_0x0011:
                            r3 = move-exception
                            goto L_0x0021
                        L_0x0013:
                            r3 = move-exception
                            com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                            com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r4     // Catch:{ all -> 0x0011 }
                            java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                            throw r3     // Catch:{ all -> 0x001f }
                        L_0x001f:
                            r3 = move-exception
                            r0 = r4
                        L_0x0021:
                            if (r0 == 0) goto L_0x0026
                            r2.mergeFrom((com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro) r0)
                        L_0x0026:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Macro.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Macro$Builder");
                    }

                    public String getKey() {
                        Object obj = this.key_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.key_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getKeyBytes() {
                        Object obj = this.key_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.key_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setKey(String str) {
                        if (str != null) {
                            this.key_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearKey() {
                        this.key_ = Macro.getDefaultInstance().getKey();
                        onChanged();
                        return this;
                    }

                    public Builder setKeyBytes(ByteString byteString) {
                        if (byteString != null) {
                            Macro.checkByteStringIsUtf8(byteString);
                            this.key_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public String getValue() {
                        Object obj = this.value_;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.value_ = stringUtf8;
                        return stringUtf8;
                    }

                    public ByteString getValueBytes() {
                        Object obj = this.value_;
                        if (!(obj instanceof String)) {
                            return (ByteString) obj;
                        }
                        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                        this.value_ = copyFromUtf8;
                        return copyFromUtf8;
                    }

                    public Builder setValue(String str) {
                        if (str != null) {
                            this.value_ = str;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public Builder clearValue() {
                        this.value_ = Macro.getDefaultInstance().getValue();
                        onChanged();
                        return this;
                    }

                    public Builder setValueBytes(ByteString byteString) {
                        if (byteString != null) {
                            Macro.checkByteStringIsUtf8(byteString);
                            this.value_ = byteString;
                            onChanged();
                            return this;
                        }
                        throw null;
                    }

                    public boolean hasExt() {
                        return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                    }

                    public Struct getExt() {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessage();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    public Builder setExt(Struct struct) {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.setMessage(struct);
                        } else if (struct != null) {
                            this.ext_ = struct;
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setExt(Struct.Builder builder) {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            this.ext_ = builder.build();
                            onChanged();
                        } else {
                            singleFieldBuilderV3.setMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder mergeExt(Struct struct) {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 == null) {
                            Struct struct2 = this.ext_;
                            if (struct2 != null) {
                                this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                            } else {
                                this.ext_ = struct;
                            }
                            onChanged();
                        } else {
                            singleFieldBuilderV3.mergeFrom(struct);
                        }
                        return this;
                    }

                    public Builder clearExt() {
                        if (this.extBuilder_ == null) {
                            this.ext_ = null;
                            onChanged();
                        } else {
                            this.ext_ = null;
                            this.extBuilder_ = null;
                        }
                        return this;
                    }

                    public Struct.Builder getExtBuilder() {
                        onChanged();
                        return getExtFieldBuilder().getBuilder();
                    }

                    public StructOrBuilder getExtOrBuilder() {
                        SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                        if (singleFieldBuilderV3 != null) {
                            return singleFieldBuilderV3.getMessageOrBuilder();
                        }
                        Struct struct = this.ext_;
                        return struct == null ? Struct.getDefaultInstance() : struct;
                    }

                    private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                        if (this.extBuilder_ == null) {
                            this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                            this.ext_ = null;
                        }
                        return this.extBuilder_;
                    }

                    private void ensureExtProtoIsMutable() {
                        if ((this.bitField0_ & 1) == 0) {
                            this.extProto_ = new ArrayList(this.extProto_);
                            this.bitField0_ |= 1;
                        }
                    }

                    public List<Any> getExtProtoList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return Collections.unmodifiableList(this.extProto_);
                        }
                        return repeatedFieldBuilderV3.getMessageList();
                    }

                    public int getExtProtoCount() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.size();
                        }
                        return repeatedFieldBuilderV3.getCount();
                    }

                    public Any getExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessage(i);
                    }

                    public Builder setExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.setMessage(i, any);
                        } else if (any != null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, any);
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder setExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.set(i, builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.setMessage(i, builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(any);
                        } else if (any != null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(any);
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder addExtProto(int i, Any any) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(i, any);
                        } else if (any != null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, any);
                            onChanged();
                        } else {
                            throw null;
                        }
                        return this;
                    }

                    public Builder addExtProto(Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(builder.build());
                        }
                        return this;
                    }

                    public Builder addExtProto(int i, Any.Builder builder) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.add(i, builder.build());
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addMessage(i, builder.build());
                        }
                        return this;
                    }

                    public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                        }
                        return this;
                    }

                    public Builder clearExtProto() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            this.extProto_ = Collections.emptyList();
                            this.bitField0_ &= -2;
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.clear();
                        }
                        return this;
                    }

                    public Builder removeExtProto(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            ensureExtProtoIsMutable();
                            this.extProto_.remove(i);
                            onChanged();
                        } else {
                            repeatedFieldBuilderV3.remove(i);
                        }
                        return this;
                    }

                    public Any.Builder getExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().getBuilder(i);
                    }

                    public AnyOrBuilder getExtProtoOrBuilder(int i) {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 == null) {
                            return this.extProto_.get(i);
                        }
                        return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                    }

                    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                        RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                        if (repeatedFieldBuilderV3 != null) {
                            return repeatedFieldBuilderV3.getMessageOrBuilderList();
                        }
                        return Collections.unmodifiableList(this.extProto_);
                    }

                    public Any.Builder addExtProtoBuilder() {
                        return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                    }

                    public Any.Builder addExtProtoBuilder(int i) {
                        return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                    }

                    public List<Any.Builder> getExtProtoBuilderList() {
                        return getExtProtoFieldBuilder().getBuilderList();
                    }

                    private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                        if (this.extProtoBuilder_ == null) {
                            List<Any> list = this.extProto_;
                            boolean z = true;
                            if ((this.bitField0_ & 1) == 0) {
                                z = false;
                            }
                            this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                            this.extProto_ = null;
                        }
                        return this.extProtoBuilder_;
                    }

                    public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.setUnknownFields(unknownFieldSet);
                    }

                    public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (Builder) super.mergeUnknownFields(unknownFieldSet);
                    }
                }

                public static Macro getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<Macro> parser() {
                    return PARSER;
                }

                public Parser<Macro> getParserForType() {
                    return PARSER;
                }

                public Macro getDefaultInstanceForType() {
                    return DEFAULT_INSTANCE;
                }
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

            public String getItem() {
                Object obj = this.item_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.item_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getItemBytes() {
                Object obj = this.item_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.item_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public double getPrice() {
                return this.price_;
            }

            public String getDeal() {
                Object obj = this.deal_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.deal_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getDealBytes() {
                Object obj = this.deal_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deal_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getCid() {
                Object obj = this.cid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.cid_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getCidBytes() {
                Object obj = this.cid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.cid_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getTactic() {
                Object obj = this.tactic_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.tactic_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getTacticBytes() {
                Object obj = this.tactic_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tactic_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getPurl() {
                Object obj = this.purl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.purl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getPurlBytes() {
                Object obj = this.purl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.purl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getBurl() {
                Object obj = this.burl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.burl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getBurlBytes() {
                Object obj = this.burl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.burl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public String getLurl() {
                Object obj = this.lurl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.lurl_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getLurlBytes() {
                Object obj = this.lurl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lurl_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public int getExp() {
                return this.exp_;
            }

            public String getMid() {
                Object obj = this.mid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.mid_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getMidBytes() {
                Object obj = this.mid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mid_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public List<Macro> getMacroList() {
                return this.macro_;
            }

            public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                return this.macro_;
            }

            public int getMacroCount() {
                return this.macro_.size();
            }

            public Macro getMacro(int i) {
                return this.macro_.get(i);
            }

            public MacroOrBuilder getMacroOrBuilder(int i) {
                return this.macro_.get(i);
            }

            public boolean hasMedia() {
                return this.media_ != null;
            }

            public Any getMedia() {
                Any any = this.media_;
                return any == null ? Any.getDefaultInstance() : any;
            }

            public AnyOrBuilder getMediaOrBuilder() {
                return getMedia();
            }

            public boolean hasExt() {
                return this.ext_ != null;
            }

            public Struct getExt() {
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public StructOrBuilder getExtOrBuilder() {
                return getExt();
            }

            public List<Any> getExtProtoList() {
                return this.extProto_;
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                return this.extProto_;
            }

            public int getExtProtoCount() {
                return this.extProto_.size();
            }

            public Any getExtProto(int i) {
                return this.extProto_.get(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                return this.extProto_.get(i);
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
                if (!getIdBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
                }
                if (!getItemBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.item_);
                }
                double d2 = this.price_;
                if (d2 != 0.0d) {
                    codedOutputStream.writeDouble(3, d2);
                }
                if (!getDealBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 9, this.lurl_);
                }
                int i = this.exp_;
                if (i != 0) {
                    codedOutputStream.writeUInt32(10, i);
                }
                if (!getMidBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 11, this.mid_);
                }
                for (int i2 = 0; i2 < this.macro_.size(); i2++) {
                    codedOutputStream.writeMessage(12, this.macro_.get(i2));
                }
                if (this.media_ != null) {
                    codedOutputStream.writeMessage(13, getMedia());
                }
                for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                    codedOutputStream.writeMessage(14, this.extProto_.get(i3));
                }
                if (this.ext_ != null) {
                    codedOutputStream.writeMessage(15, getExt());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public int getSerializedSize() {
                int i = this.memoizedSize;
                if (i != -1) {
                    return i;
                }
                int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
                if (!getItemBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(2, this.item_);
                }
                double d2 = this.price_;
                if (d2 != 0.0d) {
                    computeStringSize += CodedOutputStream.computeDoubleSize(3, d2);
                }
                if (!getDealBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(4, this.deal_);
                }
                if (!getCidBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(5, this.cid_);
                }
                if (!getTacticBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(6, this.tactic_);
                }
                if (!getPurlBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(7, this.purl_);
                }
                if (!getBurlBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(8, this.burl_);
                }
                if (!getLurlBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(9, this.lurl_);
                }
                int i2 = this.exp_;
                if (i2 != 0) {
                    computeStringSize += CodedOutputStream.computeUInt32Size(10, i2);
                }
                if (!getMidBytes().isEmpty()) {
                    computeStringSize += GeneratedMessageV3.computeStringSize(11, this.mid_);
                }
                for (int i3 = 0; i3 < this.macro_.size(); i3++) {
                    computeStringSize += CodedOutputStream.computeMessageSize(12, this.macro_.get(i3));
                }
                if (this.media_ != null) {
                    computeStringSize += CodedOutputStream.computeMessageSize(13, getMedia());
                }
                for (int i4 = 0; i4 < this.extProto_.size(); i4++) {
                    computeStringSize += CodedOutputStream.computeMessageSize(14, this.extProto_.get(i4));
                }
                if (this.ext_ != null) {
                    computeStringSize += CodedOutputStream.computeMessageSize(15, getExt());
                }
                int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Bid)) {
                    return super.equals(obj);
                }
                Bid bid = (Bid) obj;
                if (!getId().equals(bid.getId()) || !getItem().equals(bid.getItem()) || Double.doubleToLongBits(getPrice()) != Double.doubleToLongBits(bid.getPrice()) || !getDeal().equals(bid.getDeal()) || !getCid().equals(bid.getCid()) || !getTactic().equals(bid.getTactic()) || !getPurl().equals(bid.getPurl()) || !getBurl().equals(bid.getBurl()) || !getLurl().equals(bid.getLurl()) || getExp() != bid.getExp() || !getMid().equals(bid.getMid()) || !getMacroList().equals(bid.getMacroList()) || hasMedia() != bid.hasMedia()) {
                    return false;
                }
                if ((hasMedia() && !getMedia().equals(bid.getMedia())) || hasExt() != bid.hasExt()) {
                    return false;
                }
                if ((!hasExt() || getExt().equals(bid.getExt())) && getExtProtoList().equals(bid.getExtProtoList()) && this.unknownFields.equals(bid.unknownFields)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                if (this.memoizedHashCode != 0) {
                    return this.memoizedHashCode;
                }
                int hashCode = ((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getItem().hashCode()) * 37) + 3) * 53) + Internal.hashLong(Double.doubleToLongBits(getPrice()))) * 37) + 4) * 53) + getDeal().hashCode()) * 37) + 5) * 53) + getCid().hashCode()) * 37) + 6) * 53) + getTactic().hashCode()) * 37) + 7) * 53) + getPurl().hashCode()) * 37) + 8) * 53) + getBurl().hashCode()) * 37) + 9) * 53) + getLurl().hashCode()) * 37) + 10) * 53) + getExp()) * 37) + 11) * 53) + getMid().hashCode();
                if (getMacroCount() > 0) {
                    hashCode = (((hashCode * 37) + 12) * 53) + getMacroList().hashCode();
                }
                if (hasMedia()) {
                    hashCode = (((hashCode * 37) + 13) * 53) + getMedia().hashCode();
                }
                if (hasExt()) {
                    hashCode = (((hashCode * 37) + 15) * 53) + getExt().hashCode();
                }
                if (getExtProtoCount() > 0) {
                    hashCode = (((hashCode * 37) + 14) * 53) + getExtProtoList().hashCode();
                }
                int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = hashCode2;
                return hashCode2;
            }

            public static Bid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Bid parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Bid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            public static Bid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Bid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            public static Bid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Bid parseFrom(InputStream inputStream) throws IOException {
                return (Bid) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Bid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Bid) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Bid parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Bid) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Bid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Bid) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Bid parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Bid) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Bid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Bid) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Bid bid) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(bid);
            }

            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            /* access modifiers changed from: protected */
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BidOrBuilder {
                private int bitField0_;
                private Object burl_;
                private Object cid_;
                private Object deal_;
                private int exp_;
                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
                private List<Any> extProto_;
                private Struct ext_;
                private Object id_;
                private Object item_;
                private Object lurl_;
                private RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> macroBuilder_;
                private List<Macro> macro_;
                private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> mediaBuilder_;
                private Any media_;
                private Object mid_;
                private double price_;
                private Object purl_;
                private Object tactic_;

                public final boolean isInitialized() {
                    return true;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_descriptor;
                }

                /* access modifiers changed from: protected */
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_fieldAccessorTable.ensureFieldAccessorsInitialized(Bid.class, Builder.class);
                }

                private Builder() {
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    this.macro_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.id_ = "";
                    this.item_ = "";
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.mid_ = "";
                    this.macro_ = Collections.emptyList();
                    this.extProto_ = Collections.emptyList();
                    maybeForceBuilderInitialization();
                }

                private void maybeForceBuilderInitialization() {
                    if (Bid.alwaysUseFieldBuilders) {
                        getMacroFieldBuilder();
                        getExtProtoFieldBuilder();
                    }
                }

                public Builder clear() {
                    super.clear();
                    this.id_ = "";
                    this.item_ = "";
                    this.price_ = 0.0d;
                    this.deal_ = "";
                    this.cid_ = "";
                    this.tactic_ = "";
                    this.purl_ = "";
                    this.burl_ = "";
                    this.lurl_ = "";
                    this.exp_ = 0;
                    this.mid_ = "";
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.macro_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                    } else {
                        this.media_ = null;
                        this.mediaBuilder_ = null;
                    }
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                    } else {
                        repeatedFieldBuilderV32.clear();
                    }
                    return this;
                }

                public Descriptors.Descriptor getDescriptorForType() {
                    return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_Bid_descriptor;
                }

                public Bid getDefaultInstanceForType() {
                    return Bid.getDefaultInstance();
                }

                public Bid build() {
                    Bid buildPartial = buildPartial();
                    if (buildPartial.isInitialized()) {
                        return buildPartial;
                    }
                    throw newUninitializedMessageException(buildPartial);
                }

                public Bid buildPartial() {
                    Bid bid = new Bid((GeneratedMessageV3.Builder) this);
                    Object unused = bid.id_ = this.id_;
                    Object unused2 = bid.item_ = this.item_;
                    double unused3 = bid.price_ = this.price_;
                    Object unused4 = bid.deal_ = this.deal_;
                    Object unused5 = bid.cid_ = this.cid_;
                    Object unused6 = bid.tactic_ = this.tactic_;
                    Object unused7 = bid.purl_ = this.purl_;
                    Object unused8 = bid.burl_ = this.burl_;
                    Object unused9 = bid.lurl_ = this.lurl_;
                    int unused10 = bid.exp_ = this.exp_;
                    Object unused11 = bid.mid_ = this.mid_;
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        if ((this.bitField0_ & 1) != 0) {
                            this.macro_ = Collections.unmodifiableList(this.macro_);
                            this.bitField0_ &= -2;
                        }
                        List unused12 = bid.macro_ = this.macro_;
                    } else {
                        List unused13 = bid.macro_ = repeatedFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Any unused14 = bid.media_ = this.media_;
                    } else {
                        Any unused15 = bid.media_ = singleFieldBuilderV3.build();
                    }
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV32 = this.extBuilder_;
                    if (singleFieldBuilderV32 == null) {
                        Struct unused16 = bid.ext_ = this.ext_;
                    } else {
                        Struct unused17 = bid.ext_ = singleFieldBuilderV32.build();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV32 == null) {
                        if ((this.bitField0_ & 2) != 0) {
                            this.extProto_ = Collections.unmodifiableList(this.extProto_);
                            this.bitField0_ &= -3;
                        }
                        List unused18 = bid.extProto_ = this.extProto_;
                    } else {
                        List unused19 = bid.extProto_ = repeatedFieldBuilderV32.build();
                    }
                    onBuilt();
                    return bid;
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
                    if (message instanceof Bid) {
                        return mergeFrom((Bid) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Bid bid) {
                    if (bid == Bid.getDefaultInstance()) {
                        return this;
                    }
                    if (!bid.getId().isEmpty()) {
                        this.id_ = bid.id_;
                        onChanged();
                    }
                    if (!bid.getItem().isEmpty()) {
                        this.item_ = bid.item_;
                        onChanged();
                    }
                    if (bid.getPrice() != 0.0d) {
                        setPrice(bid.getPrice());
                    }
                    if (!bid.getDeal().isEmpty()) {
                        this.deal_ = bid.deal_;
                        onChanged();
                    }
                    if (!bid.getCid().isEmpty()) {
                        this.cid_ = bid.cid_;
                        onChanged();
                    }
                    if (!bid.getTactic().isEmpty()) {
                        this.tactic_ = bid.tactic_;
                        onChanged();
                    }
                    if (!bid.getPurl().isEmpty()) {
                        this.purl_ = bid.purl_;
                        onChanged();
                    }
                    if (!bid.getBurl().isEmpty()) {
                        this.burl_ = bid.burl_;
                        onChanged();
                    }
                    if (!bid.getLurl().isEmpty()) {
                        this.lurl_ = bid.lurl_;
                        onChanged();
                    }
                    if (bid.getExp() != 0) {
                        setExp(bid.getExp());
                    }
                    if (!bid.getMid().isEmpty()) {
                        this.mid_ = bid.mid_;
                        onChanged();
                    }
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                    if (this.macroBuilder_ == null) {
                        if (!bid.macro_.isEmpty()) {
                            if (this.macro_.isEmpty()) {
                                this.macro_ = bid.macro_;
                                this.bitField0_ &= -2;
                            } else {
                                ensureMacroIsMutable();
                                this.macro_.addAll(bid.macro_);
                            }
                            onChanged();
                        }
                    } else if (!bid.macro_.isEmpty()) {
                        if (this.macroBuilder_.isEmpty()) {
                            this.macroBuilder_.dispose();
                            this.macroBuilder_ = null;
                            this.macro_ = bid.macro_;
                            this.bitField0_ &= -2;
                            this.macroBuilder_ = Bid.alwaysUseFieldBuilders ? getMacroFieldBuilder() : null;
                        } else {
                            this.macroBuilder_.addAllMessages(bid.macro_);
                        }
                    }
                    if (bid.hasMedia()) {
                        mergeMedia(bid.getMedia());
                    }
                    if (bid.hasExt()) {
                        mergeExt(bid.getExt());
                    }
                    if (this.extProtoBuilder_ == null) {
                        if (!bid.extProto_.isEmpty()) {
                            if (this.extProto_.isEmpty()) {
                                this.extProto_ = bid.extProto_;
                                this.bitField0_ &= -3;
                            } else {
                                ensureExtProtoIsMutable();
                                this.extProto_.addAll(bid.extProto_);
                            }
                            onChanged();
                        }
                    } else if (!bid.extProto_.isEmpty()) {
                        if (this.extProtoBuilder_.isEmpty()) {
                            this.extProtoBuilder_.dispose();
                            this.extProtoBuilder_ = null;
                            this.extProto_ = bid.extProto_;
                            this.bitField0_ &= -3;
                            if (Bid.alwaysUseFieldBuilders) {
                                repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                            }
                            this.extProtoBuilder_ = repeatedFieldBuilderV3;
                        } else {
                            this.extProtoBuilder_.addAllMessages(bid.extProto_);
                        }
                    }
                    mergeUnknownFields(bid.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                    /*
                        r2 = this;
                        r0 = 0
                        com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        com.explorestack.protobuf.openrtb.Response$Seatbid$Bid r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                        if (r3 == 0) goto L_0x0010
                        r2.mergeFrom((com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r3)
                    L_0x0010:
                        return r2
                    L_0x0011:
                        r3 = move-exception
                        goto L_0x0021
                    L_0x0013:
                        r3 = move-exception
                        com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                        com.explorestack.protobuf.openrtb.Response$Seatbid$Bid r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r4     // Catch:{ all -> 0x0011 }
                        java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                        throw r3     // Catch:{ all -> 0x001f }
                    L_0x001f:
                        r3 = move-exception
                        r0 = r4
                    L_0x0021:
                        if (r0 == 0) goto L_0x0026
                        r2.mergeFrom((com.explorestack.protobuf.openrtb.Response.Seatbid.Bid) r0)
                    L_0x0026:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Bid.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Response$Seatbid$Bid$Builder");
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
                    this.id_ = Bid.getDefaultInstance().getId();
                    onChanged();
                    return this;
                }

                public Builder setIdBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.id_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getItem() {
                    Object obj = this.item_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.item_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getItemBytes() {
                    Object obj = this.item_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.item_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setItem(String str) {
                    if (str != null) {
                        this.item_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearItem() {
                    this.item_ = Bid.getDefaultInstance().getItem();
                    onChanged();
                    return this;
                }

                public Builder setItemBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.item_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public double getPrice() {
                    return this.price_;
                }

                public Builder setPrice(double d2) {
                    this.price_ = d2;
                    onChanged();
                    return this;
                }

                public Builder clearPrice() {
                    this.price_ = 0.0d;
                    onChanged();
                    return this;
                }

                public String getDeal() {
                    Object obj = this.deal_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.deal_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getDealBytes() {
                    Object obj = this.deal_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.deal_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setDeal(String str) {
                    if (str != null) {
                        this.deal_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearDeal() {
                    this.deal_ = Bid.getDefaultInstance().getDeal();
                    onChanged();
                    return this;
                }

                public Builder setDealBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.deal_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getCid() {
                    Object obj = this.cid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.cid_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getCidBytes() {
                    Object obj = this.cid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.cid_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setCid(String str) {
                    if (str != null) {
                        this.cid_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearCid() {
                    this.cid_ = Bid.getDefaultInstance().getCid();
                    onChanged();
                    return this;
                }

                public Builder setCidBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.cid_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getTactic() {
                    Object obj = this.tactic_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.tactic_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getTacticBytes() {
                    Object obj = this.tactic_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.tactic_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setTactic(String str) {
                    if (str != null) {
                        this.tactic_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearTactic() {
                    this.tactic_ = Bid.getDefaultInstance().getTactic();
                    onChanged();
                    return this;
                }

                public Builder setTacticBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.tactic_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getPurl() {
                    Object obj = this.purl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.purl_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getPurlBytes() {
                    Object obj = this.purl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.purl_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setPurl(String str) {
                    if (str != null) {
                        this.purl_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearPurl() {
                    this.purl_ = Bid.getDefaultInstance().getPurl();
                    onChanged();
                    return this;
                }

                public Builder setPurlBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.purl_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getBurl() {
                    Object obj = this.burl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.burl_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getBurlBytes() {
                    Object obj = this.burl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.burl_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setBurl(String str) {
                    if (str != null) {
                        this.burl_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearBurl() {
                    this.burl_ = Bid.getDefaultInstance().getBurl();
                    onChanged();
                    return this;
                }

                public Builder setBurlBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.burl_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public String getLurl() {
                    Object obj = this.lurl_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.lurl_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getLurlBytes() {
                    Object obj = this.lurl_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.lurl_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setLurl(String str) {
                    if (str != null) {
                        this.lurl_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearLurl() {
                    this.lurl_ = Bid.getDefaultInstance().getLurl();
                    onChanged();
                    return this;
                }

                public Builder setLurlBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.lurl_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public int getExp() {
                    return this.exp_;
                }

                public Builder setExp(int i) {
                    this.exp_ = i;
                    onChanged();
                    return this;
                }

                public Builder clearExp() {
                    this.exp_ = 0;
                    onChanged();
                    return this;
                }

                public String getMid() {
                    Object obj = this.mid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.mid_ = stringUtf8;
                    return stringUtf8;
                }

                public ByteString getMidBytes() {
                    Object obj = this.mid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.mid_ = copyFromUtf8;
                    return copyFromUtf8;
                }

                public Builder setMid(String str) {
                    if (str != null) {
                        this.mid_ = str;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                public Builder clearMid() {
                    this.mid_ = Bid.getDefaultInstance().getMid();
                    onChanged();
                    return this;
                }

                public Builder setMidBytes(ByteString byteString) {
                    if (byteString != null) {
                        Bid.checkByteStringIsUtf8(byteString);
                        this.mid_ = byteString;
                        onChanged();
                        return this;
                    }
                    throw null;
                }

                private void ensureMacroIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.macro_ = new ArrayList(this.macro_);
                        this.bitField0_ |= 1;
                    }
                }

                public List<Macro> getMacroList() {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.macro_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getMacroCount() {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.macro_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Macro getMacro(int i) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.macro_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setMacro(int i, Macro macro) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, macro);
                    } else if (macro != null) {
                        ensureMacroIsMutable();
                        this.macro_.set(i, macro);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setMacro(int i, Macro.Builder builder) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMacroIsMutable();
                        this.macro_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addMacro(Macro macro) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(macro);
                    } else if (macro != null) {
                        ensureMacroIsMutable();
                        this.macro_.add(macro);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addMacro(int i, Macro macro) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, macro);
                    } else if (macro != null) {
                        ensureMacroIsMutable();
                        this.macro_.add(i, macro);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addMacro(Macro.Builder builder) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addMacro(int i, Macro.Builder builder) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMacroIsMutable();
                        this.macro_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllMacro(Iterable<? extends Macro> iterable) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMacroIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.macro_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearMacro() {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.macro_ = Collections.emptyList();
                        this.bitField0_ &= -2;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeMacro(int i) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureMacroIsMutable();
                        this.macro_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Macro.Builder getMacroBuilder(int i) {
                    return getMacroFieldBuilder().getBuilder(i);
                }

                public MacroOrBuilder getMacroOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.macro_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends MacroOrBuilder> getMacroOrBuilderList() {
                    RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> repeatedFieldBuilderV3 = this.macroBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.macro_);
                }

                public Macro.Builder addMacroBuilder() {
                    return getMacroFieldBuilder().addBuilder(Macro.getDefaultInstance());
                }

                public Macro.Builder addMacroBuilder(int i) {
                    return getMacroFieldBuilder().addBuilder(i, Macro.getDefaultInstance());
                }

                public List<Macro.Builder> getMacroBuilderList() {
                    return getMacroFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Macro, Macro.Builder, MacroOrBuilder> getMacroFieldBuilder() {
                    if (this.macroBuilder_ == null) {
                        List<Macro> list = this.macro_;
                        boolean z = true;
                        if ((this.bitField0_ & 1) == 0) {
                            z = false;
                        }
                        this.macroBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                        this.macro_ = null;
                    }
                    return this.macroBuilder_;
                }

                public boolean hasMedia() {
                    return (this.mediaBuilder_ == null && this.media_ == null) ? false : true;
                }

                public Any getMedia() {
                    SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                public Builder setMedia(Any any) {
                    SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(any);
                    } else if (any != null) {
                        this.media_ = any;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setMedia(Any.Builder builder) {
                    SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.media_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeMedia(Any any) {
                    SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Any any2 = this.media_;
                        if (any2 != null) {
                            this.media_ = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                        } else {
                            this.media_ = any;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(any);
                    }
                    return this;
                }

                public Builder clearMedia() {
                    if (this.mediaBuilder_ == null) {
                        this.media_ = null;
                        onChanged();
                    } else {
                        this.media_ = null;
                        this.mediaBuilder_ = null;
                    }
                    return this;
                }

                public Any.Builder getMediaBuilder() {
                    onChanged();
                    return getMediaFieldBuilder().getBuilder();
                }

                public AnyOrBuilder getMediaOrBuilder() {
                    SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> singleFieldBuilderV3 = this.mediaBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Any any = this.media_;
                    return any == null ? Any.getDefaultInstance() : any;
                }

                private SingleFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getMediaFieldBuilder() {
                    if (this.mediaBuilder_ == null) {
                        this.mediaBuilder_ = new SingleFieldBuilderV3<>(getMedia(), getParentForChildren(), isClean());
                        this.media_ = null;
                    }
                    return this.mediaBuilder_;
                }

                public boolean hasExt() {
                    return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
                }

                public Struct getExt() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessage();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                public Builder setExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.setMessage(struct);
                    } else if (struct != null) {
                        this.ext_ = struct;
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExt(Struct.Builder builder) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ext_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    return this;
                }

                public Builder mergeExt(Struct struct) {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Struct struct2 = this.ext_;
                        if (struct2 != null) {
                            this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                        } else {
                            this.ext_ = struct;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(struct);
                    }
                    return this;
                }

                public Builder clearExt() {
                    if (this.extBuilder_ == null) {
                        this.ext_ = null;
                        onChanged();
                    } else {
                        this.ext_ = null;
                        this.extBuilder_ = null;
                    }
                    return this;
                }

                public Struct.Builder getExtBuilder() {
                    onChanged();
                    return getExtFieldBuilder().getBuilder();
                }

                public StructOrBuilder getExtOrBuilder() {
                    SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Struct struct = this.ext_;
                    return struct == null ? Struct.getDefaultInstance() : struct;
                }

                private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                    if (this.extBuilder_ == null) {
                        this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                        this.ext_ = null;
                    }
                    return this.extBuilder_;
                }

                private void ensureExtProtoIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.extProto_ = new ArrayList(this.extProto_);
                        this.bitField0_ |= 2;
                    }
                }

                public List<Any> getExtProtoList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return Collections.unmodifiableList(this.extProto_);
                    }
                    return repeatedFieldBuilderV3.getMessageList();
                }

                public int getExtProtoCount() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.size();
                    }
                    return repeatedFieldBuilderV3.getCount();
                }

                public Any getExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessage(i);
                }

                public Builder setExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder setExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.set(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.setMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any any) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(i, any);
                    } else if (any != null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, any);
                        onChanged();
                    } else {
                        throw null;
                    }
                    return this;
                }

                public Builder addExtProto(Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                    }
                    return this;
                }

                public Builder addExtProto(int i, Any.Builder builder) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.add(i, builder.build());
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addMessage(i, builder.build());
                    }
                    return this;
                }

                public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                    }
                    return this;
                }

                public Builder clearExtProto() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.extProto_ = Collections.emptyList();
                        this.bitField0_ &= -3;
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.clear();
                    }
                    return this;
                }

                public Builder removeExtProto(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureExtProtoIsMutable();
                        this.extProto_.remove(i);
                        onChanged();
                    } else {
                        repeatedFieldBuilderV3.remove(i);
                    }
                    return this;
                }

                public Any.Builder getExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().getBuilder(i);
                }

                public AnyOrBuilder getExtProtoOrBuilder(int i) {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        return this.extProto_.get(i);
                    }
                    return repeatedFieldBuilderV3.getMessageOrBuilder(i);
                }

                public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                    RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        return repeatedFieldBuilderV3.getMessageOrBuilderList();
                    }
                    return Collections.unmodifiableList(this.extProto_);
                }

                public Any.Builder addExtProtoBuilder() {
                    return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
                }

                public Any.Builder addExtProtoBuilder(int i) {
                    return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
                }

                public List<Any.Builder> getExtProtoBuilderList() {
                    return getExtProtoFieldBuilder().getBuilderList();
                }

                private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                    if (this.extProtoBuilder_ == null) {
                        this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                        this.extProto_ = null;
                    }
                    return this.extProtoBuilder_;
                }

                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }
            }

            public static Bid getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Bid> parser() {
                return PARSER;
            }

            public Parser<Bid> getParserForType() {
                return PARSER;
            }

            public Bid getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }
        }

        public String getSeat() {
            Object obj = this.seat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.seat_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getSeatBytes() {
            Object obj = this.seat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.seat_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public boolean getPackage() {
            return this.package_;
        }

        public List<Bid> getBidList() {
            return this.bid_;
        }

        public List<? extends BidOrBuilder> getBidOrBuilderList() {
            return this.bid_;
        }

        public int getBidCount() {
            return this.bid_.size();
        }

        public Bid getBid(int i) {
            return this.bid_.get(i);
        }

        public BidOrBuilder getBidOrBuilder(int i) {
            return this.bid_.get(i);
        }

        public boolean hasExt() {
            return this.ext_ != null;
        }

        public Struct getExt() {
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public StructOrBuilder getExtOrBuilder() {
            return getExt();
        }

        public List<Any> getExtProtoList() {
            return this.extProto_;
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            return this.extProto_;
        }

        public int getExtProtoCount() {
            return this.extProto_.size();
        }

        public Any getExtProto(int i) {
            return this.extProto_.get(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            return this.extProto_.get(i);
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
            if (!getSeatBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.seat_);
            }
            boolean z = this.package_;
            if (z) {
                codedOutputStream.writeBool(2, z);
            }
            for (int i = 0; i < this.bid_.size(); i++) {
                codedOutputStream.writeMessage(3, this.bid_.get(i));
            }
            for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
                codedOutputStream.writeMessage(4, this.extProto_.get(i2));
            }
            if (this.ext_ != null) {
                codedOutputStream.writeMessage(5, getExt());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int computeStringSize = !getSeatBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.seat_) + 0 : 0;
            boolean z = this.package_;
            if (z) {
                computeStringSize += CodedOutputStream.computeBoolSize(2, z);
            }
            for (int i2 = 0; i2 < this.bid_.size(); i2++) {
                computeStringSize += CodedOutputStream.computeMessageSize(3, this.bid_.get(i2));
            }
            for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
                computeStringSize += CodedOutputStream.computeMessageSize(4, this.extProto_.get(i3));
            }
            if (this.ext_ != null) {
                computeStringSize += CodedOutputStream.computeMessageSize(5, getExt());
            }
            int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Seatbid)) {
                return super.equals(obj);
            }
            Seatbid seatbid = (Seatbid) obj;
            if (!getSeat().equals(seatbid.getSeat()) || getPackage() != seatbid.getPackage() || !getBidList().equals(seatbid.getBidList()) || hasExt() != seatbid.hasExt()) {
                return false;
            }
            if ((!hasExt() || getExt().equals(seatbid.getExt())) && getExtProtoList().equals(seatbid.getExtProtoList()) && this.unknownFields.equals(seatbid.unknownFields)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getSeat().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getPackage());
            if (getBidCount() > 0) {
                hashCode = (((hashCode * 37) + 3) * 53) + getBidList().hashCode();
            }
            if (hasExt()) {
                hashCode = (((hashCode * 37) + 5) * 53) + getExt().hashCode();
            }
            if (getExtProtoCount() > 0) {
                hashCode = (((hashCode * 37) + 4) * 53) + getExtProtoList().hashCode();
            }
            int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = hashCode2;
            return hashCode2;
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Seatbid parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Seatbid parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Seatbid parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Seatbid parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        public static Seatbid parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Seatbid parseFrom(InputStream inputStream) throws IOException {
            return (Seatbid) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Seatbid) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Seatbid) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Seatbid parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Seatbid) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Seatbid parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Seatbid) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Seatbid parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Seatbid) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Seatbid seatbid) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(seatbid);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        /* access modifiers changed from: protected */
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SeatbidOrBuilder {
            private RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> bidBuilder_;
            private List<Bid> bid_;
            private int bitField0_;
            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
            private List<Any> extProto_;
            private Struct ext_;
            private boolean package_;
            private Object seat_;

            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_descriptor;
            }

            /* access modifiers changed from: protected */
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_fieldAccessorTable.ensureFieldAccessorsInitialized(Seatbid.class, Builder.class);
            }

            private Builder() {
                this.seat_ = "";
                this.bid_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.seat_ = "";
                this.bid_ = Collections.emptyList();
                this.extProto_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (Seatbid.alwaysUseFieldBuilders) {
                    getBidFieldBuilder();
                    getExtProtoFieldBuilder();
                }
            }

            public Builder clear() {
                super.clear();
                this.seat_ = "";
                this.package_ = false;
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.bid_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV32.clear();
                }
                return this;
            }

            public Descriptors.Descriptor getDescriptorForType() {
                return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_Seatbid_descriptor;
            }

            public Seatbid getDefaultInstanceForType() {
                return Seatbid.getDefaultInstance();
            }

            public Seatbid build() {
                Seatbid buildPartial = buildPartial();
                if (buildPartial.isInitialized()) {
                    return buildPartial;
                }
                throw newUninitializedMessageException(buildPartial);
            }

            public Seatbid buildPartial() {
                Seatbid seatbid = new Seatbid((GeneratedMessageV3.Builder) this);
                Object unused = seatbid.seat_ = this.seat_;
                boolean unused2 = seatbid.package_ = this.package_;
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.bid_ = Collections.unmodifiableList(this.bid_);
                        this.bitField0_ &= -2;
                    }
                    List unused3 = seatbid.bid_ = this.bid_;
                } else {
                    List unused4 = seatbid.bid_ = repeatedFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct unused5 = seatbid.ext_ = this.ext_;
                } else {
                    Struct unused6 = seatbid.ext_ = singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV32 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.extProto_ = Collections.unmodifiableList(this.extProto_);
                        this.bitField0_ &= -3;
                    }
                    List unused7 = seatbid.extProto_ = this.extProto_;
                } else {
                    List unused8 = seatbid.extProto_ = repeatedFieldBuilderV32.build();
                }
                onBuilt();
                return seatbid;
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
                if (message instanceof Seatbid) {
                    return mergeFrom((Seatbid) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Seatbid seatbid) {
                if (seatbid == Seatbid.getDefaultInstance()) {
                    return this;
                }
                if (!seatbid.getSeat().isEmpty()) {
                    this.seat_ = seatbid.seat_;
                    onChanged();
                }
                if (seatbid.getPackage()) {
                    setPackage(seatbid.getPackage());
                }
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
                if (this.bidBuilder_ == null) {
                    if (!seatbid.bid_.isEmpty()) {
                        if (this.bid_.isEmpty()) {
                            this.bid_ = seatbid.bid_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureBidIsMutable();
                            this.bid_.addAll(seatbid.bid_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.bid_.isEmpty()) {
                    if (this.bidBuilder_.isEmpty()) {
                        this.bidBuilder_.dispose();
                        this.bidBuilder_ = null;
                        this.bid_ = seatbid.bid_;
                        this.bitField0_ &= -2;
                        this.bidBuilder_ = Seatbid.alwaysUseFieldBuilders ? getBidFieldBuilder() : null;
                    } else {
                        this.bidBuilder_.addAllMessages(seatbid.bid_);
                    }
                }
                if (seatbid.hasExt()) {
                    mergeExt(seatbid.getExt());
                }
                if (this.extProtoBuilder_ == null) {
                    if (!seatbid.extProto_.isEmpty()) {
                        if (this.extProto_.isEmpty()) {
                            this.extProto_ = seatbid.extProto_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureExtProtoIsMutable();
                            this.extProto_.addAll(seatbid.extProto_);
                        }
                        onChanged();
                    }
                } else if (!seatbid.extProto_.isEmpty()) {
                    if (this.extProtoBuilder_.isEmpty()) {
                        this.extProtoBuilder_.dispose();
                        this.extProtoBuilder_ = null;
                        this.extProto_ = seatbid.extProto_;
                        this.bitField0_ &= -3;
                        if (Seatbid.alwaysUseFieldBuilders) {
                            repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                        }
                        this.extProtoBuilder_ = repeatedFieldBuilderV3;
                    } else {
                        this.extProtoBuilder_.addAllMessages(seatbid.extProto_);
                    }
                }
                mergeUnknownFields(seatbid.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.explorestack.protobuf.openrtb.Response.Seatbid.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
                /*
                    r2 = this;
                    r0 = 0
                    com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Response.Seatbid.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    com.explorestack.protobuf.openrtb.Response$Seatbid r3 = (com.explorestack.protobuf.openrtb.Response.Seatbid) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                    if (r3 == 0) goto L_0x0010
                    r2.mergeFrom((com.explorestack.protobuf.openrtb.Response.Seatbid) r3)
                L_0x0010:
                    return r2
                L_0x0011:
                    r3 = move-exception
                    goto L_0x0021
                L_0x0013:
                    r3 = move-exception
                    com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                    com.explorestack.protobuf.openrtb.Response$Seatbid r4 = (com.explorestack.protobuf.openrtb.Response.Seatbid) r4     // Catch:{ all -> 0x0011 }
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                    throw r3     // Catch:{ all -> 0x001f }
                L_0x001f:
                    r3 = move-exception
                    r0 = r4
                L_0x0021:
                    if (r0 == 0) goto L_0x0026
                    r2.mergeFrom((com.explorestack.protobuf.openrtb.Response.Seatbid) r0)
                L_0x0026:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Seatbid.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Response$Seatbid$Builder");
            }

            public String getSeat() {
                Object obj = this.seat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.seat_ = stringUtf8;
                return stringUtf8;
            }

            public ByteString getSeatBytes() {
                Object obj = this.seat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.seat_ = copyFromUtf8;
                return copyFromUtf8;
            }

            public Builder setSeat(String str) {
                if (str != null) {
                    this.seat_ = str;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public Builder clearSeat() {
                this.seat_ = Seatbid.getDefaultInstance().getSeat();
                onChanged();
                return this;
            }

            public Builder setSeatBytes(ByteString byteString) {
                if (byteString != null) {
                    Seatbid.checkByteStringIsUtf8(byteString);
                    this.seat_ = byteString;
                    onChanged();
                    return this;
                }
                throw null;
            }

            public boolean getPackage() {
                return this.package_;
            }

            public Builder setPackage(boolean z) {
                this.package_ = z;
                onChanged();
                return this;
            }

            public Builder clearPackage() {
                this.package_ = false;
                onChanged();
                return this;
            }

            private void ensureBidIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.bid_ = new ArrayList(this.bid_);
                    this.bitField0_ |= 1;
                }
            }

            public List<Bid> getBidList() {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.bid_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getBidCount() {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.bid_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Bid getBid(int i) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.bid_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setBid(int i, Bid bid) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, bid);
                } else if (bid != null) {
                    ensureBidIsMutable();
                    this.bid_.set(i, bid);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setBid(int i, Bid.Builder builder) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureBidIsMutable();
                    this.bid_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addBid(Bid bid) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(bid);
                } else if (bid != null) {
                    ensureBidIsMutable();
                    this.bid_.add(bid);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addBid(int i, Bid bid) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, bid);
                } else if (bid != null) {
                    ensureBidIsMutable();
                    this.bid_.add(i, bid);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addBid(Bid.Builder builder) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureBidIsMutable();
                    this.bid_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addBid(int i, Bid.Builder builder) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureBidIsMutable();
                    this.bid_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllBid(Iterable<? extends Bid> iterable) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureBidIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.bid_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearBid() {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.bid_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeBid(int i) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureBidIsMutable();
                    this.bid_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Bid.Builder getBidBuilder(int i) {
                return getBidFieldBuilder().getBuilder(i);
            }

            public BidOrBuilder getBidOrBuilder(int i) {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.bid_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends BidOrBuilder> getBidOrBuilderList() {
                RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> repeatedFieldBuilderV3 = this.bidBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.bid_);
            }

            public Bid.Builder addBidBuilder() {
                return getBidFieldBuilder().addBuilder(Bid.getDefaultInstance());
            }

            public Bid.Builder addBidBuilder(int i) {
                return getBidFieldBuilder().addBuilder(i, Bid.getDefaultInstance());
            }

            public List<Bid.Builder> getBidBuilderList() {
                return getBidFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Bid, Bid.Builder, BidOrBuilder> getBidFieldBuilder() {
                if (this.bidBuilder_ == null) {
                    List<Bid> list = this.bid_;
                    boolean z = true;
                    if ((this.bitField0_ & 1) == 0) {
                        z = false;
                    }
                    this.bidBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                    this.bid_ = null;
                }
                return this.bidBuilder_;
            }

            public boolean hasExt() {
                return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
            }

            public Struct getExt() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessage();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            public Builder setExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.setMessage(struct);
                } else if (struct != null) {
                    this.ext_ = struct;
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExt(Struct.Builder builder) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ext_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder mergeExt(Struct struct) {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 == null) {
                    Struct struct2 = this.ext_;
                    if (struct2 != null) {
                        this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                    } else {
                        this.ext_ = struct;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(struct);
                }
                return this;
            }

            public Builder clearExt() {
                if (this.extBuilder_ == null) {
                    this.ext_ = null;
                    onChanged();
                } else {
                    this.ext_ = null;
                    this.extBuilder_ = null;
                }
                return this;
            }

            public Struct.Builder getExtBuilder() {
                onChanged();
                return getExtFieldBuilder().getBuilder();
            }

            public StructOrBuilder getExtOrBuilder() {
                SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return singleFieldBuilderV3.getMessageOrBuilder();
                }
                Struct struct = this.ext_;
                return struct == null ? Struct.getDefaultInstance() : struct;
            }

            private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
                if (this.extBuilder_ == null) {
                    this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                    this.ext_ = null;
                }
                return this.extBuilder_;
            }

            private void ensureExtProtoIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.extProto_ = new ArrayList(this.extProto_);
                    this.bitField0_ |= 2;
                }
            }

            public List<Any> getExtProtoList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return Collections.unmodifiableList(this.extProto_);
                }
                return repeatedFieldBuilderV3.getMessageList();
            }

            public int getExtProtoCount() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.size();
                }
                return repeatedFieldBuilderV3.getCount();
            }

            public Any getExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessage(i);
            }

            public Builder setExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder setExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.set(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i, builder.build());
                }
                return this;
            }

            public Builder addExtProto(Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(int i, Any any) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(i, any);
                } else if (any != null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, any);
                    onChanged();
                } else {
                    throw null;
                }
                return this;
            }

            public Builder addExtProto(Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addExtProto(int i, Any.Builder builder) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.add(i, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i, builder.build());
                }
                return this;
            }

            public Builder addAllExtProto(Iterable<? extends Any> iterable) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearExtProto() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.extProto_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder removeExtProto(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureExtProtoIsMutable();
                    this.extProto_.remove(i);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i);
                }
                return this;
            }

            public Any.Builder getExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().getBuilder(i);
            }

            public AnyOrBuilder getExtProtoOrBuilder(int i) {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    return this.extProto_.get(i);
                }
                return repeatedFieldBuilderV3.getMessageOrBuilder(i);
            }

            public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
                RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    return repeatedFieldBuilderV3.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList(this.extProto_);
            }

            public Any.Builder addExtProtoBuilder() {
                return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
            }

            public Any.Builder addExtProtoBuilder(int i) {
                return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
            }

            public List<Any.Builder> getExtProtoBuilderList() {
                return getExtProtoFieldBuilder().getBuilderList();
            }

            private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
                if (this.extProtoBuilder_ == null) {
                    this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.extProto_ = null;
                }
                return this.extProtoBuilder_;
            }

            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }
        }

        public static Seatbid getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Seatbid> parser() {
            return PARSER;
        }

        public Parser<Seatbid> getParserForType() {
            return PARSER;
        }

        public Seatbid getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
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

    public String getBidid() {
        Object obj = this.bidid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.bidid_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getBididBytes() {
        Object obj = this.bidid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.bidid_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public int getNbrValue() {
        return this.nbr_;
    }

    public NoBidReason getNbr() {
        NoBidReason valueOf = NoBidReason.valueOf(this.nbr_);
        return valueOf == null ? NoBidReason.UNRECOGNIZED : valueOf;
    }

    public String getCur() {
        Object obj = this.cur_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cur_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCurBytes() {
        Object obj = this.cur_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cur_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public String getCdata() {
        Object obj = this.cdata_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.cdata_ = stringUtf8;
        return stringUtf8;
    }

    public ByteString getCdataBytes() {
        Object obj = this.cdata_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.cdata_ = copyFromUtf8;
        return copyFromUtf8;
    }

    public List<Seatbid> getSeatbidList() {
        return this.seatbid_;
    }

    public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
        return this.seatbid_;
    }

    public int getSeatbidCount() {
        return this.seatbid_.size();
    }

    public Seatbid getSeatbid(int i) {
        return this.seatbid_.get(i);
    }

    public SeatbidOrBuilder getSeatbidOrBuilder(int i) {
        return this.seatbid_.get(i);
    }

    public boolean hasExt() {
        return this.ext_ != null;
    }

    public Struct getExt() {
        Struct struct = this.ext_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public StructOrBuilder getExtOrBuilder() {
        return getExt();
    }

    public List<Any> getExtProtoList() {
        return this.extProto_;
    }

    public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
        return this.extProto_;
    }

    public int getExtProtoCount() {
        return this.extProto_.size();
    }

    public Any getExtProto(int i) {
        return this.extProto_.get(i);
    }

    public AnyOrBuilder getExtProtoOrBuilder(int i) {
        return this.extProto_.get(i);
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
        if (!getIdBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
        }
        if (!getBididBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            codedOutputStream.writeEnum(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.cdata_);
        }
        for (int i = 0; i < this.seatbid_.size(); i++) {
            codedOutputStream.writeMessage(6, this.seatbid_.get(i));
        }
        for (int i2 = 0; i2 < this.extProto_.size(); i2++) {
            codedOutputStream.writeMessage(7, this.extProto_.get(i2));
        }
        if (this.ext_ != null) {
            codedOutputStream.writeMessage(8, getExt());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !getIdBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.id_) + 0 : 0;
        if (!getBididBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(2, this.bidid_);
        }
        if (this.nbr_ != NoBidReason.NO_BID_REASON_INVALID.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(3, this.nbr_);
        }
        if (!getCurBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(4, this.cur_);
        }
        if (!getCdataBytes().isEmpty()) {
            computeStringSize += GeneratedMessageV3.computeStringSize(5, this.cdata_);
        }
        for (int i2 = 0; i2 < this.seatbid_.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(6, this.seatbid_.get(i2));
        }
        for (int i3 = 0; i3 < this.extProto_.size(); i3++) {
            computeStringSize += CodedOutputStream.computeMessageSize(7, this.extProto_.get(i3));
        }
        if (this.ext_ != null) {
            computeStringSize += CodedOutputStream.computeMessageSize(8, getExt());
        }
        int serializedSize = computeStringSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return super.equals(obj);
        }
        Response response = (Response) obj;
        if (!getId().equals(response.getId()) || !getBidid().equals(response.getBidid()) || this.nbr_ != response.nbr_ || !getCur().equals(response.getCur()) || !getCdata().equals(response.getCdata()) || !getSeatbidList().equals(response.getSeatbidList()) || hasExt() != response.hasExt()) {
            return false;
        }
        if ((!hasExt() || getExt().equals(response.getExt())) && getExtProtoList().equals(response.getExtProtoList()) && this.unknownFields.equals(response.unknownFields)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int hashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getId().hashCode()) * 37) + 2) * 53) + getBidid().hashCode()) * 37) + 3) * 53) + this.nbr_) * 37) + 4) * 53) + getCur().hashCode()) * 37) + 5) * 53) + getCdata().hashCode();
        if (getSeatbidCount() > 0) {
            hashCode = (((hashCode * 37) + 6) * 53) + getSeatbidList().hashCode();
        }
        if (hasExt()) {
            hashCode = (((hashCode * 37) + 8) * 53) + getExt().hashCode();
        }
        if (getExtProtoCount() > 0) {
            hashCode = (((hashCode * 37) + 7) * 53) + getExtProtoList().hashCode();
        }
        int hashCode2 = (hashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static Response parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Response parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    public static Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    public static Response parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    public static Response parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Response parseFrom(InputStream inputStream) throws IOException {
        return (Response) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Response) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Response parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Response) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Response) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Response parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Response) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Response) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Response response) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(response);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    /* access modifiers changed from: protected */
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResponseOrBuilder {
        private Object bidid_;
        private int bitField0_;
        private Object cdata_;
        private Object cur_;
        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> extBuilder_;
        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> extProtoBuilder_;
        private List<Any> extProto_;
        private Struct ext_;
        private Object id_;
        private int nbr_;
        private RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> seatbidBuilder_;
        private List<Seatbid> seatbid_;

        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_descriptor;
        }

        /* access modifiers changed from: protected */
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_fieldAccessorTable.ensureFieldAccessorsInitialized(Response.class, Builder.class);
        }

        private Builder() {
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            this.seatbid_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            this.seatbid_ = Collections.emptyList();
            this.extProto_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (Response.alwaysUseFieldBuilders) {
                getSeatbidFieldBuilder();
                getExtProtoFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            this.id_ = "";
            this.bidid_ = "";
            this.nbr_ = 0;
            this.cur_ = "";
            this.cdata_ = "";
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.seatbid_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            if (this.extBuilder_ == null) {
                this.ext_ = null;
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV32.clear();
            }
            return this;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return OpenrtbProto.internal_static_bidmachine_protobuf_openrtb_Response_descriptor;
        }

        public Response getDefaultInstanceForType() {
            return Response.getDefaultInstance();
        }

        public Response build() {
            Response buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public Response buildPartial() {
            Response response = new Response((GeneratedMessageV3.Builder) this);
            Object unused = response.id_ = this.id_;
            Object unused2 = response.bidid_ = this.bidid_;
            int unused3 = response.nbr_ = this.nbr_;
            Object unused4 = response.cur_ = this.cur_;
            Object unused5 = response.cdata_ = this.cdata_;
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((this.bitField0_ & 1) != 0) {
                    this.seatbid_ = Collections.unmodifiableList(this.seatbid_);
                    this.bitField0_ &= -2;
                }
                List unused6 = response.seatbid_ = this.seatbid_;
            } else {
                List unused7 = response.seatbid_ = repeatedFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct unused8 = response.ext_ = this.ext_;
            } else {
                Struct unused9 = response.ext_ = singleFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV32 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV32 == null) {
                if ((this.bitField0_ & 2) != 0) {
                    this.extProto_ = Collections.unmodifiableList(this.extProto_);
                    this.bitField0_ &= -3;
                }
                List unused10 = response.extProto_ = this.extProto_;
            } else {
                List unused11 = response.extProto_ = repeatedFieldBuilderV32.build();
            }
            onBuilt();
            return response;
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
            if (message instanceof Response) {
                return mergeFrom((Response) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(Response response) {
            if (response == Response.getDefaultInstance()) {
                return this;
            }
            if (!response.getId().isEmpty()) {
                this.id_ = response.id_;
                onChanged();
            }
            if (!response.getBidid().isEmpty()) {
                this.bidid_ = response.bidid_;
                onChanged();
            }
            if (response.nbr_ != 0) {
                setNbrValue(response.getNbrValue());
            }
            if (!response.getCur().isEmpty()) {
                this.cur_ = response.cur_;
                onChanged();
            }
            if (!response.getCdata().isEmpty()) {
                this.cdata_ = response.cdata_;
                onChanged();
            }
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = null;
            if (this.seatbidBuilder_ == null) {
                if (!response.seatbid_.isEmpty()) {
                    if (this.seatbid_.isEmpty()) {
                        this.seatbid_ = response.seatbid_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSeatbidIsMutable();
                        this.seatbid_.addAll(response.seatbid_);
                    }
                    onChanged();
                }
            } else if (!response.seatbid_.isEmpty()) {
                if (this.seatbidBuilder_.isEmpty()) {
                    this.seatbidBuilder_.dispose();
                    this.seatbidBuilder_ = null;
                    this.seatbid_ = response.seatbid_;
                    this.bitField0_ &= -2;
                    this.seatbidBuilder_ = Response.alwaysUseFieldBuilders ? getSeatbidFieldBuilder() : null;
                } else {
                    this.seatbidBuilder_.addAllMessages(response.seatbid_);
                }
            }
            if (response.hasExt()) {
                mergeExt(response.getExt());
            }
            if (this.extProtoBuilder_ == null) {
                if (!response.extProto_.isEmpty()) {
                    if (this.extProto_.isEmpty()) {
                        this.extProto_ = response.extProto_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureExtProtoIsMutable();
                        this.extProto_.addAll(response.extProto_);
                    }
                    onChanged();
                }
            } else if (!response.extProto_.isEmpty()) {
                if (this.extProtoBuilder_.isEmpty()) {
                    this.extProtoBuilder_.dispose();
                    this.extProtoBuilder_ = null;
                    this.extProto_ = response.extProto_;
                    this.bitField0_ &= -3;
                    if (Response.alwaysUseFieldBuilders) {
                        repeatedFieldBuilderV3 = getExtProtoFieldBuilder();
                    }
                    this.extProtoBuilder_ = repeatedFieldBuilderV3;
                } else {
                    this.extProtoBuilder_.addAllMessages(response.extProto_);
                }
            }
            mergeUnknownFields(response.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.explorestack.protobuf.openrtb.Response.Builder mergeFrom(com.explorestack.protobuf.CodedInputStream r3, com.explorestack.protobuf.ExtensionRegistryLite r4) throws java.io.IOException {
            /*
                r2 = this;
                r0 = 0
                com.explorestack.protobuf.Parser r1 = com.explorestack.protobuf.openrtb.Response.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                java.lang.Object r3 = r1.parsePartialFrom((com.explorestack.protobuf.CodedInputStream) r3, (com.explorestack.protobuf.ExtensionRegistryLite) r4)     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                com.explorestack.protobuf.openrtb.Response r3 = (com.explorestack.protobuf.openrtb.Response) r3     // Catch:{ InvalidProtocolBufferException -> 0x0013 }
                if (r3 == 0) goto L_0x0010
                r2.mergeFrom((com.explorestack.protobuf.openrtb.Response) r3)
            L_0x0010:
                return r2
            L_0x0011:
                r3 = move-exception
                goto L_0x0021
            L_0x0013:
                r3 = move-exception
                com.explorestack.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch:{ all -> 0x0011 }
                com.explorestack.protobuf.openrtb.Response r4 = (com.explorestack.protobuf.openrtb.Response) r4     // Catch:{ all -> 0x0011 }
                java.io.IOException r3 = r3.unwrapIOException()     // Catch:{ all -> 0x001f }
                throw r3     // Catch:{ all -> 0x001f }
            L_0x001f:
                r3 = move-exception
                r0 = r4
            L_0x0021:
                if (r0 == 0) goto L_0x0026
                r2.mergeFrom((com.explorestack.protobuf.openrtb.Response) r0)
            L_0x0026:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.openrtb.Response.Builder.mergeFrom(com.explorestack.protobuf.CodedInputStream, com.explorestack.protobuf.ExtensionRegistryLite):com.explorestack.protobuf.openrtb.Response$Builder");
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
            this.id_ = Response.getDefaultInstance().getId();
            onChanged();
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            if (byteString != null) {
                Response.checkByteStringIsUtf8(byteString);
                this.id_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getBidid() {
            Object obj = this.bidid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.bidid_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getBididBytes() {
            Object obj = this.bidid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bidid_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setBidid(String str) {
            if (str != null) {
                this.bidid_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearBidid() {
            this.bidid_ = Response.getDefaultInstance().getBidid();
            onChanged();
            return this;
        }

        public Builder setBididBytes(ByteString byteString) {
            if (byteString != null) {
                Response.checkByteStringIsUtf8(byteString);
                this.bidid_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public int getNbrValue() {
            return this.nbr_;
        }

        public Builder setNbrValue(int i) {
            this.nbr_ = i;
            onChanged();
            return this;
        }

        public NoBidReason getNbr() {
            NoBidReason valueOf = NoBidReason.valueOf(this.nbr_);
            return valueOf == null ? NoBidReason.UNRECOGNIZED : valueOf;
        }

        public Builder setNbr(NoBidReason noBidReason) {
            if (noBidReason != null) {
                this.nbr_ = noBidReason.getNumber();
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearNbr() {
            this.nbr_ = 0;
            onChanged();
            return this;
        }

        public String getCur() {
            Object obj = this.cur_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cur_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCurBytes() {
            Object obj = this.cur_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cur_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setCur(String str) {
            if (str != null) {
                this.cur_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearCur() {
            this.cur_ = Response.getDefaultInstance().getCur();
            onChanged();
            return this;
        }

        public Builder setCurBytes(ByteString byteString) {
            if (byteString != null) {
                Response.checkByteStringIsUtf8(byteString);
                this.cur_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        public String getCdata() {
            Object obj = this.cdata_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.cdata_ = stringUtf8;
            return stringUtf8;
        }

        public ByteString getCdataBytes() {
            Object obj = this.cdata_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString copyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.cdata_ = copyFromUtf8;
            return copyFromUtf8;
        }

        public Builder setCdata(String str) {
            if (str != null) {
                this.cdata_ = str;
                onChanged();
                return this;
            }
            throw null;
        }

        public Builder clearCdata() {
            this.cdata_ = Response.getDefaultInstance().getCdata();
            onChanged();
            return this;
        }

        public Builder setCdataBytes(ByteString byteString) {
            if (byteString != null) {
                Response.checkByteStringIsUtf8(byteString);
                this.cdata_ = byteString;
                onChanged();
                return this;
            }
            throw null;
        }

        private void ensureSeatbidIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.seatbid_ = new ArrayList(this.seatbid_);
                this.bitField0_ |= 1;
            }
        }

        public List<Seatbid> getSeatbidList() {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.seatbid_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getSeatbidCount() {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.seatbid_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public Seatbid getSeatbid(int i) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.seatbid_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setSeatbid(int i, Seatbid seatbid) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, seatbid);
            } else if (seatbid != null) {
                ensureSeatbidIsMutable();
                this.seatbid_.set(i, seatbid);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setSeatbid(int i, Seatbid.Builder builder) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addSeatbid(Seatbid seatbid) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(seatbid);
            } else if (seatbid != null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(seatbid);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addSeatbid(int i, Seatbid seatbid) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, seatbid);
            } else if (seatbid != null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(i, seatbid);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addSeatbid(Seatbid.Builder builder) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addSeatbid(int i, Seatbid.Builder builder) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllSeatbid(Iterable<? extends Seatbid> iterable) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSeatbidIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.seatbid_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearSeatbid() {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.seatbid_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeSeatbid(int i) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureSeatbidIsMutable();
                this.seatbid_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Seatbid.Builder getSeatbidBuilder(int i) {
            return getSeatbidFieldBuilder().getBuilder(i);
        }

        public SeatbidOrBuilder getSeatbidOrBuilder(int i) {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.seatbid_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends SeatbidOrBuilder> getSeatbidOrBuilderList() {
            RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> repeatedFieldBuilderV3 = this.seatbidBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.seatbid_);
        }

        public Seatbid.Builder addSeatbidBuilder() {
            return getSeatbidFieldBuilder().addBuilder(Seatbid.getDefaultInstance());
        }

        public Seatbid.Builder addSeatbidBuilder(int i) {
            return getSeatbidFieldBuilder().addBuilder(i, Seatbid.getDefaultInstance());
        }

        public List<Seatbid.Builder> getSeatbidBuilderList() {
            return getSeatbidFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Seatbid, Seatbid.Builder, SeatbidOrBuilder> getSeatbidFieldBuilder() {
            if (this.seatbidBuilder_ == null) {
                List<Seatbid> list = this.seatbid_;
                boolean z = true;
                if ((this.bitField0_ & 1) == 0) {
                    z = false;
                }
                this.seatbidBuilder_ = new RepeatedFieldBuilderV3<>(list, z, getParentForChildren(), isClean());
                this.seatbid_ = null;
            }
            return this.seatbidBuilder_;
        }

        public boolean hasExt() {
            return (this.extBuilder_ == null && this.ext_ == null) ? false : true;
        }

        public Struct getExt() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessage();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        public Builder setExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.setMessage(struct);
            } else if (struct != null) {
                this.ext_ = struct;
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setExt(Struct.Builder builder) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.ext_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder mergeExt(Struct struct) {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 == null) {
                Struct struct2 = this.ext_;
                if (struct2 != null) {
                    this.ext_ = Struct.newBuilder(struct2).mergeFrom(struct).buildPartial();
                } else {
                    this.ext_ = struct;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(struct);
            }
            return this;
        }

        public Builder clearExt() {
            if (this.extBuilder_ == null) {
                this.ext_ = null;
                onChanged();
            } else {
                this.ext_ = null;
                this.extBuilder_ = null;
            }
            return this;
        }

        public Struct.Builder getExtBuilder() {
            onChanged();
            return getExtFieldBuilder().getBuilder();
        }

        public StructOrBuilder getExtOrBuilder() {
            SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> singleFieldBuilderV3 = this.extBuilder_;
            if (singleFieldBuilderV3 != null) {
                return singleFieldBuilderV3.getMessageOrBuilder();
            }
            Struct struct = this.ext_;
            return struct == null ? Struct.getDefaultInstance() : struct;
        }

        private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getExtFieldBuilder() {
            if (this.extBuilder_ == null) {
                this.extBuilder_ = new SingleFieldBuilderV3<>(getExt(), getParentForChildren(), isClean());
                this.ext_ = null;
            }
            return this.extBuilder_;
        }

        private void ensureExtProtoIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.extProto_ = new ArrayList(this.extProto_);
                this.bitField0_ |= 2;
            }
        }

        public List<Any> getExtProtoList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return Collections.unmodifiableList(this.extProto_);
            }
            return repeatedFieldBuilderV3.getMessageList();
        }

        public int getExtProtoCount() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.size();
            }
            return repeatedFieldBuilderV3.getCount();
        }

        public Any getExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessage(i);
        }

        public Builder setExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.setMessage(i, any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i, any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder setExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.set(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i, builder.build());
            }
            return this;
        }

        public Builder addExtProto(Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addExtProto(int i, Any any) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                repeatedFieldBuilderV3.addMessage(i, any);
            } else if (any != null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, any);
                onChanged();
            } else {
                throw null;
            }
            return this;
        }

        public Builder addExtProto(Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addExtProto(int i, Any.Builder builder) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.add(i, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i, builder.build());
            }
            return this;
        }

        public Builder addAllExtProto(Iterable<? extends Any> iterable) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                AbstractMessageLite.Builder.addAll(iterable, this.extProto_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearExtProto() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.extProto_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder removeExtProto(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureExtProtoIsMutable();
                this.extProto_.remove(i);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i);
            }
            return this;
        }

        public Any.Builder getExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().getBuilder(i);
        }

        public AnyOrBuilder getExtProtoOrBuilder(int i) {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                return this.extProto_.get(i);
            }
            return repeatedFieldBuilderV3.getMessageOrBuilder(i);
        }

        public List<? extends AnyOrBuilder> getExtProtoOrBuilderList() {
            RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> repeatedFieldBuilderV3 = this.extProtoBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                return repeatedFieldBuilderV3.getMessageOrBuilderList();
            }
            return Collections.unmodifiableList(this.extProto_);
        }

        public Any.Builder addExtProtoBuilder() {
            return getExtProtoFieldBuilder().addBuilder(Any.getDefaultInstance());
        }

        public Any.Builder addExtProtoBuilder(int i) {
            return getExtProtoFieldBuilder().addBuilder(i, Any.getDefaultInstance());
        }

        public List<Any.Builder> getExtProtoBuilderList() {
            return getExtProtoFieldBuilder().getBuilderList();
        }

        private RepeatedFieldBuilderV3<Any, Any.Builder, AnyOrBuilder> getExtProtoFieldBuilder() {
            if (this.extProtoBuilder_ == null) {
                this.extProtoBuilder_ = new RepeatedFieldBuilderV3<>(this.extProto_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.extProto_ = null;
            }
            return this.extProtoBuilder_;
        }

        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }
    }

    public static Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Response> parser() {
        return PARSER;
    }

    public Parser<Response> getParserForType() {
        return PARSER;
    }

    public Response getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}

package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.MessageLite;

public abstract class Extension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

    protected enum ExtensionType {
        IMMUTABLE,
        MUTABLE,
        PROTO1
    }

    public enum MessageType {
        PROTO1,
        PROTO2
    }

    /* access modifiers changed from: protected */
    public abstract Object fromReflectionType(Object obj);

    public abstract Descriptors.FieldDescriptor getDescriptor();

    /* access modifiers changed from: protected */
    public abstract ExtensionType getExtensionType();

    public abstract Message getMessageDefaultInstance();

    /* access modifiers changed from: package-private */
    public final boolean isLite() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract Object singularFromReflectionType(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object singularToReflectionType(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object toReflectionType(Object obj);

    public MessageType getMessageType() {
        return MessageType.PROTO2;
    }
}

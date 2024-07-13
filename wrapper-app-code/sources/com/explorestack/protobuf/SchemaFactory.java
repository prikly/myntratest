package com.explorestack.protobuf;

interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}

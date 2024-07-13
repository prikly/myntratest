package io.bidmachine.models;

import java.util.Map;

public interface ICustomParams<SelfType> {
    SelfType addParam(String str, String str2);

    SelfType addParams(Map<String, String> map);
}

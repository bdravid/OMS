package com.bdravid.oms.framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Bdravid on 02/01/2017.
 */
public class Context {
    private final Map<String, Object> context = new HashMap<String, Object>();

    public <T> void add(String key, T value) {
        context.put(key, value);
    }

    public <T> Optional<T> get(String key) {
        return (Optional<T>) Optional.ofNullable(context.get(key));
    }
}

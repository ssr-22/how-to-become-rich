package org.shen;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Objects;

public final class Millionaire {
    private final Log log = LogFactory.getLog(getClass());
    private String name;

    public Millionaire(String name) {
        this.name = Objects.requireNonNull(name, "name cont be null");
    }

    public String howTobecomeRich() {
        if (log.isDebugEnabled()) {
            log.debug("How to become rich?");
        }
        return "buy lottery";
    }
}

package com.uniqueapps.quickscript;

import java.io.Serializable;

public class Script implements Serializable {

    String scriptName;
    String scriptData;

    public Script(String name, String data) {
        scriptName = name;
        scriptData = data;
    }

    @Override
    public String toString() {
        return scriptName;
    }
}

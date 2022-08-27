package org.felixfb.airquality.exportedjsontoxlsx;

import java.util.HashMap;

public enum ImportType {
    MongoExport,
    MongoExportasArray;

    private static final HashMap<ImportType, String> names = new HashMap<>();
    static {
        names.put(ImportType.MongoExport, "MongoExport");
        names.put(ImportType.MongoExportasArray, "MongoExport as Array");
    }
    public static ImportType getDefaultType() {
        return ImportType.MongoExportasArray;
    }
    @Override
    public String toString() {
        return names.get(this);
    }
}

package org.felixfb.airquality.exportedjsontoxlsx;

import java.util.HashMap;

public enum ImportType {
    MongoExport,
    MongoExportAsArray;
    private static final HashMap<ImportType, String> names = new HashMap<>();
    static {
        names.put(ImportType.MongoExport, "MongoExport");
        names.put(ImportType.MongoExportAsArray, "MongoExport as Array");
    }
    public static ImportType getDefaultType() {
        return ImportType.MongoExportAsArray;
    }
    @Override
    public String toString() {
        return names.get(this);
    }
}

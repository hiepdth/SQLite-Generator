package com.example.sqliteconvert;

public final class AppConstants {
    public interface SQLITE_DB {
        int DATABASE_VERSION = 1;
        String DATABASE_NAME = "resources.db";

        interface CATEGORY_TABLE {
            String TABLE_NAME = "categories";

            //Todo: Column
            String CATEGORY_ID_COLUMN = "category_id";
            String CATEGORY_NAME_COLUMN = "category_name";
            String ORDER_NUMBER_COLUMN = "order_number";

            //Todo: Create query
            String CREATE_CATEGORY_TABLE = "CREATE TABLE " + TABLE_NAME + "( " +
                    CATEGORY_ID_COLUMN + " VARCHAR(255) " + " NOT NULL PRIMARY KEY, " +
                    CATEGORY_NAME_COLUMN + " VARCHAR(255), " +
                    ORDER_NUMBER_COLUMN + " INTEGER(4))";
        }

        interface PRODUCT_TABLE {
            String TABLE_NAME = "products";

            //Todo: Column
            String PRODUCT_ID_COLUMN = "product_id";
            String PRODUCT_CODE_COLUMN = "product_code";
            String PRODUCT_NAME_COLUMN = "product_name";
            String COLOR_CODE_COLUMN = "color_code";
            String COLOR_NAME_COLUMN = "color_name";
            String IMAGE_COLUMN = "image";
            String CATEGORY_ID_COLUMN = "category_id";

            //Todo: Create query
            String CREATE_PRODUCT_TABLE = "CREATE TABLE " + TABLE_NAME + "( " +
                    PRODUCT_ID_COLUMN + " VARCHAR(255) " + " NOT NULL PRIMARY KEY, " +
                    PRODUCT_CODE_COLUMN + " VARCHAR(255)," +
                    PRODUCT_NAME_COLUMN + " VARCHAR(255), " +
                    COLOR_CODE_COLUMN + " INTEGER(4), " +
                    COLOR_NAME_COLUMN + " VARCHAR(30), " +
                    IMAGE_COLUMN + " VARCHAR(255), " +
                    CATEGORY_ID_COLUMN + " VARCHAR(255))";
        }
    }
}

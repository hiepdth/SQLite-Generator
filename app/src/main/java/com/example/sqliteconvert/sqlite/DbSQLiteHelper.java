package com.example.sqliteconvert.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sqliteconvert.AppConstants;
import com.example.sqliteconvert.model.CategoryModel;
import com.example.sqliteconvert.model.ProductModel;

import java.util.List;

public class DbSQLiteHelper extends SQLiteOpenHelper implements SQLiteHelper {

    private SQLiteDatabase sqLiteDatabase;
    private ContentValues contentValues;
    private Cursor cursor;

    public DbSQLiteHelper(Context context) {
        super(context, AppConstants.SQLITE_DB.DATABASE_NAME, null, AppConstants.SQLITE_DB.DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(AppConstants.SQLITE_DB.CATEGORY_TABLE.CREATE_CATEGORY_TABLE);
        db.execSQL(AppConstants.SQLITE_DB.PRODUCT_TABLE.CREATE_PRODUCT_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion == newVersion) {
            // Drop older table if existed
            db.execSQL("DROP TABLE IF EXISTS " + AppConstants.SQLITE_DB.CATEGORY_TABLE.TABLE_NAME);
            db.execSQL("DROP TABLE IF EXISTS " + AppConstants.SQLITE_DB.PRODUCT_TABLE.TABLE_NAME);

            // Create tables again
            onCreate(db);
        }
    }

    @Override
    public void insertListCategories(List<CategoryModel> model) {
        sqLiteDatabase = getWritableDatabase();
        contentValues = new ContentValues();

        for (CategoryModel m : model) {
            contentValues.put(AppConstants.SQLITE_DB.CATEGORY_TABLE.CATEGORY_ID_COLUMN, m.getCategoryId());
            contentValues.put(AppConstants.SQLITE_DB.CATEGORY_TABLE.CATEGORY_NAME_COLUMN, m.getCategoryName());
            contentValues.put(AppConstants.SQLITE_DB.CATEGORY_TABLE.ORDER_NUMBER_COLUMN, m.getOrderNumber());
            sqLiteDatabase.insert(AppConstants.SQLITE_DB.CATEGORY_TABLE.TABLE_NAME, null, contentValues);
        }
        closeDB();
    }

    @Override
    public void insertListProducts(List<ProductModel> model) {
        sqLiteDatabase = getWritableDatabase();
        contentValues = new ContentValues();

        for (ProductModel m : model) {
            contentValues.put(AppConstants.SQLITE_DB.PRODUCT_TABLE.PRODUCT_ID_COLUMN, m.getProductId());
            contentValues.put(AppConstants.SQLITE_DB.PRODUCT_TABLE.PRODUCT_CODE_COLUMN, m.getProductCode());
            contentValues.put(AppConstants.SQLITE_DB.PRODUCT_TABLE.PRODUCT_NAME_COLUMN, m.getProductName());
            contentValues.put(AppConstants.SQLITE_DB.PRODUCT_TABLE.COLOR_CODE_COLUMN, m.getColorCode());
            contentValues.put(AppConstants.SQLITE_DB.PRODUCT_TABLE.COLOR_NAME_COLUMN, m.getColorName());
            contentValues.put(AppConstants.SQLITE_DB.PRODUCT_TABLE.IMAGE_COLUMN, m.getImages().get(0));
            contentValues.put(AppConstants.SQLITE_DB.PRODUCT_TABLE.CATEGORY_ID_COLUMN, m.getCategoryId());
            sqLiteDatabase.insert(AppConstants.SQLITE_DB.PRODUCT_TABLE.TABLE_NAME, null, contentValues);
        }
        closeDB();
    }

    //Todo: Đóng Database
    private void closeDB() {
        if (sqLiteDatabase != null) sqLiteDatabase.close();
        if (contentValues != null) contentValues.clear();
        if (cursor != null) cursor.close();
    }
}
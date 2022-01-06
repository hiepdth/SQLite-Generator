package com.example.sqliteconvert;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sqliteconvert.model.CategoryListModel;
import com.example.sqliteconvert.model.ProductListModel;
import com.example.sqliteconvert.sqlite.DbSQLiteHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    private DbSQLiteHelper helper;

    /**
     * Import json file to assets folder and change name file below
     */
    private static final String CATEGORY_JSON = "categories.json";
    private static final String PRODUCT_JSON = "products.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper = new DbSQLiteHelper(this);

        String categories_json = readFileFromAssets(CATEGORY_JSON);
        String product_json = readFileFromAssets(PRODUCT_JSON);


        //-------------------------------------------------//
        //Todo: Convert json =====> ArrayList
        CategoryListModel nationListModel = CategoryListModel.newInstance(categories_json);
        ProductListModel provinceListModel = ProductListModel.newInstance(product_json);

        //-------------------------------------------------//

        //-------------------------------------------------//
        //Todo: Thêm dữ liệu (Arraylist) vào bảng NATION
        helper.insertListCategories(nationListModel.getCategories());
        //Todo: Thêm dữ liệu (Arraylist) vào bảng PROVINCE
        helper.insertListProducts(provinceListModel.getProducts());
        //-------------------------------------------------//
    }

    /**
     * Đọc file json từ Assets
     */
    private String readFileFromAssets(String fileName) {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open(fileName)));

            // do reading, usually loop until end of file reading
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                sb.append(mLine);
            }
        } catch (IOException e) {
            //log the exception
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        return sb.toString();
    }
}
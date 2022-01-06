package com.example.sqliteconvert.sqlite;

import com.example.sqliteconvert.model.CategoryModel;
import com.example.sqliteconvert.model.ProductModel;

import java.util.List;

public interface SQLiteHelper {
    void insertListCategories(List<CategoryModel> model);

    void insertListProducts(List<ProductModel> model);
}

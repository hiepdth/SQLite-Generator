package com.example.sqliteconvert.model;

import android.text.TextUtils;

import com.google.gson.Gson;

import java.util.List;

public class ProductListModel {
    private List<ProductModel> products;

    public List<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductModel> products) {
        this.products = products;
    }

    public static ProductListModel newInstance(String json) {
        if (json == null || TextUtils.isEmpty(json)) return null;
        Gson gson = new Gson();
        return gson.fromJson(json, ProductListModel.class);
    }

    public static String getJsonString(ProductListModel model) {
        if (model == null) return "";
        Gson gson = new Gson();
        return gson.toJson(model);
    }
}

package com.example.sqliteconvert.model;

import android.text.TextUtils;

import com.google.gson.Gson;

import java.util.List;

public class CategoryListModel {
    private List<CategoryModel> categories;

    public List<CategoryModel> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryModel> categories) {
        this.categories = categories;
    }

    public static CategoryListModel newInstance(String json) {
        if (json == null || TextUtils.isEmpty(json)) return null;
        Gson gson = new Gson();
        return gson.fromJson(json, CategoryListModel.class);
    }

    public static String getJsonString(CategoryListModel model) {
        if (model == null) return "";
        Gson gson = new Gson();
        return gson.toJson(model);
    }
}

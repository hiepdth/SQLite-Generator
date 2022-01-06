package com.example.sqliteconvert.model;

import android.net.Uri;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class CategoryModel implements Serializable {
    private String categoryId;
    private String categoryName;
    private Long orderNumber;
    private String image;
    private Long total;

    private Uri imageUri;

    private Boolean isSelected;

    public CategoryModel() {
    }

    public CategoryModel(String categoryId, String categoryName, String image, Long total) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.image = image;
        this.total = total;
    }

    public CategoryModel(String categoryId, String categoryName, Long orderNumber) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.orderNumber = orderNumber;
    }

    public CategoryModel(String categoryId, String categoryName, Boolean isSelected) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.isSelected = isSelected;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Uri getImageUri() {
        return imageUri;
    }

    public void setImageUri(Uri imageUri) {
        this.imageUri = imageUri;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    @NonNull
    @Override
    public String toString() {
        return categoryName;
    }
}

package com.example.sqliteconvert.model;

import android.net.Uri;

import java.io.Serializable;
import java.util.List;

public class ProductModel implements Serializable {
    private String productId;
    private String productCode;
    private String productName;
    private String categoryId;
    private String description;
    private Long colorCode;
    private String colorName;
    private Double price;
    private Long quantity;
    private Long sale;
    private Float rating;
    private List<String> images;
    private List<String> sizes;
    private List<String> tags;
    private Long timestamp;


    private String categoryName;
    private List<Uri> listUri;

    public ProductModel() {
    }


    public ProductModel(String productId, String productCode, String productName, String categoryId, Long colorCode, String colorName, List<String> images, String categoryName) {
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.categoryId = categoryId;
        this.colorCode = colorCode;
        this.colorName = colorName;
        this.images = images;
        this.categoryName = categoryName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSizes() {
        return sizes;
    }

    public void setSizes(List<String> sizes) {
        this.sizes = sizes;
    }

    public List<Uri> getListUri() {
        return listUri;
    }

    public void setListUri(List<Uri> listUri) {
        this.listUri = listUri;
    }

    public Long getColorCode() {
        return colorCode;
    }

    public void setColorCode(Long colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Long getSale() {
        return sale;
    }

    public void setSale(Long sale) {
        this.sale = sale;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}

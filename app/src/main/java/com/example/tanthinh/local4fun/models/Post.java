package com.example.tanthinh.local4fun.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Post extends ArrayList<Parcelable> implements Parcelable {

    private String title;
    private String userId;
    private Double hours;
    private Double pricePerPerson;
    private String tourType;
    private String location;

    private ArrayList<String> pictures = new ArrayList<String>();

    public Post(String userId, String title, String tourType, Double hours, Double pricePerPerson, String location) {
        this.title = title;
        this.tourType = tourType;
        this.userId = userId;
        this.hours = hours;
        this.pricePerPerson = pricePerPerson;
        this.location = location;
    }

    public Post(Parcel parcel) {
        title = parcel.readString();
        userId = parcel.readString();
        hours = parcel.readDouble();
        pricePerPerson = parcel.readDouble();
        tourType = parcel.readString();
        location = parcel.readString();
        pictures = (ArrayList<String>) parcel.readSerializable();
    }

    public ArrayList<String> getPictures() {
        return pictures;
    }
    public void addPicture(String path){
        pictures.add(path);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Double getPricePerPerson() {
        return pricePerPerson;
    }

    public void setPricePerPerson(Double pricePerPerson) {
        this.pricePerPerson = pricePerPerson;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public void setPictures(ArrayList<String> pictures) {
        this.pictures = pictures;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(userId);
        parcel.writeDouble(hours);
        parcel.writeDouble(pricePerPerson);
        parcel.writeString(tourType);
        parcel.writeString(location);
    }

    public static final Creator<Post> CREATOR = new Creator<Post>() {
        @Override
        public Post createFromParcel(Parcel parcel) {
            return new Post(parcel);
        }

        @Override
        public Post[] newArray(int i) {
            return new Post[0];
        }
    };
}

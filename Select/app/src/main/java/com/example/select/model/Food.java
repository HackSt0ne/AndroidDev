package com.example.select.model;

public class Food {
    private String mName;
    private boolean mIsSpicy;
    private boolean mIsSeaFood;
    private boolean mIsSour;
    private int mPrice;

    private int mDrawId;
    public Food(String mName, int mPrice, int mDrawId, boolean mIsSpicy, boolean mIsSeaFood, boolean mIsSour) {
        this.mName = mName;
        this.mPrice = mPrice;
        this.mDrawId = mDrawId;
        this.mIsSpicy = mIsSpicy;
        this.mIsSeaFood = mIsSeaFood;
        this.mIsSour = mIsSour;
    }

    public Food(){
    }

    public String getmName() {
        return mName;
    }


    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    public int getmPrice() {
        return mPrice;
    }

    public void setmIsSpicy(boolean mIsSpicy) {
        this.mIsSpicy = mIsSpicy;
    }

    public void setmIsSeaFood(boolean mIsSeaFood) {
        this.mIsSeaFood = mIsSeaFood;
    }

    public void setmIsSour(boolean mIsSour) {
        this.mIsSour = mIsSour;
    }

    public boolean ismIsSpicy() {
        return mIsSpicy;
    }

    public boolean ismIsSeaFood() {
        return mIsSeaFood;
    }

    public boolean ismIsSour() {
        return mIsSour;
    }

    public int getmDrawId() {
        return mDrawId;
    }

    public void setmDrawId(int mDrawId) {
        this.mDrawId = mDrawId;
    }
}

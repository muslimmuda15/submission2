package com.dicoding.picodiploma.mybottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.fragment.app.Fragment;

public class ModelData extends Fragment implements Parcelable {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    private String title;
    private String release;
    private String cast;
    private String director;
    private String overview;
    private String poster;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.release);
        dest.writeString(this.cast);
        dest.writeString(this.director);
        dest.writeString(this.overview);
        dest.writeString(this.poster);
    }

    public ModelData() {
    }

    protected ModelData(Parcel in) {
        this.title = in.readString();
        this.release = in.readString();
        this.cast = in.readString();
        this.director = in.readString();
        this.overview = in.readString();
        this.poster = in.readString();
    }

    public static final Parcelable.Creator<ModelData> CREATOR = new Parcelable.Creator<ModelData>() {
        @Override
        public ModelData createFromParcel(Parcel source) {
            return new ModelData(source);
        }

        @Override
        public ModelData[] newArray(int size) {
            return new ModelData[size];
        }
    };
}

package com.example.rxjavaexample.model;
import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostModel implements Serializable, Parcelable
{

    @SerializedName("userId")
    @Expose
    private Integer userId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("body")
    @Expose
    private String body;
    public final static Parcelable.Creator<PostModel> CREATOR = new Creator<PostModel>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PostModel createFromParcel(Parcel in) {
            return new PostModel(in);
        }

        public PostModel[] newArray(int size) {
            return (new PostModel[size]);
        }

    }
            ;
    private final static long serialVersionUID = -2865234514627241564L;

    protected PostModel(Parcel in) {
        this.userId = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.body = ((String) in.readValue((String.class.getClassLoader())));
    }

    public PostModel() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(userId);
        dest.writeValue(id);
        dest.writeValue(title);
        dest.writeValue(body);
    }

    public int describeContents() {
        return 0;
    }

}

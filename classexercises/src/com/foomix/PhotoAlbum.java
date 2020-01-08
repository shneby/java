package com.foomix;

import java.util.Arrays;
import java.util.Date;

public class PhotoAlbum extends Content {
    private Picture[] photoAlbum = new Picture[0];

    public PhotoAlbum(Date timeAdded) {
        super(timeAdded);
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" +
                "photoAlbum=" + Arrays.toString(photoAlbum) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PhotoAlbum that = (PhotoAlbum) o;
        return Arrays.equals(photoAlbum, that.photoAlbum);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(photoAlbum);
        return result;
    }

    public Picture[] getPhotoAlbum() {
        return photoAlbum;
    }

    public void setPhotoAlbum(Picture[] photoAlbum) {
        this.photoAlbum = photoAlbum;
    }
}

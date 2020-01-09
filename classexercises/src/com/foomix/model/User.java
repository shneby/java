package com.foomix.model;

import com.foomix.model.content.Content;
import com.foomix.model.content.ProfilePicture;

import java.util.*;

public class User {
    private String name;
    private Date birthday;
    private Address address;
    private ProfilePicture profilePicture;
    private User[] friends = new User[0];
    private Content[] content = new Content[0];

    public User(String name, Date birthday, Address address, ProfilePicture profilePicture) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.profilePicture = profilePicture;
    }

    public void addContent(Content content){
        List<Content> contentList = new ArrayList<>(Arrays.asList(this.content));
        contentList.add(content);
        this.content = contentList.toArray(this.content);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name) &&
                birthday.equals(user.birthday) &&
                address.equals(user.address) &&
                profilePicture.equals(user.profilePicture) &&
                Arrays.equals(friends, user.friends) &&
                Arrays.equals(content, user.content);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, birthday, address, profilePicture);
        result = 31 * result + Arrays.hashCode(friends);
        result = 31 * result + Arrays.hashCode(content);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }

    public User[] getFriends() {
        return friends;
    }

    public void setFriends(User[] friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Content[] getContent() {
        return content;
    }

    public void setContent(Content[] content) {
        this.content = content;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }
}

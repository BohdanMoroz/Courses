package ua.courses.homework.Model.Entity;

import java.util.Objects;

public class Note {
//    private String surname;
//    private String name;
//    private String lastName;
//    private String initials; // auto generate
    private String nickname;
//    private String comment;
//    private String gropus; // enum
//    private String group;
//    private String homePhoneNumber;
//    private String mobPhoneNumber;
//    private String mobPhoneNumberAdditional;
//    private String mail;
//    private String skype;
//    private String index;
//    private String city;
//    private String street;
//    private String buildingNumber;
//    private String flatNumber;
//    private String adressFull; // auto generate
//    private String noteDate;
//    private String lastModifyDate;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(nickname, note.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}

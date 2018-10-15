package ua.courses.homework.Model.Entity;

public class Note {
    private String surname;
    private String name;
    private String lastName;
    private String initials; // auto generate
    private String nickname;
    private String comment;
    private String gropus; // enum
    private String group;
    private String homePhoneNumber;
    private String mobPhoneNumber;
    private String mobPhoneNumberAdditional;
    private String mail;
    private String skype;
    private Adress adress;
    private String adressFull; // auto generate
    private String noteDate;
    private String lastModifyDate;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGropus() {
        return gropus;
    }

    public void setGropus(String gropus) {
        this.gropus = gropus;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobPhoneNumber() {
        return mobPhoneNumber;
    }

    public void setMobPhoneNumber(String mobPhoneNumber) {
        this.mobPhoneNumber = mobPhoneNumber;
    }

    public String getMobPhoneNumberAdditional() {
        return mobPhoneNumberAdditional;
    }

    public void setMobPhoneNumberAdditional(String mobPhoneNumberAdditional) {
        this.mobPhoneNumberAdditional = mobPhoneNumberAdditional;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getAdressFull() {
        return adressFull;
    }

    public void setAdressFull(String adressFull) {
        this.adressFull = adressFull;
    }

    public String getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(String noteDate) {
        this.noteDate = noteDate;
    }

    public String getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(String lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }
}
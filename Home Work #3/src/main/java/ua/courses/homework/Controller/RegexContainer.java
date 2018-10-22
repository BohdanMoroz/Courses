package ua.courses.homework.Controller;

public interface RegexContainer {
    //    String REGEX_NAME_UA = "[А-ЩЬЮЯЄІЇа-щьюяєії]+-?[А-ЩЬЮЯЄІЇа-щьюяєії]+";
//    String REGEX_NAME_UA = "[\u0410-\u0429\u0404\u0406\u0407]+-?[А-ЩЬЮЯЄІЇа-щьюяєії]+";
    String REGEX_NAME = "[A-Za-z]+-?[A-Za-z]+";
    String REGEX_NICKNAME = "[A-Za-z0-9]+";
    String REGEX_COMMENT = "[A-Za-z0-9\\-\\_\\+\\=\\*\\/]+";
    String REGEX_MAIL = "^([A-Za-z0-9]+)@([A-Za-z]+)\\.([A-Za-z]{2})$";
    String REGEX_INDEX = "[0-9]{6}";
    String REGEX_BUILDING = "([0-9]{1,3})(\\/+([0-9]{0,3})?([A-Za-z]?))";
    String REGEX_PHONE_HOME = "[0-9]{10}";
    String REGEX_PHONE_MOBILE = "[0-9]{10, 12}";
}

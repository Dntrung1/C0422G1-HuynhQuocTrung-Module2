package common;

import java.time.LocalDate;

public class Check {
    public static boolean checkName(String name){
        String regexName = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)*$";
        return name.matches(regexName);
    }

    public static boolean checkMa(String code){
        String regexCode = "^[A-Za-z\\d]+$";
        return code.matches(regexCode);
    }

    public static boolean checkPhone(String phone) {
        String regexPhoneVN = "^(\\+84|0)[\\s]*[0-9]{9}$";
        return phone.matches(regexPhoneVN);
    }

    public static boolean checkEmail(String email){
        String regexEmail = "^[A-Za-z\\d_]+@[a-z]+.com";
        return email.matches(regexEmail);
    }

    public static boolean checkCMND(String cMND){
        String regexCMND = "^\\d{5}$";
        return cMND.matches(regexCMND);
    }
}

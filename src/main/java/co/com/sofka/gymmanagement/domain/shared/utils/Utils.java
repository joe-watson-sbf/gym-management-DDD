package co.com.sofka.gymmanagement.domain.shared.utils;

import java.util.Objects;

public class Utils {

    public static String requireNonEmptyString(String value){
        value = nonNullString(value);
        if(value.length()<1){
            throw new IllegalArgumentException("Empty String!!!");
        }
        return value;
    }

    private static String nonNullString(String s){
        if(s==null){
            throw new IllegalArgumentException("ERROR: Null String!!!");
        }
        return s.trim();
    }

    public static void NotNullObjet(Object object){
        Objects.requireNonNull(object, "ERROR: Object Null!!!");
    }

}

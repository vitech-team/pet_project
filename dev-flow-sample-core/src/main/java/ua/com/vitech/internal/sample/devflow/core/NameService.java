package ua.com.vitech.internal.sample.devflow.core;

import java.util.Objects;

public class NameService {

    /**
     * Split name by whitespace and return first part.
     *
     * @param fullName full person name
     * @return first part of name
     */
    public String extractFirstName(String fullName) {
        if (Objects.isNull(fullName)) {
            return "";
        }
        return fullName.trim().split(" ")[0];
    }

}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public String solution(String new_id) {
        String answer = upperToRower(new_id);
        answer = removeSpecialCharacters(answer);
        answer = removeDuplicatedComma(answer);
        answer = removeStartEndComma(answer);
        answer = isEmptyString(answer);
        answer = isTooLongString(answer);
        answer = removeStartEndComma(answer);
        answer = isTooShortString(answer);
        return answer;
    }

    //    1단계
    private String upperToRower(String inputId) {
        char[] idToArray = inputId.toCharArray();
        StringBuilder upperToRowerString = new StringBuilder();
        for (char token : idToArray) {
            if ((int) token >= 65 && (int) token <= 90) {
                token += 32;
            }
            upperToRowerString.append(token);
        }
        return upperToRowerString.toString();
    }

    //    2단계
    private String removeSpecialCharacters(String inputId) {
        StringBuilder matchedString = new StringBuilder();
        Pattern pattern = Pattern.compile("[a-z0-9._-]");
        Matcher matcher = pattern.matcher(inputId);
        while (matcher.find()) {
            matchedString.append(matcher.group());
        }
        return matchedString.toString();
    }

    //    3단계
    private String removeDuplicatedComma(String inputId) {
        while (inputId.contains("..")) {
            inputId = inputId.replace("..", ".");
        }
        return inputId;
    }

    //    4단계
    private String removeStartEndComma(String inputId) {
        while (inputId.indexOf(".") == 0) {
            inputId = inputId.substring(1);
        }
        while (inputId.length() > 1 && inputId.lastIndexOf(".") == inputId.length() - 1) {
            inputId = inputId.substring(0, inputId.length() - 1);
        }
        return inputId;
    }

    //    5단계
    private String isEmptyString(String inputId) {
        if (inputId == null || inputId.equals("") || inputId.length() == 0) {
            inputId = "a";
        }
        return inputId;
    }

    //    6단계
    private String isTooLongString(String inputId) {
        if (inputId.length() > 15) {
            inputId = inputId.substring(0, 15);
        }
        return inputId;
    }

    //    7단계
    private String isTooShortString(String inputId) {
        while (inputId.length() <= 2) {
            inputId += inputId.charAt(inputId.length() - 1);
        }
        return inputId;
    }
}
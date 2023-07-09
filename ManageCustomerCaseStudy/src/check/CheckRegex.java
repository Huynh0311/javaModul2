package check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegex {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String Regex_IdPerson = "^\\d{12}$";
    public static final String Regex_Name = "^[A-Za-z][A-Za-z\\s]*$";
    public static final String Regex_PassWord = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&.])[A-Za-z\\d@$!%*?&.]{8,}$";
    public static final String Regex_Age = "^18|[2-9][0-9]$";
    public static final String Regex_Address = "^[a-zA-Z0-9\\s,-]{3,}$";
    public static final String Regex_Phone = "^[0][0-9]{3}-[0-9]{3}-[0-9]{3}$";
    public static final String Regex_IdRoom = "^p|P\\d{1,2}$";

    public boolean validate(String str, String regex) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static void main(String[] args) {
        CheckRegex checkRegex = new CheckRegex();
        String str = "P12";
        System.out.println(checkRegex.validate(str, Regex_IdRoom));
    }
}

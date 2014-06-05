package Chapter9.Exc6;

import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kirill Feoktistov on 06.06.14
 */

public class JavaQuotedStringsFinder {
    private String inputFilePath = "src/main/resources/Chapter9/Exc6/FileWithQuotedStrings.txt";
    private Pattern qoutedStringPattern = Pattern.compile("\\\\{0,2}\".*?\"");

    public void setInputFilePath(String inputFilePath) {
        this.inputFilePath = inputFilePath;
    }

    public void findAll() throws IOException {
        String fileContent = IOUtils.toString(new BufferedInputStream(new FileInputStream(new File(inputFilePath))), "UTF-8");
        findAll(fileContent);
    }

    public void findAll(String fileContent) {
        Matcher matcher = qoutedStringPattern.matcher(fileContent);
        while (matcher.find()) {
            print(matcher.group());
        }
    }

    protected void print(String line) {
        System.out.println(line);
    }
}

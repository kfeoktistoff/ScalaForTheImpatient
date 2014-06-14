package chapter09.exc06;

import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Kirill Feoktistov on 06.06.14
 */

public class JavaQuotedStringsFinderTest {
    @Test
    public void testFindAll() throws IOException {
        String fileContent = "unquoted" +
                "\"" + '\n' +
                "\"\"" + '\n' +
                "\"quoted\"" + '\n' +
                "\\\"slashQuoted\\\"" + '\n' +
                "\\\\\"doubleSlashQuoted\\\\\"" + '\n' +
                "\\\"singleDoubleSlashQuoted\\\\\"" + '\n' +
                "\\\\\"doubleSingleSlashQuoted\\\"";

        List<String> quotedStrings = new ArrayList<>();
        quotedStrings.add("\"\"");
        quotedStrings.add("\"quoted\"");
        quotedStrings.add("\\\"slashQuoted\\\"");
        quotedStrings.add("\\\\\"doubleSlashQuoted\\\\\"");
        quotedStrings.add("\\\"singleDoubleSlashQuoted\\\\\"");
        quotedStrings.add("\\\\\"doubleSingleSlashQuoted\\\"");

        TestJavaQuotedStringsFinder testJavaQuotedStringsFinder = new TestJavaQuotedStringsFinder();
        testJavaQuotedStringsFinder.findAll(fileContent);
        assertTrue(testJavaQuotedStringsFinder.getOutput().equals(quotedStrings));
    }
}

class TestJavaQuotedStringsFinder extends JavaQuotedStringsFinder {
    private List<String> output = new ArrayList<>();

    @Override
    protected void print(String line) {
        output.add(line);
    }

    public List<String> getOutput() {
        return output;
    }
}

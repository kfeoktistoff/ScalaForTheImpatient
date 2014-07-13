package chapter15.exc05;

import org.junit.Test;

/**
 * Created by Kirill Feoktistov on 13.07.14
 */

public class FileContentTest {
    @Test
    public void testRead() {
        new FileContent().read("src/main/resources/chapter15/exc05/reading.txt");
    }
}

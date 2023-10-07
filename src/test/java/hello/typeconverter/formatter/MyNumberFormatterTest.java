package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.*;

public class MyNumberFormatterTest {

    MyNumberFormatter formatter = new MyNumberFormatter();

    @Test
    void parse() throws ParseException {
        Number parse = formatter.parse("1000", Locale.KOREA);
        assertThat(parse).isEqualTo(1000L);
    }

    @Test
    void print(){
        String result = formatter.print(1000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000");
    }
}
package hello.typeconverter.converter;

import hello.typeconverter.type.IpPort;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

    @Test
    void stringToInteger() {
        Integer result = new StringToIntegerConverter().convert("123");
        assertThat(result).isEqualTo(123);
    }

    @Test
    void integerToString() {
        String result = new IntegerToStringConverter().convert(123);
        assertThat(result).isEqualTo("123");
    }

    @Test
    void ipPortToString(){
        String result = new IpPortToStringConverter().convert(new IpPort("127.0.0.1", 8080));
        assertThat(result).isEqualTo("127.0.0.1:8080");
    }

    @Test
    void stringToIpPort() {
        IpPort result = new StringToIpPortConverter().convert("127.0.0.1:8080");
        assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));
    }
}

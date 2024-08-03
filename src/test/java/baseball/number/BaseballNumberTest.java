package baseball.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseballNumberTest {
    @ParameterizedTest
    @ValueSource(strings = {"12", "1234"})
    @DisplayName("문자열이 세글자가 아니면 예외를 던진다.")
    void of_test1(String input) {
        assertThatThrownBy(() -> BaseballNumber.of(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("세 글자를 입력해야 합니다.");
    }

    @Test
    @DisplayName("숫자로 이루어진 세글자 문자열이 들어오면 BaseballNumber 객체를 리턴한다.")
    void of_test2() {
        String input = "123";

        BaseballNumber baseballNumber = BaseballNumber.of(input);

        assertThat(baseballNumber.getClass()).isEqualTo(BaseballNumber.class);
    }
}

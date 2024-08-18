package baseball.game.number;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DigitTest {

    @Test
    @DisplayName("0이 들어오면 예외를 던진다.")
    void from_test1() {
        char input = '0';
        assertThatThrownBy(() -> Digit.from(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자[1-9]를 입력해야 합니다.");
    }

    @ParameterizedTest
    @ValueSource(chars = {'1', '2', '3', '4','5','6','7','8','9'})
    @DisplayName("숫자로 이루어진 char형 input이 들어오면 Digit 객체를 리턴한다.")
    void from_test2(char input) {
        Digit digit = Digit.from(input);

        assertThat(digit.getClass()).isEqualTo(Digit.class);
    }
}

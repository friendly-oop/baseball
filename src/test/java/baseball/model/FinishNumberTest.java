package baseball.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FinishNumberTest {
    @DisplayName("1, 2가 아닌 다른 값이 들어오면 예외를 던진다.")
    void of_test1() {
        String input = "3";
        assertThatThrownBy(() -> FinishNumber.of(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1 혹은 2를 입력해야 합니다.");
    }


    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    @DisplayName("숫자로 이루어진 char형 input이 들어오면 Digit 객체를 리턴한다.")
    void of_test2(String input) {
        FinishNumber finishNumber = FinishNumber.of(input);

        assertThat(finishNumber.getClass()).isEqualTo(FinishNumber.class);
    }
}
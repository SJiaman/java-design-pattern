package calculator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 14:46
 * @desc
 */
public interface Calculator {
    // Create Memento
    PreviousCalculationToCareTaker backupLastCalculation();

    // setMemento
    void restorePreviousCalculation(PreviousCalculationToCareTaker memento);

    int getCalculationResult();

    void setFirstNumber(int firstNumber);

    void setSecondNumber(int secondNumber);
}

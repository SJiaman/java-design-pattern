package calculator;

/**
 * @author Tian Changqing
 * @date 2022/11/11 14:48
 * @desc
 */
public class PreviousCalculationImp implements PreviousCalculationToCareTaker, PreviousCalculationToOriginator {

    private int firstNumber;
    private int secondNumber;

    public PreviousCalculationImp(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }
}
package racingcar.view;

public class OutputView {

    private static OutputView outputView;

    private OutputView() {
    }

    public static OutputView getInstance() {
        if (outputView == null) {
            outputView = new OutputView();
        }
        return outputView;
    }

    public void printEnterCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printEnterMoveCount() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printExecResult() {
        System.out.println("실행 결과");
    }
}

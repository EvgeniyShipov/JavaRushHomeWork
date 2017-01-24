package com.javarush.test.level24.lesson04.home02;

/* Black box
1. Восстановите логику метода someAction для поля solutionAction.
2. Пример вывода смотрите коментарием к методу main.
3. Подсказка: метод someAction анонимного класса поля solutionAction должен вызвать метод сабкласса FirstClass,
если param > 0, иначе вызвать метод сабкласса SecondClass
4. Свои строки создавать нельзя.
5. Классы Action, FirstClass, SecondClass менять нельзя.
*/
public class Solution implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {

        public void someAction() {
            if (param > 0) {
                while (param > 0) {
                    System.out.println(param);
                    param--;
                }
                FirstClass fc = new FirstClass() {
                    public Action getDependantAction() {
                        return new SecondClass();
                    }
                };
                fc.someAction();
                fc.getDependantAction().someAction();
                System.out.print(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM);
                System.out.print(param);
                System.out.println();
            } else {
                new SecondClass().someAction();
                System.out.print(SecondClass.SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM);
                System.out.print(param);
                System.out.println();
            }
        }
    };

    public Solution(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        Solution solution = new Solution(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new Solution(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}
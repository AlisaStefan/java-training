package code._4_student_effort;

public class DescBubbleSort extends  TemplateMethodBubbleSort {

    @Override
    boolean numebersIncorrectOrder(Integer i1, Integer i2) {
        return i1<i2;
    }
}

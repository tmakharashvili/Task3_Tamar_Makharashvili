public class Task5 {
    public static void main(String[] args) {
        double [] scores = {5, 6, 7, 8, 10};
        double [] weights = {0.1, 0.2, 0.3, 0.4, 0.5};

        double shewoniliJami = (scores[0] * weights[0]) +
                                (scores[1] * weights[1]) +
                                (scores[2] * weights[2]) +
                                (scores[3] * weights[3]) +
                                (scores[4] * weights[4]);

        double wonisJami = weights[0] + weights[1] + weights[2] + weights[3] + weights[4];

        double sashualoShewoniliJami = shewoniliJami / wonisJami;
        System.out.println(sashualoShewoniliJami);
    }
}

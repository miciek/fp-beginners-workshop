public class Intro {
    public static class Soup {}

    public static int add(int a, int b) {
        return a + b;
    }

    public static int increment(int x) {
        return x + 1;
    }

    public static char getFirstCharacter(String s) {
        return s.charAt(0);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void eatSoup(Soup soup) {
        // TODO: “eating the soup” algorithm
    }

    public static int calculateScore(String word)  {
        int score = 0;
        for(char c : word.toCharArray()) {
            score++;
        }
        return score;
    }

    public static int score(String word)  {
        return word.length();
    }

    // Exercise: Imperative vs Declarative

    public static void main(String[] args) {
        assert(add(2, 4) == 6);
        System.out.println(add(2, 4));

        assert(increment(6) == 7);
        System.out.println(increment(6));

        assert(getFirstCharacter("Ola") == 'O');
        System.out.println(getFirstCharacter("Ola"));

        assert(divide(12, 2) == 6);
        System.out.println(divide(12, 2));

        eatSoup(new Soup());

        assert(score("imperative") == 10);
        System.out.println(calculateScore("imperative"));

        assert(score("declarative") == 11);
        System.out.println(score("declarative"));
    }
}

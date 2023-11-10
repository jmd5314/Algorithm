public class LCMAndGCD {
        //최대 공약수를 구하는 메서드
        private static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
        // 최소공배수를 구하는 메서드
        private static int lcm(int a, int b) {
            return Math.abs(a * b) / gcd(a, b);
        }
}

public class Fibonacci {
    private Integer number;

    public Fibonacci(Integer number) {
        this.number = number;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public int calculateFibonacci(Integer number) {
        if (number <= 1) {
            return number;
        } else {
            return calculateFibonacci(number - 1) + calculateFibonacci(number - 2);
        }
    }
    public String text() {
        StringBuilder sb = new StringBuilder();
        sb.append("O ");
        sb.append(number);
        sb.append("° número de Fibonacci é: ");
        sb.append(calculateFibonacci(number));
        return sb.toString();
    }
}

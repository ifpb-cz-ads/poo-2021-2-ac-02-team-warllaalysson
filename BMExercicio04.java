public class BMExercicio04 {
    public static void main(String[] args) {

        long long1 = 100;
        int int1 = 200;
        int int2;

        // int2 = int1 + long1;
        // Erro de compilação pois não é possível somar 2 variavéis sendo uma int e
        // outra long.

        int2 = int1 + (int) long1;
        // Para não ocorrer mais erro basta realizar a conversão de long para int.
    }
}

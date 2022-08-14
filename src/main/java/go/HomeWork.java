package go;


public class HomeWork {
    public static void main(String[] args) {

        //поля класса
        byte aByte = 127; // -128/127
        short aShort = -32768; // -32768/32767
        int aInt = 2147483647; // -2147483648/2147483647
        long aLong = -9223372036854775808L; // -9223372036854775808/9223372036854775807
        char aChar = 'a';
        float aFloat = 0.1F;
        double aDouble = 0.2;
        boolean aBoolean = false;
        int array[][] = {{1, 2, 3, 4, 5, 6, 7},
                         {8, 9, 10, 11, 12, 13, 14}};
        int x = 1;

        //переполнение целочисленных примитивных типов
        aByte += 1;
        System.out.println(aByte);

        aShort -= 1;
        System.out.println(aShort);

        aInt += 1;
        System.out.println(aInt);

        aLong -= 1;
        System.out.println(aLong);

        //арифметические операции
        aInt = aByte + 1;
        aInt = aShort - 1;
        aInt--;
        aInt++;
        aInt /= aByte;
        aInt %= aByte;
        aLong = (((long) aInt * aByte) % aShort)/2;
        System.out.println(aInt);

        //логические операторы
        for (int i = 0; i < 2; i++ ){
            for (int j= 0; j < 7; j++){
                if((array[i][j] > 0) && (array[i][j] < 8)){
                    System.out.println("число из первой строчки");
                }else {
                    System.out.println("число из второй строчки");
                }
            }
        }

        //комбинация вычисления типо данных
        aDouble = aFloat / aInt;
        System.out.println(aDouble);

        aInt = (int) aDouble / (int) aFloat;
        System.out.println(aInt);

        Test test = new Test();
        test.readName("Name");
    }


}

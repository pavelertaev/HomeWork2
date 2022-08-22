public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork 2!");
        // Задание номер 1

        int dog = 7;
        byte cat = 2;
        long people = 376L;
        double sugarWeight = 2.5;
        float applesWeight = 3.85f;
        short mouse = 5;
        boolean catIsAdult = cat > 4;
        char bar = 25 ;
        System.out.println(catIsAdult);


        //Задание номер 2
       double boxer1 = 78.2;
       double boxer2 = 82.7;
       double boxersWeight = boxer1 + boxer2;
       double boxersDifference = boxer2 - boxer1;
       System.out.println("Общий вес боксеров " + boxersWeight + "кг");
       System.out.println("Разница между весами боксеров " + boxersDifference + "кг");


        //Задание номер 3
        int bananas = 5;
        int bananaWeight = 80;
        int bananasAllWeight = bananas * bananaWeight;
        int milk = 2;
        int milkWeight = 105;
        int milkAllWeight = milk * milkWeight;
        int iceCream = 2;
        int iceCreamWeight = 105;
        int iceCreamAllWeight = iceCream * iceCreamWeight;
        int eggs = 4 ;
        int eggWeight = 70;
        int eggsAllWeight = eggs * eggWeight;
        int grPerKg = 1000;
        int weightGr = bananasAllWeight + milkAllWeight + iceCreamAllWeight + eggsAllWeight ;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Общий вес завтрака "+ weightGr + " граммов");
        System.out.println("Общий вес завтрака " + weightKg + " кг");



        // Задание номер 4
         int weightKgr = 7;
         int weightGrr = weightKgr * 1000;
         int weightDiet1 = 250;
         int weightDiet2 = 500;
         float daysDiet1 = weightGrr / weightDiet1;
         float  daysDiet2 = weightGrr / weightDiet2;
         System.out.println(weightGrr);
         System.out.println(daysDiet1 + " дней потребуеться чтобы сбросить вес ");
         System.out.println(daysDiet2 + " дней потребуеться чтобы сбросить вес ");

        //Задание номер 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryMasha1 = salaryMasha + ((salaryMasha / 100)*10);
        float salaryDenis1 = salaryDenis + ((salaryDenis /100)*10);
        float salaryKristina1 = salaryKristina + ((salaryKristina / 100)*10);
        float differenceMasha = salaryMasha1 - salaryMasha;
        float differenceDenis = salaryDenis1 - salaryDenis;
        float differenceKristina = salaryKristina1 - salaryKristina;
        System.out.println("Маша теперь получает " + salaryMasha1 + " рублей. " + "Годовой доход вырос на " + differenceMasha + "рублей");
        System.out.println("Денис теперь получает " + salaryDenis1 + "рублей. " + "Годовой доход вырос на " + differenceDenis + "рублей");
        System.out.println("Кристина теперь получает " + salaryKristina1 + "рублей. " + "Годовой доход вырос на " + differenceKristina + "рублей");
    }
        }
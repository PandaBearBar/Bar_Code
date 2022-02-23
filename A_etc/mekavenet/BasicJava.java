package A_etc.mekavenet;

import java.util.Scanner;

public class BasicJava {

    public static void Everything_until_now() {
    /*
        public static void main(String[] args) {
            Scanner I = new Scanner(System.in);
            System.out.println("enter num");
            int a = Integer.parseInt(I.nextLine());
            System.out.println(a);
            int b = 0 ;
            while (a != 0) {
                b = b*10 + a%10;
                a = a/10;
                System.out.println(b);
            }
            System.out.println(b);
        }
    */ //תרגיל 14 פרק 8
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("enter num");
        int a = Integer.parseInt(I.nextLine());
        System.out.println(a);
        int b = 0 ;
        int c = a ;
        while (c != 0) {
            b = b*10 + c%10;
            c = c/10;
        }
        if (a == b) {
            System.out.println("The number is POLINDROM");
        }
        else {
            System.out.println("The number isn't POLINDROM");
        }
    }

 */ // תרגיל 15 פרק 8
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter two num :");
        int a = Integer.parseInt(I.nextLine());
        int b = Integer.parseInt(I.nextLine());
        int c = 0 , i = 0 ;
        while (i != a) {
            i ++ ;
            c = c + b ;
        }
        System.out.println("a times b is :" + c);

    }

 */ //תרגיך 16 פרק 8
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter two num :");
        int a = Integer.parseInt(I.nextLine());
        int b = Integer.parseInt(I.nextLine());
        int d = a,e = a ;
        for (int j = 1 ; j<b ; j++) {
            for (int i =1 ;i < a; i++) {
                e += d;
            }
            d = e ;
        }
        System.out.println(a + " power by " + b + " is : " + c + " " + d + " " + e);
        I.close();
    }
    */ //אני ילד קקה שעשה את תרגיל 17 בפרק 8 רק בחיבור וזה קשה פאק
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("Enter Num : ");
    int a = Integer.parseInt(I.nextLine());
    int b = 1 ;
    for (int i = 1; i <= a ; i++){
        b = i * b ;
        System.out.println( b );
    }
        System.out.println( b );
    }

     *///תרגיל 19 פרק 8
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("Enter your num ");
    int a = Integer.parseInt(I.nextLine());
    int b = 1 , c = 0 , d = 0;
    while (d == 0) {
        c++; b = c * c ;
        System.out.println(b + " , "+ c);
        if (b == a){
            d = 1 ;
        }
        if (a*0.99 < b && b < a*1.01 ){
            d = 1 ;
        }
    }
    System.out.println(c + " Is approximately the square root of " + a );
    }

 *///תרגיל 20 פרק 8
    /*  public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("Enter num");
    int index = Integer.parseInt(I.nextLine());
    int d = 0 , i = 1 , a = 1 ;
        while (index != i) {
            a = a + d;
            d = a - d;
            i++;
        }
        System.out.println("The value in Index : " + index + " is : " + a );
        a = 1 ;  d = 0  ;
        System.out.println("Enter num");
        int value = Integer.parseInt(I.nextLine());
        while (a < value) {
            a = a + d;
            d = a - d;
        }
        System.out.println(a + " is the first value that bigger then : " + value + " in pibonachi");
}

 */// תרגילים 21 ו 22 פרק 8
    /*    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("Enter 3 numbers : ");
    int a = Integer.parseInt(I.nextLine());
    int b = Integer.parseInt(I.nextLine());
    int c = Integer.parseInt(I.nextLine());
    int d,e,f,g = 0 ;
    System.out.println("The number "+ a +"can be devided by : ");
    for (int i = 1 ; i != a ; i++){
        d = a%i ; e = b%i ; f = c%i ;
        if (d == 0){
            System.out.println(i);
        }
        if (e==0&&f==0){
            if(g < i){
                g = i ;
            }
        }
    }
        System.out.println("the biggest number that common between :" + b + " , " + c + " is " + g);
}

 */ //תרגילים 23 ו24 פרק 8
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
        System.out.println("enter 2 num ");
        int a = Integer.parseInt(I.nextLine());
        int b = Integer.parseInt(I.nextLine());
        int i,c;
        if (a >b) {
            i = b;
            c=a;
        }
        else {
            i = a;
            c=b;
        }
        while(i<=c ){
            System.out.println(i);
            i++;
        }


}

 *///תרגיל 24 פרק 8
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    int c = 0,d =1;
    for(int i = 0; i<10; i++){
        System.out.println("Ebter number :" +" ");
        int a = I.nextInt();
        if (c <= a) {
            c = a ;
        }
        else {
            d = 0 ;
            break;
        }
    }
    if (d==1){
        System.out.println("The list is orgenized...");
    }
    else {
        System.out.println("The list is unorgenized...");
    }
}
*///תרגיל 1 פרק 10
    /*
    public static void main(String[] args) {
        int b =0, c=0, d=1 ,a=1;
        Scanner I = new Scanner(System.in);
        for (int i = 0; i<10 ; i++){
            System.out.println("Pls Enter a number");
             a = I.nextInt();
            if (a != c ) {
                b = a ;
                c = c + b;
                System.out.println(b + " , " + c);
            }
            else {
                System.out.println(a);
                d = 0;
                break;
            }
        }
        if (d == 1) {
            System.out.println("There isnt a number that equle to the sum of all the numbers");
        }
        else {
            System.out.println("The number " + a + " is equle to the sum of all the others");
        }
        I.close();
    }

 *///פרק 10 תרגיל 2 דוגרי יש לי תרשימי זרימה עד סוף פרק 10 אבל אין לי כוח לכתוב את הקוד שלהם זה משעמם ...
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
        System.out.println("Enter a Number ");
    int num = I.nextInt();
    int sum = 0 ;
    while (num >= 0) {
        sum += num ;
        System.out.println("Enter a Number ");
        num = I.nextInt();
    }
        System.out.println("The Sum of ur numbers is : " + sum);
        I.close();
    }
*/
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("pls enter a num :");
    System.out.println();
    int num = I.nextInt();
    int a =0 ,b =0;
    for (int i = 1; i<= num ; i++){
        a = num%i;
        if (a==0){
            b ++;
        }
    }
    if (b == 2 ) {
        System.out.println(num + " is prime");
    }
    else {
        System.out.println(num + " isn't prime");
    }
    I.close();
    }
    */
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter Two Numbers ");
        int X = I.nextInt() , Y = I.nextInt(), a = 1 ;
        for (int i =0; i < Y ; i++){
            a = a*X;
        }
        System.out.println(a);
    }

 */
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    int odd = 0, even =0 ;
    for (int i = 0; i < 10 ; i++){
        System.out.println("Enter Number : ");
        int num = I.nextInt();
        if (num%2 == 0){
            even +=num;
        }
        else {
            odd += num;
        }
        }
        System.out.println("The odd sum is "+odd+" The even sum is "+even);
    I.close();
}

 */
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("enter num");
    int a = I.nextInt();
    int n =1;
    for (int i = a ; i > 0 ; i--){
        n = i*n;
    }
        System.out.println(n);
    }

 */
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("Enter Number ");
    int num = I.nextInt();
    while(num>=0){
        for (int i =0; i<num; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("Enter Number ");
        num = I.nextInt();
    }
        System.out.println("THANK YOU FOR USING MY COD...");
    }

 */
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner (System.in);
    System.out.println("Enter A Num : ");
    int Num = I.nextInt();
    int a = Num;
    while (Num>=0){
        if (a>=Num){
            a = Num ;
        }
        System.out.println("Enter A Num : ");
        Num = I.nextInt();

    }
    if (a>=0){
        System.out.println("The MIN is : " + a);
    }
    else {
        System.out.println("NO MIN ! ");
    }

}
 */
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("Pls enter num"); int num = I.nextInt();
    int a = num%10, b = (num/10)%10 , c = num/100 ;
    if (a == b && b == c ){
        System.out.println(num + " is magic number");
    }
    else {
        System.out.println(num + " isn't magic number");
    }
}

 */
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    int a  , b = 0 , c  ;
    for(int i =0;i<10;i++){
        System.out.println("Pls enter num"); int num = I.nextInt();
        c = num ;
        while (c > 0){
            a = c%10 ; c = c /10; b = b*10 + a ;
            System.out.println(b);
        }
        if (b == num){
            System.out.println(num +" is");
        }
        else {
            System.out.println(num + " isn't");
        }
        b =0 ;
    }
    }

 */
    /*
    public static void main(String[] args) {
    Scanner I = new Scanner(System.in);
    System.out.println("pls enter 3 nums");
    int a = I.nextInt();
    int b = I.nextInt();
    int c = I.nextInt();
    if (a<=b && a<=c) {
        System.out.println(a);
    }
    else if (b<=a && b<=c) {
        System.out.println(b);
    }
    else {
        System.out.println(c);
    }
    }

 */ //תרגילים 1 - 10 בתרגילים לקראת המבחן :)
        // שיעור עם קובי :: main kinds ::
    /*    public static void main(String[] args) {
            //bit - logic unit - 0/1 ;
            // Integral Type - ;
            byte a = 10;    // 8 bit;
            short b = 10;  // 16 bit;
            int c = 10;   // 32bit  ;
            long d = 10; //  64 bit ;
            // long


        }

     */
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Please enter name and last name ");
        String name = I.next();
        String last_name = I.next();
        System.out.println("age ? ");
        float age = I.nextFloat();
        System.out.println("city ?");
        String city = I.next();
        System.out.printf("Hello %s %s your age is %.1f and you are from %s\n",name,last_name,age,city);
    }

     */ // תרגיל 1 פרק 6 BASIC JAVA
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Pls enter 3 nums - ");
        int a = I.nextInt();
        int b = I.nextInt();
        int c = I.nextInt();
        System.out.println("\n the sum is : " + (a + b + c));
    }

     */ //תרגיל 2 פרק 6
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Pls enter 3 nums - ");
        float a = I.nextFloat();
        float b = I.nextFloat();
        float c = I.nextFloat();
        float avg = (a+b+c)/3 ;
        System.out.println("THE AVARGE IS : " + avg);
    }

     */ // ת3
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Pls enter nums - ");
        int a = I.nextInt();
        if (a%2 == 0){
            System.out.println(a +" is even");
        }
        else {
            System.out.println(a + " is odd");
        }
    }

     */ //ת 4
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = I.next();
        if(name.startsWith("M")){
            System.out.println("yay");
        }
        else {
            System.out.println("nay");
        }
    }

     */ // ת5
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = I.next();
        if(name.startsWith("m")){
            System.out.println("yay");
        }
        else {
            System.out.println("nay");
        }
    }

     */ // ת6
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Pls enter 3 nums - ");
        int a = I.nextInt();
        int b = I.nextInt();
        int c = I.nextInt();
        System.out.println("The biggest is :"+ Math.max(a, Math.max(b, c)));
        System.out.println("The biggest is :"+ Math.min(a, Math.min(b, c)));
    }

     */ //ת7+8
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Are you sure that you want to exit ? Y / N");
        char v = I.next().charAt(0);

        if (v == 'Y'){
            System.out.println("טוב שהחלטת להישאר");
        }
        else if ( v == 'N'){
            System.out.println( "תודה ולהתראות" );
        }
        else {
            System.out.println( "לא נתמך, תודה להתראות" );
        }
    }

     */ // 9
    /*
    public static void main(String[] args) {
       Scanner I = new Scanner (System.in);
        System.out.println("enter your age :");
       float age = I.nextFloat();
       if (age >= 18){
           System.out.println("Legal");
       }
       else{
           System.out.println("Illegal");
       }
        I.close();
    }

     */ //10
    /*
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int c = (int) (Math.random() * 10) + 1;
        int avg = (a + b + c) / 3;
        System.out.println("Your numbers are - " + " " + a + " " + b + " " + c + " and their sum is : " + (a + b + c) + " their average is : " + avg);
        int d = (int) (Math.random() * 100) + 1;
        if (d % 2 == 0) {
            System.out.println(d + " is even");
        } else if (d % 2 == 1) {
            System.out.println(d + " is odd");
        }
        int e = (int) (Math.random() * 51) + 30;
        if (e % 2 == 0) {
            System.out.println(e + " is even");
        } else if (e % 2 == 1) {
            System.out.println(e + " is odd");
        }
        int f = (int) (Math.random() * 551) + 200;
        int g = (int) (Math.random() * 551) + 200;
        int h = (int) (Math.random() * 551) + 200;
        System.out.println("The biggest number between" + f + " " + g + " " + h + " is : " + Math.max(f, Math.max(g, h)));
        System.out.println("The biggest number between" + f + " " + g + " " + h + " is : " + Math.min(f, Math.min(g, h)));
        int i = (int) (Math.random() * 100) + 1;
        if (i > 50) {
            System.out.println(i + " is bigger then 50");
        }
        int hi = (int) (Math.random() * 10) + 1;
        int le = (int) (Math.random() * 10) + 1;
        int sum = hi * le;
        System.out.printf("The high is %d and your length is %d and the surface of the square is %d", Math.min(hi, le), Math.max(hi, le), sum);
        int R = (int) (Math.random() * 8) + 3;
        float PI = 3.14f ;
        float S = PI*R*R;
        float P = 2*PI*R;
        System.out.printf(" \n ur R is %d the surface is %.3f and the ekef %.3f",R , S , P );
        int j = (int) (Math.random() * 21) -10;
        System.out.println("\n" + j);

    }

     */ // ch 9.1 1-10
    /*
    public static void main(String[] args) {
        String part1 = "There will be", part2 = "people for dinner.", visitors = "5";
        System.out.printf("%s %s %s", part1, visitors, part2);
        int a = (int) (Math.random() * 100) + 1;
        int b = (int) (Math.random() * 100) + 1;
        int sum = a + b, avg = (a + b) / 2, s = a * b, p = a + b;
        System.out.printf("\n a is %d b is %d sum is %d avg is %d a/10 is %.1f b/10 is %.1f surface is %d ekef %d ", a, b, sum, avg, ((float) a / 10), ((float) b / 10), s, p);
        int c = (int) (Math.random() * 251) + 100;
        int hour = c / 60, min = c % 60;
        System.out.println("\n" + c);
        System.out.printf("The movie is %d hours and %d minutes", hour, min);
        int d = (int) (Math.random() * 100) + 1;
        int e = (int) (Math.random() * 100) + 1;
        int avg2 = (d + e) / 2, sum2 = d + e;
        System.out.printf("the max is %d the min is %d the avg is %d and the sum of them is %d ", Math.max(d, e), Math.min(d, e), avg2, sum2);
        if (sum % 2 == 0) {
            System.out.println(sum + " is even");
        } else if (sum % 2 == 1) {
            System.out.println(sum + " is odd");
        }
        int f = (int) (Math.random() * 551) + 200;
        int g = (int) (Math.random() * 551) + 200;
        int h = (int) (Math.random() * 551) + 200;
        System.out.println("The biggest number between " + f + " " + g + " " + h + " is : " + Math.max(f, Math.max(g, h)));
        int max = Math.max(f, Math.max(g, h));
        if (max % 2 == 0) {
            System.out.println(max + " is even");
        } else if (max % 2 == 1) {
            System.out.println(max + " is odd");
        }

    }

     *///1-5 ch 3
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("pls enter your name : ");
        String name = I.next();
        System.out.println("pls enter your team name : ");
        String team = I.next();
        System.out.println("pls enter your age  : ");
        float age = I.nextFloat();
        int random = (int) (Math.random() * 851) + 150;
        System.out.printf("Hello %s! you are %.1f years and you played in %s and done %d goals ", name, age, team, random);
        if (random >= 600) {
            System.out.println("WOW!!!!");
        }

        I.close();


    }
     */ // ch 3 targil 6
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Pls enter weight (in kg), height (in cm) and a random number :");
        float weight = I.nextFloat(), height = I.nextFloat(), c = I.nextFloat();
        float BMI = (float) (weight/Math.pow(height/100,2));
        int a = (int)Math.pow(weight, 2);
        int b = (int)Math.pow(height, 2);
        int d = (int)Math.pow(c, 2);
        System.out.printf("The pow of your numbers %d, %d and %d and your BMI is %.2f",a,b,d,BMI);
    }

     */ //7+8
    /*
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("number pls : ");
        int num = I.nextInt();
        int replace = 0 ;
        for (int i = 1; i < 5; i++) {
            if (replace <=num) {
                 replace = num;
            }
            System.out.println("number pls : ");
            num = I.nextInt();
        }
    }

     */  //9
    /*
    public static void main(String[] args) {
        int Max = 0 ;
        for (int i = 0; i < 5; i++) {
            int random = (int)(Math.random()*11 )+10;
             Max = (Math.max(random, Max));
            System.out.print(random + " ");
        }
        System.out.println("The biggest number is " + Max);
    }

     *///10
    }


    public static int random(int range, int r_start) {
        int a = (int) (Math.random() * (range)) + r_start;
        return a;
    }

    public static int Enter_Num() {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter A Num :");
        int Num = I.nextInt();
        I.close();
        return Num;
    }

    public static char Continue() {
        Scanner I = new Scanner(System.in);
        System.out.println("Hello User Would you like to continue ? Y/N");
        char answer = I.next().toUpperCase().charAt(0);
        if (answer != 'Y')
            System.out.println("BYE");
        I.close();
        return answer;
    }

    public static void EX1_2() {
        int a = random(101, 0);
        if (a > 50) {
            System.out.println("Big");
        } else if (a < 50) {
            System.out.println("Small");
        } else {
            System.out.println("Bingo");
        }
        System.out.println(a);
    }

    public static void EX3() {
        float sal = random(1001, 5000);
        if (sal * 1.1 > 6000) {
            sal *= 1.05f;
        } else {
            sal *= 1.1f;
        }
        System.out.printf("you got an upgrade to %.1f", sal);
    }

    public static void EX4() {
        int a = Enter_Num(), b = Enter_Num(), c = Enter_Num();
        int max = Math.max(a, Math.max(b, c)), min = Math.min(a, Math.min(b, c));
        int middle = a + b + c - max - min;
        System.out.printf("%d is the biggest", max);
        System.out.printf("%d is the smallest", Math.pow(min, 3));
        System.out.printf("%d is the middle is", middle);

    }

    public static void EX5() {
        float sal = random(120_001, 0);
        float tax = 0;
        if (sal < 23_000) {
            tax = sal * 0.1f;
        } else if (50_000 > sal) {
            tax = sal * 0.2f;
        } else if (100_000 > sal) {
            tax = sal * 0.3f;
        } else {
            tax = sal * 0.4f;
        }
        System.out.println(sal + " , " + tax + " , " + (sal - tax));
    }

    public static void EX6() {
        double sal = random(120_001, 0), tax = 0, neto = 0;
        int step = 0;
        if (sal > 23_000) {
            step++;
            if (sal > 50_000) {
                step++;
                if (sal > 100_000) {
                    step++;
                }
            }
        }
        switch (step) {
            case 0:
                tax = sal * 0.1;
                neto = sal - tax;
                break;
            case 1:
                tax = 2300 + ((sal - 23_000) * 0.2);
                neto = sal - tax;
                break;
            case 2:
                tax = 2300 + 5400 + ((sal - 50_000) * 0.3);
                neto = sal - tax;
                break;
            case 3:
                tax = 2300 + 5400 + 15_000 + ((sal - 100_000) * 0.4);
                neto = sal - tax;
                break;
        }
        System.out.printf("your neto is %.2f and your tax is %.2f \n", neto, tax);
    }

    public static void EX7_8_9() {
        byte leap;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a year ? ");
        int year = scanner.nextInt();
        System.out.println("Choose a month");
        int month = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
            leap = 0;
        } else {
            System.out.println(year + " isnt leap year ");
            leap = 1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month have 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month have 30 days");
                break;
            case 2:
                switch (leap) {
                    case 0:
                        System.out.println("this month have 28 days");
                        break;
                    case 1:
                        System.out.println("this month have 29 days");
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        switch (month) {
            case 9:
            case 10:
            case 11:
                System.out.println("this month is at the fall");
                break;
            case 8:
            case 7:
            case 6:
                System.out.println("this month is at the summer");
                break;
            case 4:
            case 3:
            case 5:
                System.out.println("this month is at the winter");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("this month is at the spring");
                break;

        }
    }

    /*
        public static void main(String[] args) {

            System.out.println("Choose an exercise to present bewteen 1 - 6 \n(if u want to stop pls write anything else)");
            switch (Enter_Num()) {
                case 1:
                case 2:
                    EX1_2();
                    break;
                case 3:
                    EX3();
                    break;
                case 4:
                    EX4();
                    break;
                case 5:
                    EX5();
                    break;
                case 6:
                    EX6();
                    break;
                case 7:
                case 8:
                case 9:
                    EX7_8_9();
                    break;
                default:
                    break;
            }

        }
    */
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("pls enter ur age ");
        float age = I.nextFloat();
        String a = "u can enter ", b = "cant enter ";
        String answer = age >= 21 ? a : b;
        System.out.println(answer);

    }
}
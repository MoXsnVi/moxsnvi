public class demo5 {
    public static void main(String[] args) {
        //已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份
        int a =2019;
        while (a>=1949){
            a =a-11;
            int b =a-1949;
            if (b>=0){
                System.out.println(a);}
        }
    }
}

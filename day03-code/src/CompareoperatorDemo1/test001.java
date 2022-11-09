package CompareoperatorDemo1;

public class test001 {
    public static void main(String[] args) {
        //1.定义父亲身高
        double father = 177;
        //2.定义母亲身高
        double mother = 165;
        //3.利用公式计算儿子身高
        double son = (father + mother) * 1.08 / 2;
        //4.利用公式计算女儿身高
        double daughter = (father * 0.923 + mother) / 2;
        //5.打印结果
        System.out.println("儿子预计身高" + son + "厘米");
        System.out.println("女儿预计身高" + daughter + "厘米");

    }
}

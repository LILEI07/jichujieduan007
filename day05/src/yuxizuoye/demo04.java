package yuxizuoye;/*yuxizuoye
@ClassName：demo04
@Description：test
//
@date：2021/9/3 19:33
@作者：李磊
@Version：21.0*/
/*
循环求1-100的偶数和(for循环、求和变量)
 */
public class demo04 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i < 101; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("1~100的偶数和是:"+sum);

    }
}

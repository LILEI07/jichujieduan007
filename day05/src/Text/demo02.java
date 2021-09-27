package Text;/*Text
@ClassName：demo02
@Description：test
//
@date：2021/9/4 9:52
@作者：李磊
@Version：21.0*/

public class demo02 {
    public static void main(String[] args) {
        int panduan=50;
        jiouxing(panduan);
    }

    public static void jiouxing(int num) {
        if(num%2!=0){
            System.out.println(num+"是奇数");
        }else{
            System.out.println(num+"是偶数");
        }

    }
}

import java.math.*;
import java.util.*;
class TestMath {
	public static void main(String[] args) {
		//三角函数
		System.out.println("Math.toDegrees(1.57)"+Math.toDegrees(1.57));
		System.out.println("Math.toRadians(90)"+Math.toRadians(90));
		System.out.println("Math.acos(0.3)"+Math.acos(0.3));
		System.out.println("Math.asin(0.8)"+Math.asin(0.8));
		System.out.println("Math.atan(2.3)"+Math.atan(2.3));
		System.out.println("Math.cos(1.57)"+Math.cos(1.57));
		//计算值的双曲余玄
		System.out.println("Math.cosh(1.2)"+Math.cosh(1.2));
		System.out.println("Math.sin(1.57)"+Math.sin(1.57));
		System.out.println("Math.sinh(1.2)"+Math.sinh(1.2));
		System.out.println("Math.tan(0.8)"+Math.tan(0.8));
		System.out.println("Math.tanh(2.1)"+Math.tanh(1.2));
		//将矩形坐标(x,y)转换成极坐标(r,thet)
		System.out.println("Math.atan2(0.1,0.2)"+Math.atan2(0.1,0.2));
		//取整运算
		System.out.println("Math.floor(-1.2)"+Math.floor(-1.2));
		System.out.println("Math.ceil(1.2)"+Math.ceil(1.2));
		System.out.println("Math.round(2.3)"+Math.round(2.3));
		System.out.println("Math.sqrt(2.3)"+Math.sqrt(2.3));
		//计算立方根
		System.out.println("Math.cbrt(9)"+Math.cbrt(9));
		System.out.println("Math.exp(2)"+Math.exp(2));
		System.out.println("Math.pow(3,2)"+Math.pow(3,2));
		System.out.println("Math.log(12)"+Math.log(12));
		System.out.println("Math.copySign(1.2,-0.1)"+Math.copySign(1.2,-0.1));
		System.out.println("Math.nextAfter(1.2,1.0)"+Math.nextAfter(1.2,1.0));
		System.out.println("Math.nextUp(1.2)"+Math.nextUp(1.2));
		System.out.println("Math.random():"+Math.random());


	}

}



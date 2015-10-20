import java.util.EnumSet;

enum Month
{
	SPRING,SUMMER,FALL,WINTER
}
public class EnumSetDemo
{

	public static void main(String[] args)
	{
		//����һ��Enum���ϣ�����Ԫ�ؾ���Seasonö�ٵ�ȫ��ö��ֵ
		EnumSet  es1=EnumSet.allOf(Month.class);
		//�������
		System.out.println(es1);
		//����һ��EnumSet�ռ��ϣ�ָ���𼯺�Ԫ��Month���ö��ֵ
		EnumSet es2=EnumSet.noneOf(Month.class);
       System.out.println(es2);
       //���Ԫ��
       es2.add(Month.WINTER);
       es2.add(Month.SUMMER);
       System.out.println(es2);
      //��ָ����ö��ֵ����EnumSet����
       EnumSet  es3=EnumSet.of(Month.SUMMER , Month.FALL);
       System.out.println(es3);
       EnumSet es4=EnumSet.range(Month.SPRING, Month.WINTER);
       System.out.println(es4);
       //�´�����EnumSet���ϵ�Ԫ�غ�es4���ϵ�Ԫ������ͬ����
       //es5�ļ���Ԫ��+es4����Ԫ��= monthȫ����ö��ֵ
       EnumSet es5=EnumSet.complementOf(es4);
       System.out.println(es5);
       
	}

}

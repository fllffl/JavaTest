package happy;

public class helloworld {
    public static void main(String[] args) {
        People LiLei = new People();    //������һ��People����LiLei

        //����setter����Ϊ���Ը�ֵ
        LiLei.setHeight(170.0);

        //����getter����ȡ����ֵ
        System.out.println("LiLei�������"+LiLei.getHeight());
    }
}
class People {
	//���ԣ���Ա��������ʲô��ǰ������˷������η�private
	//�����˽�����ԣ�����ͨ����������
	    private double height;     //���

	//�����Ѿ���װ���ˣ�����û���Ҫ��������
	//������getter��setter�������е���
	//getter��setter������Ҫ����Ա�Լ�����
	    public double getHeight(){    
	    //getter ����������get�ؼ��ּ�������������������ĸ��д��
	    //getter ����һ����Ϊ�˵õ�����ֵ
	        return height;
	    }

	//ͬ���������ǵ�setter����
	//setter ����������set�ؼ��ּ�������������ĸ��д��
	//setter ����һ���Ǹ�����ֵ��ֵ��������һ������
	    public void setHeight(double newHeight){
	        height = newHeight;
	    }
	}

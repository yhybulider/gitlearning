package lianxi;
//print println printf������println�����һ�㶼�ỻ�еģ�print֮�������printf������
public class printf {
    public static void main(String[] args) {
        //����һЩ��������������ʽ���������
        double a=848.234;//double���޷�ǿ������ת��ΪString�ͣ�
        float d=(float) a;
        String b="nihao";
        int c=111;
        char e='.';
        System.out.print("����ַ���");
        System.out.printf("%c",e);//"%c"���һ���ַ���
        System.out.println();
        //��%����ʾ���и�ʽ���������%��֮�������Ϊ��ʽ���Ķ��塣
        System.out.println("�����ȸ�����:"+d);/*�����ȸ�����ռ32λ�洢�ռ䣬��һЩ
        �������ϱ�˫���ȸ������ֻռ��˫����һ��Ŀռ䣬���ǵ�ֵ�ܴ���С��ʱ����
        ����ò�׼ȷ*/
        System.out.println("˫������:"+a);/*˫������ռ64λ�洢�ռ䣬��һЩ�ִ�����
        ���Ż��������и�����ѧ����Ĵ������ϱȵ����ȵĿ죬����Ҫ���ֶ�η�����������
        ��׼ȷ��ʱ�����ڲ���ֵ�ܴ������ʱ��˫��������õ�ѡ��*/
        System.out.print("��ʽ�����������:");
        System.out.printf("%f",a);//��ʽ�������������
        System.out.println();
        System.out.print("�������Ϊ9��С�������λ��ֵ��");
        System.out.printf("%9.2f",a);/*��9.2���е�9��ʾ����ĳ��ȣ�2��ʾС������
        λ��,���б�����Ҳռһλ*/
        System.out.println();
        System.out.print("�������Ϊ9��С�������λ��ֵ��");
        System.out.printf("%9.2f000000",a);//ָ��λ����0
        System.out.println();
        System.out.print("�������Ϊ9��С�������λ,�������ŵ�ֵ��");
        System.out.printf("%+9.2f",a);//��+����ʾ��������������š�
        System.out.println();
        System.out.print("�������Ϊ9��С�������λ,����루Ĭ��Ϊ�Ҷ��룩��ֵ��");
        System.out.printf("%-9.2f",a);//��-����ʾ�����������루Ĭ��Ϊ�Ҷ��룩��
        System.out.println();
        System.out.print("�������Ϊ9��С�������λ,�����ţ�����루Ĭ��Ϊ�Ҷ��룩��ֵ��");
        System.out.printf("%+-9.2f",a);//��+-����ʾ�����������루Ĭ��Ϊ�Ҷ��룩��
        //������ָ����ʽ���
        System.out.println();
        System.out.print("���ʮ��������:");
        System.out.printf("%d",c);//��%d����ʾ���ʮ����������
        System.out.println();
        System.out.print("������Ϊ10��ʮ��������:");
        System.out.printf("%10d",c);/*��%md����ʾ������Ϊm��ʮ�����������������
        ��λ��С��m������˲��Կո�������m����ʵ��λ�����������������Ҳ��������*/
        System.out.println();
        System.out.print("�������������:");
        System.out.printf("%1d",c);//��%1d����ʾ������������ݣ�ǰ���������1��
        System.out.println();
        System.out.print("����˽�������:");
        System.out.printf("%o",c);//��%o����ʾ����˽���������//"%u"���ʮ������ʽ�޷�ʹ�á�
        System.out.println();
        System.out.print("������а˽��Ʊ�־������:");
        System.out.printf("%#o",c);//��%#o����ʾ������а˽��Ʊ�־����������־������0
        System.out.println();
        System.out.print("���ʮ����������:");
        System.out.printf("%x",c);//��%x����ʾ����˽���������
        System.out.println();
        System.out.print("�������ʮ�����Ʊ�־������:");
        System.out.printf("%#x",c);//��%#x����ʾ�������ʮ�����Ʊ�־��������־����־��һλ������0��
        //printf����������������ƣ����������·�ʽ���������
        System.out.println("ʮ����ת��Ϊ�����ƣ�"+Integer.toBinaryString(c));
        //���ַ���Ҳ��������˽��ƣ�ʮ�����ƣ��ֱ����£��������Խ���������ת��Ϊʮ����
        System.out.println("ʮ����ת��Ϊ�˽��ƣ�"+Integer.toOctalString(c));
        System.out.println("ʮ����ת��Ϊʮ�����ƣ�"+Integer.toHexString(c));
        //����ķ���ֻ�����ڽ���������ת��Ϊʮ����
        System.out.println("���һ������������ʮ���Ʊ�ʾ��"+Integer.valueOf("111001",2));
        System.out.println("���һ���˽�������ʮ���Ʊ�ʾ��"+Integer.valueOf("111001",8));
        System.out.println("���һ��ʮ����������ʮ���Ʊ�ʾ��"+Integer.valueOf("111001",16));
        System.out.print("����ַ�����");
        System.out.printf("%s",b);//"%s"��ʾ����ַ������������Ϊ�ַ���ʱ����%s������ʡȥ��
        System.out.println();
        System.out.print("���ռm�е��ַ�����");
        System.out.printf("%13s",b);/*"%ms"��ʾ������ַ���ռm�У����ַ��������ȴ���m�������
        ԭ�ַ���;�������С��m�����󲹿ո�*/
        System.out.println();
        System.out.print("���ռm�е��Ҷ�����ַ�����");
        System.out.printf("%-13s",b);/*-��ʾ�ַ����Ҷ���*/
        System.out.println();
        System.out.print("���ռm�У���ֻȡ�ַ��������n���ַ��ĵ��ַ�����");
        System.out.printf("%13.3s",b);/*"%m.n"��ʾ���ռm�У���ֻȡ�ַ��������n���ַ����Ҷ���*/
        System.out.println();
        System.out.print("���ռm�У���ֻȡ�ַ��������n���ַ����Ҷ�����ַ�����");
        System.out.printf("%-13.3s",b);/*-��ʾ�ַ����Ҷ���*/
        System.out.println();
        System.out.printf("���һ��������: %f,һ���ַ���: %s,һ������: %d",a,b,c);
        //������������������һ��Ҫע��˳��Ҫ©������
        System.out.println();
        System.out.printf("�ַ�����%2$s,%3$d��ʮ��������:%3$#x,˫����%1$1f�ĵ����ȸ����ͱ�ʾ:%1$f",a,b,c);
        //˫���ȵĸ�ʽ���Ϊ����1��f��"X$��ʾ�ڼ���������ָ������һ�к�������ı����ĵڼ�����
    }
    
}

package homework_second;
import java.util.Scanner;
public class homework_3_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
        float x1=scan.nextFloat();
        float y1=scan.nextFloat();
        float w1=scan.nextFloat();
        float h1=scan.nextFloat();	
        System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
        float x2=scan.nextFloat();
        float y2=scan.nextFloat();
        float w2=scan.nextFloat();
        float h2=scan.nextFloat();
        scan.close();
        float e1=x2-w2/2;//r2��߽�
        float e2=x1-w1/2;//r1��߽�
        float e3=x2+w2/2;//r2�ұ߽�
        float e4=x1+w1/2;//r1�ұ߽�
        
        float e5=y2-h2/2;//r2�±߽�
        float e6=y1-h1/2;//r1�±߽�
        float e7=y2+h2/2;//r2�ϱ߽�
        float e8=y1+h1/2;//r1�ϱ߽�
        
        if (e1>=e2 && e3<=e4 && e5>=e6 && e7<=e8) {
        	System.out.println("r2 is insider r1");
        }
        else if((e1>=e2&&e1<=e4&&e3>e4)||(e3<=e4&&e3>=e2&&e1<e2)||(e5>=e6&&e5<=e8&&e7>e8||(e7>=e6&&e7<=e8||e5<e6))){
        	System.out.println("r2 overlaps r1");
        }
        else {
        	System.out.println("r2 does not overlaps r1");
        }
	}

}

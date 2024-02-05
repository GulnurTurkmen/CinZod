package CinZod;
import java.util.Scanner;
public class CinZod {
	public static void main(String[]args) {
		int dogumYili;
		int oran;
		Scanner inp = new Scanner(System.in);
		System.out.print("doğum yılınızı giriniz:");
		dogumYili = inp.nextInt();
		oran = dogumYili%12;
		switch(oran) {
		case 0:
			System.out.print("maymun burcu");
			break;
		case 1:
			System.out.print("horoz burcu");
			break;
		case 2:
			System.out.print("köpek burcu");
			break;
		case 3:
			System.out.print("domuz burcu");
			break;
		case 4:
			System.out.print("fare burcu");
			break;
		case 5:
			System.out.print("öküz burcu");
			break;
		case 6:
			System.out.print("kaplan burcu");
			break;
		case 7:
			System.out.print("tavşan burcu");
			break;
		case 8:
			System.out.print("ejderha burcu");
			break;
		case 9:
			System.out.print("yılan burcu");
			break;
		case 10:
			System.out.print("at burcu");
			break;
		case 11:
			System.out.print("koyun burcu");
			break;
			default:
			System.out.print("veri yanlış");
		}
	}
}

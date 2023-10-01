package kullanicigirisi;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String username, password;

		Scanner scan = new Scanner(System.in);

		String usernameBack = "patika";
		String passwordBack = "1234";

		System.out.print("Kullanıcı adını giriniz: ");
		username = scan.nextLine();

		

		if (username.equals(usernameBack)) {
			
			System.out.print("Parolanızı giriniz: ");
			password = scan.nextLine();
			
			if (password.equals(passwordBack)) {
				System.out.println("Giriş başarılı!");
			} else {
				System.err.println("Şifreniz yanlış girdiniz.");
				System.out.println("Şifrenizi yenilemek ister misiniz? (e,h)");
				String sifreIslem = scan.nextLine();
				
				if(sifreIslem.equals("e")) {
					
					System.out.println("Lütfen yeni şifrenizi giriniz: ");
					String yeniSifre = scan.nextLine();
					
					if(yeniSifre.equals(passwordBack)) {
						System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
					}else {
						System.out.println("Şifre oluşturuldu");
					}					
					
				}else {
					System.out.println("Yanlış şifre girdiniz!");
				}
			}
		} else {
			System.err.println("Kullanıcı adınız yanlış!");
		}

	}

}

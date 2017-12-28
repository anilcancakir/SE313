package headfirst.designpatterns.facade.hometheater;

public class HomeTheaterTestDrive_v02 {
	public static void main(String[] args) {
		
		HomeTheaterFacade_v02 homeTheater = 
				new HomeTheaterFacade_v02();
 
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}

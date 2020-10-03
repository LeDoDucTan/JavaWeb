import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class Reservation {
	private String firstName;
	private String lastName;
	private String Gender;
	public Reservation() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@RequestMapping("/reservation")
	@Controller
	public class ReservationController{
		@RequestMapping("/bookingFrom")
		public String  bookingFrom(Model model) {
			Reservation res = new Reservation();
			model.addAttribute("reservation",res);
			return "reservation-page";
		}
		@RequestMapping("/submitFrom")
		public String submitFrom(@ModelAttribute("reservation") Reservation res) {
			return "confirmation-page";
		}
	}	
}


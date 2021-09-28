import java.util.Calendar;
import java.util.Date;

public class ManipulandoDatas {

	public static void main(String[] args) {
		//Classes Calendar e Date a partir do Java 8 foi substituída por uma API
		//que facilitou a manipulação desse tipo de dado.

//CLASSE DATE
		System.out.println("Apresentado a data com a classe Date:");
		Date date = new Date();
		System.out.println(date);
		System.out.println();
		
		System.out.println("Apresentando milissegundos do Date");
		long milissegundos = date.getTime();
		System.out.println(milissegundos);
		System.out.println();

//CLASSE CALENDAR
		Calendar calendar = Calendar.getInstance();
		calendar.set(1982, 10, 24);
		System.out.println("Calendar apresenta formatação ToString");
		System.out.println(calendar);
		System.out.println();

		//AQUI ESTOU COLOCANDO O calendar em um Date para ficar mais amigável
		Date dateFormatado = calendar.getTime();
		System.out.println("Calendar dentro do Date = Mais amigável");
		System.out.println(dateFormatado);
		
	}
}

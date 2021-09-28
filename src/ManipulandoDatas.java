import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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
		System.out.println("Calendar dentro do Date = Mais amigável");
		Date dateFormatado = calendar.getTime();
		System.out.println(dateFormatado);
		System.out.println();
		

		//ADICIONANDO UM ANO
		calendar.add(Calendar.YEAR, 1);
		System.out.println();

		
		//AQUI ESTOU COLOCANDO O calendar em um Date para ficar mais amigável
		System.out.println("Calendar dentro do Date = Mais amigável");
		Date dateFormatado2 = calendar.getTime();
		System.out.println(dateFormatado2);
		System.out.println();
		
		//FORMATANDO DATA
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String formatacaoCurta = df1.format(dateFormatado2);
		System.out.println("Formato curto: " +formatacaoCurta);

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String formatacaoMedia = df2.format(dateFormatado2);
		System.out.println("Formato médio: " +formatacaoMedia);
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String formatacaoLonga = df3.format(dateFormatado2);
		System.out.println("Formato Longo: " +formatacaoLonga);

		//FORMATANDO A DATA DE ACORDO COM UM PAÍS
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en","US"));
		String formatacaoLongaUS = df4.format(dateFormatado2);
		System.out.println("Formato Longo US: " +formatacaoLongaUS);

	}
}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ManipulandoDatas {

	public static void main(String[] args) {
		// Classes Calendar e Date a partir do Java 8 foi substituída por uma API
		// que facilitou a manipulação desse tipo de dado.

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

		// AQUI ESTOU COLOCANDO O calendar em um Date para ficar mais amigável
		System.out.println("Calendar dentro do Date = Mais amigável");
		Date dateFormatado = calendar.getTime();
		System.out.println(dateFormatado);
		System.out.println();

		// ADICIONANDO UM ANO
		calendar.add(Calendar.YEAR, 1);
		System.out.println();

		// AQUI ESTOU COLOCANDO O calendar em um Date para ficar mais amigável
		System.out.println("Calendar dentro do Date = Mais amigável");
		Date dateFormatado2 = calendar.getTime();
		System.out.println(dateFormatado2);
		System.out.println();

		// FORMATANDO DATA
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String formatacaoCurta = df1.format(dateFormatado2);
		System.out.println("Formato curto: " + formatacaoCurta);
		System.out.println();
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String formatacaoMedia = df2.format(dateFormatado2);
		System.out.println("Formato médio: " + formatacaoMedia);
		System.out.println();
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String formatacaoLonga = df3.format(dateFormatado2);
		System.out.println("Formato Longo: " + formatacaoLonga);
		System.out.println();
		
		// FORMATANDO A DATA DE ACORDO COM UM PAÍS
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
		String formatacaoLongaUS = df4.format(dateFormatado2);
		System.out.println("Formato Longo US: " + formatacaoLongaUS);
		System.out.println();
		
		// FORMATANDO DO MEU JEITO COM SIMPLEDATEFORMAT
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd-MM-yyyy");
		String formatacaoPersonalizada = sdf5.format(dateFormatado2);
		System.out.println("Minha formatação: " + formatacaoPersonalizada);
		System.out.println();
		
		String dataNascimento = "24/11/1982 21:35";
		System.out.println();

		//APRENDENDO A USAR API DATE END TIME
		System.out.println("Data de Nascimento: "+dataNascimento);
		
		//TRANSFORMANDO DATA DE NASCIMENTO EM LOCALDATETIME
		LocalDateTime d1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		//DEFININDO A DATA ATUAL PARA FAZER COMPARAÇÕES
		LocalDateTime d2 = LocalDateTime.now();
		
		//COMPARANDO A DURAÇÃO EM HORAS E DIAS 
		Duration d = Duration.between(d1, d2);
		System.out.println("Horas: "+d.toHours());
		System.out.println("Dias: "+d.toDays());
		
		//COMPARANDO O PERÍODO DE MESES
		Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());
		System.out.println("Meses: "+p.toTotalMonths());
		
		//COMPARANDO COM CHRONOUNIT
		System.out.println("Horas: "+ChronoUnit.HOURS.between(d1, d2));
		System.out.println("Dias: " + ChronoUnit.DAYS.between(d1, d2));
		System.out.println("Semanas: " + ChronoUnit.WEEKS.between(d1, d2));
		System.out.println("Meses: " +ChronoUnit.MONTHS.between(d1, d2));
		System.out.println("Anos: " + ChronoUnit.YEARS.between(d1, d2));
		
		
	}
}

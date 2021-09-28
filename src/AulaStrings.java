import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class AulaStrings {

	public static void main(String[] args) {

//MÓDULO 9 - STRING, DATAS E NÚMEROS
		
//STRING BUILDER
		StringBuilder sb = new StringBuilder();
		String s;

		for (int cont = 0; cont <= 25; cont++) {
			sb.append(cont+", ");
		}
		s = sb.toString();
		
		System.out.println("Dados inseridos na Classe StringBuilder");
		System.out.println(s);
		System.out.println("==========================");
		
	

//FORMATANDO NÚMEROS
		double valor = 2780;

		System.out.println("Formatando para moeda corrente!");
		NumberFormat nb = NumberFormat.getCurrencyInstance();
		String moedaCorrente = nb.format(valor);		
		System.out.println(moedaCorrente);
		System.out.println("==========================");
		
		System.out.println("Formatando para moeda Dollar");
		NumberFormat nb2 = NumberFormat.getCurrencyInstance(new Locale("en","US"));
		String moedaDollar = nb2.format(valor);
		System.out.println(moedaDollar);
		System.out.println("==========================");
		
		System.out.println("Formatando valores");
		NumberFormat nb3 = NumberFormat.getNumberInstance();
		String valorCorrente = nb3.format(valor);
		System.out.println(valorCorrente);
		System.out.println("==========================");
		
		System.out.println("Formatando valor US");
		NumberFormat nb4 = NumberFormat.getNumberInstance(new Locale("en","US"));
		String valorUS = nb4.format(valor);
		System.out.println(valorUS);
		System.out.println("==========================");
		
		System.out.println("Usando Máscara");
		DecimalFormat df1 = new DecimalFormat("00000.000");
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('-');
		df1.setDecimalFormatSymbols(dfs);
		
		String CepFormatado = df1.format(valor);
		System.out.println(CepFormatado);
		
		
		
	}
	
	
}

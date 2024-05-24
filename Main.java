import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		//Scanner link = new Scanner(System.in);
		String link = "https://www.leroymerlin.com.br/cadeira-de-resina-sem-braco-cinza-safira-tramontina_89672296";
		
		try{
			//doc = Jsoup.connect(link.next()).get();
			Document doc = Jsoup.connect(link).get();
			Elements dados = doc.select(".product-title-container");
			Elements tentar = doc.select("table").first().children().select("tr");
			
			Elements img = doc.select("css-1h09ita-current-carousel__image-wrapper e1j8094i0");

			
			String nome = dados.select("div > h1").text();
			System.out.println("Nome: "+nome);
			String s = tentar.text();
			s = s.substring(s.indexOf("Dimensão")+8);
			s = s.substring(0, s.indexOf("Peso"));
			System.out.println("Dimensões: "+s);
			
		}catch (Exception e) {
			System.out.println("Falha na requisição");
		}
		

	}

}
//link teste
//https://www.leroymerlin.com.br/cadeira-de-resina-sem-braco-cinza-safira-tramontina_89672296
/// 
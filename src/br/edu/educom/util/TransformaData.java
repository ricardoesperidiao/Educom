package br.edu.educom.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TransformaData {
	
    public static Date stringToDate(String data) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = new Date(format.parse(data).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String dateToString(Date data) {
		SimpleDateFormat formato_data = new SimpleDateFormat("dd/MM/yyyy");
		String data2 = formato_data.format(data);
		return data2;
	}
	
	public static String returnData() {
		Date data = new Date();
		SimpleDateFormat formato_data = new SimpleDateFormat("dd/MM/yyyy");
		String data2 = formato_data.format(data);
		return data2;
	}
	
	public static String getDiaAtual() {
		Date data = new Date();
		SimpleDateFormat formato_data = new SimpleDateFormat("dd");
		String anoAtual = formato_data.format(data);
		return anoAtual;
	}
	
	public static String getMesAtual() {
		Date data = new Date();
		SimpleDateFormat formato_data = new SimpleDateFormat("MM");
		String mesAtual = formato_data.format(data);
		return mesAtual;
	}
	
	public static String getAnoAtual() {
		Date data = new Date();
		SimpleDateFormat formato_data = new SimpleDateFormat("yyyy");
		String anoAtual = formato_data.format(data);
		return anoAtual;
	}
	
	 public static String getData_eHora_Atual() {
			Date data = new Date();
			SimpleDateFormat formato_data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			String dataAtual = formato_data.format(data);
			return dataAtual;
		}
	
	public static String getMesString(){
		
		Date mes = new Date();
		
		if(mes.getMonth() == 0){
			return "JANEIRO";
		} else if(mes.getMonth() == 1){
			return "FEVEREIRO";
		} else if(mes.getMonth() == 2){
			return "MARÇO";
		} else if(mes.getMonth() == 3){
			return "ABRIL";
		} else if(mes.getMonth() == 4){
			return "MAIO";
		} else if(mes.getMonth() == 5){
			return "JUNHO";
		} else if(mes.getMonth() == 6){
			return "JULHO";
		} else if(mes.getMonth() == 7){
			return "AGOSTO";
		} else if(mes.getMonth() == 8){
			return "SETEMBRO";
		} else if(mes.getMonth() == 9){
			return "OUTOBRO";
		} else if(mes.getMonth() == 10){
			return "NOVEMBRO";
		} else if(mes.getMonth() == 11){
			return "DEZEMBRO";
		} 
		
		return "";
		
	}
	
	// add dias aparte da tada de hoje
	public static Date adicionarDia(Date date, int qtdDias) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(date);
		calendario.add(Calendar.DAY_OF_MONTH, qtdDias);
		return calendario.getTime();
	}
    
}

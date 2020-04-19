package com.uca.capas.tarea2.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/alumno")
	public @ResponseBody String alumno() {
		String texto = "Raul Calderon \n 00004017 \n Ing.Informatica \n Cuarto anio";
		return texto;
	}
	
	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer dia2 = Integer.parseInt(request.getParameter("dia"));
		Integer mes= Integer.parseInt(request.getParameter("mes"));
		Integer anio=Integer.parseInt(request.getParameter("anio"));
		
		String aux = "";	
		 Calendar c = Calendar.getInstance();
		 c.set(anio,mes,dia2); // vairables int
		 int dia =  c.get(Calendar.DAY_OF_WEEK);
		 if(dia==Calendar.SUNDAY){
		   aux="domingo";
		 }if(dia==Calendar.MONDAY){
			 aux="Lunes";
		 }
		if(dia==Calendar.TUESDAY){
			aux="Martes";
		 }
		
		if(dia==Calendar.WEDNESDAY){
			aux="MIercoles";
		 }
		if(dia==Calendar.THURSDAY){
			aux="Jueves";
		 }
		if(dia==Calendar.FRIDAY){
			aux="Viernes";
		 }
		
		return "El dia de la semana fue "+aux;
		
	}
}

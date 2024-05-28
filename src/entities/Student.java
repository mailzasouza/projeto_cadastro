package entities;

public class Student {
	
	//atributos
	public String nome;
	public double trimestre1;
	public double trimestre2;
	public double trimestre3;
	
	//métodos
	public double notaFinal() {
		return trimestre1+trimestre2+trimestre3;
	}	
	public double missingPoints(){
		if (notaFinal() < 60 ) {
			return 60 - notaFinal();
		}
		else {
			return 0.0;
	}
	
	}

}

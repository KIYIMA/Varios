#include <stdio.h>

/*prototipos del programa*/
void iniciarProceso();
void leerRegistro();
void cargarContadoresEdif();
void generarCargarMostrarVector();
void deptosCorrientes();
void plurifamChaco();
float porcentajeEdifMisiones(int contMisiones,int contEdifTotal);
void mostrarPorcentaje(float porcentaje);
void finalizarProceso();
void contarMisiones();
void mostrarRecaudado();


 /* Declara un tipo de dato registro */
typedef struct{
int dni;
char AyN [30];
int codEdif;
char codProv;
float precio;

}tr_trabajos;

tr_trabajos vr_trabajos;
FILE * vf_trabajos;

/*inicializacion de contadores*/
int conCod01 = 0, conCod02 = 0, conCod03 = 0, conCod04 = 0, conCod05 = 0, conCod06 = 0, contMisiones = 0, contEdifTotal = 0;
float porcentaje, recaudadoChaco = 0;

int main(){
	
	iniciarProceso();
	leerRegistro();
	while(!feof(vf_trabajos)){
		
		contEdifTotal ++;
		contarMisiones();
		cargarContadoresEdif();
		plurifamChaco();
		deptosCorrientes();
		leerRegistro();
				
}
	generarCargarMostrarVector();
	mostrarRecaudado();
	porcentajeEdifMisiones(contMisiones,contEdifTotal);
	mostrarPorcentaje(porcentaje);
	finalizarProceso();
	
	return 0;
}

/* Abre archivo nuevo para grabar */
void iniciarProceso(){
	
	vf_trabajos = fopen("construNEA.dat", "rb"); 
		
}

/*grava los datos de los clientes en el archivo*/
void leerRegistro(){
	
	fread(&vr_trabajos, sizeof(tr_trabajos), 1, vf_trabajos); 
}

/*incrementar los contadores*/
void cargarContadoresEdif(){
	
	if(vr_trabajos.codEdif == 01){
		conCod01 ++;
	}
	
	if(vr_trabajos.codEdif == 02){
		conCod02 ++;
	}
	
	if(vr_trabajos.codEdif == 03){
		conCod03 ++;
	}
	
	if(vr_trabajos.codEdif == 04){
		conCod04 ++;
	}
	
	if(vr_trabajos.codEdif == 05){
		conCod05 ++;
	}
	
	if(vr_trabajos.codEdif == 06){
		conCod06 ++;
	
	}
}

/*crea un vector de 6 elemntos, lo carga y lo muestra*/
void generarCargarMostrarVector(){
	
	int vectorCodEdif [6];
	
	vectorCodEdif [0] = conCod01;
	vectorCodEdif [1] = conCod02;
	vectorCodEdif [2] = conCod03;
	vectorCodEdif [3] = conCod04;
	vectorCodEdif [4] = conCod05;
	vectorCodEdif [5] = conCod06;
		
	printf("\nCantidad de  edificaciones de codigo 01: %d",vectorCodEdif [0]);
	printf("\nCantidad de  edificaciones de codigo 02: %d",vectorCodEdif [1]);
	printf("\nCantidad de  edificaciones de codigo 03: %d",vectorCodEdif [2]);
	printf("\nCantidad de  edificaciones de codigo 04: %d",vectorCodEdif [3]);
	printf("\nCantidad de  edificaciones de codigo 05: %d",vectorCodEdif [4]);
	printf("\nCantidad de  edificaciones de codigo 06: %d",vectorCodEdif [5]);
	
	int i = 0;
	int menor = 7;
	
	for(i=0; i<6; i++){
		
		if(menor > vectorCodEdif[i]){
			
			 menor=vectorCodEdif[i];
		}
		
	}
	
	printf("\n\nEn la lista de abajo se muestra la o las edificaciones con menor cantidad de edificaiones: ");
	
	if(vectorCodEdif [0] == menor){
		printf("\n\tVivienda Unica: %d",vectorCodEdif [0]);	
	}
	if(vectorCodEdif [1] == menor){
		printf("\n\tVivienda plurifamiliar: %d",vectorCodEdif [1]);	
	}
	if(vectorCodEdif [2] == menor){
		printf("\n\tDepartamento: %d",vectorCodEdif [2]);	
	}
	if(vectorCodEdif [3] == menor){
		printf("\n\tLocal Comercial: %d",vectorCodEdif [3]);	
	}
	if(vectorCodEdif [4] == menor){
		printf("\n\tCabanas: %d",vectorCodEdif [4]);	
	}
	if(vectorCodEdif [5] == menor){
		printf("\n\tDuplex: %d",vectorCodEdif [5]);	
	}
	
	
}

/*Imprime los deptos en Ctes.*/
void deptosCorrientes(){
	
	if(vr_trabajos.codEdif == 03  ){
		if(vr_trabajos.codProv == 'a' || 'A'){
		
		printf("\nConstrucciones de departaentos en Corrientes...\n\tDNI: %i \n\tNombre: %s \n\tPrecio: %.2f \n\n",vr_trabajos.dni,vr_trabajos.AyN,vr_trabajos.precio);
		}
	}
}
/*acumula los precios de las construcciones plurifamiliares de chaco*/
void plurifamChaco(){
	
	if(vr_trabajos.codEdif == 02  ){
		
		if(vr_trabajos.codProv == 'b'|| 'B'){
		
		recaudadoChaco = recaudadoChaco + vr_trabajos.precio;
		
		}
	}
	
}
/*cuenta las construcciones  de Misiones*/
void contarMisiones(){
	if(vr_trabajos.codProv == 'd' || 'D'){
		
		contMisiones ++;
		
	}
	
}
/*calcula el porcentaje de las construcciones de misiones*/
float porcentajeEdifMisiones(int conttMisiones, int contTotal){
	float porcentaje1;
	porcentaje = conttMisiones * 100 / contTotal;
	
	return porcentaje;
}
/*muestra el porcentaje*/
void mostrarPorcentaje(float porcen){
	printf("\nPorcentaje de las construcciones en misiones: %.2f",porcen);
}
/*muestra lo recaudado en la provincia de chaco*/
void mostrarRecaudado(){
	printf("\nTotal recaudado CHACO: %.2f",recaudadoChaco);
}

/*cierra el archivo*/
void finalizarProceso(){
fclose(vf_trabajos);
}

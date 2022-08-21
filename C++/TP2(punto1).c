#include <stdio.h>

/*prototipos del programa*/
void iniciarProceso();
void ingresarDatos();
void grabarRegistro();
void finalizarProceso();
void ingresarRespuesta();

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

/*declaraciones de variables globales*/
char respuesta;

int main(){
	
	iniciarProceso();
	ingresarRespuesta();

	while(respuesta == 's' || respuesta == 'S'){
		ingresarDatos();
		grabarRegistro();
		ingresarRespuesta();
}
	finalizarProceso();
	return 0;
}

/* Abre archivo nuevo para grabar */
void iniciarProceso(){
vf_trabajos = fopen("construNEA.dat", "ab");
}

/*grava los datos de los clientes en el archivo*/
void ingresarDatos(){
	
	printf("\nIngrese dni del cliente:");
	scanf("%i",&vr_trabajos.dni);

	printf("Ingrese Apellido y Nombre del cliente:");
	scanf("%s",&vr_trabajos.AyN);

	printf("Ingrese codigo de edificacion:");
	scanf("%i",&vr_trabajos.codEdif);

	printf("Ingrese codigo de provincia (A-corrientes, B-chaco, C-formosa, D-misiones):");
	scanf("%s",&vr_trabajos.codProv);

	printf("Ingrese  precio:");
	scanf("%f",&vr_trabajos.precio);

}

/* graba 1 registro en el archivo de cliente */
void grabarRegistro(){
fwrite(&vr_trabajos, sizeof(tr_trabajos), 1, vf_trabajos);
}

/*pregunta si se desea ingresar mas datos, para que el buclue no sea infinito*/
void ingresarRespuesta(){
fflush(stdin);
printf("\nDesea ingresar datos al archivo? s/n: ");
scanf("%c", &respuesta);
}

/*cierra el archivo*/
void finalizarProceso(){
fclose(vf_trabajos);
}

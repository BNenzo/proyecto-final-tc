int resultadoResta;

int suma (int x, double y) { 
  int resultado = x + y;
  return resultado;
}

int resta (int x1, double y1) { 
  int resultado; 
  int resultadR = x1 - y1;
  return resultadR;
}

int main () {
  int cond1 = 5;
  int suma;
  if (cond1 > 5) { 
    int z;
    double db1 = 3.21;
    suma(z, db1);
    suma = suma(z, db1) + 30 + 100;
  }

  while (suma > 0 && cond1 < 4){
    resultadoResta = resta(suma, 2.13);
    suma = suma - 1;
    {
      int suma = 12;
    }
  }

  for (int i = 0; i < suma; i ++) { 
    suma = resultadoResta + i;
  }

  return 0;
}


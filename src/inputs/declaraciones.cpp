int suma(int, int);

int main () { 
  int num1;
  int num2, num3 = 3, num4;

  double double_num1;
  double double_num2, double_num3 = 3.14, double_num4;

  char ch_1, ch_2 = 'c';

  int resultadoSuma = suma(num2, num4) + 32;
  suma(num2, num4);
  int opArit = num3 + 5;
}

int suma (int x, int y) { 
  int resultado = x + y;
  return resultado;
}
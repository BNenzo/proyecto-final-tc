int suma(int,int);

int main () { 
  int num1;
  int num2, num3 = 3, num4;

  double double_num1;
  int double_num2, double_num3 = 3.14, double_num4;

  char ch_1, ch_2 = 'c';
  
  if (num1 == 5) { 
    num1 = suma(num2, num4);

    for (num1, num3; num1 < 6 ; num1++){
      ch_2 = ch_2 + 1;
    }

    for (int num_for, num_for_2 = 5; num_for < 6 ; num_for++){
      ch_1 = ch_2 + 1;
    }
  }

  while (double_num4 < 5) { 
    num4 = suma(num2, num4) + double_num2;
  }



  return 0;
}

int suma (int num1, int num2) { 
  int resultado = num1 + num2;
  return resultado ;
}
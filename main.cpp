#include <iostream>

// proto
void swapByVal(int, int);
void swapByRef(int *, int *);
void printNum(int, int);

int main()
{
  int x = 1;
  int y = 2;

  swapByVal(x, y);
  std::cout << "In the calling program!\n";
  printNum(x, y);

  swapByRef(&x, &y);
  std::cout << "In the calling program!\n";
  printNum(x, y);
}

void swapByVal(int x, int y)
{
  int temp = x;
  x = y;
  y = temp;

  std::cout << "In the swap-by-value function!\n";
  printNum(x, y);
}

void swapByRef(int *x, int *y)
{
  int temp = *x;
  *x = *y;
  *y = temp;

  std::cout << "In the swap-by-reference function!\n";
  printNum(*x, *y);
}

void printNum(int x, int y)
{
  std::cout << "X: " << x << "\n";
  std::cout << "Y: " << y << "\n";
  std::cout << std::endl;
}

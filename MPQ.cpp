// Botar Dora, gi1 4409
// L4 - MPQ
// Generáljunk minden lehetséges sorozatot, amelynek elemei a 0, 1, 2 halmazból
// vannak, és a 0 𝑚 - szer, az 1 𝑝 - szer és a 2 𝑞 - szor fordul elő.

#include <iostream>

using namespace std;

void kiir(int a[20], int n);
void szamoz(int a[20], int m, int p, int q, int& n, int k, int i);

int main()
{
    int m, p, q, a[20], k = 1, n, i;
    cin >> m >> p >> q;
    n = m + p + q;
    for (i = 1; i <= n; i++)
        a[i] = 0;
    szamoz(a, m, p, q, n, k, i);
    return 0;
}

void szamoz(int a[20], int m, int p, int q, int& n, int k, int i)
{
    
    if (k == n + 1)
        kiir(a, n);
    else
    {
        if(i >= n)
        {
            if (m > 0)
            {
                a[k] = 0;
                szamoz(a, m - 1, p, q, n, k + 1, i + 1);
            }
            if (p > 0)
            {
                a[k] = 1;
                szamoz(a, m, p - 1, q, n, k + 1, i + 1);
            }
            if (q > 0)
            {
                a[k] = 2;
                szamoz(a, m, p, q - 1, n, k + 1, i + 1);
            }
        }
    }
}

void kiir(int a[20], int n)
{
    int i;
    for (i = 1; i <= n; i++)
        cout << a[i] << " ";
    cout << endl;
}


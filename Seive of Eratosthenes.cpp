// O(n.log(log n))

#include <iostream>
using namespace std;
#include <vector>
#define fastIO ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

// ::CODECHEF - PRMNUM

vector<long long int> soe(long long int n)
{
    vector<long long int> v(n+1, 1);
    for (int i = 2; i * i <= n; i++) //this loop  takes all odd number only(prime can never be even)
    {
        if (v[i] == 1)
        {
            for (int j = i * i; j <= n; j = j + i) //(j=j+i)--> represents multiples of the ith number(to remove all the multiples)
                                                   //(j=i*i) --> because we want to skip already deleted numbers
            {
                v[j] = 0;
            }
        }
    }

    v[0] = v[1] = 0;

    vector<long long int> arr;
    for (int i = 0; i < n; i++)
    {
        if (v[i] == 1)
        {
            arr.push_back(i);
        }
    }
    return arr;
}

int main()
{
    fastIO

    long long int n = 10000000;
    vector<long long int>arr = soe(n);
    int t;
    cin >> t;
    while (t-- > 0)
    {
        int k;
        cin >> k;
        cout << arr.at(k-1) << endl;
    }

    return 0;
}

# Competitive Programming
### Mathematics

### Number Theory
* PlayList: https://www.youtube.com/playlist?list=PL2q4fbVm1Ik4liHX78IRslXzUr8z5QxsG
* Questions 
   - https://www.spoj.com/problems/AMR11E/ - easy sieve 
   - https://www.spoj.com/problems/GCDEX/  - read this - https://discuss.codechef.com/t/a-danc...
   - https://www.spoj.com/problems/ANARC09C/
   - https://www.spoj.com/problems/CPRIME/...
   - https://www.spoj.com/problems/CSQUARE/
   - https://www.spoj.com/problems/NFACTOR/
   - https://www.spoj.com/problems/CUBEFR/
   - https://www.spoj.com/problems/DCEPC13D/ - this is CRT + Lucas + Fermat
   - https://www.codechef.com/problems/SPOTWO
   - https://www.spoj.com/problems/DCEPC11B/ - Wilson theorem
   - https://www.spoj.com/problems/AMR10C/ - factorisation
   - https://www.spoj.com/problems/ALICESIE/ -formula
   - https://www.spoj.com/problems/FACTCG2/ - factorisation
   - https://www.spoj.com/problems/FACTMUL/ - CRT
   - https://www.spoj.com/problems/PRIME1/ - Segmented Sieve
   - https://www.spoj.com/problems/TDKPRIME/ - simple sieve with precompute
   - https://www.spoj.com/problems/TDPRIMES/ - same as above
   - https://www.spoj.com/problems/FINDPRM/
   - https://www.spoj.com/problems/LCPCP2/ - very simple
   - https://www.spoj.com/problems/GCD2/ - tricky
   - https://www.spoj.com/problems/NDIVPHI/ - use BigInteger
   - https://www.spoj.com/problems/DIVSUM/ - pre computation or multiplication formula
   - https://www.spoj.com/problems/DIVSUM2/ - Multiplication formula
   - https://www.spoj.com/problems/MAIN74/ - find first few values and observe the pattern
   
and solve all the questions from CP-Algorithms

# Sublime Setup

## Code Template

```
#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7
#define lli long long int
#define vi vector<lli>
#define pb push_back
#define mp make_pair
#define Max 100005
#define ff first
#define ss second
#define all(c) cc.begin(), c.end()
#define mini(a, b, c) min(c, min(a, b))
#define mini2(a, b, c, d) min(d, min(c, min(a, b)))
#define rloop(i, a, n) for(int i=n-1; i>=0; i--)
#define loop(i, a, b) for(int i=0; i<n; i++)
#define fastIO ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
//-------------------------------------------------------------------------------------------------//
int32_t main()
{
	fastIO
#ifdef NameForIfDef
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif



	return 0;
}

//-------------------------------------------------------------------------------------------------/
```
And for C++17 build and setting plus pre-compilation for faster runtime :::
Visit: https://www.youtube.com/watch?v=ynHKYjBpzBw


## Code which works in your PC but will be invisible in Online-Judge
```
#ifdef NameForIfDef
	//Here you can put anything that you don't want to happen 
	//when your code is running on an online judge but
	//only want it to happen when running your code locally 
#endif
```

## Setting up default code-snippet for faster coding 
In Sublime, Goto TOOLS->DEVELOPER->NEW SNIPPET.
Now replace  ```Hello, ${1:this} is a ${2:snippet}.``` with the following code ...
```
#define fastIO ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
//-------------------------------------------------------------------------------------------------//
int32_t main()
{
	fastIO
#ifdef NameForIfDef
	freopen("input.txt", "r", stdin);
	freopen("output.txt", "w", stdout);
#endif



	return 0;
}

//-------------------------------------------------------------------------------------------------/
```
Uncomment the 6th line ```<tabTrigger>hello</tabTrigger``` and replace the ```hello``` with whatever text you want to call your default text on. (say ```code or cp(in my case)```).
Save it (ctrl+s) with “random_name.sublime-snippet”. and close.
Now, open a new file and start typing the name of your snippet (random_name or code or cp ... whatever you named it)and then press "tab".

[Imgur](https://imgur.com/OnsmxON)

Follow this QnA for more read about this : https://www.quora.com/How-can-I-add-my-default-C-C++-code-in-Sublime-Text



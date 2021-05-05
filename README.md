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
#include<bits/stdc++.h>
using namespace std;

#define fastIO ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define MOD 1000000007
#define MOD1 998244353
#define INF 1e18
#define nline "\n"
#define pb push_back
#define ppb pop_back
#define mp make_pair
#define ff first
#define ss second
#define PI 3.141592653589793238462
#define set_bits __builtin_popcountll
#define sz(x) ((int)(x).size())
#define all(x) (x).begin(), (x).end()

typedef long long ll;
typedef unsigned long long ull;
typedef long double lld;
// typedef tree<pair<int, int>, null_type, less<pair<int, int>>, rb_tree_tag, tree_order_statistics_node_update > pbds; // find_by_order, order_of_key

#ifndef ONLINE_JUDGE
#define debug(x) cerr << #x <<" "; _print(x); cerr << endl;
#else
#define debug(x)
#endif

void _print(ll t) {cerr << t;}
void _print(int t) {cerr << t;}
void _print(string t) {cerr << t;}
void _print(char t) {cerr << t;}
void _print(lld t) {cerr << t;}
void _print(double t) {cerr << t;}
void _print(ull t) {cerr << t;}

template <class T, class V> void _print(pair <T, V> p);
template <class T> void _print(vector <T> v);
template <class T> void _print(set <T> v);
template <class T, class V> void _print(map <T, V> v);
template <class T> void _print(multiset <T> v);
template <class T, class V> void _print(pair <T, V> p) {cerr << "{"; _print(p.ff); cerr << ","; _print(p.ss); cerr << "}";}
template <class T> void _print(vector <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T> void _print(set <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T> void _print(multiset <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T, class V> void _print(map <T, V> v) {cerr << "[ "; for (auto i : v) {_print(i); cerr << " ";} cerr << "]";}


#define YES cout<<"YES"<<"\n"
#define NO  cout<<"NO"<<"\n"
//==================================================================================================================
int main() {

//------------------------//
	fastIO
#ifndef ONLINE_JUDGE
	freopen("C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/error.txt", "w", stderr);
#endif
//-----------------------//



	return 0;
}

//==================================================================================================================
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
#include<bits/stdc++.h>
using namespace std;

#define fastIO ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define MOD 1000000007
#define MOD1 998244353
#define INF 1e18
#define nline "\n"
#define pb push_back
#define ppb pop_back
#define mp make_pair
#define ff first
#define ss second
#define PI 3.141592653589793238462
#define set_bits __builtin_popcountll
#define sz(x) ((int)(x).size())
#define all(x) (x).begin(), (x).end()

typedef long long ll;
typedef unsigned long long ull;
typedef long double lld;
// typedef tree<pair<int, int>, null_type, less<pair<int, int>>, rb_tree_tag, tree_order_statistics_node_update > pbds; // find_by_order, order_of_key

#ifndef ONLINE_JUDGE
#define debug(x) cerr << #x <<" "; _print(x); cerr << endl;
#else
#define debug(x)
#endif

void _print(ll t) {cerr << t;}
void _print(int t) {cerr << t;}
void _print(string t) {cerr << t;}
void _print(char t) {cerr << t;}
void _print(lld t) {cerr << t;}
void _print(double t) {cerr << t;}
void _print(ull t) {cerr << t;}

template <class T, class V> void _print(pair <T, V> p);
template <class T> void _print(vector <T> v);
template <class T> void _print(set <T> v);
template <class T, class V> void _print(map <T, V> v);
template <class T> void _print(multiset <T> v);
template <class T, class V> void _print(pair <T, V> p) {cerr << "{"; _print(p.ff); cerr << ","; _print(p.ss); cerr << "}";}
template <class T> void _print(vector <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T> void _print(set <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T> void _print(multiset <T> v) {cerr << "[ "; for (T i : v) {_print(i); cerr << " ";} cerr << "]";}
template <class T, class V> void _print(map <T, V> v) {cerr << "[ "; for (auto i : v) {_print(i); cerr << " ";} cerr << "]";}


#define YES cout<<"YES"<<"\n"
#define NO  cout<<"NO"<<"\n"
//==================================================================================================================
int main() {

//------------------------//
	fastIO
#ifndef ONLINE_JUDGE
	freopen("C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/error.txt", "w", stderr);
#endif
//-----------------------//



	return 0;
}

//==================================================================================================================
```
Uncomment the 6th line ```<tabTrigger>hello</tabTrigger``` and replace the ```hello``` with whatever text you want to call your default text on (shortcut to type the snippet code). (say ```code or cp(in my case)```).
Save it (ctrl+s) with “random_name.sublime-snippet”. and close.
Now, open a new file and start typing the name of your snippet (random_name or code or cp ... whatever you named it)and then press "tab".

[Imgur](https://imgur.com/OnsmxON)


##Follow this QnA for more read about this : https://www.quora.com/How-can-I-add-my-default-C-C++-code-in-Sublime-Text



#Build File Setting:
	The name of the build file I am using is "CPP(this one is working)".
	Below is the configuration.
```
{
"cmd": ["g++.exe",
 "-std=c++17", "${file}",
  "-o",
   "${file_base_name}.exe",
    "&&" ,
     "${file_base_name}.exe<C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/input.txt>C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/output.txt"],
"shell":true,
"working_dir":"$file_path",
"selector":"source.cpp"
}
```
## Explanation of the build file--
```C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/input.txt``` and ```C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/output.txt```
these indicate the input file / output file path and you should never mention them as follows in the main code file as it has already been added in the build file:-
```
#ifndef ONLINE_JUDGE
	freopen("C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/input.txt", "r", stderr);
	freopen("C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/output.txt", "w", stdout);
#endif
```
or
```
#ifndef ONLINE_JUDGE
	freopen("input.txt", "r", stderr);
	freopen("output.txt", "w", stdout);
#endif
```
		
		
# Debugging (Creating error-file and setting up the debugging)
add the following code in the main file of your code (the code file where you are writing the code.)
```
#ifndef ONLINE_JUDGE
	freopen("C:/Users/ABHISHEK/Desktop/CP/Input-Output-Files/error.txt", "w", stderr);
#endif
```
this much is enough to create and include the 'error.txt' file.
### DONOT ADD THE ERROR FILE PATH IN THE BUILD FILE, IT WILL PRODUCE UNNECESSARY ERRORS. THE DEBUG FILE AND PATH WORKS ABSOLUTELY FINE WHEN ONLY MENTIONED IN THE 		 CODE FILE
	
		
# My File and File Paths
1 Two Folders
	1. Practice Folder (contains the cpp files and its executables)
	2. Input-Output folder (contains 'input.txt', 'output.txt' and 'error.txt')

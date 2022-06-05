# Competitive Programming

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
##### DONOT ADD THE ERROR FILE PATH IN THE BUILD FILE, IT WILL PRODUCE UNNECESSARY ERRORS. THE DEBUG FILE AND PATH WORKS ABSOLUTELY FINE WHEN ONLY MENTIONED IN THE 		 CODE FILE
	
		
# My File and File Paths

1 Two Folders

	1. Practice Folder (contains the cpp files and its executables)
	2. Input-Output folder (contains 'input.txt', 'output.txt' and 'error.txt')
	
# Sublime Layout

- Create three new files as shown below and make sure all of them are in the same folder.
	1. file.cpp: The file for writing the code.
	2. inputf.in: The file where we will be giving the input.
	3. outputf.out: The file where the output will be displayed.

- Now, perform the following steps:

	1. Select View > Layout > Columns : 3. This will create three columns in the workspace. Move the three files into three columns.
	2. Select View > Groups > Max Columns : 2.
	3. Select the build system we just created from Tools > Build System > CP.
	
	
# Registering the Sublime Text 3 (for free + no virus + using hex code)

	Follow this: https://gist.github.com/JerryLokjianming/71dac05f27f8c96ad1c8941b88030451

### Tips:

	1. Use "Go to" to navigate to any offset (eg: type 0x8545, press enter). This will highlight the hex-code and just start writing the new one (dont need to click, already selected).
	2. Use "Save as" to save the new exe-file(with new hex code), save it somewhere else (eg. Desktop).
	3. Do not forget to take backup of the original "sublime_text.exe" file.
	4. Replace the original exe file with the new one(rename it to the original exe file name---> sublime_text).
	5. Now whenever you open it, you might see a warning as windows doesnt recognise this as trusted, so just right click on the new "exe-file" and in "General" tab, look at the bottom (in Attributes), just click on "Unblock" and you will be good to go.
	6. Been using it for a while, all features work perfectly as before. NO HINDERANCE EXPERIENCED. FOOLPROOF. SAFE. NO VIRUS. COMPILER WORKS. BUILD FILE WORKS. SNIPPET WORKS. PACKAGE CONTROL WORKS. THEME WORKS. ALL FEATURES WORKING.


## How to edit built-in snippets in Sublime Text
- https://hritikchaudhary.medium.com/how-to-edit-built-in-snippets-in-sublime-text-quick-guide-super-easy-method-cfc059622d47

## Error (Sublime text3:ERROR(internal error in mingw32_gt_pch_use_address, at config/i386/host-mingw32.c:190: MapViewOfFileEx: Attempt to access invalid address.))
```

This problem is due to #include<bits/stdc++.h> comment this line and include iostream then i see problem is gone.
If u have precompiled stdc++.h then u have stdc++.h.gch file in this path C:\MinGW\lib\gcc\mingw32\9.2.0\include\c++\mingw32\bits . 
So to solve this problem: 
1. delete stdc++.h.gch file and go to command prompt.
2. cd C:\MinGW\lib\gcc\mingw32\9.2.0\include\c++\mingw32\bits (press Enter)
3. g++ -std=c++17 -Wall -Wextra -Wshadow -D_GLIBCXX_ASSERTIONS -DDEBUG -ggdb3 -fmax-errors=2 stdc++.h (press Enter)
4. Restart PC

```

## Error (Policy Based Data Structure setting):

```
c:\mingw\lib\gcc\mingw32\5.3.0\include\c++\ext\pb_ds\hash_policy.hpp:610:78: fatal error: ext/pb_ds/detail/resize_policy/hash_standard_resize_policy_imp.hpp: No such file or directory
compilation terminated.
```
-- Solution
- In the path
	`\MinGW\lib\gcc\mingw32\6.3.0\include\c++\ext\pb_ds\detail\resize_policy`
- There is a file named "hash_standard_resize_policy_imp.hpp0000644" in my case. I had success when renamed it to "hash_standard_resize_policy_imp.hpp"
- Read this : Solution blog[https://codeforces.com/blog/entry/61610]


## Take input from console in Sublime Text
-- Tools -> Build System -> New Build System
```
{
    "cmd": ["g++.exe", "-std=c++14", "-o", "$file_base_name", "$file", "&&", "start", "cmd", "/c", "$file_base_name & echo. & echo. & pause"],
    "shell": true,
    "selector": "source.c++"
}
```
- Save it in : C:\Users\ABHISHEK\AppData\Roaming\Sublime Text 3\Packages\User   AS   cpp_inpt_from_keyboard.sublime-build.
- Change the current build system(temporarily) to cpp_inpt_from_keyboard by going to Tools -> Build System -> cpp_inpt_from_keyboard.
- Type the code and test, a new console should pop-up.
- Video: https://www.youtube.com/watch?v=5wQSwOxhpnM




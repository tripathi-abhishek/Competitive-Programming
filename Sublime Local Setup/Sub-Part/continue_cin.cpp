//https://stackoverflow.com/questions/52565981/how-does-cin-works-in-a-while-loop-when-the-inputs-are-given-in-a-single-line-wi


//continue reading input and created a condition where it all stops
int n;
while (true)
{
	cin >> n;
	if (n == 42) //condition to stop the input
	{
		exit(0);
	}
	cout << n << nline;
}

//input:

/*
			1
			2
			3
			4
			85
			42
\*


//output:

/*
			1
			2
			3
			4
			85
\*

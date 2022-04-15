//Binary Search

ll low, high;
while (low < high)
{
	// monotonic is like -->> FFFFFFFFFFFFTTTTTTTTTTT
	ll mid = low + (high - low) / 2;  //not using (l+h)/2 because it can cause over flow when l=int_min && h=int_max
	if (p(mid))
	{
		high = mid;
	}
	else
	{
		low = mid + 1;
	}

	// monotonic is like -->> TTTTTTTTTTTTFFFFFFFFFFF
	ll mid = low + (high - low + 1) / 2;
	if (p(mid))
	{
		low = mid;
	}
	else
	{
		low = mid + 1;
	}
}
//GCD
ll gcd(ll a, ll b ) {
	while (b) {
		ll c = b;
		b = a % b;
		a = c;
	}
	return a;
}
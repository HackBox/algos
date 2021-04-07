

#include <bits/stdc++.h>
using namespace std;

const int MAX_CHAR = 26;

int minChanges(string &str)
{
	int n = str.length();

	if (n > MAX_CHAR)
		return -1;

	int dist_count = 0;

	int count[MAX_CHAR] = {0};

	for (int i = 0; i < n; i++)
	{
		if (count[str[i] - 'a'] == 0)
			dist_count++;
		count[(str[i] - 'a')]++;
	}

	return (n - dist_count);
}

int main()
{
	string str = "aebaecedabbee";
	cout << minChanges(str);
	return 0;
}

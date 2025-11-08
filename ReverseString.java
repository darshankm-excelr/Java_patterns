#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void reverseString(vector<char>& s) {
        stack<char> s1, s2;

       
        for (int i = 0; i < s.size(); i++) {
            s1.push(s[i]);
        }

        
        while (!s1.empty()) {
            s2.push(s1.top());
            s1.pop();
        }

        
        for (int i = 0; i < s.size(); i++) {
            s[i] = s2.top();
            s2.pop();
        }
    }
};

int main() {
    Solution sol;

    vector<char> s = {'h','e','l','l','o'};
    sol.reverseString(s);

    for (char c : s) cout << c;
    cout << endl;

    return 0;
}

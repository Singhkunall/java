class DSU {
    vector<int> parent;
    vector<int> rank;
public:
    DSU(int sz) {
        parent.resize(sz);
        rank.resize(sz, 0);
        for (int i = 0; i < sz; i++) {
            parent[i] = i;
        }
    }
    
    int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]); 
    }
    
    void unite(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
};

class Solution {
public:
    bool equationsPossible(vector<string>& equations) {
        DSU dsu(26);
        
        for (const string& eq : equations) {
            if (eq[1] == '=') {
                int x = eq[0] - 'a';
                int y = eq[3] - 'a';
                dsu.unite(x, y);
            }
        }
        
        for (const string& eq : equations) {
            if (eq[1] == '!') {
                int x = eq[0] - 'a';
                int y = eq[3] - 'a';
                if (dsu.find(x) == dsu.find(y)) {
                    return false;
                }
            }
        }
        
        return true;
    }
};